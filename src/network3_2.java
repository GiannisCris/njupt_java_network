import java.util.Scanner;

public class network3_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        if(a>100) System.out.println("错误,您的成绩超过分值，请重新输入!");
        else if(a>=90) System.out.println(a+"--A");
        else if(a>=80) System.out.println(a+"--B");
        else if(a>=70) System.out.println(a+"--C");
        else if(a>=60) System.out.println(a+"--D");
        else if(a<60) System.out.println(a+"--E");
    }
}
