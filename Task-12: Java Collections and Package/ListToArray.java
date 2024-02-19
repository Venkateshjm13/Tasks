package task12_programs;
import java.util.ArrayList;
import java.util.List;
 
public class ListToArray {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List elements:" +list);
        //Creating empty array with size of list
        int[] arr = new int[list.size()];
        
        // Converting ArrayList to Array using   get() method
        for (int i = 0; i < list.size(); i++) 
            arr[i] = list.get(i);
        
        // Printing elements of array on console
        System.out.println("Array elements:");
        for (int num : arr)
            System.out.println(num);
        }
    }




