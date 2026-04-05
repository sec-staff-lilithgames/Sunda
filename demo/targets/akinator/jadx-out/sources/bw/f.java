package bw;

import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f {
    void coordinatorNotify(g gVar);

    void coordinatorWait(g gVar, long j10);

    <T> BlockingQueue<T> decorate(BlockingQueue<T> blockingQueue);

    void execute(g gVar, Runnable runnable);

    long nanoTime();
}
