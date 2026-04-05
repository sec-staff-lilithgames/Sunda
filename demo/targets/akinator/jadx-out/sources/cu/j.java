package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f51005a;

    /* renamed from: b, reason: collision with root package name */
    public final st.q f51006b;

    public j(lu.b bVar, st.q qVar) {
        this.f51005a = bVar;
        this.f51006b = qVar;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f51005a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                tw.c cVar = cVarArr[i10];
                boolean z10 = cVar instanceof vt.a;
                st.q qVar = this.f51006b;
                if (z10) {
                    cVarArr2[i10] = new h((vt.a) cVar, qVar);
                } else {
                    cVarArr2[i10] = new i(cVar, qVar);
                }
            }
            this.f51005a.subscribe(cVarArr2);
        }
    }
}
