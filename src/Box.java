import java.util.Scanner;

class Box{
    public double Volume(double length, double width, double height){
        return (length * width * height);
    }
    public double Area(double length, double width, double height){
        return (2*(length * width +length* height+ width*height));
    }
}