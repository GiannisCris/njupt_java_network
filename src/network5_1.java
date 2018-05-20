import java.util.Scanner;

public class network5_1 {
    public static void main(String[] args){
        int[] b = new int[4];
        String str;
        int t,i;
        Scanner s = new Scanner(System.in);
       str = s.next();
       char[] a = str.toCharArray();
        for(i=0;i<4;i++) {
            b[i] = (a[i] -'0' + 9) % 10;
        }
        for(i=0;i<2;i++) {
            t=b[i];
            b[i]=b[i+2];
            b[i+2]=t;
        }
            t=b[0]*1000+b[1]*100+b[2]*10+b[3];
            System.out.println( "The encrypted number is "+t);
    }
}
