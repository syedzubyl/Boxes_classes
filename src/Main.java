import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length1 = input.nextDouble();
        System.out.print("Enter width: ");
        double width1 = input.nextDouble();
        System.out.print("Enter height: ");
        double height1 = input.nextDouble();
        System.out.print("Hello and welcome!");

        Box b = new Box();
        boolean exit = false;
        while(!exit){
            System.out.print("Enter choice: ");
            System.out.println("To find volume enter : 1");
            System.out.println("To find Closed box enter : 2");
            try{
                int choice = Integer.parseInt(input.nextLine());
                switch(choice){
                    case 1: b.Volume(length1,width1,height1); break;
                    case 2: b.Area(length1,width1,height1); break;
                    case 3: exit = true; break;
                    default: System.out.println("Invalid choice"); break;
                }

            }catch (NumberFormatException e){
                System.out.println("Please enter a valid choice");
            }
        }

       // System.out.println( "this the totol voulnm"+ b.Volume(length1, width1, height1));

    }
}