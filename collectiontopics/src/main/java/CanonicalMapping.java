// collectiontopics/CanonicalMapping.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstrates WeakHashMap

import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

class Element {
    private String ident;

    Element(String id) {
        ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ident);
    }

    @Override
    public boolean equals(Object r) {
        return r instanceof Element &&
                Objects.equals(ident, ((Element) r).ident);
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() {
        System.out.println("Finalizing " +
                getClass().getSimpleName() + " " + ident);
    }
}

class Key extends Element {
    Key(String id) {
        super(id);
    }
}

class Value extends Element {
    Value(String id) {
        super(id);
    }
}

public class CanonicalMapping {
    public static void main(String[] args) throws Exception {
        int size = 1000;
        // Or, choose size via the command line:
        if (args.length > 0)
            size = Integer.valueOf(args[0]);
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map =
                new WeakHashMap<>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i % 3 == 0)
                keys[i] = k; // Save as "real" references
            map.put(k, v);
        }
        System.gc();
        TimeUnit.MILLISECONDS.sleep((int) (1000 * 5));
    }
}
/*
Finalizing Key 215
Finalizing Key 214
Finalizing Key 212
Finalizing Key 211
Finalizing Key 209
Finalizing Key 208
Finalizing Key 206
Finalizing Key 205
Finalizing Key 203
Finalizing Key 202
Finalizing Key 200
Finalizing Key 199
Finalizing Key 197
Finalizing Key 196
...
 */