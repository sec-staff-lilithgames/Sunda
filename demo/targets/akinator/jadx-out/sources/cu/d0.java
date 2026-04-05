package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f50966a;

    /* renamed from: b, reason: collision with root package name */
    public final st.o f50967b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f50968c;

    public d0(lu.b bVar, st.o oVar, st.c cVar) {
        this.f50966a = bVar;
        this.f50967b = oVar;
        this.f50968c = cVar;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f50966a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                tw.c cVar = cVarArr[i10];
                boolean z10 = cVar instanceof vt.a;
                st.c cVar2 = this.f50968c;
                st.o oVar = this.f50967b;
                if (z10) {
                    cVarArr2[i10] = new b0((vt.a) cVar, oVar, cVar2);
                } else {
                    cVarArr2[i10] = new c0(cVar, oVar, cVar2);
                }
            }
            this.f50966a.subscribe(cVarArr2);
        }
    }
}
