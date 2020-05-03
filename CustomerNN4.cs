using System;
using System.Collections.Generic;
using ConsoleApp.Lab2;
using Microsoft.VisualBasic.CompilerServices;

namespace ConsoleApp.Assigment4
{
    public class CustomerNN: Customer
    {
        private string nation;

        public CustomerNN(string nation)
        {
            this.nation = nation;
        }

        public CustomerNN(int id, string name, string billDate, int number, string nation) : base(id, name, billDate, number)
        {
            this.nation = nation;
        }

        public string Nation
        {
            get => nation;
            set => nation = value;
        }

        public override int Total()
        {
            return Number * 2000;
        }
    }
}