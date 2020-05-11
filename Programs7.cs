using System;
using System.Collections.Generic;

namespace ConsoleApp.StudentManager
{
    public class Programs
    {
        public static void Main(string[] args)
        {
            int id, age, newid, newage, choice, index;
            string name, address, newname, newaddress;
            double gpa, newgpa;
            Student st = new Student();
            for (;;)
            {
                showMenu();
                Console.WriteLine("Enter choice: ");
                choice = Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Enter id : ");
                        id = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter name : ");
                        name = Console.ReadLine();
                        Console.WriteLine("Enter age : ");
                        age = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter address : ");
                        address = Console.ReadLine();
                        Console.WriteLine("Enter GPA : ");
                        gpa = Convert.ToDouble(Console.ReadLine());
                        st.addStudent(new Student(id, name, age, address, gpa));
                        break;
                    case 2:
                        Console.WriteLine("Enter new id : ");
                        newid = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter new name : ");
                        newname = Console.ReadLine();
                        Console.WriteLine("Enter new age : ");
                        newage = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter new address : ");
                        newaddress = Console.ReadLine();
                        Console.WriteLine("Enter new GPA : ");
                        newgpa = Convert.ToDouble(Console.ReadLine());
                        st.editStudent(newid, newname, newaddress, newage, newgpa);
                        break;
                    case 3:
                        Console.WriteLine("Enter id student to remove");
                        index = Convert.ToInt32(Console.ReadLine());
                        st.removeStudent(index);
                        break;
                    case 4:
                        st.sortByGPA();
                        st.showStudent();
                        break;
                    case 5:
                        st.sortByName();
                        st.showStudent();
                        break;
                    case 6:
                        st.showStudent();
                        break;
                    case 0:
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine("Wrong choice please choice 0-6");
                        break;
                }
            }
        }

        public static void showMenu()
        {
            Console.WriteLine("1: Add Student: ");
            Console.WriteLine("2: Edit student by id: ");
            Console.WriteLine("3: Delete student by id: ");
            Console.WriteLine("4: Sort student by gpa: ");
            Console.WriteLine("5: Sort student by name: ");
            Console.WriteLine("6: Show student: ");
            Console.WriteLine("0 : Exit");
        }
    }
}