package qe;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends ce.h {

    /* renamed from: k, reason: collision with root package name */
    public long f82830k;

    /* renamed from: l, reason: collision with root package name */
    public int f82831l;

    /* renamed from: m, reason: collision with root package name */
    public int f82832m;

    public h() {
        super(2);
        this.f82832m = 32;
    }

    public boolean append(ce.h hVar) {
        ByteBuffer byteBuffer;
        com.google.android.exoplayer2.util.a.checkArgument(!hVar.isEncrypted());
        com.google.android.exoplayer2.util.a.checkArgument(!hVar.hasSupplementalData());
        com.google.android.exoplayer2.util.a.checkArgument(!hVar.isEndOfStream());
        if (hasSamples()) {
            if (this.f82831l >= this.f82832m || hVar.isDecodeOnly() != isDecodeOnly()) {
                return false;
            }
            ByteBuffer byteBuffer2 = hVar.f12237e;
            if (byteBuffer2 != null && (byteBuffer = this.f12237e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f82831l;
        this.f82831l = i10 + 1;
        if (i10 == 0) {
            this.f12239g = hVar.f12239g;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (hVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = hVar.f12237e;
        if (byteBuffer3 != null) {
            ensureSpaceForWrite(byteBuffer3.remaining());
            this.f12237e.put(byteBuffer3);
        }
        this.f82830k = hVar.f12239g;
        return true;
    }

    @Override // ce.h, ce.a
    public void clear() {
        super.clear();
        this.f82831l = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.f12239g;
    }

    public long getLastSampleTimeUs() {
        return this.f82830k;
    }

    public int getSampleCount() {
        return this.f82831l;
    }

    public boolean hasSamples() {
        return this.f82831l > 0;
    }

    public void setMaxSampleCount(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 > 0);
        this.f82832m = i10;
    }
}
