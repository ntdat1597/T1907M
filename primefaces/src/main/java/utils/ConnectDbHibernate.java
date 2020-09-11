package utils;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ConnectDbHibernate {
    protected static Logger LOGGER = Logger.getLogger(ConnectDbHibernate.class);
    //SessionFactory là một nhà máy quản lý các phiên giao dịch connect đến DB
    protected static SessionFactory sessionFactory = null;

    //Session là một phiên giao dịch connect đến DB
    protected static Session session = null;

    //Transaction là một tiến trình xử lý.có điểm đầu và điểm cuối.
    //chỉ xử lý thành công khi tất cả các tiến trình đều thành công.thực hiện tuần tự
    protected static Transaction transaction = null;

    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // lấy cấu hình từ file resource/hibernate.cfg.xml
                .build();
        try {
            //Bắt đầu kết nối
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

            //Mở một phiên giao dịch - là 1 kết nối
            session = sessionFactory.openSession();

            //Mở tiến trình xử lý
            transaction = session.beginTransaction();
            LOGGER.info("|======================================|");
            LOGGER.info("|KET NOI THANH CONG....................|");
            LOGGER.info("|======================================|");
        } catch (Exception e) {
            LOGGER.error("|======================================|");
            LOGGER.error("|KET NOI THAT BAI......................|");
            LOGGER.error("|======================================|");
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
