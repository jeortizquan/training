package rocks.lichthuis.anagram;

public class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        // Write your code here
        int i=0;
        while(a.length()>0 && i < a.length()) {
             if( b.replaceFirst("" + a.charAt(i), "") .length() < b.length()) {
                 b = b.replaceFirst("" + a.charAt(i), "");
                 a = a.replaceFirst("" + a.charAt(i), "");
             } else {
                 i++;
             }
        }
        return a.length()+b.length();
    }

}
