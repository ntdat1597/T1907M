using System;
using System.Collections.Generic;

namespace Demo.Lab2
{
    public class Product
    {
        private int _id;
        private string _name;
        private double _price;
        private int _qty;
        private string _image;
        private string _desc;
        private List<string> _gallery = new List<string>();
        public List<Product> productList = new List<Product>();
        public Product()
        {
        }

        public Product(int id, string name, double price, int qty, string image, string desc)
        {
            _id = id;
            _name = name;
            _price = price;
            _qty = qty;
            _image = image;
            _desc = desc;
        }

        public void GetInfo()
        {

            foreach (Product p in productList)
            {
                Console.WriteLine("ID: " + p._id + " | " + "Name: " + p._name + " | " + "Price: " + p._price + " | " + "Qty: " + p._qty + " | " + "Image: " + p._image + 
                                  " | " + "Desc: " + p._desc);
            }
            }
        public void addProduct(Product product)
        {
            productList.Add(product);
        }
        

        public void CheckStock()
        {
            string name;
            Console.WriteLine("enter product name to check:");
            name = Convert.ToString(Console.ReadLine());
            foreach (Product p in productList)
            {
                if (name.Equals(p._name))
                {
                    if (p._qty > 0)
                    {
                        Console.WriteLine("Con hang");
                    }
                    else
                    {
                        Console.WriteLine("het hang");
                    }
                }
            }
        }
        public void AddImage()
        {
            if (_gallery.Count < 10)
            {
                foreach (Product p in productList)
                {
                    _gallery.Add(p._image);
                }
                Console.WriteLine("Them thanh cong vao ");
                Console.WriteLine("List gallery: ");
                foreach (String img  in _gallery)
                {
                    Console.WriteLine(img);
                }
            }
            else
            {
                Console.WriteLine("Vuot qua so luong them la 10");
            }
            
        }

        public void RemoveImage()
        {
            Console.WriteLine("Danh sach anh hien thi: ");
            for (int i = 0; i < _gallery.Count; i++)
            {
                Console.WriteLine("STT: " + (i+1) + "\n URL image: " + _gallery[i]);
            }

            int index;
            Console.WriteLine("Nhap vi tri muon xoa: ");
            index = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < _gallery.Count; i++)
            {
                if (i == index)
                {
                    _gallery.RemoveAt(index - 1);
                    Console.WriteLine("Xoa thanh cong!");
                    Console.WriteLine("Gallery list: ");
                    foreach (string img in _gallery)
                    {
                        Console.WriteLine(img);
                    }
                }
            }

        }

    }
}