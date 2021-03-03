// exceptions/MessyExceptions.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MessyExceptions {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream(
                    new File("exceptions/src/main/java/MessyExceptions.java"));
            int contents = in.read();
            // Process contents
        } catch (IOException e) {
            // Handle the error
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // Handle the close() error
                }
            }
        }
    }
}
