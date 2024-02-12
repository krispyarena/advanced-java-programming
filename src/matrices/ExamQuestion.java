package matrices;

/*
 * An array with odd number of elements is said to be centered if all the elements except the middle one are
 * strictly greater than the value of middle element. Note that only arrays with an odd number of elements 
 * have a middle element.
 * 
 * Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise returns 0.
 */

import java.util.Scanner;

public class ExamQuestion{

    int arrayTest(int[] arr){

        int i, mid;
        mid = arr.length/2;

        for(i=0; i<arr.length; i++){

            if(i==mid){
                continue;
            }

            if(arr[i] <= arr[mid]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of elements in an Array (Odd Number only): ");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        ExamQuestion e = new ExamQuestion();

        System.out.println(e.arrayTest(arr));

        scanner.close();
    }
}