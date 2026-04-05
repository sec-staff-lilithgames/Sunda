package io.odeeo.internal.d;

import io.odeeo.internal.d.f;
import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends l {

    /* renamed from: i, reason: collision with root package name */
    public final long f63488i;

    /* renamed from: j, reason: collision with root package name */
    public final long f63489j;

    /* renamed from: k, reason: collision with root package name */
    public final short f63490k;

    /* renamed from: l, reason: collision with root package name */
    public int f63491l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f63492m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f63493n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f63494o;

    /* renamed from: p, reason: collision with root package name */
    public int f63495p;

    /* renamed from: q, reason: collision with root package name */
    public int f63496q;

    /* renamed from: r, reason: collision with root package name */
    public int f63497r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f63498s;

    /* renamed from: t, reason: collision with root package name */
    public long f63499t;

    public u() {
        this(150000L, 20000L, (short) 1024);
    }

    public final void a(byte[] bArr, int i10) {
        a(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f63498s = true;
        }
    }

    @Override // io.odeeo.internal.d.l
    public void b() {
        if (this.f63492m) {
            this.f63491l = this.f63406b.f63355d;
            int iA = a(this.f63488i) * this.f63491l;
            if (this.f63493n.length != iA) {
                this.f63493n = new byte[iA];
            }
            int iA2 = a(this.f63489j) * this.f63491l;
            this.f63497r = iA2;
            if (this.f63494o.length != iA2) {
                this.f63494o = new byte[iA2];
            }
        }
        this.f63495p = 0;
        this.f63499t = 0L;
        this.f63496q = 0;
        this.f63498s = false;
    }

    @Override // io.odeeo.internal.d.l
    public void c() {
        int i10 = this.f63496q;
        if (i10 > 0) {
            a(this.f63493n, i10);
        }
        if (this.f63498s) {
            return;
        }
        this.f63499t += this.f63497r / this.f63491l;
    }

    @Override // io.odeeo.internal.d.l
    public void d() {
        this.f63492m = false;
        this.f63497r = 0;
        byte[] bArr = g0.f65866f;
        this.f63493n = bArr;
        this.f63494o = bArr;
    }

    public final void e(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f63493n.length));
        int iA = a(byteBuffer);
        if (iA == byteBuffer.position()) {
            this.f63495p = 1;
        } else {
            byteBuffer.limit(iA);
            c(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public final void f(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iB = b(byteBuffer);
        byteBuffer.limit(iB);
        this.f63499t += byteBuffer.remaining() / this.f63491l;
        a(byteBuffer, this.f63494o, this.f63497r);
        if (iB < iLimit) {
            a(this.f63494o, this.f63497r);
            this.f63495p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    public long getSkippedFrames() {
        return this.f63499t;
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public boolean isActive() {
        return this.f63492m;
    }

    @Override // io.odeeo.internal.d.l
    public f.a onConfigure(f.a aVar) throws f.b {
        if (aVar.f63354c == 2) {
            return this.f63492m ? aVar : f.a.f63351e;
        }
        throw new f.b(aVar);
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i10 = this.f63495p;
            if (i10 == 0) {
                e(byteBuffer);
            } else if (i10 == 1) {
                d(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                f(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f63492m = z10;
    }

    public u(long j10, long j11, short s10) {
        io.odeeo.internal.q0.a.checkArgument(j11 <= j10);
        this.f63488i = j10;
        this.f63489j = j11;
        this.f63490k = s10;
        byte[] bArr = g0.f65866f;
        this.f63493n = bArr;
        this.f63494o = bArr;
    }

    public final void a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f63497r);
        int i11 = this.f63497r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f63494o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f63494o, i11, iMin);
    }

    public final void c(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        a(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f63498s = true;
        }
    }

    public final void d(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iB = b(byteBuffer);
        int iPosition = iB - byteBuffer.position();
        byte[] bArr = this.f63493n;
        int length = bArr.length;
        int i10 = this.f63496q;
        int i11 = length - i10;
        if (iB < iLimit && iPosition < i11) {
            a(bArr, i10);
            this.f63496q = 0;
            this.f63495p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f63493n, this.f63496q, iMin);
        int i12 = this.f63496q + iMin;
        this.f63496q = i12;
        byte[] bArr2 = this.f63493n;
        if (i12 == bArr2.length) {
            if (this.f63498s) {
                a(bArr2, this.f63497r);
                this.f63499t += (this.f63496q - (this.f63497r * 2)) / this.f63491l;
            } else {
                this.f63499t += (i12 - this.f63497r) / this.f63491l;
            }
            a(byteBuffer, this.f63493n, this.f63496q);
            this.f63496q = 0;
            this.f63495p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final int a(long j10) {
        return (int) ((j10 * this.f63406b.f63352a) / 1000000);
    }

    public final int a(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f63490k);
        int i10 = this.f63491l;
        return a.b.A(iLimit, i10, i10, i10);
    }

    public final int b(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f63490k) {
                int i10 = this.f63491l;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }
}
