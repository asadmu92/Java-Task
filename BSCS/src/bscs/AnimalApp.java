
package bscs;


public class AnimalApp {
    public static void main(String[] args) {
        
       Cat c1 = new Cat();
       c1.climb();
       c1.sound("Meow");
     
       c1.setWeight(-2.56);
      // c1.weight = -2.56;
       c1.display();
       
       
       
       Dog d1 =new Dog();
       d1.sound("bhao bhao");
    }
}
