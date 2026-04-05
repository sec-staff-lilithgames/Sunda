package p0;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 implements t2 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f80495a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f80496b;

    /* renamed from: c, reason: collision with root package name */
    public final z f80497c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.p f80498d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f80499e;

    /* renamed from: f, reason: collision with root package name */
    public final d f80500f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f80501g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f80502h = new AtomicReference(v2.f80524e);

    /* renamed from: i, reason: collision with root package name */
    public z.o1 f80503i = z.p1.emptyScatterSet();

    /* renamed from: j, reason: collision with root package name */
    public final z0.c0 f80504j;

    /* renamed from: k, reason: collision with root package name */
    public final f4 f80505k;

    public u2(j0 j0Var, f0 f0Var, z zVar, Set<j4> set, kv.p pVar, boolean z10, d dVar, Object obj) {
        this.f80495a = j0Var;
        this.f80496b = f0Var;
        this.f80497c = zVar;
        this.f80498d = pVar;
        this.f80499e = z10;
        this.f80500f = dVar;
        this.f80501g = obj;
        z0.c0 c0Var = new z0.c0();
        c0Var.prepare(set, zVar.getErrorContext$runtime());
        this.f80504j = c0Var;
        this.f80505k = new f4(dVar.getCurrent());
    }

    public final void a() {
        synchronized (this.f80501g) {
            try {
                f4 f4Var = this.f80505k;
                d dVar = this.f80500f;
                kotlin.jvm.internal.e0.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                f4Var.playTo(dVar, this.f80504j);
                this.f80504j.dispatchRememberObservers();
                this.f80504j.dispatchSideEffects();
            } finally {
                this.f80504j.dispatchAbandons();
                this.f80495a.pausedCompositionFinished$runtime(null);
            }
        }
    }

    @Override // p0.t2
    public void apply() throws Exception {
        AtomicReference atomicReference = this.f80502h;
        try {
            switch (((v2) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    a();
                    v2 v2Var = v2.f80527h;
                    v2 v2Var2 = v2.f80528i;
                    while (!atomicReference.compareAndSet(v2Var, v2Var2)) {
                        if (atomicReference.get() != v2Var) {
                            a3.throwIllegalStateException("Unexpected state change from: " + v2Var + " to: " + v2Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new tu.t();
            }
        } catch (Exception e10) {
            atomicReference.set(v2.f80522b);
            throw e10;
        }
    }

    public final void b() {
        boolean z10;
        v2 v2Var = v2.f80525f;
        v2 v2Var2 = v2.f80527h;
        while (true) {
            AtomicReference atomicReference = this.f80502h;
            if (atomicReference.compareAndSet(v2Var, v2Var2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != v2Var) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        a3.throwIllegalStateException("Unexpected state change from: " + v2Var + " to: " + v2Var2 + '.');
    }

    @Override // p0.t2
    public void cancel() {
        this.f80502h.set(v2.f80523c);
        z0.c0 c0Var = this.f80504j;
        z.o1 o1VarExtractRememberSet = c0Var.extractRememberSet();
        c0Var.dispatchAbandons();
        this.f80495a.pausedCompositionFinished$runtime(o1VarExtractRememberSet);
    }

    public final d getApplier() {
        return this.f80500f;
    }

    public final z getComposer() {
        return this.f80497c;
    }

    public final j0 getComposition() {
        return this.f80495a;
    }

    public final kv.p getContent() {
        return this.f80498d;
    }

    public final f0 getContext() {
        return this.f80496b;
    }

    public final Object getLock() {
        return this.f80501g;
    }

    public final f4 getPausableApplier$runtime() {
        return this.f80505k;
    }

    public final z0.c0 getRememberManager$runtime() {
        return this.f80504j;
    }

    public final boolean getReusable() {
        return this.f80499e;
    }

    @Override // p0.t2
    public boolean isApplied() {
        return this.f80502h.get() == v2.f80528i;
    }

    @Override // p0.t2
    public boolean isCancelled() {
        return this.f80502h.get() == v2.f80523c;
    }

    @Override // p0.t2
    public boolean isComplete() {
        return ((v2) this.f80502h.get()).compareTo(v2.f80527h) >= 0;
    }

    public final boolean isRecomposing$runtime() {
        return this.f80502h.get() == v2.f80526g;
    }

    public final void markIncomplete$runtime() {
        boolean z10;
        AtomicReference atomicReference = this.f80502h;
        Object obj = atomicReference.get();
        v2 v2Var = v2.f80525f;
        if (obj == v2Var) {
            return;
        }
        v2 v2Var2 = v2.f80527h;
        while (true) {
            if (atomicReference.compareAndSet(v2Var2, v2Var)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != v2Var2) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        a3.throwIllegalStateException("Unexpected state change from: " + v2Var2 + " to: " + v2Var + '.');
    }

    @Override // p0.t2
    public boolean resume(p4 p4Var) throws Exception {
        boolean z10;
        AtomicReference atomicReference = this.f80502h;
        try {
            int iOrdinal = ((v2) atomicReference.get()).ordinal();
            j0 j0Var = this.f80495a;
            f0 f0Var = this.f80496b;
            boolean z11 = false;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    z zVar = this.f80497c;
                    boolean z12 = this.f80499e;
                    if (z12) {
                        zVar.startReuseFromRoot();
                    }
                    try {
                        this.f80503i = f0Var.composeInitialPaused$runtime(j0Var, p4Var, this.f80498d);
                        v2 v2Var = v2.f80524e;
                        v2 v2Var2 = v2.f80525f;
                        while (true) {
                            if (atomicReference.compareAndSet(v2Var, v2Var2)) {
                                z11 = true;
                            } else if (atomicReference.get() != v2Var) {
                            }
                        }
                        if (!z11) {
                            a3.throwIllegalStateException("Unexpected state change from: " + v2Var + " to: " + v2Var2 + '.');
                        }
                        if (this.f80503i.isEmpty()) {
                            b();
                        }
                        return isComplete();
                    } finally {
                        if (z12) {
                            zVar.endReuseFromRoot();
                        }
                    }
                case 3:
                    v2 v2Var3 = v2.f80525f;
                    v2 v2Var4 = v2.f80526g;
                    while (true) {
                        if (atomicReference.compareAndSet(v2Var3, v2Var4)) {
                            z10 = true;
                        } else if (atomicReference.get() != v2Var3) {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        a3.throwIllegalStateException("Unexpected state change from: " + v2Var3 + " to: " + v2Var4 + '.');
                    }
                    try {
                        this.f80503i = f0Var.recomposePaused$runtime(j0Var, p4Var, this.f80503i);
                        while (true) {
                        }
                        if (this.f80503i.isEmpty()) {
                            b();
                        }
                        return isComplete();
                    } finally {
                        v2 v2Var5 = v2.f80526g;
                        v2 v2Var6 = v2.f80525f;
                        while (true) {
                            if (atomicReference.compareAndSet(v2Var5, v2Var6)) {
                                z11 = true;
                            } else if (atomicReference.get() != v2Var5) {
                            }
                        }
                        if (!z11) {
                            a3.throwIllegalStateException("Unexpected state change from: " + v2Var5 + " to: " + v2Var6 + '.');
                        }
                    }
                case 4:
                    d0.composeRuntimeError("Recursive call to resume()");
                    throw new tu.k();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new tu.t();
            }
        } catch (Exception e10) {
            atomicReference.set(v2.f80522b);
            throw e10;
        }
    }
}
