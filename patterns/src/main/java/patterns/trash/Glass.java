// patterns/trash/Glass.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package patterns.trash;

public class Glass extends Trash {
    private static double val = 0.23f;

    public Glass(double wt) {
        super(wt);
    }

    public static void value(double newVal) {
        val = newVal;
    }

    @Override
    public double value() {
        return val;
    }
}