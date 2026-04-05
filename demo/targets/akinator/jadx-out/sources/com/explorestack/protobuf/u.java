package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends y {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f22677e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22678f;

    /* renamed from: g, reason: collision with root package name */
    public int f22679g;

    /* renamed from: h, reason: collision with root package name */
    public int f22680h;

    /* renamed from: i, reason: collision with root package name */
    public int f22681i;

    /* renamed from: j, reason: collision with root package name */
    public int f22682j;

    /* renamed from: k, reason: collision with root package name */
    public int f22683k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22684l;

    /* renamed from: m, reason: collision with root package name */
    public int f22685m = Integer.MAX_VALUE;

    public u(byte[] bArr, int i10, int i11, boolean z10) {
        this.f22677e = bArr;
        this.f22679g = i11 + i10;
        this.f22681i = i10;
        this.f22682j = i10;
        this.f22678f = z10;
    }

    @Override // com.explorestack.protobuf.y
    public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f22683k != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final long d() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & AbstractJsonLexerKt.TC_INVALID) << i10;
            if ((readRawByte() & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public final void e() {
        int i10 = this.f22679g + this.f22680h;
        this.f22679g = i10;
        int i11 = i10 - this.f22682j;
        int i12 = this.f22685m;
        if (i11 <= i12) {
            this.f22680h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f22680h = i13;
        this.f22679g = i10 - i13;
    }

    @Override // com.explorestack.protobuf.y
    public void enableAliasing(boolean z10) {
        this.f22684l = z10;
    }

    @Override // com.explorestack.protobuf.y
    public int getBytesUntilLimit() {
        int i10 = this.f22685m;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // com.explorestack.protobuf.y
    public int getLastTag() {
        return this.f22683k;
    }

    @Override // com.explorestack.protobuf.y
    public int getTotalBytesRead() {
        return this.f22681i - this.f22682j;
    }

    @Override // com.explorestack.protobuf.y
    public boolean isAtEnd() throws IOException {
        return this.f22681i == this.f22679g;
    }

    @Override // com.explorestack.protobuf.y
    public void popLimit(int i10) {
        this.f22685m = i10;
        e();
    }

    @Override // com.explorestack.protobuf.y
    public int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        if (totalBytesRead < 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        int i11 = this.f22685m;
        if (totalBytesRead > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22685m = totalBytesRead;
        e();
        return i11;
    }

    @Override // com.explorestack.protobuf.y
    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    @Override // com.explorestack.protobuf.y
    public byte[] readByteArray() throws IOException {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.explorestack.protobuf.y
    public ByteBuffer readByteBuffer() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f22679g;
            int i11 = this.f22681i;
            if (rawVarint32 <= i10 - i11) {
                boolean z10 = this.f22678f;
                byte[] bArr = this.f22677e;
                ByteBuffer byteBufferWrap = (z10 || !this.f22684l) ? ByteBuffer.wrap(Arrays.copyOfRange(bArr, i11, i11 + rawVarint32)) : ByteBuffer.wrap(bArr, i11, rawVarint32).slice();
                this.f22681i += rawVarint32;
                return byteBufferWrap;
            }
        }
        if (rawVarint32 == 0) {
            return x7.f22884d;
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.explorestack.protobuf.y
    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f22679g;
            int i11 = this.f22681i;
            if (rawVarint32 <= i10 - i11) {
                boolean z10 = this.f22678f;
                byte[] bArr = this.f22677e;
                ByteString byteStringWrap = (z10 && this.f22684l) ? ByteString.wrap(bArr, i11, rawVarint32) : ByteString.copyFrom(bArr, i11, rawVarint32);
                this.f22681i += rawVarint32;
                return byteStringWrap;
            }
        }
        return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
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
        int i10 = this.f22681i;
        if (i10 == this.f22679g) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22681i = i10 + 1;
        return this.f22677e[i10];
    }

    @Override // com.explorestack.protobuf.y
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 > 0) {
            int i11 = this.f22679g;
            int i12 = this.f22681i;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.f22681i = i13;
                return Arrays.copyOfRange(this.f22677e, i12, i13);
            }
        }
        if (i10 > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i10 == 0) {
            return x7.f22883c;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.explorestack.protobuf.y
    public int readRawLittleEndian32() throws IOException {
        int i10 = this.f22681i;
        if (this.f22679g - i10 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22681i = i10 + 4;
        byte[] bArr = this.f22677e;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // com.explorestack.protobuf.y
    public long readRawLittleEndian64() throws IOException {
        int i10 = this.f22681i;
        if (this.f22679g - i10 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22681i = i10 + 8;
        byte[] bArr = this.f22677e;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // com.explorestack.protobuf.y
    public int readRawVarint32() throws IOException {
        int i10;
        int i11 = this.f22681i;
        int i12 = this.f22679g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f22677e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f22681i = i13;
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
                this.f22681i = i14;
                return i10;
            }
        }
        return (int) d();
    }

    @Override // com.explorestack.protobuf.y
    public long readRawVarint64() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f22681i;
        int i11 = this.f22679g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f22677e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f22681i = i12;
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
                this.f22681i = i13;
                return j10;
            }
        }
        return d();
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
        if (rawVarint32 > 0) {
            int i10 = this.f22679g;
            int i11 = this.f22681i;
            if (rawVarint32 <= i10 - i11) {
                String str = new String(this.f22677e, i11, rawVarint32, x7.f22881a);
                this.f22681i += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.explorestack.protobuf.y
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f22679g;
            int i11 = this.f22681i;
            if (rawVarint32 <= i10 - i11) {
                String strD = vc.f22784a.d(this.f22677e, i11, rawVarint32);
                this.f22681i += rawVarint32;
                return strD;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.explorestack.protobuf.y
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.f22683k = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f22683k = rawVarint32;
        if (hd.getTagFieldNumber(rawVarint32) != 0) {
            return this.f22683k;
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
        this.f22682j = this.f22681i;
    }

    @Override // com.explorestack.protobuf.y
    public boolean skipField(int i10) throws IOException {
        int tagWireType = hd.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (this.f22679g - this.f22681i < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i11 < 10) {
                int i12 = this.f22681i;
                this.f22681i = i12 + 1;
                if (this.f22677e[i12] < 0) {
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
        if (i10 >= 0) {
            int i11 = this.f22679g;
            int i12 = this.f22681i;
            if (i10 <= i11 - i12) {
                this.f22681i = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
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
}
