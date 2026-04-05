package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f51033a;

    /* renamed from: b, reason: collision with root package name */
    public final st.q f51034b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f51035c;

    public n(lu.b bVar, st.q qVar, st.c cVar) {
        this.f51033a = bVar;
        this.f51034b = qVar;
        this.f51035c = cVar;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f51033a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                tw.c cVar = cVarArr[i10];
                boolean z10 = cVar instanceof vt.a;
                st.c cVar2 = this.f51035c;
                st.q qVar = this.f51034b;
                if (z10) {
                    cVarArr2[i10] = new l((vt.a) cVar, qVar, cVar2);
                } else {
                    cVarArr2[i10] = new m(cVar, qVar, cVar2);
                }
            }
            this.f51033a.subscribe(cVarArr2);
        }
    }
}
