public class network4_1 {
    public static void main(String[] args){
        int count = 0;
        int i,j;
        boolean bool;
        for(i = 100;i < 1000;i++){
            bool = true;
            for (j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                System.out.printf("%6s",i);
                count++;
                if(count%5==0)
                    System.out.print("\n");
            }

        }
    }
}
