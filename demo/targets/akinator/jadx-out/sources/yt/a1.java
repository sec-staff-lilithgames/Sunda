package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b[] f95130c;

    /* renamed from: e, reason: collision with root package name */
    public final Iterable f95131e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f95132f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95133g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f95134h;

    public a1(tw.b[] bVarArr, st.o oVar, int i10, boolean z10) {
        this.f95130c = bVarArr;
        this.f95131e = null;
        this.f95132f = oVar;
        this.f95133g = i10;
        this.f95134h = z10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        int length;
        tw.b[] bVarArr = this.f95130c;
        if (bVarArr == null) {
            bVarArr = new tw.b[8];
            try {
                Iterator it = (Iterator) ut.o0.requireNonNull(this.f95131e.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            tw.b bVar = (tw.b) ut.o0.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == bVarArr.length) {
                                tw.b[] bVarArr2 = new tw.b[(length >> 2) + length];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                                bVarArr = bVarArr2;
                            }
                            bVarArr[length] = bVar;
                            length++;
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            hu.d.error(th2, cVar);
                            return;
                        }
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        hu.d.error(th3, cVar);
                        return;
                    }
                }
            } catch (Throwable th4) {
                qt.d.throwIfFatal(th4);
                hu.d.error(th4, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            hu.d.complete(cVar);
            return;
        }
        if (i10 == 1) {
            bVarArr[0].subscribe(new a7(cVar, new z0(this)));
            return;
        }
        x0 x0Var = new x0(cVar, this.f95132f, this.f95134h, i10, this.f95133g);
        cVar.onSubscribe(x0Var);
        y0[] y0VarArr = x0Var.f96529e;
        for (int i11 = 0; i11 < i10 && !x0Var.f96538n && !x0Var.f96536l; i11++) {
            bVarArr[i11].subscribe(y0VarArr[i11]);
        }
    }

    public a1(Iterable<? extends tw.b> iterable, st.o oVar, int i10, boolean z10) {
        this.f95130c = null;
        this.f95131e = iterable;
        this.f95132f = oVar;
        this.f95133g = i10;
        this.f95134h = z10;
    }
}
