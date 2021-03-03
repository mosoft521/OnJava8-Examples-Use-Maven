// files/ReadLineStream.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLineStream {
    public static void
    main(String[] args) throws Exception {
        Files.lines(Paths.get("files/src/main/java/PathInfo.java"))
                .skip(20)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
/* Output:
        show("RegularFile", Files.isRegularFile(p));
*/
