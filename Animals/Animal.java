abstract  class Animal {
    protected int legs;
    protected Animal (int legs){
        this.legs=legs; // int x=10
    }
    public abstract void eat();
    public void walk(){
        System.out.println("Animal has "+legs+" legs.");
    }
}
interface Pet{
    public String getName();
    public void setName(String name);
    public void play();
}
class Spider extends Animal{
    public Spider(){
        super(8);
    }
    public void eat(){
        System.out.println("Spider can eat insects ");
    }
}
class Cat extends Animal implements Pet{
    private String catName;
    public Cat(){
        this("");
    }
    public Cat(String catName){
        super(4);
        this.catName=catName;
    }
    public String getName(){
        return catName;
    }
    public void setName(String name){
        catName=name;
    }
    public void play(){
        System.out.println("cat can play well");
    }
    public void eat(){
        System.out.println(" Cat can mouse");
    }
}
class Fish extends Animal implements Pet{
    private String fishName;
    public Fish(){
        super(0);
    }
    public String getName(){
        return fishName;
    }
    public void setName(String name){
        fishName=name;
    }
    public void play(){
        System.out.println("fish can play well");
    }
    public void eat(){
        System.out.println(" fish can eat other fishes");
    }
    public void walk(){
        System.out.println("Fish cannot walk, just swim");

    }

    
}
