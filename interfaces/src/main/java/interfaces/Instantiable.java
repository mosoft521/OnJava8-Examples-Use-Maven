// interfaces/Instantiable.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package interfaces;

abstract class Uninstantiable {
    abstract void f();

    abstract int g();
}

public class Instantiable extends Uninstantiable {
    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
    }

    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    int g() {
        return 22;
    }
}
