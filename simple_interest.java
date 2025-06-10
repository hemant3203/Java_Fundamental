import java.util.*;
public class simple_interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal ,rate ,time");
        double Principal=sc.nextDouble();
        double Rate=sc.nextDouble();
        double Time=sc.nextDouble();
        sc.close();

        double Interest = (Principal * Rate * Time) / 100;
        System.out.println("Simple Interest:"+ Interest);
    }
}
