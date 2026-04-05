package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f50942a;

    /* renamed from: b, reason: collision with root package name */
    public final st.o f50943b;

    public a0(lu.b bVar, st.o oVar) {
        this.f50942a = bVar;
        this.f50943b = oVar;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f50942a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                tw.c cVar = cVarArr[i10];
                boolean z10 = cVar instanceof vt.a;
                st.o oVar = this.f50943b;
                if (z10) {
                    cVarArr2[i10] = new y((vt.a) cVar, oVar);
                } else {
                    cVarArr2[i10] = new z(cVar, oVar);
                }
            }
            this.f50942a.subscribe(cVarArr2);
        }
    }
}
