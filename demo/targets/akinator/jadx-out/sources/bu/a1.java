package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0[] f10057b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f10058c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10059e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10060f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10061g;

    public a1(mt.g0[] g0VarArr, Iterable<? extends mt.g0> iterable, st.o oVar, int i10, boolean z10) {
        this.f10057b = g0VarArr;
        this.f10058c = iterable;
        this.f10059e = oVar;
        this.f10060f = i10;
        this.f10061g = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        int length;
        mt.g0[] g0VarArr = this.f10057b;
        if (g0VarArr == null) {
            g0VarArr = new mt.g0[8];
            length = 0;
            for (mt.g0 g0Var : this.f10058c) {
                if (length == g0VarArr.length) {
                    mt.g0[] g0VarArr2 = new mt.g0[(length >> 2) + length];
                    System.arraycopy(g0VarArr, 0, g0VarArr2, 0, length);
                    g0VarArr = g0VarArr2;
                }
                g0VarArr[length] = g0Var;
                length++;
            }
        } else {
            length = g0VarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            tt.e.complete(i0Var);
            return;
        }
        new z0(i10, this.f10060f, i0Var, this.f10059e, this.f10061g).subscribe(g0VarArr);
    }
}
