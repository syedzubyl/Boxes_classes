package box_resouces;

public class Box{
    public final double length;
    public final double width;
    public double height;
    public int density = 2;
    //This for chose only Base Area
    public Box(double length, double width){
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
        return length*width;
    }
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