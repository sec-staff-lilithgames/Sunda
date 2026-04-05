package pt;

import java.util.concurrent.atomic.AtomicReference;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f extends AtomicReference implements c {
    public f(Object obj) {
        super(o0.requireNonNull(obj, "value is null"));
    }

    public abstract void a(Object obj);

    @Override // pt.c
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // pt.c
    public final boolean isDisposed() {
        return get() == null;
    }
}
