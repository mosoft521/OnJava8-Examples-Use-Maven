// streams/RandomWords.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);

    RandomWords(String fname) throws IOException {
        List<String> lines =
                Files.readAllLines(Paths.get(fname));
        // Skip the first line:
        for (String line : lines.subList(1, lines.size())) {
            for (String word : line.split("[ .?,]+")) // [1]
//            for (String word : line.split("\\W+")) // [2]
                words.add(word.toLowerCase());
        }
        System.out.println(words);
        System.out.println("+++");
    }

    public static void
    main(String[] args) throws Exception {
        System.out.println(
                Stream.generate(new RandomWords("streams/src/main/java/Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining(" ")));
    }

    @Override
    public String get() {
        return words.get(rand.nextInt(words.size()));
    }

    @Override
    public String toString() {
        return words.stream()
                .collect(Collectors.joining(" "));
    }
}
/* Output:
[1] it shop sir the much cheese by conclusion district is
[1] 生成list：[not, much, of, a, cheese, shop, really, is, it, finest, in, the, district, sir, and, what, leads, you, to, that, conclusion, well, it's, so, clean, it's, certainly, uncontaminated, by, cheese]
不一样原因：流不保证顺序
[2] s district leads much shop to really sir leads s
[2]生成list：[not, much, of, a, cheese, shop, really, is, it, finest, in, the, district, sir, and, what, leads, you, to, that, conclusion, well, it, s, so, clean, it, s, certainly, uncontaminated, by, cheese]
是不太一样的，1未用‘来分割
*/
