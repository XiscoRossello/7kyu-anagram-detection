import java.util.Arrays;

public class Anagram {
  public static boolean isAnagram(String a, String b) {
    if (a.isEmpty() && b.isEmpty()) {
            return true;
        }
    if (a.length() != b.length()) {
            return false;
        }
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    char[] arregloA = a.toCharArray();
    char[] arregloB = b.toCharArray();
    
    Arrays.sort(arregloA);
    Arrays.sort(arregloB);
    
    return Arrays.equals(arregloA,arregloB);
  }
}
