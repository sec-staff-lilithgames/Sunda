package bc;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final o f9042a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final p f9043b = new p();

    /* renamed from: c, reason: collision with root package name */
    public static final q f9044c = new q();

    public static BigInteger parseBigInteger(CharSequence charSequence) {
        return f9044c.parseBigIntegerString(charSequence, 0, charSequence.length(), 10);
    }

    public static BigInteger parseBigInteger(CharSequence charSequence, int i10) {
        return f9044c.parseBigIntegerString(charSequence, 0, charSequence.length(), i10);
    }

    public static BigInteger parseBigInteger(CharSequence charSequence, int i10, int i11) {
        return f9044c.parseBigIntegerString(charSequence, i10, i11, 10);
    }

    public static BigInteger parseBigInteger(CharSequence charSequence, int i10, int i11, int i12) {
        return f9044c.parseBigIntegerString(charSequence, i10, i11, i12);
    }

    public static BigInteger parseBigInteger(byte[] bArr) {
        return f9042a.parseBigIntegerString(bArr, 0, bArr.length, 10);
    }

    public static BigInteger parseBigInteger(byte[] bArr, int i10) {
        return f9042a.parseBigIntegerString(bArr, 0, bArr.length, i10);
    }

    public static BigInteger parseBigInteger(byte[] bArr, int i10, int i11) {
        return f9042a.parseBigIntegerString(bArr, i10, i11, 10);
    }

    public static BigInteger parseBigInteger(byte[] bArr, int i10, int i11, int i12) {
        return f9042a.parseBigIntegerString(bArr, i10, i11, i12);
    }

    public static BigInteger parseBigInteger(char[] cArr) {
        return f9043b.parseBigIntegerString(cArr, 0, cArr.length, 10);
    }

    public static BigInteger parseBigInteger(char[] cArr, int i10) {
        return f9043b.parseBigIntegerString(cArr, 0, cArr.length, i10);
    }

    public static BigInteger parseBigInteger(char[] cArr, int i10, int i11) {
        return f9043b.parseBigIntegerString(cArr, i10, i11, 10);
    }

    public static BigInteger parseBigInteger(char[] cArr, int i10, int i11, int i12) {
        return f9043b.parseBigIntegerString(cArr, i10, i11, i12);
    }
}
