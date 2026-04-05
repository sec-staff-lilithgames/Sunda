package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class hf extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b[] f95628c;

    /* renamed from: e, reason: collision with root package name */
    public final Iterable f95629e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f95630f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95631g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f95632h;

    public hf(tw.b[] bVarArr, Iterable<? extends tw.b> iterable, st.o oVar, int i10, boolean z10) {
        this.f95628c = bVarArr;
        this.f95629e = iterable;
        this.f95630f = oVar;
        this.f95631g = i10;
        this.f95632h = z10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        int length;
        tw.b[] bVarArr = this.f95628c;
        if (bVarArr == null) {
            bVarArr = new tw.b[8];
            length = 0;
            for (tw.b bVar : this.f95629e) {
                if (length == bVarArr.length) {
                    tw.b[] bVarArr2 = new tw.b[(length >> 2) + length];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr = bVarArr2;
                }
                bVarArr[length] = bVar;
                length++;
            }
        } else {
            length = bVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            hu.d.complete(cVar);
            return;
        }
        ff ffVar = new ff(cVar, this.f95630f, this.f95632h, i10, this.f95631g);
        cVar.onSubscribe(ffVar);
        gf[] gfVarArr = ffVar.f95497c;
        for (int i11 = 0; i11 < i10 && !ffVar.f95502i; i11++) {
            if (!ffVar.f95501h && ffVar.f95500g.get() != null) {
                return;
            }
            bVarArr[i11].subscribe(gfVarArr[i11]);
        }
    }
}
