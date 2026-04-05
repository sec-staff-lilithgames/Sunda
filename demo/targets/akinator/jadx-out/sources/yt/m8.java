package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m8 extends rt.a implements vt.h, q8 {

    /* renamed from: c, reason: collision with root package name */
    public final mt.l f95942c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95943e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95944f;

    /* renamed from: g, reason: collision with root package name */
    public final j8 f95945g;

    public m8(j8 j8Var, mt.l lVar, AtomicReference atomicReference, int i10) {
        this.f95945g = j8Var;
        this.f95942c = lVar;
        this.f95943e = atomicReference;
        this.f95944f = i10;
    }

    public static <T> rt.a create(mt.l lVar, int i10) {
        AtomicReference atomicReference = new AtomicReference();
        return mu.a.onAssembly((rt.a) new m8(new j8(atomicReference, i10), lVar, atomicReference, i10));
    }

    @Override // rt.a
    public void connect(st.g gVar) {
        l8 l8Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f95943e;
            l8Var = (l8) atomicReference.get();
            if (l8Var != null && !l8Var.isDisposed()) {
                break;
            }
            l8 l8Var2 = new l8(atomicReference, this.f95944f);
            while (!atomicReference.compareAndSet(l8Var, l8Var2)) {
                if (atomicReference.get() != l8Var) {
                    break;
                }
            }
            l8Var = l8Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = l8Var.f95876f;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(l8Var);
            if (z10) {
                this.f95942c.subscribe((mt.q) l8Var);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    @Override // yt.q8
    public int publishBufferSize() {
        return this.f95944f;
    }

    @Override // yt.q8
    public tw.b publishSource() {
        return this.f95942c;
    }

    @Override // vt.h
    public tw.b source() {
        return this.f95942c;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95945g.subscribe(cVar);
    }
}
