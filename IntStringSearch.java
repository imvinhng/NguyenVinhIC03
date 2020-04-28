/*
 * ==========================================
 * CS211, Spring 2020, 4/24
 * Vinh T. Nguyen
 * In-Class Exercise #3 - binarySearch method for String
 * 
 * ==========================================
 */

import java.util.*;

public class IntStringSearch {
   public static void main(String[] args){
      String[] words = {"Moby Dick","JGrasp","Zebra","Superheroes","CS211","JournalDev", "Computer Scientist Dream"};  //the original binary
      Arrays.sort(words);
      
      System.out.print("Sorted Array: ");   //same array, but sorted
      for (String x : words){       //Print out the Arrays
         System.out.print( x + ", ");
      }
      System.out.println("");
      
      //Implement Scanner for user to input word 
      Scanner s = new Scanner(System.in);
      System.out.println("Type in word to search (Enter to quit)?");
      String x = s.nextLine();
      
      while(x.length() > 0){
            System.out.println("Index: " + binarySearch(words , x) + "\n");
            System.out.println("Enter any word to search (Enter to quit)?");
            x = s.nextLine();
      }
   }

// Returns the index of an occurrence of target in a,
// or a negative number if the target is not found.
// Precondition: elements of a are in sorted order
public static int binarySearch(String[] a, String target) {
    int min = 0;
    int max = a.length - 1;

    while (min <= max) {
        int mid = (min + max) / 2;
        
        //Depositing the comparision of two strings in to java
        int java = a[mid].compareTo(target);
        
        if (java < 0) {
            min = mid + 1;
        } else if (java > 0) {
            max = mid - 1;
        } else {
            return mid;   // target found
        }
    }

    return -(min + 1);    // target not found
    
}
}