// lowlevel/SynchronizedSerialNumbers.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class
SynchronizedSerialNumbers extends SerialNumbers {
    private int serialNumber = 0;

    public static void main(String[] args) {
        SerialNumberChecker.test(
                new SynchronizedSerialNumbers());
    }

    @Override
    public synchronized int nextSerialNumber() {
        return serialNumber++;
    }
}
/* Output:
No duplicates detected
*/
