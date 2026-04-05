package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b7 extends AtomicReference implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10120b;

    public b7(mt.i0 i0Var, c7 c7Var) {
        this.f10120b = i0Var;
        lazySet(c7Var);
    }

    @Override // pt.c
    public void dispose() {
        c7 c7Var = (c7) getAndSet(null);
        if (c7Var != null) {
            c7Var.remove(this);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == null;
    }
}
