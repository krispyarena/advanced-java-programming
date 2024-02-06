package core;

import java.util.Arrays;

public class ArrayMethods {
    
    public static void main(String[] args) {
        
        int[] a = {4,3,8,1,0,5,10};
        int[] b = new int[7];
        b[6] = 10;
        int [] c = new int [10]; 

        for (int i : a) {
            System.out.print(i + " ");
        }

        Arrays.fill(c, 1);
        System.out.println("\nElements of Array C after fill method: ");
        for (int i : c) {
            System.out.print(i + " ");
        }

        System.out.println(Arrays.equals(a,b));
        
        Arrays.sort(a);

        System.arraycopy(a, 0, b, 0, 7  );

        System.out.println("After Sort: ");

        for (int i : b) {
            System.out.print(i + " ");
        }

        System.out.println("\nIndex = " + Arrays.binarySearch(b, 1));
    }
}
