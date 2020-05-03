namespace ConsoleApp.Assigment5
{
    public class User
    {
        public string name;
        public string sdt;

        public User()
        {
            
        }

        public User(string name, string sdt)
        {
            this.name = name;
            this.sdt = sdt;
        }

        public string Name
        {
            get => name;
            set => name = value;
        }

        public string Sdt
        {
            get => sdt;
            set => sdt = value;
        }
    }
}