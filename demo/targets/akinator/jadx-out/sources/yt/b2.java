package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b2 extends y1 {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95195e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f95196f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95197g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f95198h;

    public b2(tw.c cVar) {
        super(cVar);
        this.f95195e = new AtomicReference();
        this.f95198h = new AtomicInteger();
    }

    @Override // yt.y1
    public final void c() {
        e();
    }

    @Override // yt.y1
    public final void d() {
        if (this.f95198h.getAndIncrement() == 0) {
            this.f95195e.lazySet(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r9 != r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (isCancelled() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r2.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        r5 = r17.f95197g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r2.get() != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (r5 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r12 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
    
        r1 = r17.f95196f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
    
        if (r9 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
    
        iu.e.produced(r17, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007c, code lost:
    
        r4 = r17.f95198h.addAndGet(-r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f95198h
            int r1 = r1.getAndIncrement()
            if (r1 == 0) goto Lc
            goto L85
        Lc:
            tw.c r1 = r0.f96591b
            java.util.concurrent.atomic.AtomicReference r2 = r0.f95195e
            r3 = 1
            r4 = r3
        L12:
            long r5 = r0.get()
            r7 = 0
            r9 = r7
        L19:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            r12 = 0
            r13 = 0
            if (r11 == 0) goto L50
            boolean r14 = r0.isCancelled()
            if (r14 == 0) goto L29
            r2.lazySet(r13)
            return
        L29:
            boolean r14 = r0.f95197g
            java.lang.Object r15 = r2.getAndSet(r13)
            if (r15 != 0) goto L34
            r16 = r3
            goto L36
        L34:
            r16 = r12
        L36:
            if (r14 == 0) goto L46
            if (r16 == 0) goto L46
            java.lang.Throwable r1 = r0.f95196f
            if (r1 == 0) goto L42
            r0.b(r1)
            return
        L42:
            r0.a()
            return
        L46:
            if (r16 == 0) goto L49
            goto L50
        L49:
            r1.onNext(r15)
            r11 = 1
            long r9 = r9 + r11
            goto L19
        L50:
            if (r11 != 0) goto L75
            boolean r5 = r0.isCancelled()
            if (r5 == 0) goto L5c
            r2.lazySet(r13)
            return
        L5c:
            boolean r5 = r0.f95197g
            java.lang.Object r6 = r2.get()
            if (r6 != 0) goto L65
            r12 = r3
        L65:
            if (r5 == 0) goto L75
            if (r12 == 0) goto L75
            java.lang.Throwable r1 = r0.f95196f
            if (r1 == 0) goto L71
            r0.b(r1)
            return
        L71:
            r0.a()
            return
        L75:
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L7c
            iu.e.produced(r0, r9)
        L7c:
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f95198h
            int r4 = -r4
            int r4 = r5.addAndGet(r4)
            if (r4 != 0) goto L12
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.b2.e():void");
    }

    @Override // yt.y1, mt.n, mt.k
    public void onComplete() {
        this.f95197g = true;
        e();
    }

    @Override // yt.y1, mt.n, mt.k
    public void onNext(Object obj) {
        if (this.f95197g || isCancelled()) {
            return;
        }
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f95195e.set(obj);
            e();
        }
    }

    @Override // yt.y1, mt.n
    public boolean tryOnError(Throwable th2) {
        if (this.f95197g || isCancelled()) {
            return false;
        }
        if (th2 == null) {
            onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
        this.f95196f = th2;
        this.f95197g = true;
        e();
        return true;
    }
}
