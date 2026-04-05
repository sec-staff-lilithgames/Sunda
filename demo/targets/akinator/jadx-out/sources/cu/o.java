package cu;

import yt.c4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f51039a;

    /* renamed from: b, reason: collision with root package name */
    public final st.o f51040b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f51041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51042d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51043e;

    public o(lu.b bVar, st.o oVar, boolean z10, int i10, int i11) {
        this.f51039a = bVar;
        this.f51040b = oVar;
        this.f51041c = z10;
        this.f51042d = i10;
        this.f51043e = i11;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f51039a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                cVarArr2[i10] = c4.subscribe(cVarArr[i10], this.f51040b, this.f51041c, this.f51042d, this.f51043e);
            }
            this.f51039a.subscribe(cVarArr2);
        }
    }
}
