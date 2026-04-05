package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.content.Context;
import android.os.Looper;
import android.view.InflateException;
import androidx.lifecycle.k0;
import bf.o;
import bv.n;
import com.google.android.exoplayer2.audio.k;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.j2;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o2;
import com.google.android.exoplayer2.p2;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.q2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.ui.m0;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.y;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.l;
import kv.p;
import pf.s;
import sf.x;
import tu.a0;
import tu.t;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f50097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f50098c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h f50099e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineScope f50100f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f50101g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f50102h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f50103i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f50104j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f50105k;

    /* renamed from: l, reason: collision with root package name */
    public final MutableStateFlow f50106l;

    /* renamed from: m, reason: collision with root package name */
    public final m0 f50107m;

    /* renamed from: n, reason: collision with root package name */
    public String f50108n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f50109o;

    /* renamed from: p, reason: collision with root package name */
    public final Looper f50110p;

    /* renamed from: q, reason: collision with root package name */
    public c0 f50111q;

    /* renamed from: r, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b f50112r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f50113s;

    /* renamed from: t, reason: collision with root package name */
    public final C0485d f50114t;

    /* renamed from: u, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f f50115u;

    /* renamed from: v, reason: collision with root package name */
    public long f50116v;

    /* renamed from: w, reason: collision with root package name */
    public Job f50117w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f50118i;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, zu.d<? super x0> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = d.this.new a(dVar);
            aVar.f50118i = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            boolean zE = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f50118i).e();
            d dVar = d.this;
            if (zE) {
                dVar.J();
            } else {
                Job job = dVar.f50117w;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f50120b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f50121c;

        public b(c0 c0Var, c cVar) {
            this.f50120b = c0Var;
            this.f50121c = cVar;
        }

        public final void a(Throwable th2) {
            this.f50120b.removeListener(this.f50121c);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements p2 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f50122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f50123c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f50124e;

        public c(int i10, c0 c0Var, CancellableContinuation<? super x0> cancellableContinuation) {
            this.f50122b = i10;
            this.f50123c = c0Var;
            this.f50124e = cancellableContinuation;
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(k kVar) {
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

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onCues(ef.e eVar) {
            super.onCues(eVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(q qVar) {
            super.onDeviceInfoChanged(qVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            super.onDeviceVolumeChanged(i10, z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onEvents(r2 r2Var, o2 o2Var) {
            super.onEvents(r2Var, o2Var);
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
        public void onPlaybackStateChanged(int i10) {
            if (i10 == this.f50122b) {
                this.f50123c.removeListener(this);
                int i11 = z.f87419c;
                this.f50124e.resumeWith(z.m7131constructorimpl(x0.f87415a));
            }
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
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(s sVar) {
            super.onTrackSelectionParametersChanged(sVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onTracksChanged(n3 n3Var) {
            super.onTracksChanged(n3Var);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(x xVar) {
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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d$d, reason: collision with other inner class name */
    public static final class C0485d implements p2 {
        public C0485d() {
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(k kVar) {
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

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onCues(ef.e eVar) {
            super.onCues(eVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(q qVar) {
            super.onDeviceInfoChanged(qVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            super.onDeviceVolumeChanged(i10, z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onEvents(r2 r2Var, o2 o2Var) {
            super.onEvents(r2Var, o2Var);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
            super.onIsLoadingChanged(z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
            d dVar = d.this;
            c0 c0VarM = dVar.m();
            long duration = c0VarM != null ? c0VarM.getDuration() : 0L;
            c0 c0VarM2 = dVar.m();
            dVar.f50103i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(z10, true, duration - (c0VarM2 != null ? c0VarM2.getCurrentPosition() : 0L) > 0));
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
        public void onPlaybackStateChanged(int i10) {
            super.onPlaybackStateChanged(i10);
            if (i10 == 4) {
                d dVar = d.this;
                c0 c0VarM = dVar.m();
                dVar.b(new j.a(c0VarM != null ? c0VarM.getDuration() : 1L));
                dVar.C();
            }
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            super.onPlaybackSuppressionReasonChanged(i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onPlayerError(j2 error) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar;
            e0.checkNotNullParameter(error, "error");
            super.onPlayerError(error);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            d dVar = d.this;
            MolocoLogger.error$default(molocoLogger, d.d(dVar), "Exoplayer error (streaming enabled = " + dVar.f50098c + ')', error, false, 8, null);
            if (dVar.f50098c && (bVar = dVar.f50112r) != null && bVar.a()) {
                j jVar = (j) dVar.f50101g.getValue();
                if ((jVar instanceof j.a) || (jVar instanceof j.c)) {
                    MolocoLogger.info$default(molocoLogger, d.d(dVar), "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                    return;
                } else {
                    if (!(jVar instanceof j.d) && !e0.areEqual(jVar, j.b.f49959a)) {
                        throw new t();
                    }
                    MolocoLogger.info$default(molocoLogger, d.d(dVar), "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
                }
            }
            dVar.f50105k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n.f47738b);
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
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(s sVar) {
            super.onTrackSelectionParametersChanged(sVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onTracksChanged(n3 n3Var) {
            super.onTracksChanged(n3Var);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(x xVar) {
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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class e extends kotlin.jvm.internal.a0 implements kv.a {
        public e(Object obj) {
            super(0, obj, d.class, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", 0);
        }

        public final void a() {
            ((d) this.receiver).B();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class f extends kotlin.jvm.internal.a0 implements kv.a {
        public f(Object obj) {
            super(0, obj, d.class, "disposeExoPlayer", "disposeExoPlayer()V", 0);
        }

        public final void a() {
            ((d) this.receiver).k();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f50126i;

        public g(zu.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new g(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50126i;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            do {
                d dVar = d.this;
                c0 c0VarM = dVar.m();
                if (c0VarM != null) {
                    dVar.b(new j.c(c0VarM.getCurrentPosition(), c0VarM.getDuration()));
                }
                this.f50126i = 1;
            } while (DelayKt.delay(500L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public d(Context context, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h mediaCacheRepository, k0 lifecycle) {
        m0 m0Var;
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        e0.checkNotNullParameter(lifecycle, "lifecycle");
        this.f50097b = context;
        this.f50098c = z10;
        this.f50099e = mediaCacheRepository;
        this.f50100f = com.google.android.gms.internal.play_billing.a.o();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(j.b.f49959a);
        this.f50101g = MutableStateFlow;
        this.f50102h = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, false, 6, null));
        this.f50103i = MutableStateFlow2;
        this.f50104j = MutableStateFlow2;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f50105k = MutableStateFlow3;
        this.f50106l = MutableStateFlow3;
        try {
            m0Var = new m0(context);
            m0Var.setUseController(false);
        } catch (InflateException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "ExoPlayerView could not be instantiated.", e10, false, 8, null);
            this.f50105k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n.f47739c);
            m0Var = null;
        }
        this.f50107m = m0Var;
        this.f50110p = Looper.getMainLooper();
        FlowKt.launchIn(FlowKt.onEach(isPlaying(), new a(null)), this.f50100f);
        this.f50114t = new C0485d();
        this.f50115u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(lifecycle, new e(this), new f(this));
    }

    public static final /* synthetic */ String d(d dVar) {
        dVar.getClass();
        return "SimplifiedExoPlayer";
    }

    public final void B() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Init exo player", null, false, 12, null);
        m0 m0VarN = N();
        if (m0VarN == null) {
            return;
        }
        if (this.f50111q == null) {
            c0 c0VarBuild = new y(this.f50097b).setLooper(this.f50110p).setPauseAtEndOfMediaItems(true).build();
            e0.checkNotNullExpressionValue(c0VarBuild, "build(...)");
            m0VarN.setPlayer(c0VarBuild);
            this.f50111q = c0VarBuild;
            c0VarBuild.setPlayWhenReady(false);
            c0VarBuild.addListener(this.f50114t);
            b(c0VarBuild);
            if (e0.areEqual(p().getValue(), j.b.f49959a)) {
                b(new j.d(c0VarBuild.getDuration()));
            }
        }
        m0VarN.onResume();
    }

    public final void C() {
        this.f50113s = false;
        this.f50116v = 0L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public boolean E() {
        return this.f50109o;
    }

    public final void J() {
        Job job = this.f50117w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f50117w = BuildersKt__Builders_commonKt.launch$default(this.f50100f, null, null, new g(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f50100f, null, 1, null);
        this.f50115u.destroy();
        k();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying() {
        return this.f50104j;
    }

    public final c0 m() {
        return this.f50111q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public String n() {
        return this.f50108n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow<j> p() {
        return this.f50102h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void pause() {
        this.f50113s = false;
        c0 c0Var = this.f50111q;
        if (c0Var != null) {
            c0Var.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void play() {
        this.f50113s = true;
        c0 c0Var = this.f50111q;
        if (c0Var != null) {
            c0Var.play();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public m0 N() {
        return this.f50107m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void seekTo(long j10) {
        this.f50116v = j10;
        c0 c0Var = this.f50111q;
        if (c0Var != null) {
            c0Var.seekTo(j10);
        }
    }

    public final boolean t() {
        return this.f50113s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void b(boolean z10) {
        this.f50109o = z10;
        c0 c0Var = this.f50111q;
        if (c0Var != null) {
            a(c0Var, z10);
        }
    }

    public final void c(c0 c0Var) {
        this.f50116v = c0Var.getCurrentPosition();
    }

    public final void d(c0 c0Var) {
        this.f50111q = c0Var;
    }

    public final void e(boolean z10) {
        this.f50113s = z10;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n> f() {
        return this.f50106l;
    }

    public final void k() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Disposing exo player", null, false, 12, null);
        m0 m0VarN = N();
        if (m0VarN != null) {
            m0VarN.onPause();
            m0VarN.setPlayer(null);
        }
        c0 c0Var = this.f50111q;
        long duration = c0Var != null ? c0Var.getDuration() : 0L;
        c0 c0Var2 = this.f50111q;
        boolean z10 = duration - (c0Var2 != null ? c0Var2.getCurrentPosition() : 0L) > 0;
        c0 c0Var3 = this.f50111q;
        if (c0Var3 != null) {
            c(c0Var3);
            c0Var3.removeListener(this.f50114t);
            c0Var3.release();
        }
        this.f50111q = null;
        this.f50103i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, z10));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void a(String str) {
        this.f50108n = str;
        c0 c0Var = this.f50111q;
        if (c0Var != null) {
            a(c0Var, str);
        }
        C();
    }

    public final void b(c0 c0Var) {
        a(c0Var, E());
        a(c0Var, n());
        c0Var.seekTo(this.f50116v);
        if (this.f50113s) {
            c0Var.play();
        } else {
            c0Var.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public Object a(zu.d<? super x0> dVar) {
        Object objA;
        c0 c0Var = this.f50111q;
        return (c0Var == null || (objA = a(c0Var, 3, dVar)) != av.e.getCOROUTINE_SUSPENDED()) ? x0.f87415a : objA;
    }

    public final void b(j jVar) {
        this.f50101g.setValue(jVar);
    }

    public final boolean a(c0 c0Var) {
        return c0Var.getVolume() == 0.0f;
    }

    public final void a(c0 c0Var, boolean z10) {
        c0Var.setVolume(z10 ? 0.0f : 1.0f);
    }

    public final void a(c0 c0Var, final String str) {
        if (str == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.f50098c) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Streaming is enabled", null, false, 12, null);
                o oVar = new o(new qf.o() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c
                    @Override // qf.o
                    public final qf.p createDataSource() {
                        return d.a(str, this);
                    }
                });
                u1 u1VarFromUri = u1.fromUri(str);
                e0.checkNotNullExpressionValue(u1VarFromUri, "fromUri(...)");
                c0Var.setMediaSource(oVar.createMediaSource(u1VarFromUri));
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Streaming is disabled", null, false, 12, null);
                c0Var.setMediaItem(u1.fromUri(str));
            }
            c0Var.prepare();
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "ExoPlayer setMediaItem exception", e10, false, 8, null);
            this.f50105k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n.f47740e);
        }
    }

    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void y() {
    }

    public static final qf.p a(String str, d dVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(str, dVar.f50099e);
        dVar.f50112r = bVar;
        return bVar;
    }

    public final Object a(c0 c0Var, int i10, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        c cVar = new c(i10, c0Var, cancellableContinuationImpl);
        c0Var.addListener(cVar);
        cancellableContinuationImpl.invokeOnCancellation(new b(c0Var, cVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }
}
