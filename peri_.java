import java.util.*;
public class peri_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Length");

        double length=sc.nextDouble();
        System.out.println("Enter width");
        double width=sc.nextDouble();
        
        System.out.println("permeter:" + 2*(length+width));
        sc.close();

}
}
