import java.util.Scanner;

class peo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

        for (int i = 0; i < test; i++) {
            int peo = s.nextInt();
            int mon = s.nextInt();
            int amount[] = new int[peo];
            for (int j = 0; j < peo; j++) {
                amount[j] = s.nextInt();
            }
            int temp[] = new int[peo];
            for (int j = 0; j < peo; j++) {
                temp[j] = 0;
            }
            for(int j=0;j<peo;j++)
            {
                if (mon>=amount[j])
                {
                    mon-=amount[j];
                    temp[j]=1;
                }

            }
            for(int j=0;j<peo;j++)
            {
                System.out.print(temp[j] +" ");
            }
        }
    }
}