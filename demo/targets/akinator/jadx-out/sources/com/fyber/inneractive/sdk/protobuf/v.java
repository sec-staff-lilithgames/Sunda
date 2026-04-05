package com.fyber.inneractive.sdk.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends w {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f26502e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26503f;

    /* renamed from: g, reason: collision with root package name */
    public long f26504g;

    /* renamed from: h, reason: collision with root package name */
    public long f26505h;

    /* renamed from: i, reason: collision with root package name */
    public final long f26506i;

    /* renamed from: j, reason: collision with root package name */
    public int f26507j;

    /* renamed from: k, reason: collision with root package name */
    public int f26508k;

    /* renamed from: l, reason: collision with root package name */
    public int f26509l = Integer.MAX_VALUE;

    public v(ByteBuffer byteBuffer, boolean z10) {
        this.f26502e = byteBuffer;
        long j10 = x3.f26537c.f26523a.getLong(byteBuffer, x3.f26541g);
        this.f26503f = j10;
        this.f26504g = byteBuffer.limit() + j10;
        long jPosition = j10 + byteBuffer.position();
        this.f26505h = jPosition;
        this.f26506i = jPosition;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f26508k != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return (int) (this.f26505h - this.f26506i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f26509l = i10;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i10) throws n1 {
        int iT;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (((int) (this.f26504g - this.f26505h)) >= 10) {
                while (i12 < 10) {
                    long j10 = this.f26505h;
                    this.f26505h = j10 + 1;
                    if (x3.f26537c.a(j10) < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                long j11 = this.f26505h;
                if (j11 == this.f26504g) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f26505h = j11 + 1;
                if (x3.f26537c.a(j11) < 0) {
                    i12++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            f(8);
            return true;
        }
        if (i11 == 2) {
            f(m());
            return true;
        }
        if (i11 == 3) {
            do {
                iT = t();
                if (iT == 0) {
                    break;
                }
            } while (e(iT));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 == 5) {
            f(4);
            return true;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[PHI: r6
      0x00cc: PHI (r6v9 long) = (r6v8 long), (r6v12 long) binds: [B:22:0x0064, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v.m():int");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String r() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f26504g;
            long j11 = this.f26505h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f26537c.a(j11, bArr, j12);
                String str = new String(bArr, l1.f26429a);
                this.f26505h += j12;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f26504g;
            long j11 = this.f26505h;
            if (iM <= ((int) (j10 - j11))) {
                int i10 = (int) (j11 - this.f26503f);
                ByteBuffer byteBuffer = this.f26502e;
                z3 z3Var = d4.f26366a;
                z3Var.getClass();
                String strA = byteBuffer.hasArray() ? z3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i10, iM) : byteBuffer.isDirect() ? z3Var.b(byteBuffer, i10, iM) : z3.a(byteBuffer, i10, iM);
                this.f26505h += iM;
                return strA;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f26508k = 0;
            return 0;
        }
        int iM = m();
        this.f26508k = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    public final int w() throws n1 {
        long j10 = this.f26505h;
        if (this.f26504g - j10 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26505h = 4 + j10;
        w3 w3Var = x3.f26537c;
        return ((w3Var.a(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (w3Var.a(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((w3Var.a(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((w3Var.a(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long x() throws n1 {
        long j10 = this.f26505h;
        if (this.f26504g - j10 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26505h = 8 + j10;
        w3 w3Var = x3.f26537c;
        return ((w3Var.a(j10 + 7) & 255) << 56) | (w3Var.a(j10) & 255) | ((w3Var.a(1 + j10) & 255) << 8) | ((w3Var.a(2 + j10) & 255) << 16) | ((w3Var.a(3 + j10) & 255) << 24) | ((w3Var.a(4 + j10) & 255) << 32) | ((w3Var.a(5 + j10) & 255) << 40) | ((w3Var.a(6 + j10) & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v.y():long");
    }

    public final void z() {
        long j10 = this.f26504g + this.f26507j;
        this.f26504g = j10;
        int i10 = (int) (j10 - this.f26506i);
        int i11 = this.f26509l;
        if (i10 <= i11) {
            this.f26507j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f26507j = i12;
        this.f26504g = j10 - i12;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) throws n1 {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + ((int) (this.f26505h - this.f26506i));
        int i12 = this.f26509l;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26509l = i11;
        z();
        return i12;
    }

    public final void f(int i10) throws n1 {
        if (i10 >= 0) {
            long j10 = this.f26504g;
            long j11 = this.f26505h;
            if (i10 <= ((int) (j10 - j11))) {
                this.f26505h = j11 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f26505h == this.f26504g;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10, c2 c2Var, h0 h0Var) throws IOException {
        int i11 = this.f26510a;
        if (i11 < this.f26511b) {
            this.f26510a = i11 + 1;
            ((t0) c2Var).a(this, h0Var);
            a((i10 << 3) | 4);
            this.f26510a--;
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(c2 c2Var, h0 h0Var) throws IOException {
        int iM = m();
        if (this.f26510a < this.f26511b) {
            int iD = d(iM);
            this.f26510a++;
            ((t0) c2Var).a(this, h0Var);
            a(0);
            this.f26510a--;
            this.f26509l = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f26504g;
            long j11 = this.f26505h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f26537c.a(j11, bArr, j12);
                this.f26505h += j12;
                q qVar = s.f26471b;
                return new q(bArr);
            }
        }
        if (iM == 0) {
            return s.f26471b;
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f26509l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - ((int) (this.f26505h - this.f26506i));
    }
}
