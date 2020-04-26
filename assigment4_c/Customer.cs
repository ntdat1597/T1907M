using System;
using System.Collections.Generic;
using System.Data;

namespace ConsoleApp.Assigment4
{
    public class Customer
    {
        protected int id;
        protected uint qty;
        protected string name;
        protected string dateHD;
        protected double price;
        protected double total;

        public Customer(int id, uint qty, string name, string dateHd, double price, double total)
        {
            this.id = id;
            this.qty = qty;
            this.name = name;
            dateHD = dateHd;
            this.price = price;
            this.total = total;
        }

        public int Id
        {
            get => id;
            set => id = value;
        }

        public uint Qty
        {
            get => qty;
            set => qty = value;
        }

        public string Name
        {
            get => name;
            set => name = value;
        }

        public string DateHd
        {
            get => dateHD;
            set => dateHD = value;
        }

        public double Price
        {
            get => price;
            set => price = value;
        }

        public double Total
        {
            get => total;
            set => total = value;
        }

        // protected virtual void inputCustomer()
        // {
        //     Console.WriteLine("Enter id kh:");
        //     id = Convert.ToInt32(Console.ReadLine());
        //     Console.WriteLine("Enter ten kh: ");
        //     name = Console.ReadLine();
        //     Console.WriteLine("Enter ngay lap hoa don: ");
        //     dateHD = Console.ReadLine();
        //     Console.WriteLine("Enter so luong: ");
        //     qty = Convert.ToUInt32(Console.ReadLine());
        //     Console.WriteLine("Enter don gia: ");
        //     price = Convert.ToDouble(Console.ReadLine());
        // }

        public virtual void showInfo()
        {
            Console.WriteLine(" | id:"+id+" | name:"+name+" | NgayHD:"+dateHD+" | Dongia:"+price+" | SoLuong:"+qty);
        }
    }
}