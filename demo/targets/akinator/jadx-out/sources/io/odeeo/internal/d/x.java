package io.odeeo.internal.d;

import io.odeeo.internal.d.f;
import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends l {

    /* renamed from: i, reason: collision with root package name */
    public int f63537i;

    /* renamed from: j, reason: collision with root package name */
    public int f63538j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f63539k;

    /* renamed from: l, reason: collision with root package name */
    public int f63540l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f63541m = g0.f65866f;

    /* renamed from: n, reason: collision with root package name */
    public int f63542n;

    /* renamed from: o, reason: collision with root package name */
    public long f63543o;

    @Override // io.odeeo.internal.d.l
    public void b() {
        if (this.f63539k) {
            this.f63539k = false;
            int i10 = this.f63538j;
            int i11 = this.f63406b.f63355d;
            this.f63541m = new byte[i10 * i11];
            this.f63540l = this.f63537i * i11;
        }
        this.f63542n = 0;
    }

    @Override // io.odeeo.internal.d.l
    public void c() {
        if (this.f63539k) {
            if (this.f63542n > 0) {
                this.f63543o += r0 / this.f63406b.f63355d;
            }
            this.f63542n = 0;
        }
    }

    @Override // io.odeeo.internal.d.l
    public void d() {
        this.f63541m = g0.f65866f;
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f63542n) > 0) {
            a(i10).put(this.f63541m, 0, this.f63542n).flip();
            this.f63542n = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.f63543o;
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public boolean isEnded() {
        return super.isEnded() && this.f63542n == 0;
    }

    @Override // io.odeeo.internal.d.l
    public f.a onConfigure(f.a aVar) throws f.b {
        if (aVar.f63354c != 2) {
            throw new f.b(aVar);
        }
        this.f63539k = true;
        return (this.f63537i == 0 && this.f63538j == 0) ? f.a.f63351e : aVar;
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f63540l);
        this.f63543o += iMin / this.f63406b.f63355d;
        this.f63540l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f63540l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f63542n + i11) - this.f63541m.length;
        ByteBuffer byteBufferA = a(length);
        int iConstrainValue = g0.constrainValue(length, 0, this.f63542n);
        byteBufferA.put(this.f63541m, 0, iConstrainValue);
        int iConstrainValue2 = g0.constrainValue(length - iConstrainValue, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iConstrainValue2;
        int i13 = this.f63542n - iConstrainValue;
        this.f63542n = i13;
        byte[] bArr = this.f63541m;
        System.arraycopy(bArr, iConstrainValue, bArr, 0, i13);
        byteBuffer.get(this.f63541m, this.f63542n, i12);
        this.f63542n += i12;
        byteBufferA.flip();
    }

    public void resetTrimmedFrameCount() {
        this.f63543o = 0L;
    }

    public void setTrimFrameCount(int i10, int i11) {
        this.f63537i = i10;
        this.f63538j = i11;
    }
}
