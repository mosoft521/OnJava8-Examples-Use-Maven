// concurrent/GuardedIDField.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.concurrent.atomic.AtomicInteger;

public class GuardedIDField implements HasID {
    private static AtomicInteger counter =
            new AtomicInteger();
    private int id = counter.getAndIncrement();

    public static void main(String[] args) {
        IDChecker.test(GuardedIDField::new);
    }

    @Override
    public int getID() {
        return id;
    }
}
/* Output:
0
*/
