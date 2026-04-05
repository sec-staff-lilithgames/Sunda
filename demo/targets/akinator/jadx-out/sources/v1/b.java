package v1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f88848a;

    public b(int i10, int i11) {
        e[] eVarArr = new e[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            eVarArr[i12] = new e(i11);
        }
        this.f88848a = eVarArr;
    }

    public final float get(int i10, int i11) {
        return this.f88848a[i10].get(i11);
    }

    public final e getRow(int i10) {
        return this.f88848a[i10];
    }

    public final void set(int i10, int i11, float f10) {
        this.f88848a[i10].set(i11, f10);
    }
}
