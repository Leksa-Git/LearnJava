package Lesson2;

public class Generic {
    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<>(5);
        System.out.println(boxInt.GetDate());


        Box<String> boxStr = new Box<>("Hi");
        System.out.println(boxStr.GetDate());
    }

}

class Box<T> {
    T data;

    Box(T data) {
        this.data = data;
    }
    T GetDate(){
        return data;
    }
}
