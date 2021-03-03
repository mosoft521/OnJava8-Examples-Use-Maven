// strings/InfiniteRecursion.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Accidental recursion
// {ThrowsException}
// {VisuallyInspectOutput} Throws very long exception

import java.util.stream.Stream;

public class InfiniteRecursion {
    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return
                " InfiniteRecursion address: " + this + "\n";//this ==> super.toString()
    }
}
/* Output:
Exception in thread "main" java.lang.StackOverflowError
	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:125)
	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:448)
	at java.lang.StringBuilder.append(StringBuilder.java:136)
	at InfiniteRecursion.toString(InfiniteRecursion.java:20)
	at java.lang.String.valueOf(String.java:2994)
	at java.lang.StringBuilder.append(StringBuilder.java:131)
	at InfiniteRecursion.toString(InfiniteRecursion.java:20)
	at java.lang.String.valueOf(String.java:2994)
 */