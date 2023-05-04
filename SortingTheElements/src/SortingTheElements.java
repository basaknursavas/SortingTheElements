import java.util.Arrays ;
import java.util.Scanner ;
public class SortingTheElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int [] list = new int [size] ;

        System.out.println("Enter the elements of the array : ");

        for (int i = 0; i < list.length; i++) { //With this loop, I taking the elemnts of array from the user one by one.
            System.out.print((i + 1) + ". Elements = ");
            list [i] = input.nextInt();
        }
        System.out.print("The sorting is : ");
        sorting(list);

    }

    public static void sorting (int [] list) { //With this method, I sort the elemts.
        for(int i = 0; i < list.length; i++) {
            int min = list[i]; //With this synchronization, I assign the smallest element to the first index.
            int minIndex = i; //And this synchronization is used to assign the smallest index to i.

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j ;
                }
            }
            int temp = list[i] ;
            list [i] = list[minIndex];
            list[minIndex] = temp ;
        }
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
