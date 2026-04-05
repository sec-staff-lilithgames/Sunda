package du;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends AtomicBoolean implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52686b;

    /* renamed from: c, reason: collision with root package name */
    public final d f52687c;

    public c(mt.q0 q0Var, d dVar) {
        this.f52686b = q0Var;
        this.f52687c = dVar;
    }

    @Override // pt.c
    public void dispose() {
        if (compareAndSet(false, true)) {
            this.f52687c.c(this);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get();
    }
}
