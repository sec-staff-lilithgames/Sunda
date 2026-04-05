package bu;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r8 extends ju.a implements vt.g, tt.g {

    /* renamed from: g, reason: collision with root package name */
    public static final p8 f10914g = new p8();

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10915b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10916c;

    /* renamed from: e, reason: collision with root package name */
    public final c8 f10917e;

    /* renamed from: f, reason: collision with root package name */
    public final l8 f10918f;

    public r8(l8 l8Var, mt.g0 g0Var, AtomicReference atomicReference, c8 c8Var) {
        this.f10918f = l8Var;
        this.f10915b = g0Var;
        this.f10916c = atomicReference;
        this.f10917e = c8Var;
    }

    public static <T> ju.a create(mt.g0 g0Var, int i10) {
        return i10 == Integer.MAX_VALUE ? createFrom(g0Var) : d(g0Var, new j8(i10));
    }

    public static <T> ju.a createFrom(mt.g0 g0Var) {
        return d(g0Var, f10914g);
    }

    public static ju.a d(mt.g0 g0Var, c8 c8Var) {
        AtomicReference atomicReference = new AtomicReference();
        return mu.a.onAssembly((ju.a) new r8(new l8(atomicReference, c8Var), g0Var, atomicReference, c8Var));
    }

    public static <U, R> mt.b0 multicastSelector(Callable<? extends ju.a> callable, st.o oVar) {
        return mu.a.onAssembly(new f8(callable, oVar));
    }

    public static <T> ju.a observeOn(ju.a aVar, mt.m0 m0Var) {
        return mu.a.onAssembly((ju.a) new h8(aVar, aVar.observeOn(m0Var)));
    }

    @Override // ju.a
    public void connect(st.g gVar) {
        k8 k8Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f10916c;
            k8Var = (k8) atomicReference.get();
            if (k8Var != null && !k8Var.isDisposed()) {
                break;
            }
            k8 k8Var2 = new k8(this.f10917e.call());
            while (!atomicReference.compareAndSet(k8Var, k8Var2)) {
                if (atomicReference.get() != k8Var) {
                    break;
                }
            }
            k8Var = k8Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = k8Var.f10530f;
        boolean z10 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            gVar.accept(k8Var);
            if (z10) {
                this.f10915b.subscribe(k8Var);
            }
        } catch (Throwable th2) {
            if (z10) {
                atomicBoolean.compareAndSet(true, false);
            }
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    @Override // tt.g
    public void resetIf(pt.c cVar) {
        AtomicReference atomicReference;
        k8 k8Var = (k8) cVar;
        do {
            atomicReference = this.f10916c;
            if (atomicReference.compareAndSet(k8Var, null)) {
                return;
            }
        } while (atomicReference.get() == k8Var);
    }

    @Override // vt.g
    public mt.g0 source() {
        return this.f10915b;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10918f.subscribe(i0Var);
    }

    public static <T> ju.a create(mt.g0 g0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return create(g0Var, j10, timeUnit, m0Var, Integer.MAX_VALUE);
    }

    public static <T> ju.a create(mt.g0 g0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10) {
        return d(g0Var, new m8(i10, j10, timeUnit, m0Var));
    }
}
