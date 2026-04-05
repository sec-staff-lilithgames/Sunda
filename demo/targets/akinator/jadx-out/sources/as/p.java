package as;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f7998a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7999b = new int[10];

    public int get(int i10) {
        return this.f7999b[i10];
    }

    public boolean isSet(int i10) {
        return ((1 << i10) & this.f7998a) != 0;
    }

    public p set(int i10, int i11, int i12) {
        int[] iArr = this.f7999b;
        if (i10 >= iArr.length) {
            return this;
        }
        this.f7998a = (1 << i10) | this.f7998a;
        iArr[i10] = i12;
        return this;
    }
}
