using System;
using System.Collections.Generic;

namespace ConsoleApp.Assigment4
{
    public class CustomerVN: Customer
    {
        private string CustomerType;
        private int DinhMuc;
        private List<CustomerVN> customerVN;

        public CustomerVN(int id, uint qty, string name, string dateHd, double price, double total, string customerType, int dinhMuc, List<CustomerVN> customerVn) : base(id, qty, name, dateHd, price, total)
        {
            CustomerType = customerType;
            DinhMuc = dinhMuc;
            customerVN = customerVn;
        }


        public string CustomerType1
        {
            get => CustomerType;
            set => CustomerType = value;
        }

        public int DinhMuc1
        {
            get => DinhMuc;
            set => DinhMuc = value;
        }
        
        public void addCustomer(CustomerVN customer)
        {
            customerVN.Add(customer);
        }
        

        // protected override void inputCustomer()
        // {
        //     base.inputCustomer();
        //     Console.WriteLine("Nhap loai khach hang(SH,KD,SX)");
        //     CustomerType = Console.ReadLine();
        //     Console.WriteLine("Nhap dinh muc");
        //     DinhMuc = Convert.ToInt32(Console.ReadLine());
        // }

        public new double Total()
        {
            int newprice;
            if (DinhMuc < 50)
            {
                newprice = 1000;
            }
            else if (DinhMuc > 50 && DinhMuc < 100)
            {
                newprice = 1200;
            }
            else if (DinhMuc > 100 && DinhMuc < 200)
            {
                newprice = 1500;
            }
            else
            {
                newprice = 2000;
            }

            if (Qty <= DinhMuc)
            {
                return total = newprice * Qty;
            }
            else
            {
                return total = DinhMuc * newprice + (Qty - DinhMuc) * newprice * 2.5;
            }
        }

        public override void showInfo()
        {
            base.showInfo();
            Console.WriteLine(" | Loai KH:"+CustomerType+" | Dinh muc "+DinhMuc+" | Thanh Tien:");
        }
        
        public void showList()
        {
            Console.WriteLine("Danh Sach KH VietNam:");
            foreach (CustomerVN c in customerVN)
            {
                c.showInfo();
            }
        }
        public void TongSL()
        {
            uint sumQty = 0;
            foreach (CustomerVN c in customerVN )
            {
                sumQty += c.qty;
            }

            Console.WriteLine("Tong so luong dien kh Viet Nam :"+sumQty);
        }
    }

}