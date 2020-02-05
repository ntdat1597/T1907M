package bai_tap_phan_so;

public class PS {

        private int ucln;
        private Rational phanso;


        public PS()
        {
            Rational x = new Rational();
            this.phanso=x;
        }
        public PS(Rational p)
        {
            this.phanso=p;

        }

        public void setPhanso(Rational p)
        {
            this.phanso=p;
        }

        public Rational getPhanso()
        {
            return this.phanso;
        }


        public  int uscln()
        {
            int a,b;
            a=phanso.getTu();
            b=phanso.getMau();
            a=Math.abs(phanso.getTu());
            b=Math.abs(phanso.getMau());
            if(a==0 || b==0)
                return a+b;
            while(a!=b)
            {
                if(a>b)
                    a=a-b;
                else
                    b=b-a;

            }
            return a;

        }

        public void setUcln()
        {
            this.ucln= uscln();
        }

        public int getUcln()
        {
            return ucln;
        }

        public  void rutgon()
        {
            phanso.setTu(phanso.getTu()/ucln) ;
            phanso.setMau(phanso.getMau()/ucln);
        }


        public Rational cong(Rational obj1 ,Rational obj2)
        {

            phanso.setTu(obj1.getTu()*obj2.getMau()+obj2.getTu()*obj1.getMau());
            phanso.setMau(obj1.getMau()*obj2.getMau());

            return phanso;
        }

        public Rational tru(Rational obj1,Rational obj2)
        {
            phanso.setTu(obj1.getTu()*obj2.getMau()-obj2.getTu()*obj1.getMau());
            phanso.setMau(obj1.getMau()*obj2.getMau());
            return phanso;

        }

        public Rational nhan(Rational obj1,Rational obj2)
        {
            phanso.setTu(obj1.getTu()*obj2.getTu());
            phanso.setMau(obj1.getMau()*obj2.getMau());
            return phanso;

        }
        public Rational chia(Rational obj1,Rational obj2)
        {
            phanso.setTu(obj1.getTu()*obj2.getMau());
            phanso.setMau(obj1.getMau()*obj2.getTu());
            return phanso;
        }
}
