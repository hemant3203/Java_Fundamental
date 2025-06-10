import java.util.*;
public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double celcius=sc.nextDouble();
        
        System.out.println("Fahrenheit" + (celcius*9/5)+32);
        sc.close();
    }
}
