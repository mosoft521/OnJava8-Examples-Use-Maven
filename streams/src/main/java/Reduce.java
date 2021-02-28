// streams/Reduce.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.Random;
import java.util.stream.Stream;

class Frobnitz {
    static final int BOUND = 100;
    // Generator:
    static Random rand = new Random(47);
    int size;

    Frobnitz(int sz) {
        size = sz;
    }

    static Frobnitz supply() {
        return new Frobnitz(rand.nextInt(BOUND));
    }

    @Override
    public String toString() {
        return "Frobnitz(" + size + ")";
    }
}

public class Reduce {
    public static void main(String[] args) {
        Stream.generate(Frobnitz::supply)
                .limit(10)
                .peek(System.out::println)
                .reduce((fr0, fr1) -> fr0.size < 50 ? fr0 : fr1)
                .ifPresent(System.out::println);
    }
}
/* Output:
Frobnitz(58)
Frobnitz(55)
Frobnitz(93)
Frobnitz(61)
Frobnitz(61)
Frobnitz(29)
Frobnitz(68)
Frobnitz(0)
Frobnitz(22)
Frobnitz(7)
Frobnitz(29)
*/
