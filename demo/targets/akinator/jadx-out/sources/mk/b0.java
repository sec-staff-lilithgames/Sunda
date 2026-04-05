package mk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b0 implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    public char[] f74750b;

    /* renamed from: c, reason: collision with root package name */
    public String f74751c;

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f74750b[i10];
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f74750b.length;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return new String(this.f74750b, i10, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        if (this.f74751c == null) {
            this.f74751c = new String(this.f74750b);
        }
        return this.f74751c;
    }
}
