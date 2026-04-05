package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f73922a;

    /* renamed from: b, reason: collision with root package name */
    public char[] f73923b;

    /* renamed from: c, reason: collision with root package name */
    public int f73924c;

    /* renamed from: d, reason: collision with root package name */
    public int f73925d;

    public j(char[] initBuffer, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initBuffer, "initBuffer");
        this.f73922a = initBuffer.length;
        this.f73923b = initBuffer;
        this.f73924c = i10;
        this.f73925d = i11;
    }

    public final int a() {
        return this.f73925d - this.f73924c;
    }

    public final void append(StringBuilder builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        builder.append(this.f73923b, 0, this.f73924c);
        char[] cArr = this.f73923b;
        int i10 = this.f73925d;
        builder.append(cArr, i10, this.f73922a - i10);
    }

    public final char get(int i10) {
        int i11 = this.f73924c;
        return i10 < i11 ? this.f73923b[i10] : this.f73923b[(i10 - i11) + this.f73925d];
    }

    public final int length() {
        return this.f73922a - a();
    }

    public final void replace(int i10, int i11, String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        int length = text.length() - (i11 - i10);
        if (length > a()) {
            int iA = length - a();
            int i12 = this.f73922a;
            do {
                i12 *= 2;
            } while (i12 - this.f73922a < iA);
            char[] cArr = new char[i12];
            uu.f0.copyInto(this.f73923b, cArr, 0, 0, this.f73924c);
            int i13 = this.f73922a;
            int i14 = this.f73925d;
            int i15 = i13 - i14;
            int i16 = i12 - i15;
            uu.f0.copyInto(this.f73923b, cArr, i16, i14, i15 + i14);
            this.f73923b = cArr;
            this.f73922a = i12;
            this.f73925d = i16;
        }
        int i17 = this.f73924c;
        if (i10 < i17 && i11 <= i17) {
            int i18 = i17 - i11;
            char[] cArr2 = this.f73923b;
            uu.f0.copyInto(cArr2, cArr2, this.f73925d - i18, i11, i17);
            this.f73924c = i10;
            this.f73925d -= i18;
        } else if (i10 >= i17 || i11 < i17) {
            int iA2 = a() + i10;
            int iA3 = a() + i11;
            int i19 = this.f73925d;
            char[] cArr3 = this.f73923b;
            uu.f0.copyInto(cArr3, cArr3, this.f73924c, i19, iA2);
            this.f73924c += iA2 - i19;
            this.f73925d = iA3;
        } else {
            this.f73925d = a() + i11;
            this.f73924c = i10;
        }
        k.a(text, this.f73923b, this.f73924c);
        this.f73924c = text.length() + this.f73924c;
    }

    public String toString() {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("", "StringBuilder().apply { append(this) }.toString()");
        return "";
    }
}
