import java.util.Scanner;
class Box{
    double length;
    double width;
    double height;
    int density = 2;

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