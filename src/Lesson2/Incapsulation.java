package Lesson2;

public class Incapsulation {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setName("Murzik");
        System.out.println(cat.getAge()+" "+cat.getName());
    }

}
class Cat {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
