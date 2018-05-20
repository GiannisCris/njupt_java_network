import java.text.DecimalFormat;
import java.util.Scanner;

public class network3_4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float f1 = s.nextFloat();
        int i = s.nextInt();
        String ch = s.next();
        char c = ch.charAt(0);
        float f2 = s.nextFloat();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print(c+" "+i+" "+df.format(f1)+" "+df.format(f2));
    }
}
