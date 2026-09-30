package expection_resouces;

public class illegal_arugment {
    public void checking_value(double value){
        if (value <=0 || value >=100){
            throw new IllegalArgumentException();
        }
    }
}
