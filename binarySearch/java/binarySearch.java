/**
 * Created by g33z on 4/20/17.
 */
import java.util.Arrays;
import java.io.*;

public class binarySearch {

    private static int SIZE = 100;

    private static void search(int searchKey, int[] arr, int l, int r)
    {
        if (r < l) {
            System.out.println("Array doesn't contain the number your seek!");
        } else {
            int mid = (l + r) / 2;
            if(searchKey == arr[l] || searchKey == arr[r] || searchKey == arr[mid]) {
                System.out.println("Found it!");
            } else if(searchKey < arr[mid]) {
                search(searchKey, arr, l, mid - 1);
            } else if(searchKey > arr[mid]) {
                search(searchKey, arr, mid + 1, r);
            } else {
                System.out.println("Debugging please");
            }
        }
    }

    public static void main (String[]args)
    {
        int[] dict = new int[SIZE];
        for(int i = 0; i < SIZE; i++) {
            int c = (int)(Math.random() * 101);
            if(c != 0) {
                dict[i] = c;
            }
        }
        // sort
        Arrays.sort(dict);
        System.out.println("Sorted Array looks like this.");
        for (int i = 0; i != SIZE; ++i)
            System.out.print(dict[i] + " ");
        System.out.println("\nArray created and sorted. Commencing...");
        int n = 0;
        System.out.println("What to search? (0 - 100)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            System.err.println("SAEFT!");
        }
        // now search
        int l = 0;
        int r = SIZE-1;
        search(n, dict, l, r);
    }
}
