using System;
using System.Collections.Generic;

namespace Demo.Lab2
{
    public class Fashion : Product
    {
        private string color;
        private string size;

        public Fashion(string color, string size)
        {
            this.color = color;
            this.size = size;
        }

        public Fashion(int id, string name, double price, int qty, string image, string desc, string color, string size) : base(id, name, price, qty, image, desc)
        {
            this.color = color;
            this.size = size;
        }

        public void KiemTrasSanPham()
        {
            string colorCheck, sizeCheck;
            
            Console.WriteLine("Nhap mau sac:  ");
            colorCheck = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Nhap kich co: ");
            sizeCheck = Convert.ToString(Console.ReadLine());
            if (colorCheck.Equals(color) && sizeCheck.Equals(sizeCheck))
            {
                Console.WriteLine("Con hang");
            }
            else
            {
                Console.WriteLine("Het hang");
            }
        }
    }
}