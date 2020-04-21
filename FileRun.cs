using System;

namespace Demo.Lab2
{
    public class FileRun
    {
        public static void Main(string[] args)
        { 
            Product product = new Product();
           Fashion fashion = new Fashion();
           Diamon diamon = new Diamon();
                int chose = 0;
            int _id;
            string _name;
            double _price;
            int _qty;
            string _image;
            string _desc;
            string color;
            string size;
            do
                {
                    Console.WriteLine("1. Addproduct");
                    Console.WriteLine("2. GetInfo");
                    Console.WriteLine("3. CheckStock");
                    Console.WriteLine("4. Add gallery");
                    Console.WriteLine("5. Remove gallery");
                    Console.WriteLine("6. Exit");
                    Console.WriteLine("Chose: ");
                    chose = Convert.ToInt32(Console.ReadLine());
                    switch (chose)
                    {
                        case 1:
                            Console.WriteLine("Enter id: ");
                            _id = Convert.ToInt32(Console.ReadLine());
                            Console.WriteLine("Enter name: ");
                            _name = Convert.ToString(Console.ReadLine());
                            Console.WriteLine("Enter price: ");
                            _price = Convert.ToDouble(Console.ReadLine());
                            Console.WriteLine("Enter qty: ");
                            _qty = Convert.ToInt32(Console.ReadLine());
                            Console.WriteLine("Enter image: ");
                            _image = Convert.ToString(Console.ReadLine());
                            Console.WriteLine("Enter desc: ");
                            _desc = Convert.ToString(Console.ReadLine());
                            product.addProduct(new Product(_id, _name,_price, _qty, _image, _desc));
                            break;
                        case 2:
                            product.GetInfo();
                            
                            break;
                        case 3:
                           product.CheckStock();
                           fashion.KiemTrasSanPham();
                           //     diamon.KiemTraHangThatGia();
                            break;
                        case 4:
                            product.AddImage();
                            break;
                        case 5: 
                            product.RemoveImage();
                            break;
                        case 6: 
                            Environment.Exit(0);
                            break;
                        default:
                            Console.WriteLine("Wrong choice please choice 1-6!");
                            break;
                    }
                }

                while (chose != 5) ;
                
            }
        }
    }