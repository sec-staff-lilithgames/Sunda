package io.odeeo.internal.c;

import android.os.Looper;
import android.util.SparseArray;
import ao.n0;
import ao.o0;
import ao.q0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.a0.u;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.i0;
import io.odeeo.internal.b.k0;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.m;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.b.z0;
import io.odeeo.internal.c.b;
import io.odeeo.internal.d.g;
import io.odeeo.internal.e.e;
import io.odeeo.internal.n0.h;
import io.odeeo.internal.p0.d;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.n;
import io.odeeo.internal.q0.o;
import io.odeeo.internal.r0.l;
import io.odeeo.internal.t0.p;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.j1;
import io.odeeo.internal.u0.v1;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import ks.c;
import ks.f;
import ks.i;
import ks.j;
import ks.k;
import ks.q;
import ks.r;
import ks.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a implements l0.e, g, l, u, d.a, io.odeeo.internal.f.g {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.d f63271a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.b f63272b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.d f63273c;

    /* renamed from: d, reason: collision with root package name */
    public final C0595a f63274d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<b.a> f63275e;

    /* renamed from: f, reason: collision with root package name */
    public o<b> f63276f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f63277g;

    /* renamed from: h, reason: collision with root package name */
    public n f63278h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f63279i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.c.a$a, reason: collision with other inner class name */
    public static final class C0595a {

        /* renamed from: a, reason: collision with root package name */
        public final y0.b f63280a;

        /* renamed from: b, reason: collision with root package name */
        public h1<t.a> f63281b = h1.of();

        /* renamed from: c, reason: collision with root package name */
        public j1<t.a, y0> f63282c = j1.of();

        /* renamed from: d, reason: collision with root package name */
        public t.a f63283d;

        /* renamed from: e, reason: collision with root package name */
        public t.a f63284e;

        /* renamed from: f, reason: collision with root package name */
        public t.a f63285f;

        public C0595a(y0.b bVar) {
            this.f63280a = bVar;
        }

        public t.a getCurrentPlayerMediaPeriod() {
            return this.f63283d;
        }

        public t.a getLoadingMediaPeriod() {
            if (this.f63281b.isEmpty()) {
                return null;
            }
            return (t.a) v1.getLast(this.f63281b);
        }

        public y0 getMediaPeriodIdTimeline(t.a aVar) {
            return this.f63282c.get(aVar);
        }

        public t.a getPlayingMediaPeriod() {
            return this.f63284e;
        }

        public t.a getReadingMediaPeriod() {
            return this.f63285f;
        }

        public void onPositionDiscontinuity(l0 l0Var) {
            this.f63283d = a(l0Var, this.f63281b, this.f63284e, this.f63280a);
        }

        public void onQueueUpdated(List<t.a> list, t.a aVar, l0 l0Var) {
            this.f63281b = h1.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f63284e = list.get(0);
                this.f63285f = (t.a) io.odeeo.internal.q0.a.checkNotNull(aVar);
            }
            if (this.f63283d == null) {
                this.f63283d = a(l0Var, this.f63281b, this.f63284e, this.f63280a);
            }
            a(l0Var.getCurrentTimeline());
        }

        public void onTimelineChanged(l0 l0Var) {
            this.f63283d = a(l0Var, this.f63281b, this.f63284e, this.f63280a);
            a(l0Var.getCurrentTimeline());
        }

        public final void a(y0 y0Var) {
            j1.b<t.a, y0> bVarBuilder = j1.builder();
            if (this.f63281b.isEmpty()) {
                a(bVarBuilder, this.f63284e, y0Var);
                if (!p.equal(this.f63285f, this.f63284e)) {
                    a(bVarBuilder, this.f63285f, y0Var);
                }
                if (!p.equal(this.f63283d, this.f63284e) && !p.equal(this.f63283d, this.f63285f)) {
                    a(bVarBuilder, this.f63283d, y0Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f63281b.size(); i10++) {
                    a(bVarBuilder, this.f63281b.get(i10), y0Var);
                }
                if (!this.f63281b.contains(this.f63283d)) {
                    a(bVarBuilder, this.f63283d, y0Var);
                }
            }
            this.f63282c = bVarBuilder.build();
        }

        public final void a(j1.b<t.a, y0> bVar, t.a aVar, y0 y0Var) {
            if (aVar == null) {
                return;
            }
            if (y0Var.getIndexOfPeriod(aVar.f62447a) != -1) {
                bVar.put(aVar, y0Var);
                return;
            }
            y0 y0Var2 = this.f63282c.get(aVar);
            if (y0Var2 != null) {
                bVar.put(aVar, y0Var2);
            }
        }

        public static t.a a(l0 l0Var, h1<t.a> h1Var, t.a aVar, y0.b bVar) {
            y0 currentTimeline = l0Var.getCurrentTimeline();
            int currentPeriodIndex = l0Var.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (l0Var.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, bVar).getAdGroupIndexAfterPositionUs(g0.msToUs(l0Var.getCurrentPosition()) - bVar.getPositionInWindowUs());
            for (int i10 = 0; i10 < h1Var.size(); i10++) {
                t.a aVar2 = h1Var.get(i10);
                if (a(aVar2, uidOfPeriod, l0Var.isPlayingAd(), l0Var.getCurrentAdGroupIndex(), l0Var.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return aVar2;
                }
            }
            if (h1Var.isEmpty() && aVar != null && a(aVar, uidOfPeriod, l0Var.isPlayingAd(), l0Var.getCurrentAdGroupIndex(), l0Var.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return aVar;
            }
            return null;
        }

        public static boolean a(t.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!aVar.f62447a.equals(obj)) {
                return false;
            }
            if (z10 && aVar.f62448b == i10 && aVar.f62449c == i11) {
                return true;
            }
            return !z10 && aVar.f62448b == -1 && aVar.f62451e == i12;
        }
    }

    public a(io.odeeo.internal.q0.d dVar) {
        this.f63271a = (io.odeeo.internal.q0.d) io.odeeo.internal.q0.a.checkNotNull(dVar);
        this.f63276f = new o<>(g0.getCurrentOrMainLooper(), dVar, new j1.u(17));
        y0.b bVar = new y0.b();
        this.f63272b = bVar;
        this.f63273c = new y0.d();
        this.f63274d = new C0595a(bVar);
        this.f63275e = new SparseArray<>();
    }

    public static /* synthetic */ void b(b.a aVar, e eVar, b bVar) {
        bVar.onAudioEnabled(aVar, eVar);
        bVar.onDecoderEnabled(aVar, 1, eVar);
    }

    public static /* synthetic */ void c(b.a aVar, e eVar, b bVar) {
        bVar.onVideoDisabled(aVar, eVar);
        bVar.onDecoderDisabled(aVar, 2, eVar);
    }

    public void addListener(b bVar) {
        io.odeeo.internal.q0.a.checkNotNull(bVar);
        this.f63276f.add(bVar);
    }

    public final void notifySeekStarted() {
        if (this.f63279i) {
            return;
        }
        b.a aVarA = a();
        this.f63279i = true;
        a(aVarA, -1, new ks.l(aVarA, 3));
    }

    @Override // io.odeeo.internal.b.l0.e
    public final void onAudioAttributesChanged(io.odeeo.internal.d.d dVar) {
        b.a aVarD = d();
        a(aVarD, C3227g4.f36758l, new ao.n(25, aVarD, dVar));
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioCodecError(Exception exc) {
        b.a aVarD = d();
        a(aVarD, IronSourceError.ERROR_IS_LOAD_DURING_SHOW, new r(aVarD, exc, 3));
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioDecoderInitialized(String str, long j10, long j11) {
        b.a aVarD = d();
        a(aVarD, 1009, new ks.d(aVarD, str, j11, j10, 0));
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioDecoderReleased(String str) {
        b.a aVarD = d();
        a(aVarD, C3227g4.f36755i, new ks.o(aVarD, str, 0));
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioDisabled(e eVar) {
        b.a aVarC = c();
        a(aVarC, C3227g4.f36756j, new c(aVarC, 3, eVar));
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioEnabled(e eVar) {
        b.a aVarD = d();
        a(aVarD, 1008, new c(aVarD, 1, eVar));
    }

    @Override // io.odeeo.internal.d.g
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(io.odeeo.internal.b.t tVar) {
        super.onAudioInputFormatChanged(tVar);
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioPositionAdvancing(long j10) {
        b.a aVarD = d();
        a(aVarD, 1011, new j(aVarD, 2, j10));
    }

    @Override // io.odeeo.internal.b.l0.e
    public final void onAudioSessionIdChanged(int i10) {
        b.a aVarD = d();
        a(aVarD, 1015, new ks.b(aVarD, i10, 1));
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioSinkError(Exception exc) {
        b.a aVarD = d();
        a(aVarD, 1018, new r(aVarD, exc, 2));
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioUnderrun(int i10, long j10, long j11) {
        b.a aVarD = d();
        a(aVarD, TTAdConstant.IMAGE_MODE_1012, new q(aVarD, i10, j10, j11, 0));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onAvailableCommandsChanged(l0.b bVar) {
        b.a aVarA = a();
        a(aVarA, 13, new ao.n(24, aVarA, bVar));
    }

    @Override // io.odeeo.internal.p0.d.a
    public final void onBandwidthSample(int i10, long j10, long j11) {
        b.a aVarB = b();
        a(aVarB, 1006, new q(aVarB, i10, j10, j11, 1));
    }

    @Override // io.odeeo.internal.b.l0.e
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues(list);
    }

    @Override // io.odeeo.internal.b.l0.e
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(m mVar) {
        super.onDeviceInfoChanged(mVar);
    }

    @Override // io.odeeo.internal.b.l0.e
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // io.odeeo.internal.a0.u
    public final void onDownstreamFormatChanged(int i10, t.a aVar, io.odeeo.internal.a0.q qVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, 1004, new ks.n(aVarA, qVar, 1));
    }

    @Override // io.odeeo.internal.f.g
    public final void onDrmKeysLoaded(int i10, t.a aVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new ks.l(aVarA, 1));
    }

    @Override // io.odeeo.internal.f.g
    public final void onDrmKeysRemoved(int i10, t.a aVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new ks.l(aVarA, 2));
    }

    @Override // io.odeeo.internal.f.g
    public final void onDrmKeysRestored(int i10, t.a aVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new ks.l(aVarA, 4));
    }

    @Override // io.odeeo.internal.f.g
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, t.a aVar) {
        super.onDrmSessionAcquired(i10, aVar);
    }

    @Override // io.odeeo.internal.f.g
    public final void onDrmSessionManagerError(int i10, t.a aVar, Exception exc) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new r(aVarA, exc, 1));
    }

    @Override // io.odeeo.internal.f.g
    public final void onDrmSessionReleased(int i10, t.a aVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, new ks.l(aVarA, 0));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onDroppedFrames(int i10, long j10) {
        b.a aVarC = c();
        a(aVarC, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new ks.p(aVarC, i10, j10));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public /* bridge */ /* synthetic */ void onEvents(l0 l0Var, l0.d dVar) {
        super.onEvents(l0Var, dVar);
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onIsLoadingChanged(boolean z10) {
        b.a aVarA = a();
        a(aVarA, 3, new ks.m(aVarA, z10, 2));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onIsPlayingChanged(boolean z10) {
        b.a aVarA = a();
        a(aVarA, 7, new ks.m(aVarA, z10, 1));
    }

    @Override // io.odeeo.internal.a0.u
    public final void onLoadCanceled(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, 1002, new ks.a(aVarA, nVar, qVar, 0));
    }

    @Override // io.odeeo.internal.a0.u
    public final void onLoadCompleted(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, 1001, new ks.a(aVarA, nVar, qVar, 2));
    }

    @Override // io.odeeo.internal.a0.u
    public final void onLoadError(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar, IOException iOException, boolean z10) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, IronSourceError.AUCTION_ERROR_DECRYPTION, new n0(aVarA, nVar, qVar, iOException, z10, 1));
    }

    @Override // io.odeeo.internal.a0.u
    public final void onLoadStarted(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, 1000, new ks.a(aVarA, nVar, qVar, 1));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onMaxSeekToPreviousPositionChanged(long j10) {
        b.a aVarA = a();
        a(aVarA, 18, new j(aVarA, 0, j10));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onMediaItemTransition(z zVar, int i10) {
        b.a aVarA = a();
        a(aVarA, 1, new com.google.android.exoplayer2.l0(aVarA, zVar, i10, 3));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onMediaMetadataChanged(a0 a0Var) {
        b.a aVarA = a();
        a(aVarA, 14, new f(aVarA, a0Var, 1));
    }

    @Override // io.odeeo.internal.b.l0.e
    public final void onMetadata(io.odeeo.internal.s.a aVar) {
        b.a aVarA = a();
        a(aVarA, 1007, new s(1, aVarA, aVar));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        b.a aVarA = a();
        a(aVarA, 5, new ks.e(aVarA, z10, i10, 1));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onPlaybackParametersChanged(k0 k0Var) {
        b.a aVarA = a();
        a(aVarA, 12, new s(0, aVarA, k0Var));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onPlaybackStateChanged(int i10) {
        b.a aVarA = a();
        a(aVarA, 4, new ks.b(aVarA, i10, 5));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        b.a aVarA = a();
        a(aVarA, 6, new ks.b(aVarA, i10, 4));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onPlayerError(i0 i0Var) {
        io.odeeo.internal.a0.s sVar;
        b.a aVarA = (!(i0Var instanceof io.odeeo.internal.b.n) || (sVar = ((io.odeeo.internal.b.n) i0Var).f62838i) == null) ? null : a(new t.a(sVar));
        if (aVarA == null) {
            aVarA = a();
        }
        a(aVarA, 10, new ao.n(29, aVarA, i0Var));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(i0 i0Var) {
        super.onPlayerErrorChanged(i0Var);
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onPlayerStateChanged(boolean z10, int i10) {
        b.a aVarA = a();
        a(aVarA, -1, new ks.e(aVarA, z10, i10, 0));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlaylistMetadataChanged(a0 a0Var) {
        b.a aVarA = a();
        a(aVarA, 15, new f(aVarA, a0Var, 0));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onPositionDiscontinuity(l0.f fVar, l0.f fVar2, int i10) {
        if (i10 == 1) {
            this.f63279i = false;
        }
        this.f63274d.onPositionDiscontinuity((l0) io.odeeo.internal.q0.a.checkNotNull(this.f63277g));
        b.a aVarA = a();
        a(aVarA, 11, new o0(i10, 1, aVarA, fVar, fVar2));
    }

    @Override // io.odeeo.internal.b.l0.e
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onRepeatModeChanged(int i10) {
        b.a aVarA = a();
        a(aVarA, 8, new ks.b(aVarA, i10, 0));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onSeekBackIncrementChanged(long j10) {
        b.a aVarA = a();
        a(aVarA, 16, new j(aVarA, 1, j10));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onSeekForwardIncrementChanged(long j10) {
        b.a aVarA = a();
        a(aVarA, 17, new j(aVarA, 3, j10));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onSeekProcessed() {
        b.a aVarA = a();
        a(aVarA, -1, new ks.l(aVarA, 5));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b.a aVarA = a();
        a(aVarA, 9, new ks.m(aVarA, z10, 3));
    }

    @Override // io.odeeo.internal.b.l0.e
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        b.a aVarD = d();
        a(aVarD, 1017, new ks.m(aVarD, z10, 0));
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onSurfaceSizeChanged(int i10, int i11) {
        b.a aVarD = d();
        a(aVarD, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new ks.g(i10, i11, 0, aVarD));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onTimelineChanged(y0 y0Var, int i10) {
        this.f63274d.onTimelineChanged((l0) io.odeeo.internal.q0.a.checkNotNull(this.f63277g));
        b.a aVarA = a();
        a(aVarA, 0, new ks.b(aVarA, i10, 2));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public final void onTracksChanged(io.odeeo.internal.a0.l0 l0Var, h hVar) {
        b.a aVarA = a();
        a(aVarA, 2, new q0(aVarA, 11, l0Var, hVar));
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onTracksInfoChanged(z0 z0Var) {
        b.a aVarA = a();
        a(aVarA, 2, new ao.n(27, aVarA, z0Var));
    }

    @Override // io.odeeo.internal.a0.u
    public final void onUpstreamDiscarded(int i10, t.a aVar, io.odeeo.internal.a0.q qVar) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, 1005, new ks.n(aVarA, qVar, 0));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onVideoCodecError(Exception exc) {
        b.a aVarD = d();
        a(aVarD, IronSourceError.ERROR_RV_SHOW_EXCEPTION, new r(aVarD, exc, 0));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
        b.a aVarD = d();
        a(aVarD, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new ks.d(aVarD, str, j11, j10, 1));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onVideoDecoderReleased(String str) {
        b.a aVarD = d();
        a(aVarD, 1024, new ks.o(aVarD, str, 1));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onVideoDisabled(e eVar) {
        b.a aVarC = c();
        a(aVarC, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new c(aVarC, 0, eVar));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onVideoEnabled(e eVar) {
        b.a aVarD = d();
        a(aVarD, 1020, new c(aVarD, 2, eVar));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onVideoFrameProcessingOffset(long j10, int i10) {
        b.a aVarC = c();
        a(aVarC, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new ks.p(aVarC, j10, i10, 1));
    }

    @Override // io.odeeo.internal.r0.l
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(io.odeeo.internal.b.t tVar) {
        super.onVideoInputFormatChanged(tVar);
    }

    @Override // io.odeeo.internal.b.l0.e
    public final void onVideoSizeChanged(io.odeeo.internal.r0.m mVar) {
        b.a aVarD = d();
        a(aVarD, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new ao.n(28, aVarD, mVar));
    }

    @Override // io.odeeo.internal.b.l0.e
    public final void onVolumeChanged(float f10) {
        b.a aVarD = d();
        a(aVarD, 1019, new i(aVarD, f10, 0));
    }

    public void release() {
        ((n) io.odeeo.internal.q0.a.checkStateNotNull(this.f63278h)).post(new ji.t(this, 3));
    }

    public void removeListener(b bVar) {
        this.f63276f.remove(bVar);
    }

    public void setPlayer(l0 l0Var, Looper looper) {
        io.odeeo.internal.q0.a.checkState(this.f63277g == null || this.f63274d.f63281b.isEmpty());
        this.f63277g = (l0) io.odeeo.internal.q0.a.checkNotNull(l0Var);
        this.f63278h = this.f63271a.createHandler(looper, null);
        this.f63276f = this.f63276f.copy(looper, new ao.n(26, this, l0Var));
    }

    public final void updateMediaPeriodQueueInfo(List<t.a> list, t.a aVar) {
        this.f63274d.onQueueUpdated(list, aVar, (l0) io.odeeo.internal.q0.a.checkNotNull(this.f63277g));
    }

    public static /* synthetic */ void a(b bVar, io.odeeo.internal.q0.l lVar) {
    }

    public static /* synthetic */ void d(b.a aVar, e eVar, b bVar) {
        bVar.onVideoEnabled(aVar, eVar);
        bVar.onDecoderEnabled(aVar, 2, eVar);
    }

    @Override // io.odeeo.internal.d.g
    public final void onAudioInputFormatChanged(io.odeeo.internal.b.t tVar, io.odeeo.internal.e.i iVar) {
        b.a aVarD = d();
        a(aVarD, 1010, new ks.h(aVarD, tVar, iVar, 0));
    }

    @Override // io.odeeo.internal.f.g
    public final void onDrmSessionAcquired(int i10, t.a aVar, int i11) {
        b.a aVarA = a(i10, aVar);
        a(aVarA, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new ks.b(aVarA, i11, 3));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onRenderedFirstFrame(Object obj, long j10) {
        b.a aVarD = d();
        a(aVarD, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new k(aVarD, obj, j10, 0));
    }

    @Override // io.odeeo.internal.r0.l
    public final void onVideoInputFormatChanged(io.odeeo.internal.b.t tVar, io.odeeo.internal.e.i iVar) {
        b.a aVarD = d();
        a(aVarD, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new ks.h(aVarD, tVar, iVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(l0 l0Var, b bVar, io.odeeo.internal.q0.l lVar) {
        bVar.onEvents(l0Var, new b.C0596b(lVar, this.f63275e));
    }

    public final void e() {
        b.a aVarA = a();
        a(aVarA, IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, new ks.l(aVarA, 6));
        this.f63276f.release();
    }

    public static /* synthetic */ void b(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.onVideoDecoderInitialized(aVar, str, j10);
        bVar.onVideoDecoderInitialized(aVar, str, j11, j10);
        bVar.onDecoderInitialized(aVar, 2, str, j10);
    }

    public static /* synthetic */ void a(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.onAudioDecoderInitialized(aVar, str, j10);
        bVar.onAudioDecoderInitialized(aVar, str, j11, j10);
        bVar.onDecoderInitialized(aVar, 1, str, j10);
    }

    public static /* synthetic */ void b(b.a aVar, io.odeeo.internal.b.t tVar, io.odeeo.internal.e.i iVar, b bVar) {
        bVar.onVideoInputFormatChanged(aVar, tVar);
        bVar.onVideoInputFormatChanged(aVar, tVar, iVar);
        bVar.onDecoderInputFormatChanged(aVar, 2, tVar);
    }

    public static /* synthetic */ void a(b.a aVar, io.odeeo.internal.b.t tVar, io.odeeo.internal.e.i iVar, b bVar) {
        bVar.onAudioInputFormatChanged(aVar, tVar);
        bVar.onAudioInputFormatChanged(aVar, tVar, iVar);
        bVar.onDecoderInputFormatChanged(aVar, 1, tVar);
    }

    public final b.a d() {
        return a(this.f63274d.getReadingMediaPeriod());
    }

    public final b.a c() {
        return a(this.f63274d.getPlayingMediaPeriod());
    }

    public static /* synthetic */ void a(b.a aVar, e eVar, b bVar) {
        bVar.onAudioDisabled(aVar, eVar);
        bVar.onDecoderDisabled(aVar, 1, eVar);
    }

    public static /* synthetic */ void b(b.a aVar, int i10, b bVar) {
        bVar.onDrmSessionAcquired(aVar);
        bVar.onDrmSessionAcquired(aVar, i10);
    }

    public static /* synthetic */ void a(b.a aVar, io.odeeo.internal.r0.m mVar, b bVar) {
        bVar.onVideoSizeChanged(aVar, mVar);
        bVar.onVideoSizeChanged(aVar, mVar.f66224a, mVar.f66225b, mVar.f66226c, mVar.f66227d);
    }

    public final b.a b() {
        return a(this.f63274d.getLoadingMediaPeriod());
    }

    public static /* synthetic */ void a(b.a aVar, boolean z10, b bVar) {
        bVar.onLoadingChanged(aVar, z10);
        bVar.onIsLoadingChanged(aVar, z10);
    }

    public static /* synthetic */ void a(b.a aVar, int i10, l0.f fVar, l0.f fVar2, b bVar) {
        bVar.onPositionDiscontinuity(aVar, i10);
        bVar.onPositionDiscontinuity(aVar, fVar, fVar2, i10);
    }

    public final void a(b.a aVar, int i10, o.a<b> aVar2) {
        this.f63275e.put(i10, aVar);
        this.f63276f.sendEvent(i10, aVar2);
    }

    public final b.a a() {
        return a(this.f63274d.getCurrentPlayerMediaPeriod());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.odeeo.internal.c.b.a a(io.odeeo.internal.b.y0 r17, int r18, io.odeeo.internal.a0.t.a r19) {
        /*
            r16 = this;
            r0 = r16
            r4 = r17
            r5 = r18
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lf
            r1 = 0
            r6 = r1
            goto L11
        Lf:
            r6 = r19
        L11:
            io.odeeo.internal.q0.d r1 = r0.f63271a
            long r2 = r1.elapsedRealtime()
            io.odeeo.internal.b.l0 r1 = r0.f63277g
            io.odeeo.internal.b.y0 r1 = r1.getCurrentTimeline()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L2d
            io.odeeo.internal.b.l0 r1 = r0.f63277g
            int r1 = r1.getCurrentMediaItemIndex()
            if (r5 != r1) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r6 == 0) goto L53
            boolean r7 = r6.isAd()
            if (r7 == 0) goto L53
            if (r1 == 0) goto L62
            io.odeeo.internal.b.l0 r1 = r0.f63277g
            int r1 = r1.getCurrentAdGroupIndex()
            int r7 = r6.f62448b
            if (r1 != r7) goto L62
            io.odeeo.internal.b.l0 r1 = r0.f63277g
            int r1 = r1.getCurrentAdIndexInAdGroup()
            int r7 = r6.f62449c
            if (r1 != r7) goto L62
            io.odeeo.internal.b.l0 r1 = r0.f63277g
            long r7 = r1.getCurrentPosition()
            goto L6f
        L53:
            if (r1 == 0) goto L5c
            io.odeeo.internal.b.l0 r1 = r0.f63277g
            long r7 = r1.getContentPosition()
            goto L6f
        L5c:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L65
        L62:
            r7 = 0
            goto L6f
        L65:
            io.odeeo.internal.b.y0$d r1 = r0.f63273c
            io.odeeo.internal.b.y0$d r1 = r4.getWindow(r5, r1)
            long r7 = r1.getDefaultPositionMs()
        L6f:
            io.odeeo.internal.c.a$a r1 = r0.f63274d
            io.odeeo.internal.a0.t$a r11 = r1.getCurrentPlayerMediaPeriod()
            io.odeeo.internal.c.b$a r1 = new io.odeeo.internal.c.b$a
            io.odeeo.internal.b.l0 r9 = r0.f63277g
            io.odeeo.internal.b.y0 r9 = r9.getCurrentTimeline()
            io.odeeo.internal.b.l0 r10 = r0.f63277g
            int r10 = r10.getCurrentMediaItemIndex()
            io.odeeo.internal.b.l0 r12 = r0.f63277g
            long r12 = r12.getCurrentPosition()
            io.odeeo.internal.b.l0 r14 = r0.f63277g
            long r14 = r14.getTotalBufferedDuration()
            r1.<init>(r2, r4, r5, r6, r7, r9, r10, r11, r12, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.c.a.a(io.odeeo.internal.b.y0, int, io.odeeo.internal.a0.t$a):io.odeeo.internal.c.b$a");
    }

    public final b.a a(t.a aVar) {
        io.odeeo.internal.q0.a.checkNotNull(this.f63277g);
        y0 mediaPeriodIdTimeline = aVar == null ? null : this.f63274d.getMediaPeriodIdTimeline(aVar);
        if (aVar != null && mediaPeriodIdTimeline != null) {
            return a(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(aVar.f62447a, this.f63272b).f63077c, aVar);
        }
        int currentMediaItemIndex = this.f63277g.getCurrentMediaItemIndex();
        y0 currentTimeline = this.f63277g.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = y0.f63072a;
        }
        return a(currentTimeline, currentMediaItemIndex, (t.a) null);
    }

    public final b.a a(int i10, t.a aVar) {
        io.odeeo.internal.q0.a.checkNotNull(this.f63277g);
        if (aVar != null) {
            if (this.f63274d.getMediaPeriodIdTimeline(aVar) != null) {
                return a(aVar);
            }
            return a(y0.f63072a, i10, aVar);
        }
        y0 currentTimeline = this.f63277g.getCurrentTimeline();
        if (i10 >= currentTimeline.getWindowCount()) {
            currentTimeline = y0.f63072a;
        }
        return a(currentTimeline, i10, (t.a) null);
    }
}
