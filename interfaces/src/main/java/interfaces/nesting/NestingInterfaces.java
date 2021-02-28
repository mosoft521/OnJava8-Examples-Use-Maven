// interfaces/nesting/NestingInterfaces.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java interfaces.nesting.NestingInterfaces}
package interfaces.nesting;

interface E {
    void g();

    interface G {
        void f();
    }

    // Redundant "public":
    public interface H {
        void f();
    }
    // Cannot be private within an interface:
    //- private interface I {}
}

class A {
    private D dRef;

    public D getD() {
        return new DImp2();
    }

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }

    interface B {
        void f();
    }

    public interface C {
        void f();
    }

    private interface D {
        void f();
    }

    public class BImp implements B {
        @Override
        public void f() {
        }
    }

    private class BImp2 implements B {
        @Override
        public void f() {
        }
    }

    class CImp implements C {
        @Override
        public void f() {
        }
    }

    private class CImp2 implements C {
        @Override
        public void f() {
        }
    }

    private class DImp implements D {
        @Override
        public void f() {
        }
    }

    public class DImp2 implements D {
        @Override
        public void f() {
        }
    }
}

public class NestingInterfaces {
    public static void main(String[] args) {
        A a = new A();
        // Can't access A.D:
        //- A.D ad = a.getD();
        // Doesn't return anything but A.D:
        //- A.DImp2 di2 = a.getD();
        // Cannot access a member of the interface:
        //- a.getD().f();
        // Only another A can do anything with getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }

    public class BImp implements A.B {
        @Override
        public void f() {
        }
    }

    class CImp implements A.C {
        @Override
        public void f() {
        }
    }

    // Cannot implement a private interface except
    // within that interface's defining class:
    //- class DImp implements A.D {
    //-  public void f() {}
    //- }
    class EImp implements E {
        @Override
        public void g() {
        }
    }

    class EGImp implements E.G {
        @Override
        public void f() {
        }
    }

    class EImp2 implements E {
        @Override
        public void g() {
        }

        class EG implements E.G {
            @Override
            public void f() {
            }
        }
    }
}
