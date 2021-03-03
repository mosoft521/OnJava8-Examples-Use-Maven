// files/AddAndSubtractPaths.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddAndSubtractPaths {
    static Path base = Paths.get("..", "..", "..")
            .toAbsolutePath()
            .normalize();

    static void show(int id, Path result) {
        if (result.isAbsolute())
            System.out.println("(" + id + ")r " +
                    base.relativize(result));
        else
            System.out.println("(" + id + ")  " + result);
        try {
            System.out.println("RealPath: "
                    + result.toRealPath());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(base);
        Path p = Paths.get("files/src/main/java/AddAndSubtractPaths.java")
                .toAbsolutePath();
        show(1, p);
        Path convoluted = p.getParent().getParent()
                .resolve("strings")
                .resolve("..")
                .resolve(p.getParent().getFileName());
        show(2, convoluted);
        show(3, convoluted.normalize());

        Path p2 = Paths.get("..", "..");
        show(4, p2);
        show(5, p2.normalize());
        show(6, p2.toAbsolutePath().normalize());

        Path p3 = Paths.get(".").toAbsolutePath();
        Path p4 = p3.resolve(p2);
        show(7, p4);
        show(8, p4.normalize());

        Path p5 = Paths.get("").toAbsolutePath();
        show(9, p5);
        show(10, p5.resolveSibling("strings"));
        show(11, Paths.get("nonexistent"));
    }
}
/* Output:
Windows 10
E:\
(1)r ws_ij_alvin\OnJava8-Examples-Use-Maven\files\src\main\java\AddAndSubtractPaths.java
RealPath: E:\ws_ij_alvin\OnJava8-Examples-Use-Maven\files\src\main\java\AddAndSubtractPaths.java
(2)r ws_ij_alvin\OnJava8-Examples-Use-Maven\files\src\main\strings\..\java
RealPath: E:\ws_ij_alvin\OnJava8-Examples-Use-Maven\files\src\main\java
(3)r ws_ij_alvin\OnJava8-Examples-Use-Maven\files\src\main\java
RealPath: E:\ws_ij_alvin\OnJava8-Examples-Use-Maven\files\src\main\java
(4)  ..\..
RealPath: E:\
(5)  ..\..
RealPath: E:\
(6)r
RealPath: E:\
(7)r ws_ij_alvin\OnJava8-Examples-Use-Maven\.\..\..
RealPath: E:\
(8)r
RealPath: E:\
(9)r ws_ij_alvin\OnJava8-Examples-Use-Maven
RealPath: E:\ws_ij_alvin\OnJava8-Examples-Use-Maven
(10)r ws_ij_alvin\strings
java.nio.file.NoSuchFileException: E:\ws_ij_alvin\strings
(11)  nonexistent
java.nio.file.NoSuchFileException: E:\ws_ij_alvin\OnJava8-Examples-Use-Maven\nonexistent
*/
