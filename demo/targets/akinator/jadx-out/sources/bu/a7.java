package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a7 extends ju.a implements vt.g, e7 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10078b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10079c;

    /* renamed from: e, reason: collision with root package name */
    public final z6 f10080e;

    public a7(z6 z6Var, mt.g0 g0Var, AtomicReference atomicReference) {
        this.f10080e = z6Var;
        this.f10078b = g0Var;
        this.f10079c = atomicReference;
    }

    public static <T> ju.a create(mt.g0 g0Var) {
        AtomicReference atomicReference = new AtomicReference();
        return mu.a.onAssembly((ju.a) new a7(new z6(atomicReference), g0Var, atomicReference));
    }

    @Override // ju.a
    public void connect(st.g gVar) {
        y6 y6Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f10079c;
            y6Var = (y6) atomicReference.get();
            if (y6Var != null && !y6Var.isDisposed()) {
                break;
            }
            y6 y6Var2 = new y6(atomicReference);
            while (!atomicReference.compareAndSet(y6Var, y6Var2)) {
                if (atomicReference.get() != y6Var) {
                    break;
                }
            }
            y6Var = y6Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = y6Var.f11253e;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(y6Var);
            if (z10) {
                this.f10078b.subscribe(y6Var);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    @Override // bu.e7
    public mt.g0 publishSource() {
        return this.f10078b;
    }

    @Override // vt.g
    public mt.g0 source() {
        return this.f10078b;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10080e.subscribe(i0Var);
    }
}
