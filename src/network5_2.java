import java.util.Arrays;
import java.util.Scanner;

public class network5_2 {
    public static void main(String[] args){
        int[] a = new int[20];
        Scanner s = new Scanner(System.in);
        for (int i = 0;i<20;i++){
            a[i] = s.nextInt();
        }
        int[] b = new int[10];
        for (int i = 0;i<10;i++){
            b[i] = a[i+5];
        }
        Arrays.sort(b);
        for (int i = 10;i>0;i--){
            a[4+i] = b[10-i];
        }
        for (int i = 0;i<20;i++){
            System.out.print("   "+a[i]);
        }
    }
}
