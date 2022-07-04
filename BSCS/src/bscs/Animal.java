
package bscs;

public class Animal {
    
   
    public String name;
    public String color;
    private double weight;
    
   
 public void setWeight(double w)
    {
        if (w>0.0)
        {
            this.weight = w;
        }
        else{
            this.weight=0.0;
        }
    }
    
    public double getWeight()
    {
        return this.weight;
    }

protected void sound(String sound)
{
    System.out.println(sound);
}

public void display()
{
    System.out.println("Name:"+this.name);
    System.out.println("Color:"+this.color);
    System.out.println("Weight:"+this.weight);
}
}
