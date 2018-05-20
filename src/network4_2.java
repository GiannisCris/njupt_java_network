import java.util.Scanner;

public class network4_2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Double x = s.nextDouble();
        double t = 1,i = 1;
        double sum = 0;
        int sign = 1;
        do {
            t = t * x/i;
            sum += sign*t;
            sign = -sign;
            ++i;
        } while(t >= 1e-5);
        System.out.print("sum=");
        System.out.printf("%.2f",sum);
    }

}