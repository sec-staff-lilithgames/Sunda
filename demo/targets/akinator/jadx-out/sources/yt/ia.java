package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ia extends rt.a implements vt.h, tt.g {

    /* renamed from: h, reason: collision with root package name */
    public static final v9 f95683h = new v9();

    /* renamed from: c, reason: collision with root package name */
    public final mt.l f95684c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95685e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f95686f;

    /* renamed from: g, reason: collision with root package name */
    public final ca f95687g;

    public ia(ca caVar, mt.l lVar, AtomicReference atomicReference, Callable callable) {
        this.f95687g = caVar;
        this.f95684c = lVar;
        this.f95685e = atomicReference;
        this.f95686f = callable;
    }

    public static <T> rt.a create(mt.l lVar, int i10) {
        return i10 == Integer.MAX_VALUE ? createFrom(lVar) : e(lVar, new ba(i10));
    }

    public static <T> rt.a createFrom(mt.l lVar) {
        return e(lVar, f95683h);
    }

    public static rt.a e(mt.l lVar, Callable callable) {
        AtomicReference atomicReference = new AtomicReference();
        return mu.a.onAssembly((rt.a) new ia(new ca(atomicReference, callable), lVar, atomicReference, callable));
    }

    public static <U, R> mt.l multicastSelector(Callable<? extends rt.a> callable, st.o oVar) {
        return new y9(callable, oVar);
    }

    public static <T> rt.a observeOn(rt.a aVar, mt.m0 m0Var) {
        return mu.a.onAssembly((rt.a) new u9(aVar, aVar.observeOn(m0Var)));
    }

    @Override // rt.a
    public void connect(st.g gVar) {
        da daVar;
        loop0: while (true) {
            AtomicReference atomicReference = this.f95685e;
            daVar = (da) atomicReference.get();
            if (daVar != null && !daVar.isDisposed()) {
                break;
            }
            try {
                da daVar2 = new da((aa) this.f95686f.call());
                while (!atomicReference.compareAndSet(daVar, daVar2)) {
                    if (atomicReference.get() != daVar) {
                        break;
                    }
                }
                daVar = daVar2;
                break loop0;
            } finally {
                qt.d.throwIfFatal(th);
                RuntimeException runtimeExceptionWrapOrThrow = iu.m.wrapOrThrow(th);
            }
        }
        AtomicBoolean atomicBoolean = daVar.f95367f;
        boolean z10 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            gVar.accept(daVar);
            if (z10) {
                this.f95684c.subscribe((mt.q) daVar);
            }
        } catch (Throwable th2) {
            if (z10) {
                atomicBoolean.compareAndSet(true, false);
            }
            throw iu.m.wrapOrThrow(th2);
        }
    }

    @Override // tt.g
    public void resetIf(pt.c cVar) {
        AtomicReference atomicReference;
        da daVar = (da) cVar;
        do {
            atomicReference = this.f95685e;
            if (atomicReference.compareAndSet(daVar, null)) {
                return;
            }
        } while (atomicReference.get() == daVar);
    }

    @Override // vt.h
    public tw.b source() {
        return this.f95684c;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95687g.subscribe(cVar);
    }

    public static <T> rt.a create(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return create(lVar, j10, timeUnit, m0Var, Integer.MAX_VALUE);
    }

    public static <T> rt.a create(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10) {
        return e(lVar, new ea(i10, j10, timeUnit, m0Var));
    }
}
