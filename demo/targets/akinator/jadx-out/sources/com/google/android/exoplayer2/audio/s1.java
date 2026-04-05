package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s1 extends m0 {

    /* renamed from: i, reason: collision with root package name */
    public int f27283i;

    /* renamed from: j, reason: collision with root package name */
    public int f27284j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27285k;

    /* renamed from: l, reason: collision with root package name */
    public int f27286l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f27287m = com.google.android.exoplayer2.util.n1.f28511f;

    /* renamed from: n, reason: collision with root package name */
    public int f27288n;

    /* renamed from: o, reason: collision with root package name */
    public long f27289o;

    @Override // com.google.android.exoplayer2.audio.m0
    public final void a() {
        if (this.f27285k) {
            this.f27285k = false;
            int i10 = this.f27284j;
            int i11 = this.f27205b.f27282d;
            this.f27287m = new byte[i10 * i11];
            this.f27286l = this.f27283i * i11;
        }
        this.f27288n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public final void b() {
        if (this.f27285k) {
            if (this.f27288n > 0) {
                this.f27289o += r0 / this.f27205b.f27282d;
            }
            this.f27288n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public final void c() {
        this.f27287m = com.google.android.exoplayer2.util.n1.f28511f;
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f27288n) > 0) {
            d(i10).put(this.f27287m, 0, this.f27288n).flip();
            this.f27288n = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.f27289o;
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public boolean isEnded() {
        return super.isEnded() && this.f27288n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public s onConfigure(s sVar) throws t {
        if (sVar.f27281c != 2) {
            throw new t(sVar);
        }
        this.f27285k = true;
        return (this.f27283i == 0 && this.f27284j == 0) ? s.f27278e : sVar;
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f27286l);
        this.f27289o += iMin / this.f27205b.f27282d;
        this.f27286l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f27286l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f27288n + i11) - this.f27287m.length;
        ByteBuffer byteBufferD = d(length);
        int iConstrainValue = com.google.android.exoplayer2.util.n1.constrainValue(length, 0, this.f27288n);
        byteBufferD.put(this.f27287m, 0, iConstrainValue);
        int iConstrainValue2 = com.google.android.exoplayer2.util.n1.constrainValue(length - iConstrainValue, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
        byteBufferD.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iConstrainValue2;
        int i13 = this.f27288n - iConstrainValue;
        this.f27288n = i13;
        byte[] bArr = this.f27287m;
        System.arraycopy(bArr, iConstrainValue, bArr, 0, i13);
        byteBuffer.get(this.f27287m, this.f27288n, i12);
        this.f27288n += i12;
        byteBufferD.flip();
    }

    public void resetTrimmedFrameCount() {
        this.f27289o = 0L;
    }

    public void setTrimFrameCount(int i10, int i11) {
        this.f27283i = i10;
        this.f27284j = i11;
    }
}
