package zt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r2 extends hu.a implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f98749b;

    /* renamed from: f, reason: collision with root package name */
    public final Object f98752f;

    /* renamed from: h, reason: collision with root package name */
    public final int f98754h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f98755i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f98756j;

    /* renamed from: k, reason: collision with root package name */
    public long f98757k;

    /* renamed from: c, reason: collision with root package name */
    public final pt.b f98750c = new pt.b();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f98751e = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final iu.d f98753g = new iu.d();

    public r2(tw.c cVar, int i10, t2 t2Var) {
        this.f98749b = cVar;
        this.f98754h = i10;
        this.f98752f = t2Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, zt.t2] */
    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        if (this.f98755i) {
            return;
        }
        this.f98755i = true;
        this.f98750c.dispose();
        if (getAndIncrement() == 0) {
            this.f98752f.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zt.t2] */
    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f98752f.clear();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zt.t2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, zt.t2] */
    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        if (this.f98756j) {
            tw.c cVar = this.f98749b;
            ?? r22 = this.f98752f;
            int iAddAndGet2 = 1;
            while (!this.f98755i) {
                Throwable th2 = (Throwable) this.f98753g.get();
                if (th2 != null) {
                    r22.clear();
                    cVar.onError(th2);
                    return;
                }
                boolean z10 = r22.producerIndex() == this.f98754h;
                if (!r22.isEmpty()) {
                    cVar.onNext(null);
                }
                if (z10) {
                    cVar.onComplete();
                    return;
                } else {
                    iAddAndGet2 = addAndGet(-iAddAndGet2);
                    if (iAddAndGet2 == 0) {
                        return;
                    }
                }
            }
            r22.clear();
            return;
        }
        iu.u uVar = iu.u.f68424b;
        tw.c cVar2 = this.f98749b;
        ?? r32 = this.f98752f;
        long j10 = this.f98757k;
        do {
            long j11 = this.f98751e.get();
            while (j10 != j11) {
                if (this.f98755i) {
                    r32.clear();
                    return;
                }
                if (((Throwable) this.f98753g.get()) != null) {
                    r32.clear();
                    cVar2.onError(this.f98753g.terminate());
                    return;
                } else {
                    if (r32.consumerIndex() == this.f98754h) {
                        cVar2.onComplete();
                        return;
                    }
                    Object objPoll = r32.poll();
                    if (objPoll == null) {
                        break;
                    } else if (objPoll != uVar) {
                        cVar2.onNext(objPoll);
                        j10++;
                    }
                }
            }
            if (j10 == j11) {
                if (((Throwable) this.f98753g.get()) != null) {
                    r32.clear();
                    cVar2.onError(this.f98753g.terminate());
                    return;
                } else {
                    while (r32.peek() == uVar) {
                        r32.drop();
                    }
                    if (r32.consumerIndex() == this.f98754h) {
                        cVar2.onComplete();
                        return;
                    }
                }
            }
            this.f98757k = j10;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zt.t2] */
    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f98752f.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zt.t2] */
    @Override // mt.v
    public void onComplete() {
        this.f98752f.offer(iu.u.f68424b);
        drain();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zt.t2] */
    @Override // mt.v
    public void onError(Throwable th2) {
        if (!this.f98753g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        this.f98750c.dispose();
        this.f98752f.offer(iu.u.f68424b);
        drain();
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        this.f98750c.add(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zt.t2] */
    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98752f.offer(obj);
        drain();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zt.t2] */
    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll;
        do {
            objPoll = this.f98752f.poll();
        } while (objPoll == iu.u.f68424b);
        return objPoll;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f98751e, j10);
            drain();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f98756j = true;
        return 2;
    }
}
