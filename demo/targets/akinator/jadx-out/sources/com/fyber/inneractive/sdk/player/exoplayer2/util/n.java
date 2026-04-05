package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f26042a;

    /* renamed from: b, reason: collision with root package name */
    public int f26043b;

    /* renamed from: c, reason: collision with root package name */
    public int f26044c;

    public n() {
    }

    public final int a() {
        byte[] bArr = this.f26042a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        int i11 = i10 + 1;
        this.f26043b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i13 = i10 + 2;
        this.f26043b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i12;
        int i15 = i10 + 3;
        this.f26043b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f26043b = i10 + 4;
        return (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16;
    }

    public final void c(int i10) {
        this.f26042a = a() < i10 ? new byte[i10] : this.f26042a;
        this.f26044c = i10;
        this.f26043b = 0;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f26042a.length) {
            throw new IllegalArgumentException();
        }
        this.f26044c = i10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 > this.f26044c) {
            throw new IllegalArgumentException();
        }
        this.f26043b = i10;
    }

    public final int f() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        int i11 = i10 + 1;
        this.f26043b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f26043b = i10 + 2;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public final long g() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        this.f26043b = i10 + 1;
        this.f26043b = i10 + 2;
        this.f26043b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f26043b = i10 + 4;
        long j11 = j10 | ((bArr[r4] & 255) << 32);
        this.f26043b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f26043b = i10 + 6;
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        this.f26043b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f26043b = i10 + 8;
        return (bArr[r4] & 255) | j14;
    }

    public final void h() {
        int i10 = this.f26044c;
        int i11 = this.f26043b;
        if (i10 - i11 == 0) {
            return;
        }
        while (i11 < this.f26044c && this.f26042a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f26042a;
        int i12 = this.f26043b;
        new String(bArr, i12, i11 - i12);
        this.f26043b = i11;
        if (i11 < this.f26044c) {
            this.f26043b = i11 + 1;
        }
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int j() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        this.f26043b = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final long k() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        this.f26043b = i10 + 1;
        this.f26043b = i10 + 2;
        this.f26043b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f26043b = i10 + 4;
        return (bArr[r4] & 255) | j10;
    }

    public final int l() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        int i11 = i10 + 1;
        this.f26043b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i13 = i10 + 2;
        this.f26043b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f26043b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public final int m() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", iB));
    }

    public final long n() {
        long jG = g();
        if (jG >= 0) {
            return jG;
        }
        throw new IllegalStateException(o2.m(jG, "Top bit not zero: "));
    }

    public final int o() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        int i11 = i10 + 1;
        this.f26043b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f26043b = i10 + 2;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    public n(int i10) {
        this.f26042a = new byte[i10];
        this.f26044c = i10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f26042a, this.f26043b, bArr, i10, i11);
        this.f26043b += i11;
    }

    public final String b(int i10) {
        String str = new String(this.f26042a, this.f26043b, i10, Charset.defaultCharset());
        this.f26043b += i10;
        return str;
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f26043b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f26042a, i11, (i12 >= this.f26044c || this.f26042a[i12] != 0) ? i10 : i10 - 1);
        this.f26043b += i10;
        return str;
    }

    public final int d() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        int i11 = i10 + 1;
        this.f26043b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f26043b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        int i15 = i10 + 3;
        this.f26043b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f26043b = i10 + 4;
        return ((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i16;
    }

    public final long e() {
        byte[] bArr = this.f26042a;
        int i10 = this.f26043b;
        this.f26043b = i10 + 1;
        this.f26043b = i10 + 2;
        this.f26043b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f26043b = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j10;
    }

    public n(byte[] bArr) {
        this.f26042a = bArr;
        this.f26044c = bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r8 = this;
            int r0 = r8.f26044c
            int r1 = r8.f26043b
            int r0 = r0 - r1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = r8.f26044c
            r2 = 13
            r3 = 10
            if (r1 >= r0) goto L1f
            byte[] r0 = r8.f26042a
            r0 = r0[r1]
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L9
        L1f:
            int r0 = r8.f26043b
            int r4 = r1 - r0
            r5 = 3
            if (r4 < r5) goto L41
            byte[] r4 = r8.f26042a
            r6 = r4[r0]
            r7 = -17
            if (r6 != r7) goto L41
            int r6 = r0 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L41
            int r6 = r0 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L41
            int r0 = r0 + r5
            r8.f26043b = r0
        L41:
            java.lang.String r0 = new java.lang.String
            byte[] r4 = r8.f26042a
            int r5 = r8.f26043b
            int r6 = r1 - r5
            r0.<init>(r4, r5, r6)
            r8.f26043b = r1
            int r4 = r8.f26044c
            if (r1 != r4) goto L53
            goto L6a
        L53:
            byte[] r5 = r8.f26042a
            r6 = r5[r1]
            if (r6 != r2) goto L60
            int r1 = r1 + 1
            r8.f26043b = r1
            if (r1 != r4) goto L60
            goto L6a
        L60:
            int r1 = r8.f26043b
            r2 = r5[r1]
            if (r2 != r3) goto L6a
            int r1 = r1 + 1
            r8.f26043b = r1
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.n.c():java.lang.String");
    }

    public n(int i10, byte[] bArr) {
        this.f26042a = bArr;
        this.f26044c = i10;
    }
}
