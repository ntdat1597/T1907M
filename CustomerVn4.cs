using System;
using System.Collections.Generic;

namespace ConsoleApp.Assigment4
{
    public class CustomerVN: Customer
    {
        private string type;

        public CustomerVN(string type)
        {
            this.type = type;
        }

        public CustomerVN(int id, string name, string billDate, int number, string type) : base(id, name, billDate, number)
        {
            this.type = type;
        }

        public string Type
        {
            get => type;
            set => type = value;
        }
    }

}