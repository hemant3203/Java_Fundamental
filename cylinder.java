import java.util.*;
public class cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Radius");

        double radius=sc.nextDouble();
        System.out.println("Enter Height");
        double height=sc.nextDouble();
        
        System.out.println("Volume:" + Math.PI*(Math.pow(radius,2)*height));
        sc.close();

}
}
