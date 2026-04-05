package pw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 extends l {

    /* renamed from: h, reason: collision with root package name */
    public final transient byte[][] f82012h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int[] f82013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(byte[][] segments, int[] directory) {
        super(l.f81912g.getData$okio());
        kotlin.jvm.internal.e0.checkNotNullParameter(segments, "segments");
        kotlin.jvm.internal.e0.checkNotNullParameter(directory, "directory");
        this.f82012h = segments;
        this.f82013i = directory;
    }

    public final l a() {
        return new l(toByteArray());
    }

    @Override // pw.l
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // pw.l
    public String base64() {
        return a().base64();
    }

    @Override // pw.l
    public String base64Url() {
        return a().base64Url();
    }

    @Override // pw.l
    public void copyInto(int i10, byte[] target, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        long j10 = i12;
        b.checkOffsetAndCount(size(), i10, j10);
        b.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = qw.j.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = (i10 - i14) + i16;
            uu.f0.copyInto(getSegments$okio()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    @Override // pw.l
    public l digest$okio(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory$okio()[length + i10];
            int i13 = getDirectory$okio()[i10];
            messageDigest.update(getSegments$okio()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.e0.checkNotNull(bArrDigest);
        return new l(bArrDigest);
    }

    @Override // pw.l
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.size() == size() && rangeEquals(0, lVar, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.f82013i;
    }

    public final byte[][] getSegments$okio() {
        return this.f82012h;
    }

    @Override // pw.l
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // pw.l
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory$okio()[length + i10];
            int i14 = getDirectory$okio()[i10];
            byte[] bArr = getSegments$okio()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        setHashCode$okio(i11);
        return i11;
    }

    @Override // pw.l
    public String hex() {
        return a().hex();
    }

    @Override // pw.l
    public l hmac$okio(String algorithm, l key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = getDirectory$okio()[length + i10];
                int i13 = getDirectory$okio()[i10];
                mac.update(getSegments$okio()[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new l(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // pw.l
    public int indexOf(byte[] other, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return a().indexOf(other, i10);
    }

    @Override // pw.l
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // pw.l
    public byte internalGet$okio(int i10) {
        b.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i10, 1L);
        int iSegment = qw.j.segment(this, i10);
        return getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // pw.l
    public int lastIndexOf(byte[] other, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return a().lastIndexOf(other, i10);
    }

    @Override // pw.l
    public boolean rangeEquals(int i10, l other, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = qw.j.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, getSegments$okio()[iSegment], (i10 - i14) + i16, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // pw.l
    public String string(Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        return a().string(charset);
    }

    @Override // pw.l
    public l substring(int i10, int i11) {
        int iResolveDefaultParameter = b.resolveDefaultParameter(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbT = o2.t(iResolveDefaultParameter, "endIndex=", " > length(");
            sbT.append(size());
            sbT.append(')');
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(w0.i.a(iResolveDefaultParameter, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (i10 == iResolveDefaultParameter) {
            return l.f81912g;
        }
        int iSegment = qw.j.segment(this, i10);
        int iSegment2 = qw.j.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) uu.f0.copyOfRange(getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(getDirectory$okio()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new y0(bArr, iArr);
    }

    @Override // pw.l
    public l toAsciiLowercase() {
        return a().toAsciiLowercase();
    }

    @Override // pw.l
    public l toAsciiUppercase() {
        return a().toAsciiUppercase();
    }

    @Override // pw.l
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory$okio()[length + i10];
            int i14 = getDirectory$okio()[i10];
            int i15 = i14 - i11;
            uu.f0.copyInto(getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // pw.l
    public String toString() {
        return a().toString();
    }

    @Override // pw.l
    public void write(OutputStream out) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory$okio()[length + i10];
            int i13 = getDirectory$okio()[i10];
            out.write(getSegments$okio()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
    }

    @Override // pw.l
    public void write$okio(g buffer, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = qw.j.segment(this, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = (i10 - i13) + i15;
            w0 w0Var = new w0(getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            w0 w0Var2 = buffer.f81896b;
            if (w0Var2 == null) {
                w0Var.f82000g = w0Var;
                w0Var.f81999f = w0Var;
                buffer.f81896b = w0Var;
            } else {
                kotlin.jvm.internal.e0.checkNotNull(w0Var2);
                w0 w0Var3 = w0Var2.f82000g;
                kotlin.jvm.internal.e0.checkNotNull(w0Var3);
                w0Var3.push(w0Var);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i11);
    }

    @Override // pw.l
    public boolean rangeEquals(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = qw.j.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!b.arrayRangeEquals(getSegments$okio()[iSegment], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
