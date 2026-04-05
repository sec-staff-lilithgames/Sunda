package io.odeeo.internal.c;

import android.util.SparseArray;
import io.odeeo.internal.a0.n;
import io.odeeo.internal.a0.q;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.i0;
import io.odeeo.internal.b.k0;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.b.z0;
import io.odeeo.internal.d.d;
import io.odeeo.internal.e.e;
import io.odeeo.internal.e.i;
import io.odeeo.internal.n0.h;
import io.odeeo.internal.q0.l;
import io.odeeo.internal.r0.m;
import io.odeeo.internal.t0.p;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f63286a;

        /* renamed from: b, reason: collision with root package name */
        public final y0 f63287b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63288c;

        /* renamed from: d, reason: collision with root package name */
        public final t.a f63289d;

        /* renamed from: e, reason: collision with root package name */
        public final long f63290e;

        /* renamed from: f, reason: collision with root package name */
        public final y0 f63291f;

        /* renamed from: g, reason: collision with root package name */
        public final int f63292g;

        /* renamed from: h, reason: collision with root package name */
        public final t.a f63293h;

        /* renamed from: i, reason: collision with root package name */
        public final long f63294i;

        /* renamed from: j, reason: collision with root package name */
        public final long f63295j;

        public a(long j10, y0 y0Var, int i10, t.a aVar, long j11, y0 y0Var2, int i11, t.a aVar2, long j12, long j13) {
            this.f63286a = j10;
            this.f63287b = y0Var;
            this.f63288c = i10;
            this.f63289d = aVar;
            this.f63290e = j11;
            this.f63291f = y0Var2;
            this.f63292g = i11;
            this.f63293h = aVar2;
            this.f63294i = j12;
            this.f63295j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f63286a == aVar.f63286a && this.f63288c == aVar.f63288c && this.f63290e == aVar.f63290e && this.f63292g == aVar.f63292g && this.f63294i == aVar.f63294i && this.f63295j == aVar.f63295j && p.equal(this.f63287b, aVar.f63287b) && p.equal(this.f63289d, aVar.f63289d) && p.equal(this.f63291f, aVar.f63291f) && p.equal(this.f63293h, aVar.f63293h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return p.hashCode(Long.valueOf(this.f63286a), this.f63287b, Integer.valueOf(this.f63288c), this.f63289d, Long.valueOf(this.f63290e), this.f63291f, Integer.valueOf(this.f63292g), this.f63293h, Long.valueOf(this.f63294i), Long.valueOf(this.f63295j));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.c.b$b, reason: collision with other inner class name */
    public static final class C0596b {

        /* renamed from: a, reason: collision with root package name */
        public final l f63296a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f63297b;

        public C0596b(l lVar, SparseArray<a> sparseArray) {
            this.f63296a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.size());
            for (int i10 = 0; i10 < lVar.size(); i10++) {
                int i11 = lVar.get(i10);
                sparseArray2.append(i11, (a) io.odeeo.internal.q0.a.checkNotNull(sparseArray.get(i11)));
            }
            this.f63297b = sparseArray2;
        }

        public boolean contains(int i10) {
            return this.f63296a.contains(i10);
        }

        public boolean containsAny(int... iArr) {
            return this.f63296a.containsAny(iArr);
        }

        public int get(int i10) {
            return this.f63296a.get(i10);
        }

        public a getEventTime(int i10) {
            return (a) io.odeeo.internal.q0.a.checkNotNull(this.f63297b.get(i10));
        }

        public int size() {
            return this.f63296a.size();
        }
    }

    @Deprecated
    default void onAudioDecoderInitialized(a aVar, String str, long j10) {
    }

    @Deprecated
    default void onAudioInputFormatChanged(a aVar, io.odeeo.internal.b.t tVar) {
    }

    @Deprecated
    default void onDrmSessionAcquired(a aVar) {
    }

    @Deprecated
    default void onPositionDiscontinuity(a aVar, int i10) {
    }

    @Deprecated
    default void onVideoDecoderInitialized(a aVar, String str, long j10) {
    }

    @Deprecated
    default void onVideoInputFormatChanged(a aVar, io.odeeo.internal.b.t tVar) {
    }

    @Deprecated
    default void onVideoSizeChanged(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void onAudioDecoderInitialized(a aVar, String str, long j10, long j11) {
    }

    default void onAudioInputFormatChanged(a aVar, io.odeeo.internal.b.t tVar, i iVar) {
    }

    default void onDrmSessionAcquired(a aVar, int i10) {
    }

    default void onPositionDiscontinuity(a aVar, l0.f fVar, l0.f fVar2, int i10) {
    }

    default void onVideoDecoderInitialized(a aVar, String str, long j10, long j11) {
    }

    default void onVideoInputFormatChanged(a aVar, io.odeeo.internal.b.t tVar, i iVar) {
    }

    default void onVideoSizeChanged(a aVar, m mVar) {
    }

    default void onDrmKeysLoaded(a aVar) {
    }

    default void onDrmKeysRemoved(a aVar) {
    }

    default void onDrmKeysRestored(a aVar) {
    }

    default void onDrmSessionReleased(a aVar) {
    }

    default void onPlayerReleased(a aVar) {
    }

    @Deprecated
    default void onSeekProcessed(a aVar) {
    }

    @Deprecated
    default void onSeekStarted(a aVar) {
    }

    default void onAudioAttributesChanged(a aVar, d dVar) {
    }

    default void onAudioCodecError(a aVar, Exception exc) {
    }

    default void onAudioDecoderReleased(a aVar, String str) {
    }

    default void onAudioDisabled(a aVar, e eVar) {
    }

    default void onAudioEnabled(a aVar, e eVar) {
    }

    default void onAudioPositionAdvancing(a aVar, long j10) {
    }

    default void onAudioSessionIdChanged(a aVar, int i10) {
    }

    default void onAudioSinkError(a aVar, Exception exc) {
    }

    default void onAvailableCommandsChanged(a aVar, l0.b bVar) {
    }

    default void onDownstreamFormatChanged(a aVar, q qVar) {
    }

    default void onDrmSessionManagerError(a aVar, Exception exc) {
    }

    default void onEvents(l0 l0Var, C0596b c0596b) {
    }

    default void onIsLoadingChanged(a aVar, boolean z10) {
    }

    default void onIsPlayingChanged(a aVar, boolean z10) {
    }

    @Deprecated
    default void onLoadingChanged(a aVar, boolean z10) {
    }

    default void onMaxSeekToPreviousPositionChanged(a aVar, long j10) {
    }

    default void onMediaMetadataChanged(a aVar, a0 a0Var) {
    }

    default void onMetadata(a aVar, io.odeeo.internal.s.a aVar2) {
    }

    default void onPlaybackParametersChanged(a aVar, k0 k0Var) {
    }

    default void onPlaybackStateChanged(a aVar, int i10) {
    }

    default void onPlaybackSuppressionReasonChanged(a aVar, int i10) {
    }

    default void onPlayerError(a aVar, i0 i0Var) {
    }

    default void onPlaylistMetadataChanged(a aVar, a0 a0Var) {
    }

    default void onRepeatModeChanged(a aVar, int i10) {
    }

    default void onSeekBackIncrementChanged(a aVar, long j10) {
    }

    default void onSeekForwardIncrementChanged(a aVar, long j10) {
    }

    default void onShuffleModeChanged(a aVar, boolean z10) {
    }

    default void onSkipSilenceEnabledChanged(a aVar, boolean z10) {
    }

    default void onTimelineChanged(a aVar, int i10) {
    }

    default void onTracksInfoChanged(a aVar, z0 z0Var) {
    }

    default void onUpstreamDiscarded(a aVar, q qVar) {
    }

    default void onVideoCodecError(a aVar, Exception exc) {
    }

    default void onVideoDecoderReleased(a aVar, String str) {
    }

    default void onVideoDisabled(a aVar, e eVar) {
    }

    default void onVideoEnabled(a aVar, e eVar) {
    }

    default void onVolumeChanged(a aVar, float f10) {
    }

    @Deprecated
    default void onDecoderDisabled(a aVar, int i10, e eVar) {
    }

    @Deprecated
    default void onDecoderEnabled(a aVar, int i10, e eVar) {
    }

    @Deprecated
    default void onDecoderInputFormatChanged(a aVar, int i10, io.odeeo.internal.b.t tVar) {
    }

    default void onDroppedVideoFrames(a aVar, int i10, long j10) {
    }

    default void onLoadCanceled(a aVar, n nVar, q qVar) {
    }

    default void onLoadCompleted(a aVar, n nVar, q qVar) {
    }

    default void onLoadStarted(a aVar, n nVar, q qVar) {
    }

    default void onMediaItemTransition(a aVar, z zVar, int i10) {
    }

    default void onPlayWhenReadyChanged(a aVar, boolean z10, int i10) {
    }

    @Deprecated
    default void onPlayerStateChanged(a aVar, boolean z10, int i10) {
    }

    default void onRenderedFirstFrame(a aVar, Object obj, long j10) {
    }

    default void onSurfaceSizeChanged(a aVar, int i10, int i11) {
    }

    @Deprecated
    default void onTracksChanged(a aVar, io.odeeo.internal.a0.l0 l0Var, h hVar) {
    }

    default void onVideoFrameProcessingOffset(a aVar, long j10, int i10) {
    }

    default void onAudioUnderrun(a aVar, int i10, long j10, long j11) {
    }

    default void onBandwidthEstimate(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    default void onDecoderInitialized(a aVar, int i10, String str, long j10) {
    }

    default void onLoadError(a aVar, n nVar, q qVar, IOException iOException, boolean z10) {
    }
}
