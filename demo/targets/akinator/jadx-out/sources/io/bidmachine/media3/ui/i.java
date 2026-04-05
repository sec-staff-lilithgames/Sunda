package io.bidmachine.media3.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import gn.a2;
import gn.b1;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.f1;
import gn.g1;
import gn.h1;
import gn.i1;
import gn.k2;
import gn.u1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.ui.k;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements g1, o0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f61761b;

    public i(k kVar) {
        this.f61761b = kVar;
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(gn.h hVar) {
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k kVar = this.f61761b;
        i1 i1Var = kVar.f61791l0;
        if (i1Var == null) {
            return;
        }
        kVar.f61771b.resetHideCallbacks();
        if (kVar.f61798p == view) {
            if (i1Var.isCommandAvailable(9)) {
                i1Var.seekToNext();
                return;
            }
            return;
        }
        if (kVar.f61796o == view) {
            if (i1Var.isCommandAvailable(7)) {
                i1Var.seekToPrevious();
                return;
            }
            return;
        }
        if (kVar.f61802r == view) {
            if (i1Var.getPlaybackState() == 4 || !i1Var.isCommandAvailable(12)) {
                return;
            }
            i1Var.seekForward();
            return;
        }
        if (kVar.f61804s == view) {
            if (i1Var.isCommandAvailable(11)) {
                i1Var.seekBack();
                return;
            }
            return;
        }
        if (kVar.f61800q == view) {
            a1.handlePlayPauseButtonAction(i1Var, kVar.f61801q0);
            return;
        }
        if (kVar.f61810v == view) {
            if (i1Var.isCommandAvailable(15)) {
                i1Var.setRepeatMode(io.bidmachine.media3.common.util.n0.getNextRepeatMode(i1Var.getRepeatMode(), kVar.f61811v0));
                return;
            }
            return;
        }
        if (kVar.f61812w == view) {
            if (i1Var.isCommandAvailable(14)) {
                i1Var.setShuffleModeEnabled(!i1Var.getShuffleModeEnabled());
                return;
            }
            return;
        }
        if (kVar.B == view) {
            kVar.f61771b.removeHideCallbacks();
            kVar.c(kVar.f61782h, kVar.B);
            return;
        }
        if (kVar.C == view) {
            kVar.f61771b.removeHideCallbacks();
            kVar.c(kVar.f61784i, kVar.C);
        } else if (kVar.D == view) {
            kVar.f61771b.removeHideCallbacks();
            kVar.c(kVar.f61788k, kVar.D);
        } else if (kVar.f61816y == view) {
            kVar.f61771b.removeHideCallbacks();
            kVar.c(kVar.f61786j, kVar.f61816y);
        }
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onCues(in.d dVar) {
        super.onCues(dVar);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(gn.q qVar) {
        super.onDeviceInfoChanged(qVar);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        k kVar = this.f61761b;
        if (kVar.B0) {
            kVar.f61771b.resetHideCallbacks();
        }
    }

    @Override // gn.g1
    public void onEvents(i1 i1Var, f1 f1Var) throws Resources.NotFoundException {
        boolean zContainsAny = f1Var.containsAny(4, 5, 13);
        k kVar = this.f61761b;
        if (zContainsAny) {
            float[] fArr = k.C0;
            kVar.h();
        }
        if (f1Var.containsAny(4, 5, 7, 13)) {
            float[] fArr2 = k.C0;
            kVar.i();
        }
        if (f1Var.containsAny(8, 13)) {
            float[] fArr3 = k.C0;
            kVar.j();
        }
        if (f1Var.containsAny(9, 13)) {
            float[] fArr4 = k.C0;
            kVar.l();
        }
        if (f1Var.containsAny(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = k.C0;
            kVar.g();
        }
        if (f1Var.containsAny(11, 0, 13)) {
            float[] fArr6 = k.C0;
            kVar.m();
        }
        if (f1Var.containsAny(12, 13)) {
            float[] fArr7 = k.C0;
            k.c cVar = kVar.f61782h;
            k.a aVar = kVar.f61784i;
            i1 i1Var2 = kVar.f61791l0;
            if (i1Var2 != null) {
                aVar.updateSelectedIndex(i1Var2.getPlaybackParameters().f57847a);
                cVar.setSubTextAtPosition(0, aVar.getSelectedText());
                kVar.f(kVar.B, cVar.hasSettingsToShow());
            }
        }
        if (f1Var.containsAny(2, 13)) {
            float[] fArr8 = k.C0;
            kVar.n();
        }
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
        super.onIsPlayingChanged(z10);
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
    public /* bridge */ /* synthetic */ void onMediaItemTransition(gn.p0 p0Var, int i10) {
        super.onMediaItemTransition(p0Var, i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(gn.s0 s0Var) {
        super.onMediaMetadataChanged(s0Var);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onMetadata(gn.u0 u0Var) {
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
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPlayerError(b1 b1Var) {
        super.onPlayerError(b1Var);
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
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(gn.s0 s0Var) {
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

    @Override // io.bidmachine.media3.ui.o0
    public void onScrubMove(p0 p0Var, long j10) {
        k kVar = this.f61761b;
        TextView textView = kVar.F;
        if (textView != null) {
            textView.setText(a1.getStringForTime(kVar.H, kVar.I, j10));
        }
    }

    @Override // io.bidmachine.media3.ui.o0
    public void onScrubStart(p0 p0Var, long j10) {
        k kVar = this.f61761b;
        kVar.f61805s0 = true;
        TextView textView = kVar.F;
        if (textView != null) {
            textView.setText(a1.getStringForTime(kVar.H, kVar.I, j10));
        }
        kVar.f61771b.removeHideCallbacks();
    }

    @Override // io.bidmachine.media3.ui.o0
    public void onScrubStop(p0 p0Var, long j10, boolean z10) {
        i1 i1Var;
        k kVar = this.f61761b;
        int i10 = 0;
        kVar.f61805s0 = false;
        if (!z10 && (i1Var = kVar.f61791l0) != null) {
            if (kVar.f61803r0) {
                if (i1Var.isCommandAvailable(17) && i1Var.isCommandAvailable(10)) {
                    u1 currentTimeline = i1Var.getCurrentTimeline();
                    int windowCount = currentTimeline.getWindowCount();
                    while (true) {
                        long durationMs = currentTimeline.getWindow(i10, kVar.K).getDurationMs();
                        if (j10 < durationMs) {
                            break;
                        }
                        if (i10 == windowCount - 1) {
                            j10 = durationMs;
                            break;
                        } else {
                            j10 -= durationMs;
                            i10++;
                        }
                    }
                    i1Var.seekTo(i10, j10);
                }
            } else if (i1Var.isCommandAvailable(5)) {
                i1Var.seekTo(j10);
            }
            kVar.i();
        }
        kVar.f61771b.resetHideCallbacks();
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
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    @Override // gn.g1
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues((List<in.b>) list);
    }

    @Override // gn.g1
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h1 h1Var, h1 h1Var2, int i10) {
        super.onPositionDiscontinuity(h1Var, h1Var2, i10);
    }
}
