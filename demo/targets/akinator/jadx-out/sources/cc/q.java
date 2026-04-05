package cc;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Objects;
import ub.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q implements c0, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final k f12107g = k.getInstance();

    /* renamed from: b, reason: collision with root package name */
    public final String f12108b;

    /* renamed from: c, reason: collision with root package name */
    public volatile byte[] f12109c;

    /* renamed from: e, reason: collision with root package name */
    public volatile byte[] f12110e;

    /* renamed from: f, reason: collision with root package name */
    public volatile char[] f12111f;

    public q(String str) {
        Objects.requireNonNull(str, "Null String illegal for SerializedString");
        this.f12108b = str;
    }

    @Override // ub.c0
    public int appendQuoted(char[] cArr, int i10) {
        char[] cArrQuoteAsString = this.f12111f;
        if (cArrQuoteAsString == null) {
            cArrQuoteAsString = f12107g.quoteAsString(this.f12108b);
            this.f12111f = cArrQuoteAsString;
        }
        int length = cArrQuoteAsString.length;
        if (i10 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrQuoteAsString, 0, cArr, i10, length);
        return length;
    }

    @Override // ub.c0
    public int appendQuotedUTF8(byte[] bArr, int i10) {
        byte[] bArrQuoteAsUTF8 = this.f12109c;
        if (bArrQuoteAsUTF8 == null) {
            bArrQuoteAsUTF8 = f12107g.quoteAsUTF8(this.f12108b);
            this.f12109c = bArrQuoteAsUTF8;
        }
        int length = bArrQuoteAsUTF8.length;
        if (i10 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrQuoteAsUTF8, 0, bArr, i10, length);
        return length;
    }

    @Override // ub.c0
    public int appendUnquoted(char[] cArr, int i10) {
        String str = this.f12108b;
        int length = str.length();
        if (i10 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i10);
        return length;
    }

    @Override // ub.c0
    public int appendUnquotedUTF8(byte[] bArr, int i10) {
        byte[] bArrEncodeAsUTF8 = this.f12110e;
        if (bArrEncodeAsUTF8 == null) {
            bArrEncodeAsUTF8 = f12107g.encodeAsUTF8(this.f12108b);
            this.f12110e = bArrEncodeAsUTF8;
        }
        int length = bArrEncodeAsUTF8.length;
        if (i10 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrEncodeAsUTF8, 0, bArr, i10, length);
        return length;
    }

    @Override // ub.c0
    public final char[] asQuotedChars() {
        char[] cArr = this.f12111f;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrQuoteAsString = f12107g.quoteAsString(this.f12108b);
        this.f12111f = cArrQuoteAsString;
        return cArrQuoteAsString;
    }

    @Override // ub.c0
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this.f12109c;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrQuoteAsUTF8 = f12107g.quoteAsUTF8(this.f12108b);
        this.f12109c = bArrQuoteAsUTF8;
        return bArrQuoteAsUTF8;
    }

    @Override // ub.c0
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this.f12110e;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrEncodeAsUTF8 = f12107g.encodeAsUTF8(this.f12108b);
        this.f12110e = bArrEncodeAsUTF8;
        return bArrEncodeAsUTF8;
    }

    @Override // ub.c0
    public final int charLength() {
        return this.f12108b.length();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f12108b.equals(((q) obj).f12108b);
    }

    @Override // ub.c0
    public final String getValue() {
        return this.f12108b;
    }

    public final int hashCode() {
        return this.f12108b.hashCode();
    }

    @Override // ub.c0
    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrQuoteAsUTF8 = this.f12109c;
        if (bArrQuoteAsUTF8 == null) {
            bArrQuoteAsUTF8 = f12107g.quoteAsUTF8(this.f12108b);
            this.f12109c = bArrQuoteAsUTF8;
        }
        int length = bArrQuoteAsUTF8.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrQuoteAsUTF8, 0, length);
        return length;
    }

    @Override // ub.c0
    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrEncodeAsUTF8 = this.f12110e;
        if (bArrEncodeAsUTF8 == null) {
            bArrEncodeAsUTF8 = f12107g.encodeAsUTF8(this.f12108b);
            this.f12110e = bArrEncodeAsUTF8;
        }
        int length = bArrEncodeAsUTF8.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrEncodeAsUTF8, 0, length);
        return length;
    }

    public final String toString() {
        return this.f12108b;
    }

    @Override // ub.c0
    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrQuoteAsUTF8 = this.f12109c;
        if (bArrQuoteAsUTF8 == null) {
            bArrQuoteAsUTF8 = f12107g.quoteAsUTF8(this.f12108b);
            this.f12109c = bArrQuoteAsUTF8;
        }
        int length = bArrQuoteAsUTF8.length;
        outputStream.write(bArrQuoteAsUTF8, 0, length);
        return length;
    }

    @Override // ub.c0
    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrEncodeAsUTF8 = this.f12110e;
        if (bArrEncodeAsUTF8 == null) {
            bArrEncodeAsUTF8 = f12107g.encodeAsUTF8(this.f12108b);
            this.f12110e = bArrEncodeAsUTF8;
        }
        int length = bArrEncodeAsUTF8.length;
        outputStream.write(bArrEncodeAsUTF8, 0, length);
        return length;
    }
}
