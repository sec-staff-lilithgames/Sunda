package io.odeeo.internal.q0;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f65968a;

    /* renamed from: b, reason: collision with root package name */
    public int f65969b;

    /* renamed from: c, reason: collision with root package name */
    public int f65970c;

    public x() {
        this.f65968a = g0.f65866f;
    }

    public int bytesLeft() {
        return this.f65970c - this.f65969b;
    }

    public int capacity() {
        return this.f65968a.length;
    }

    public void ensureCapacity(int i10) {
        if (i10 > capacity()) {
            this.f65968a = Arrays.copyOf(this.f65968a, i10);
        }
    }

    public byte[] getData() {
        return this.f65968a;
    }

    public int getPosition() {
        return this.f65969b;
    }

    public int limit() {
        return this.f65970c;
    }

    public char peekChar() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        return (char) ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public int peekUnsignedByte() {
        return this.f65968a[this.f65969b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public void readBytes(w wVar, int i10) {
        readBytes(wVar.f65964a, 0, i10);
        wVar.setPosition(0);
    }

    public String readDelimiterTerminatedString(char c10) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.f65969b;
        while (i10 < this.f65970c && this.f65968a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f65968a;
        int i11 = this.f65969b;
        String strFromUtf8Bytes = g0.fromUtf8Bytes(bArr, i11, i10 - i11);
        this.f65969b = i10;
        if (i10 < this.f65970c) {
            this.f65969b = i10 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f65969b = i10 + 4;
        return (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
    }

    public int readInt24() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8);
        this.f65969b = i10 + 3;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readLine() {
        /*
            r6 = this;
            int r0 = r6.bytesLeft()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r6.f65969b
        La:
            int r1 = r6.f65970c
            if (r0 >= r1) goto L1b
            byte[] r1 = r6.f65968a
            r1 = r1[r0]
            boolean r1 = io.odeeo.internal.q0.g0.isLinebreak(r1)
            if (r1 != 0) goto L1b
            int r0 = r0 + 1
            goto La
        L1b:
            int r1 = r6.f65969b
            int r2 = r0 - r1
            r3 = 3
            if (r2 < r3) goto L3d
            byte[] r2 = r6.f65968a
            r4 = r2[r1]
            r5 = -17
            if (r4 != r5) goto L3d
            int r4 = r1 + 1
            r4 = r2[r4]
            r5 = -69
            if (r4 != r5) goto L3d
            int r4 = r1 + 2
            r2 = r2[r4]
            r4 = -65
            if (r2 != r4) goto L3d
            int r1 = r1 + r3
            r6.f65969b = r1
        L3d:
            byte[] r1 = r6.f65968a
            int r2 = r6.f65969b
            int r3 = r0 - r2
            java.lang.String r1 = io.odeeo.internal.q0.g0.fromUtf8Bytes(r1, r2, r3)
            r6.f65969b = r0
            int r2 = r6.f65970c
            if (r0 != r2) goto L4e
            goto L69
        L4e:
            byte[] r3 = r6.f65968a
            r4 = r3[r0]
            r5 = 13
            if (r4 != r5) goto L5d
            int r0 = r0 + 1
            r6.f65969b = r0
            if (r0 != r2) goto L5d
            goto L69
        L5d:
            int r0 = r6.f65969b
            r2 = r3[r0]
            r3 = 10
            if (r2 != r3) goto L69
            int r0 = r0 + 1
            r6.f65969b = r0
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.q0.x.readLine():java.lang.String");
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f65969b = i10 + 4;
        return ((bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i13;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f65969b = i10 + 3;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i12;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 7;
        long j10 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        this.f65969b = i10 + 8;
        return ((bArr[i11] & 255) << 56) | j10;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f65969b = i10 + 2;
        return (short) (((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        this.f65969b = i10 + 4;
        return ((bArr[i11] & 255) << 24) | j10;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f65969b = i10 + 3;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i12;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException(a.b.e(littleEndianInt, "Top bit not zero: "));
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f65969b = i10 + 2;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public long readLong() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        this.f65969b = i10 + 8;
        return (bArr[i11] & 255) | j10;
    }

    public String readNullTerminatedString(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f65969b;
        int i12 = (i11 + i10) - 1;
        String strFromUtf8Bytes = g0.fromUtf8Bytes(this.f65968a, i11, (i12 >= this.f65970c || this.f65968a[i12] != 0) ? i10 : i10 - 1);
        this.f65969b += i10;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f65969b = i10 + 2;
        return (short) ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12);
    }

    public String readString(int i10) {
        return readString(i10, io.odeeo.internal.t0.e.f66406c);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        this.f65969b = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = (bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f65969b = i10 + 4;
        return i11;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        this.f65969b = i10 + 4;
        return (bArr[i11] & 255) | j10;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f65969b = i10 + 3;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    public int readUnsignedIntToInt() {
        int i10 = readInt();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(a.b.e(i10, "Top bit not zero: "));
    }

    public long readUnsignedLongToLong() {
        long j10 = readLong();
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalStateException(o2.m(j10, "Top bit not zero: "));
    }

    public int readUnsignedShort() {
        byte[] bArr = this.f65968a;
        int i10 = this.f65969b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f65969b = i10 + 2;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    public long readUtf8EncodedLong() {
        int i10;
        int i11;
        long j10 = this.f65968a[this.f65969b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException(o2.m(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f65968a[this.f65969b + i10] & 192) != 128) {
                throw new NumberFormatException(o2.m(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.f65969b += i11;
        return j10;
    }

    public void reset(int i10) {
        reset(capacity() < i10 ? new byte[i10] : this.f65968a, i10);
    }

    public void setLimit(int i10) {
        a.checkArgument(i10 >= 0 && i10 <= this.f65968a.length);
        this.f65970c = i10;
    }

    public void setPosition(int i10) {
        a.checkArgument(i10 >= 0 && i10 <= this.f65970c);
        this.f65969b = i10;
    }

    public void skipBytes(int i10) {
        setPosition(this.f65969b + i10);
    }

    public String readString(int i10, Charset charset) {
        String str = new String(this.f65968a, this.f65969b, i10, charset);
        this.f65969b += i10;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public x(int i10) {
        this.f65968a = new byte[i10];
        this.f65970c = i10;
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f65968a, this.f65969b, bArr, i10, i11);
        this.f65969b += i11;
    }

    public void reset(byte[] bArr, int i10) {
        this.f65968a = bArr;
        this.f65970c = i10;
        this.f65969b = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f65968a, this.f65969b, i10);
        this.f65969b += i10;
    }

    public x(byte[] bArr) {
        this.f65968a = bArr;
        this.f65970c = bArr.length;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public x(byte[] bArr, int i10) {
        this.f65968a = bArr;
        this.f65970c = i10;
    }
}
