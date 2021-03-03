// files/Writing.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Writing {
    static final int SIZE = 1000;
    static Random rand = new Random(47);

    public static void
    main(String[] args) throws Exception {
        // Write bytes to a file:
        byte[] bytes = new byte[SIZE];
        rand.nextBytes(bytes);
        Files.write(Paths.get("files/src/main/java/bytes.dat"), bytes);
        System.out.println("files/src/main/java/bytes.dat: " +
                Files.size(Paths.get("files/src/main/java/bytes.dat")));

        // Write an iterable to a file:
        List<String> lines = Files.readAllLines(
                Paths.get("streams/src/main/java/Cheese.dat"));
        Files.write(Paths.get("files/src/main/java/Cheese.txt"), lines);
        System.out.println("Cheese.txt: " +
                Files.size(Paths.get("files/src/main/java/Cheese.txt")));
    }
}
/* Output:
bytes.dat: 1000
Cheese.txt: 199
*/
