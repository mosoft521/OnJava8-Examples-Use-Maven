// collectiontopics/SuppliersCollectionTest.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import onjava.Suppliers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Government implements Supplier<String> {
    static String[] foundation = (
            "strange women lying in ponds " +
                    "distributing swords is no basis " +
                    "for a system of government").split(" ");
    private int index;

    @Override
    public String get() {
        return foundation[index++];
    }
}

public class SuppliersCollectionTest {
    public static void main(String[] args) {
        // Suppliers class from the Generics chapter:
        Set<String> set = Suppliers.create(
                LinkedHashSet::new, new Government(), 15);
        System.out.println(set);
        List<String> list = Suppliers.create(
                LinkedList::new, new Government(), 15);
        System.out.println(list);
        list = new ArrayList<>();
        Suppliers.fill(list, new Government(), 15);
        System.out.println(list);

        // Or we can use Streams:
        set = Arrays.stream(Government.foundation)
                .collect(Collectors.toSet());
        System.out.println(set);
        list = Arrays.stream(Government.foundation)
                .collect(Collectors.toList());
        System.out.println(list);
        list = Arrays.stream(Government.foundation)
                .collect(Collectors
                        .toCollection(LinkedList::new));
        System.out.println(list);
        set = Arrays.stream(Government.foundation)
                .collect(Collectors
                        .toCollection(LinkedHashSet::new));
        System.out.println(set);
    }
}
/* Output:
[strange, women, lying, in, ponds, distributing,
swords, is, no, basis, for, a, system, of, government]
[strange, women, lying, in, ponds, distributing,
swords, is, no, basis, for, a, system, of, government]
[strange, women, lying, in, ponds, distributing,
swords, is, no, basis, for, a, system, of, government]
[ponds, no, a, in, swords, for, is, basis, strange,
system, government, distributing, of, women, lying]
[strange, women, lying, in, ponds, distributing,
swords, is, no, basis, for, a, system, of, government]
[strange, women, lying, in, ponds, distributing,
swords, is, no, basis, for, a, system, of, government]
[strange, women, lying, in, ponds, distributing,
swords, is, no, basis, for, a, system, of, government]
*/
