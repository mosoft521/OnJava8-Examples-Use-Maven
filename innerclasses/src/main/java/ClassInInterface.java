// innerclasses/ClassInInterface.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java ClassInInterface$Test}

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public static void main(String[] args) {
            new Test().howdy();
        }

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }
    }
}
/* Output:
Howdy!
*/
