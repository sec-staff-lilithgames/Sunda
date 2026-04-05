package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.e0;
import p0.o2;
import uu.f0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.SegmentedByteString, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0819SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0819SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        e0.checkNotNullParameter(segments, "segments");
        e0.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        e0.checkNotNull(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        e0.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void copyInto(int i10, byte[] target, int i11, int i12) {
        e0.checkNotNullParameter(target, "target");
        long j10 = i12;
        SegmentedByteString.checkOffsetAndCount(size(), i10, j10);
        SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = (i10 - i14) + i16;
            f0.copyInto(getSegments$okio()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(algorithm, "algorithm");
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
        e0.checkNotNull(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // com.applovin.shadow.okio.ByteString
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

    @Override // com.applovin.shadow.okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        e0.checkNotNullParameter(algorithm, "algorithm");
        e0.checkNotNullParameter(key, "key");
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
            e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int indexOf(byte[] other, int i10) {
        e0.checkNotNullParameter(other, "other");
        return toByteString().indexOf(other, i10);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte internalGet$okio(int i10) {
        SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i10, 1L);
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i10);
        return getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int lastIndexOf(byte[] other, int i10) {
        e0.checkNotNullParameter(other, "other");
        return toByteString().lastIndexOf(other, i10);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int i10, ByteString other, int i11, int i12) {
        e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i10);
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

    @Override // com.applovin.shadow.okio.ByteString
    public String string(Charset charset) {
        e0.checkNotNullParameter(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString substring(int i10, int i11) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i11);
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
            throw new IllegalArgumentException(i.a(iResolveDefaultParameter, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i10);
        int iSegment2 = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) f0.copyOfRange(getSegments$okio(), iSegment, iSegment2 + 1);
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
        return new C0819SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
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
            f0.copyInto(getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write(OutputStream out) throws IOException {
        e0.checkNotNullParameter(out, "out");
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

    @Override // com.applovin.shadow.okio.ByteString
    public void write$okio(Buffer buffer, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = (i10 - i13) + i15;
            Segment segment = new Segment(getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                e0.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                e0.checkNotNull(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i11);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int i10, byte[] other, int i11, int i12) {
        e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!SegmentedByteString.arrayRangeEquals(getSegments$okio()[iSegment], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
