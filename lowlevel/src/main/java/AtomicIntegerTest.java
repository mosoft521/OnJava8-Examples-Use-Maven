// lowlevel/AtomicIntegerTest.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest extends IntTestable {
    private AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) {
        Atomicity.test(new AtomicIntegerTest());
    }

    public int getAsInt() {
        return i.get();
    }

    @Override
    public void evenIncrement() {
        i.addAndGet(2);
    }
}
/* Output:
No failures found
*/
