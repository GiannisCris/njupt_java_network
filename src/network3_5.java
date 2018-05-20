import java.util.Scanner;

public class network3_5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        m = Math.abs(m);
        int a = m/100;
        int b = (m%100)/10;
        int c = m%10;
        System.out.print(a+b+c);

    }
}
