package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f50978a;

    /* renamed from: b, reason: collision with root package name */
    public final st.g f50979b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f50980c;

    public f(lu.b bVar, st.g gVar, st.c cVar) {
        this.f50978a = bVar;
        this.f50979b = gVar;
        this.f50980c = cVar;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f50978a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                tw.c cVar = cVarArr[i10];
                boolean z10 = cVar instanceof vt.a;
                st.c cVar2 = this.f50980c;
                st.g gVar = this.f50979b;
                if (z10) {
                    cVarArr2[i10] = new d((vt.a) cVar, gVar, cVar2);
                } else {
                    cVarArr2[i10] = new e(cVar, gVar, cVar2);
                }
            }
            this.f50978a.subscribe(cVarArr2);
        }
    }
}
