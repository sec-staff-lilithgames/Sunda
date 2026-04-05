package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f5801e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5802f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5803g;

    /* renamed from: h, reason: collision with root package name */
    public long f5804h;

    /* renamed from: i, reason: collision with root package name */
    public long f5805i;

    /* renamed from: j, reason: collision with root package name */
    public long f5806j;

    /* renamed from: k, reason: collision with root package name */
    public int f5807k;

    /* renamed from: l, reason: collision with root package name */
    public int f5808l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5809m;

    /* renamed from: n, reason: collision with root package name */
    public int f5810n = Integer.MAX_VALUE;

    public b0(ByteBuffer byteBuffer, boolean z10) {
        this.f5801e = byteBuffer;
        long jB = j4.b(byteBuffer);
        this.f5803g = jB;
        this.f5804h = byteBuffer.limit() + jB;
        long jPosition = jB + byteBuffer.position();
        this.f5805i = jPosition;
        this.f5806j = jPosition;
        this.f5802f = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void checkLastTagWas(int i10) throws u1 {
        if (this.f5808l != i10) {
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
        long j10 = this.f5804h + this.f5807k;
        this.f5804h = j10;
        int i10 = (int) (j10 - this.f5806j);
        int i11 = this.f5810n;
        if (i10 <= i11) {
            this.f5807k = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f5807k = i12;
        this.f5804h = j10 - i12;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void enableAliasing(boolean z10) {
        this.f5809m = z10;
    }

    public final int f() {
        return (int) (this.f5804h - this.f5805i);
    }

    public final ByteBuffer g(long j10, long j11) {
        long j12 = this.f5803g;
        ByteBuffer byteBuffer = this.f5801e;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position((int) (j10 - j12));
                byteBuffer.limit((int) (j11 - j12));
                return byteBuffer.slice();
            } catch (IllegalArgumentException e10) {
                u1 u1VarH = u1.h();
                u1VarH.initCause(e10);
                throw u1VarH;
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getBytesUntilLimit() {
        int i10 = this.f5810n;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getLastTag() {
        return this.f5808l;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getTotalBytesRead() {
        return (int) (this.f5805i - this.f5806j);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean isAtEnd() throws IOException {
        return this.f5805i == this.f5804h;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void popLimit(int i10) {
        this.f5810n = i10;
        e();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int pushLimit(int i10) throws u1 {
        if (i10 < 0) {
            throw u1.f();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        int i11 = this.f5810n;
        if (totalBytesRead > i11) {
            throw u1.h();
        }
        this.f5810n = totalBytesRead;
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
        if (rawVarint32 <= 0 || rawVarint32 > f()) {
            if (rawVarint32 == 0) {
                return t1.f6009d;
            }
            if (rawVarint32 < 0) {
                throw u1.f();
            }
            throw u1.h();
        }
        if (this.f5802f || !this.f5809m) {
            byte[] bArr = new byte[rawVarint32];
            long j10 = rawVarint32;
            j4.g(this.f5805i, bArr, 0L, j10);
            this.f5805i += j10;
            return ByteBuffer.wrap(bArr);
        }
        long j11 = this.f5805i;
        long j12 = rawVarint32;
        ByteBuffer byteBufferG = g(j11, j11 + j12);
        this.f5805i += j12;
        return byteBufferG;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public x readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > f()) {
            if (rawVarint32 == 0) {
                return x.f6099c;
            }
            if (rawVarint32 < 0) {
                throw u1.f();
            }
            throw u1.h();
        }
        if (this.f5802f && this.f5809m) {
            long j10 = this.f5805i;
            long j11 = rawVarint32;
            ByteBuffer byteBufferG = g(j10, j10 + j11);
            this.f5805i += j11;
            return x.m(byteBufferG);
        }
        byte[] bArr = new byte[rawVarint32];
        long j12 = rawVarint32;
        j4.g(this.f5805i, bArr, 0L, j12);
        this.f5805i += j12;
        s sVar = x.f6099c;
        return new s(bArr);
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
        long j10 = this.f5805i;
        if (j10 == this.f5804h) {
            throw u1.h();
        }
        this.f5805i = 1 + j10;
        return j4.f5924c.getByte(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 < 0 || i10 > f()) {
            if (i10 > 0) {
                throw u1.h();
            }
            if (i10 == 0) {
                return t1.f6008c;
            }
            throw u1.f();
        }
        byte[] bArr = new byte[i10];
        long j10 = this.f5805i;
        long j11 = i10;
        g(j10, j10 + j11).get(bArr);
        this.f5805i += j11;
        return bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readRawLittleEndian32() throws IOException {
        long j10 = this.f5805i;
        if (this.f5804h - j10 < 4) {
            throw u1.h();
        }
        this.f5805i = 4 + j10;
        i4 i4Var = j4.f5924c;
        return ((i4Var.getByte(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i4Var.getByte(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((i4Var.getByte(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((i4Var.getByte(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readRawLittleEndian64() throws IOException {
        long j10 = this.f5805i;
        if (this.f5804h - j10 < 8) {
            throw u1.h();
        }
        this.f5805i = 8 + j10;
        i4 i4Var = j4.f5924c;
        return ((i4Var.getByte(j10 + 7) & 255) << 56) | (i4Var.getByte(j10) & 255) | ((i4Var.getByte(1 + j10) & 255) << 8) | ((i4Var.getByte(2 + j10) & 255) << 16) | ((i4Var.getByte(3 + j10) & 255) << 24) | ((i4Var.getByte(4 + j10) & 255) << 32) | ((i4Var.getByte(5 + j10) & 255) << 40) | ((i4Var.getByte(6 + j10) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.getByte(r8) < 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
      0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r12 = this;
            long r0 = r12.f5805i
            long r2 = r12.f5804h
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            androidx.datastore.preferences.protobuf.i4 r4 = androidx.datastore.preferences.protobuf.j4.f5924c
            byte r5 = r4.getByte(r0)
            if (r5 < 0) goto L18
            r12.f5805i = r2
            return r5
        L18:
            long r6 = r12.f5804h
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
            r12.f5805i = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.readRawVarint32():int");
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readRawVarint64() throws IOException {
        long j10;
        long j11;
        long j12;
        int i10;
        long j13 = this.f5805i;
        if (this.f5804h != j13) {
            long j14 = 1 + j13;
            i4 i4Var = j4.f5924c;
            byte b10 = i4Var.getByte(j13);
            if (b10 >= 0) {
                this.f5805i = j14;
                return b10;
            }
            if (this.f5804h - j14 >= 9) {
                long j15 = 2 + j13;
                int i11 = (i4Var.getByte(j14) << 7) ^ b10;
                if (i11 >= 0) {
                    long j16 = 3 + j13;
                    int i12 = i11 ^ (i4Var.getByte(j15) << 14);
                    if (i12 >= 0) {
                        j10 = i12 ^ 16256;
                    } else {
                        j15 = j13 + 4;
                        int i13 = i12 ^ (i4Var.getByte(j16) << 21);
                        if (i13 < 0) {
                            i10 = (-2080896) ^ i13;
                        } else {
                            j16 = 5 + j13;
                            long j17 = i13 ^ (i4Var.getByte(j15) << 28);
                            if (j17 < 0) {
                                long j18 = 6 + j13;
                                long j19 = j17 ^ (i4Var.getByte(j16) << 35);
                                if (j19 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j16 = 7 + j13;
                                    j17 = j19 ^ (i4Var.getByte(j18) << 42);
                                    if (j17 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j18 = 8 + j13;
                                        j19 = j17 ^ (i4Var.getByte(j16) << 49);
                                        if (j19 >= 0) {
                                            long j20 = j13 + 9;
                                            long j21 = (j19 ^ (i4Var.getByte(j18) << 56)) ^ 71499008037633920L;
                                            if (j21 < 0) {
                                                long j22 = j13 + 10;
                                                if (i4Var.getByte(j20) >= 0) {
                                                    j15 = j22;
                                                    j10 = j21;
                                                }
                                            } else {
                                                j10 = j21;
                                                j15 = j20;
                                            }
                                            this.f5805i = j15;
                                            return j10;
                                        }
                                        j11 = -558586000294016L;
                                    }
                                }
                                j10 = j11 ^ j19;
                                j15 = j18;
                                this.f5805i = j15;
                                return j10;
                            }
                            j12 = 266354560;
                            j10 = j12 ^ j17;
                        }
                    }
                    j15 = j16;
                    this.f5805i = j15;
                    return j10;
                }
                i10 = i11 ^ (-128);
                j10 = i10;
                this.f5805i = j15;
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
        if (rawVarint32 <= 0 || rawVarint32 > f()) {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw u1.f();
            }
            throw u1.h();
        }
        byte[] bArr = new byte[rawVarint32];
        long j10 = rawVarint32;
        j4.g(this.f5805i, bArr, 0L, j10);
        String str = new String(bArr, t1.f6006a);
        this.f5805i += j10;
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0 && rawVarint32 <= f()) {
            String strC = m4.c(this.f5801e, (int) (this.f5805i - this.f5803g), rawVarint32);
            this.f5805i += rawVarint32;
            return strC;
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
            this.f5808l = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f5808l = rawVarint32;
        if (t4.getTagFieldNumber(rawVarint32) != 0) {
            return this.f5808l;
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
        this.f5806j = this.f5805i;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean skipField(int i10) throws IOException {
        int tagWireType = t4.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (f() < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw u1.e();
            }
            while (i11 < 10) {
                long j10 = this.f5805i;
                this.f5805i = 1 + j10;
                if (j4.f5924c.getByte(j10) < 0) {
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
        if (i10 >= 0 && i10 <= f()) {
            this.f5805i += i10;
        } else {
            if (i10 >= 0) {
                throw u1.h();
            }
            throw u1.f();
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
}
