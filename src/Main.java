import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Box b =new Box(6,4,3);
        System.out.println("this base area : "+b.base_area());
        Box b2 =new Box(9,6,4);
        System.out.println("this surface area : "+b2.Surface_area());
        Box b3 =new Box(10,5,4);
        System.out.println("this Mass: "+b3.Mass()+"g");
    }
}