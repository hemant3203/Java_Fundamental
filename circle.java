import java.util.*;
public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double radius=sc.nextDouble();
        
        System.out.println("Area" + Math.PI*(Math.pow(radius,2)));
        sc.close();
    }
}
