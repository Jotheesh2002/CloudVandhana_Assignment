import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    
    /**
     * Method to check if two strings are anagrams
     * @param str1 first string
     * @param str2 second string
     * @return true if the strings are anagrams, false otherwise
     */
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for consistent comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Process provided examples
        System.out.println("Testing examples:");
        System.out.println("\"listen\" and \"silent\" are anagrams: " + areAnagrams("listen", "silent"));
        System.out.println("\"hello\" and \"world\" are anagrams: " + areAnagrams("hello", "world"));
        
        // Allow user to input their own strings
        System.out.println("\nEnter two strings to check if they are anagrams:");
        
        System.out.print("First string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Second string: ");
        String str2 = scanner.nextLine();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
        
        scanner.close();
    }
}
