package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d8 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95350b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f95351c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f95352e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f95353f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95354g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f95355h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f95356i = new AtomicReference();

    public d8(tw.c cVar) {
        this.f95350b = cVar;
    }

    public final boolean a(boolean z10, boolean z11, tw.c cVar, AtomicReference atomicReference) {
        if (this.f95354g) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z10) {
            return false;
        }
        Throwable th2 = this.f95353f;
        if (th2 != null) {
            atomicReference.lazySet(null);
            cVar.onError(th2);
            return true;
        }
        if (!z11) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 != r1.get()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r9 = r13.f95352e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.get() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (a(r9, r10, r0, r2) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        iu.e.produced(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = addAndGet(-r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 == 0) goto L7
            goto L5e
        L7:
            tw.c r0 = r13.f95350b
            java.util.concurrent.atomic.AtomicLong r1 = r13.f95355h
            java.util.concurrent.atomic.AtomicReference r2 = r13.f95356i
            r3 = 1
            r4 = r3
        Lf:
            r5 = 0
            r7 = r5
        L12:
            long r9 = r1.get()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L38
            boolean r9 = r13.f95352e
            r11 = 0
            java.lang.Object r11 = r2.getAndSet(r11)
            if (r11 != 0) goto L26
            r12 = r3
            goto L27
        L26:
            r12 = r10
        L27:
            boolean r9 = r13.a(r9, r12, r0, r2)
            if (r9 == 0) goto L2e
            goto L5e
        L2e:
            if (r12 == 0) goto L31
            goto L38
        L31:
            r0.onNext(r11)
            r9 = 1
            long r7 = r7 + r9
            goto L12
        L38:
            long r11 = r1.get()
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
            boolean r9 = r13.f95352e
            java.lang.Object r11 = r2.get()
            if (r11 != 0) goto L49
            r10 = r3
        L49:
            boolean r9 = r13.a(r9, r10, r0, r2)
            if (r9 == 0) goto L50
            goto L5e
        L50:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L57
            iu.e.produced(r1, r7)
        L57:
            int r4 = -r4
            int r4 = r13.addAndGet(r4)
            if (r4 != 0) goto Lf
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.d8.b():void");
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95354g) {
            return;
        }
        this.f95354g = true;
        this.f95351c.cancel();
        if (getAndIncrement() == 0) {
            this.f95356i.lazySet(null);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95352e = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95353f = th2;
        this.f95352e = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95356i.lazySet(obj);
        b();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95351c, dVar)) {
            this.f95351c = dVar;
            this.f95350b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95355h, j10);
            b();
        }
    }
}
