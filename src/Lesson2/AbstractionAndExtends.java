package Lesson2;

public class AbstractionAndExtends {
    public static void main(String[] args) {

        Animal cat1 = new Cat1();
        cat1.makeSound();


        Cat1 cat = new Cat1();
        cat.makeSound();
        cat.makeSound("Кошка говорит МЯУ");
    }
}

abstract class Animal {
    void makeSound() {
    }

}

class Cat1 extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    void makeSound(String g) {
        System.out.println(g);
    }
}
