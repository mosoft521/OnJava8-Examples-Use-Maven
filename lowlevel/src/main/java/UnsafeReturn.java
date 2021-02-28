// lowlevel/UnsafeReturn.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class UnsafeReturn extends IntTestable {
    private int i = 0;

    public static void main(String[] args) {
        Atomicity.test(new UnsafeReturn());
    }

    public int getAsInt() {
        return i;
    }

    @Override
    public synchronized void evenIncrement() {
        i++;
        i++;
    }
}
/* Output:
failed with: 39
*/
