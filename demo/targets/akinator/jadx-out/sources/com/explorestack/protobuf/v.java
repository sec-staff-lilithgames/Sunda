package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends y {

    /* renamed from: e, reason: collision with root package name */
    public Iterable f22728e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f22729f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f22730g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22731h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22732i;

    /* renamed from: j, reason: collision with root package name */
    public int f22733j;

    /* renamed from: k, reason: collision with root package name */
    public int f22734k;

    /* renamed from: l, reason: collision with root package name */
    public int f22735l;

    /* renamed from: m, reason: collision with root package name */
    public int f22736m;

    /* renamed from: n, reason: collision with root package name */
    public int f22737n;

    /* renamed from: o, reason: collision with root package name */
    public int f22738o;

    /* renamed from: p, reason: collision with root package name */
    public long f22739p;

    /* renamed from: q, reason: collision with root package name */
    public long f22740q;

    /* renamed from: r, reason: collision with root package name */
    public long f22741r;

    /* renamed from: s, reason: collision with root package name */
    public long f22742s;

    @Override // com.explorestack.protobuf.y
    public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f22736m != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final long d() {
        return this.f22742s - this.f22739p;
    }

    public final void e() throws InvalidProtocolBufferException {
        if (!this.f22729f.hasNext()) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        k();
    }

    @Override // com.explorestack.protobuf.y
    public void enableAliasing(boolean z10) {
        this.f22732i = z10;
    }

    public final void f(int i10, byte[] bArr) throws InvalidProtocolBufferException {
        if (i10 < 0 || i10 > i()) {
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            return;
        }
        int i11 = i10;
        while (i11 > 0) {
            if (d() == 0) {
                e();
            }
            int iMin = Math.min(i11, (int) d());
            long j10 = iMin;
            sc.g(this.f22739p, bArr, i10 - i11, j10);
            i11 -= iMin;
            this.f22739p += j10;
        }
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
        int i10 = this.f22735l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // com.explorestack.protobuf.y
    public int getLastTag() {
        return this.f22736m;
    }

    @Override // com.explorestack.protobuf.y
    public int getTotalBytesRead() {
        return (int) (((this.f22737n - this.f22738o) + this.f22739p) - this.f22740q);
    }

    public final void h() {
        int i10 = this.f22733j + this.f22734k;
        this.f22733j = i10;
        int i11 = i10 - this.f22738o;
        int i12 = this.f22735l;
        if (i11 <= i12) {
            this.f22734k = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f22734k = i13;
        this.f22733j = i10 - i13;
    }

    public final int i() {
        return (int) (((this.f22733j - this.f22737n) - this.f22739p) + this.f22740q);
    }

    @Override // com.explorestack.protobuf.y
    public boolean isAtEnd() throws IOException {
        return (((long) this.f22737n) + this.f22739p) - this.f22740q == ((long) this.f22733j);
    }

    public final ByteBuffer j(int i10, int i11) {
        int iPosition = this.f22730g.position();
        int iLimit = this.f22730g.limit();
        try {
            try {
                this.f22730g.position(i10);
                this.f22730g.limit(i11);
                return this.f22730g.slice();
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } finally {
            this.f22730g.position(iPosition);
            this.f22730g.limit(iLimit);
        }
    }

    public final void k() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f22729f.next();
        this.f22730g = byteBuffer;
        this.f22737n += (int) (this.f22739p - this.f22740q);
        long jPosition = byteBuffer.position();
        this.f22739p = jPosition;
        this.f22740q = jPosition;
        this.f22742s = this.f22730g.limit();
        long jB = sc.b(this.f22730g);
        this.f22741r = jB;
        this.f22739p += jB;
        this.f22740q += jB;
        this.f22742s += jB;
    }

    @Override // com.explorestack.protobuf.y
    public void popLimit(int i10) {
        this.f22735l = i10;
        h();
    }

    @Override // com.explorestack.protobuf.y
    public int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        int i11 = this.f22735l;
        if (totalBytesRead > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22735l = totalBytesRead;
        h();
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
            long j10 = rawVarint32;
            if (j10 <= d()) {
                if (this.f22731h || !this.f22732i) {
                    byte[] bArr = new byte[rawVarint32];
                    sc.g(this.f22739p, bArr, 0L, j10);
                    this.f22739p += j10;
                    return ByteBuffer.wrap(bArr);
                }
                long j11 = this.f22739p + j10;
                this.f22739p = j11;
                long j12 = j11 - this.f22741r;
                return j((int) (j12 - j10), (int) j12);
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= i()) {
            byte[] bArr2 = new byte[rawVarint32];
            f(rawVarint32, bArr2);
            return ByteBuffer.wrap(bArr2);
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
        boolean z10 = this.f22731h;
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            long j10 = rawVarint32;
            long j11 = this.f22742s;
            long j12 = this.f22739p;
            if (j10 <= j11 - j12) {
                if (z10 && this.f22732i) {
                    int i10 = (int) (j12 - this.f22741r);
                    ByteString byteStringWrap = ByteString.wrap(j(i10, rawVarint32 + i10));
                    this.f22739p += j10;
                    return byteStringWrap;
                }
                byte[] bArr = new byte[rawVarint32];
                sc.g(j12, bArr, 0L, j10);
                this.f22739p += j10;
                return ByteString.wrap(bArr);
            }
        }
        if (rawVarint32 <= 0 || rawVarint32 > i()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (!z10 || !this.f22732i) {
            byte[] bArr2 = new byte[rawVarint32];
            f(rawVarint32, bArr2);
            return ByteString.wrap(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        while (rawVarint32 > 0) {
            if (d() == 0) {
                e();
            }
            int iMin = Math.min(rawVarint32, (int) d());
            int i11 = (int) (this.f22739p - this.f22741r);
            arrayList.add(ByteString.wrap(j(i11, i11 + iMin)));
            rawVarint32 -= iMin;
            this.f22739p += iMin;
        }
        return ByteString.copyFrom(arrayList);
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
        if (d() == 0) {
            e();
        }
        long j10 = this.f22739p;
        this.f22739p = 1 + j10;
        return sc.f22643c.getByte(j10);
    }

    @Override // com.explorestack.protobuf.y
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 >= 0) {
            long j10 = i10;
            if (j10 <= d()) {
                byte[] bArr = new byte[i10];
                sc.g(this.f22739p, bArr, 0L, j10);
                this.f22739p += j10;
                return bArr;
            }
        }
        if (i10 >= 0 && i10 <= i()) {
            byte[] bArr2 = new byte[i10];
            f(i10, bArr2);
            return bArr2;
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
        if (d() < 4) {
            return (readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
        }
        long j10 = this.f22739p;
        this.f22739p = 4 + j10;
        rc rcVar = sc.f22643c;
        return ((rcVar.getByte(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (rcVar.getByte(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((rcVar.getByte(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((rcVar.getByte(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // com.explorestack.protobuf.y
    public long readRawLittleEndian64() throws IOException {
        if (d() < 8) {
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }
        this.f22739p = 8 + this.f22739p;
        rc rcVar = sc.f22643c;
        return (rcVar.getByte(r13) & 255) | ((rcVar.getByte(r13 + 1) & 255) << 8) | ((rcVar.getByte(r13 + 2) & 255) << 16) | ((rcVar.getByte(3 + r13) & 255) << 24) | ((rcVar.getByte(4 + r13) & 255) << 32) | ((rcVar.getByte(5 + r13) & 255) << 40) | ((rcVar.getByte(6 + r13) & 255) << 48) | ((rcVar.getByte(r13 + 7) & 255) << 56);
    }

    @Override // com.explorestack.protobuf.y
    public int readRawVarint32() throws IOException {
        int i10;
        long j10 = this.f22739p;
        if (this.f22742s != j10) {
            long j11 = j10 + 1;
            rc rcVar = sc.f22643c;
            byte b10 = rcVar.getByte(j10);
            if (b10 >= 0) {
                this.f22739p++;
                return b10;
            }
            if (this.f22742s - this.f22739p >= 10) {
                long j12 = 2 + j10;
                int i11 = (rcVar.getByte(j11) << 7) ^ b10;
                if (i11 < 0) {
                    i10 = i11 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int i12 = (rcVar.getByte(j12) << 14) ^ i11;
                    if (i12 >= 0) {
                        i10 = i12 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int i13 = i12 ^ (rcVar.getByte(j13) << 21);
                        if (i13 < 0) {
                            i10 = (-2080896) ^ i13;
                        } else {
                            j13 = 5 + j10;
                            byte b11 = rcVar.getByte(j14);
                            int i14 = (i13 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                j14 = 6 + j10;
                                if (rcVar.getByte(j13) < 0) {
                                    j13 = 7 + j10;
                                    if (rcVar.getByte(j14) < 0) {
                                        j14 = 8 + j10;
                                        if (rcVar.getByte(j13) < 0) {
                                            j13 = 9 + j10;
                                            if (rcVar.getByte(j14) < 0) {
                                                long j15 = j10 + 10;
                                                if (rcVar.getByte(j13) >= 0) {
                                                    i10 = i14;
                                                    j12 = j15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i14;
                            }
                            i10 = i14;
                        }
                        j12 = j14;
                    }
                    j12 = j13;
                }
                this.f22739p = j12;
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
        long j13 = this.f22739p;
        if (this.f22742s != j13) {
            long j14 = j13 + 1;
            rc rcVar = sc.f22643c;
            byte b10 = rcVar.getByte(j13);
            if (b10 >= 0) {
                this.f22739p++;
                return b10;
            }
            if (this.f22742s - this.f22739p >= 10) {
                long j15 = 2 + j13;
                int i10 = (rcVar.getByte(j14) << 7) ^ b10;
                if (i10 < 0) {
                    j10 = i10 ^ (-128);
                } else {
                    long j16 = 3 + j13;
                    int i11 = (rcVar.getByte(j15) << 14) ^ i10;
                    if (i11 >= 0) {
                        j10 = i11 ^ 16256;
                    } else {
                        long j17 = 4 + j13;
                        int i12 = i11 ^ (rcVar.getByte(j16) << 21);
                        if (i12 < 0) {
                            j10 = (-2080896) ^ i12;
                            j15 = j17;
                        } else {
                            long j18 = 5 + j13;
                            long j19 = (rcVar.getByte(j17) << 28) ^ i12;
                            if (j19 >= 0) {
                                j12 = 266354560;
                            } else {
                                j16 = 6 + j13;
                                long j20 = j19 ^ (rcVar.getByte(j18) << 35);
                                if (j20 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j18 = 7 + j13;
                                    j19 = j20 ^ (rcVar.getByte(j16) << 42);
                                    if (j19 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j16 = 8 + j13;
                                        j20 = j19 ^ (rcVar.getByte(j18) << 49);
                                        if (j20 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j18 = 9 + j13;
                                            long j21 = (j20 ^ (rcVar.getByte(j16) << 56)) ^ 71499008037633920L;
                                            if (j21 < 0) {
                                                long j22 = j13 + 10;
                                                if (rcVar.getByte(j18) >= 0) {
                                                    j15 = j22;
                                                    j10 = j21;
                                                }
                                            } else {
                                                j10 = j21;
                                                j15 = j18;
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ j20;
                            }
                            j10 = j12 ^ j19;
                            j15 = j18;
                        }
                    }
                    j15 = j16;
                }
                this.f22739p = j15;
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
        if (rawVarint32 > 0) {
            long j10 = rawVarint32;
            long j11 = this.f22742s;
            long j12 = this.f22739p;
            if (j10 <= j11 - j12) {
                byte[] bArr = new byte[rawVarint32];
                sc.g(j12, bArr, 0L, j10);
                String str = new String(bArr, x7.f22881a);
                this.f22739p += j10;
                return str;
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= i()) {
            byte[] bArr2 = new byte[rawVarint32];
            f(rawVarint32, bArr2);
            return new String(bArr2, x7.f22881a);
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
            long j10 = rawVarint32;
            long j11 = this.f22742s;
            long j12 = this.f22739p;
            if (j10 <= j11 - j12) {
                String strC = vc.c(this.f22730g, (int) (j12 - this.f22740q), rawVarint32);
                this.f22739p += j10;
                return strC;
            }
        }
        if (rawVarint32 >= 0 && rawVarint32 <= i()) {
            byte[] bArr = new byte[rawVarint32];
            f(rawVarint32, bArr);
            return vc.f22784a.d(bArr, 0, rawVarint32);
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
            this.f22736m = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f22736m = rawVarint32;
        if (hd.getTagFieldNumber(rawVarint32) != 0) {
            return this.f22736m;
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
        this.f22738o = (int) ((this.f22737n + this.f22739p) - this.f22740q);
    }

    @Override // com.explorestack.protobuf.y
    public boolean skipField(int i10) throws IOException {
        int tagWireType = hd.getTagWireType(i10);
        if (tagWireType == 0) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (readRawByte() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
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
        if (i10 < 0 || i10 > ((this.f22733j - this.f22737n) - this.f22739p) + this.f22740q) {
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        while (i10 > 0) {
            if (d() == 0) {
                e();
            }
            int iMin = Math.min(i10, (int) d());
            i10 -= iMin;
            this.f22739p += iMin;
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
}
