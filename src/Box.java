import java.util.Scanner;
class Box{
    private final double length;
    private final double width;
    private double height;
    private int density = 2;
    //This for chose only Base Area
    Box(double length, double width){
        this.length = length;
        this.width = width;
    }
    Box(double length, double width, double height, int density){
        this.length = length;
        this.width = width;
        this.height = height;
        this.density = density;
    }
    double base_area(){
        return length*width;
    }
    double Surface_area(){
         return 2*(length * width + length * height + width * height);
    }
    double Volume(){
        return length*width*height;
    }
    double Mass(){
        return Volume()*density;
    }
}