package com.mbridge.msdk.thrid.okio;

import b0.e2;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f43816c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a, reason: collision with root package name */
    o f43817a;

    /* renamed from: b, reason: collision with root package name */
    long f43818b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f43818b, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f43818b > 0) {
                return cVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return c.this.read(bArr, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws EOFException {
        return new f(c(j10));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws EOFException {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: "));
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return h(jA);
        }
        if (j11 < size() && f(j11 - 1) == 13 && f(j11) == 10) {
            return h(j11);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.o().b() + (char) 8230);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws EOFException {
        if (this.f43818b < j10) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.f43818b;
        if (j10 != cVar.f43818b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f43817a;
        o oVar2 = cVar.f43817a;
        int i10 = oVar.f43851b;
        int i11 = oVar2.f43851b;
        while (j11 < this.f43818b) {
            long jMin = Math.min(oVar.f43852c - i10, oVar2.f43852c - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (oVar.f43850a[i10] != oVar2.f43850a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == oVar.f43852c) {
                oVar = oVar.f43855f;
                i10 = oVar.f43851b;
            }
            if (i11 == oVar2.f43852c) {
                oVar2 = oVar2.f43855f;
                i11 = oVar2.f43851b;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        return this.f43818b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() {
        return u.a(readShort());
    }

    public String h(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (f(j11) == 13) {
                String strG = g(j11);
                skip(2L);
                return strG;
            }
        }
        String strG2 = g(j10);
        skip(1L);
        return strG2;
    }

    public int hashCode() {
        o oVar = this.f43817a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f43852c;
            for (int i12 = oVar.f43851b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f43850a[i12];
            }
            oVar = oVar.f43855f;
        } while (oVar != this.f43817a);
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[EDGE_INSN: B:43:0x0095->B:37:0x0095 BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // com.mbridge.msdk.thrid.okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i() {
        /*
            r14 = this;
            long r0 = r14.f43818b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9c
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            com.mbridge.msdk.thrid.okio.o r6 = r14.f43817a
            byte[] r7 = r6.f43850a
            int r8 = r6.f43851b
            int r9 = r6.f43852c
        L13:
            if (r8 >= r9) goto L81
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            com.mbridge.msdk.thrid.okio.c r0 = new com.mbridge.msdk.thrid.okio.c
            r0.<init>()
            com.mbridge.msdk.thrid.okio.c r0 = r0.a(r4)
            com.mbridge.msdk.thrid.okio.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.p()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            if (r0 == 0) goto L70
            r1 = 1
            goto L81
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r1 = w0.i.b(r10, r1)
            r0.<init>(r1)
            throw r0
        L81:
            if (r8 != r9) goto L8d
            com.mbridge.msdk.thrid.okio.o r7 = r6.b()
            r14.f43817a = r7
            com.mbridge.msdk.thrid.okio.p.a(r6)
            goto L8f
        L8d:
            r6.f43851b = r8
        L8f:
            if (r1 != 0) goto L95
            com.mbridge.msdk.thrid.okio.o r6 = r14.f43817a
            if (r6 != 0) goto Lb
        L95:
            long r1 = r14.f43818b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f43818b = r1
            return r4
        L9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.c.i():long");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    public final void k() {
        try {
            skip(this.f43818b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f43818b == 0) {
            return cVar;
        }
        o oVarC = this.f43817a.c();
        cVar.f43817a = oVarC;
        oVarC.f43856g = oVarC;
        oVarC.f43855f = oVarC;
        for (o oVar = this.f43817a.f43855f; oVar != this.f43817a; oVar = oVar.f43855f) {
            cVar.f43817a.f43856g.a(oVar.c());
        }
        cVar.f43818b = this.f43818b;
        return cVar;
    }

    public final long m() {
        long j10 = this.f43818b;
        if (j10 == 0) {
            return 0L;
        }
        o oVar = this.f43817a.f43856g;
        return (oVar.f43852c >= 8192 || !oVar.f43854e) ? j10 : j10 - (r3 - oVar.f43851b);
    }

    public byte[] n() {
        try {
            return c(this.f43818b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public f o() {
        return new f(n());
    }

    public String p() {
        try {
            return a(this.f43818b, u.f43865a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final f q() {
        long j10 = this.f43818b;
        if (j10 <= 2147483647L) {
            return a((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f43818b);
    }

    public int read(byte[] bArr, int i10, int i11) {
        u.a(bArr.length, i10, i11);
        o oVar = this.f43817a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, oVar.f43852c - oVar.f43851b);
        System.arraycopy(oVar.f43850a, oVar.f43851b, bArr, i10, iMin);
        int i12 = oVar.f43851b + iMin;
        oVar.f43851b = i12;
        this.f43818b -= iMin;
        if (i12 == oVar.f43852c) {
            this.f43817a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() {
        long j10 = this.f43818b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f43817a;
        int i10 = oVar.f43851b;
        int i11 = oVar.f43852c;
        int i12 = i10 + 1;
        byte b10 = oVar.f43850a[i10];
        this.f43818b = j10 - 1;
        if (i12 != i11) {
            oVar.f43851b = i12;
            return b10;
        }
        this.f43817a = oVar.b();
        p.a(oVar);
        return b10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() {
        long j10 = this.f43818b;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f43818b);
        }
        o oVar = this.f43817a;
        int i10 = oVar.f43851b;
        int i11 = oVar.f43852c;
        if (i11 - i10 < 4) {
            return ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = oVar.f43850a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        this.f43818b = j10 - 4;
        if (i14 != i11) {
            oVar.f43851b = i14;
            return i15;
        }
        this.f43817a = oVar.b();
        p.a(oVar);
        return i15;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() {
        long j10 = this.f43818b;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f43818b);
        }
        o oVar = this.f43817a;
        int i10 = oVar.f43851b;
        int i11 = oVar.f43852c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        byte[] bArr = oVar.f43850a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        this.f43818b = j10 - 2;
        if (i14 == i11) {
            this.f43817a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f43851b = i14;
        }
        return (short) i15;
    }

    public final long size() {
        return this.f43818b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            if (this.f43817a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, r0.f43852c - r0.f43851b);
            long j11 = iMin;
            this.f43818b -= j11;
            j10 -= j11;
            o oVar = this.f43817a;
            int i10 = oVar.f43851b + iMin;
            oVar.f43851b = i10;
            if (i10 == oVar.f43852c) {
                this.f43817a = oVar.b();
                p.a(oVar);
            }
        }
    }

    public String toString() {
        return q().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(String str) {
        return a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws EOFException {
        u.a(this.f43818b, 0L, j10);
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount > Integer.MAX_VALUE: "));
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() {
        return u.a(readInt());
    }

    public final byte f(long j10) {
        u.a(this.f43818b, j10, 1L);
        long j11 = this.f43818b;
        if (j11 - j10 > j10) {
            o oVar = this.f43817a;
            long j12 = j10;
            while (true) {
                int i10 = oVar.f43852c;
                int i11 = oVar.f43851b;
                long j13 = i10 - i11;
                if (j12 < j13) {
                    return oVar.f43850a[i11 + ((int) j12)];
                }
                j12 -= j13;
                oVar = oVar.f43855f;
            }
        } else {
            long j14 = j10 - j11;
            o oVar2 = this.f43817a.f43856g;
            while (true) {
                int i12 = oVar2.f43852c;
                int i13 = oVar2.f43851b;
                j14 += i12 - i13;
                if (j14 >= 0) {
                    return oVar2.f43850a[i13 + ((int) j14)];
                }
                oVar2 = oVar2.f43856g;
            }
        }
    }

    public String g(long j10) throws EOFException {
        return a(j10, u.f43865a);
    }

    public o b(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            o oVar = this.f43817a;
            if (oVar == null) {
                o oVarA = p.a();
                this.f43817a = oVarA;
                oVarA.f43856g = oVarA;
                oVarA.f43855f = oVarA;
                return oVarA;
            }
            o oVar2 = oVar.f43856g;
            return (oVar2.f43852c + i10 > 8192 || !oVar2.f43854e) ? oVar2.a(p.a()) : oVar2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i10) {
        o oVarB = b(2);
        byte[] bArr = oVarB.f43850a;
        int i11 = oVarB.f43852c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        oVarB.f43852c = i11 + 2;
        this.f43818b += 2;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i10 = iRemaining;
            while (i10 > 0) {
                o oVarB = b(1);
                int iMin = Math.min(i10, 8192 - oVarB.f43852c);
                byteBuffer.get(oVarB.f43850a, oVarB.f43852c, iMin);
                i10 -= iMin;
                oVarB.f43852c += iMin;
            }
            this.f43818b += iRemaining;
            return iRemaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final c a(c cVar, long j10, long j11) {
        if (cVar != null) {
            long j12 = j10;
            u.a(this.f43818b, j12, j11);
            if (j11 != 0) {
                cVar.f43818b += j11;
                o oVar = this.f43817a;
                while (true) {
                    long j13 = oVar.f43852c - oVar.f43851b;
                    if (j12 < j13) {
                        break;
                    }
                    j12 -= j13;
                    oVar = oVar.f43855f;
                }
                o oVar2 = oVar;
                long j14 = j11;
                while (j14 > 0) {
                    o oVarC = oVar2.c();
                    int i10 = (int) (oVarC.f43851b + j12);
                    oVarC.f43851b = i10;
                    oVarC.f43852c = Math.min(i10 + ((int) j14), oVarC.f43852c);
                    o oVar3 = cVar.f43817a;
                    if (oVar3 == null) {
                        oVarC.f43856g = oVarC;
                        oVarC.f43855f = oVarC;
                        cVar.f43817a = oVarC;
                    } else {
                        oVar3.f43856g.a(oVarC);
                    }
                    j14 -= oVarC.f43852c - oVarC.f43851b;
                    oVar2 = oVar2.f43855f;
                    j12 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f43818b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.a(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f43817a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.f43852c - oVar.f43851b);
        byteBuffer.put(oVar.f43850a, oVar.f43851b, iMin);
        int i10 = oVar.f43851b + iMin;
        oVar.f43851b = i10;
        this.f43818b -= iMin;
        if (i10 == oVar.f43852c) {
            this.f43817a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i10) {
        o oVarB = b(1);
        byte[] bArr = oVarB.f43850a;
        int i11 = oVarB.f43852c;
        oVarB.f43852c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f43818b++;
        return this;
    }

    public c f(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            writeByte((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            writeByte((i10 & 63) | 128);
            return this;
        }
        if (i10 >= 65536) {
            if (i10 <= 1114111) {
                writeByte((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                writeByte(((i10 >> 12) & 63) | 128);
                writeByte(((i10 >> 6) & 63) | 128);
                writeByte((i10 & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException(w0.i.b(i10, new StringBuilder("Unexpected code point: ")));
        }
        if (i10 >= 55296 && i10 <= 57343) {
            writeByte(63);
            return this;
        }
        writeByte((i10 >> 12) | 224);
        writeByte(((i10 >> 6) & 63) | 128);
        writeByte((i10 & 63) | 128);
        return this;
    }

    public String a(long j10, Charset charset) throws EOFException {
        u.a(this.f43818b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j10 == 0) {
            return "";
        }
        o oVar = this.f43817a;
        int i10 = oVar.f43851b;
        if (i10 + j10 > oVar.f43852c) {
            return new String(c(j10), charset);
        }
        String str = new String(oVar.f43850a, i10, (int) j10, charset);
        int i11 = (int) (oVar.f43851b + j10);
        oVar.f43851b = i11;
        this.f43818b -= j10;
        if (i11 == oVar.f43852c) {
            this.f43817a = oVar.b();
            p.a(oVar);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i10) {
        o oVarB = b(4);
        byte[] bArr = oVarB.f43850a;
        int i11 = oVarB.f43852c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        oVarB.f43852c = i11 + 4;
        this.f43818b += 4;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return t.f43861d;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o oVarB = b(iNumberOfTrailingZeros);
        byte[] bArr = oVarB.f43850a;
        int i10 = oVarB.f43852c;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f43816c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        oVarB.f43852c += iNumberOfTrailingZeros;
        this.f43818b += iNumberOfTrailingZeros;
        return this;
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public c a(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "beginIndex < 0: "));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
                sbT.append(str.length());
                throw new IllegalArgumentException(sbT.toString());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    o oVarB = b(1);
                    byte[] bArr = oVarB.f43850a;
                    int i12 = oVarB.f43852c - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = oVarB.f43852c;
                    int i15 = (i12 + i10) - i14;
                    oVarB.f43852c = i14 + i15;
                    this.f43818b += i15;
                } else {
                    if (cCharAt2 < 2048) {
                        writeByte((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        writeByte((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            writeByte((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            writeByte(((i17 >> 12) & 63) | 128);
                            writeByte(((i17 >> 6) & 63) | 128);
                            writeByte((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i16;
                        }
                    } else {
                        writeByte((cCharAt2 >> '\f') | 224);
                        writeByte(((cCharAt2 >> 6) & 63) | 128);
                        writeByte((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(w0.i.a(i11, i10, "endIndex < beginIndex: ", " < "));
    }

    public c a(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError(a.b.e(i10, "beginIndex < 0: "));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
                sbT.append(str.length());
                throw new IllegalArgumentException(sbT.toString());
            }
            if (charset != null) {
                if (charset.equals(u.f43865a)) {
                    return a(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(w0.i.a(i11, i10, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            u.a(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o oVarB = b(1);
                int iMin = Math.min(i12 - i10, 8192 - oVarB.f43852c);
                System.arraycopy(bArr, i10, oVarB.f43850a, oVarB.f43852c, iMin);
                i10 += iMin;
                oVarB.f43852c += iMin;
            }
            this.f43818b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jB = sVar.b(this, 8192L);
            if (jB == -1) {
                return j10;
            }
            j10 += jB;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            u.a(cVar.f43818b, 0L, j10);
            while (j10 > 0) {
                o oVar = cVar.f43817a;
                if (j10 < oVar.f43852c - oVar.f43851b) {
                    o oVar2 = this.f43817a;
                    o oVar3 = oVar2 != null ? oVar2.f43856g : null;
                    if (oVar3 != null && oVar3.f43854e) {
                        if ((oVar3.f43852c + j10) - (oVar3.f43853d ? 0 : oVar3.f43851b) <= 8192) {
                            oVar.a(oVar3, (int) j10);
                            cVar.f43818b -= j10;
                            this.f43818b += j10;
                            return;
                        }
                    }
                    cVar.f43817a = oVar.a((int) j10);
                }
                o oVar4 = cVar.f43817a;
                long j11 = oVar4.f43852c - oVar4.f43851b;
                cVar.f43817a = oVar4.b();
                o oVar5 = this.f43817a;
                if (oVar5 == null) {
                    this.f43817a = oVar4;
                    oVar4.f43856g = oVar4;
                    oVar4.f43855f = oVar4;
                } else {
                    oVar5.f43856g.a(oVar4).a();
                }
                cVar.f43818b -= j11;
                this.f43818b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) {
        o oVar;
        long j12 = j10;
        long j13 = j11;
        long j14 = 0;
        if (j12 >= 0 && j13 >= j12) {
            long j15 = this.f43818b;
            if (j13 > j15) {
                j13 = j15;
            }
            if (j12 == j13 || (oVar = this.f43817a) == null) {
                return -1L;
            }
            if (j15 - j12 < j12) {
                while (j15 > j12) {
                    oVar = oVar.f43856g;
                    j15 -= oVar.f43852c - oVar.f43851b;
                }
            } else {
                while (true) {
                    long j16 = (oVar.f43852c - oVar.f43851b) + j14;
                    if (j16 >= j12) {
                        break;
                    }
                    oVar = oVar.f43855f;
                    j14 = j16;
                }
                j15 = j14;
            }
            while (j15 < j13) {
                byte[] bArr = oVar.f43850a;
                int iMin = (int) Math.min(oVar.f43852c, (oVar.f43851b + j13) - j15);
                for (int i10 = (int) ((oVar.f43851b + j12) - j15); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return (i10 - oVar.f43851b) + j15;
                    }
                }
                j15 += oVar.f43852c - oVar.f43851b;
                oVar = oVar.f43855f;
                j12 = j15;
            }
            return -1L;
        }
        StringBuilder sbR = e2.r(this.f43818b, "size=", " fromIndex=");
        sbR.append(j12);
        throw new IllegalArgumentException(e2.i(j13, " toIndex=", sbR));
    }

    public final f a(int i10) {
        if (i10 == 0) {
            return f.f43821e;
        }
        return new q(this, i10);
    }
}
