package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6121e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6122f;

    /* renamed from: g, reason: collision with root package name */
    public int f6123g;

    /* renamed from: h, reason: collision with root package name */
    public int f6124h;

    /* renamed from: i, reason: collision with root package name */
    public int f6125i;

    /* renamed from: j, reason: collision with root package name */
    public int f6126j;

    /* renamed from: k, reason: collision with root package name */
    public int f6127k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6128l;

    /* renamed from: m, reason: collision with root package name */
    public int f6129m = Integer.MAX_VALUE;

    public y(byte[] bArr, int i10, int i11, boolean z10) {
        this.f6121e = bArr;
        this.f6123g = i11 + i10;
        this.f6125i = i10;
        this.f6126j = i10;
        this.f6122f = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void checkLastTagWas(int i10) throws u1 {
        if (this.f6127k != i10) {
            throw u1.a();
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
        throw u1.e();
    }

    public final void e() {
        int i10 = this.f6123g + this.f6124h;
        this.f6123g = i10;
        int i11 = i10 - this.f6126j;
        int i12 = this.f6129m;
        if (i11 <= i12) {
            this.f6124h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f6124h = i13;
        this.f6123g = i10 - i13;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void enableAliasing(boolean z10) {
        this.f6128l = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getBytesUntilLimit() {
        int i10 = this.f6129m;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getLastTag() {
        return this.f6127k;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getTotalBytesRead() {
        return this.f6125i - this.f6126j;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean isAtEnd() throws IOException {
        return this.f6125i == this.f6123g;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void popLimit(int i10) {
        this.f6129m = i10;
        e();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int pushLimit(int i10) throws u1 {
        if (i10 < 0) {
            throw u1.f();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        if (totalBytesRead < 0) {
            throw u1.g();
        }
        int i11 = this.f6129m;
        if (totalBytesRead > i11) {
            throw u1.h();
        }
        this.f6129m = totalBytesRead;
        e();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public byte[] readByteArray() throws IOException {
        return readRawBytes(readRawVarint32());
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public ByteBuffer readByteBuffer() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f6123g;
            int i11 = this.f6125i;
            if (rawVarint32 <= i10 - i11) {
                boolean z10 = this.f6122f;
                byte[] bArr = this.f6121e;
                ByteBuffer byteBufferWrap = (z10 || !this.f6128l) ? ByteBuffer.wrap(Arrays.copyOfRange(bArr, i11, i11 + rawVarint32)) : ByteBuffer.wrap(bArr, i11, rawVarint32).slice();
                this.f6125i += rawVarint32;
                return byteBufferWrap;
            }
        }
        if (rawVarint32 == 0) {
            return t1.f6009d;
        }
        if (rawVarint32 < 0) {
            throw u1.f();
        }
        throw u1.h();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public x readBytes() throws IOException {
        x xVarCopyFrom;
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f6123g;
            int i11 = this.f6125i;
            if (rawVarint32 <= i10 - i11) {
                boolean z10 = this.f6122f;
                byte[] bArr = this.f6121e;
                if (z10 && this.f6128l) {
                    s sVar = x.f6099c;
                    xVarCopyFrom = new n(bArr, i11, rawVarint32);
                } else {
                    xVarCopyFrom = x.copyFrom(bArr, i11, rawVarint32);
                }
                this.f6125i += rawVarint32;
                return xVarCopyFrom;
            }
        }
        if (rawVarint32 == 0) {
            return x.f6099c;
        }
        byte[] rawBytes = readRawBytes(rawVarint32);
        s sVar2 = x.f6099c;
        return new s(rawBytes);
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
        int i10 = this.f6125i;
        if (i10 == this.f6123g) {
            throw u1.h();
        }
        this.f6125i = i10 + 1;
        return this.f6121e[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 > 0) {
            int i11 = this.f6123g;
            int i12 = this.f6125i;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.f6125i = i13;
                return Arrays.copyOfRange(this.f6121e, i12, i13);
            }
        }
        if (i10 > 0) {
            throw u1.h();
        }
        if (i10 == 0) {
            return t1.f6008c;
        }
        throw u1.f();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readRawLittleEndian32() throws IOException {
        int i10 = this.f6125i;
        if (this.f6123g - i10 < 4) {
            throw u1.h();
        }
        this.f6125i = i10 + 4;
        byte[] bArr = this.f6121e;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readRawLittleEndian64() throws IOException {
        int i10 = this.f6125i;
        if (this.f6123g - i10 < 8) {
            throw u1.h();
        }
        this.f6125i = i10 + 8;
        byte[] bArr = this.f6121e;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readRawVarint32() throws IOException {
        int i10;
        int i11 = this.f6125i;
        int i12 = this.f6123g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f6121e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f6125i = i13;
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
                this.f6125i = i14;
                return i10;
            }
        }
        return (int) d();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readRawVarint64() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f6125i;
        int i11 = this.f6123g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f6121e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f6125i = i12;
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
                this.f6125i = i13;
                return j10;
            }
        }
        return d();
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
        if (rawVarint32 > 0) {
            int i10 = this.f6123g;
            int i11 = this.f6125i;
            if (rawVarint32 <= i10 - i11) {
                String str = new String(this.f6121e, i11, rawVarint32, t1.f6006a);
                this.f6125i += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw u1.f();
        }
        throw u1.h();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f6123g;
            int i11 = this.f6125i;
            if (rawVarint32 <= i10 - i11) {
                String strG = m4.f5958a.g(this.f6121e, i11, rawVarint32);
                this.f6125i += rawVarint32;
                return strG;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 <= 0) {
            throw u1.f();
        }
        throw u1.h();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.f6127k = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f6127k = rawVarint32;
        if (t4.getTagFieldNumber(rawVarint32) != 0) {
            return this.f6127k;
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
        this.f6126j = this.f6125i;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean skipField(int i10) throws IOException {
        int tagWireType = t4.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (this.f6123g - this.f6125i < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw u1.e();
            }
            while (i11 < 10) {
                int i12 = this.f6125i;
                this.f6125i = i12 + 1;
                if (this.f6121e[i12] < 0) {
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
        if (i10 >= 0) {
            int i11 = this.f6123g;
            int i12 = this.f6125i;
            if (i10 <= i11 - i12) {
                this.f6125i = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw u1.h();
        }
        throw u1.f();
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
}
