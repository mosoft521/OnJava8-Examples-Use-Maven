// innerclasses/BigEgg.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// An inner class cannot be overridden like a method

class Egg {
    private Yolk y;

    Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
}

public class BigEgg extends Egg {
    public static void main(String[] args) {
        new BigEgg();
    }

    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }
}
/* Output:
New Egg()
Egg.Yolk()
*/
