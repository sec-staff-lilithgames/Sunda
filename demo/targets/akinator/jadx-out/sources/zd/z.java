package zd;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import bf.d0;
import com.google.android.exoplayer2.j2;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o1;
import com.google.android.exoplayer2.q2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements d, a0 {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f97908a;

    /* renamed from: b, reason: collision with root package name */
    public final w f97909b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f97910c;

    /* renamed from: i, reason: collision with root package name */
    public String f97916i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f97917j;

    /* renamed from: k, reason: collision with root package name */
    public int f97918k;

    /* renamed from: n, reason: collision with root package name */
    public j2 f97921n;

    /* renamed from: o, reason: collision with root package name */
    public y f97922o;

    /* renamed from: p, reason: collision with root package name */
    public y f97923p;

    /* renamed from: q, reason: collision with root package name */
    public y f97924q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f97925r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f97926s;

    /* renamed from: t, reason: collision with root package name */
    public z0 f97927t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f97928u;

    /* renamed from: v, reason: collision with root package name */
    public int f97929v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f97930w;

    /* renamed from: x, reason: collision with root package name */
    public int f97931x;

    /* renamed from: y, reason: collision with root package name */
    public int f97932y;

    /* renamed from: z, reason: collision with root package name */
    public int f97933z;

    /* renamed from: e, reason: collision with root package name */
    public final l3 f97912e = new l3();

    /* renamed from: f, reason: collision with root package name */
    public final k3 f97913f = new k3();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f97915h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f97914g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f97911d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f97919l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f97920m = 0;

    public z(Context context, PlaybackSession playbackSession) {
        this.f97908a = context.getApplicationContext();
        this.f97910c = playbackSession;
        w wVar = new w();
        this.f97909b = wVar;
        wVar.setListener(this);
    }

    public static z create(Context context) {
        MediaMetricsManager mediaMetricsManagerB = y3.f.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new z(context, mediaMetricsManagerB.createPlaybackSession());
    }

    public final boolean a(y yVar) {
        return yVar != null && yVar.f97907c.equals(this.f97909b.getActiveSessionId());
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f97917j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f97933z);
            this.f97917j.setVideoFramesDropped(this.f97931x);
            this.f97917j.setVideoFramesPlayed(this.f97932y);
            Long l9 = (Long) this.f97914g.get(this.f97916i);
            this.f97917j.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f97915h.get(this.f97916i);
            this.f97917j.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f97917j.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f97910c.reportPlaybackMetrics(this.f97917j.build());
        }
        this.f97917j = null;
        this.f97916i = null;
        this.f97933z = 0;
        this.f97931x = 0;
        this.f97932y = 0;
        this.f97925r = null;
        this.f97926s = null;
        this.f97927t = null;
        this.A = false;
    }

    public final void c(m3 m3Var, d0 d0Var) {
        int indexOfPeriod;
        int i10;
        PlaybackMetrics.Builder builder = this.f97917j;
        if (d0Var == null || (indexOfPeriod = m3Var.getIndexOfPeriod(d0Var.f9193a)) == -1) {
            return;
        }
        k3 k3Var = this.f97913f;
        m3Var.getPeriod(indexOfPeriod, k3Var);
        int i11 = k3Var.f27598e;
        l3 l3Var = this.f97912e;
        m3Var.getWindow(i11, l3Var);
        o1 o1Var = l3Var.f27649e.f28113c;
        if (o1Var == null) {
            i10 = 0;
        } else {
            int iInferContentTypeForUriAndMimeType = n1.inferContentTypeForUriAndMimeType(o1Var.f27860b, o1Var.f27861c);
            i10 = iInferContentTypeForUriAndMimeType != 0 ? iInferContentTypeForUriAndMimeType != 1 ? iInferContentTypeForUriAndMimeType != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (l3Var.f27660p != C.TIME_UNSET && !l3Var.f27658n && !l3Var.f27655k && !l3Var.isLive()) {
            builder.setMediaDurationMillis(l3Var.getDurationMs());
        }
        builder.setPlaybackType(l3Var.isLive() ? 2 : 1);
        this.A = true;
    }

    public final void d(int i10, long j10, z0 z0Var, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f97911d);
        if (z0Var != null) {
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
            String str = z0Var.f28801m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = z0Var.f28802n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = z0Var.f28799k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = z0Var.f28798j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = z0Var.f28807s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = z0Var.f28808t;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = z0Var.A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = z0Var.B;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = z0Var.f28793e;
            if (str4 != null) {
                String[] strArrSplit = n1.split(str4, "-");
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = z0Var.f28809u;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f97910c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public LogSessionId getLogSessionId() {
        return this.f97910c.getSessionId();
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(b bVar, com.google.android.exoplayer2.audio.k kVar) {
        super.onAudioAttributesChanged(bVar, kVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioCodecError(b bVar, Exception exc) {
        super.onAudioCodecError(bVar, exc);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(b bVar, String str, long j10) {
        super.onAudioDecoderInitialized(bVar, str, j10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(b bVar, String str) {
        super.onAudioDecoderReleased(bVar, str);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioDisabled(b bVar, ce.f fVar) {
        super.onAudioDisabled(bVar, fVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioEnabled(b bVar, ce.f fVar) {
        super.onAudioEnabled(bVar, fVar);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(b bVar, z0 z0Var) {
        super.onAudioInputFormatChanged(bVar, z0Var);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(b bVar, long j10) {
        super.onAudioPositionAdvancing(bVar, j10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(b bVar, int i10) {
        super.onAudioSessionIdChanged(bVar, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioSinkError(b bVar, Exception exc) {
        super.onAudioSinkError(bVar, exc);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioUnderrun(b bVar, int i10, long j10, long j11) {
        super.onAudioUnderrun(bVar, i10, j10, j11);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(b bVar, n2 n2Var) {
        super.onAvailableCommandsChanged(bVar, n2Var);
    }

    @Override // zd.d
    public void onBandwidthEstimate(b bVar, int i10, long j10, long j11) {
        d0 d0Var = bVar.f97800d;
        if (d0Var != null) {
            String sessionForMediaPeriodId = this.f97909b.getSessionForMediaPeriodId(bVar.f97798b, (d0) com.google.android.exoplayer2.util.a.checkNotNull(d0Var));
            HashMap map = this.f97915h;
            Long l9 = (Long) map.get(sessionForMediaPeriodId);
            HashMap map2 = this.f97914g;
            Long l10 = (Long) map2.get(sessionForMediaPeriodId);
            map.put(sessionForMediaPeriodId, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j10));
            map2.put(sessionForMediaPeriodId, Long.valueOf((l10 != null ? l10.longValue() : 0L) + i10));
        }
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onCues(b bVar, ef.e eVar) {
        super.onCues(bVar, eVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(b bVar, com.google.android.exoplayer2.q qVar) {
        super.onDeviceInfoChanged(bVar, qVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(b bVar, int i10, boolean z10) {
        super.onDeviceVolumeChanged(bVar, i10, z10);
    }

    @Override // zd.d
    public void onDownstreamFormatChanged(b bVar, bf.y yVar) {
        if (bVar.f97800d == null) {
            return;
        }
        y yVar2 = new y((z0) com.google.android.exoplayer2.util.a.checkNotNull(yVar.f9488c), yVar.f9489d, this.f97909b.getSessionForMediaPeriodId(bVar.f97798b, (d0) com.google.android.exoplayer2.util.a.checkNotNull(bVar.f97800d)));
        int i10 = yVar.f9487b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f97923p = yVar2;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f97924q = yVar2;
                return;
            }
        }
        this.f97922o = yVar2;
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(b bVar) {
        super.onDrmKeysLoaded(bVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(b bVar) {
        super.onDrmKeysRemoved(bVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(b bVar) {
        super.onDrmKeysRestored(bVar);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(b bVar) {
        super.onDrmSessionAcquired(bVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(b bVar, Exception exc) {
        super.onDrmSessionManagerError(bVar, exc);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(b bVar) {
        super.onDrmSessionReleased(bVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(b bVar, int i10, long j10) {
        super.onDroppedVideoFrames(bVar, i10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04f5 A[PHI: r11
      0x04f5: PHI (r11v23 int) = (r11v21 int), (r11v22 int) binds: [B:307:0x04f3, B:332:0x052a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // zd.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvents(com.google.android.exoplayer2.r2 r27, zd.c r28) {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.z.onEvents(com.google.android.exoplayer2.r2, zd.c):void");
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(b bVar, boolean z10) {
        super.onIsLoadingChanged(bVar, z10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(b bVar, boolean z10) {
        super.onIsPlayingChanged(bVar, z10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onLoadCanceled(b bVar, bf.t tVar, bf.y yVar) {
        super.onLoadCanceled(bVar, tVar, yVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onLoadCompleted(b bVar, bf.t tVar, bf.y yVar) {
        super.onLoadCompleted(bVar, tVar, yVar);
    }

    @Override // zd.d
    public void onLoadError(b bVar, bf.t tVar, bf.y yVar, IOException iOException, boolean z10) {
        this.f97929v = yVar.f9486a;
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onLoadStarted(b bVar, bf.t tVar, bf.y yVar) {
        super.onLoadStarted(bVar, tVar, yVar);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(b bVar, boolean z10) {
        super.onLoadingChanged(bVar, z10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(b bVar, long j10) {
        super.onMaxSeekToPreviousPositionChanged(bVar, j10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onMediaItemTransition(b bVar, u1 u1Var, int i10) {
        super.onMediaItemTransition(bVar, u1Var, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(b bVar, w1 w1Var) {
        super.onMediaMetadataChanged(bVar, w1Var);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onMetadata(b bVar, Metadata metadata) {
        super.onMetadata(bVar, metadata);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(b bVar, boolean z10, int i10) {
        super.onPlayWhenReadyChanged(bVar, z10, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(b bVar, l2 l2Var) {
        super.onPlaybackParametersChanged(bVar, l2Var);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(b bVar, int i10) {
        super.onPlaybackStateChanged(bVar, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(b bVar, int i10) {
        super.onPlaybackSuppressionReasonChanged(bVar, i10);
    }

    @Override // zd.d
    public void onPlayerError(b bVar, j2 j2Var) {
        this.f97921n = j2Var;
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(b bVar, j2 j2Var) {
        super.onPlayerErrorChanged(bVar, j2Var);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onPlayerReleased(b bVar) {
        super.onPlayerReleased(bVar);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(b bVar, boolean z10, int i10) {
        super.onPlayerStateChanged(bVar, z10, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(b bVar, w1 w1Var) {
        super.onPlaylistMetadataChanged(bVar, w1Var);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(b bVar, int i10) {
        super.onPositionDiscontinuity(bVar, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(b bVar, Object obj, long j10) {
        super.onRenderedFirstFrame(bVar, obj, j10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(b bVar, int i10) {
        super.onRepeatModeChanged(bVar, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(b bVar, long j10) {
        super.onSeekBackIncrementChanged(bVar, j10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(b bVar, long j10) {
        super.onSeekForwardIncrementChanged(bVar, j10);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(b bVar) {
        super.onSeekStarted(bVar);
    }

    @Override // zd.a0
    public void onSessionActive(b bVar, String str) {
        d0 d0Var = bVar.f97800d;
        if (d0Var == null || !d0Var.isAd()) {
            b();
            this.f97916i = str;
            this.f97917j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
            c(bVar.f97798b, bVar.f97800d);
        }
    }

    @Override // zd.a0
    public void onSessionFinished(b bVar, String str, boolean z10) {
        d0 d0Var = bVar.f97800d;
        if ((d0Var == null || !d0Var.isAd()) && str.equals(this.f97916i)) {
            b();
        }
        this.f97914g.remove(str);
        this.f97915h.remove(str);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(b bVar, boolean z10) {
        super.onShuffleModeChanged(bVar, z10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(b bVar, boolean z10) {
        super.onSkipSilenceEnabledChanged(bVar, z10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(b bVar, int i10, int i11) {
        super.onSurfaceSizeChanged(bVar, i10, i11);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onTimelineChanged(b bVar, int i10) {
        super.onTimelineChanged(bVar, i10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(b bVar, pf.s sVar) {
        super.onTrackSelectionParametersChanged(bVar, sVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onTracksChanged(b bVar, n3 n3Var) {
        super.onTracksChanged(bVar, n3Var);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(b bVar, bf.y yVar) {
        super.onUpstreamDiscarded(bVar, yVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onVideoCodecError(b bVar, Exception exc) {
        super.onVideoCodecError(bVar, exc);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(b bVar, String str, long j10) {
        super.onVideoDecoderInitialized(bVar, str, j10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(b bVar, String str) {
        super.onVideoDecoderReleased(bVar, str);
    }

    @Override // zd.d
    public void onVideoDisabled(b bVar, ce.f fVar) {
        this.f97931x += fVar.f12230g;
        this.f97932y += fVar.f12228e;
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onVideoEnabled(b bVar, ce.f fVar) {
        super.onVideoEnabled(bVar, fVar);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(b bVar, long j10, int i10) {
        super.onVideoFrameProcessingOffset(bVar, j10, i10);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(b bVar, z0 z0Var) {
        super.onVideoInputFormatChanged(bVar, z0Var);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(b bVar, int i10, int i11, int i12, float f10) {
        super.onVideoSizeChanged(bVar, i10, i11, i12, f10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onVolumeChanged(b bVar, float f10) {
        super.onVolumeChanged(bVar, f10);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(b bVar, String str, long j10, long j11) {
        super.onAudioDecoderInitialized(bVar, str, j10, j11);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(b bVar, z0 z0Var, ce.k kVar) {
        super.onAudioInputFormatChanged(bVar, z0Var, kVar);
    }

    @Override // zd.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(b bVar, List list) {
        super.onCues(bVar, (List<ef.b>) list);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(b bVar, int i10) {
        super.onDrmSessionAcquired(bVar, i10);
    }

    @Override // zd.d
    public void onPositionDiscontinuity(b bVar, q2 q2Var, q2 q2Var2, int i10) {
        if (i10 == 1) {
            this.f97928u = true;
        }
        this.f97918k = i10;
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(b bVar, String str, long j10, long j11) {
        super.onVideoDecoderInitialized(bVar, str, j10, j11);
    }

    @Override // zd.d
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(b bVar, z0 z0Var, ce.k kVar) {
        super.onVideoInputFormatChanged(bVar, z0Var, kVar);
    }

    @Override // zd.d
    public void onVideoSizeChanged(b bVar, sf.x xVar) {
        y yVar = this.f97922o;
        if (yVar != null) {
            z0 z0Var = yVar.f97905a;
            if (z0Var.f28808t == -1) {
                this.f97922o = new y(z0Var.buildUpon().setWidth(xVar.f85739b).setHeight(xVar.f85740c).build(), yVar.f97906b, yVar.f97907c);
            }
        }
    }

    @Override // zd.a0
    public void onSessionCreated(b bVar, String str) {
    }

    @Override // zd.a0
    public void onAdPlaybackStarted(b bVar, String str, String str2) {
    }
}
