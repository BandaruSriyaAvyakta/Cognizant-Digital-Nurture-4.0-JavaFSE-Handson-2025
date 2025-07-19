package search;

import java.util.Arrays;

public class ProductSearch {
    public static int linearSearch(Product[] arr, String name) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].productName.equalsIgnoreCase(name)) return i;
        return -1;
    }

    public static int binarySearch(Product[] arr, String name) {
        Arrays.sort(arr, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}