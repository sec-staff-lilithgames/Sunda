package gu;

import iu.y;
import iu.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class n extends jh.i implements mt.q, y {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f58452c = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f58453e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final tw.c f58454f;

    /* renamed from: g, reason: collision with root package name */
    public final vt.n f58455g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f58456h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f58457i;

    /* renamed from: j, reason: collision with root package name */
    public Throwable f58458j;

    public n(tw.c cVar, vt.n nVar) {
        this.f58454f = cVar;
        this.f58455g = nVar;
    }

    public final void S(Object obj, pt.c cVar) {
        boolean zFastEnter = fastEnter();
        tw.c cVar2 = this.f58454f;
        vt.n nVar = this.f58455g;
        if (zFastEnter) {
            long j10 = this.f58453e.get();
            if (j10 == 0) {
                cVar.dispose();
                cVar2.onError(new qt.e("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (accept(cVar2, obj) && j10 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            }
        } else {
            nVar.offer(obj);
            if (!enter()) {
                return;
            }
        }
        z.drainMaxLoop(nVar, cVar2, false, cVar, this);
    }

    public final void T(Object obj, pt.c cVar) {
        tw.c cVar2 = this.f58454f;
        vt.n nVar = this.f58455g;
        if (fastEnter()) {
            long j10 = this.f58453e.get();
            if (j10 == 0) {
                this.f58456h = true;
                cVar.dispose();
                cVar2.onError(new qt.e("Could not emit buffer due to lack of requests"));
                return;
            } else if (nVar.isEmpty()) {
                if (accept(cVar2, obj) && j10 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                nVar.offer(obj);
            }
        } else {
            nVar.offer(obj);
            if (!enter()) {
                return;
            }
        }
        z.drainMaxLoop(nVar, cVar2, false, cVar, this);
    }

    @Override // iu.y
    public boolean accept(tw.c cVar, Object obj) {
        return false;
    }

    @Override // iu.y
    public final boolean cancelled() {
        return this.f58456h;
    }

    @Override // iu.y
    public final boolean done() {
        return this.f58457i;
    }

    @Override // iu.y
    public final boolean enter() {
        return this.f58452c.getAndIncrement() == 0;
    }

    @Override // iu.y
    public final Throwable error() {
        return this.f58458j;
    }

    public final boolean fastEnter() {
        AtomicInteger atomicInteger = this.f58452c;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    @Override // iu.y
    public final int leave(int i10) {
        return this.f58452c.addAndGet(i10);
    }

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onSubscribe(tw.d dVar);

    @Override // iu.y
    public final long produced(long j10) {
        return this.f58453e.addAndGet(-j10);
    }

    @Override // iu.y
    public final long requested() {
        return this.f58453e.get();
    }

    public final void requested(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f58453e, j10);
        }
    }
}
