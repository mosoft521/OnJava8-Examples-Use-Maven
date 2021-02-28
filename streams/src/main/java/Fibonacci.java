// streams/Fibonacci.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.stream.Stream;

public class Fibonacci {
    int x = 1;

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20) // Don't use the first 20
                .limit(10) // Then take 10 of them
                .forEach(System.out::println);
    }

    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }
}
/* Output:
6765
10946
17711
28657
46368
75025
121393
196418
317811
514229
*/
