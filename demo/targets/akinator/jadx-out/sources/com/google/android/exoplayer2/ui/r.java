package com.google.android.exoplayer2.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.exoplayer2.j2;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o2;
import com.google.android.exoplayer2.p2;
import com.google.android.exoplayer2.q2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.ui.u;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.w1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements p2, s0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f28325b;

    public r(u uVar) {
        this.f28325b = uVar;
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.k kVar) {
        super.onAudioAttributesChanged(kVar);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(n2 n2Var) {
        super.onAvailableCommandsChanged(n2Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        u uVar = this.f28325b;
        ImageView imageView = uVar.f28376y;
        View view2 = uVar.D;
        View view3 = uVar.C;
        View view4 = uVar.B;
        l0 l0Var = uVar.f28331b;
        r2 r2Var = uVar.f28347j0;
        if (r2Var == null) {
            return;
        }
        l0Var.resetHideCallbacks();
        if (uVar.f28358p == view) {
            r2Var.seekToNext();
            return;
        }
        if (uVar.f28356o == view) {
            r2Var.seekToPrevious();
            return;
        }
        if (uVar.f28362r == view) {
            if (r2Var.getPlaybackState() != 4) {
                r2Var.seekForward();
                return;
            }
            return;
        }
        if (uVar.f28364s == view) {
            r2Var.seekBack();
            return;
        }
        if (uVar.f28360q == view) {
            int playbackState = r2Var.getPlaybackState();
            if (playbackState != 1 && playbackState != 4 && r2Var.getPlayWhenReady()) {
                r2Var.pause();
                return;
            }
            int playbackState2 = r2Var.getPlaybackState();
            if (playbackState2 == 1) {
                r2Var.prepare();
            } else if (playbackState2 == 4) {
                r2Var.seekTo(r2Var.getCurrentMediaItemIndex(), C.TIME_UNSET);
            }
            r2Var.play();
            return;
        }
        if (uVar.f28370v == view) {
            r2Var.setRepeatMode(com.google.android.exoplayer2.util.y0.getNextRepeatMode(r2Var.getRepeatMode(), uVar.f28365s0));
            return;
        }
        if (uVar.f28372w == view) {
            r2Var.setShuffleModeEnabled(!r2Var.getShuffleModeEnabled());
            return;
        }
        if (view4 == view) {
            l0Var.removeHideCallbacks();
            uVar.c(uVar.f28342h, view4);
            return;
        }
        if (view3 == view) {
            l0Var.removeHideCallbacks();
            uVar.c(uVar.f28344i, view3);
        } else if (view2 == view) {
            l0Var.removeHideCallbacks();
            uVar.c(uVar.f28348k, view2);
        } else if (imageView == view) {
            l0Var.removeHideCallbacks();
            uVar.c(uVar.f28346j, imageView);
        }
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onCues(ef.e eVar) {
        super.onCues(eVar);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.q qVar) {
        super.onDeviceInfoChanged(qVar);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        u uVar = this.f28325b;
        if (uVar.f28377y0) {
            uVar.f28331b.resetHideCallbacks();
        }
    }

    @Override // com.google.android.exoplayer2.p2
    public void onEvents(r2 r2Var, o2 o2Var) {
        boolean zContainsAny = o2Var.containsAny(4, 5);
        u uVar = this.f28325b;
        if (zContainsAny) {
            float[] fArr = u.f28329z0;
            uVar.h();
        }
        if (o2Var.containsAny(4, 5, 7)) {
            float[] fArr2 = u.f28329z0;
            uVar.i();
        }
        if (o2Var.contains(8)) {
            float[] fArr3 = u.f28329z0;
            uVar.j();
        }
        if (o2Var.contains(9)) {
            float[] fArr4 = u.f28329z0;
            uVar.l();
        }
        if (o2Var.containsAny(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = u.f28329z0;
            uVar.g();
        }
        if (o2Var.containsAny(11, 0)) {
            float[] fArr6 = u.f28329z0;
            uVar.m();
        }
        if (o2Var.contains(12)) {
            float[] fArr7 = u.f28329z0;
            u.a aVar = uVar.f28344i;
            r2 r2Var2 = uVar.f28347j0;
            if (r2Var2 != null) {
                aVar.updateSelectedIndex(r2Var2.getPlaybackParameters().f27637b);
                uVar.f28342h.setSubTextAtPosition(0, aVar.getSelectedText());
            }
        }
        if (o2Var.contains(2)) {
            float[] fArr8 = u.f28329z0;
            uVar.n();
        }
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
        super.onIsPlayingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onMediaItemTransition(u1 u1Var, int i10) {
        super.onMediaItemTransition(u1Var, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(w1 w1Var) {
        super.onMediaMetadataChanged(w1Var);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
        super.onMetadata(metadata);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(l2 l2Var) {
        super.onPlaybackParametersChanged(l2Var);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPlayerError(j2 j2Var) {
        super.onPlayerError(j2Var);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(j2 j2Var) {
        super.onPlayerErrorChanged(j2Var);
    }

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(w1 w1Var) {
        super.onPlaylistMetadataChanged(w1Var);
    }

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // com.google.android.exoplayer2.ui.s0
    public void onScrubMove(t0 t0Var, long j10) {
        u uVar = this.f28325b;
        TextView textView = uVar.F;
        if (textView != null) {
            textView.setText(n1.getStringForTime(uVar.H, uVar.I, j10));
        }
    }

    @Override // com.google.android.exoplayer2.ui.s0
    public void onScrubStart(t0 t0Var, long j10) {
        u uVar = this.f28325b;
        uVar.f28359p0 = true;
        TextView textView = uVar.F;
        if (textView != null) {
            textView.setText(n1.getStringForTime(uVar.H, uVar.I, j10));
        }
        uVar.f28331b.removeHideCallbacks();
    }

    @Override // com.google.android.exoplayer2.ui.s0
    public void onScrubStop(t0 t0Var, long j10, boolean z10) {
        r2 r2Var;
        u uVar = this.f28325b;
        int currentMediaItemIndex = 0;
        uVar.f28359p0 = false;
        if (!z10 && (r2Var = uVar.f28347j0) != null) {
            uVar.getClass();
            m3 currentTimeline = r2Var.getCurrentTimeline();
            if (uVar.f28357o0 && !currentTimeline.isEmpty()) {
                int windowCount = currentTimeline.getWindowCount();
                while (true) {
                    long durationMs = currentTimeline.getWindow(currentMediaItemIndex, uVar.K).getDurationMs();
                    if (j10 < durationMs) {
                        break;
                    }
                    if (currentMediaItemIndex == windowCount - 1) {
                        j10 = durationMs;
                        break;
                    } else {
                        j10 -= durationMs;
                        currentMediaItemIndex++;
                    }
                }
            } else {
                currentMediaItemIndex = r2Var.getCurrentMediaItemIndex();
            }
            r2Var.seekTo(currentMediaItemIndex, j10);
            uVar.i();
        }
        uVar.f28331b.resetHideCallbacks();
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onTimelineChanged(m3 m3Var, int i10) {
        super.onTimelineChanged(m3Var, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(pf.s sVar) {
        super.onTrackSelectionParametersChanged(sVar);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onTracksChanged(n3 n3Var) {
        super.onTracksChanged(n3Var);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(sf.x xVar) {
        super.onVideoSizeChanged(xVar);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues((List<ef.b>) list);
    }

    @Override // com.google.android.exoplayer2.p2
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(q2 q2Var, q2 q2Var2, int i10) {
        super.onPositionDiscontinuity(q2Var, q2Var2, i10);
    }
}
