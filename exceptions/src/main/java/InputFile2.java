// exceptions/InputFile2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class InputFile2 {
    private String fname;

    public InputFile2(String fname) {
        this.fname = fname;
    }

    public static void
    main(String[] args) throws IOException {
        new InputFile2("exceptions/src/main/java/InputFile2.java").getLines()
                .skip(18)
                .limit(1)
                .forEach(System.out::println);
    }

    public Stream<String> getLines() throws IOException {
        return Files.lines(Paths.get(fname));
    }
}
/* Output:
  main(String[] args) throws IOException {
*/
