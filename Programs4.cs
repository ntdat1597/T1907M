using System;
using System.Collections.Generic;

namespace ConsoleApp.Assigment4
{
    public class Programs
    {
        public static void Main(string[] args)
        {
            List<CustomerNN> listNN = new List<CustomerNN>();
            List<CustomerVN> listVN = new List<CustomerVN>();
            listNN.Add(new CustomerNN(1,"Alex","02/2019",78,"US"));
            listNN.Add(new CustomerNN(2,"Alex1","01/2019",78,"US"));
            listVN.Add(new CustomerVN(3,"Nguyen A","02/2019",155,"Sinh hoat"));
            listVN.Add(new CustomerVN(4,"Nguyen B","01/2019",155,"Sinh hoat"));
            int totalVN = 0;
            foreach (CustomerVN  c in listVN)
            {
                totalVN += c.Total();
            }

            int totalNN = 0;
            foreach (CustomerNN c in listNN)
            {
                totalNN += c.Total();
            }

            Console.WriteLine("Tong tien VN: "+totalVN);
            Console.WriteLine("Tong tien NN: "+totalVN);
            Console.WriteLine("Tong Tien Trung binh:");
            Console.WriteLine("Tong Tien Trung binh VN:"+((float)totalVN/listVN.Count));
            Console.WriteLine("Tong Tien Trung binh NN:"+((float)totalVN/listVN.Count));
            foreach (CustomerVN c in listVN)
            {
                if (c.BillDate.Equals("01/2019"))
                {
                    c.showBill();
                }
            }
            foreach (CustomerNN c in listNN)
            {
                if (c.BillDate.Equals("01/2019"))
                {
                    c.showBill();
                }
            }
        }
    }
}