package xr;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class fb {

    /* renamed from: a, reason: collision with root package name */
    public static final db f92515a = new db(new byte[0], 0, 0);

    public static ab empty() {
        return f92515a;
    }

    public static ab ignoreClose(ab abVar) {
        return new bb(abVar);
    }

    public static InputStream openStream(ab abVar, boolean z10) {
        if (!z10) {
            abVar = ignoreClose(abVar);
        }
        return new cb(abVar);
    }

    public static byte[] readArray(ab abVar) {
        mh.p1.checkNotNull(abVar, "buffer");
        int i10 = abVar.readableBytes();
        byte[] bArr = new byte[i10];
        abVar.readBytes(bArr, 0, i10);
        return bArr;
    }

    public static String readAsString(ab abVar, Charset charset) {
        mh.p1.checkNotNull(charset, "charset");
        return new String(readArray(abVar), charset);
    }

    public static String readAsStringUtf8(ab abVar) {
        return readAsString(abVar, mh.h0.f74628c);
    }

    public static ab wrap(byte[] bArr) {
        return new db(bArr, 0, bArr.length);
    }

    public static ab wrap(byte[] bArr, int i10, int i11) {
        return new db(bArr, i10, i11);
    }

    public static ab wrap(ByteBuffer byteBuffer) {
        return new eb(byteBuffer);
    }
}
