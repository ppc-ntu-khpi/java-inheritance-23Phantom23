package test;

import domain.Leopard;

public class TestAnimal {
    
    public static void main(String[] args){
        Leopard leopard = new Leopard("Thomas");
        System.out.println(leopard);
        leopard.hunt();
        leopard.eat();
        leopard.speak();
        leopard.play();
    }
}
