package qe;

import com.google.android.exoplayer2.audio.k1;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.z0;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public long f82833a;

    /* renamed from: b, reason: collision with root package name */
    public long f82834b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f82835c;

    public long getLastOutputBufferPresentationTimeUs(z0 z0Var) {
        return Math.max(0L, ((this.f82834b - 529) * 1000000) / z0Var.B) + this.f82833a;
    }

    public void reset() {
        this.f82833a = 0L;
        this.f82834b = 0L;
        this.f82835c = false;
    }

    public long updateAndGetPresentationTimeUs(z0 z0Var, ce.h hVar) {
        if (this.f82834b == 0) {
            this.f82833a = hVar.f12239g;
        }
        if (this.f82835c) {
            return hVar.f12239g;
        }
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.checkNotNull(hVar.f12237e);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        int mpegAudioFrameSampleCount = k1.parseMpegAudioFrameSampleCount(i10);
        if (mpegAudioFrameSampleCount == -1) {
            this.f82835c = true;
            this.f82834b = 0L;
            this.f82833a = hVar.f12239g;
            f0.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return hVar.f12239g;
        }
        long jMax = Math.max(0L, ((this.f82834b - 529) * 1000000) / z0Var.B) + this.f82833a;
        this.f82834b += mpegAudioFrameSampleCount;
        return jMax;
    }
}
