package yt;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ef extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b[] f95455e;

    /* renamed from: f, reason: collision with root package name */
    public final Iterable f95456f;

    /* renamed from: g, reason: collision with root package name */
    public final st.o f95457g;

    public ef(mt.l lVar, tw.b[] bVarArr, st.o oVar) {
        super(lVar);
        this.f95455e = bVarArr;
        this.f95456f = null;
        this.f95457g = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        int length;
        tw.b[] bVarArr = this.f95455e;
        if (bVarArr == null) {
            bVarArr = new tw.b[8];
            try {
                length = 0;
                for (tw.b bVar : this.f95456f) {
                    if (length == bVarArr.length) {
                        bVarArr = (tw.b[]) Arrays.copyOf(bVarArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    bVarArr[length] = bVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                hu.d.error(th2, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        mt.l lVar = this.f95121c;
        if (length == 0) {
            new b7(lVar, new bf(this)).subscribeActual(cVar);
            return;
        }
        cf cfVar = new cf(cVar, this.f95457g, length);
        cVar.onSubscribe(cfVar);
        for (int i11 = 0; i11 < length && cfVar.f95303g.get() != hu.g.f59176b; i11++) {
            bVarArr[i11].subscribe(cfVar.f95301e[i11]);
        }
        lVar.subscribe((mt.q) cfVar);
    }

    public ef(mt.l lVar, Iterable<? extends tw.b> iterable, st.o oVar) {
        super(lVar);
        this.f95455e = null;
        this.f95456f = iterable;
        this.f95457g = oVar;
    }
}
