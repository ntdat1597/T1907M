using System;
using System.Collections.Generic;
using Microsoft.VisualBasic.CompilerServices;

namespace ConsoleApp.Assigment5
{
    public class PhoneBook:Phone
    {
        List<User> phonelist = new List<User>();

        public override void insertPhone(string name, string phone)
        {
            foreach (User u in phonelist)
            {
                if (u.Name.Equals(name)) {
                    if (u.Sdt.Equals(phone))
                    {
                        return;
                    }

                    u.Sdt = u.Sdt + " : " + phone;
                    return;
                }
            }
            phonelist.Add(new User(name,phone));
        }

        public override void removePhone(string name)
        {
            foreach (User u in phonelist)
            {
                if (u.Name.Equals(name))
                {
                    phonelist.Remove(u);
                    return;
                }
            }
        }

        public override void updatePhone(string name, string newphone)
        {
            foreach (User u in phonelist)
            {
                if (u.Name.Equals(name))
                {
                    u.Sdt = newphone;
                    return;
                }
            }
        }

        public override void searchPhone(string name)
        {
            foreach (User u in phonelist)
            {
                if (u.Name.Equals(name))
                {
                    Console.WriteLine("Contact is in the list: ");
                    Console.WriteLine("Name: "+u.Name+"  |  SDT : "+u.Sdt);
                    return;
                }

                Console.WriteLine("Contact not in the list");
            }
        }

        public void show()
        {
            foreach (User u in phonelist)
            {
                Console.WriteLine("Name:"+u.Name+"Phone:"+u.Sdt);
            }
        }
    }
}