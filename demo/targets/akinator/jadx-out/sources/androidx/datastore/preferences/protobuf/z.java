package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public final Iterable f6139e;

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f6140f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f6141g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6142h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6143i;

    /* renamed from: j, reason: collision with root package name */
    public int f6144j;

    /* renamed from: k, reason: collision with root package name */
    public int f6145k;

    /* renamed from: m, reason: collision with root package name */
    public int f6147m;

    /* renamed from: p, reason: collision with root package name */
    public long f6150p;

    /* renamed from: q, reason: collision with root package name */
    public long f6151q;

    /* renamed from: r, reason: collision with root package name */
    public long f6152r;

    /* renamed from: s, reason: collision with root package name */
    public long f6153s;

    /* renamed from: l, reason: collision with root package name */
    public int f6146l = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f6148n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f6149o = 0;

    public z(Iterable iterable, int i10, boolean z10) {
        this.f6144j = i10;
        this.f6139e = iterable;
        this.f6140f = iterable.iterator();
        this.f6142h = z10;
        if (i10 != 0) {
            k();
            return;
        }
        this.f6141g = t1.f6009d;
        this.f6150p = 0L;
        this.f6151q = 0L;
        this.f6153s = 0L;
        this.f6152r = 0L;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void checkLastTagWas(int i10) throws u1 {
        if (this.f6147m != i10) {
            throw u1.a();
        }
    }

    public final long d() {
        return this.f6153s - this.f6150p;
    }

    public final void e() throws u1 {
        if (!this.f6140f.hasNext()) {
            throw u1.h();
        }
        k();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void enableAliasing(boolean z10) {
        this.f6143i = z10;
    }

    public final void f(int i10, byte[] bArr) throws u1 {
        if (i10 < 0 || i10 > i()) {
            if (i10 > 0) {
                throw u1.h();
            }
            if (i10 != 0) {
                throw u1.f();
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
            j4.g(this.f6150p, bArr, i10 - i11, j10);
            i11 -= iMin;
            this.f6150p += j10;
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
        throw u1.e();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getBytesUntilLimit() {
        int i10 = this.f6146l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getLastTag() {
        return this.f6147m;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int getTotalBytesRead() {
        return (int) (((this.f6148n - this.f6149o) + this.f6150p) - this.f6151q);
    }

    public final void h() {
        int i10 = this.f6144j + this.f6145k;
        this.f6144j = i10;
        int i11 = i10 - this.f6149o;
        int i12 = this.f6146l;
        if (i11 <= i12) {
            this.f6145k = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f6145k = i13;
        this.f6144j = i10 - i13;
    }

    public final int i() {
        return (int) (((this.f6144j - this.f6148n) - this.f6150p) + this.f6151q);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean isAtEnd() throws IOException {
        return (((long) this.f6148n) + this.f6150p) - this.f6151q == ((long) this.f6144j);
    }

    public final ByteBuffer j(int i10, int i11) {
        int iPosition = this.f6141g.position();
        int iLimit = this.f6141g.limit();
        ByteBuffer byteBuffer = this.f6141g;
        try {
            try {
                byteBuffer.position(i10);
                byteBuffer.limit(i11);
                return this.f6141g.slice();
            } catch (IllegalArgumentException unused) {
                throw u1.h();
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    public final void k() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f6140f.next();
        this.f6141g = byteBuffer;
        this.f6148n += (int) (this.f6150p - this.f6151q);
        long jPosition = byteBuffer.position();
        this.f6150p = jPosition;
        this.f6151q = jPosition;
        this.f6153s = this.f6141g.limit();
        long jB = j4.b(this.f6141g);
        this.f6152r = jB;
        this.f6150p += jB;
        this.f6151q += jB;
        this.f6153s += jB;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void popLimit(int i10) {
        this.f6146l = i10;
        h();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int pushLimit(int i10) throws u1 {
        if (i10 < 0) {
            throw u1.f();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        int i11 = this.f6146l;
        if (totalBytesRead > i11) {
            throw u1.h();
        }
        this.f6146l = totalBytesRead;
        h();
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
            long j10 = rawVarint32;
            if (j10 <= d()) {
                if (this.f6142h || !this.f6143i) {
                    byte[] bArr = new byte[rawVarint32];
                    j4.g(this.f6150p, bArr, 0L, j10);
                    this.f6150p += j10;
                    return ByteBuffer.wrap(bArr);
                }
                long j11 = this.f6150p + j10;
                this.f6150p = j11;
                long j12 = j11 - this.f6152r;
                return j((int) (j12 - j10), (int) j12);
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= i()) {
            byte[] bArr2 = new byte[rawVarint32];
            f(rawVarint32, bArr2);
            return ByteBuffer.wrap(bArr2);
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
        int rawVarint32 = readRawVarint32();
        boolean z10 = this.f6142h;
        if (rawVarint32 > 0) {
            long j10 = rawVarint32;
            long j11 = this.f6153s;
            long j12 = this.f6150p;
            if (j10 <= j11 - j12) {
                if (z10 && this.f6143i) {
                    int i10 = (int) (j12 - this.f6152r);
                    r rVarM = x.m(j(i10, rawVarint32 + i10));
                    this.f6150p += j10;
                    return rVarM;
                }
                byte[] bArr = new byte[rawVarint32];
                j4.g(j12, bArr, 0L, j10);
                this.f6150p += j10;
                s sVar = x.f6099c;
                return new s(bArr);
            }
        }
        if (rawVarint32 <= 0 || rawVarint32 > i()) {
            if (rawVarint32 == 0) {
                return x.f6099c;
            }
            if (rawVarint32 < 0) {
                throw u1.f();
            }
            throw u1.h();
        }
        if (!z10 || !this.f6143i) {
            byte[] bArr2 = new byte[rawVarint32];
            f(rawVarint32, bArr2);
            s sVar2 = x.f6099c;
            return new s(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        while (rawVarint32 > 0) {
            if (d() == 0) {
                e();
            }
            int iMin = Math.min(rawVarint32, (int) d());
            int i11 = (int) (this.f6150p - this.f6152r);
            arrayList.add(x.m(j(i11, i11 + iMin)));
            rawVarint32 -= iMin;
            this.f6150p += iMin;
        }
        return x.copyFrom(arrayList);
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
        if (d() == 0) {
            e();
        }
        long j10 = this.f6150p;
        this.f6150p = 1 + j10;
        return j4.f5924c.getByte(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 >= 0) {
            long j10 = i10;
            if (j10 <= d()) {
                byte[] bArr = new byte[i10];
                j4.g(this.f6150p, bArr, 0L, j10);
                this.f6150p += j10;
                return bArr;
            }
        }
        if (i10 >= 0 && i10 <= i()) {
            byte[] bArr2 = new byte[i10];
            f(i10, bArr2);
            return bArr2;
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
        if (d() < 4) {
            return (readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
        }
        long j10 = this.f6150p;
        this.f6150p = 4 + j10;
        i4 i4Var = j4.f5924c;
        return ((i4Var.getByte(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i4Var.getByte(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((i4Var.getByte(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((i4Var.getByte(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public long readRawLittleEndian64() throws IOException {
        if (d() < 8) {
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }
        this.f6150p = 8 + this.f6150p;
        i4 i4Var = j4.f5924c;
        return (i4Var.getByte(r13) & 255) | ((i4Var.getByte(r13 + 1) & 255) << 8) | ((i4Var.getByte(r13 + 2) & 255) << 16) | ((i4Var.getByte(3 + r13) & 255) << 24) | ((i4Var.getByte(4 + r13) & 255) << 32) | ((i4Var.getByte(5 + r13) & 255) << 40) | ((i4Var.getByte(6 + r13) & 255) << 48) | ((i4Var.getByte(r13 + 7) & 255) << 56);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int readRawVarint32() throws IOException {
        int i10;
        long j10 = this.f6150p;
        if (this.f6153s != j10) {
            long j11 = j10 + 1;
            i4 i4Var = j4.f5924c;
            byte b10 = i4Var.getByte(j10);
            if (b10 >= 0) {
                this.f6150p++;
                return b10;
            }
            if (this.f6153s - this.f6150p >= 10) {
                long j12 = 2 + j10;
                int i11 = (i4Var.getByte(j11) << 7) ^ b10;
                if (i11 < 0) {
                    i10 = i11 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int i12 = (i4Var.getByte(j12) << 14) ^ i11;
                    if (i12 >= 0) {
                        i10 = i12 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int i13 = i12 ^ (i4Var.getByte(j13) << 21);
                        if (i13 < 0) {
                            i10 = (-2080896) ^ i13;
                        } else {
                            j13 = 5 + j10;
                            byte b11 = i4Var.getByte(j14);
                            int i14 = (i13 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                j14 = 6 + j10;
                                if (i4Var.getByte(j13) < 0) {
                                    j13 = 7 + j10;
                                    if (i4Var.getByte(j14) < 0) {
                                        j14 = 8 + j10;
                                        if (i4Var.getByte(j13) < 0) {
                                            j13 = 9 + j10;
                                            if (i4Var.getByte(j14) < 0) {
                                                long j15 = j10 + 10;
                                                if (i4Var.getByte(j13) >= 0) {
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
                this.f6150p = j12;
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
        long j13 = this.f6150p;
        if (this.f6153s != j13) {
            long j14 = j13 + 1;
            i4 i4Var = j4.f5924c;
            byte b10 = i4Var.getByte(j13);
            if (b10 >= 0) {
                this.f6150p++;
                return b10;
            }
            if (this.f6153s - this.f6150p >= 10) {
                long j15 = 2 + j13;
                int i10 = (i4Var.getByte(j14) << 7) ^ b10;
                if (i10 < 0) {
                    j10 = i10 ^ (-128);
                } else {
                    long j16 = 3 + j13;
                    int i11 = (i4Var.getByte(j15) << 14) ^ i10;
                    if (i11 >= 0) {
                        j10 = i11 ^ 16256;
                    } else {
                        long j17 = 4 + j13;
                        int i12 = i11 ^ (i4Var.getByte(j16) << 21);
                        if (i12 < 0) {
                            j10 = (-2080896) ^ i12;
                            j15 = j17;
                        } else {
                            long j18 = 5 + j13;
                            long j19 = (i4Var.getByte(j17) << 28) ^ i12;
                            if (j19 >= 0) {
                                j12 = 266354560;
                            } else {
                                j16 = 6 + j13;
                                long j20 = j19 ^ (i4Var.getByte(j18) << 35);
                                if (j20 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j18 = 7 + j13;
                                    j19 = j20 ^ (i4Var.getByte(j16) << 42);
                                    if (j19 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j16 = 8 + j13;
                                        j20 = j19 ^ (i4Var.getByte(j18) << 49);
                                        if (j20 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j18 = 9 + j13;
                                            long j21 = (j20 ^ (i4Var.getByte(j16) << 56)) ^ 71499008037633920L;
                                            if (j21 < 0) {
                                                long j22 = j13 + 10;
                                                if (i4Var.getByte(j18) >= 0) {
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
                this.f6150p = j15;
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
        if (rawVarint32 > 0) {
            long j10 = rawVarint32;
            long j11 = this.f6153s;
            long j12 = this.f6150p;
            if (j10 <= j11 - j12) {
                byte[] bArr = new byte[rawVarint32];
                j4.g(j12, bArr, 0L, j10);
                String str = new String(bArr, t1.f6006a);
                this.f6150p += j10;
                return str;
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= i()) {
            byte[] bArr2 = new byte[rawVarint32];
            f(rawVarint32, bArr2);
            return new String(bArr2, t1.f6006a);
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
            long j10 = rawVarint32;
            long j11 = this.f6153s;
            long j12 = this.f6150p;
            if (j10 <= j11 - j12) {
                String strC = m4.c(this.f6141g, (int) (j12 - this.f6151q), rawVarint32);
                this.f6150p += j10;
                return strC;
            }
        }
        if (rawVarint32 >= 0 && rawVarint32 <= i()) {
            byte[] bArr = new byte[rawVarint32];
            f(rawVarint32, bArr);
            return m4.f5958a.g(bArr, 0, rawVarint32);
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
            this.f6147m = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f6147m = rawVarint32;
        if (t4.getTagFieldNumber(rawVarint32) != 0) {
            return this.f6147m;
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
        this.f6149o = (int) ((this.f6148n + this.f6150p) - this.f6151q);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean skipField(int i10) throws IOException {
        int tagWireType = t4.getTagWireType(i10);
        if (tagWireType == 0) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (readRawByte() >= 0) {
                    return true;
                }
            }
            throw u1.e();
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
        if (i10 < 0 || i10 > ((this.f6144j - this.f6148n) - this.f6150p) + this.f6151q) {
            if (i10 >= 0) {
                throw u1.h();
            }
            throw u1.f();
        }
        while (i10 > 0) {
            if (d() == 0) {
                e();
            }
            int iMin = Math.min(i10, (int) d());
            i10 -= iMin;
            this.f6150p += iMin;
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
