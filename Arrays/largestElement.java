package Arrays;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        int[] a = { 9, 3, 22, 88, 4, 2, 7, 88, 88 };
        int largest = a[0];
        int secondLar = a[1];

        for (int i = 0; i <=a.length - 1; i++) {
            if (a[i] > largest) {
                secondLar = largest;
                largest = a[i];

            } else {
                if (a[i] > secondLar && a[i] != largest) {
                    secondLar = a[i];
                }
            }
        }
        System.out.println(largest);
        System.out.println(secondLar);

    }

}
