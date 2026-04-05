package wt;

import iu.z;
import java.util.concurrent.atomic.AtomicInteger;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class u extends jh.i implements i0, iu.v {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f91284c = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final i0 f91285e;

    /* renamed from: f, reason: collision with root package name */
    public final vt.n f91286f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f91287g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f91288h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f91289i;

    public u(i0 i0Var, vt.n nVar) {
        this.f91285e = i0Var;
        this.f91286f = nVar;
    }

    public final void S(Object obj, pt.c cVar) {
        AtomicInteger atomicInteger = this.f91284c;
        int i10 = atomicInteger.get();
        i0 i0Var = this.f91285e;
        vt.n nVar = this.f91286f;
        if (i10 == 0 && atomicInteger.compareAndSet(0, 1)) {
            accept(i0Var, obj);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(obj);
            if (!enter()) {
                return;
            }
        }
        z.drainLoop(nVar, i0Var, false, cVar, this);
    }

    public final void T(Object obj, pt.c cVar) {
        AtomicInteger atomicInteger = this.f91284c;
        int i10 = atomicInteger.get();
        i0 i0Var = this.f91285e;
        vt.n nVar = this.f91286f;
        if (i10 != 0 || !atomicInteger.compareAndSet(0, 1)) {
            nVar.offer(obj);
            if (!enter()) {
                return;
            }
        } else if (nVar.isEmpty()) {
            accept(i0Var, obj);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(obj);
        }
        z.drainLoop(nVar, i0Var, false, cVar, this);
    }

    @Override // iu.v
    public final boolean cancelled() {
        return this.f91287g;
    }

    @Override // iu.v
    public final boolean done() {
        return this.f91288h;
    }

    @Override // iu.v
    public final boolean enter() {
        return this.f91284c.getAndIncrement() == 0;
    }

    @Override // iu.v
    public final Throwable error() {
        return this.f91289i;
    }

    public final boolean fastEnter() {
        AtomicInteger atomicInteger = this.f91284c;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    @Override // iu.v
    public final int leave(int i10) {
        return this.f91284c.addAndGet(i10);
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th2);

    public abstract /* synthetic */ void onNext(Object obj);

    public abstract /* synthetic */ void onSubscribe(pt.c cVar);

    public void accept(i0 i0Var, Object obj) {
    }
}
