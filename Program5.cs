using System;
using ConsoleApp.Lab2;
using Microsoft.VisualBasic.CompilerServices;

namespace ConsoleApp.Assigment5
{
    public class Program
    {
        public static void Main(string[] args)
        {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.insertPhone("thang","0973006340");
            phoneBook.insertPhone("hung","0984684184");
            phoneBook.insertPhone("ngoc","0914646546");
            phoneBook.removePhone("hung"); // hung delete
            phoneBook.updatePhone("ngoc","091111111");
            phoneBook.insertPhone("thang","0985851848");
            phoneBook.show();
            Console.WriteLine("Thong tin search phone");
            phoneBook.searchPhone("thang");
        }
    }
}