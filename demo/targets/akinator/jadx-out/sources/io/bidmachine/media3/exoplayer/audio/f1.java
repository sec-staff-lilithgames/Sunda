package io.bidmachine.media3.exoplayer.audio;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f1 extends hn.j {

    /* renamed from: i, reason: collision with root package name */
    public int f60939i;

    /* renamed from: j, reason: collision with root package name */
    public int f60940j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f60941k;

    /* renamed from: l, reason: collision with root package name */
    public int f60942l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f60943m = io.bidmachine.media3.common.util.a1.f60681c;

    /* renamed from: n, reason: collision with root package name */
    public int f60944n;

    /* renamed from: o, reason: collision with root package name */
    public long f60945o;

    @Override // hn.j, hn.h
    public long getDurationAfterProcessorApplied(long j10) {
        return j10 - io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(this.f60940j + this.f60939i, this.f59043b.f59038a);
    }

    @Override // hn.j, hn.h
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f60944n) > 0) {
            a(i10).put(this.f60943m, 0, this.f60944n).flip();
            this.f60944n = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.f60945o;
    }

    @Override // hn.j, hn.h
    public boolean isEnded() {
        return super.isEnded() && this.f60944n == 0;
    }

    @Override // hn.j
    public hn.f onConfigure(hn.f fVar) throws hn.g {
        int i10 = fVar.f59040c;
        if (i10 != 2 && i10 != 4) {
            throw new hn.g(fVar);
        }
        this.f60941k = true;
        return (this.f60939i == 0 && this.f60940j == 0) ? hn.f.f59037e : fVar;
    }

    @Override // hn.j
    public final void onFlush() {
        if (this.f60941k) {
            this.f60941k = false;
            int i10 = this.f60940j;
            int i11 = this.f59043b.f59041d;
            this.f60943m = new byte[i10 * i11];
            this.f60942l = this.f60939i * i11;
        }
        this.f60944n = 0;
    }

    @Override // hn.j
    public final void onQueueEndOfStream() {
        if (this.f60941k) {
            if (this.f60944n > 0) {
                this.f60945o += r0 / this.f59043b.f59041d;
            }
            this.f60944n = 0;
        }
    }

    @Override // hn.j
    public final void onReset() {
        this.f60943m = io.bidmachine.media3.common.util.a1.f60681c;
    }

    @Override // hn.j, hn.h
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f60942l);
        this.f60945o += iMin / this.f59043b.f59041d;
        this.f60942l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f60942l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f60944n + i11) - this.f60943m.length;
        ByteBuffer byteBufferA = a(length);
        int iConstrainValue = io.bidmachine.media3.common.util.a1.constrainValue(length, 0, this.f60944n);
        byteBufferA.put(this.f60943m, 0, iConstrainValue);
        int iConstrainValue2 = io.bidmachine.media3.common.util.a1.constrainValue(length - iConstrainValue, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iConstrainValue2;
        int i13 = this.f60944n - iConstrainValue;
        this.f60944n = i13;
        byte[] bArr = this.f60943m;
        System.arraycopy(bArr, iConstrainValue, bArr, 0, i13);
        byteBuffer.get(this.f60943m, this.f60944n, i12);
        this.f60944n += i12;
        byteBufferA.flip();
    }

    public void resetTrimmedFrameCount() {
        this.f60945o = 0L;
    }

    public void setTrimFrameCount(int i10, int i11) {
        this.f60939i = i10;
        this.f60940j = i11;
    }
}
