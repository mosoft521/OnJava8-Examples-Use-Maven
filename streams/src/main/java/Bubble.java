// streams/Bubble.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class Bubble {
    private static int count = 0;
    public final int i;

    public Bubble(int n) {
        i = n;
    }

    public static Bubble bubbler() {
        return new Bubble(count++);
    }

    @Override
    public String toString() {
        return "Bubble(" + i + ")";
    }
}
