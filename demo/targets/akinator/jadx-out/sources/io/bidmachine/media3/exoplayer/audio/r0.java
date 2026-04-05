package io.bidmachine.media3.exoplayer.audio;

import android.os.SystemClock;
import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f61012a;

    public r0(u0 u0Var) {
        this.f61012a = u0Var;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.x
    public void onInvalidLatency(long j10) {
        io.bidmachine.media3.common.util.b0.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.x
    public void onPositionAdvancing(long j10) {
        s sVar = this.f61012a.f61053t;
        if (sVar != null) {
            ((z0) sVar).onPositionAdvancing(j10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.x
    public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
        StringBuilder sbR = e2.r(j10, "Spurious audio timestamp (frame position mismatch): ", ", ");
        sbR.append(j11);
        e2.A(sbR, ", ", j12, ", ");
        sbR.append(j13);
        sbR.append(", ");
        u0 u0Var = this.f61012a;
        sbR.append(u0Var.f());
        sbR.append(", ");
        sbR.append(u0Var.g());
        io.bidmachine.media3.common.util.b0.w("DefaultAudioSink", sbR.toString());
    }

    @Override // io.bidmachine.media3.exoplayer.audio.x
    public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
        StringBuilder sbR = e2.r(j10, "Spurious audio timestamp (system clock mismatch): ", ", ");
        sbR.append(j11);
        e2.A(sbR, ", ", j12, ", ");
        sbR.append(j13);
        sbR.append(", ");
        u0 u0Var = this.f61012a;
        sbR.append(u0Var.f());
        sbR.append(", ");
        sbR.append(u0Var.g());
        io.bidmachine.media3.common.util.b0.w("DefaultAudioSink", sbR.toString());
    }

    @Override // io.bidmachine.media3.exoplayer.audio.x
    public void onUnderrun(int i10, long j10) {
        u0 u0Var = this.f61012a;
        if (u0Var.f61053t != null) {
            ((z0) u0Var.f61053t).onUnderrun(i10, j10, SystemClock.elapsedRealtime() - u0Var.f61032e0);
        }
    }
}
