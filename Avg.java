import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Three Number ");

        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        
        
       System.out.println("Average of three no:"+(a+b+c)/3.0);
        sc.close();
}
}
