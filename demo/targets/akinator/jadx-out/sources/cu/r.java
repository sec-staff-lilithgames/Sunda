package cu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends AtomicInteger implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c[] f51053b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLongArray f51054c;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f51055e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51056f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51057g;

    /* renamed from: h, reason: collision with root package name */
    public tw.d f51058h;

    /* renamed from: i, reason: collision with root package name */
    public vt.o f51059i;

    /* renamed from: j, reason: collision with root package name */
    public Throwable f51060j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f51061k;

    /* renamed from: l, reason: collision with root package name */
    public int f51062l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f51063m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f51064n = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f51065o;

    /* renamed from: p, reason: collision with root package name */
    public int f51066p;

    public r(tw.c[] cVarArr, int i10) {
        this.f51053b = cVarArr;
        this.f51056f = i10;
        this.f51057g = i10 - (i10 >> 2);
        int length = cVarArr.length;
        int i11 = length + length;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i11 + 1);
        this.f51054c = atomicLongArray;
        atomicLongArray.lazySet(i11, length);
        this.f51055e = new long[length];
    }

    public final void a() {
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        long j10 = 1;
        long j11 = 0;
        int i10 = 0;
        if (this.f51066p == 1) {
            vt.o oVar = this.f51059i;
            tw.c[] cVarArr = this.f51053b;
            AtomicLongArray atomicLongArray = this.f51054c;
            long[] jArr = this.f51055e;
            int length = jArr.length;
            int i11 = this.f51062l;
            int iAddAndGet = 1;
            while (true) {
                int i12 = 0;
                while (!this.f51063m) {
                    if (oVar.isEmpty()) {
                        int length2 = cVarArr.length;
                        while (i10 < length2) {
                            cVarArr[i10].onComplete();
                            i10++;
                        }
                        return;
                    }
                    long j12 = atomicLongArray.get(i11);
                    long j13 = jArr[i11];
                    if (j12 == j13 || atomicLongArray.get(length + i11) != 0) {
                        i12++;
                    } else {
                        try {
                            Object objPoll = oVar.poll();
                            if (objPoll == null) {
                                int length3 = cVarArr.length;
                                while (i10 < length3) {
                                    cVarArr[i10].onComplete();
                                    i10++;
                                }
                                return;
                            }
                            cVarArr[i11].onNext(objPoll);
                            jArr[i11] = j13 + 1;
                            i12 = 0;
                        } catch (Throwable th3) {
                            qt.d.throwIfFatal(th3);
                            this.f51058h.cancel();
                            int length4 = cVarArr.length;
                            while (i10 < length4) {
                                cVarArr[i10].onError(th3);
                                i10++;
                            }
                            return;
                        }
                    }
                    i11++;
                    if (i11 == length) {
                        i11 = 0;
                    }
                    if (i12 == length) {
                        int i13 = get();
                        if (i13 == iAddAndGet) {
                            this.f51062l = i11;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i13;
                        }
                    }
                }
                oVar.clear();
                return;
            }
        }
        vt.o oVar2 = this.f51059i;
        tw.c[] cVarArr2 = this.f51053b;
        AtomicLongArray atomicLongArray2 = this.f51054c;
        long[] jArr2 = this.f51055e;
        int length5 = jArr2.length;
        int i14 = this.f51062l;
        int i15 = this.f51065o;
        int i16 = 1;
        while (true) {
            long j14 = j10;
            int i17 = 0;
            while (!this.f51063m) {
                boolean z10 = this.f51061k;
                if (z10 && (th2 = this.f51060j) != null) {
                    oVar2.clear();
                    int length6 = cVarArr2.length;
                    while (i10 < length6) {
                        cVarArr2[i10].onError(th2);
                        i10++;
                    }
                    return;
                }
                boolean zIsEmpty = oVar2.isEmpty();
                if (z10 && zIsEmpty) {
                    int length7 = cVarArr2.length;
                    while (i10 < length7) {
                        cVarArr2[i10].onComplete();
                        i10++;
                    }
                    return;
                }
                if (!zIsEmpty) {
                    long j15 = atomicLongArray2.get(i14);
                    long j16 = jArr2[i14];
                    if (j15 == j16 || atomicLongArray2.get(length5 + i14) != j11) {
                        i17++;
                    } else {
                        try {
                            Object objPoll2 = oVar2.poll();
                            if (objPoll2 != null) {
                                cVarArr2[i14].onNext(objPoll2);
                                jArr2[i14] = j16 + j14;
                                i15++;
                                if (i15 == this.f51057g) {
                                    this.f51058h.request(i15);
                                    i15 = 0;
                                }
                                i17 = 0;
                            }
                        } catch (Throwable th4) {
                            qt.d.throwIfFatal(th4);
                            this.f51058h.cancel();
                            int length8 = cVarArr2.length;
                            while (i10 < length8) {
                                cVarArr2[i10].onError(th4);
                                i10++;
                            }
                            return;
                        }
                    }
                    i14++;
                    if (i14 == length5) {
                        i14 = 0;
                    }
                    if (i17 != length5) {
                        j11 = 0;
                    }
                }
                int iAddAndGet2 = get();
                if (iAddAndGet2 == i16) {
                    this.f51062l = i14;
                    this.f51065o = i15;
                    iAddAndGet2 = addAndGet(-i16);
                    if (iAddAndGet2 == 0) {
                        return;
                    }
                }
                i16 = iAddAndGet2;
                j10 = j14;
                j11 = 0;
            }
            oVar2.clear();
            return;
        }
    }

    public final void b() {
        tw.c[] cVarArr = this.f51053b;
        int length = cVarArr.length;
        int i10 = 0;
        while (i10 < length && !this.f51063m) {
            int i11 = i10 + 1;
            this.f51064n.lazySet(i11);
            cVarArr[i10].onSubscribe(new q(this, i10, length));
            i10 = i11;
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f51061k = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f51060j = th2;
        this.f51061k = true;
        a();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f51066p != 0 || this.f51059i.offer(obj)) {
            a();
        } else {
            this.f51058h.cancel();
            onError(new qt.e("Queue is full?"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f51058h, dVar)) {
            this.f51058h = dVar;
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f51066p = iRequestFusion;
                    this.f51059i = lVar;
                    this.f51061k = true;
                    b();
                    a();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f51066p = iRequestFusion;
                    this.f51059i = lVar;
                    b();
                    dVar.request(this.f51056f);
                    return;
                }
            }
            this.f51059i = new eu.c(this.f51056f);
            b();
            dVar.request(this.f51056f);
        }
    }
}
