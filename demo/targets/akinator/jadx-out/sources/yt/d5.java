package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d5 extends AtomicLong implements mt.k, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95339b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f95340c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f95341e;

    /* renamed from: f, reason: collision with root package name */
    public Object f95342f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95343g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f95344h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f95345i;

    public d5(tw.c cVar, st.c cVar2, st.g gVar, Object obj) {
        this.f95339b = cVar;
        this.f95340c = cVar2;
        this.f95341e = gVar;
        this.f95342f = obj;
    }

    public final void a(Object obj) {
        try {
            this.f95341e.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95343g) {
            return;
        }
        this.f95343g = true;
        if (iu.e.add(this, 1L) == 0) {
            Object obj = this.f95342f;
            this.f95342f = null;
            a(obj);
        }
    }

    @Override // mt.k
    public void onComplete() {
        if (this.f95344h) {
            return;
        }
        this.f95344h = true;
        this.f95339b.onComplete();
    }

    @Override // mt.k
    public void onError(Throwable th2) {
        if (this.f95344h) {
            mu.a.onError(th2);
            return;
        }
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.f95344h = true;
        this.f95339b.onError(th2);
    }

    @Override // mt.k
    public void onNext(Object obj) {
        if (this.f95344h) {
            return;
        }
        if (this.f95345i) {
            onError(new IllegalStateException("onNext already called in this generate turn"));
        } else if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f95345i = true;
            this.f95339b.onNext(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        r9.f95342f = r0;
        r10 = addAndGet(-r4);
     */
    @Override // tw.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void request(long r10) {
        /*
            r9 = this;
            boolean r0 = hu.g.validate(r10)
            if (r0 != 0) goto L7
            goto L60
        L7:
            long r0 = iu.e.add(r9, r10)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            goto L60
        L12:
            java.lang.Object r0 = r9.f95342f
            st.c r1 = r9.f95340c
        L16:
            r4 = r2
        L17:
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L4d
            boolean r6 = r9.f95343g
            r7 = 0
            if (r6 == 0) goto L26
            r9.f95342f = r7
            r9.a(r0)
            return
        L26:
            r6 = 0
            r9.f95345i = r6
            r6 = 1
            java.lang.Object r0 = r1.apply(r0, r9)     // Catch: java.lang.Throwable -> L3e
            boolean r8 = r9.f95344h
            if (r8 == 0) goto L3a
            r9.f95343g = r6
            r9.f95342f = r7
            r9.a(r0)
            return
        L3a:
            r6 = 1
            long r4 = r4 + r6
            goto L17
        L3e:
            r10 = move-exception
            qt.d.throwIfFatal(r10)
            r9.f95343g = r6
            r9.f95342f = r7
            r9.onError(r10)
            r9.a(r0)
            return
        L4d:
            long r10 = r9.get()
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 != 0) goto L17
            r9.f95342f = r0
            long r10 = -r4
            long r10 = r9.addAndGet(r10)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.d5.request(long):void");
    }
}
