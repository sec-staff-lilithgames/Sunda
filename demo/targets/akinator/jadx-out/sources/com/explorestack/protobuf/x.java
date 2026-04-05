package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends y {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f22819e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22820f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22821g;

    /* renamed from: h, reason: collision with root package name */
    public long f22822h;

    /* renamed from: i, reason: collision with root package name */
    public long f22823i;

    /* renamed from: j, reason: collision with root package name */
    public long f22824j;

    /* renamed from: k, reason: collision with root package name */
    public int f22825k;

    /* renamed from: l, reason: collision with root package name */
    public int f22826l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22827m;

    /* renamed from: n, reason: collision with root package name */
    public int f22828n = Integer.MAX_VALUE;

    public x(ByteBuffer byteBuffer, boolean z10) {
        this.f22819e = byteBuffer;
        long jB = sc.b(byteBuffer);
        this.f22821g = jB;
        this.f22822h = byteBuffer.limit() + jB;
        long jPosition = jB + byteBuffer.position();
        this.f22823i = jPosition;
        this.f22824j = jPosition;
        this.f22820f = z10;
    }

    @Override // com.explorestack.protobuf.y
    public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f22826l != i10) {
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
        long j10 = this.f22822h + this.f22825k;
        this.f22822h = j10;
        int i10 = (int) (j10 - this.f22824j);
        int i11 = this.f22828n;
        if (i10 <= i11) {
            this.f22825k = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f22825k = i12;
        this.f22822h = j10 - i12;
    }

    @Override // com.explorestack.protobuf.y
    public void enableAliasing(boolean z10) {
        this.f22827m = z10;
    }

    public final int f() {
        return (int) (this.f22822h - this.f22823i);
    }

    public final ByteBuffer g(long j10, long j11) {
        long j12 = this.f22821g;
        ByteBuffer byteBuffer = this.f22819e;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position((int) (j10 - j12));
                byteBuffer.limit((int) (j11 - j12));
                return byteBuffer.slice();
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.explorestack.protobuf.y
    public int getBytesUntilLimit() {
        int i10 = this.f22828n;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // com.explorestack.protobuf.y
    public int getLastTag() {
        return this.f22826l;
    }

    @Override // com.explorestack.protobuf.y
    public int getTotalBytesRead() {
        return (int) (this.f22823i - this.f22824j);
    }

    @Override // com.explorestack.protobuf.y
    public boolean isAtEnd() throws IOException {
        return this.f22823i == this.f22822h;
    }

    @Override // com.explorestack.protobuf.y
    public void popLimit(int i10) {
        this.f22828n = i10;
        e();
    }

    @Override // com.explorestack.protobuf.y
    public int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        int i11 = this.f22828n;
        if (totalBytesRead > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22828n = totalBytesRead;
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
        if (rawVarint32 <= 0 || rawVarint32 > f()) {
            if (rawVarint32 == 0) {
                return x7.f22884d;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f22820f || !this.f22827m) {
            byte[] bArr = new byte[rawVarint32];
            long j10 = rawVarint32;
            sc.g(this.f22823i, bArr, 0L, j10);
            this.f22823i += j10;
            return ByteBuffer.wrap(bArr);
        }
        long j11 = this.f22823i;
        long j12 = rawVarint32;
        ByteBuffer byteBufferG = g(j11, j11 + j12);
        this.f22823i += j12;
        return byteBufferG;
    }

    @Override // com.explorestack.protobuf.y
    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > f()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f22820f && this.f22827m) {
            long j10 = this.f22823i;
            long j11 = rawVarint32;
            ByteBuffer byteBufferG = g(j10, j10 + j11);
            this.f22823i += j11;
            return ByteString.wrap(byteBufferG);
        }
        byte[] bArr = new byte[rawVarint32];
        long j12 = rawVarint32;
        sc.g(this.f22823i, bArr, 0L, j12);
        this.f22823i += j12;
        return ByteString.wrap(bArr);
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
        long j10 = this.f22823i;
        if (j10 == this.f22822h) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22823i = 1 + j10;
        return sc.f22643c.getByte(j10);
    }

    @Override // com.explorestack.protobuf.y
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 < 0 || i10 > f()) {
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return x7.f22883c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArr = new byte[i10];
        long j10 = this.f22823i;
        long j11 = i10;
        g(j10, j10 + j11).get(bArr);
        this.f22823i += j11;
        return bArr;
    }

    @Override // com.explorestack.protobuf.y
    public int readRawLittleEndian32() throws IOException {
        long j10 = this.f22823i;
        if (this.f22822h - j10 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22823i = 4 + j10;
        rc rcVar = sc.f22643c;
        return ((rcVar.getByte(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (rcVar.getByte(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((rcVar.getByte(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((rcVar.getByte(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // com.explorestack.protobuf.y
    public long readRawLittleEndian64() throws IOException {
        long j10 = this.f22823i;
        if (this.f22822h - j10 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f22823i = 8 + j10;
        rc rcVar = sc.f22643c;
        return ((rcVar.getByte(j10 + 7) & 255) << 56) | (rcVar.getByte(j10) & 255) | ((rcVar.getByte(1 + j10) & 255) << 8) | ((rcVar.getByte(2 + j10) & 255) << 16) | ((rcVar.getByte(3 + j10) & 255) << 24) | ((rcVar.getByte(4 + j10) & 255) << 32) | ((rcVar.getByte(5 + j10) & 255) << 40) | ((rcVar.getByte(6 + j10) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.getByte(r8) < 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
      0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.explorestack.protobuf.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r12 = this;
            long r0 = r12.f22823i
            long r2 = r12.f22822h
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.explorestack.protobuf.rc r4 = com.explorestack.protobuf.sc.f22643c
            byte r5 = r4.getByte(r0)
            if (r5 < 0) goto L18
            r12.f22823i = r2
            return r5
        L18:
            long r6 = r12.f22822h
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.getByte(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.getByte(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.getByte(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.getByte(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.getByte(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.getByte(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.getByte(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.getByte(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.getByte(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.d()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f22823i = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.x.readRawVarint32():int");
    }

    @Override // com.explorestack.protobuf.y
    public long readRawVarint64() throws IOException {
        long j10;
        long j11;
        long j12;
        int i10;
        long j13 = this.f22823i;
        if (this.f22822h != j13) {
            long j14 = 1 + j13;
            rc rcVar = sc.f22643c;
            byte b10 = rcVar.getByte(j13);
            if (b10 >= 0) {
                this.f22823i = j14;
                return b10;
            }
            if (this.f22822h - j14 >= 9) {
                long j15 = 2 + j13;
                int i11 = (rcVar.getByte(j14) << 7) ^ b10;
                if (i11 >= 0) {
                    long j16 = 3 + j13;
                    int i12 = i11 ^ (rcVar.getByte(j15) << 14);
                    if (i12 >= 0) {
                        j10 = i12 ^ 16256;
                    } else {
                        j15 = j13 + 4;
                        int i13 = i12 ^ (rcVar.getByte(j16) << 21);
                        if (i13 < 0) {
                            i10 = (-2080896) ^ i13;
                        } else {
                            j16 = 5 + j13;
                            long j17 = i13 ^ (rcVar.getByte(j15) << 28);
                            if (j17 < 0) {
                                long j18 = 6 + j13;
                                long j19 = j17 ^ (rcVar.getByte(j16) << 35);
                                if (j19 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j16 = 7 + j13;
                                    j17 = j19 ^ (rcVar.getByte(j18) << 42);
                                    if (j17 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j18 = 8 + j13;
                                        j19 = j17 ^ (rcVar.getByte(j16) << 49);
                                        if (j19 >= 0) {
                                            long j20 = j13 + 9;
                                            long j21 = (j19 ^ (rcVar.getByte(j18) << 56)) ^ 71499008037633920L;
                                            if (j21 < 0) {
                                                long j22 = j13 + 10;
                                                if (rcVar.getByte(j20) >= 0) {
                                                    j15 = j22;
                                                    j10 = j21;
                                                }
                                            } else {
                                                j10 = j21;
                                                j15 = j20;
                                            }
                                            this.f22823i = j15;
                                            return j10;
                                        }
                                        j11 = -558586000294016L;
                                    }
                                }
                                j10 = j11 ^ j19;
                                j15 = j18;
                                this.f22823i = j15;
                                return j10;
                            }
                            j12 = 266354560;
                            j10 = j12 ^ j17;
                        }
                    }
                    j15 = j16;
                    this.f22823i = j15;
                    return j10;
                }
                i10 = i11 ^ (-128);
                j10 = i10;
                this.f22823i = j15;
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
        if (rawVarint32 <= 0 || rawVarint32 > f()) {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = new byte[rawVarint32];
        long j10 = rawVarint32;
        sc.g(this.f22823i, bArr, 0L, j10);
        String str = new String(bArr, x7.f22881a);
        this.f22823i += j10;
        return str;
    }

    @Override // com.explorestack.protobuf.y
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0 && rawVarint32 <= f()) {
            String strC = vc.c(this.f22819e, (int) (this.f22823i - this.f22821g), rawVarint32);
            this.f22823i += rawVarint32;
            return strC;
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
            this.f22826l = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f22826l = rawVarint32;
        if (hd.getTagFieldNumber(rawVarint32) != 0) {
            return this.f22826l;
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
        this.f22824j = this.f22823i;
    }

    @Override // com.explorestack.protobuf.y
    public boolean skipField(int i10) throws IOException {
        int tagWireType = hd.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (f() < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i11 < 10) {
                long j10 = this.f22823i;
                this.f22823i = 1 + j10;
                if (sc.f22643c.getByte(j10) < 0) {
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
        if (i10 >= 0 && i10 <= f()) {
            this.f22823i += i10;
        } else {
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
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
