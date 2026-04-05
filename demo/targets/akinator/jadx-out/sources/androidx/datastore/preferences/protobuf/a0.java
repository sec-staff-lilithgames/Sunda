package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f5788e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f5789f;

    /* renamed from: g, reason: collision with root package name */
    public int f5790g;

    /* renamed from: h, reason: collision with root package name */
    public int f5791h;

    /* renamed from: i, reason: collision with root package name */
    public int f5792i;

    /* renamed from: j, reason: collision with root package name */
    public int f5793j;

    /* renamed from: k, reason: collision with root package name */
    public int f5794k;

    /* renamed from: l, reason: collision with root package name */
    public int f5795l = Integer.MAX_VALUE;

    public a0(InputStream inputStream, int i10) {
        Charset charset = t1.f6006a;
        this.f5788e = inputStream;
        this.f5789f = new byte[i10];
        this.f5790g = 0;
        this.f5792i = 0;
        this.f5794k = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void checkLastTagWas(int i10) throws u1 {
        if (this.f5793j != i10) {
            throw u1.a();
        }
    }

    public final byte[] d(int i10, boolean z10) throws IOException {
        byte[] bArrE = e(i10);
        if (bArrE != null) {
            return z10 ? (byte[]) bArrE.clone() : bArrE;
        }
        int i11 = this.f5792i;
        int i12 = this.f5790g;
        int length = i12 - i11;
        this.f5794k += i12;
        this.f5792i = 0;
        this.f5790g = 0;
        ArrayList arrayListF = f(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f5789f, i11, bArr, 0, length);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] e(int i10) throws IOException {
        if (i10 == 0) {
            return t1.f6008c;
        }
        if (i10 < 0) {
            throw u1.f();
        }
        int i11 = this.f5794k;
        int i12 = this.f5792i;
        int i13 = i11 + i12 + i10;
        if (i13 - this.f5828c > 0) {
            throw new u1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f5795l;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw u1.h();
        }
        int i15 = this.f5790g - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f5788e;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (u1 e10) {
                e10.f6017c = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f5789f, this.f5792i, bArr, 0, i15);
        this.f5794k += this.f5790g;
        this.f5792i = 0;
        this.f5790g = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw u1.h();
                }
                this.f5794k += i17;
                i15 += i17;
            } catch (u1 e11) {
                e11.f6017c = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList f(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f5788e.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw u1.h();
                }
                this.f5794k += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long g() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & AbstractJsonLexerKt.TC_INVALID) << i10;
            if ((readRawByte() & 128) == 0) {
                return j10;
            }
        }
        throw u1.e();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getBytesUntilLimit() {
        int i10 = this.f5795l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f5794k + this.f5792i);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getLastTag() {
        return this.f5793j;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getTotalBytesRead() {
        return this.f5794k + this.f5792i;
    }

    public final void h() {
        int i10 = this.f5790g + this.f5791h;
        this.f5790g = i10;
        int i11 = this.f5794k + i10;
        int i12 = this.f5795l;
        if (i11 <= i12) {
            this.f5791h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f5791h = i13;
        this.f5790g = i10 - i13;
    }

    public final void i(int i10) throws u1 {
        if (j(i10)) {
            return;
        }
        if (i10 <= (this.f5828c - this.f5794k) - this.f5792i) {
            throw u1.h();
        }
        throw new u1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean isAtEnd() throws IOException {
        return this.f5792i == this.f5790g && !j(1);
    }

    public final boolean j(int i10) throws IOException {
        InputStream inputStream = this.f5788e;
        int i11 = this.f5792i;
        int i12 = i11 + i10;
        int i13 = this.f5790g;
        if (i12 <= i13) {
            throw new IllegalStateException(p0.o2.k(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f5828c;
        int i15 = this.f5794k;
        if (i10 <= (i14 - i15) - i11 && i15 + i11 + i10 <= this.f5795l) {
            byte[] bArr = this.f5789f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f5794k += i11;
                this.f5790g -= i11;
                this.f5792i = 0;
            }
            int i16 = this.f5790g;
            try {
                int i17 = inputStream.read(bArr, i16, Math.min(bArr.length - i16, (this.f5828c - this.f5794k) - i16));
                if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                }
                if (i17 > 0) {
                    this.f5790g += i17;
                    h();
                    if (this.f5790g >= i10) {
                        return true;
                    }
                    return j(i10);
                }
            } catch (u1 e10) {
                e10.f6017c = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void popLimit(int i10) {
        this.f5795l = i10;
        h();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int pushLimit(int i10) throws u1 {
        if (i10 < 0) {
            throw u1.f();
        }
        int i11 = this.f5794k + this.f5792i + i10;
        if (i11 < 0) {
            throw u1.g();
        }
        int i12 = this.f5795l;
        if (i11 > i12) {
            throw u1.h();
        }
        this.f5795l = i11;
        h();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public byte[] readByteArray() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f5790g;
        int i11 = this.f5792i;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            if (rawVarint32 >= 0) {
                return d(rawVarint32, false);
            }
            throw u1.f();
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f5789f, i11, i11 + rawVarint32);
        this.f5792i += rawVarint32;
        return bArrCopyOfRange;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public ByteBuffer readByteBuffer() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f5790g;
        int i11 = this.f5792i;
        if (rawVarint32 <= i10 - i11 && rawVarint32 > 0) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f5789f, i11, i11 + rawVarint32));
            this.f5792i += rawVarint32;
            return byteBufferWrap;
        }
        if (rawVarint32 == 0) {
            return t1.f6009d;
        }
        if (rawVarint32 >= 0) {
            return ByteBuffer.wrap(d(rawVarint32, true));
        }
        throw u1.f();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public x readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f5790g;
        int i11 = this.f5792i;
        int i12 = i10 - i11;
        byte[] bArr = this.f5789f;
        if (rawVarint32 <= i12 && rawVarint32 > 0) {
            x xVarCopyFrom = x.copyFrom(bArr, i11, rawVarint32);
            this.f5792i += rawVarint32;
            return xVarCopyFrom;
        }
        if (rawVarint32 == 0) {
            return x.f6099c;
        }
        if (rawVarint32 < 0) {
            throw u1.f();
        }
        byte[] bArrE = e(rawVarint32);
        if (bArrE != null) {
            return x.copyFrom(bArrE);
        }
        int i13 = this.f5792i;
        int i14 = this.f5790g;
        int length = i14 - i13;
        this.f5794k += i14;
        this.f5792i = 0;
        this.f5790g = 0;
        ArrayList arrayListF = f(rawVarint32 - length);
        byte[] bArr2 = new byte[rawVarint32];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        s sVar = x.f6099c;
        return new s(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void readGroup(int i10, q2 q2Var, s0 s0Var) throws IOException {
        checkRecursionLimit();
        this.f5826a++;
        q2Var.mergeFrom(this, s0Var);
        checkLastTagWas((i10 << 3) | 4);
        this.f5826a--;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void readMessage(q2 q2Var, s0 s0Var) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.f5826a++;
        q2Var.mergeFrom(this, s0Var);
        checkLastTagWas(0);
        this.f5826a--;
        if (getBytesUntilLimit() != 0) {
            throw u1.h();
        }
        popLimit(iPushLimit);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public byte readRawByte() throws IOException {
        if (this.f5792i == this.f5790g) {
            i(1);
        }
        int i10 = this.f5792i;
        this.f5792i = i10 + 1;
        return this.f5789f[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public byte[] readRawBytes(int i10) throws IOException {
        int i11 = this.f5792i;
        if (i10 > this.f5790g - i11 || i10 <= 0) {
            return d(i10, false);
        }
        int i12 = i10 + i11;
        this.f5792i = i12;
        return Arrays.copyOfRange(this.f5789f, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readRawLittleEndian32() throws IOException {
        int i10 = this.f5792i;
        if (this.f5790g - i10 < 4) {
            i(4);
            i10 = this.f5792i;
        }
        this.f5792i = i10 + 4;
        byte[] bArr = this.f5789f;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readRawLittleEndian64() throws IOException {
        int i10 = this.f5792i;
        if (this.f5790g - i10 < 8) {
            i(8);
            i10 = this.f5792i;
        }
        this.f5792i = i10 + 8;
        byte[] bArr = this.f5789f;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readRawVarint32() throws IOException {
        int i10;
        int i11 = this.f5792i;
        int i12 = this.f5790g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f5789f;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f5792i = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f5792i = i14;
                return i10;
            }
        }
        return (int) g();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readRawVarint64() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f5792i;
        int i11 = this.f5790g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f5789f;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f5792i = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (bArr[i17] << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (bArr[i13] << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (bArr[i17] << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (bArr[i13] << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.f5792i = i13;
                return j10;
            }
        }
        return g();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readSInt32() throws IOException {
        return c0.decodeZigZag32(readRawVarint32());
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readSInt64() throws IOException {
        return c0.decodeZigZag64(readRawVarint64());
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        byte[] bArr = this.f5789f;
        if (rawVarint32 > 0) {
            int i10 = this.f5790g;
            int i11 = this.f5792i;
            if (rawVarint32 <= i10 - i11) {
                String str = new String(bArr, i11, rawVarint32, t1.f6006a);
                this.f5792i += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw u1.f();
        }
        if (rawVarint32 > this.f5790g) {
            return new String(d(rawVarint32, false), t1.f6006a);
        }
        i(rawVarint32);
        String str2 = new String(bArr, this.f5792i, rawVarint32, t1.f6006a);
        this.f5792i += rawVarint32;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f5792i;
        int i11 = this.f5790g;
        int i12 = i11 - i10;
        byte[] bArrD = this.f5789f;
        if (rawVarint32 <= i12 && rawVarint32 > 0) {
            this.f5792i = i10 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw u1.f();
            }
            i10 = 0;
            if (rawVarint32 <= i11) {
                i(rawVarint32);
                this.f5792i = rawVarint32;
            } else {
                bArrD = d(rawVarint32, false);
            }
        }
        return m4.f5958a.g(bArrD, i10, rawVarint32);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.f5793j = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f5793j = rawVarint32;
        if (t4.getTagFieldNumber(rawVarint32) != 0) {
            return this.f5793j;
        }
        throw u1.b();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    @Deprecated
    public void readUnknownGroup(int i10, q2 q2Var) throws IOException {
        readGroup(i10, q2Var, s0.getEmptyRegistry());
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void resetSizeCounter() {
        this.f5794k = -this.f5792i;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean skipField(int i10) throws IOException {
        int tagWireType = t4.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (this.f5790g - this.f5792i < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw u1.e();
            }
            while (i11 < 10) {
                int i12 = this.f5792i;
                this.f5792i = i12 + 1;
                if (this.f5789f[i12] < 0) {
                    i11++;
                }
            }
            throw u1.e();
            return true;
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas((t4.getTagFieldNumber(i10) << 3) | 4);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw u1.d();
        }
        skipRawBytes(4);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void skipRawBytes(int i10) throws IOException {
        int i11 = this.f5790g;
        int i12 = this.f5792i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f5792i = i12 + i10;
            return;
        }
        InputStream inputStream = this.f5788e;
        if (i10 < 0) {
            throw u1.f();
        }
        int i13 = this.f5794k;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.f5795l;
        if (i15 > i16) {
            skipRawBytes((i16 - i13) - i12);
            throw u1.h();
        }
        this.f5794k = i14;
        int i17 = i11 - i12;
        this.f5790g = 0;
        this.f5792i = 0;
        while (i17 < i10) {
            long j10 = i10 - i17;
            try {
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } catch (u1 e10) {
                    e10.f6017c = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f5794k += i17;
                h();
                throw th2;
            }
        }
        this.f5794k += i17;
        h();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f5790g;
        int i19 = i18 - this.f5792i;
        this.f5792i = i18;
        i(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f5790g;
            if (i20 <= i21) {
                this.f5792i = i20;
                return;
            } else {
                i19 += i21;
                this.f5792i = i21;
                i(1);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public <T extends r2> T readGroup(int i10, a3 a3Var, s0 s0Var) throws IOException {
        checkRecursionLimit();
        this.f5826a++;
        T t10 = (T) a3Var.parsePartialFrom(this, s0Var);
        checkLastTagWas((i10 << 3) | 4);
        this.f5826a--;
        return t10;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public <T extends r2> T readMessage(a3 a3Var, s0 s0Var) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.f5826a++;
        T t10 = (T) a3Var.parsePartialFrom(this, s0Var);
        checkLastTagWas(0);
        this.f5826a--;
        if (getBytesUntilLimit() == 0) {
            popLimit(iPushLimit);
            return t10;
        }
        throw u1.h();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean skipField(int i10, l0 l0Var) throws IOException {
        int tagWireType = t4.getTagWireType(i10);
        if (tagWireType == 0) {
            long int64 = readInt64();
            l0Var.writeUInt32NoTag(i10);
            l0Var.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            l0Var.writeUInt32NoTag(i10);
            l0Var.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            x bytes = readBytes();
            l0Var.writeUInt32NoTag(i10);
            l0Var.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            l0Var.writeUInt32NoTag(i10);
            skipMessage(l0Var);
            int tagFieldNumber = (t4.getTagFieldNumber(i10) << 3) | 4;
            checkLastTagWas(tagFieldNumber);
            l0Var.writeUInt32NoTag(tagFieldNumber);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int rawLittleEndian32 = readRawLittleEndian32();
            l0Var.writeUInt32NoTag(i10);
            l0Var.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }
        throw u1.d();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void enableAliasing(boolean z10) {
    }
}
