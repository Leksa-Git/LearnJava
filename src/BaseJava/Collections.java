package BaseJava;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 22, 4);
        Student st2 = new Student("Oleg", 21, 3);
        Student st3 = new Student("Masha", 23, 2);
        Student st4 = new Student("Masha", 23, 2);
        ArrayList<Student> arraylist = new ArrayList<>();
        arraylist.add(st1);
        arraylist.add(st2);
        arraylist.add(st3);
        System.out.println(arraylist);
        arraylist.remove(1);
        System.out.println(arraylist);

        HashMap<Integer,Student> hashMap = new HashMap();
        hashMap.put(1,st1);
        hashMap.put(2,st2);
        hashMap.put(3,st3);
        System.out.println(hashMap);

        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Oleg");
        set.add("Masriya");
        System.out.println(set);

    }

}
class Student{
    String name;
    int age;
    int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }
}