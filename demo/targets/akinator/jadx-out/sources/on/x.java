package on;

import android.os.Looper;
import android.util.SparseArray;
import ao.g0;
import ao.k0;
import ao.n0;
import ao.o0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.l0;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.a2;
import gn.b1;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.f1;
import gn.h1;
import gn.i1;
import gn.k2;
import gn.p0;
import gn.r1;
import gn.s0;
import gn.t1;
import gn.u0;
import gn.u1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.q0;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import nh.b5;
import nh.g5;
import nh.i7;
import nh.m5;
import nh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class x implements on.a {

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f79686b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f79687c;

    /* renamed from: e, reason: collision with root package name */
    public final t1 f79688e;

    /* renamed from: f, reason: collision with root package name */
    public final a f79689f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f79690g;

    /* renamed from: h, reason: collision with root package name */
    public io.bidmachine.media3.common.util.y f79691h;

    /* renamed from: i, reason: collision with root package name */
    public i1 f79692i;

    /* renamed from: j, reason: collision with root package name */
    public io.bidmachine.media3.common.util.v f79693j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79694k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final r1 f79695a;

        /* renamed from: b, reason: collision with root package name */
        public b5 f79696b = b5.of();

        /* renamed from: c, reason: collision with root package name */
        public m5 f79697c = m5.of();

        /* renamed from: d, reason: collision with root package name */
        public k0 f79698d;

        /* renamed from: e, reason: collision with root package name */
        public k0 f79699e;

        /* renamed from: f, reason: collision with root package name */
        public k0 f79700f;

        public a(r1 r1Var) {
            this.f79695a = r1Var;
        }

        public static k0 b(i1 i1Var, b5 b5Var, k0 k0Var, r1 r1Var) {
            u1 currentTimeline = i1Var.getCurrentTimeline();
            int currentPeriodIndex = i1Var.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (i1Var.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, r1Var).getAdGroupIndexAfterPositionUs(a1.msToUs(i1Var.getCurrentPosition()) - r1Var.getPositionInWindowUs());
            for (int i10 = 0; i10 < b5Var.size(); i10++) {
                k0 k0Var2 = (k0) b5Var.get(i10);
                if (c(k0Var2, uidOfPeriod, i1Var.isPlayingAd(), i1Var.getCurrentAdGroupIndex(), i1Var.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return k0Var2;
                }
            }
            if (b5Var.isEmpty() && k0Var != null && c(k0Var, uidOfPeriod, i1Var.isPlayingAd(), i1Var.getCurrentAdGroupIndex(), i1Var.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return k0Var;
            }
            return null;
        }

        public static boolean c(k0 k0Var, Object obj, boolean z10, int i10, int i11, int i12) {
            Object obj2 = k0Var.f7718a;
            int i13 = k0Var.f7719b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z10 && i13 == i10 && k0Var.f7720c == i11) {
                return true;
            }
            return !z10 && i13 == -1 && k0Var.f7722e == i12;
        }

        public final void a(g5 g5Var, k0 k0Var, u1 u1Var) {
            if (k0Var == null) {
                return;
            }
            if (u1Var.getIndexOfPeriod(k0Var.f7718a) != -1) {
                g5Var.put(k0Var, u1Var);
                return;
            }
            u1 u1Var2 = (u1) this.f79697c.get(k0Var);
            if (u1Var2 != null) {
                g5Var.put(k0Var, u1Var2);
            }
        }

        public final void d(u1 u1Var) {
            g5 g5VarBuilder = m5.builder();
            if (this.f79696b.isEmpty()) {
                a(g5VarBuilder, this.f79699e, u1Var);
                if (!Objects.equals(this.f79700f, this.f79699e)) {
                    a(g5VarBuilder, this.f79700f, u1Var);
                }
                if (!Objects.equals(this.f79698d, this.f79699e) && !Objects.equals(this.f79698d, this.f79700f)) {
                    a(g5VarBuilder, this.f79698d, u1Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f79696b.size(); i10++) {
                    a(g5VarBuilder, (k0) this.f79696b.get(i10), u1Var);
                }
                if (!this.f79696b.contains(this.f79698d)) {
                    a(g5VarBuilder, this.f79698d, u1Var);
                }
            }
            this.f79697c = g5VarBuilder.buildOrThrow();
        }

        public k0 getCurrentPlayerMediaPeriod() {
            return this.f79698d;
        }

        public k0 getLoadingMediaPeriod() {
            if (this.f79696b.isEmpty()) {
                return null;
            }
            return (k0) i7.getLast(this.f79696b);
        }

        public u1 getMediaPeriodIdTimeline(k0 k0Var) {
            return (u1) this.f79697c.get(k0Var);
        }

        public k0 getPlayingMediaPeriod() {
            return this.f79699e;
        }

        public k0 getReadingMediaPeriod() {
            return this.f79700f;
        }

        public void onPositionDiscontinuity(i1 i1Var) {
            this.f79698d = b(i1Var, this.f79696b, this.f79699e, this.f79695a);
        }

        public void onQueueUpdated(List<k0> list, k0 k0Var, i1 i1Var) {
            this.f79696b = b5.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f79699e = list.get(0);
                this.f79700f = (k0) io.bidmachine.media3.common.util.a.checkNotNull(k0Var);
            }
            if (this.f79698d == null) {
                this.f79698d = b(i1Var, this.f79696b, this.f79699e, this.f79695a);
            }
            d(i1Var.getCurrentTimeline());
        }

        public void onTimelineChanged(i1 i1Var) {
            this.f79698d = b(i1Var, this.f79696b, this.f79699e, this.f79695a);
            d(i1Var.getCurrentTimeline());
        }
    }

    public x(io.bidmachine.media3.common.util.g gVar) {
        this.f79686b = (io.bidmachine.media3.common.util.g) io.bidmachine.media3.common.util.a.checkNotNull(gVar);
        this.f79691h = new io.bidmachine.media3.common.util.y(a1.getCurrentOrMainLooper(), gVar, new n1(24));
        r1 r1Var = new r1();
        this.f79687c = r1Var;
        this.f79688e = new t1();
        this.f79689f = new a(r1Var);
        this.f79690g = new SparseArray();
    }

    public final b a() {
        return b(this.f79689f.getCurrentPlayerMediaPeriod());
    }

    @Override // on.a
    public void addListener(d dVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(dVar);
        this.f79691h.add(dVar);
    }

    public final b b(k0 k0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(this.f79692i);
        u1 mediaPeriodIdTimeline = k0Var == null ? null : this.f79689f.getMediaPeriodIdTimeline(k0Var);
        if (k0Var != null && mediaPeriodIdTimeline != null) {
            return c(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(k0Var.f7718a, this.f79687c).f58110c, k0Var);
        }
        int currentMediaItemIndex = this.f79692i.getCurrentMediaItemIndex();
        u1 currentTimeline = this.f79692i.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = u1.f58195a;
        }
        return c(currentTimeline, currentMediaItemIndex, null);
    }

    public final b c(u1 u1Var, int i10, k0 k0Var) {
        k0 k0Var2 = u1Var.isEmpty() ? null : k0Var;
        long jElapsedRealtime = ((q0) this.f79686b).elapsedRealtime();
        boolean z10 = u1Var.equals(this.f79692i.getCurrentTimeline()) && i10 == this.f79692i.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (k0Var2 == null || !k0Var2.isAd()) {
            if (z10) {
                defaultPositionMs = this.f79692i.getContentPosition();
            } else if (!u1Var.isEmpty()) {
                defaultPositionMs = u1Var.getWindow(i10, this.f79688e).getDefaultPositionMs();
            }
        } else if (z10 && this.f79692i.getCurrentAdGroupIndex() == k0Var2.f7719b && this.f79692i.getCurrentAdIndexInAdGroup() == k0Var2.f7720c) {
            defaultPositionMs = this.f79692i.getCurrentPosition();
        }
        return new b(jElapsedRealtime, u1Var, i10, k0Var2, defaultPositionMs, this.f79692i.getCurrentTimeline(), this.f79692i.getCurrentMediaItemIndex(), this.f79689f.getCurrentPlayerMediaPeriod(), this.f79692i.getCurrentPosition(), this.f79692i.getTotalBufferedDuration());
    }

    public final b d(int i10, k0 k0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(this.f79692i);
        if (k0Var != null) {
            return this.f79689f.getMediaPeriodIdTimeline(k0Var) != null ? b(k0Var) : c(u1.f58195a, i10, k0Var);
        }
        u1 currentTimeline = this.f79692i.getCurrentTimeline();
        if (i10 >= currentTimeline.getWindowCount()) {
            currentTimeline = u1.f58195a;
        }
        return c(currentTimeline, i10, null);
    }

    public final b e() {
        return b(this.f79689f.getReadingMediaPeriod());
    }

    public final void f(b bVar, int i10, io.bidmachine.media3.common.util.w wVar) {
        this.f79690g.put(i10, bVar);
        this.f79691h.sendEvent(i10, wVar);
    }

    @Override // on.a
    public final void notifySeekStarted() {
        if (this.f79694k) {
            return;
        }
        b bVarA = a();
        this.f79694k = true;
        f(bVarA, -1, new j(bVarA, 2));
    }

    @Override // on.a, gn.g1
    public final void onAudioAttributesChanged(gn.h hVar) {
        b bVarE = e();
        f(bVarE, 20, new ks.s(13, bVarE, hVar));
    }

    @Override // on.a
    public final void onAudioCodecError(Exception exc) {
        b bVarE = e();
        f(bVarE, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new p(bVarE, exc, 1));
    }

    @Override // on.a
    public final void onAudioDecoderInitialized(String str, long j10, long j11) {
        b bVarE = e();
        f(bVarE, 1008, new v(bVarE, str, j11, j10, 0));
    }

    @Override // on.a
    public final void onAudioDecoderReleased(String str) {
        b bVarE = e();
        f(bVarE, TTAdConstant.IMAGE_MODE_1012, new o(bVarE, str, 0));
    }

    @Override // on.a
    public final void onAudioDisabled(io.bidmachine.media3.exoplayer.j jVar) {
        b bVarB = b(this.f79689f.getPlayingMediaPeriod());
        f(bVarB, C3227g4.f36755i, new m(bVarB, jVar, 3));
    }

    @Override // on.a
    public final void onAudioEnabled(io.bidmachine.media3.exoplayer.j jVar) {
        b bVarE = e();
        f(bVarE, 1007, new m(bVarE, jVar, 2));
    }

    @Override // on.a
    public final void onAudioInputFormatChanged(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.k kVar) {
        b bVarE = e();
        f(bVarE, 1009, new f(bVarE, bVar, kVar, 0));
    }

    @Override // on.a
    public final void onAudioPositionAdvancing(long j10) {
        b bVarE = e();
        f(bVarE, 1010, new t(bVarE, j10, 1));
    }

    @Override // on.a, gn.g1
    public final void onAudioSessionIdChanged(int i10) {
        b bVarE = e();
        f(bVarE, 21, new n(bVarE, i10, 5));
    }

    @Override // on.a
    public final void onAudioSinkError(Exception exc) {
        b bVarE = e();
        f(bVarE, C3227g4.f36756j, new p(bVarE, exc, 2));
    }

    @Override // on.a
    public void onAudioTrackInitialized(io.bidmachine.media3.exoplayer.audio.p pVar) {
        b bVarE = e();
        f(bVarE, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new r(bVarE, pVar, 1));
    }

    @Override // on.a
    public void onAudioTrackReleased(io.bidmachine.media3.exoplayer.audio.p pVar) {
        b bVarE = e();
        f(bVarE, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new r(bVarE, pVar, 0));
    }

    @Override // on.a
    public final void onAudioUnderrun(int i10, long j10, long j11) {
        b bVarE = e();
        f(bVarE, 1011, new k(bVarE, i10, j10, j11, 0));
    }

    @Override // on.a, gn.g1
    public void onAvailableCommandsChanged(e1 e1Var) {
        b bVarA = a();
        f(bVarA, 13, new ks.s(15, bVarA, e1Var));
    }

    @Override // on.a, go.e
    public final void onBandwidthSample(int i10, long j10, long j11) {
        b bVarB = b(this.f79689f.getLoadingMediaPeriod());
        f(bVarB, 1006, new k(bVarB, i10, j10, j11, 1));
    }

    @Override // on.a, gn.g1
    public void onCues(List<in.b> list) {
        b bVarA = a();
        f(bVarA, 27, new ks.s(14, bVarA, list));
    }

    @Override // on.a, gn.g1
    public void onDeviceInfoChanged(gn.q qVar) {
        b bVarA = a();
        f(bVarA, 29, new ks.s(11, bVarA, qVar));
    }

    @Override // on.a, gn.g1
    public void onDeviceVolumeChanged(int i10, boolean z10) {
        b bVarA = a();
        f(bVarA, 30, new l(bVarA, i10, z10));
    }

    @Override // on.a, ao.s0
    public final void onDownstreamFormatChanged(int i10, k0 k0Var, g0 g0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, 1004, new i(bVarD, g0Var, 1));
    }

    @Override // on.a, sn.r
    public final void onDrmKeysLoaded(int i10, k0 k0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new j(bVarD, 4));
    }

    @Override // on.a, sn.r
    public final void onDrmKeysRemoved(int i10, k0 k0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new j(bVarD, 3));
    }

    @Override // on.a, sn.r
    public final void onDrmKeysRestored(int i10, k0 k0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new j(bVarD, 0));
    }

    @Override // on.a, sn.r
    public final void onDrmSessionAcquired(int i10, k0 k0Var, int i11) {
        b bVarD = d(i10, k0Var);
        f(bVarD, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new n(bVarD, i11, 2));
    }

    @Override // on.a, sn.r
    public final void onDrmSessionManagerError(int i10, k0 k0Var, Exception exc) {
        b bVarD = d(i10, k0Var);
        f(bVarD, 1024, new p(bVarD, exc, 3));
    }

    @Override // on.a, sn.r
    public final void onDrmSessionReleased(int i10, k0 k0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new j(bVarD, 1));
    }

    @Override // on.a
    public final void onDroppedFrames(int i10, long j10) {
        b bVarB = b(this.f79689f.getPlayingMediaPeriod());
        f(bVarB, 1018, new h(bVarB, i10, j10));
    }

    @Override // on.a, gn.g1
    public final void onIsLoadingChanged(boolean z10) {
        b bVarA = a();
        f(bVarA, 3, new u(bVarA, 2, z10));
    }

    @Override // on.a, gn.g1
    public void onIsPlayingChanged(boolean z10) {
        b bVarA = a();
        f(bVarA, 7, new u(bVarA, 3, z10));
    }

    @Override // on.a, ao.s0
    public final void onLoadCanceled(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, 1002, new q(bVarD, b0Var, g0Var, 0));
    }

    @Override // on.a, ao.s0
    public final void onLoadCompleted(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, 1001, new q(bVarD, b0Var, g0Var, 1));
    }

    @Override // on.a, ao.s0
    public final void onLoadError(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var, IOException iOException, boolean z10) {
        b bVarD = d(i10, k0Var);
        f(bVarD, IronSourceError.AUCTION_ERROR_DECRYPTION, new n0(bVarD, b0Var, g0Var, iOException, z10, 2));
    }

    @Override // on.a, ao.s0
    public final void onLoadStarted(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var, int i11) {
        b bVarD = d(i10, k0Var);
        f(bVarD, 1000, new o0(bVarD, b0Var, g0Var, i11, 2));
    }

    @Override // on.a, gn.g1
    public void onMaxSeekToPreviousPositionChanged(long j10) {
        b bVarA = a();
        f(bVarA, 18, new t(bVarA, j10, 0));
    }

    @Override // on.a, gn.g1
    public final void onMediaItemTransition(p0 p0Var, int i10) {
        b bVarA = a();
        f(bVarA, 1, new l0(bVarA, p0Var, i10, 4));
    }

    @Override // on.a, gn.g1
    public void onMediaMetadataChanged(s0 s0Var) {
        b bVarA = a();
        f(bVarA, 14, new e(bVarA, s0Var, 0));
    }

    @Override // on.a, gn.g1
    public final void onMetadata(u0 u0Var) {
        b bVarA = a();
        f(bVarA, 28, new ks.s(10, bVarA, u0Var));
    }

    @Override // on.a, gn.g1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        b bVarA = a();
        f(bVarA, 5, new l(bVarA, i10, 1, z10));
    }

    @Override // on.a, gn.g1
    public final void onPlaybackParametersChanged(c1 c1Var) {
        b bVarA = a();
        f(bVarA, 12, new ks.s(8, bVarA, c1Var));
    }

    @Override // on.a, gn.g1
    public final void onPlaybackStateChanged(int i10) {
        b bVarA = a();
        f(bVarA, 4, new n(bVarA, i10, 3));
    }

    @Override // on.a, gn.g1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        b bVarA = a();
        f(bVarA, 6, new n(bVarA, i10, 4));
    }

    @Override // on.a, gn.g1
    public final void onPlayerError(b1 b1Var) {
        k0 k0Var;
        b bVarA = (!(b1Var instanceof io.bidmachine.media3.exoplayer.a0) || (k0Var = ((io.bidmachine.media3.exoplayer.a0) b1Var).f60878q) == null) ? a() : b(k0Var);
        f(bVarA, 10, new g(bVarA, b1Var, 1));
    }

    @Override // on.a, gn.g1
    public void onPlayerErrorChanged(b1 b1Var) {
        k0 k0Var;
        b bVarA = (!(b1Var instanceof io.bidmachine.media3.exoplayer.a0) || (k0Var = ((io.bidmachine.media3.exoplayer.a0) b1Var).f60878q) == null) ? a() : b(k0Var);
        f(bVarA, 10, new g(bVarA, b1Var, 0));
    }

    @Override // on.a, gn.g1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        b bVarA = a();
        f(bVarA, -1, new l(bVarA, i10, 2, z10));
    }

    @Override // on.a, gn.g1
    public void onPlaylistMetadataChanged(s0 s0Var) {
        b bVarA = a();
        f(bVarA, 15, new e(bVarA, s0Var, 1));
    }

    @Override // on.a, gn.g1
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // on.a
    public final void onRenderedFirstFrame(Object obj, long j10) {
        b bVarE = e();
        f(bVarE, 26, new ks.k(bVarE, obj, j10, 1));
    }

    @Override // on.a
    public void onRendererReadyChanged(final int i10, final int i11, final boolean z10) {
        final b bVarE = e();
        f(bVarE, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new io.bidmachine.media3.common.util.w() { // from class: on.s
            @Override // io.bidmachine.media3.common.util.w
            public final void invoke(Object obj) {
                ((c0) ((d) obj)).onRendererReadyChanged(bVarE, i10, i11, z10);
            }
        });
    }

    @Override // on.a, gn.g1
    public final void onRepeatModeChanged(int i10) {
        b bVarA = a();
        f(bVarA, 8, new n(bVarA, i10, 1));
    }

    @Override // on.a, gn.g1
    public void onSeekBackIncrementChanged(long j10) {
        b bVarA = a();
        f(bVarA, 16, new t(bVarA, j10, 3));
    }

    @Override // on.a, gn.g1
    public void onSeekForwardIncrementChanged(long j10) {
        b bVarA = a();
        f(bVarA, 17, new t(bVarA, j10, 2));
    }

    @Override // on.a, gn.g1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b bVarA = a();
        f(bVarA, 9, new u(bVarA, 0, z10));
    }

    @Override // on.a, gn.g1
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        b bVarE = e();
        f(bVarE, 23, new u(bVarE, 1, z10));
    }

    @Override // on.a, gn.g1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        b bVarE = e();
        f(bVarE, 24, new ks.g(i10, i11, 1, bVarE));
    }

    @Override // on.a, gn.g1
    public final void onTimelineChanged(u1 u1Var, int i10) {
        this.f79689f.onTimelineChanged((i1) io.bidmachine.media3.common.util.a.checkNotNull(this.f79692i));
        b bVarA = a();
        f(bVarA, 0, new n(bVarA, i10, 0));
    }

    @Override // on.a, gn.g1
    public void onTrackSelectionParametersChanged(a2 a2Var) {
        b bVarA = a();
        f(bVarA, 19, new ks.s(12, bVarA, a2Var));
    }

    @Override // on.a, gn.g1
    public void onTracksChanged(b2 b2Var) {
        b bVarA = a();
        f(bVarA, 2, new ks.s(9, bVarA, b2Var));
    }

    @Override // on.a, ao.s0
    public final void onUpstreamDiscarded(int i10, k0 k0Var, g0 g0Var) {
        b bVarD = d(i10, k0Var);
        f(bVarD, 1005, new i(bVarD, g0Var, 0));
    }

    @Override // on.a
    public final void onVideoCodecError(Exception exc) {
        b bVarE = e();
        f(bVarE, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new p(bVarE, exc, 0));
    }

    @Override // on.a
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
        b bVarE = e();
        f(bVarE, C3227g4.f36758l, new v(bVarE, str, j11, j10, 1));
    }

    @Override // on.a
    public final void onVideoDecoderReleased(String str) {
        b bVarE = e();
        f(bVarE, 1019, new o(bVarE, str, 1));
    }

    @Override // on.a
    public final void onVideoDisabled(io.bidmachine.media3.exoplayer.j jVar) {
        b bVarB = b(this.f79689f.getPlayingMediaPeriod());
        f(bVarB, 1020, new m(bVarB, jVar, 1));
    }

    @Override // on.a
    public final void onVideoEnabled(io.bidmachine.media3.exoplayer.j jVar) {
        b bVarE = e();
        f(bVarE, 1015, new m(bVarE, jVar, 0));
    }

    @Override // on.a
    public final void onVideoFrameProcessingOffset(long j10, int i10) {
        b bVarB = b(this.f79689f.getPlayingMediaPeriod());
        f(bVarB, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new h(bVarB, j10, i10));
    }

    @Override // on.a
    public final void onVideoInputFormatChanged(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.k kVar) {
        b bVarE = e();
        f(bVarE, 1017, new f(bVarE, bVar, kVar, 1));
    }

    @Override // on.a, gn.g1
    public final void onVideoSizeChanged(k2 k2Var) {
        b bVarE = e();
        f(bVarE, 25, new ks.s(6, bVarE, k2Var));
    }

    @Override // on.a, gn.g1
    public final void onVolumeChanged(float f10) {
        b bVarE = e();
        f(bVarE, 22, new ks.i(bVarE, f10, 1));
    }

    @Override // on.a
    public void release() {
        ((io.bidmachine.media3.common.util.v) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f79693j)).post(new w(this, 0));
    }

    @Override // on.a
    public void removeListener(d dVar) {
        this.f79691h.remove(dVar);
    }

    @Override // on.a
    public void setPlayer(i1 i1Var, Looper looper) {
        io.bidmachine.media3.common.util.a.checkState(this.f79692i == null || this.f79689f.f79696b.isEmpty());
        this.f79692i = (i1) io.bidmachine.media3.common.util.a.checkNotNull(i1Var);
        this.f79693j = ((q0) this.f79686b).createHandler(looper, null);
        this.f79691h = this.f79691h.copy(looper, new ks.s(7, this, i1Var));
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.f79691h.setThrowsWhenUsingWrongThread(z10);
    }

    @Override // on.a
    public final void updateMediaPeriodQueueInfo(List<k0> list, k0 k0Var) {
        this.f79689f.onQueueUpdated(list, k0Var, (i1) io.bidmachine.media3.common.util.a.checkNotNull(this.f79692i));
    }

    @Override // on.a, gn.g1
    public final void onPositionDiscontinuity(h1 h1Var, h1 h1Var2, int i10) {
        if (i10 == 1) {
            this.f79694k = false;
        }
        this.f79689f.onPositionDiscontinuity((i1) io.bidmachine.media3.common.util.a.checkNotNull(this.f79692i));
        b bVarA = a();
        f(bVarA, 11, new o0(i10, 3, bVarA, h1Var, h1Var2));
    }

    @Override // on.a, gn.g1
    public void onCues(in.d dVar) {
        b bVarA = a();
        f(bVarA, 27, new ks.s(5, bVarA, dVar));
    }

    @Override // on.a, gn.g1
    public void onRenderedFirstFrame() {
    }

    @Override // on.a, gn.g1
    public void onLoadingChanged(boolean z10) {
    }

    @Override // on.a, gn.g1
    public void onEvents(i1 i1Var, f1 f1Var) {
    }
}
