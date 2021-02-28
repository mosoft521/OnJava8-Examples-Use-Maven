package hiding;// hiding/ChocolateChip.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Can't use package-access member from another package

import hiding.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }

    public void chomp() {
        //- bite(); // Can't access bite
    }
}
/* Output:
Cookie constructor
ChocolateChip constructor
*/
