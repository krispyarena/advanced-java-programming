package core;

import java.util.Arrays;

public class ArrayMethods {
    
    public static void main(String[] args) {
        
        int[] a = {4,3,8,1,0,5,10};
        int[] b = new int[7];
        b[7] = 10;

        for (int i : a) {
            System.out.println(i);
        }

        //Arrays.fill(a, 1);
        System.out.println("Index = " + Arrays.binarySearch(b, 100));
        System.out.println(Arrays.equals(a,b));
        
        Arrays.sort(a);

        System.arraycopy(a, 0, b, 0, 7);

        System.out.println("After Sort: ");

        for (int i : b) {
            System.out.println(i);
        }
    }
}
