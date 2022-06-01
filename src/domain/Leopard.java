package domain;

public class Leopard extends Predator {
    
    private String kind;
    
    public Leopard(String name, int weight, String kind){
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }
    
    public Leopard(){
        this("Fluffy", 7, "just a leopard");
    }

    public Leopard(String name) {
        this(name, 7, "just a leopard");
    }
    
    public void play(){
        System.out.println("Loepard is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("Leopard hunting for a cat");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Leoprad!";
    }

    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Leopard eats meat...");
    }
    
    
}
