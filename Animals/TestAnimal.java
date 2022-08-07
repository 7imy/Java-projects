public class TestAnimal{
  public static void main(String [] args){
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat("nono");

    //Fish object
    System.out.println(d.legs);
    d.eat();
    d.play();
    d.walk();

    //Cat object
    System.out.println(c.legs);
    c.play();
    c.eat();

    //Fish from animal class
    a.eat();
    a.walk();

    //Spider from animal class
    e.eat();
  }
}
