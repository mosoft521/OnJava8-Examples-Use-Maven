// interfaces/Jim.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package interfaces;

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

public class Jim implements Jim1, Jim2 {
    public static void main(String[] args) {
        new Jim().jim();
    }

    @Override
    public void jim() {
        Jim2.super.jim();
    }
}
/* Output:
Jim2::jim
*/
