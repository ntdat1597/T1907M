using System;
using System.Collections.Generic;
using ConsoleApp.Lab2;
using Microsoft.VisualBasic.CompilerServices;

namespace ConsoleApp.Assigment4
{
    public class CustomerNN: Customer
    {
        private string nation;
        private List<CustomerNN> customerNN;
        
        public CustomerNN(int id, uint qty, string name, string dateHd, double price, double total, string nation, List<CustomerNN> customerNn) : base(id, qty, name, dateHd, price, total)
        {
            this.nation = nation;
            customerNN = customerNn;
        }

        public List<CustomerNN> CustomerNn
        {
            get => customerNN;
            set => customerNN = value;
        }

        public int Id1
        {
            get => id;
            set => id = value;
        }

        public uint Qty1
        {
            get => qty;
            set => qty = value;
        }

        public string Name1
        {
            get => name;
            set => name = value;
        }

        public string DateHd1
        {
            get => dateHD;
            set => dateHD = value;
        }

        public double Price1
        {
            get => price;
            set => price = value;
        }

        public double Total1
        {
            get => total;
            set => total = value;
        }

        public string Nation
        {
            get => nation;
            set => nation = value;
        }

        public void addCustomer(CustomerNN customer)
        {
            customerNN.Add(customer);
        }
        // protected override void inputCustomer()
        // {
        //     base.inputCustomer();
        //     Console.WriteLine("Nhap quoc tich:");
        //     nation = Console.ReadLine();
        // }

        public new double Total()
        {
            return Total1 = Qty * Price;
        }

        public override void showInfo()
         {
                base.showInfo();
                Console.WriteLine(" | Quoc Tich: "+nation+" | Thanh Tien:"+Total1);
         }

         public void showList()
         {
             Console.WriteLine("Danh Sach KH VietNam:");
             foreach (CustomerNN c in customerNN)
             {
                 c.showInfo();
             }
         }

         public void TongSL()
         {
             uint sumQty = 0;
             foreach (CustomerNN c in customerNN )
             {
                 sumQty += c.qty;
             }

             Console.WriteLine("Tong so luong dien kh nuoc ngoai :"+sumQty);
         }

         public void TrungBinh()
         {
             double sumTotal = 0;
             foreach (CustomerNN c in customerNN)
             {
                 sumTotal += c.total;
             }

             Console.WriteLine("Trung binh thanh tien KHNN: "+sumTotal/(customerNN.Count));
         }
    }
}}