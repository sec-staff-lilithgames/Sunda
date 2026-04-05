package ph;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final i f81337a = new i("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: b, reason: collision with root package name */
    public static final i f81338b = new i("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: c, reason: collision with root package name */
    public static final n f81339c = new n("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");

    /* renamed from: d, reason: collision with root package name */
    public static final n f81340d = new n("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");

    /* renamed from: e, reason: collision with root package name */
    public static final h f81341e = new h(new g("base16()", "0123456789ABCDEF".toCharArray()));

    public static o base16() {
        return f81341e;
    }

    public static o base32() {
        return f81339c;
    }

    public static o base32Hex() {
        return f81340d;
    }

    public static o base64() {
        return f81337a;
    }

    public static o base64Url() {
        return f81338b;
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i10, int i11);

    public abstract int c(int i10);

    public abstract boolean canDecode(CharSequence charSequence);

    public abstract int d(int i10);

    public final byte[] decode(CharSequence charSequence) {
        try {
            CharSequence charSequenceE = e(charSequence);
            int iC = c(charSequenceE.length());
            byte[] bArr = new byte[iC];
            int iA = a(bArr, charSequenceE);
            if (iA == iC) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (j e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final z decodingSource(m0 m0Var) {
        p1.checkNotNull(m0Var);
        return new c(this, m0Var);
    }

    public abstract InputStream decodingStream(Reader reader);

    public abstract CharSequence e(CharSequence charSequence);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public final t encodingSink(g0 g0Var) {
        p1.checkNotNull(g0Var);
        return new b(this, g0Var);
    }

    public abstract OutputStream encodingStream(Writer writer);

    public abstract o ignoreCase();

    public abstract o lowerCase();

    public abstract o omitPadding();

    public abstract o upperCase();

    public abstract o withPadChar(char c10);

    public abstract o withSeparator(String str, int i10);

    public final String encode(byte[] bArr, int i10, int i11) {
        p1.checkPositionIndexes(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(d(i11));
        try {
            b(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
