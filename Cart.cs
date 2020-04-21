using System;
using System.Collections.Generic;
using ConsoleApp.Lab2;

namespace ConsoleApp.Assigment3

{
    public class Cart : Product
    {
        public int id;
        public string customer;
        public double grandTotal;
        public string city;
        public string country;
        public List<Product> products = new List<Product>();
        public List<Double> totals = new List<double>();

        public Cart(int id, string customer, double grandTotal, string city, string country)
        {
            this.id = id;
            this.customer = customer;
            this.grandTotal = grandTotal;
            this.city = city;
            this.country = country;
        }

        public Cart(int iD, string name, int price, int qty, string image, string desc, int id, string customer,
            double grandTotal, string city, string country) : base(iD, name, price, qty, image, desc)
        {
            this.id = id;
            this.customer = customer;
            this.grandTotal = grandTotal;
            this.city = city;
            this.country = country;
        }

        public void showInfo()
        {
            Console.WriteLine("Customer Info:");
            Console.WriteLine("CustomerID:"+id+"| Customer Name:"+customer+" | City:"+city+" | Country:"+country);
            Console.WriteLine("Cart");
            foreach (Product p in products)
            {
                Console.WriteLine("ID:"+p.iD+" | Name:"+p.name+" | price:"+p.price+" | QTY:"+p.qty+" | Image:"+p.image+" | Desc:"+p.desc);
            }
        }
        public new void addProduct(Product product)
        {
            products.Add(product);
        }

        public void removeProduct()
        {
            string removeName;
            Console.WriteLine("Nhap ten san pham muon xoa");
            removeName = Convert.ToString(Console.ReadLine());
            for (int i = 0; i < products.Count; i++)
            {
                if (removeName.Equals(products[i].name))
                {
                    products.RemoveAt(i);
                    Console.WriteLine("Xoa thanh cong san pham");
                }
            }
        }

        public void grandTotalCal()
        {
            foreach (Product p in products)
            {
                grandTotal = p.price * p.qty;
                totals.Add(grandTotal);
            }
            double totalCal = 0;
            foreach (Double d in totals)
            {
                totalCal += d;
            }
            
            double shipFee;
            if (country == "vietnam")
            {
                if (city == "hanoi" || city == "HCM")
                {
                    shipFee = totalCal * 0.01;
                    Console.WriteLine("GrandTotal(With Shipping Fee) = "+(totalCal+shipFee));
                }
                else
                {
                    shipFee = totalCal * 0.02;;
                    Console.WriteLine("GrandTotal(With Shipping Fee) = "+(totalCal+shipFee));
                }
            }
            else
            {
                shipFee = totalCal * 0.05;
                Console.WriteLine("GrandTotal(With Shipping Fee) = "+(totalCal+shipFee));
            }
        }
    }
}