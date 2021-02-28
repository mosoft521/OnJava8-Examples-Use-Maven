// lowlevel/EvenProducer.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// When threads collide
// {VisuallyInspectOutput}

public class EvenProducer extends IntGenerator {
    private int currentEvenValue = 0;

    public static void main(String[] args) {
        EvenChecker.test(new EvenProducer());
    }

    @Override
    public int next() {
        ++currentEvenValue;                   // [1]
        ++currentEvenValue;
        return currentEvenValue;
    }
}
/* Output:
419 not even!
425 not even!
423 not even!
421 not even!
417 not even!
*/
