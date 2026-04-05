package io;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import com.ironsource.lh;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.f2;
import gn.j1;
import gn.k2;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.p0;
import io.bidmachine.media3.common.util.q0;
import io.bidmachine.media3.common.util.t0;
import io.bidmachine.media3.common.util.v0;
import io.bidmachine.media3.exoplayer.r1;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import nh.b5;
import nh.x4;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements l0, p {

    /* renamed from: a, reason: collision with root package name */
    public final int f62194a;

    /* renamed from: b, reason: collision with root package name */
    public b5 f62195b;

    /* renamed from: c, reason: collision with root package name */
    public io.bidmachine.media3.common.b f62196c;

    /* renamed from: d, reason: collision with root package name */
    public long f62197d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f62198e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f62199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f62200g;

    public o(s sVar, Context context, int i10) {
        this.f62200g = sVar;
        this.f62194a = i10;
        a1.getMaxPendingFramesCountForMediaCodecDecoders(context);
        this.f62195b = b5.of();
        this.f62197d = C.TIME_UNSET;
        this.f62198e = i0.f62128a;
        this.f62199f = s.f68187x;
    }

    public final void a(List list) {
        s sVar = this.f62200g;
        if (sVar.f68190c.supportsMultipleInputs()) {
            this.f62195b = b5.copyOf((Collection) list);
        } else {
            this.f62195b = new x4().addAll((Iterable<Object>) list).addAll((Iterable<Object>) sVar.f68192e).build();
        }
    }

    @Override // io.l0
    public void clearOutputSurfaceInfo() {
        this.f62200g.clearOutputSurfaceInfo();
    }

    @Override // io.l0
    public void enableMayRenderStartOfStream() {
        this.f62200g.f68194g.enableMayRenderStartOfStream();
    }

    @Override // io.l0
    public void flush(boolean z10) {
        if (isInitialized()) {
            throw null;
        }
        this.f62197d = C.TIME_UNSET;
        s sVar = this.f62200g;
        e eVar = sVar.f68194g;
        t0 t0Var = sVar.f68189b;
        if (sVar.f68204q == 1) {
            sVar.f68203p++;
            eVar.flush(z10);
            while (t0Var.size() > 1) {
                t0Var.pollFirst();
            }
            if (t0Var.size() == 1) {
                eVar.setStreamTimestampInfo(((Long) io.bidmachine.media3.common.util.a.checkNotNull((Long) t0Var.pollFirst())).longValue(), sVar.f68209v);
            }
            sVar.f68206s = C.TIME_UNSET;
            sVar.f68207t = C.TIME_UNSET;
            sVar.f68208u = false;
            ((io.bidmachine.media3.common.util.v) io.bidmachine.media3.common.util.a.checkStateNotNull(sVar.f68200m)).post(new com.unity3d.services.banners.view.a(sVar, 22));
        }
    }

    @Override // io.l0
    public Surface getInputSurface() {
        io.bidmachine.media3.common.util.a.checkState(isInitialized());
        io.bidmachine.media3.common.util.a.checkStateNotNull(null).getClass();
        throw new ClassCastException();
    }

    @Override // io.l0
    public boolean handleInputBitmap(Bitmap bitmap, v0 v0Var) {
        io.bidmachine.media3.common.util.a.checkState(isInitialized());
        int i10 = this.f62200g.f68210w;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        io.bidmachine.media3.common.util.a.checkNotNull(null).getClass();
        throw new ClassCastException();
    }

    @Override // io.l0
    public boolean handleInputFrame(long j10, boolean z10, j0 j0Var) {
        io.bidmachine.media3.common.util.a.checkState(isInitialized());
        int i10 = this.f62200g.f68210w;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        io.bidmachine.media3.common.util.a.checkStateNotNull(null).getClass();
        throw new ClassCastException();
    }

    @Override // io.l0
    public boolean initialize(io.bidmachine.media3.common.b bVar) throws k0 {
        io.bidmachine.media3.common.util.a.checkState(!isInitialized());
        s sVar = this.f62200g;
        if (this.f62194a != 0) {
            if (sVar.f68204q != 1) {
                return false;
            }
            try {
                if (io.bidmachine.media3.common.util.a.checkNotNull(null) == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (f2 e10) {
                throw new k0(e10, bVar);
            }
        }
        io.bidmachine.media3.common.util.a.checkState(sVar.f68204q == 0);
        gn.n nVarBuild = bVar.C;
        if (nVarBuild == null || !nVarBuild.isDataSpaceValid()) {
            nVarBuild = gn.n.f58006h;
        }
        if (sVar.f68198k) {
            nVarBuild = gn.n.f58006h;
        } else if (nVarBuild.f58015c == 7 && a1.f60679a < 34) {
            nVarBuild = nVarBuild.buildUpon().setColorTransfer(6).build();
        }
        gn.n nVar = nVarBuild;
        io.bidmachine.media3.common.util.v vVarCreateHandler = ((q0) sVar.f68196i).createHandler((Looper) io.bidmachine.media3.common.util.a.checkStateNotNull(Looper.myLooper()), null);
        sVar.f68200m = vVarCreateHandler;
        try {
            j1 j1Var = sVar.f68190c;
            Context context = sVar.f68188a;
            e6.h0 h0Var = gn.p.L8;
            Objects.requireNonNull(vVarCreateHandler);
            j1Var.create(context, nVar, h0Var, sVar, new androidx.browser.customtabs.i(vVarCreateHandler, 1), sVar.f68193f, sVar.f68192e, 0L);
            throw null;
        } catch (f2 e11) {
            throw new k0(e11, bVar);
        }
    }

    @Override // io.l0
    public boolean isEnded() {
        if (!isInitialized()) {
            return false;
        }
        s sVar = this.f62200g;
        return sVar.f68203p == 0 && sVar.f68208u && sVar.f68194g.isEnded();
    }

    @Override // io.l0
    @EnsuresNonNullIf(expression = {"videoFrameProcessor"}, result = true)
    public boolean isInitialized() {
        return false;
    }

    @Override // io.l0
    public boolean isReady(boolean z10) {
        boolean z11 = false;
        boolean z12 = z10 && isInitialized();
        s sVar = this.f62200g;
        e eVar = sVar.f68194g;
        if (z12 && sVar.f68203p == 0) {
            z11 = true;
        }
        return eVar.isReady(z11);
    }

    @Override // io.l0
    public void join(boolean z10) {
        this.f62200g.f68194g.join(z10);
    }

    @Override // io.p
    public void onError(s sVar, f2 f2Var) {
        this.f62199f.execute(new lh(this, 27, this.f62198e, f2Var));
    }

    @Override // io.p
    public void onFirstFrameRendered(s sVar) {
        this.f62199f.execute(new n(this, this.f62198e, 0));
    }

    @Override // io.p
    public void onFrameDropped(s sVar) {
        this.f62199f.execute(new n(this, this.f62198e, 1));
    }

    @Override // io.l0
    public void onInputStreamChanged(int i10, io.bidmachine.media3.common.b bVar, List<Object> list) {
        io.bidmachine.media3.common.util.a.checkState(isInitialized());
        if (i10 != 1 && i10 != 2) {
            throw new UnsupportedOperationException(a.b.e(i10, "Unsupported input type "));
        }
        a(list);
        this.f62196c = bVar;
        s sVar = this.f62200g;
        sVar.f68207t = C.TIME_UNSET;
        sVar.f68208u = false;
        gn.w wVarBuildUpon = bVar.buildUpon();
        gn.n nVar = bVar.C;
        if (nVar == null || !nVar.isDataSpaceValid()) {
            nVar = gn.n.f58006h;
        }
        wVarBuildUpon.setColorInfo(nVar).build();
        io.bidmachine.media3.common.util.a.checkStateNotNull(null).getClass();
        throw new ClassCastException();
    }

    @Override // io.l0
    public void onRendererDisabled() {
        this.f62200g.f68194g.onRendererDisabled();
    }

    @Override // io.l0
    public void onRendererEnabled(boolean z10) {
        this.f62200g.f68194g.onRendererEnabled(z10);
    }

    @Override // io.l0
    public void onRendererStarted() {
        this.f62200g.f68194g.onRendererStarted();
    }

    @Override // io.l0
    public void onRendererStopped() {
        this.f62200g.f68194g.onRendererStopped();
    }

    @Override // io.p
    public void onVideoSizeChanged(s sVar, k2 k2Var) {
        this.f62199f.execute(new lh(this, 26, this.f62198e, k2Var));
    }

    @Override // io.l0
    public void release() {
        this.f62200g.release();
    }

    @Override // io.l0
    public void render(long j10, long j11) throws k0 {
        this.f62200g.f68194g.render(j10, j11);
    }

    @Override // io.l0
    public void setChangeFrameRateStrategy(int i10) {
        this.f62200g.f68194g.setChangeFrameRateStrategy(i10);
    }

    @Override // io.l0
    public void setListener(i0 i0Var, Executor executor) {
        this.f62198e = i0Var;
        this.f62199f = executor;
    }

    @Override // io.l0
    public void setOutputSurfaceInfo(Surface surface, p0 p0Var) {
        this.f62200g.setOutputSurfaceInfo(surface, p0Var);
    }

    @Override // io.l0
    public void setPlaybackSpeed(float f10) {
        this.f62200g.f68194g.setPlaybackSpeed(f10);
    }

    @Override // io.l0
    public void setStreamTimestampInfo(long j10, long j11) {
        s sVar = this.f62200g;
        t0 t0Var = sVar.f68189b;
        long j12 = this.f62197d;
        t0Var.add(j12 == C.TIME_UNSET ? 0L : j12 + 1, Long.valueOf(j10));
        sVar.f68209v = j11;
        sVar.f68194g.setStreamTimestampInfo(sVar.f68201n, j11);
    }

    @Override // io.l0
    public void setVideoEffects(List<Object> list) {
        if (this.f62195b.equals(list)) {
            return;
        }
        a(list);
        io.bidmachine.media3.common.b bVar = this.f62196c;
        if (bVar == null) {
            return;
        }
        gn.w wVarBuildUpon = bVar.buildUpon();
        gn.n nVar = bVar.C;
        if (nVar == null || !nVar.isDataSpaceValid()) {
            nVar = gn.n.f58006h;
        }
        wVarBuildUpon.setColorInfo(nVar).build();
        io.bidmachine.media3.common.util.a.checkStateNotNull(null).getClass();
        throw new ClassCastException();
    }

    @Override // io.l0
    public void setVideoFrameMetadataListener(v vVar) {
        this.f62200g.f68194g.setVideoFrameMetadataListener(vVar);
    }

    @Override // io.l0
    public void setWakeupListener(r1 r1Var) {
        this.f62200g.f68205r = r1Var;
    }

    @Override // io.l0
    public void signalEndOfCurrentInputStream() {
        long j10 = this.f62197d;
        s sVar = this.f62200g;
        sVar.f68207t = j10;
        if (sVar.f68206s >= j10) {
            sVar.f68194g.signalEndOfCurrentInputStream();
            sVar.f68208u = true;
        }
    }

    @Override // io.l0
    public void signalEndOfInput() {
        if (isInitialized()) {
            throw null;
        }
    }
}
