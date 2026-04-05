package bc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final s f9045a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final t f9046b = new t();

    /* renamed from: c, reason: collision with root package name */
    public static final u f9047c = new u();

    public static double parseDouble(CharSequence charSequence) throws NumberFormatException {
        return parseDouble(charSequence, 0, charSequence.length());
    }

    public static double parseDouble(CharSequence charSequence, int i10, int i11) throws NumberFormatException {
        return Double.longBitsToDouble(f9047c.parseFloatingPointLiteral(charSequence, i10, i11));
    }

    public static double parseDouble(byte[] bArr) throws NumberFormatException {
        return parseDouble(bArr, 0, bArr.length);
    }

    public static double parseDouble(byte[] bArr, int i10, int i11) throws NumberFormatException {
        return Double.longBitsToDouble(f9045a.parseFloatingPointLiteral(bArr, i10, i11));
    }

    public static double parseDouble(char[] cArr) throws NumberFormatException {
        return parseDouble(cArr, 0, cArr.length);
    }

    public static double parseDouble(char[] cArr, int i10, int i11) throws NumberFormatException {
        return Double.longBitsToDouble(f9046b.parseFloatingPointLiteral(cArr, i10, i11));
    }
}
