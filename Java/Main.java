
public class Main {
    public static void main(String[] args) {
        // int a=129;
        // byte b=(byte) a;
        // System.out.println(b);
        // short s=(short) a ;
        // System.out.println(s);

        int a;
        a = 10;

        int b = a++ + ++a + --a - a--;
        System.out.println(b);
        // System.out.println(a);
        // a=20;
        // System.out.println(a);

        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Arithmetic Operators

        a = 10;
        b = 20;
        int c = a - b;

        System.out.println("Addition: " + a + b);
        System.out.println("Subraction: " + c);
        System.out.println("Multiplication: " + a * b);
        System.out.println("Division: " + a / b);
        System.out.println("Modulo: " + a % b);

        // Assigment Operators
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a == b);
        System.out.println(a *= b);

        // Relational Operators
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println(a < b);

        // Logical Operators
        System.out.println(a > b && a <= b);
        System.out.println(a > b || a <= b);

        // int i=1;

        // for(;i<=2;i++){
        // System.out.println("hi");
        // }
        // System.out.print(i);

        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 5; j <= 8; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                // System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 110;
        while (i > 10) {
            System.out.println(i);
            i++;
            if (i == 115) {
                break;
            }
            // System.out.println(i);
        }

        int num = 121;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits : " + sum);

        int[] a1 = new int[3];
        a1[0] = 10;
        a1[2] = 50;

        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);

        System.out.println(a1);

        // Total of Array
        for (i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        int total = 0;

        for (int j : a1) {
            total += j;
        }
        System.out.println("Total: " + total);

        // Find Min Value
        int[] arr = { 10, 40, 3, 5, 23, 60 };
        int min = arr[0];

        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        System.out.println(min);

        // Find Index Element
        int element = 7;
        int[] arr1 = { 2, 3, 4, 5, 7, 2, 5, 8 };
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] == element) {
                System.out.println("Index Of The Given Element is " + i);
            }
        }

        i = 0;
        while (i < arr1.length) {
            if (arr1[i] == element) {
                System.out.println("Element Found: " + i);
            }
            i++;
        }

        // Duplicate Elements in Array
        int[] arr2 = { 10, 20, 30, 40, 20, 50, 70, 10 };
        for (i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    System.out.println(arr2[i]);
                }
            }
        }

         // Remove Duplicates in Array {1,2,2,3,4,4,5}
        
       
       
        // Move All Zeroes to end -> {10,0,5,0,7}->{10,5,7,0,0}
        /// Addition of 2 matrix

        // reverse an Array {40,50,60,70,10,20,30} -> {30,20,10,70,60,50,40}
        int[] arr3 = { 40, 50, 60, 70, 10, 20, 30 };
        int[] revArr = new int[arr3.length];
        int n = 0;
        for (i = arr3.length - 1; i >= 0; i--) {
            revArr[n] = arr3[i];
            n++;
        }

        for (int k1 : revArr) {
            System.out.print(k1 + " ");
        }

        // Second Largest Element {10,20,100,70,50,80}
        int[] arr4 = { 10, 20, 100, 70, 50, 80 };
        int max = arr4[0];
        int secondMax = Integer.MIN_VALUE;
        for (i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                secondMax = max;
                max = arr4[i];
            } else if (arr4[i] > secondMax && arr[4] != max)
                secondMax = arr4[i];
        }
        System.out.println("Second Largest " + secondMax);

        // To Check The Array is Sorted {10,30,40,70,100}
        int [] arr5={10,60,40,70,100};
        boolean asc=true;
        boolean desc=true;
        for(i=0;i<arr5.length-1;i++){
            if(arr5[i]<arr5[i+1]) {
                desc=false;
                
            };
            if(arr5[i]>arr5[i+1]) {
                asc=false;
                
            };
        }
        if(asc || desc) System.out.print("Sorted");
        else System.out.println("NOT Sorted");




       
         // {10,20,70,60,100,120,30} Two Sum Target =150

         int [] arr6={10,20,70,60,100,120,30} ;
         int Target=8;
         boolean isMakes=true;
         for(i=0;i<arr6.length-1;i++){
            for(int j=i+1;j<arr6.length;j++){
                if(arr6[i]+arr6[j]==Target){
                    System.out.println(arr6[i]+" " +arr6[j]);
                    isMakes=false;
                }
            }
        }
        if(isMakes) System.out.println("Nothing Makes The Target");


        // Move All Zeroes to end -> {10,0,5,0,7}->{10,5,7,0,0}
        int[] arr7={10,0,5,0,7};
        int index=0;
        for(i=0;i<arr7.length;i++){
            if(arr7[i]!=0){
                arr7[index]=arr7[i];
                index++;

            }
        }
        for(i=index;i<arr7.length;i++){
            arr7[i]=0;
        }

        for(int h:arr7)System.out.println(h);

        // Rotate Array by 1 position {1,2,3,4,5}->{2,3,4,5,1}
        int [] arr8={1,2,3,4,5};
        a=arr8[0];
        for(i=0;i<arr8.length-1;i++){
            arr8[i]=arr8[i+1];
        }
        arr8[arr8.length-1]=a;
        System.out.println("Rotate Array");
        for(int h:arr8) System.out.println(h);


         // Find Missing Number ->{10,20,30,50,60} ans:40
         int [] arr9={10,20,30,50,60};
         a=arr9[1]-arr9[0];
         for(i=1;i<arr9.length-1;i++){
            if(arr9[i]+a!=arr9[i+1]){
                System.out.println(arr9[i]+a);
            }
         }







        // Topics in Next CLass Debate ->Indian Politics
        // Memory Management Function String Intenal & mutable String Boxing
        // and UnBoxing

    }
}
