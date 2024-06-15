package rocks.lichthuis;
import rocks.lichthuis.anagram.Result;
public class Main {

    public static void main(String[] args) {
        // test anagram
	    System.out.println(Result.makeAnagram("cde","abc"));
        System.out.println(Result.makeAnagram("cde","dcf"));
        System.out.println(Result.makeAnagram("bacdc","dcbac"));
    }
}
