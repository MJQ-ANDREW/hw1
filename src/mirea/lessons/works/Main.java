package mirea.lessons.works;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter job number(3-7): ");
        int job = in.nextInt();
        switch (job) {
            case 3:
                System.out.print("Enter length for array: ");
                int arrlength3 = in.nextInt(), sum3 = 0;
                int[] array3 = new int[arrlength3];
                System.out.println("Enter array values:");
                for (int i = 0; i < arrlength3; i++) {
                    System.out.printf("%s: ", i);
                    array3[i] = in.nextInt();
                    sum3 += array3[i];
                }
                System.out.printf("Sum of values: %s\nAverage value: %s", sum3, (double) sum3 / arrlength3);
                break;
            case 4:
                System.out.print("Enter length for array: ");
                int arrlength4 = in.nextInt();
                int[] array4 = new int[arrlength4];
                System.out.println("Enter array values:");
                for (int i = 0; i < arrlength4; i++) {
                    System.out.printf("%s: ", i);
                    array4[i] = in.nextInt();
                }
                int sumW4 = 0, sumDW4 = 0, j = 0, minim = Integer.MAX_VALUE, maxim = Integer.MIN_VALUE;
                while(j < arrlength4)
                {
                    sumW4 += array4[j];
                    minim = Math.min(minim, array4[j]);
                    j++;
                }
                j = 0;
                do{
                    sumDW4 += array4[j];
                    maxim = Math.max(maxim, array4[j]);
                    j++;
                }while(j < arrlength4);
                System.out.printf("Sum values with do while: %s\nSum values with while: %s\nSimilarity of results: %b\nMin value: %s\nMax value: %s", sumDW4, sumW4, sumDW4 == sumW4, minim,  maxim);
                break;
            case 5:
                for(int i = 0; i < args.length; i++)
                {
                    System.out.printf("arg %s: %s\n", i, args[i]);
                }
                break;
            case 6:
                for(int i = 1; i <= 10; i++)
                {
                    System.out.printf("%s: 1/%s = %.2f\n", i, i, 1.0 / i);
                }
                break;
            case 7:
                System.out.print("Enter value: ");
                System.out.printf("Factorial value: %s", factorial(in.nextInt()));
                break;
            default:
                System.out.println("There is no such task or it does not imply a solution in the code :(");
                break;
        }
    }

    static public int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}