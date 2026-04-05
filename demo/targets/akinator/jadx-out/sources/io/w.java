package io;

import android.content.Context;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final x f68234a;

    /* renamed from: b, reason: collision with root package name */
    public final z f68235b;

    /* renamed from: c, reason: collision with root package name */
    public final long f68236c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f68237d;

    /* renamed from: g, reason: collision with root package name */
    public long f68240g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f68243j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f68246m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f68247n;

    /* renamed from: e, reason: collision with root package name */
    public int f68238e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f68239f = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f68241h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f68242i = C.TIME_UNSET;

    /* renamed from: k, reason: collision with root package name */
    public float f68244k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public io.bidmachine.media3.common.util.g f68245l = io.bidmachine.media3.common.util.g.f60717a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f68248a = C.TIME_UNSET;

        /* renamed from: b, reason: collision with root package name */
        public long f68249b = C.TIME_UNSET;

        public long getEarlyUs() {
            return this.f68248a;
        }

        public long getReleaseTimeNs() {
            return this.f68249b;
        }
    }

    public w(Context context, x xVar, long j10) {
        this.f68234a = xVar;
        this.f68236c = j10;
        this.f68235b = new z(context);
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.f68238e == 0) {
            this.f68238e = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[PHI: r20
      0x00a6: PHI (r20v5 int) = (r20v4 int), (r20v6 int), (r20v6 int) binds: [B:44:0x00b3, B:36:0x009a, B:38:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getFrameReleaseAction(long r20, long r22, long r24, long r26, boolean r28, boolean r29, io.w.a r30) throws io.bidmachine.media3.exoplayer.a0 {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.w.getFrameReleaseAction(long, long, long, long, boolean, boolean, io.w$a):int");
    }

    public boolean isReady(boolean z10) {
        if (z10 && (this.f68238e == 3 || (!this.f68246m && this.f68247n))) {
            this.f68242i = C.TIME_UNSET;
            return true;
        }
        if (this.f68242i == C.TIME_UNSET) {
            return false;
        }
        if (((q0) this.f68245l).elapsedRealtime() < this.f68242i) {
            return true;
        }
        this.f68242i = C.TIME_UNSET;
        return false;
    }

    public void join(boolean z10) {
        this.f68243j = z10;
        long j10 = this.f68236c;
        this.f68242i = j10 > 0 ? ((q0) this.f68245l).elapsedRealtime() + j10 : C.TIME_UNSET;
    }

    public void onDisabled() {
        this.f68238e = Math.min(this.f68238e, 0);
    }

    public void onEnabled(boolean z10) {
        this.f68238e = z10 ? 1 : 0;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z10 = this.f68238e != 3;
        this.f68238e = 3;
        this.f68240g = a1.msToUs(((q0) this.f68245l).elapsedRealtime());
        return z10;
    }

    public void onProcessedStreamChange() {
        this.f68238e = Math.min(this.f68238e, 2);
    }

    public void onStarted() {
        this.f68237d = true;
        this.f68240g = a1.msToUs(((q0) this.f68245l).elapsedRealtime());
        this.f68235b.onStarted();
    }

    public void onStopped() {
        this.f68237d = false;
        this.f68242i = C.TIME_UNSET;
        this.f68235b.onStopped();
    }

    public void reset() {
        this.f68235b.onPositionReset();
        this.f68241h = C.TIME_UNSET;
        this.f68239f = C.TIME_UNSET;
        this.f68238e = Math.min(this.f68238e, 1);
        this.f68242i = C.TIME_UNSET;
    }

    public void setChangeFrameRateStrategy(int i10) {
        this.f68235b.setChangeFrameRateStrategy(i10);
    }

    public void setClock(io.bidmachine.media3.common.util.g gVar) {
        this.f68245l = gVar;
    }

    public void setFrameRate(float f10) {
        this.f68235b.onFormatChanged(f10);
    }

    public void setOutputSurface(Surface surface) {
        this.f68246m = surface != null;
        this.f68247n = false;
        this.f68235b.onSurfaceChanged(surface);
        this.f68238e = Math.min(this.f68238e, 1);
    }

    public void setPlaybackSpeed(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 > 0.0f);
        if (f10 == this.f68244k) {
            return;
        }
        this.f68244k = f10;
        this.f68235b.onPlaybackSpeed(f10);
    }
}
