package fu;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends mt.m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final x f56090g;

    /* renamed from: h, reason: collision with root package name */
    public static final x f56091h;

    /* renamed from: k, reason: collision with root package name */
    public static final r f56094k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f56095l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f56096m;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadFactory f56097e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f56098f;

    /* renamed from: j, reason: collision with root package name */
    public static final TimeUnit f56093j = TimeUnit.SECONDS;

    /* renamed from: i, reason: collision with root package name */
    public static final long f56092i = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        r rVar = new r(new x("RxCachedThreadSchedulerShutdown"));
        f56094k = rVar;
        rVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        x xVar = new x("RxCachedThreadScheduler", iMax);
        f56090g = xVar;
        f56091h = new x("RxCachedWorkerPoolEvictor", iMax);
        f56095l = Boolean.getBoolean("rx2.io-scheduled-release");
        p pVar = new p(0L, null, xVar);
        f56096m = pVar;
        pVar.a();
    }

    public s() {
        this(f56090g);
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return new q((p) this.f56098f.get());
    }

    @Override // mt.m0
    public void shutdown() {
        while (true) {
            AtomicReference atomicReference = this.f56098f;
            p pVar = (p) atomicReference.get();
            p pVar2 = f56096m;
            if (pVar == pVar2) {
                return;
            }
            while (!atomicReference.compareAndSet(pVar, pVar2)) {
                if (atomicReference.get() != pVar) {
                    break;
                }
            }
            pVar.a();
            return;
        }
    }

    public int size() {
        return ((p) this.f56098f.get()).f56071e.size();
    }

    @Override // mt.m0
    public void start() {
        AtomicReference atomicReference;
        p pVar;
        p pVar2 = new p(f56092i, f56093j, this.f56097e);
        do {
            atomicReference = this.f56098f;
            pVar = f56096m;
            if (atomicReference.compareAndSet(pVar, pVar2)) {
                return;
            }
        } while (atomicReference.get() == pVar);
        pVar2.a();
    }

    public s(ThreadFactory threadFactory) {
        this.f56097e = threadFactory;
        this.f56098f = new AtomicReference(f56096m);
        start();
    }
}
