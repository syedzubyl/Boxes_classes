import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Box box1 =new Box(10,5,4,2);
        System.out.println( box1.base_area());
       System.out.println( box1.Surface_area());
       System.out.println( box1.Volume());
       System.out.println( box1.Mass());

        Box box2 =new Box(20,8,6,3);
        System.out.println( box2.base_area());
        System.out.println( box2.Surface_area());
        System.out.println( box2.Volume());
        System.out.println( box2.Mass());
    }
}