import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigDecimal;
public class network1 {
    public static void main(String[] args){
        double s;
        Scanner a = new Scanner(System.in);
        int h = a.nextInt();
        s = (h-100)*0.9*2;
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.print(df.format(s));

    }
}
