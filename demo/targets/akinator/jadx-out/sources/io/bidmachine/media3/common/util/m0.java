package io.bidmachine.media3.common.util;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import nh.l6;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f60745d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f60746e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final l6 f60747f = l6.of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f60748a;

    /* renamed from: b, reason: collision with root package name */
    public int f60749b;

    /* renamed from: c, reason: collision with root package name */
    public int f60750c;

    public m0() {
        this.f60748a = a1.f60681c;
    }

    public final int a(Charset charset) {
        byte b10;
        byte b11;
        byte b12 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && bytesLeft() >= 1) {
            b10 = this.f60748a[this.f60749b];
            b11 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.f60748a;
                int i10 = this.f60749b;
                b11 = bArr[i10];
                b10 = bArr[i10 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f60748a;
                int i11 = this.f60749b;
                b11 = bArr2[i11 + 1];
                b10 = bArr2[i11];
            }
            b12 = 2;
        }
        return rh.w.fromBytes(b11, b10, (byte) 0, b12);
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
        this.f60749b += iA & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return c10;
    }

    public int bytesLeft() {
        return this.f60750c - this.f60749b;
    }

    public int capacity() {
        return this.f60748a.length;
    }

    public void ensureCapacity(int i10) {
        if (i10 > capacity()) {
            this.f60748a = Arrays.copyOf(this.f60748a, i10);
        }
    }

    public byte[] getData() {
        return this.f60748a;
    }

    public int getPosition() {
        return this.f60749b;
    }

    public int limit() {
        return this.f60750c;
    }

    public char peekChar() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        return (char) ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public int peekUnsignedByte() {
        return this.f60748a[this.f60749b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public void readBytes(l0 l0Var, int i10) {
        readBytes(l0Var.f60741a, 0, i10);
        l0Var.setPosition(0);
    }

    public String readDelimiterTerminatedString(char c10) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.f60749b;
        while (i10 < this.f60750c && this.f60748a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f60748a;
        int i11 = this.f60749b;
        String strFromUtf8Bytes = a1.fromUtf8Bytes(bArr, i11, i10 - i11);
        this.f60749b = i10;
        if (i10 < this.f60750c) {
            this.f60749b = i10 + 1;
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
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i13 = i10 + 2;
        this.f60749b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i12;
        int i15 = i10 + 3;
        this.f60749b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f60749b = i10 + 4;
        return (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16;
    }

    public int readInt24() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        int i13 = i10 + 2;
        this.f60749b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f60749b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f60749b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        int i15 = i10 + 3;
        this.f60749b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f60749b = i10 + 4;
        return ((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i16;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f60749b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f60749b = i10 + 3;
        return ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i14;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        this.f60749b = i10 + 1;
        this.f60749b = i10 + 2;
        this.f60749b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f60749b = i10 + 4;
        long j11 = j10 | ((bArr[r8] & 255) << 24);
        this.f60749b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 32);
        this.f60749b = i10 + 6;
        long j13 = j12 | ((bArr[r8] & 255) << 40);
        this.f60749b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 48);
        this.f60749b = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j14;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f60749b = i10 + 2;
        return (short) (((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        this.f60749b = i10 + 1;
        this.f60749b = i10 + 2;
        this.f60749b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f60749b = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j10;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f60749b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f60749b = i10 + 3;
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
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f60749b = i10 + 2;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public long readLong() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        this.f60749b = i10 + 1;
        this.f60749b = i10 + 2;
        this.f60749b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f60749b = i10 + 4;
        long j11 = j10 | ((bArr[r4] & 255) << 32);
        this.f60749b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f60749b = i10 + 6;
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        this.f60749b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f60749b = i10 + 8;
        return (bArr[r4] & 255) | j14;
    }

    public String readNullTerminatedString(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f60749b;
        int i12 = (i11 + i10) - 1;
        String strFromUtf8Bytes = a1.fromUtf8Bytes(this.f60748a, i11, (i12 >= this.f60750c || this.f60748a[i12] != 0) ? i10 : i10 - 1);
        this.f60749b += i10;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f60749b = i10 + 2;
        return (short) ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12);
    }

    public String readString(int i10) {
        return readString(i10, StandardCharsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        this.f60749b = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f60749b = i10 + 2;
        int i13 = (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
        this.f60749b = i10 + 4;
        return i13;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        this.f60749b = i10 + 1;
        this.f60749b = i10 + 2;
        this.f60749b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f60749b = i10 + 4;
        return (bArr[r4] & 255) | j10;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i13 = i10 + 2;
        this.f60749b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f60749b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public int readUnsignedIntToInt() {
        int i10 = readInt();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(a.b.e(i10, "Top bit not zero: "));
    }

    public int readUnsignedLeb128ToInt() {
        return rh.w.checkedCast(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLeb128ToLong() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f60749b == this.f60750c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long unsignedByte = readUnsignedByte();
            j10 |= (127 & unsignedByte) << (i10 * 7);
            if ((unsignedByte & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public long readUnsignedLongToLong() {
        long j10 = readLong();
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalStateException(o2.m(j10, "Top bit not zero: "));
    }

    public int readUnsignedShort() {
        byte[] bArr = this.f60748a;
        int i10 = this.f60749b;
        int i11 = i10 + 1;
        this.f60749b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f60749b = i10 + 2;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    public long readUtf8EncodedLong() {
        int i10;
        int i11;
        long j10 = this.f60748a[this.f60749b];
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
            if ((this.f60748a[this.f60749b + i10] & 192) != 128) {
                throw new NumberFormatException(o2.m(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.f60749b += i11;
        return j10;
    }

    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.f60748a;
            int i10 = this.f60749b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f60749b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.f60748a;
        int i11 = this.f60749b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f60749b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f60749b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void reset(int i10) {
        reset(capacity() < i10 ? new byte[i10] : this.f60748a, i10);
    }

    public void setLimit(int i10) {
        a.checkArgument(i10 >= 0 && i10 <= this.f60748a.length);
        this.f60750c = i10;
    }

    public void setPosition(int i10) {
        a.checkArgument(i10 >= 0 && i10 <= this.f60750c);
        this.f60749b = i10;
    }

    public void skipBytes(int i10) {
        setPosition(this.f60749b + i10);
    }

    public char peekChar(Charset charset) {
        a.checkArgument(f60747f.contains(charset), "Unsupported charset: " + charset);
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
            nh.l6 r0 = io.bidmachine.media3.common.util.m0.f60747f
            boolean r0 = r0.contains(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            io.bidmachine.media3.common.util.a.checkArgument(r0, r1)
            int r0 = r4.bytesLeft()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L2a
            r4.readUtfCharsetFromBom()
        L2a:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L66
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L39
            goto L66
        L39:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
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
            int r1 = r4.f60749b
        L69:
            int r2 = r4.f60750c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lc8
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L81:
            byte[] r2 = r4.f60748a
            r2 = r2[r1]
            boolean r2 = io.bidmachine.media3.common.util.a1.isLinebreak(r2)
            if (r2 == 0) goto L8c
            goto Lc9
        L8c:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lad
        L9c:
            byte[] r2 = r4.f60748a
            r3 = r2[r1]
            if (r3 != 0) goto Lad
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = io.bidmachine.media3.common.util.a1.isLinebreak(r2)
            if (r2 == 0) goto Lad
            goto Lc9
        Lad:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc6
            byte[] r2 = r4.f60748a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto Lc6
            r2 = r2[r1]
            boolean r2 = io.bidmachine.media3.common.util.a1.isLinebreak(r2)
            if (r2 == 0) goto Lc6
            goto Lc9
        Lc6:
            int r1 = r1 + r0
            goto L69
        Lc8:
            r1 = r2
        Lc9:
            int r0 = r4.f60749b
            int r1 = r1 - r0
            java.lang.String r0 = r4.readString(r1, r5)
            int r1 = r4.f60749b
            int r2 = r4.f60750c
            if (r1 != r2) goto Ld7
            goto Le6
        Ld7:
            char[] r1 = io.bidmachine.media3.common.util.m0.f60745d
            char r1 = r4.b(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = io.bidmachine.media3.common.util.m0.f60746e
            r4.b(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.common.util.m0.readLine(java.nio.charset.Charset):java.lang.String");
    }

    public String readString(int i10, Charset charset) {
        String str = new String(this.f60748a, this.f60749b, i10, charset);
        this.f60749b += i10;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public m0(int i10) {
        this.f60748a = new byte[i10];
        this.f60750c = i10;
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f60748a, this.f60749b, bArr, i10, i11);
        this.f60749b += i11;
    }

    public void reset(byte[] bArr, int i10) {
        this.f60748a = bArr;
        this.f60750c = i10;
        this.f60749b = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f60748a, this.f60749b, i10);
        this.f60749b += i10;
    }

    public m0(byte[] bArr) {
        this.f60748a = bArr;
        this.f60750c = bArr.length;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public m0(byte[] bArr, int i10) {
        this.f60748a = bArr;
        this.f60750c = i10;
    }
}
