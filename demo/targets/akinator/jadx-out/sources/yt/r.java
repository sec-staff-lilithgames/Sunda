package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b[] f96219c;

    /* renamed from: e, reason: collision with root package name */
    public final Iterable f96220e;

    public r(tw.b[] bVarArr, Iterable<? extends tw.b> iterable) {
        this.f96219c = bVarArr;
        this.f96220e = iterable;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        int length;
        tw.b[] bVarArr = this.f96219c;
        if (bVarArr == null) {
            bVarArr = new tw.b[8];
            try {
                length = 0;
                for (tw.b bVar : this.f96220e) {
                    if (bVar == null) {
                        hu.d.error(new NullPointerException("One of the sources is null"), cVar);
                        return;
                    }
                    if (length == bVarArr.length) {
                        tw.b[] bVarArr2 = new tw.b[(length >> 2) + length];
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                        bVarArr = bVarArr2;
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
        if (length == 0) {
            hu.d.complete(cVar);
        } else if (length == 1) {
            bVarArr[0].subscribe(cVar);
        } else {
            new p(cVar, length).subscribe(bVarArr);
        }
    }
}
