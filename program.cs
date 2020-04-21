using System;
using System.Net.Sockets;
using ConsoleApp.Lab2;

namespace ConsoleApp.Assigment3
{
    public class Program
    {
        public static void Main(string[] args)
        {
            int id, qty, price, choice;
            string name, image, desc;
            Cart cart = new Cart(1,"NguyenVanA",0,"hanoi","vietnam");
            do
            {
                Console.WriteLine("1: Add product:");
                Console.WriteLine("2: Remove Product:");
                Console.WriteLine("3: GrandTotal Cal: ");
                Console.WriteLine("4: Show Info");
                Console.WriteLine("5: Exit");
                Console.WriteLine();
                Console.WriteLine("Enter choice:");
                choice = Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1: 
                        Console.WriteLine("Enter ID:");
                        id = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter name:");
                        name = Convert.ToString(Console.ReadLine());
                        Console.WriteLine("Enter price:");
                        price = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter qty:");
                        qty = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter image:");
                        image = Convert.ToString(Console.ReadLine());
                        Console.WriteLine("Enter desc:");
                        desc = Convert.ToString(Console.ReadLine());
                        cart.addProduct(new Product(id,name,price,qty,image,desc));
                        break;
                    case 2: 
                        cart.removeProduct();
                        break;
                    case 3: 
                        cart.grandTotalCal();
                        break;
                    case 4:
                        cart.showInfo();
                        break;
                    case 5: 
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine("Wrong choice please choice 1-5!");
                        break;
                }
            } while (choice != 5);
        }
    }
}