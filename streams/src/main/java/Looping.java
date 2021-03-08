// streams/Looping.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import static java.util.stream.IntStream.range;
import static onjava.Repeat.repeat;

public class Looping {
    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));//[1]
        repeat(2, Looping::hi);

        range(0, 3).forEach(i -> System.out.println("Looping " + i));//[2]把[1]展开
    }
}
/* Output:
Looping!
Looping!
Looping!
Hi!
Hi!
Looping!
Looping!
Looping!
*/
