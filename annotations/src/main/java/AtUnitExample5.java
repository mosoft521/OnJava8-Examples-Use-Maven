// annotations/AtUnitExample5.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java onjava.atunit.AtUnit
// build/classes/java/main/annotations/AtUnitExample5.class}

import onjava.atunit.Test;
import onjava.atunit.TestObjectCleanup;
import onjava.atunit.TestObjectCreate;
import onjava.atunit.TestProperty;

import java.io.IOException;
import java.io.PrintWriter;

public class AtUnitExample5 {
    @TestProperty
    static PrintWriter output;
    @TestProperty
    static int counter;
    private String text;

    public AtUnitExample5(String text) {
        this.text = text;
    }

    @TestObjectCreate
    static AtUnitExample5 create() {
        String id = Integer.toString(counter++);
        try {
            output = new PrintWriter("Test" + id + ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new AtUnitExample5(id);
    }

    @TestObjectCleanup
    static void cleanup(AtUnitExample5 tobj) {
        System.out.println("Running cleanup");
        output.close();
    }

    @Override
    public String toString() {
        return text;
    }

    @Test
    boolean test1() {
        output.print("test1");
        return true;
    }

    @Test
    boolean test2() {
        output.print("test2");
        return true;
    }

    @Test
    boolean test3() {
        output.print("test3");
        return true;
    }
}
/* Output:
annotations.AtUnitExample5
  . test1
Running cleanup
  . test3
Running cleanup
  . test2
Running cleanup
OK (3 tests)
*/
