import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Step 2: Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Step 3: Convert strings to character arrays and sort them
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        // Step 4: Compare sorted arrays
        return Arrays.equals(array1, array2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Take input from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // Step 2: Check if the inputs are anagrams
        boolean result = areAnagrams(str1, str2);
        
        // Step 3: Display the result
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);
        
        scanner.close();
    }
}
