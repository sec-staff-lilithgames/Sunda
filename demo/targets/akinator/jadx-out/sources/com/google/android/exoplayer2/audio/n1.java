package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n1 extends m0 {

    /* renamed from: i, reason: collision with root package name */
    public final long f27219i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27220j;

    /* renamed from: k, reason: collision with root package name */
    public final short f27221k;

    /* renamed from: l, reason: collision with root package name */
    public int f27222l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27223m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f27224n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f27225o;

    /* renamed from: p, reason: collision with root package name */
    public int f27226p;

    /* renamed from: q, reason: collision with root package name */
    public int f27227q;

    /* renamed from: r, reason: collision with root package name */
    public int f27228r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27229s;

    /* renamed from: t, reason: collision with root package name */
    public long f27230t;

    public n1() {
        this(150000L, 20000L, (short) 1024);
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public final void a() {
        if (this.f27223m) {
            s sVar = this.f27205b;
            int i10 = sVar.f27282d;
            this.f27222l = i10;
            int i11 = sVar.f27279a;
            int i12 = ((int) ((this.f27219i * i11) / 1000000)) * i10;
            if (this.f27224n.length != i12) {
                this.f27224n = new byte[i12];
            }
            int i13 = ((int) ((this.f27220j * i11) / 1000000)) * i10;
            this.f27228r = i13;
            if (this.f27225o.length != i13) {
                this.f27225o = new byte[i13];
            }
        }
        this.f27226p = 0;
        this.f27230t = 0L;
        this.f27227q = 0;
        this.f27229s = false;
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public final void b() {
        int i10 = this.f27227q;
        if (i10 > 0) {
            f(this.f27224n, i10);
        }
        if (this.f27229s) {
            return;
        }
        this.f27230t += this.f27228r / this.f27222l;
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public final void c() {
        this.f27223m = false;
        this.f27228r = 0;
        byte[] bArr = com.google.android.exoplayer2.util.n1.f28511f;
        this.f27224n = bArr;
        this.f27225o = bArr;
    }

    public final int e(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f27221k) {
                int i10 = this.f27222l;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void f(byte[] bArr, int i10) {
        d(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f27229s = true;
        }
    }

    public final void g(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f27228r);
        int i11 = this.f27228r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f27225o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f27225o, i11, iMin);
    }

    public long getSkippedFrames() {
        return this.f27230t;
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public boolean isActive() {
        return this.f27223m;
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public s onConfigure(s sVar) throws t {
        if (sVar.f27281c == 2) {
            return this.f27223m ? sVar : s.f27278e;
        }
        throw new t(sVar);
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f27210g.hasRemaining()) {
            int i10 = this.f27226p;
            if (i10 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f27224n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f27221k) {
                            int i11 = this.f27222l;
                            iPosition = a.b.A(iLimit2, i11, i11, i11);
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f27226p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    d(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f27229s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i10 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iE = e(byteBuffer);
                int iPosition2 = iE - byteBuffer.position();
                byte[] bArr = this.f27224n;
                int length = bArr.length;
                int i12 = this.f27227q;
                int i13 = length - i12;
                if (iE >= iLimit3 || iPosition2 >= i13) {
                    int iMin = Math.min(iPosition2, i13);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f27224n, this.f27227q, iMin);
                    int i14 = this.f27227q + iMin;
                    this.f27227q = i14;
                    byte[] bArr2 = this.f27224n;
                    if (i14 == bArr2.length) {
                        if (this.f27229s) {
                            f(bArr2, this.f27228r);
                            this.f27230t += (this.f27227q - (this.f27228r * 2)) / this.f27222l;
                        } else {
                            this.f27230t += (i14 - this.f27228r) / this.f27222l;
                        }
                        g(byteBuffer, this.f27224n, this.f27227q);
                        this.f27227q = 0;
                        this.f27226p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    f(bArr, i12);
                    this.f27227q = 0;
                    this.f27226p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iE2 = e(byteBuffer);
                byteBuffer.limit(iE2);
                this.f27230t += byteBuffer.remaining() / this.f27222l;
                g(byteBuffer, this.f27225o, this.f27228r);
                if (iE2 < iLimit4) {
                    f(this.f27225o, this.f27228r);
                    this.f27226p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f27223m = z10;
    }

    public n1(long j10, long j11, short s10) {
        com.google.android.exoplayer2.util.a.checkArgument(j11 <= j10);
        this.f27219i = j10;
        this.f27220j = j11;
        this.f27221k = s10;
        byte[] bArr = com.google.android.exoplayer2.util.n1.f28511f;
        this.f27224n = bArr;
        this.f27225o = bArr;
    }
}
