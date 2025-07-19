package library;

import java.util.Arrays;

public class BookSearch {
    public static int linear(Book[] books, String title) {
        for (int i = 0; i < books.length; i++)
            if (books[i].title.equalsIgnoreCase(title)) return i;
        return -1;
    }

    public static int binary(Book[] books, String title) {
        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Programming", "James Gosling"),
            new Book(2, "Data Structures", "Mark Allen Weiss"),
            new Book(3, "Algorithms", "Robert Sedgewick")
        };

        System.out.println("Linear Search: " + linear(books, "Data Structures"));
        System.out.println("Binary Search: " + binary(books, "Algorithms"));
    }
}