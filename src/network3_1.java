import java.util.Arrays;
import java.util.Scanner;

public class network3_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = 0;
        switch (month) {
            case 1:;case 3: ; case 5: ; case 7: ; case 8: ; case 10: ; case 12 : day = 31; break;
            case 4:;case 6: ; case 9: ; case 11: day = 30; break;
            case 2: day = year % 4 == 0 ? 29 : 28;
            default : break;
        }
        System.out.println(year+"-"+month+"-"+day);

    }
}
