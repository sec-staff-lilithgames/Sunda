package xn;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends nn.g {

    /* renamed from: l, reason: collision with root package name */
    public long f92087l;

    /* renamed from: m, reason: collision with root package name */
    public int f92088m;

    /* renamed from: n, reason: collision with root package name */
    public int f92089n;

    public g() {
        super(2);
        this.f92089n = 32;
    }

    public boolean append(nn.g gVar) {
        ByteBuffer byteBuffer;
        io.bidmachine.media3.common.util.a.checkArgument(!gVar.isEncrypted());
        io.bidmachine.media3.common.util.a.checkArgument(!gVar.hasSupplementalData());
        io.bidmachine.media3.common.util.a.checkArgument(!gVar.isEndOfStream());
        if (hasSamples()) {
            if (this.f92088m >= this.f92089n) {
                return false;
            }
            ByteBuffer byteBuffer2 = gVar.f77080f;
            if (byteBuffer2 != null && (byteBuffer = this.f77080f) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f92088m;
        this.f92088m = i10 + 1;
        if (i10 == 0) {
            this.f77082h = gVar.f77082h;
            if (gVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = gVar.f77080f;
        if (byteBuffer3 != null) {
            ensureSpaceForWrite(byteBuffer3.remaining());
            this.f77080f.put(byteBuffer3);
        }
        this.f92087l = gVar.f77082h;
        return true;
    }

    @Override // nn.g, nn.a
    public void clear() {
        super.clear();
        this.f92088m = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.f77082h;
    }

    public long getLastSampleTimeUs() {
        return this.f92087l;
    }

    public int getSampleCount() {
        return this.f92088m;
    }

    public boolean hasSamples() {
        return this.f92088m > 0;
    }

    public void setMaxSampleCount(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 > 0);
        this.f92089n = i10;
    }
}
