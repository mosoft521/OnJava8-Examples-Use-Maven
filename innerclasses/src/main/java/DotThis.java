// innerclasses/DotThis.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Accessing the outer-class object

public class DotThis {
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        Inner dti = dt.inner();
        dti.outer().f();
    }

    void f() {
        System.out.println("DotThis.f()");
    }

    public Inner inner() {
        return new Inner();
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }
}
/* Output:
DotThis.f()
*/
