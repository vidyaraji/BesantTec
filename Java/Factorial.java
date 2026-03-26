// import java.util.Currency;
// import java.util.Scanner;

public class Factorial {
    public static void main(String []args){

        //Factorial Program 
        // int result=1;
        // Scanner scan =new Scanner(System.in);
        // int num= scan.nextInt();
        // while(num!=0){
        //     result*=num;
        //     num--;
        // }
        // System.out.println("Factorial Using While: " + result);



        //Odd or Even
        // int OddOrEven=scan.nextInt();
        // if(OddOrEven%2==0){
        //     System.out.println("The Number is Even");
        // }
        // else{
        //     System.out.println("The Number is Odd");
        // }


        //Fibonacci
        int PreviousVal=0;
        int currentVal=1;
        System.out.print(PreviousVal +" "+ currentVal +" ");
        for(int i=0;i<8;i++){
            int a=PreviousVal;
            PreviousVal=currentVal;
            currentVal+=a;
            System.out.print(currentVal +" ");
        }

    }
}
