package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o2 extends AtomicReference implements pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52808b;

    public o2(mt.q0 q0Var) {
        this.f52808b = q0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52808b.onSuccess(0L);
    }
}
