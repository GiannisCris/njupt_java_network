import java.lang.reflect.Array;
import java.util.Arrays;

public class network4_4 {
    public static void main(String[] args){
        int[]b = new int[10];
        b[0] = b[1] = 1;
        for (int i = 2;i<10;i++){
            b[i] = b[i-1]+b[i-2];

        }

        System.out.println(Arrays.toString(b));
/*        for (int j = 0;j<10;j++){
            System.out.print(b[j]+"    ");
        }
        */
    }
}
