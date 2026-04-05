package hu;

import java.util.concurrent.atomic.AtomicLong;
import vt.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b extends AtomicLong implements l {
    @Override // vt.l, tw.d
    public abstract /* synthetic */ void cancel();

    @Override // vt.l, vt.k, vt.o
    public abstract /* synthetic */ void clear();

    @Override // vt.l, vt.k, vt.o
    public abstract /* synthetic */ boolean isEmpty();

    @Override // vt.l, vt.k, vt.o
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.l, vt.k, vt.o
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // vt.l, tw.d
    public abstract /* synthetic */ void request(long j10);

    @Override // vt.l, vt.k
    public abstract /* synthetic */ int requestFusion(int i10);

    @Override // vt.l, vt.k, vt.o
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
