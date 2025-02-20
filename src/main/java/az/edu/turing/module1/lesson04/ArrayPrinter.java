package az.edu.turing.module1.lesson04;

public class ArrayPrinter {

    public static void main(String[] args) {
        int[] arr = {5, 8, 4};
        printArrayElements(arr);
    }

    public static void printArrayElements(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("index: " + i + "value: " + arr[i]);
        }
    }
}
