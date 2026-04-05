package pt;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends AtomicReference implements c {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81822b;

    public e(Future future, boolean z10) {
        super(future);
        this.f81822b = z10;
    }

    @Override // pt.c
    public void dispose() {
        Future future = (Future) getAndSet(null);
        if (future != null) {
            future.cancel(this.f81822b);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        Future future = (Future) get();
        return future == null || future.isDone();
    }
}
