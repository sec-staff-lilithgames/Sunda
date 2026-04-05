package bc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final w f9048a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final x f9049b = new x();

    /* renamed from: c, reason: collision with root package name */
    public static final y f9050c = new y();

    public static float parseFloat(CharSequence charSequence) throws NumberFormatException {
        return parseFloat(charSequence, 0, charSequence.length());
    }

    public static float parseFloat(CharSequence charSequence, int i10, int i11) throws NumberFormatException {
        return Float.intBitsToFloat((int) f9050c.parseFloatingPointLiteral(charSequence, i10, i11));
    }

    public static float parseFloat(byte[] bArr) throws NumberFormatException {
        return parseFloat(bArr, 0, bArr.length);
    }

    public static float parseFloat(byte[] bArr, int i10, int i11) throws NumberFormatException {
        return Float.intBitsToFloat((int) f9048a.parseFloatingPointLiteral(bArr, i10, i11));
    }

    public static float parseFloat(char[] cArr) throws NumberFormatException {
        return parseFloat(cArr, 0, cArr.length);
    }

    public static float parseFloat(char[] cArr, int i10, int i11) throws NumberFormatException {
        return Float.intBitsToFloat((int) f9049b.parseFloatingPointLiteral(cArr, i10, i11));
    }
}
