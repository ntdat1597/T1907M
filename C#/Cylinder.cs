using System;

namespace Demo.GeometryExample
{
    public class Cylinder
    {
        protected double baseArea;
        protected double lateralArea;
        protected double totalArea;
        protected double volume;
        
        public void Caculate(double radius, double height)
        {
            baseArea = radius * radius * Math.PI;
            lateralArea = 2 * Math.PI * radius * height;
            totalArea = 2 * Math.PI * radius * (height + radius);
            volume = Math.PI * radius * radius * height;
        }

        public void Result()
        {
            Console.WriteLine("Base: "+this.baseArea+
                              "\nLateral: "+this.lateralArea+
                              "\nTotal: "+this.totalArea+
                              "\nVolume: "+this.volume);
            
        }
    }
}