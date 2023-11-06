package uk.ac.cam.rd722.supo1;

import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // --- question 2 ---
        // example of a reference to an object
        // vec is the reference, the 'new Vector2D' is the object
        Vector2D vec = new Vector2D(4.0, 3.0);

        System.out.println("Vector magnitude:");
        System.out.println(Math.sqrt(vec.x * vec.x + vec.y * vec.y));

        int[] nums = {1, 2, -4, 3, -1};

        // see Vector2D.java for other part of question 2

        // --- question 4 ---
        System.out.println("Sum:");
        System.out.println(sum(nums));
        System.out.println("Cumulative sum:");
        System.out.println(Arrays.toString(cumsum(nums)));
        System.out.println("Positives:");
        System.out.println(Arrays.toString(positives(nums)));

        // see function definitions below

        // --- question 5 ---
        int[] ab = {0, 2};
        vectorAdd(ab, 1, 1);
        System.out.println("Adjusted vector:");
        System.out.println(ab[0]+" "+ab[1]);

        // see vectorAdd definition below
    }

    static int sum(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    static int[] cumsum(int[] a) {
        int[] result = new int[a.length];
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
            result[i] = total;
        }
        return result;
    }

    static int[] positives(int[] a) {
        // step 1: count the number of positive items in a
        int count = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] > 0) count++;
            i++;
        }
        // step 2: create an array of that size and populate it
        int[] result = new int[count];
        int cumpos = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] <= 0) continue;
            result[cumpos] = a[j];
            cumpos++;
            if (cumpos > count) break;
        }
        return result;
    }

    public static void vectorAdd(int[] vec, int dx, int dy) {
        vec[0] += dx;
        vec[1] += dy;
    }

}