import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("First Edge : ");
        a= scanner.nextInt();
        System.out.println("Second Edge :");
        b= scanner.nextInt();
        double h=Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuse :"+h);



    }
}
