package rocks.lichthuis.functional;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Result {
    static final Function<String, Predicate<String>> startsWithLetter =
            	  letter -> name -> name.startsWith(letter);

    public static void main(String [] args) {
      List.of("gegevens"," data","episode")
              .forEach(word->{

                  System.out.println(String.format("%s starts with N: ",word));
                      }

                      );
    }
}
