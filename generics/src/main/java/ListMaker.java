// generics/ListMaker.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {
    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        List<String> stringList = stringMaker.create();
    }

    List<T> create() {
        return new ArrayList<>();
    }
}
