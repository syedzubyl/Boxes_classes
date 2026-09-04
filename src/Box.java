import java.util.Scanner;

class Box{
    double length;
    double width;
    double height;
    int density = 2;

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double base_area(){
        return length*width;
    }
    double Surface_area(){
         return 2*(length * width + length * height + width * height);
    }
    Double Volume(){
        return length*width*height;
    }
    Double Mass(){
        return Volume()*density;
    }
}