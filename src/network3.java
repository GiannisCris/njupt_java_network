import java.text.DecimalFormat;
import java.util.Scanner;

public class network3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int Sum = a+b+c+d;
        double Average = (a+b+c+d)/4.0;
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.print("Sum="+Sum+";Average="+df.format(Average));
    }
}
