// concurrent/ParallelStreamPuzzle.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamPuzzle {
    public static void main(String[] args) {
        List<Integer> x =
                Stream.generate(new IntGenerator())
                        .limit(10)
                        .parallel()                     // [1]
                        .collect(Collectors.toList());
        System.out.println(x);
    }

    static class IntGenerator
            implements Supplier<Integer> {
        private int current = 0;

        @Override
        public Integer get() {
            return current++;
        }
    }
}
/* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
