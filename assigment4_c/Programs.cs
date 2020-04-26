using System.Collections.Generic;

namespace ConsoleApp.Assigment4
{
    public class Programs
    {
        public static void Main(string[] args)
        {
            CustomerNN c1 = new CustomerNN(1,20,"Join","11/01/2020",3000,0,"My",new List<CustomerNN>());
            CustomerNN c2 = new CustomerNN(2,30,"Join1","11/01/2020",4000,0,"Anh",new List<CustomerNN>());
            CustomerNN c3 = new CustomerNN(3,40,"Join2","11/01/2020",5000,0,"Singapore",new List<CustomerNN>());
            CustomerNN c4 = new CustomerNN(4,50,"Join3","11/01/2020",6000,0,"Malaysia",new List<CustomerNN>());
            c1.addCustomer(c1);
            c1.addCustomer(c2);
            c1.addCustomer(c3);
            c1.addCustomer(c4);
            c1.showList();
            c1.Total();
            c1.TrungBinh();
            c1.TongSL();
            // CustomerVN v1 = new CustomerVN(1,30,"abc","11/04/2020",1000,0,"SH",150,new List<CustomerVN>());
            // CustomerVN v2 = new CustomerVN(2,20,"abc1","11/04/2020",1000,0,"SH",100,new List<CustomerVN>());
            // CustomerVN v3 = new CustomerVN(3,60,"abc2","11/04/2020",1000,0,"SH",130,new List<CustomerVN>());
            // CustomerVN v4 = new CustomerVN(4,70,"abc3","11/04/2020",1000,0,"SH",50,new List<CustomerVN>());
            // v1.addCustomer(v1);
            // v1.addCustomer(v2);
            // v1.addCustomer(v3);
            // v1.addCustomer(v4);
            // v1.showList();
            // v1.Total();
            // v1.TongSL();
        }
    }
}