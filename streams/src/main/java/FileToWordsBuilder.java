// streams/FileToWordsBuilder.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath)
            throws Exception {
        Files.lines(Paths.get(filePath))
                .skip(1) // Skip the comment line at the beginning
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+"))
//                        builder.add(w);//[1]
                        builder.accept(w);//[2]
                });
    }

    public static void
    main(String[] args) throws Exception {
        new FileToWordsBuilder("streams/src/main/java/Cheese.dat").stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }

    Stream<String> stream() {
        return builder.build();
    }
}
/* Output:
[1] Not much of a cheese shop really
[2] Not much of a cheese shop really
*/
