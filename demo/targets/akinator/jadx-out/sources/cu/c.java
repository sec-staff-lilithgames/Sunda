package cu;

import yt.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f50952a;

    /* renamed from: b, reason: collision with root package name */
    public final st.o f50953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50954c;

    /* renamed from: d, reason: collision with root package name */
    public final iu.k f50955d;

    public c(lu.b bVar, st.o oVar, int i10, iu.k kVar) {
        this.f50952a = bVar;
        this.f50953b = (st.o) ut.o0.requireNonNull(oVar, "mapper");
        this.f50954c = i10;
        this.f50955d = (iu.k) ut.o0.requireNonNull(kVar, "errorMode");
    }

    @Override // lu.b
    public int parallelism() {
        return this.f50952a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                cVarArr2[i10] = j1.subscribe(cVarArr[i10], this.f50953b, this.f50954c, this.f50955d);
            }
            this.f50952a.subscribe(cVarArr2);
        }
    }
}
