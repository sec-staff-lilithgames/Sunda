package com.google.android.exoplayer2.util;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import nh.l6;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f28579d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f28580e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final l6 f28581f = l6.of(mh.h0.f74626a, mh.h0.f74628c, mh.h0.f74631f, mh.h0.f74629d, mh.h0.f74630e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f28582a;

    /* renamed from: b, reason: collision with root package name */
    public int f28583b;

    /* renamed from: c, reason: collision with root package name */
    public int f28584c;

    public v0() {
        this.f28582a = n1.f28511f;
    }

    public final int a(Charset charset) {
        byte bCheckedCast;
        char cFromBytes;
        int i10 = 1;
        if ((charset.equals(mh.h0.f74628c) || charset.equals(mh.h0.f74626a)) && bytesLeft() >= 1) {
            bCheckedCast = (byte) rh.g.checkedCast(rh.e0.toInt(this.f28582a[this.f28583b]));
        } else {
            if ((charset.equals(mh.h0.f74631f) || charset.equals(mh.h0.f74629d)) && bytesLeft() >= 2) {
                byte[] bArr = this.f28582a;
                int i11 = this.f28583b;
                cFromBytes = rh.g.fromBytes(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(mh.h0.f74630e) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f28582a;
                int i12 = this.f28583b;
                cFromBytes = rh.g.fromBytes(bArr2[i12 + 1], bArr2[i12]);
            }
            bCheckedCast = (byte) cFromBytes;
            i10 = 2;
        }
        return (rh.g.checkedCast(bCheckedCast) << 16) + i10;
    }

    public final char b(Charset charset, char[] cArr) {
        int iA = a(charset);
        if (iA == 0) {
            return (char) 0;
        }
        char c10 = (char) (iA >> 16);
        if (!rh.g.contains(cArr, c10)) {
            return (char) 0;
        }
        this.f28583b += iA & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return c10;
    }

    public int bytesLeft() {
        return this.f28584c - this.f28583b;
    }

    public int capacity() {
        return this.f28582a.length;
    }

    public void ensureCapacity(int i10) {
        if (i10 > capacity()) {
            this.f28582a = Arrays.copyOf(this.f28582a, i10);
        }
    }

    public byte[] getData() {
        return this.f28582a;
    }

    public int getPosition() {
        return this.f28583b;
    }

    public int limit() {
        return this.f28584c;
    }

    public char peekChar() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        return (char) ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public int peekUnsignedByte() {
        return this.f28582a[this.f28583b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public void readBytes(u0 u0Var, int i10) {
        readBytes(u0Var.f28575a, 0, i10);
        u0Var.setPosition(0);
    }

    public String readDelimiterTerminatedString(char c10) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.f28583b;
        while (i10 < this.f28584c && this.f28582a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f28582a;
        int i11 = this.f28583b;
        String strFromUtf8Bytes = n1.fromUtf8Bytes(bArr, i11, i10 - i11);
        this.f28583b = i10;
        if (i10 < this.f28584c) {
            this.f28583b = i10 + 1;
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
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i13 = i10 + 2;
        this.f28583b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i12;
        int i15 = i10 + 3;
        this.f28583b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f28583b = i10 + 4;
        return (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16;
    }

    public int readInt24() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        int i13 = i10 + 2;
        this.f28583b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f28583b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public String readLine() {
        return readLine(mh.h0.f74628c);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f28583b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        int i15 = i10 + 3;
        this.f28583b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f28583b = i10 + 4;
        return ((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i16;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f28583b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f28583b = i10 + 3;
        return ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i14;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        this.f28583b = i10 + 1;
        this.f28583b = i10 + 2;
        this.f28583b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f28583b = i10 + 4;
        long j11 = j10 | ((bArr[r8] & 255) << 24);
        this.f28583b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 32);
        this.f28583b = i10 + 6;
        long j13 = j12 | ((bArr[r8] & 255) << 40);
        this.f28583b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 48);
        this.f28583b = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j14;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f28583b = i10 + 2;
        return (short) (((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        this.f28583b = i10 + 1;
        this.f28583b = i10 + 2;
        this.f28583b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f28583b = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j10;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f28583b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f28583b = i10 + 3;
        return ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i14;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException(a.b.e(littleEndianInt, "Top bit not zero: "));
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f28583b = i10 + 2;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public long readLong() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        this.f28583b = i10 + 1;
        this.f28583b = i10 + 2;
        this.f28583b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f28583b = i10 + 4;
        long j11 = j10 | ((bArr[r4] & 255) << 32);
        this.f28583b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f28583b = i10 + 6;
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        this.f28583b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f28583b = i10 + 8;
        return (bArr[r4] & 255) | j14;
    }

    public String readNullTerminatedString(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f28583b;
        int i12 = (i11 + i10) - 1;
        String strFromUtf8Bytes = n1.fromUtf8Bytes(this.f28582a, i11, (i12 >= this.f28584c || this.f28582a[i12] != 0) ? i10 : i10 - 1);
        this.f28583b += i10;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f28583b = i10 + 2;
        return (short) ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12);
    }

    public String readString(int i10) {
        return readString(i10, mh.h0.f74628c);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        this.f28583b = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f28583b = i10 + 2;
        int i13 = (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
        this.f28583b = i10 + 4;
        return i13;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        this.f28583b = i10 + 1;
        this.f28583b = i10 + 2;
        this.f28583b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f28583b = i10 + 4;
        return (bArr[r4] & 255) | j10;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i13 = i10 + 2;
        this.f28583b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f28583b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
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
        byte[] bArr = this.f28582a;
        int i10 = this.f28583b;
        int i11 = i10 + 1;
        this.f28583b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f28583b = i10 + 2;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    public long readUtf8EncodedLong() {
        int i10;
        int i11;
        long j10 = this.f28582a[this.f28583b];
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
            if ((this.f28582a[this.f28583b + i10] & 192) != 128) {
                throw new NumberFormatException(o2.m(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.f28583b += i11;
        return j10;
    }

    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.f28582a;
            int i10 = this.f28583b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f28583b = i10 + 3;
                return mh.h0.f74628c;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.f28582a;
        int i11 = this.f28583b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f28583b = i11 + 2;
            return mh.h0.f74629d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f28583b = i11 + 2;
        return mh.h0.f74630e;
    }

    public void reset(int i10) {
        reset(capacity() < i10 ? new byte[i10] : this.f28582a, i10);
    }

    public void setLimit(int i10) {
        a.checkArgument(i10 >= 0 && i10 <= this.f28582a.length);
        this.f28584c = i10;
    }

    public void setPosition(int i10) {
        a.checkArgument(i10 >= 0 && i10 <= this.f28584c);
        this.f28583b = i10;
    }

    public void skipBytes(int i10) {
        setPosition(this.f28583b + i10);
    }

    public char peekChar(Charset charset) {
        a.checkArgument(f28581f.contains(charset), "Unsupported charset: " + charset);
        return (char) (a(charset) >> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readLine(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            nh.l6 r0 = com.google.android.exoplayer2.util.v0.f28581f
            boolean r0 = r0.contains(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.a.checkArgument(r0, r1)
            int r0 = r4.bytesLeft()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = mh.h0.f74626a
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L2a
            r4.readUtfCharsetFromBom()
        L2a:
            java.nio.charset.Charset r1 = mh.h0.f74628c
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L66
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L39
            goto L66
        L39:
            java.nio.charset.Charset r0 = mh.h0.f74631f
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = mh.h0.f74630e
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = mh.h0.f74629d
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L64:
            r0 = 2
            goto L67
        L66:
            r0 = 1
        L67:
            int r1 = r4.f28583b
        L69:
            int r2 = r4.f28584c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lc8
            java.nio.charset.Charset r2 = mh.h0.f74628c
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = mh.h0.f74626a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L81:
            byte[] r2 = r4.f28582a
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.n1.isLinebreak(r2)
            if (r2 == 0) goto L8c
            goto Lc9
        L8c:
            java.nio.charset.Charset r2 = mh.h0.f74631f
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = mh.h0.f74629d
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lad
        L9c:
            byte[] r2 = r4.f28582a
            r3 = r2[r1]
            if (r3 != 0) goto Lad
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = com.google.android.exoplayer2.util.n1.isLinebreak(r2)
            if (r2 == 0) goto Lad
            goto Lc9
        Lad:
            java.nio.charset.Charset r2 = mh.h0.f74630e
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc6
            byte[] r2 = r4.f28582a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto Lc6
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.n1.isLinebreak(r2)
            if (r2 == 0) goto Lc6
            goto Lc9
        Lc6:
            int r1 = r1 + r0
            goto L69
        Lc8:
            r1 = r2
        Lc9:
            int r0 = r4.f28583b
            int r1 = r1 - r0
            java.lang.String r0 = r4.readString(r1, r5)
            int r1 = r4.f28583b
            int r2 = r4.f28584c
            if (r1 != r2) goto Ld7
            goto Le6
        Ld7:
            char[] r1 = com.google.android.exoplayer2.util.v0.f28579d
            char r1 = r4.b(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = com.google.android.exoplayer2.util.v0.f28580e
            r4.b(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.v0.readLine(java.nio.charset.Charset):java.lang.String");
    }

    public String readString(int i10, Charset charset) {
        String str = new String(this.f28582a, this.f28583b, i10, charset);
        this.f28583b += i10;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public v0(int i10) {
        this.f28582a = new byte[i10];
        this.f28584c = i10;
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f28582a, this.f28583b, bArr, i10, i11);
        this.f28583b += i11;
    }

    public void reset(byte[] bArr, int i10) {
        this.f28582a = bArr;
        this.f28584c = i10;
        this.f28583b = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f28582a, this.f28583b, i10);
        this.f28583b += i10;
    }

    public v0(byte[] bArr) {
        this.f28582a = bArr;
        this.f28584c = bArr.length;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public v0(byte[] bArr, int i10) {
        this.f28582a = bArr;
        this.f28584c = i10;
    }
}
