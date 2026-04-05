package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x6 extends AtomicReference implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11209b;

    public x6(mt.i0 i0Var) {
        this.f11209b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((y6) andSet).a(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == this;
    }
}
