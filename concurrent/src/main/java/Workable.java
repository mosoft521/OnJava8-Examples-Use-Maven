// concurrent/Workable.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import onjava.Nap;

import java.util.concurrent.CompletableFuture;

public class Workable {
    final double duration;
    String id;

    public Workable(String id, double duration) {
        this.id = id;
        this.duration = duration;
    }

    public static Workable work(Workable tt) {
        new Nap(tt.duration); // Seconds
        tt.id = tt.id + "W";
        System.out.println(tt);
        return tt;
    }

    public static CompletableFuture<Workable>
    make(String id, double duration) {
        return
                CompletableFuture.completedFuture(
                        new Workable(id, duration))
                        .thenApplyAsync(Workable::work);
    }

    @Override
    public String toString() {
        return "Workable[" + id + "]";
    }
}
