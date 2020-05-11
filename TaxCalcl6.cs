namespace ConsoleApp.Session8
{
    // tạo delegate mới trả về 1 hảm 
    public delegate float TaxMoney(float salary);
    public class TaxCalc
    {
        public static float VietNamTax(float salary)
        {
            return 10 * salary / 100;
        }

        public static float USATax(float salary)
        {
            return 15 * salary / 100;
        }

        public static float OtherTax(float salary)
        {
            return 5 * salary / 100;
        }
        // hàm trả về 1 hàm
        public static TaxMoney GetTax(string country)
        {
            if (country == "VN")
            {
                return VietNamTax;
            }else if (country == "USA")
            {
                return USATax;
            }
            else
            {
                return OtherTax;
            }
        }
    }
}