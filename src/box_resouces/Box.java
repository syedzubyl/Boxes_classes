package box_resouces;
import expection_resouces.illegal_arugment;


public class Box{
    private final double length;
    private final double width;
    private double height;
    private int density = 2;

    illegal_arugment expection = new illegal_arugment();

    //This for chose only Base Area
    public Box(double length, double width){
        expection.checking_value(length);
        this.length = length;
        this.width = width;
    }
    public Box(double length, double width, double height, int density){
        this.length = length;
        this.width = width;
        this.height = height;
        this.density = density;
    }

    public double base_area(){
        return length*width;}

    public double Surface_area(){
         return 2*(length * width + length * height + width * height);
    }
    public double Volume(){
        return length*width*height;
    }
    public double Mass(){
        return Volume()*density;
    }
}