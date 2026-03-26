public class patterns {
    public static void main(String[] args) {

        // Pattern1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Pattern3
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern4
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Pattern5
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern6
        int j = 1;
        for (int i = 1; i <= 5; i++) {
            for (; j <= i * 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern7
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(k + " ");
                k += 2;
            }
            System.out.println();
        }

        // Pattern8
        k = 2;
        for (int i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(k + " ");
                k += 2;
            }
            System.out.println();
        }

        // Pattern9
        j = 1;
        for (int i = 1; i <= 5; i++) {
            for (; j <= i * 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern10
        for (int i = 1; i <= 5; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.print(j + " ");
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Pattern11
        for (int i = 1; i <= 5; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.print(i + " ");
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern12
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            int n = i;

            for (j = 1; j < 5; j++) {
                n = n + 5;
                System.out.print(" " + n + " ");
            }
            System.out.println();
        }

        // Pattern 13
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int x=i;
            int y=n-i+1;
            for (j = 1; j <= n; j++) {
                if(j%2==1){
                    System.out.print(x +" ");
                }
                else{
                    System.out.print(y+" ");
                    
                }
                x+=n;
                y+=n;
            }
            System.out.println();
        }



        //Pattern14
        for(int i=5;i>=1;i--){
            System.out.println(i +" ");
            for(j=1;j<=5;j++){
                System.out.print(j+" ");
                i+=5;
            }
            System.out.println();
        }

    }
}
