// lowlevel/AtomicEvenProducer.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Atomic classes: occasionally useful in regular code

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenProducer extends IntGenerator {
    private AtomicInteger currentEvenValue =
            new AtomicInteger(0);

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenProducer());
    }

    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }
}
/* Output:
No odd numbers discovered
*/
