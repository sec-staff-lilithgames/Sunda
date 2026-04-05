package com.google.android.exoplayer2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p0 implements sf.w, com.google.android.exoplayer2.audio.b0, ef.r, re.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, tf.l, d, b, g3, t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f27900b;

    public p0(r0 r0Var) {
        this.f27900b = r0Var;
    }

    @Override // com.google.android.exoplayer2.d
    public void executePlayerCommand(int i10) {
        r0 r0Var = this.f27900b;
        boolean playWhenReady = r0Var.getPlayWhenReady();
        int i11 = 1;
        if (playWhenReady && i10 != 1) {
            i11 = 2;
        }
        r0Var.x(i10, i11, playWhenReady);
    }

    @Override // com.google.android.exoplayer2.b
    public void onAudioBecomingNoisy() {
        int i10 = r0.f27961y0;
        this.f27900b.x(-1, 3, false);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioCodecError(Exception exc) {
        this.f27900b.f27995r.onAudioCodecError(exc);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioDecoderInitialized(String str, long j10, long j11) {
        this.f27900b.f27995r.onAudioDecoderInitialized(str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioDecoderReleased(String str) {
        this.f27900b.f27995r.onAudioDecoderReleased(str);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioDisabled(ce.f fVar) {
        r0 r0Var = this.f27900b;
        r0Var.f27995r.onAudioDisabled(fVar);
        r0Var.T = null;
        r0Var.f27972f0 = null;
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioEnabled(ce.f fVar) {
        r0 r0Var = this.f27900b;
        r0Var.f27972f0 = fVar;
        r0Var.f27995r.onAudioEnabled(fVar);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(z0 z0Var) {
        super.onAudioInputFormatChanged(z0Var);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioPositionAdvancing(long j10) {
        this.f27900b.f27995r.onAudioPositionAdvancing(j10);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioSinkError(Exception exc) {
        this.f27900b.f27995r.onAudioSinkError(exc);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioUnderrun(int i10, long j10, long j11) {
        this.f27900b.f27995r.onAudioUnderrun(i10, j10, j11);
    }

    @Override // ef.r
    public void onCues(ef.e eVar) {
        r0 r0Var = this.f27900b;
        r0Var.f27982k0 = eVar;
        r0Var.f27983l.sendEvent(27, new e0(eVar, 4));
    }

    @Override // sf.w
    public void onDroppedFrames(int i10, long j10) {
        this.f27900b.f27995r.onDroppedFrames(i10, j10);
    }

    @Override // com.google.android.exoplayer2.t
    public /* bridge */ /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
        super.onExperimentalOffloadSchedulingEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.t
    public /* bridge */ /* synthetic */ void onExperimentalOffloadedPlayback(boolean z10) {
        super.onExperimentalOffloadedPlayback(z10);
    }

    @Override // com.google.android.exoplayer2.t
    public void onExperimentalSleepingForOffloadChanged(boolean z10) {
        int i10 = r0.f27961y0;
        this.f27900b.z();
    }

    @Override // re.f
    public void onMetadata(Metadata metadata) {
        r0 r0Var = this.f27900b;
        com.google.android.exoplayer2.util.c0 c0Var = r0Var.f27983l;
        r0Var.f28002u0 = r0Var.f28002u0.buildUpon().populateFromMetadata(metadata).build();
        w1 w1VarD = r0Var.d();
        if (!w1VarD.equals(r0Var.Q)) {
            r0Var.Q = w1VarD;
            c0Var.queueEvent(14, new e0(this, 5));
        }
        c0Var.queueEvent(28, new e0(metadata, 6));
        c0Var.flushEvents();
    }

    @Override // sf.w
    public void onRenderedFirstFrame(Object obj, long j10) {
        r0 r0Var = this.f27900b;
        r0Var.f27995r.onRenderedFirstFrame(obj, j10);
        if (r0Var.V == obj) {
            r0Var.f27983l.sendEvent(26, new com.bytedance.adsdk.ugeno.zz.cm.a(6));
        }
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onSkipSilenceEnabledChanged(boolean z10) {
        r0 r0Var = this.f27900b;
        if (r0Var.f27980j0 == z10) {
            return;
        }
        r0Var.f27980j0 = z10;
        r0Var.f27983l.sendEvent(23, new g0(z10, 2));
    }

    @Override // com.google.android.exoplayer2.g3
    public void onStreamTypeChanged(int i10) {
        r0 r0Var = this.f27900b;
        StreamVolumeManager streamVolumeManager = r0Var.B;
        q qVarBuild = new q.a(0).setMinVolume(streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0).setMaxVolume(streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0).build();
        if (qVarBuild.equals(r0Var.f27998s0)) {
            return;
        }
        r0Var.f27998s0 = qVarBuild;
        r0Var.f27983l.sendEvent(29, new e0(qVarBuild, 7));
    }

    @Override // com.google.android.exoplayer2.g3
    public void onStreamVolumeChanged(int i10, boolean z10) {
        this.f27900b.f27983l.sendEvent(30, new o0(i10, z10, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = r0.f27961y0;
        Surface surface = new Surface(surfaceTexture);
        r0 r0Var = this.f27900b;
        r0Var.u(surface);
        r0Var.W = surface;
        r0Var.o(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i10 = r0.f27961y0;
        r0 r0Var = this.f27900b;
        r0Var.u(null);
        r0Var.o(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = r0.f27961y0;
        this.f27900b.o(i10, i11);
    }

    @Override // sf.w
    public void onVideoCodecError(Exception exc) {
        this.f27900b.f27995r.onVideoCodecError(exc);
    }

    @Override // sf.w
    public void onVideoDecoderInitialized(String str, long j10, long j11) {
        this.f27900b.f27995r.onVideoDecoderInitialized(str, j10, j11);
    }

    @Override // sf.w
    public void onVideoDecoderReleased(String str) {
        this.f27900b.f27995r.onVideoDecoderReleased(str);
    }

    @Override // sf.w
    public void onVideoDisabled(ce.f fVar) {
        r0 r0Var = this.f27900b;
        r0Var.f27995r.onVideoDisabled(fVar);
        r0Var.S = null;
        r0Var.f27970e0 = null;
    }

    @Override // sf.w
    public void onVideoEnabled(ce.f fVar) {
        r0 r0Var = this.f27900b;
        r0Var.f27970e0 = fVar;
        r0Var.f27995r.onVideoEnabled(fVar);
    }

    @Override // sf.w
    public void onVideoFrameProcessingOffset(long j10, int i10) {
        this.f27900b.f27995r.onVideoFrameProcessingOffset(j10, i10);
    }

    @Override // sf.w
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(z0 z0Var) {
        super.onVideoInputFormatChanged(z0Var);
    }

    @Override // sf.w
    public void onVideoSizeChanged(sf.x xVar) {
        r0 r0Var = this.f27900b;
        r0Var.f28000t0 = xVar;
        r0Var.f27983l.sendEvent(25, new e0(xVar, 8));
    }

    @Override // tf.l
    public void onVideoSurfaceCreated(Surface surface) {
        int i10 = r0.f27961y0;
        this.f27900b.u(surface);
    }

    @Override // tf.l
    public void onVideoSurfaceDestroyed(Surface surface) {
        int i10 = r0.f27961y0;
        this.f27900b.u(null);
    }

    @Override // com.google.android.exoplayer2.d
    public void setVolumeMultiplier(float f10) {
        int i10 = r0.f27961y0;
        r0 r0Var = this.f27900b;
        r0Var.r(1, 2, Float.valueOf(r0Var.A.getVolumeMultiplier() * r0Var.f27978i0));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        int i13 = r0.f27961y0;
        this.f27900b.o(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        r0 r0Var = this.f27900b;
        if (r0Var.Z) {
            r0Var.u(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        r0 r0Var = this.f27900b;
        if (r0Var.Z) {
            r0Var.u(null);
        }
        r0Var.o(0, 0);
    }

    @Override // com.google.android.exoplayer2.audio.b0
    public void onAudioInputFormatChanged(z0 z0Var, ce.k kVar) {
        r0 r0Var = this.f27900b;
        r0Var.T = z0Var;
        r0Var.f27995r.onAudioInputFormatChanged(z0Var, kVar);
    }

    @Override // sf.w
    public void onVideoInputFormatChanged(z0 z0Var, ce.k kVar) {
        r0 r0Var = this.f27900b;
        r0Var.S = z0Var;
        r0Var.f27995r.onVideoInputFormatChanged(z0Var, kVar);
    }

    @Override // ef.r
    public void onCues(List<ef.b> list) {
        this.f27900b.f27983l.sendEvent(27, new e0(list, 3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
