package yt;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b1 extends hu.f implements mt.q {

    /* renamed from: k, reason: collision with root package name */
    public final tw.c f95188k;

    /* renamed from: l, reason: collision with root package name */
    public final tw.b[] f95189l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f95190m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f95191n;

    /* renamed from: o, reason: collision with root package name */
    public int f95192o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f95193p;

    /* renamed from: q, reason: collision with root package name */
    public long f95194q;

    public b1(tw.b[] bVarArr, boolean z10, tw.c cVar) {
        super(false);
        this.f95188k = cVar;
        this.f95189l = bVarArr;
        this.f95190m = z10;
        this.f95191n = new AtomicInteger();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        AtomicInteger atomicInteger = this.f95191n;
        if (atomicInteger.getAndIncrement() != 0) {
            return;
        }
        tw.b[] bVarArr = this.f95189l;
        int length = bVarArr.length;
        int i10 = this.f95192o;
        while (true) {
            tw.c cVar = this.f95188k;
            if (i10 == length) {
                ArrayList arrayList = this.f95193p;
                if (arrayList == null) {
                    cVar.onComplete();
                    return;
                } else if (arrayList.size() == 1) {
                    cVar.onError((Throwable) arrayList.get(0));
                    return;
                } else {
                    cVar.onError(new qt.c(arrayList));
                    return;
                }
            }
            tw.b bVar = bVarArr[i10];
            if (bVar == null) {
                NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                if (!this.f95190m) {
                    cVar.onError(nullPointerException);
                    return;
                }
                ArrayList arrayList2 = this.f95193p;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList((length - i10) + 1);
                    this.f95193p = arrayList2;
                }
                arrayList2.add(nullPointerException);
                i10++;
            } else {
                long j10 = this.f95194q;
                if (j10 != 0) {
                    this.f95194q = 0L;
                    produced(j10);
                }
                bVar.subscribe(this);
                i10++;
                this.f95192o = i10;
                if (atomicInteger.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f95190m) {
            this.f95188k.onError(th2);
            return;
        }
        ArrayList arrayList = this.f95193p;
        if (arrayList == null) {
            arrayList = new ArrayList((this.f95189l.length - this.f95192o) + 1);
            this.f95193p = arrayList;
        }
        arrayList.add(th2);
        onComplete();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95194q++;
        this.f95188k.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        setSubscription(dVar);
    }
}
