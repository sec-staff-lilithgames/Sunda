package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ic extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: n, reason: collision with root package name */
    public static final hc f95695n;

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95696b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95697c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95698e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95699f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95700g;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f95702i;

    /* renamed from: j, reason: collision with root package name */
    public tw.d f95703j;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f95706m;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f95704k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicLong f95705l = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f95701h = new iu.d();

    static {
        hc hcVar = new hc(null, -1L, 1);
        f95695n = hcVar;
        hcVar.cancel();
    }

    public ic(int i10, st.o oVar, tw.c cVar, boolean z10) {
        this.f95696b = cVar;
        this.f95697c = oVar;
        this.f95698e = i10;
        this.f95699f = z10;
    }

    public final void a() {
        hc hcVar;
        AtomicReference atomicReference = this.f95704k;
        hc hcVar2 = (hc) atomicReference.get();
        hc hcVar3 = f95695n;
        if (hcVar2 == hcVar3 || (hcVar = (hc) atomicReference.getAndSet(hcVar3)) == hcVar3 || hcVar == null) {
            return;
        }
        hcVar.cancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0146, code lost:
    
        if (r12 == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x014a, code lost:
    
        if (r17.f95702i != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0153, code lost:
    
        if (r8 == Long.MAX_VALUE) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0155, code lost:
    
        r17.f95705l.addAndGet(-r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015b, code lost:
    
        r5.request(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015e, code lost:
    
        if (r14 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x000d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.ic.b():void");
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95702i) {
            return;
        }
        this.f95702i = true;
        this.f95703j.cancel();
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95700g) {
            return;
        }
        this.f95700g = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95700g || !this.f95701h.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f95699f) {
            a();
        }
        this.f95700g = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95700g) {
            return;
        }
        long j10 = this.f95706m + 1;
        this.f95706m = j10;
        hc hcVar = (hc) this.f95704k.get();
        if (hcVar != null) {
            hcVar.cancel();
        }
        try {
            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95697c.apply(obj), "The publisher returned is null");
            hc hcVar2 = new hc(this, j10, this.f95698e);
            while (true) {
                hc hcVar3 = (hc) this.f95704k.get();
                if (hcVar3 == f95695n) {
                    return;
                }
                AtomicReference atomicReference = this.f95704k;
                while (!atomicReference.compareAndSet(hcVar3, hcVar2)) {
                    if (atomicReference.get() != hcVar3) {
                        break;
                    }
                }
                bVar.subscribe(hcVar2);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95703j.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95703j, dVar)) {
            this.f95703j = dVar;
            this.f95696b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95705l, j10);
            if (this.f95706m == 0) {
                this.f95703j.request(Long.MAX_VALUE);
            } else {
                b();
            }
        }
    }
}
