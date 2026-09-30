package main_resouces;

import box_resouces.Box;

public class Main {
    public static void main(String[] args) {
        Box box1 =new Box(10,5,4,2);
        System.out.println( "box1");
        System.out.println( box1.base_area());
       System.out.println( box1.Surface_area());
       System.out.println( box1.Volume());
       System.out.println( box1.Mass());

        Box box2 =new Box(20,8,6,3);
        System.out.println( "box2");
        System.out.println( box2.base_area());
        System.out.println( box2.Surface_area());
        System.out.println( box2.Volume());
        System.out.println( box2.Mass());



        //if there only base area only i need now for that i choose this consturstor
        Box box3 =new Box(15,5);
        System.out.println( "box3");
        System.out.println( box3.base_area());
    }
}