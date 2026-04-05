package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
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
/* loaded from: classes5.dex */
public final class w extends y {

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f22785e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f22786f;

    /* renamed from: g, reason: collision with root package name */
    public int f22787g;

    /* renamed from: h, reason: collision with root package name */
    public int f22788h;

    /* renamed from: i, reason: collision with root package name */
    public int f22789i;

    /* renamed from: j, reason: collision with root package name */
    public int f22790j;

    /* renamed from: k, reason: collision with root package name */
    public int f22791k;

    /* renamed from: l, reason: collision with root package name */
    public int f22792l = Integer.MAX_VALUE;

    public w(InputStream inputStream, int i10) {
        Charset charset = x7.f22881a;
        this.f22785e = inputStream;
        this.f22786f = new byte[i10];
        this.f22787g = 0;
        this.f22789i = 0;
        this.f22791k = 0;
    }

    @Override // com.explorestack.protobuf.y
    public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f22790j != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final byte[] d(int i10, boolean z10) throws IOException {
        byte[] bArrE = e(i10);
        if (bArrE != null) {
            return z10 ? (byte[]) bArrE.clone() : bArrE;
        }
        int i11 = this.f22789i;
        int i12 = this.f22787g;
        int length = i12 - i11;
        this.f22791k += i12;
        this.f22789i = 0;
        this.f22787g = 0;
        ArrayList arrayListF = f(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f22786f, i11, bArr, 0, length);
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
            return x7.f22883c;
        }
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.f22791k;
        int i12 = this.f22789i;
        int i13 = i11 + i12 + i10;
        if (i13 - this.f22897c > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i14 = this.f22792l;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i15 = this.f22787g - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f22785e;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f22786f, this.f22789i, bArr, 0, i15);
        this.f22791k += this.f22787g;
        this.f22789i = 0;
        this.f22787g = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f22791k += i17;
                i15 += i17;
            } catch (InvalidProtocolBufferException e11) {
                e11.setThrownFromInputStream();
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
                int i12 = this.f22785e.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f22791k += i12;
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
        throw InvalidProtocolBufferException.malformedVarint();
    }

    @Override // com.explorestack.protobuf.y
    public int getBytesUntilLimit() {
        int i10 = this.f22792l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f22791k + this.f22789i);
    }

    @Override // com.explorestack.protobuf.y
    public int getLastTag() {
        return this.f22790j;
    }

    @Override // com.explorestack.protobuf.y
    public int getTotalBytesRead() {
        return this.f22791k + this.f22789i;
    }

    public final void h() {
        int i10 = this.f22787g + this.f22788h;
        this.f22787g = i10;
        int i11 = this.f22791k + i10;
        int i12 = this.f22792l;
        if (i11 <= i12) {
            this.f22788h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f22788h = i13;
        this.f22787g = i10 - i13;
    }

    public final void i(int i10) throws InvalidProtocolBufferException {
        if (j(i10)) {
            return;
        }
        if (i10 <= (this.f22897c - this.f22791k) - this.f22789i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.sizeLimitExceeded();
    }

    @Override // com.explorestack.protobuf.y
    public boolean isAtEnd() throws IOException {
        return this.f22789i == this.f22787g && !j(1);
    }

    public final boolean j(int i10) throws IOException {
        InputStream inputStream = this.f22785e;
        int i11 = this.f22789i;
        int i12 = i11 + i10;
        int i13 = this.f22787g;
        if (i12 <= i13) {
            throw new IllegalStateException(p0.o2.k(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f22897c;
        int i15 = this.f22791k;
        if (i10 <= (i14 - i15) - i11 && i15 + i11 + i10 <= this.f22792l) {
            byte[] bArr = this.f22786f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f22791k += i11;
                this.f22787g -= i11;
                this.f22789i = 0;
            }
            int i16 = this.f22787g;
            try {
                int i17 = inputStream.read(bArr, i16, Math.min(bArr.length - i16, (this.f22897c - this.f22791k) - i16));
                if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                }
                if (i17 > 0) {
                    this.f22787g += i17;
                    h();
                    if (this.f22787g >= i10) {
                        return true;
                    }
                    return j(i10);
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }
        return false;
    }

    @Override // com.explorestack.protobuf.y
    public void popLimit(int i10) {
        this.f22792l = i10;
        h();
    }

    @Override // com.explorestack.protobuf.y
    public int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.f22791k + this.f22789i + i10;
        int i12 = this.f22792l;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22792l = i11;
        h();
        return i12;
    }

    @Override // com.explorestack.protobuf.y
    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    @Override // com.explorestack.protobuf.y
    public byte[] readByteArray() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f22787g;
        int i11 = this.f22789i;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return d(rawVarint32, false);
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f22786f, i11, i11 + rawVarint32);
        this.f22789i += rawVarint32;
        return bArrCopyOfRange;
    }

    @Override // com.explorestack.protobuf.y
    public ByteBuffer readByteBuffer() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f22787g;
        int i11 = this.f22789i;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? x7.f22884d : ByteBuffer.wrap(d(rawVarint32, true));
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f22786f, i11, i11 + rawVarint32));
        this.f22789i += rawVarint32;
        return byteBufferWrap;
    }

    @Override // com.explorestack.protobuf.y
    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f22787g;
        int i11 = this.f22789i;
        int i12 = i10 - i11;
        byte[] bArr = this.f22786f;
        if (rawVarint32 <= i12 && rawVarint32 > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i11, rawVarint32);
            this.f22789i += rawVarint32;
            return byteStringCopyFrom;
        }
        if (rawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        byte[] bArrE = e(rawVarint32);
        if (bArrE != null) {
            return ByteString.copyFrom(bArrE);
        }
        int i13 = this.f22789i;
        int i14 = this.f22787g;
        int length = i14 - i13;
        this.f22791k += i14;
        this.f22789i = 0;
        this.f22787g = 0;
        ArrayList arrayListF = f(rawVarint32 - length);
        byte[] bArr2 = new byte[rawVarint32];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return ByteString.wrap(bArr2);
    }

    @Override // com.explorestack.protobuf.y
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.explorestack.protobuf.y
    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    @Override // com.explorestack.protobuf.y
    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.explorestack.protobuf.y
    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.explorestack.protobuf.y
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.explorestack.protobuf.y
    public void readGroup(int i10, MessageLite.Builder builder, m5 m5Var) throws IOException {
        int i11 = this.f22895a;
        if (i11 >= this.f22896b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.f22895a = i11 + 1;
        builder.mergeFrom(this, m5Var);
        checkLastTagWas((i10 << 3) | 4);
        this.f22895a--;
    }

    @Override // com.explorestack.protobuf.y
    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.explorestack.protobuf.y
    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.explorestack.protobuf.y
    public void readMessage(MessageLite.Builder builder, m5 m5Var) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.f22895a >= this.f22896b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.f22895a++;
        builder.mergeFrom(this, m5Var);
        checkLastTagWas(0);
        this.f22895a--;
        popLimit(iPushLimit);
    }

    @Override // com.explorestack.protobuf.y
    public byte readRawByte() throws IOException {
        if (this.f22789i == this.f22787g) {
            i(1);
        }
        int i10 = this.f22789i;
        this.f22789i = i10 + 1;
        return this.f22786f[i10];
    }

    @Override // com.explorestack.protobuf.y
    public byte[] readRawBytes(int i10) throws IOException {
        int i11 = this.f22789i;
        if (i10 > this.f22787g - i11 || i10 <= 0) {
            return d(i10, false);
        }
        int i12 = i10 + i11;
        this.f22789i = i12;
        return Arrays.copyOfRange(this.f22786f, i11, i12);
    }

    @Override // com.explorestack.protobuf.y
    public int readRawLittleEndian32() throws IOException {
        int i10 = this.f22789i;
        if (this.f22787g - i10 < 4) {
            i(4);
            i10 = this.f22789i;
        }
        this.f22789i = i10 + 4;
        byte[] bArr = this.f22786f;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // com.explorestack.protobuf.y
    public long readRawLittleEndian64() throws IOException {
        int i10 = this.f22789i;
        if (this.f22787g - i10 < 8) {
            i(8);
            i10 = this.f22789i;
        }
        this.f22789i = i10 + 8;
        byte[] bArr = this.f22786f;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // com.explorestack.protobuf.y
    public int readRawVarint32() throws IOException {
        int i10;
        int i11 = this.f22789i;
        int i12 = this.f22787g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f22786f;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f22789i = i13;
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
                this.f22789i = i14;
                return i10;
            }
        }
        return (int) g();
    }

    @Override // com.explorestack.protobuf.y
    public long readRawVarint64() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f22789i;
        int i11 = this.f22787g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f22786f;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f22789i = i12;
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
                this.f22789i = i13;
                return j10;
            }
        }
        return g();
    }

    @Override // com.explorestack.protobuf.y
    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.explorestack.protobuf.y
    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.explorestack.protobuf.y
    public int readSInt32() throws IOException {
        return y.decodeZigZag32(readRawVarint32());
    }

    @Override // com.explorestack.protobuf.y
    public long readSInt64() throws IOException {
        return y.decodeZigZag64(readRawVarint64());
    }

    @Override // com.explorestack.protobuf.y
    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        byte[] bArr = this.f22786f;
        if (rawVarint32 > 0) {
            int i10 = this.f22787g;
            int i11 = this.f22789i;
            if (rawVarint32 <= i10 - i11) {
                String str = new String(bArr, i11, rawVarint32, x7.f22881a);
                this.f22789i += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 > this.f22787g) {
            return new String(d(rawVarint32, false), x7.f22881a);
        }
        i(rawVarint32);
        String str2 = new String(bArr, this.f22789i, rawVarint32, x7.f22881a);
        this.f22789i += rawVarint32;
        return str2;
    }

    @Override // com.explorestack.protobuf.y
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f22789i;
        int i11 = this.f22787g;
        int i12 = i11 - i10;
        byte[] bArrD = this.f22786f;
        if (rawVarint32 <= i12 && rawVarint32 > 0) {
            this.f22789i = i10 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            i10 = 0;
            if (rawVarint32 <= i11) {
                i(rawVarint32);
                this.f22789i = rawVarint32;
            } else {
                bArrD = d(rawVarint32, false);
            }
        }
        return vc.f22784a.d(bArrD, i10, rawVarint32);
    }

    @Override // com.explorestack.protobuf.y
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.f22790j = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f22790j = rawVarint32;
        if (hd.getTagFieldNumber(rawVarint32) != 0) {
            return this.f22790j;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.explorestack.protobuf.y
    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.explorestack.protobuf.y
    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.explorestack.protobuf.y
    @Deprecated
    public void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
        readGroup(i10, builder, m5.getEmptyRegistry());
    }

    @Override // com.explorestack.protobuf.y
    public void resetSizeCounter() {
        this.f22791k = -this.f22789i;
    }

    @Override // com.explorestack.protobuf.y
    public boolean skipField(int i10) throws IOException {
        int tagWireType = hd.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (this.f22787g - this.f22789i < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i11 < 10) {
                int i12 = this.f22789i;
                this.f22789i = i12 + 1;
                if (this.f22786f[i12] < 0) {
                    i11++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
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
            checkLastTagWas((hd.getTagFieldNumber(i10) << 3) | 4);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        skipRawBytes(4);
        return true;
    }

    @Override // com.explorestack.protobuf.y
    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag));
    }

    @Override // com.explorestack.protobuf.y
    public void skipRawBytes(int i10) throws IOException {
        int i11 = this.f22787g;
        int i12 = this.f22789i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f22789i = i12 + i10;
            return;
        }
        InputStream inputStream = this.f22785e;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i13 = this.f22791k;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.f22792l;
        if (i15 > i16) {
            skipRawBytes((i16 - i13) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22791k = i14;
        int i17 = i11 - i12;
        this.f22787g = 0;
        this.f22789i = 0;
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
                } catch (InvalidProtocolBufferException e10) {
                    e10.setThrownFromInputStream();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f22791k += i17;
                h();
                throw th2;
            }
        }
        this.f22791k += i17;
        h();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f22787g;
        int i19 = i18 - this.f22789i;
        this.f22789i = i18;
        i(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f22787g;
            if (i20 <= i21) {
                this.f22789i = i20;
                return;
            } else {
                i19 += i21;
                this.f22789i = i21;
                i(1);
            }
        }
    }

    @Override // com.explorestack.protobuf.y
    public void skipMessage(h0 h0Var) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, h0Var));
    }

    @Override // com.explorestack.protobuf.y
    public <T extends MessageLite> T readGroup(int i10, fa faVar, m5 m5Var) throws IOException {
        int i11 = this.f22895a;
        if (i11 < this.f22896b) {
            this.f22895a = i11 + 1;
            T t10 = (T) faVar.parsePartialFrom(this, m5Var);
            checkLastTagWas((i10 << 3) | 4);
            this.f22895a--;
            return t10;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    @Override // com.explorestack.protobuf.y
    public <T extends MessageLite> T readMessage(fa faVar, m5 m5Var) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.f22895a < this.f22896b) {
            int iPushLimit = pushLimit(rawVarint32);
            this.f22895a++;
            T t10 = (T) faVar.parsePartialFrom(this, m5Var);
            checkLastTagWas(0);
            this.f22895a--;
            popLimit(iPushLimit);
            return t10;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    @Override // com.explorestack.protobuf.y
    public boolean skipField(int i10, h0 h0Var) throws IOException {
        int tagWireType = hd.getTagWireType(i10);
        if (tagWireType == 0) {
            long int64 = readInt64();
            h0Var.writeRawVarint32(i10);
            h0Var.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            h0Var.writeRawVarint32(i10);
            h0Var.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            h0Var.writeRawVarint32(i10);
            h0Var.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            h0Var.writeRawVarint32(i10);
            skipMessage(h0Var);
            int tagFieldNumber = (hd.getTagFieldNumber(i10) << 3) | 4;
            checkLastTagWas(tagFieldNumber);
            h0Var.writeRawVarint32(tagFieldNumber);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int rawLittleEndian32 = readRawLittleEndian32();
            h0Var.writeRawVarint32(i10);
            h0Var.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.explorestack.protobuf.y
    public void enableAliasing(boolean z10) {
    }
}
