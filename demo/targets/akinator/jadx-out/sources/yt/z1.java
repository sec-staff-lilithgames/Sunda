package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z1 extends y1 {

    /* renamed from: e, reason: collision with root package name */
    public final eu.d f96635e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f96636f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f96637g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f96638h;

    public z1(tw.c cVar, int i10) {
        super(cVar);
        this.f96635e = new eu.d(i10);
        this.f96638h = new AtomicInteger();
    }

    @Override // yt.y1
    public final void c() {
        e();
    }

    @Override // yt.y1
    public final void d() {
        if (this.f96638h.getAndIncrement() == 0) {
            this.f96635e.clear();
        }
    }

    public final void e() {
        if (this.f96638h.getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f96591b;
        eu.d dVar = this.f96635e;
        int iAddAndGet = 1;
        do {
            long j10 = get();
            long j11 = 0;
            while (j11 != j10) {
                if (isCancelled()) {
                    dVar.clear();
                    return;
                }
                boolean z10 = this.f96637g;
                Object objPoll = dVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable th2 = this.f96636f;
                    if (th2 != null) {
                        b(th2);
                        return;
                    } else {
                        a();
                        return;
                    }
                }
                if (z11) {
                    break;
                }
                cVar.onNext(objPoll);
                j11++;
            }
            if (j11 == j10) {
                if (isCancelled()) {
                    dVar.clear();
                    return;
                }
                boolean z12 = this.f96637g;
                boolean zIsEmpty = dVar.isEmpty();
                if (z12 && zIsEmpty) {
                    Throwable th3 = this.f96636f;
                    if (th3 != null) {
                        b(th3);
                        return;
                    } else {
                        a();
                        return;
                    }
                }
            }
            if (j11 != 0) {
                iu.e.produced(this, j11);
            }
            iAddAndGet = this.f96638h.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // yt.y1, mt.n, mt.k
    public void onComplete() {
        this.f96637g = true;
        e();
    }

    @Override // yt.y1, mt.n, mt.k
    public void onNext(Object obj) {
        if (this.f96637g || isCancelled()) {
            return;
        }
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f96635e.offer(obj);
            e();
        }
    }

    @Override // yt.y1, mt.n
    public boolean tryOnError(Throwable th2) {
        if (this.f96637g || isCancelled()) {
            return false;
        }
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.f96636f = th2;
        this.f96637g = true;
        e();
        return true;
    }
}
