// standardio/OSExecuteDemo.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstrates standard I/O redirection
// javap -cp standardio\target\classes OSExecuteDemo
// {ExcludeFromGradle}

import onjava.OSExecute;

public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap -cp standardio\\target\\classes OSExecuteDemo");
    }
}
/* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo {
  public OSExecuteDemo();
}
*/
