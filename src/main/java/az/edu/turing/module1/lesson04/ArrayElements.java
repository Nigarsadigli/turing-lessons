
package az.edu.turing.module1.lesson04;

public class ArrayElements {

    public static void main(String[] args) {
        int[] Arr1={5,8,4};
        printArrayElements(Arr1);
    }

    public static void printArrayElements(int[] Arr ){
        int n=Arr.length;
        for (int i=0; i<n;i++){
            System.out.println("index " + i +  ": = " + Arr[i] );
        }
    }
}
