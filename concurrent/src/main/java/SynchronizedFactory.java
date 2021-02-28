// concurrent/SynchronizedFactory.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

final class SyncFactory implements HasID {
    private final int id;

    private SyncFactory(SharedArg sa) {
        id = sa.get();
    }

    public static synchronized SyncFactory factory(SharedArg sa) {
        return new SyncFactory(sa);
    }

    @Override
    public int getID() {
        return id;
    }
}

public class SynchronizedFactory {
    public static void main(String[] args) {
        Unsafe unsafe = new Unsafe();
        IDChecker.test(() ->
                SyncFactory.factory(unsafe));
    }
}
/* Output:
0
*/
