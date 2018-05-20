import java.util.Arrays;
import java.util.Scanner;

public class network5_5 {
    public static void main(String[] args){
        int i, j, k, sum = 0, count = 0, min = 1, max = 1;
        int[] a = new int[20];
        double average = 0.0;
        Scanner s = new Scanner(System.in);
        for(i = 0; i < 20; i++){                      //用数组存放输入的20个整数
            a[i] = s.nextInt();
        }
        count = 20;
        Arrays.sort(a);
        for(i = 0; a[i] == a[i+1]; i++){            //找出相同的最大值个数
            max++;
        }
        for(i = 19; a[i] == a[i-1]; i--){          //找出相同的最小值个数
            min++;
        }
        count = count - min - max;
        for(i = max; i < count+max; i++){
            sum += a[i];
        }
        average = sum*1.0 / count;
        System.out.print("count="+count);
        System.out.print(",average=");
        System.out.printf("%.2f",average);
    }
}
