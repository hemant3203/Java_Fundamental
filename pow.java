import java.util.*;
public class pow{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double exp=sc.nextDouble();
        System.out.println("Power calculation:"+Math.pow(n,exp));
        sc.close();
    }
}