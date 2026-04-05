package vd;

import java.io.Closeable;
import md.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface d extends Closeable {
    int cleanUp();

    long getNextCallTime(d0 d0Var);

    boolean hasPendingEventsFor(d0 d0Var);

    Iterable<d0> loadActiveContexts();

    Iterable<m> loadBatch(d0 d0Var);

    m persist(d0 d0Var, md.u uVar);

    void recordFailure(Iterable<m> iterable);

    void recordNextCallTime(d0 d0Var, long j10);

    void recordSuccess(Iterable<m> iterable);
}
