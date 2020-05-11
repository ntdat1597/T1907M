using System;

namespace ConsoleApp.Session8
{
    public class Calculator
    {
        public static int Add(int a, int b)
        {
            Console.WriteLine(a+b);
            return a + b;
        }

        public static int Subtract(int a, int b)
        {
            Console.WriteLine(a-b);
            return a - b;
        }
        // hàm không có static
    }
}