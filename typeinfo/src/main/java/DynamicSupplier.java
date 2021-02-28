// typeinfo/DynamicSupplier.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.function.Supplier;
import java.util.stream.Stream;

class ID {
    private static long counter;
    private final long id = counter++;

    // A public default constructor is required
    // to call getConstructor().newInstance():
    public ID() {
    }

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class DynamicSupplier<T> implements Supplier<T> {
    private Class<T> type;

    public DynamicSupplier(Class<T> type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Stream.generate(
                new DynamicSupplier<>(ID.class))
                .skip(10)
                .limit(5)
                .forEach(System.out::println);
    }

    @Override
    public T get() {
        try {
            return type.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
/* Output:
10
11
12
13
14
*/
