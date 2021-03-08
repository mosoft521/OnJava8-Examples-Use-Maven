import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedComparatorAlvin {
    public static void
    main(String[] args) throws Exception {
        List<String> list1 = FileToWords.stream(
                "streams/src/main/java/Cheese.dat")
                .collect(Collectors.toList());
        System.out.println(list1);

        List<String> list2 = FileToWords.stream(
                "streams/src/main/java/Cheese.dat")
                .skip(10)
                .collect(Collectors.toList());
        System.out.println(list2);

        List<String> list3 = FileToWords.stream(
                "streams/src/main/java/Cheese.dat")
                .skip(10)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list3);

        List<String> list4 = FileToWords.stream(
                "streams/src/main/java/Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list4);
    }
}
/* Output:
[Not, much, of, a, cheese, shop, really, is, it, Finest, in, the,
district, sir, And, what, leads, you, to, that, conclusion, Well, it, s,
so, clean, It, s, certainly, uncontaminated, by, cheese]
[in, the, district, sir, And, what, leads, you, to, that, conclusion,
Well, it, s, so, clean, It, s, certainly, uncontaminated, by, cheese]
[in, the, district, sir, And, what, leads, you, to, that]
[you, what, to, the, that, sir, leads, in, district, And]
*/