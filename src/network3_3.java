import java.text.DecimalFormat;
import java.util.Scanner;

public class network3_3 {
    public static void main(String[] args){
        float y = 0;
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        if (x<20)y = x + 100;
        if (x>=20&&x<=100)y = x;
        if (x>100)y = x - 100;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("x="+df.format(x)+",y="+df.format(y));


    }
}
