package io.bidmachine.media3.exoplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import gn.q;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 implements io.g0, io.bidmachine.media3.exoplayer.audio.o, eo.g, yn.c, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, jo.l, d, g2, b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f61288b;

    public j0(l0 l0Var) {
        this.f61288b = l0Var;
    }

    @Override // io.bidmachine.media3.exoplayer.d
    public void onAudioBecomingNoisy() {
        int i10 = l0.A0;
        this.f61288b.A(3, false);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioCodecError(Exception exc) {
        this.f61288b.f61371s.onAudioCodecError(exc);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioDecoderInitialized(String str, long j10, long j11) {
        this.f61288b.f61371s.onAudioDecoderInitialized(str, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioDecoderReleased(String str) {
        this.f61288b.f61371s.onAudioDecoderReleased(str);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioDisabled(j jVar) {
        l0 l0Var = this.f61288b;
        l0Var.f61371s.onAudioDisabled(jVar);
        l0Var.W = null;
        l0Var.f61350h0 = null;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioEnabled(j jVar) {
        l0 l0Var = this.f61288b;
        l0Var.f61350h0 = jVar;
        l0Var.f61371s.onAudioEnabled(jVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioInputFormatChanged(io.bidmachine.media3.common.b bVar, k kVar) {
        l0 l0Var = this.f61288b;
        l0Var.W = bVar;
        l0Var.f61371s.onAudioInputFormatChanged(bVar, kVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioPositionAdvancing(long j10) {
        this.f61288b.f61371s.onAudioPositionAdvancing(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioSinkError(Exception exc) {
        this.f61288b.f61371s.onAudioSinkError(exc);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioTrackInitialized(io.bidmachine.media3.exoplayer.audio.p pVar) {
        this.f61288b.f61371s.onAudioTrackInitialized(pVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioTrackReleased(io.bidmachine.media3.exoplayer.audio.p pVar) {
        this.f61288b.f61371s.onAudioTrackReleased(pVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onAudioUnderrun(int i10, long j10, long j11) {
        this.f61288b.f61371s.onAudioUnderrun(i10, j10, j11);
    }

    @Override // eo.g
    public void onCues(in.d dVar) {
        l0 l0Var = this.f61288b;
        l0Var.f61358l0 = dVar;
        l0Var.f61359m.sendEvent(27, new f0(dVar, 4));
    }

    @Override // io.g0
    public void onDroppedFrames(int i10, long j10) {
        this.f61288b.f61371s.onDroppedFrames(i10, j10);
    }

    @Override // yn.c
    public void onMetadata(gn.u0 u0Var) {
        l0 l0Var = this.f61288b;
        io.bidmachine.media3.common.util.y yVar = l0Var.f61359m;
        l0Var.f61380w0 = l0Var.f61380w0.buildUpon().populateFromMetadata(u0Var).build();
        gn.s0 s0VarF = l0Var.f();
        if (!s0VarF.equals(l0Var.T)) {
            l0Var.T = s0VarF;
            yVar.queueEvent(14, new f0(this, 5));
        }
        yVar.queueEvent(28, new f0(u0Var, 6));
        yVar.flushEvents();
    }

    @Override // io.bidmachine.media3.exoplayer.b0
    public /* bridge */ /* synthetic */ void onOffloadedPlayback(boolean z10) {
        super.onOffloadedPlayback(z10);
    }

    @Override // io.g0
    public void onRenderedFirstFrame(Object obj, long j10) {
        l0 l0Var = this.f61288b;
        l0Var.f61371s.onRenderedFirstFrame(obj, j10);
        if (l0Var.X == obj) {
            l0Var.f61359m.sendEvent(26, new hv.t(23));
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.o
    public void onSkipSilenceEnabledChanged(boolean z10) {
        l0 l0Var = this.f61288b;
        if (l0Var.f61356k0 == z10) {
            return;
        }
        l0Var.f61356k0 = z10;
        l0Var.f61359m.sendEvent(23, new com.google.android.exoplayer2.g0(z10, 6));
    }

    @Override // io.bidmachine.media3.exoplayer.b0
    public void onSleepingForOffloadChanged(boolean z10) {
        int i10 = l0.A0;
        this.f61288b.C();
    }

    @Override // io.bidmachine.media3.exoplayer.g2
    public void onStreamTypeChanged(int i10) {
        l0 l0Var = this.f61288b;
        StreamVolumeManager streamVolumeManager = l0Var.C;
        gn.q qVarBuild = new q.a(0).setMinVolume(streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0).setMaxVolume(streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0).build();
        if (qVarBuild.equals(l0Var.f61376u0)) {
            return;
        }
        l0Var.f61376u0 = qVarBuild;
        l0Var.f61359m.sendEvent(29, new f0(qVarBuild, 3));
    }

    @Override // io.bidmachine.media3.exoplayer.g2
    public void onStreamVolumeChanged(int i10, boolean z10) {
        this.f61288b.f61359m.sendEvent(30, new com.google.android.exoplayer2.o0(i10, z10, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = l0.A0;
        Surface surface = new Surface(surfaceTexture);
        l0 l0Var = this.f61288b;
        l0Var.x(surface);
        l0Var.Y = surface;
        l0Var.r(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i10 = l0.A0;
        l0 l0Var = this.f61288b;
        l0Var.x(null);
        l0Var.r(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = l0.A0;
        this.f61288b.r(i10, i11);
    }

    @Override // io.g0
    public void onVideoCodecError(Exception exc) {
        this.f61288b.f61371s.onVideoCodecError(exc);
    }

    @Override // io.g0
    public void onVideoDecoderInitialized(String str, long j10, long j11) {
        this.f61288b.f61371s.onVideoDecoderInitialized(str, j10, j11);
    }

    @Override // io.g0
    public void onVideoDecoderReleased(String str) {
        this.f61288b.f61371s.onVideoDecoderReleased(str);
    }

    @Override // io.g0
    public void onVideoDisabled(j jVar) {
        l0 l0Var = this.f61288b;
        l0Var.f61371s.onVideoDisabled(jVar);
        l0Var.V = null;
        l0Var.f61348g0 = null;
    }

    @Override // io.g0
    public void onVideoEnabled(j jVar) {
        l0 l0Var = this.f61288b;
        l0Var.f61348g0 = jVar;
        l0Var.f61371s.onVideoEnabled(jVar);
    }

    @Override // io.g0
    public void onVideoFrameProcessingOffset(long j10, int i10) {
        this.f61288b.f61371s.onVideoFrameProcessingOffset(j10, i10);
    }

    @Override // io.g0
    public void onVideoInputFormatChanged(io.bidmachine.media3.common.b bVar, k kVar) {
        l0 l0Var = this.f61288b;
        l0Var.V = bVar;
        l0Var.f61371s.onVideoInputFormatChanged(bVar, kVar);
    }

    @Override // io.g0
    public void onVideoSizeChanged(gn.k2 k2Var) {
        l0 l0Var = this.f61288b;
        l0Var.f61378v0 = k2Var;
        l0Var.f61359m.sendEvent(25, new f0(k2Var, 7));
    }

    @Override // jo.l
    public void onVideoSurfaceCreated(Surface surface) {
        int i10 = l0.A0;
        this.f61288b.x(surface);
    }

    @Override // jo.l
    public void onVideoSurfaceDestroyed(Surface surface) {
        int i10 = l0.A0;
        this.f61288b.x(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        int i13 = l0.A0;
        this.f61288b.r(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        l0 l0Var = this.f61288b;
        if (l0Var.f61338b0) {
            l0Var.x(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l0 l0Var = this.f61288b;
        if (l0Var.f61338b0) {
            l0Var.x(null);
        }
        l0Var.r(0, 0);
    }

    @Override // eo.g
    public void onCues(List<in.b> list) {
        this.f61288b.f61359m.sendEvent(27, new f0(list, 8));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
