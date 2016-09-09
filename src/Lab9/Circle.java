package Lab9;

/**
 * Created by Fer on 9/7/16.
 */
public class Circle {

    private double radius;
    private static int count;

    public Circle(double r){
        this.radius = r;
        this.count++;
    }

    public double getCircumference(){
        return 1;
    }

    public String getFormattedCircumference(){
        return "";
    }

    public double getArea(){
        return 1;
    }

    public String getFormattedArea(){
        return "";
    }

    private String formatNumber(double x){
        return "";
    }

    public static int getObjectCount(){
        return 1;
    }

}
