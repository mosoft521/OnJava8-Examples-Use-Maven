// polymorphism/PrivateOverride.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Trying to override a private method
// {java polymorphism.PrivateOverride}
package polymorphism;

public class PrivateOverride {
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

    private void f() {
        System.out.println("private f()");
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
/* Output:
private f()
*/
