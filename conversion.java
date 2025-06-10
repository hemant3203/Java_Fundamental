import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter kilometer");

        double Kilometer=sc.nextDouble();
        System.out.println("Miles:" +Kilometer*0.621371);
        sc.close();
}
}