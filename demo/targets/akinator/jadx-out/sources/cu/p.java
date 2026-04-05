package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final tw.b[] f51045a;

    public p(tw.b[] bVarArr) {
        this.f51045a = bVarArr;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f51045a.length;
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f51045a[i10].subscribe(cVarArr[i10]);
            }
        }
    }
}
