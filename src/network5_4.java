import java.util.Arrays;
import java.util.Scanner;

public class network5_4 {
    public static int[] fun(int a,int b) {
        int[] arr = new int[1000];
        int n = 0;
        for (int i = (a > 0 ? a : 1); i <= b; i++) {
            if ((i % 7 == 0 || i % 11 == 0) && (i % 77 != 0)) {
                arr[n] = i;
                n++;
            }
        }
        int[] newarr = new int[n];
        for (int i = 0;i<n;i++){
            newarr[i] = arr[i];
        }
        return newarr;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] n = new int[1000];
        int a = s.nextInt();
        int b = s.nextInt();
        n = fun(a,b);
        for (int j = 0;j<n.length;j++) {
            System.out.print(n[j] + " ");
        }
    }
}
