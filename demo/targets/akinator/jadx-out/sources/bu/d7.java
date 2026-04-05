package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d7 extends ju.a implements vt.g, tt.g {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10214b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10215c = new AtomicReference();

    public d7(mt.g0 g0Var) {
        this.f10214b = g0Var;
    }

    @Override // ju.a
    public void connect(st.g gVar) {
        c7 c7Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f10215c;
            c7Var = (c7) atomicReference.get();
            if (c7Var != null && !c7Var.isDisposed()) {
                break;
            }
            c7 c7Var2 = new c7(atomicReference);
            while (!atomicReference.compareAndSet(c7Var, c7Var2)) {
                if (atomicReference.get() != c7Var) {
                    break;
                }
            }
            c7Var = c7Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = c7Var.f10171b;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(c7Var);
            if (z10) {
                this.f10214b.subscribe(c7Var);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    @Override // tt.g
    public void resetIf(pt.c cVar) {
        AtomicReference atomicReference;
        c7 c7Var = (c7) cVar;
        do {
            atomicReference = this.f10215c;
            if (atomicReference.compareAndSet(c7Var, null)) {
                return;
            }
        } while (atomicReference.get() == c7Var);
    }

    @Override // vt.g
    public mt.g0 source() {
        return this.f10214b;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        c7 c7Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f10215c;
            c7Var = (c7) atomicReference.get();
            if (c7Var != null) {
                break;
            }
            c7 c7Var2 = new c7(atomicReference);
            while (!atomicReference.compareAndSet(c7Var, c7Var2)) {
                if (atomicReference.get() != c7Var) {
                    break;
                }
            }
            c7Var = c7Var2;
            break loop0;
        }
        b7 b7Var = new b7(i0Var, c7Var);
        i0Var.onSubscribe(b7Var);
        if (c7Var.add(b7Var)) {
            if (b7Var.isDisposed()) {
                c7Var.remove(b7Var);
            }
        } else {
            Throwable th2 = c7Var.f10174f;
            if (th2 != null) {
                i0Var.onError(th2);
            } else {
                i0Var.onComplete();
            }
        }
    }
}
