package bc;

import java.math.BigDecimal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final k f9039a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final l f9040b = new l();

    /* renamed from: c, reason: collision with root package name */
    public static final m f9041c = new m();

    public static BigDecimal parseBigDecimal(CharSequence charSequence) throws NumberFormatException {
        return parseBigDecimal(charSequence, 0, charSequence.length());
    }

    public static BigDecimal parseBigDecimal(CharSequence charSequence, int i10, int i11) throws NumberFormatException {
        return f9041c.parseBigDecimalString(charSequence, i10, i11);
    }

    public static BigDecimal parseBigDecimal(byte[] bArr) throws NumberFormatException {
        return parseBigDecimal(bArr, 0, bArr.length);
    }

    public static BigDecimal parseBigDecimal(byte[] bArr, int i10, int i11) throws NumberFormatException {
        return f9039a.parseBigDecimalString(bArr, i10, i11);
    }

    public static BigDecimal parseBigDecimal(char[] cArr) throws NumberFormatException {
        return parseBigDecimal(cArr, 0, cArr.length);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i10, int i11) throws NumberFormatException {
        return f9040b.parseBigDecimalString(cArr, i10, i11);
    }
}
