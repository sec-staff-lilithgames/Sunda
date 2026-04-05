package io.odeeo.internal.r;

import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.r;
import io.odeeo.internal.q0.p;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f66035a;

    /* renamed from: b, reason: collision with root package name */
    public long f66036b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f66037c;

    public final long a(long j10) {
        return Math.max(0L, ((this.f66036b - 529) * 1000000) / j10) + this.f66035a;
    }

    public long getLastOutputBufferPresentationTimeUs(t tVar) {
        return a(tVar.f62985z);
    }

    public void reset() {
        this.f66035a = 0L;
        this.f66036b = 0L;
        this.f66037c = false;
    }

    public long updateAndGetPresentationTimeUs(t tVar, io.odeeo.internal.e.g gVar) {
        if (this.f66036b == 0) {
            this.f66035a = gVar.f63707e;
        }
        if (this.f66037c) {
            return gVar.f63707e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) io.odeeo.internal.q0.a.checkNotNull(gVar.f63705c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        int mpegAudioFrameSampleCount = r.parseMpegAudioFrameSampleCount(i10);
        if (mpegAudioFrameSampleCount != -1) {
            long jA = a(tVar.f62985z);
            this.f66036b += mpegAudioFrameSampleCount;
            return jA;
        }
        this.f66037c = true;
        this.f66036b = 0L;
        this.f66035a = gVar.f63707e;
        p.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return gVar.f63707e;
    }
}
