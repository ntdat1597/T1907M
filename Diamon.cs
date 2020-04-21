using System;

namespace Demo.Lab2
{
    public class Diamon : Product
    {
        private Double cara;
        private Double kichco;
        
        public void KiemTraHangThatGia()
        {
            Console.WriteLine("Nhap so cara");
            cara = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Nhap kich co mm: ");
            kichco = Convert.ToDouble(Console.ReadLine());
            if ((cara / kichco) == 3)
            {
                Console.WriteLine("Hang That");
            }
            else
            {
                Console.WriteLine("Hang gia");
            }

        }
    }
}