package dao;

import entities.NhanVienEntity;
import utils.ConnectDbHibernate;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QLTaiKhoanDAO extends ConnectDbHibernate {
    //danh sách đối tượng lấy từ DB
    private List<NhanVienEntity> listUser;

    public List<NhanVienEntity> onShowData() {
        listUser = null;
        //Tạo SQL truy vấn lấy dữ liệu từ bảng NhanVien
        String SQL = "FROM NhanVienEntity ORDER BY ID DESC";
        //Thực thi câu query
        Query query = session.createQuery(SQL);
        //Trả dữ liệu lấy được từ câu query ra list
        listUser = query.getResultList();
        return listUser;
    }

    public NhanVienEntity reloadUser(NhanVienEntity input) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        NhanVienEntity rs = null;
        try {
            String sql = "FROM NhanVienEntity WHERE ID = :id";
            Query query = session.createQuery(sql);
            query.setParameter("id", input);
            rs = (NhanVienEntity) query.getSingleResult();
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        } finally {
            session.close();
        }
        return rs;
    }


    public List<NhanVienEntity> onSearchData(NhanVienEntity search) {
        listUser = new ArrayList<NhanVienEntity>();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        try {
            String sql = "SELECT * FROM NhanVien WHERE 1=1";
            if (!search.getFullName().trim().equals("")) {
                sql += " AND HoVaTen LIKE N'%" + search.getFullName() + "%'";
            } else if (!search.getPhone().trim().equals("")) {
                sql += " AND SDT LIKE '%" + search.getPhone() + "%'";
            }
            Query query = session.createNativeQuery(sql, NhanVienEntity.class);
            listUser = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        } finally {
            session.close();
        }
        return listUser;
    }



    public boolean InsertData(NhanVienEntity userIns) {
        userIns.setCreated(new Date());
        session.save(userIns);
        transaction.commit();
        return true;
    }


    public boolean DeleteData(NhanVienEntity userDel) {
        session.delete(userDel);
        transaction.commit();
        return true;
    }


    public boolean UpdateData(NhanVienEntity userUpdate) {
        session.update(userUpdate);
        transaction.commit();
        return true;
    }
}


