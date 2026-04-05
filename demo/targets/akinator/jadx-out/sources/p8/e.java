package p8;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80743a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f80744b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f80745c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue f80746d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f80747e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f80748f;

    public e(boolean z10) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new b());
        this.f80745c = new HashMap();
        this.f80746d = new ReferenceQueue();
        this.f80743a = z10;
        this.f80744b = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new c(this));
    }

    public final synchronized void a(n8.q qVar, o0 o0Var) {
        d dVar = (d) this.f80745c.put(qVar, new d(qVar, o0Var, this.f80746d, this.f80743a));
        if (dVar != null) {
            dVar.f80739c = null;
            dVar.clear();
        }
    }

    public final void b(d dVar) {
        v0 v0Var;
        synchronized (this) {
            this.f80745c.remove(dVar.f80737a);
            if (dVar.f80738b && (v0Var = dVar.f80739c) != null) {
                this.f80747e.onResourceReleased(dVar.f80737a, new o0(v0Var, true, false, dVar.f80737a, this.f80747e));
            }
        }
    }
}
