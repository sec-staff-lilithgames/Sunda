package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k4 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95799b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95800c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95801e;

    /* renamed from: j, reason: collision with root package name */
    public final st.o f95806j;

    /* renamed from: l, reason: collision with root package name */
    public tw.d f95808l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f95809m;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f95802f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f95803g = new pt.b();

    /* renamed from: i, reason: collision with root package name */
    public final iu.d f95805i = new iu.d();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f95804h = new AtomicInteger(1);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f95807k = new AtomicReference();

    public k4(int i10, st.o oVar, tw.c cVar, boolean z10) {
        this.f95799b = cVar;
        this.f95806j = oVar;
        this.f95800c = z10;
        this.f95801e = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r10 != r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r17.f95809m == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r17.f95800c != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (((java.lang.Throwable) r17.f95805i.get()) == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        r2 = r17.f95805i.terminate();
        clear();
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        if (r2.get() != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        r7 = (eu.d) r3.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        if (r7 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        if (r7.isEmpty() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        if (r6 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        r2 = r17.f95805i.terminate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00be, code lost:
    
        if (r2 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c0, code lost:
    
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c4, code lost:
    
        r1.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
    
        if (r10 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
    
        iu.e.produced(r17.f95802f, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
    
        if (r17.f95801e == Integer.MAX_VALUE) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
    
        r17.f95808l.request(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        r5 = addAndGet(-r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.k4.a():void");
    }

    public final eu.d b() {
        while (true) {
            AtomicReference atomicReference = this.f95807k;
            eu.d dVar = (eu.d) atomicReference.get();
            if (dVar != null) {
                return dVar;
            }
            eu.d dVar2 = new eu.d(mt.l.bufferSize());
            while (!atomicReference.compareAndSet(null, dVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return dVar2;
        }
    }

    @Override // tw.d
    public void cancel() {
        this.f95809m = true;
        this.f95808l.cancel();
        this.f95803g.dispose();
    }

    public final void clear() {
        eu.d dVar = (eu.d) this.f95807k.get();
        if (dVar != null) {
            dVar.clear();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95804h.decrementAndGet();
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95804h.decrementAndGet();
        if (!this.f95805i.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f95800c) {
            this.f95803g.dispose();
        }
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        try {
            mt.y yVar = (mt.y) ut.o0.requireNonNull(this.f95806j.apply(obj), "The mapper returned a null MaybeSource");
            this.f95804h.getAndIncrement();
            j4 j4Var = new j4(this);
            if (this.f95809m || !this.f95803g.add(j4Var)) {
                return;
            }
            yVar.subscribe(j4Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95808l.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95808l, dVar)) {
            this.f95808l = dVar;
            this.f95799b.onSubscribe(this);
            int i10 = this.f95801e;
            if (i10 == Integer.MAX_VALUE) {
                dVar.request(Long.MAX_VALUE);
            } else {
                dVar.request(i10);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95802f, j10);
            if (getAndIncrement() == 0) {
                a();
            }
        }
    }
}
