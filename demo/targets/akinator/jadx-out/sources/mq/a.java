package mq;

import br.h0;
import gn.a2;
import gn.b1;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.f1;
import gn.g1;
import gn.h;
import gn.h1;
import gn.i1;
import gn.k2;
import gn.p0;
import gn.q;
import gn.s0;
import gn.u0;
import gn.u1;
import in.d;
import java.util.List;
import lq.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements g1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f74904b;

    public a(b bVar) {
        this.f74904b = bVar;
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(h hVar) {
        super.onAudioAttributesChanged(hVar);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(e1 e1Var) {
        super.onAvailableCommandsChanged(e1Var);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onCues(d dVar) {
        super.onCues(dVar);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(q qVar) {
        super.onDeviceInfoChanged(qVar);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onEvents(i1 i1Var, f1 f1Var) {
        super.onEvents(i1Var, f1Var);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // gn.g1
    public void onIsPlayingChanged(boolean z10) {
        lq.d dVar;
        b bVar = this.f74904b;
        if (z10) {
            bVar.u();
            return;
        }
        if (!bVar.f73602f.get() && (dVar = bVar.f73604h) != null) {
            dVar.c(bVar);
        }
        a.C0745a c0745a = bVar.f73599b;
        c0745a.f73610b.set(false);
        cr.q.cancelOnUiThread(c0745a);
    }

    @Override // gn.g1
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onMediaItemTransition(p0 p0Var, int i10) {
        super.onMediaItemTransition(p0Var, i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(s0 s0Var) {
        super.onMediaMetadataChanged(s0Var);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onMetadata(u0 u0Var) {
        super.onMetadata(u0Var);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(c1 c1Var) {
        super.onPlaybackParametersChanged(c1Var);
    }

    @Override // gn.g1
    public void onPlaybackStateChanged(int i10) {
        b bVar = this.f74904b;
        if (i10 == 3) {
            bVar.v();
        } else if (i10 == 4) {
            bVar.c();
        }
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // gn.g1
    public void onPlayerError(b1 b1Var) {
        lq.d dVar;
        b bVar = this.f74904b;
        h0 h0VarCreate = h0.create(b1Var);
        if (bVar.f73606j) {
            bVar.k(h0VarCreate);
        } else {
            if (bVar.f73602f.get() || (dVar = bVar.f73604h) == null) {
                return;
            }
            dVar.b(bVar, h0VarCreate);
        }
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(b1 b1Var) {
        super.onPlayerErrorChanged(b1Var);
    }

    @Override // gn.g1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(s0 s0Var) {
        super.onPlaylistMetadataChanged(s0Var);
    }

    @Override // gn.g1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onTimelineChanged(u1 u1Var, int i10) {
        super.onTimelineChanged(u1Var, i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(a2 a2Var) {
        super.onTrackSelectionParametersChanged(a2Var);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onTracksChanged(b2 b2Var) {
        super.onTracksChanged(b2Var);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(k2 k2Var) {
        super.onVideoSizeChanged(k2Var);
    }

    @Override // gn.g1
    public void onVolumeChanged(float f10) {
        this.f74904b.i(f10);
    }

    @Override // gn.g1
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues((List<in.b>) list);
    }

    @Override // gn.g1
    public void onPositionDiscontinuity(h1 h1Var, h1 h1Var2, int i10) {
        this.f74904b.l(Long.valueOf(h1Var2.f57932f));
    }
}
