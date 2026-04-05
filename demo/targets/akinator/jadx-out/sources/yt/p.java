package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96087b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f96088c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f96089e = new AtomicInteger();

    public p(tw.c cVar, int i10) {
        this.f96087b = cVar;
        this.f96088c = new q[i10];
    }

    @Override // tw.d
    public void cancel() {
        AtomicInteger atomicInteger = this.f96089e;
        if (atomicInteger.get() != -1) {
            atomicInteger.lazySet(-1);
            for (q qVar : this.f96088c) {
                qVar.cancel();
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            int i10 = this.f96089e.get();
            q[] qVarArr = this.f96088c;
            if (i10 > 0) {
                qVarArr[i10 - 1].request(j10);
                return;
            }
            if (i10 == 0) {
                for (q qVar : qVarArr) {
                    qVar.request(j10);
                }
            }
        }
    }

    public void subscribe(tw.b[] bVarArr) {
        tw.c cVar;
        q[] qVarArr = this.f96088c;
        int length = qVarArr.length;
        int i10 = 0;
        while (true) {
            cVar = this.f96087b;
            if (i10 >= length) {
                break;
            }
            int i11 = i10 + 1;
            qVarArr[i10] = new q(this, i11, cVar);
            i10 = i11;
        }
        AtomicInteger atomicInteger = this.f96089e;
        atomicInteger.lazySet(0);
        cVar.onSubscribe(this);
        for (int i12 = 0; i12 < length && atomicInteger.get() == 0; i12++) {
            bVarArr[i12].subscribe(qVarArr[i12]);
        }
    }

    public boolean win(int i10) {
        AtomicInteger atomicInteger = this.f96089e;
        int i11 = 0;
        if (atomicInteger.get() != 0 || !atomicInteger.compareAndSet(0, i10)) {
            return false;
        }
        q[] qVarArr = this.f96088c;
        int length = qVarArr.length;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (i12 != i10) {
                qVarArr[i11].cancel();
            }
            i11 = i12;
        }
        return true;
    }
}
