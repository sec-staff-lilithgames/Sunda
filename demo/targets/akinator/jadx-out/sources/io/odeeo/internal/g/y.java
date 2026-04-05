package io.odeeo.internal.g;

import io.odeeo.internal.g.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64183a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f64184b;

    /* renamed from: c, reason: collision with root package name */
    public int f64185c;

    /* renamed from: d, reason: collision with root package name */
    public long f64186d;

    /* renamed from: e, reason: collision with root package name */
    public int f64187e;

    /* renamed from: f, reason: collision with root package name */
    public int f64188f;

    /* renamed from: g, reason: collision with root package name */
    public int f64189g;

    public void outputPendingSampleMetadata(x xVar, x.a aVar) {
        if (this.f64185c > 0) {
            xVar.sampleMetadata(this.f64186d, this.f64187e, this.f64188f, this.f64189g, aVar);
            this.f64185c = 0;
        }
    }

    public void reset() {
        this.f64184b = false;
        this.f64185c = 0;
    }

    public void sampleMetadata(x xVar, long j10, int i10, int i11, int i12, x.a aVar) {
        io.odeeo.internal.q0.a.checkState(this.f64189g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f64184b) {
            int i13 = this.f64185c;
            int i14 = i13 + 1;
            this.f64185c = i14;
            if (i13 == 0) {
                this.f64186d = j10;
                this.f64187e = i10;
                this.f64188f = 0;
            }
            this.f64188f += i11;
            this.f64189g = i12;
            if (i14 >= 16) {
                outputPendingSampleMetadata(xVar, aVar);
            }
        }
    }

    public void startSample(i iVar) throws IOException {
        if (this.f64184b) {
            return;
        }
        iVar.peekFully(this.f64183a, 0, 10);
        iVar.resetPeekPosition();
        if (io.odeeo.internal.d.b.parseTrueHdSyncframeAudioSampleCount(this.f64183a) == 0) {
            return;
        }
        this.f64184b = true;
    }
}
