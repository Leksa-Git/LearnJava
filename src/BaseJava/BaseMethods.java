package BaseJava;

public class BaseMethods {
    public static int numadd(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int age = 25;
        String name = "Alex";
        System.out.println(name + " " + age);
        int[] num = {1, 2, 3};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        if (age > 18) {
            System.out.println("Допуск");
        } else {
            System.out.println("Не допуск");
        }
        System.out.println(numadd(1,2));

        Cat cat = new Cat();
        cat.makesound();
    }

}
interface run {
     default void run(){
         System.out.println("i can run");
     };
}
class Cat implements run{
    String name = "Murka";
    int age = 8;
    void makesound(){
        System.out.println("Meow");
    }
    @Override
    public void run (){
        System.out.println("Cat can run");
    }
}

