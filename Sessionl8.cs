using System;
using System.Threading;

namespace ConsoleApp.Sesson8
{
    public class Session8
    {
        private int number = 0;
        public static void Main(string[] args)
        {
            
            // tạo luồng mới trong java
            Thread t1 = new Thread(ThreadRun); // nap ham vao bien thread
            t1.Start("Xin Chao"); // chay luong moi // truyen bien string vao ham start
            // chay 2 luong
            Thread t2 = new Thread(new Session8().Run2); // truyen vao o nho cua ham run2
            t2.Start();
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine("main i = " +i);
                Thread.Sleep(100);
            }
        }

        public static void ThreadRun(object o) // khong co tham so hoac chi co doi tuong truyen vao la lop object
        {
            // co the ep kieu duoc 
            string msg = (string) o; // down casting
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine(msg+" i = " +i);
                Thread.Sleep(100);
            }
        }
        // su dung delegate de chay luong moi
        public void Run2()
        {
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine(" xyz = " +(number+=2));
                Thread.Sleep(100);
            }
        }
    }
}