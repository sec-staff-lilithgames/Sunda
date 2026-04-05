package on;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import ao.g0;
import ao.k0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.a2;
import gn.b1;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.h1;
import gn.j0;
import gn.k2;
import gn.p0;
import gn.r1;
import gn.s0;
import gn.t1;
import gn.u0;
import gn.u1;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements d, d0 {
    public int A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f79591a;

    /* renamed from: c, reason: collision with root package name */
    public final y f79593c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f79594d;

    /* renamed from: j, reason: collision with root package name */
    public String f79600j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f79601k;

    /* renamed from: l, reason: collision with root package name */
    public int f79602l;

    /* renamed from: o, reason: collision with root package name */
    public b1 f79605o;

    /* renamed from: p, reason: collision with root package name */
    public b0 f79606p;

    /* renamed from: q, reason: collision with root package name */
    public b0 f79607q;

    /* renamed from: r, reason: collision with root package name */
    public b0 f79608r;

    /* renamed from: s, reason: collision with root package name */
    public io.bidmachine.media3.common.b f79609s;

    /* renamed from: t, reason: collision with root package name */
    public io.bidmachine.media3.common.b f79610t;

    /* renamed from: u, reason: collision with root package name */
    public io.bidmachine.media3.common.b f79611u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f79612v;

    /* renamed from: w, reason: collision with root package name */
    public int f79613w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f79614x;

    /* renamed from: y, reason: collision with root package name */
    public int f79615y;

    /* renamed from: z, reason: collision with root package name */
    public int f79616z;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f79592b = io.bidmachine.media3.common.util.b.get();

    /* renamed from: f, reason: collision with root package name */
    public final t1 f79596f = new t1();

    /* renamed from: g, reason: collision with root package name */
    public final r1 f79597g = new r1();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f79599i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f79598h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f79595e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f79603m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f79604n = 0;

    public c0(Context context, PlaybackSession playbackSession) {
        this.f79591a = context.getApplicationContext();
        this.f79594d = playbackSession;
        y yVar = new y();
        this.f79593c = yVar;
        yVar.setListener(this);
    }

    public static c0 create(Context context) {
        MediaMetricsManager mediaMetricsManagerB = y3.f.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new c0(context, mediaMetricsManagerB.createPlaybackSession());
    }

    public final boolean f(b0 b0Var) {
        return b0Var != null && b0Var.f79588c.equals(this.f79593c.getActiveSessionId());
    }

    public final void g() {
        PlaybackMetrics.Builder builder = this.f79601k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f79601k.setVideoFramesDropped(this.f79615y);
            this.f79601k.setVideoFramesPlayed(this.f79616z);
            Long l9 = (Long) this.f79598h.get(this.f79600j);
            this.f79601k.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f79599i.get(this.f79600j);
            this.f79601k.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f79601k.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f79592b.execute(new z(1, this, this.f79601k.build()));
        }
        this.f79601k = null;
        this.f79600j = null;
        this.A = 0;
        this.f79615y = 0;
        this.f79616z = 0;
        this.f79609s = null;
        this.f79610t = null;
        this.f79611u = null;
        this.B = false;
    }

    public LogSessionId getLogSessionId() {
        return this.f79594d.getSessionId();
    }

    public final void h(u1 u1Var, k0 k0Var) {
        int indexOfPeriod;
        int i10;
        PlaybackMetrics.Builder builder = this.f79601k;
        if (k0Var == null || (indexOfPeriod = u1Var.getIndexOfPeriod(k0Var.f7718a)) == -1) {
            return;
        }
        r1 r1Var = this.f79597g;
        u1Var.getPeriod(indexOfPeriod, r1Var);
        int i11 = r1Var.f58110c;
        t1 t1Var = this.f79596f;
        u1Var.getWindow(i11, t1Var);
        j0 j0Var = t1Var.f58177c.f58053b;
        if (j0Var == null) {
            i10 = 0;
        } else {
            int iInferContentTypeForUriAndMimeType = a1.inferContentTypeForUriAndMimeType(j0Var.f57963a, j0Var.f57964b);
            i10 = iInferContentTypeForUriAndMimeType != 0 ? iInferContentTypeForUriAndMimeType != 1 ? iInferContentTypeForUriAndMimeType != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (t1Var.f58187m != C.TIME_UNSET && !t1Var.f58185k && !t1Var.f58183i && !t1Var.isLive()) {
            builder.setMediaDurationMillis(t1Var.getDurationMs());
        }
        builder.setPlaybackType(t1Var.isLive() ? 2 : 1);
        this.B = true;
    }

    public final void i(int i10, long j10, io.bidmachine.media3.common.b bVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f79595e);
        if (bVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = bVar.f60664n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = bVar.f60665o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = bVar.f60661k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = bVar.f60660j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = bVar.f60672v;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = bVar.f60673w;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = bVar.E;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = bVar.F;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = bVar.f60654d;
            if (str4 != null) {
                String[] strArrSplit = a1.split(str4, "-");
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = bVar.f60674x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.f79592b.execute(new z(2, this, timeSinceCreatedMillis.build()));
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(b bVar, gn.h hVar) {
        super.onAudioAttributesChanged(bVar, hVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioCodecError(b bVar, Exception exc) {
        super.onAudioCodecError(bVar, exc);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(b bVar, String str, long j10) {
        super.onAudioDecoderInitialized(bVar, str, j10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(b bVar, String str) {
        super.onAudioDecoderReleased(bVar, str);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioDisabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
        super.onAudioDisabled(bVar, jVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioEnabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
        super.onAudioEnabled(bVar, jVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(b bVar, io.bidmachine.media3.common.b bVar2, io.bidmachine.media3.exoplayer.k kVar) {
        super.onAudioInputFormatChanged(bVar, bVar2, kVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(b bVar, long j10) {
        super.onAudioPositionAdvancing(bVar, j10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(b bVar, int i10) {
        super.onAudioSessionIdChanged(bVar, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioSinkError(b bVar, Exception exc) {
        super.onAudioSinkError(bVar, exc);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioTrackInitialized(b bVar, io.bidmachine.media3.exoplayer.audio.p pVar) {
        super.onAudioTrackInitialized(bVar, pVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioTrackReleased(b bVar, io.bidmachine.media3.exoplayer.audio.p pVar) {
        super.onAudioTrackReleased(bVar, pVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioUnderrun(b bVar, int i10, long j10, long j11) {
        super.onAudioUnderrun(bVar, i10, j10, j11);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(b bVar, e1 e1Var) {
        super.onAvailableCommandsChanged(bVar, e1Var);
    }

    @Override // on.d
    public void onBandwidthEstimate(b bVar, int i10, long j10, long j11) {
        k0 k0Var = bVar.f79579d;
        if (k0Var != null) {
            String sessionForMediaPeriodId = this.f79593c.getSessionForMediaPeriodId(bVar.f79577b, (k0) io.bidmachine.media3.common.util.a.checkNotNull(k0Var));
            HashMap map = this.f79599i;
            Long l9 = (Long) map.get(sessionForMediaPeriodId);
            HashMap map2 = this.f79598h;
            Long l10 = (Long) map2.get(sessionForMediaPeriodId);
            map.put(sessionForMediaPeriodId, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j10));
            map2.put(sessionForMediaPeriodId, Long.valueOf((l10 != null ? l10.longValue() : 0L) + i10));
        }
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onCues(b bVar, in.d dVar) {
        super.onCues(bVar, dVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(b bVar, gn.q qVar) {
        super.onDeviceInfoChanged(bVar, qVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(b bVar, int i10, boolean z10) {
        super.onDeviceVolumeChanged(bVar, i10, z10);
    }

    @Override // on.d
    public void onDownstreamFormatChanged(b bVar, g0 g0Var) {
        if (bVar.f79579d == null) {
            return;
        }
        b0 b0Var = new b0((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(g0Var.f7667c), g0Var.f7668d, this.f79593c.getSessionForMediaPeriodId(bVar.f79577b, (k0) io.bidmachine.media3.common.util.a.checkNotNull(bVar.f79579d)));
        int i10 = g0Var.f7666b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f79607q = b0Var;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f79608r = b0Var;
                return;
            }
        }
        this.f79606p = b0Var;
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(b bVar) {
        super.onDrmKeysLoaded(bVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(b bVar) {
        super.onDrmKeysRemoved(bVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(b bVar) {
        super.onDrmKeysRestored(bVar);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(b bVar) {
        super.onDrmSessionAcquired(bVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(b bVar, Exception exc) {
        super.onDrmSessionManagerError(bVar, exc);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(b bVar) {
        super.onDrmSessionReleased(bVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(b bVar, int i10, long j10) {
        super.onDroppedVideoFrames(bVar, i10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04fa A[PHI: r10
      0x04fa: PHI (r10v41 int) = (r10v39 int), (r10v40 int) binds: [B:303:0x04f8, B:329:0x0535] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // on.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvents(gn.i1 r28, on.c r29) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.c0.onEvents(gn.i1, on.c):void");
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(b bVar, boolean z10) {
        super.onIsLoadingChanged(bVar, z10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(b bVar, boolean z10) {
        super.onIsPlayingChanged(bVar, z10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onLoadCanceled(b bVar, ao.b0 b0Var, g0 g0Var) {
        super.onLoadCanceled(bVar, b0Var, g0Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onLoadCompleted(b bVar, ao.b0 b0Var, g0 g0Var) {
        super.onLoadCompleted(bVar, b0Var, g0Var);
    }

    @Override // on.d
    public void onLoadError(b bVar, ao.b0 b0Var, g0 g0Var, IOException iOException, boolean z10) {
        this.f79613w = g0Var.f7665a;
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadStarted(b bVar, ao.b0 b0Var, g0 g0Var) {
        super.onLoadStarted(bVar, b0Var, g0Var);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(b bVar, boolean z10) {
        super.onLoadingChanged(bVar, z10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(b bVar, long j10) {
        super.onMaxSeekToPreviousPositionChanged(bVar, j10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onMediaItemTransition(b bVar, p0 p0Var, int i10) {
        super.onMediaItemTransition(bVar, p0Var, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(b bVar, s0 s0Var) {
        super.onMediaMetadataChanged(bVar, s0Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onMetadata(b bVar, u0 u0Var) {
        super.onMetadata(bVar, u0Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(b bVar, boolean z10, int i10) {
        super.onPlayWhenReadyChanged(bVar, z10, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(b bVar, c1 c1Var) {
        super.onPlaybackParametersChanged(bVar, c1Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(b bVar, int i10) {
        super.onPlaybackStateChanged(bVar, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(b bVar, int i10) {
        super.onPlaybackSuppressionReasonChanged(bVar, i10);
    }

    @Override // on.d
    public void onPlayerError(b bVar, b1 b1Var) {
        this.f79605o = b1Var;
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(b bVar, b1 b1Var) {
        super.onPlayerErrorChanged(bVar, b1Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onPlayerReleased(b bVar) {
        super.onPlayerReleased(bVar);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(b bVar, boolean z10, int i10) {
        super.onPlayerStateChanged(bVar, z10, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(b bVar, s0 s0Var) {
        super.onPlaylistMetadataChanged(bVar, s0Var);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(b bVar, int i10) {
        super.onPositionDiscontinuity(bVar, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(b bVar, Object obj, long j10) {
        super.onRenderedFirstFrame(bVar, obj, j10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onRendererReadyChanged(b bVar, int i10, int i11, boolean z10) {
        super.onRendererReadyChanged(bVar, i10, i11, z10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(b bVar, int i10) {
        super.onRepeatModeChanged(bVar, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(b bVar, long j10) {
        super.onSeekBackIncrementChanged(bVar, j10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(b bVar, long j10) {
        super.onSeekForwardIncrementChanged(bVar, j10);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(b bVar) {
        super.onSeekStarted(bVar);
    }

    @Override // on.d0
    public void onSessionActive(b bVar, String str) {
        k0 k0Var = bVar.f79579d;
        if (k0Var == null || !k0Var.isAd()) {
            g();
            this.f79600j = str;
            this.f79601k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.7.1");
            h(bVar.f79577b, bVar.f79579d);
        }
    }

    @Override // on.d0
    public void onSessionFinished(b bVar, String str, boolean z10) {
        k0 k0Var = bVar.f79579d;
        if ((k0Var == null || !k0Var.isAd()) && str.equals(this.f79600j)) {
            g();
        }
        this.f79598h.remove(str);
        this.f79599i.remove(str);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(b bVar, boolean z10) {
        super.onShuffleModeChanged(bVar, z10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(b bVar, boolean z10) {
        super.onSkipSilenceEnabledChanged(bVar, z10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(b bVar, int i10, int i11) {
        super.onSurfaceSizeChanged(bVar, i10, i11);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onTimelineChanged(b bVar, int i10) {
        super.onTimelineChanged(bVar, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(b bVar, a2 a2Var) {
        super.onTrackSelectionParametersChanged(bVar, a2Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onTracksChanged(b bVar, b2 b2Var) {
        super.onTracksChanged(bVar, b2Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(b bVar, g0 g0Var) {
        super.onUpstreamDiscarded(bVar, g0Var);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onVideoCodecError(b bVar, Exception exc) {
        super.onVideoCodecError(bVar, exc);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(b bVar, String str, long j10) {
        super.onVideoDecoderInitialized(bVar, str, j10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(b bVar, String str) {
        super.onVideoDecoderReleased(bVar, str);
    }

    @Override // on.d
    public void onVideoDisabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
        this.f79615y += jVar.f61282g;
        this.f79616z += jVar.f61280e;
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onVideoEnabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
        super.onVideoEnabled(bVar, jVar);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(b bVar, long j10, int i10) {
        super.onVideoFrameProcessingOffset(bVar, j10, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(b bVar, io.bidmachine.media3.common.b bVar2, io.bidmachine.media3.exoplayer.k kVar) {
        super.onVideoInputFormatChanged(bVar, bVar2, kVar);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(b bVar, int i10, int i11, int i12, float f10) {
        super.onVideoSizeChanged(bVar, i10, i11, i12, f10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onVolumeChanged(b bVar, float f10) {
        super.onVolumeChanged(bVar, f10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(b bVar, String str, long j10, long j11) {
        super.onAudioDecoderInitialized(bVar, str, j10, j11);
    }

    @Override // on.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(b bVar, List list) {
        super.onCues(bVar, (List<in.b>) list);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(b bVar, int i10) {
        super.onDrmSessionAcquired(bVar, i10);
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onLoadStarted(b bVar, ao.b0 b0Var, g0 g0Var, int i10) {
        super.onLoadStarted(bVar, b0Var, g0Var, i10);
    }

    @Override // on.d
    public void onPositionDiscontinuity(b bVar, h1 h1Var, h1 h1Var2, int i10) {
        if (i10 == 1) {
            this.f79612v = true;
        }
        this.f79602l = i10;
    }

    @Override // on.d
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(b bVar, String str, long j10, long j11) {
        super.onVideoDecoderInitialized(bVar, str, j10, j11);
    }

    @Override // on.d
    public void onVideoSizeChanged(b bVar, k2 k2Var) {
        b0 b0Var = this.f79606p;
        if (b0Var != null) {
            io.bidmachine.media3.common.b bVar2 = b0Var.f79586a;
            if (bVar2.f60673w == -1) {
                this.f79606p = new b0(bVar2.buildUpon().setWidth(k2Var.f57981a).setHeight(k2Var.f57982b).build(), b0Var.f79587b, b0Var.f79588c);
            }
        }
    }

    @Override // on.d0
    public void onSessionCreated(b bVar, String str) {
    }

    @Override // on.d0
    public void onAdPlaybackStarted(b bVar, String str, String str2) {
    }
}
