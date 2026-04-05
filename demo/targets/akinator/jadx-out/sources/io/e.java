package io;

import android.graphics.Bitmap;
import android.view.Surface;
import com.applovin.impl.ga;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.p0;
import io.bidmachine.media3.common.util.v0;
import io.bidmachine.media3.exoplayer.r1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f62095a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f62096b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f62097c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f62098d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f62099e;

    /* renamed from: f, reason: collision with root package name */
    public io.bidmachine.media3.common.b f62100f;

    /* renamed from: g, reason: collision with root package name */
    public long f62101g;

    /* renamed from: h, reason: collision with root package name */
    public long f62102h;

    /* renamed from: i, reason: collision with root package name */
    public i0 f62103i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f62104j;

    /* renamed from: k, reason: collision with root package name */
    public v f62105k;

    public e(w wVar, io.bidmachine.media3.common.util.g gVar) {
        this.f62095a = wVar;
        wVar.setClock(gVar);
        this.f62096b = gVar;
        this.f62097c = new c0(new d(this), wVar);
        this.f62098d = new ArrayDeque();
        this.f62100f = new gn.w().build();
        this.f62101g = C.TIME_UNSET;
        this.f62103i = i0.f62128a;
        this.f62104j = new ga(1);
        this.f62105k = new b();
    }

    @Override // io.l0
    public void clearOutputSurfaceInfo() {
        this.f62099e = null;
        this.f62095a.setOutputSurface(null);
    }

    @Override // io.l0
    public void enableMayRenderStartOfStream() {
        this.f62095a.allowReleaseFirstFrameBeforeStarted();
    }

    @Override // io.l0
    public void flush(boolean z10) {
        if (z10) {
            this.f62095a.reset();
        }
        this.f62097c.flush();
        this.f62098d.clear();
    }

    @Override // io.l0
    public Surface getInputSurface() {
        return (Surface) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f62099e);
    }

    @Override // io.l0
    public boolean handleInputBitmap(Bitmap bitmap, v0 v0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // io.l0
    public boolean handleInputFrame(long j10, boolean z10, j0 j0Var) {
        this.f62098d.add(j0Var);
        this.f62097c.onFrameAvailableForRendering(j10 - this.f62102h);
        return true;
    }

    @Override // io.l0
    public boolean initialize(io.bidmachine.media3.common.b bVar) {
        return true;
    }

    @Override // io.l0
    public boolean isEnded() {
        return this.f62097c.isEnded();
    }

    @Override // io.l0
    public boolean isInitialized() {
        return true;
    }

    @Override // io.l0
    public boolean isReady(boolean z10) {
        return this.f62095a.isReady(z10);
    }

    @Override // io.l0
    public void join(boolean z10) {
        this.f62095a.join(z10);
    }

    @Override // io.l0
    public void onInputStreamChanged(int i10, io.bidmachine.media3.common.b bVar, List<Object> list) {
        io.bidmachine.media3.common.util.a.checkState(list.isEmpty());
        int i11 = bVar.f60672v;
        int i12 = bVar.f60673w;
        io.bidmachine.media3.common.b bVar2 = this.f62100f;
        if (i11 != bVar2.f60672v || i12 != bVar2.f60673w) {
            this.f62097c.onVideoSizeChanged(i11, i12);
        }
        float f10 = bVar.f60674x;
        if (f10 != this.f62100f.f60674x) {
            this.f62095a.setFrameRate(f10);
        }
        this.f62100f = bVar;
    }

    @Override // io.l0
    public void onRendererDisabled() {
        this.f62095a.onDisabled();
    }

    @Override // io.l0
    public void onRendererEnabled(boolean z10) {
        this.f62095a.onEnabled(z10);
    }

    @Override // io.l0
    public void onRendererStarted() {
        this.f62095a.onStarted();
    }

    @Override // io.l0
    public void onRendererStopped() {
        this.f62095a.onStopped();
    }

    @Override // io.l0
    public void render(long j10, long j11) throws k0 {
        try {
            this.f62097c.render(j10, j11);
        } catch (io.bidmachine.media3.exoplayer.a0 e10) {
            throw new k0(e10, this.f62100f);
        }
    }

    @Override // io.l0
    public void setChangeFrameRateStrategy(int i10) {
        this.f62095a.setChangeFrameRateStrategy(i10);
    }

    @Override // io.l0
    public void setListener(i0 i0Var, Executor executor) {
        this.f62103i = i0Var;
        this.f62104j = executor;
    }

    @Override // io.l0
    public void setOutputSurfaceInfo(Surface surface, p0 p0Var) {
        this.f62099e = surface;
        this.f62095a.setOutputSurface(surface);
    }

    @Override // io.l0
    public void setPlaybackSpeed(float f10) {
        this.f62095a.setPlaybackSpeed(f10);
    }

    @Override // io.l0
    public void setStreamTimestampInfo(long j10, long j11) {
        if (j10 != this.f62101g) {
            this.f62097c.onStreamStartPositionChanged(j10);
            this.f62101g = j10;
        }
        this.f62102h = j11;
    }

    @Override // io.l0
    public void setVideoEffects(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // io.l0
    public void setVideoFrameMetadataListener(v vVar) {
        this.f62105k = vVar;
    }

    @Override // io.l0
    public void setWakeupListener(r1 r1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // io.l0
    public void signalEndOfCurrentInputStream() {
        this.f62097c.signalEndOfInput();
    }

    @Override // io.l0
    public void release() {
    }

    @Override // io.l0
    public void signalEndOfInput() {
    }
}
