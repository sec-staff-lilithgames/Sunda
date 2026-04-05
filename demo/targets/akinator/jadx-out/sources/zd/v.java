package zd;

import android.os.Looper;
import android.util.SparseArray;
import ao.n0;
import ao.o0;
import bf.d0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.j2;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o2;
import com.google.android.exoplayer2.q2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.d1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import mh.h1;
import nh.b5;
import nh.g5;
import nh.i7;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v implements zd.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.d f97871b;

    /* renamed from: c, reason: collision with root package name */
    public final k3 f97872c;

    /* renamed from: e, reason: collision with root package name */
    public final l3 f97873e;

    /* renamed from: f, reason: collision with root package name */
    public final a f97874f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f97875g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.util.c0 f97876h;

    /* renamed from: i, reason: collision with root package name */
    public r2 f97877i;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.util.z f97878j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f97879k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final k3 f97880a;

        /* renamed from: b, reason: collision with root package name */
        public b5 f97881b = b5.of();

        /* renamed from: c, reason: collision with root package name */
        public m5 f97882c = m5.of();

        /* renamed from: d, reason: collision with root package name */
        public d0 f97883d;

        /* renamed from: e, reason: collision with root package name */
        public d0 f97884e;

        /* renamed from: f, reason: collision with root package name */
        public d0 f97885f;

        public a(k3 k3Var) {
            this.f97880a = k3Var;
        }

        public static d0 b(r2 r2Var, b5 b5Var, d0 d0Var, k3 k3Var) {
            m3 currentTimeline = r2Var.getCurrentTimeline();
            int currentPeriodIndex = r2Var.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (r2Var.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, k3Var).getAdGroupIndexAfterPositionUs(n1.msToUs(r2Var.getCurrentPosition()) - k3Var.getPositionInWindowUs());
            for (int i10 = 0; i10 < b5Var.size(); i10++) {
                d0 d0Var2 = (d0) b5Var.get(i10);
                if (c(d0Var2, uidOfPeriod, r2Var.isPlayingAd(), r2Var.getCurrentAdGroupIndex(), r2Var.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return d0Var2;
                }
            }
            if (b5Var.isEmpty() && d0Var != null && c(d0Var, uidOfPeriod, r2Var.isPlayingAd(), r2Var.getCurrentAdGroupIndex(), r2Var.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return d0Var;
            }
            return null;
        }

        public static boolean c(d0 d0Var, Object obj, boolean z10, int i10, int i11, int i12) {
            Object obj2 = d0Var.f9193a;
            int i13 = d0Var.f9194b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z10 && i13 == i10 && d0Var.f9195c == i11) {
                return true;
            }
            return !z10 && i13 == -1 && d0Var.f9197e == i12;
        }

        public final void a(g5 g5Var, d0 d0Var, m3 m3Var) {
            if (d0Var == null) {
                return;
            }
            if (m3Var.getIndexOfPeriod(d0Var.f9193a) != -1) {
                g5Var.put(d0Var, m3Var);
                return;
            }
            m3 m3Var2 = (m3) this.f97882c.get(d0Var);
            if (m3Var2 != null) {
                g5Var.put(d0Var, m3Var2);
            }
        }

        public final void d(m3 m3Var) {
            g5 g5VarBuilder = m5.builder();
            if (this.f97881b.isEmpty()) {
                a(g5VarBuilder, this.f97884e, m3Var);
                if (!h1.equal(this.f97885f, this.f97884e)) {
                    a(g5VarBuilder, this.f97885f, m3Var);
                }
                if (!h1.equal(this.f97883d, this.f97884e) && !h1.equal(this.f97883d, this.f97885f)) {
                    a(g5VarBuilder, this.f97883d, m3Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f97881b.size(); i10++) {
                    a(g5VarBuilder, (d0) this.f97881b.get(i10), m3Var);
                }
                if (!this.f97881b.contains(this.f97883d)) {
                    a(g5VarBuilder, this.f97883d, m3Var);
                }
            }
            this.f97882c = g5VarBuilder.buildOrThrow();
        }

        public d0 getCurrentPlayerMediaPeriod() {
            return this.f97883d;
        }

        public d0 getLoadingMediaPeriod() {
            if (this.f97881b.isEmpty()) {
                return null;
            }
            return (d0) i7.getLast(this.f97881b);
        }

        public m3 getMediaPeriodIdTimeline(d0 d0Var) {
            return (m3) this.f97882c.get(d0Var);
        }

        public d0 getPlayingMediaPeriod() {
            return this.f97884e;
        }

        public d0 getReadingMediaPeriod() {
            return this.f97885f;
        }

        public void onPositionDiscontinuity(r2 r2Var) {
            this.f97883d = b(r2Var, this.f97881b, this.f97884e, this.f97880a);
        }

        public void onQueueUpdated(List<d0> list, d0 d0Var, r2 r2Var) {
            this.f97881b = b5.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f97884e = list.get(0);
                this.f97885f = (d0) com.google.android.exoplayer2.util.a.checkNotNull(d0Var);
            }
            if (this.f97883d == null) {
                this.f97883d = b(r2Var, this.f97881b, this.f97884e, this.f97880a);
            }
            d(r2Var.getCurrentTimeline());
        }

        public void onTimelineChanged(r2 r2Var) {
            this.f97883d = b(r2Var, this.f97881b, this.f97884e, this.f97880a);
            d(r2Var.getCurrentTimeline());
        }
    }

    public v(com.google.android.exoplayer2.util.d dVar) {
        this.f97871b = (com.google.android.exoplayer2.util.d) com.google.android.exoplayer2.util.a.checkNotNull(dVar);
        this.f97876h = new com.google.android.exoplayer2.util.c0(n1.getCurrentOrMainLooper(), dVar, new y3.f(3));
        k3 k3Var = new k3();
        this.f97872c = k3Var;
        this.f97873e = new l3();
        this.f97874f = new a(k3Var);
        this.f97875g = new SparseArray();
    }

    public final b a() {
        return b(this.f97874f.getCurrentPlayerMediaPeriod());
    }

    @Override // zd.a
    public void addListener(d dVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(dVar);
        this.f97876h.add(dVar);
    }

    public final b b(d0 d0Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(this.f97877i);
        m3 mediaPeriodIdTimeline = d0Var == null ? null : this.f97874f.getMediaPeriodIdTimeline(d0Var);
        if (d0Var != null && mediaPeriodIdTimeline != null) {
            return c(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(d0Var.f9193a, this.f97872c).f27598e, d0Var);
        }
        int currentMediaItemIndex = this.f97877i.getCurrentMediaItemIndex();
        m3 currentTimeline = this.f97877i.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = m3.f27695b;
        }
        return c(currentTimeline, currentMediaItemIndex, null);
    }

    public final b c(m3 m3Var, int i10, d0 d0Var) {
        d0 d0Var2 = m3Var.isEmpty() ? null : d0Var;
        long jElapsedRealtime = ((d1) this.f97871b).elapsedRealtime();
        boolean z10 = m3Var.equals(this.f97877i.getCurrentTimeline()) && i10 == this.f97877i.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (d0Var2 == null || !d0Var2.isAd()) {
            if (z10) {
                defaultPositionMs = this.f97877i.getContentPosition();
            } else if (!m3Var.isEmpty()) {
                defaultPositionMs = m3Var.getWindow(i10, this.f97873e).getDefaultPositionMs();
            }
        } else if (z10 && this.f97877i.getCurrentAdGroupIndex() == d0Var2.f9194b && this.f97877i.getCurrentAdIndexInAdGroup() == d0Var2.f9195c) {
            defaultPositionMs = this.f97877i.getCurrentPosition();
        }
        return new b(jElapsedRealtime, m3Var, i10, d0Var2, defaultPositionMs, this.f97877i.getCurrentTimeline(), this.f97877i.getCurrentMediaItemIndex(), this.f97874f.getCurrentPlayerMediaPeriod(), this.f97877i.getCurrentPosition(), this.f97877i.getTotalBufferedDuration());
    }

    public final b d(int i10, d0 d0Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(this.f97877i);
        if (d0Var != null) {
            return this.f97874f.getMediaPeriodIdTimeline(d0Var) != null ? b(d0Var) : c(m3.f27695b, i10, d0Var);
        }
        m3 currentTimeline = this.f97877i.getCurrentTimeline();
        if (i10 >= currentTimeline.getWindowCount()) {
            currentTimeline = m3.f27695b;
        }
        return c(currentTimeline, i10, null);
    }

    public final b e() {
        return b(this.f97874f.getReadingMediaPeriod());
    }

    public final void f(b bVar, int i10, com.google.android.exoplayer2.util.a0 a0Var) {
        this.f97875g.put(i10, bVar);
        this.f97876h.sendEvent(i10, a0Var);
    }

    @Override // zd.a
    public final void notifySeekStarted() {
        if (this.f97879k) {
            return;
        }
        b bVarA = a();
        this.f97879k = true;
        f(bVarA, -1, new n(bVarA, 0));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onAudioAttributesChanged(com.google.android.exoplayer2.audio.k kVar) {
        b bVarE = e();
        f(bVarE, 20, new ks.s(24, bVarE, kVar));
    }

    @Override // zd.a
    public final void onAudioCodecError(Exception exc) {
        b bVarE = e();
        f(bVarE, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new g(bVarE, exc, 1));
    }

    @Override // zd.a
    public final void onAudioDecoderInitialized(String str, long j10, long j11) {
        b bVarE = e();
        f(bVarE, 1008, new j(bVarE, str, j11, j10, 0));
    }

    @Override // zd.a
    public final void onAudioDecoderReleased(String str) {
        b bVarE = e();
        f(bVarE, TTAdConstant.IMAGE_MODE_1012, new s(bVarE, str, 0));
    }

    @Override // zd.a
    public final void onAudioDisabled(ce.f fVar) {
        b bVarB = b(this.f97874f.getPlayingMediaPeriod());
        f(bVarB, C3227g4.f36755i, new r(bVarB, fVar, 1));
    }

    @Override // zd.a
    public final void onAudioEnabled(ce.f fVar) {
        b bVarE = e();
        f(bVarE, 1007, new r(bVarE, fVar, 3));
    }

    @Override // zd.a
    public final void onAudioInputFormatChanged(z0 z0Var, ce.k kVar) {
        b bVarE = e();
        f(bVarE, 1009, new h(bVarE, z0Var, kVar, 0));
    }

    @Override // zd.a
    public final void onAudioPositionAdvancing(long j10) {
        b bVarE = e();
        f(bVarE, 1010, new e(bVarE, j10, 2));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onAudioSessionIdChanged(int i10) {
        b bVarE = e();
        f(bVarE, 21, new o(bVarE, i10, 0));
    }

    @Override // zd.a
    public final void onAudioSinkError(Exception exc) {
        b bVarE = e();
        f(bVarE, C3227g4.f36756j, new g(bVarE, exc, 2));
    }

    @Override // zd.a
    public final void onAudioUnderrun(int i10, long j10, long j11) {
        b bVarE = e();
        f(bVarE, 1011, new i(bVarE, i10, j10, j11, 0));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onAvailableCommandsChanged(n2 n2Var) {
        b bVarA = a();
        f(bVarA, 13, new ks.s(28, bVarA, n2Var));
    }

    @Override // zd.a, qf.f
    public final void onBandwidthSample(int i10, long j10, long j11) {
        b bVarB = b(this.f97874f.getLoadingMediaPeriod());
        f(bVarB, 1006, new i(bVarB, i10, j10, j11, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onCues(List<ef.b> list) {
        b bVarA = a();
        f(bVarA, 27, new t(0, bVarA, list));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onDeviceInfoChanged(com.google.android.exoplayer2.q qVar) {
        b bVarA = a();
        f(bVarA, 29, new t(2, bVarA, qVar));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onDeviceVolumeChanged(int i10, boolean z10) {
        b bVarA = a();
        f(bVarA, 30, new m(bVarA, i10, z10));
    }

    @Override // zd.a, bf.j0
    public final void onDownstreamFormatChanged(int i10, d0 d0Var, bf.y yVar) {
        b bVarD = d(i10, d0Var);
        f(bVarD, 1004, new p(bVarD, yVar, 0));
    }

    @Override // zd.a, de.q
    public final void onDrmKeysLoaded(int i10, d0 d0Var) {
        b bVarD = d(i10, d0Var);
        f(bVarD, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new n(bVarD, 1));
    }

    @Override // zd.a, de.q
    public final void onDrmKeysRemoved(int i10, d0 d0Var) {
        b bVarD = d(i10, d0Var);
        f(bVarD, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new n(bVarD, 5));
    }

    @Override // zd.a, de.q
    public final void onDrmKeysRestored(int i10, d0 d0Var) {
        b bVarD = d(i10, d0Var);
        f(bVarD, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new n(bVarD, 3));
    }

    @Override // zd.a, de.q
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, d0 d0Var) {
        super.onDrmSessionAcquired(i10, d0Var);
    }

    @Override // zd.a, de.q
    public final void onDrmSessionManagerError(int i10, d0 d0Var, Exception exc) {
        b bVarD = d(i10, d0Var);
        f(bVarD, 1024, new g(bVarD, exc, 3));
    }

    @Override // zd.a, de.q
    public final void onDrmSessionReleased(int i10, d0 d0Var) {
        b bVarD = d(i10, d0Var);
        f(bVarD, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new n(bVarD, 2));
    }

    @Override // zd.a
    public final void onDroppedFrames(int i10, long j10) {
        b bVarB = b(this.f97874f.getPlayingMediaPeriod());
        f(bVarB, 1018, new u(bVarB, i10, j10));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onIsLoadingChanged(boolean z10) {
        b bVarA = a();
        f(bVarA, 3, new f(bVarA, 3, z10));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onIsPlayingChanged(boolean z10) {
        b bVarA = a();
        f(bVarA, 7, new f(bVarA, 1, z10));
    }

    @Override // zd.a, bf.j0
    public final void onLoadCanceled(int i10, d0 d0Var, bf.t tVar, bf.y yVar) {
        b bVarD = d(i10, d0Var);
        f(bVarD, 1002, new l(bVarD, tVar, yVar, 2));
    }

    @Override // zd.a, bf.j0
    public final void onLoadCompleted(int i10, d0 d0Var, bf.t tVar, bf.y yVar) {
        b bVarD = d(i10, d0Var);
        f(bVarD, 1001, new l(bVarD, tVar, yVar, 0));
    }

    @Override // zd.a, bf.j0
    public final void onLoadError(int i10, d0 d0Var, bf.t tVar, bf.y yVar, IOException iOException, boolean z10) {
        b bVarD = d(i10, d0Var);
        f(bVarD, IronSourceError.AUCTION_ERROR_DECRYPTION, new n0(bVarD, tVar, yVar, iOException, z10, 3));
    }

    @Override // zd.a, bf.j0
    public final void onLoadStarted(int i10, d0 d0Var, bf.t tVar, bf.y yVar) {
        b bVarD = d(i10, d0Var);
        f(bVarD, 1000, new l(bVarD, tVar, yVar, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onMaxSeekToPreviousPositionChanged(long j10) {
        b bVarA = a();
        f(bVarA, 18, new e(bVarA, j10, 3));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onMediaItemTransition(u1 u1Var, int i10) {
        b bVarA = a();
        f(bVarA, 1, new l0(bVarA, u1Var, i10, 6));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onMediaMetadataChanged(w1 w1Var) {
        b bVarA = a();
        f(bVarA, 14, new k(bVarA, w1Var, 0));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onMetadata(Metadata metadata) {
        b bVarA = a();
        f(bVarA, 28, new t(3, bVarA, metadata));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        b bVarA = a();
        f(bVarA, 5, new m(bVarA, z10, i10, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onPlaybackParametersChanged(l2 l2Var) {
        b bVarA = a();
        f(bVarA, 12, new ks.s(25, bVarA, l2Var));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onPlaybackStateChanged(int i10) {
        b bVarA = a();
        f(bVarA, 4, new o(bVarA, i10, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        b bVarA = a();
        f(bVarA, 6, new o(bVarA, i10, 3));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onPlayerError(j2 j2Var) {
        bf.b0 b0Var;
        b bVarA = (!(j2Var instanceof com.google.android.exoplayer2.r) || (b0Var = ((com.google.android.exoplayer2.r) j2Var).f27959o) == null) ? a() : b(new d0(b0Var));
        f(bVarA, 10, new q(bVarA, j2Var, 0));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onPlayerErrorChanged(j2 j2Var) {
        bf.b0 b0Var;
        b bVarA = (!(j2Var instanceof com.google.android.exoplayer2.r) || (b0Var = ((com.google.android.exoplayer2.r) j2Var).f27959o) == null) ? a() : b(new d0(b0Var));
        f(bVarA, 10, new q(bVarA, j2Var, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onPlayerStateChanged(boolean z10, int i10) {
        b bVarA = a();
        f(bVarA, -1, new m(bVarA, z10, i10, 0));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onPlaylistMetadataChanged(w1 w1Var) {
        b bVarA = a();
        f(bVarA, 15, new k(bVarA, w1Var, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // zd.a
    public final void onRenderedFirstFrame(Object obj, long j10) {
        b bVarE = e();
        f(bVarE, 26, new ks.k(bVarE, obj, j10, 4));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onRepeatModeChanged(int i10) {
        b bVarA = a();
        f(bVarA, 8, new o(bVarA, i10, 2));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onSeekBackIncrementChanged(long j10) {
        b bVarA = a();
        f(bVarA, 16, new e(bVarA, j10, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onSeekForwardIncrementChanged(long j10) {
        b bVarA = a();
        f(bVarA, 17, new e(bVarA, j10, 0));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b bVarA = a();
        f(bVarA, 9, new f(bVarA, 2, z10));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        b bVarE = e();
        f(bVarE, 23, new f(bVarE, 0, z10));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onSurfaceSizeChanged(int i10, int i11) {
        b bVarE = e();
        f(bVarE, 24, new ks.g(i10, i11, 3, bVarE));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onTimelineChanged(m3 m3Var, int i10) {
        this.f97874f.onTimelineChanged((r2) com.google.android.exoplayer2.util.a.checkNotNull(this.f97877i));
        b bVarA = a();
        f(bVarA, 0, new o(bVarA, i10, 4));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onTrackSelectionParametersChanged(pf.s sVar) {
        b bVarA = a();
        f(bVarA, 19, new ks.s(29, bVarA, sVar));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onTracksChanged(n3 n3Var) {
        b bVarA = a();
        f(bVarA, 2, new t(1, bVarA, n3Var));
    }

    @Override // zd.a, bf.j0
    public final void onUpstreamDiscarded(int i10, d0 d0Var, bf.y yVar) {
        b bVarD = d(i10, d0Var);
        f(bVarD, 1005, new p(bVarD, yVar, 1));
    }

    @Override // zd.a
    public final void onVideoCodecError(Exception exc) {
        b bVarE = e();
        f(bVarE, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new g(bVarE, exc, 0));
    }

    @Override // zd.a
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
        b bVarE = e();
        f(bVarE, C3227g4.f36758l, new j(bVarE, str, j11, j10, 1));
    }

    @Override // zd.a
    public final void onVideoDecoderReleased(String str) {
        b bVarE = e();
        f(bVarE, 1019, new s(bVarE, str, 1));
    }

    @Override // zd.a
    public final void onVideoDisabled(ce.f fVar) {
        b bVarB = b(this.f97874f.getPlayingMediaPeriod());
        f(bVarB, 1020, new r(bVarB, fVar, 2));
    }

    @Override // zd.a
    public final void onVideoEnabled(ce.f fVar) {
        b bVarE = e();
        f(bVarE, 1015, new r(bVarE, fVar, 0));
    }

    @Override // zd.a
    public final void onVideoFrameProcessingOffset(long j10, int i10) {
        b bVarB = b(this.f97874f.getPlayingMediaPeriod());
        f(bVarB, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new u(bVarB, j10, i10));
    }

    @Override // zd.a
    public final void onVideoInputFormatChanged(z0 z0Var, ce.k kVar) {
        b bVarE = e();
        f(bVarE, 1017, new h(bVarE, z0Var, kVar, 1));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onVideoSizeChanged(sf.x xVar) {
        b bVarE = e();
        f(bVarE, 25, new t(4, bVarE, xVar));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onVolumeChanged(float f10) {
        b bVarE = e();
        f(bVarE, 22, new ks.i(bVarE, f10, 2));
    }

    @Override // zd.a
    public void release() {
        ((com.google.android.exoplayer2.util.z) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f97878j)).post(new on.w(this, 29));
    }

    @Override // zd.a
    public void removeListener(d dVar) {
        this.f97876h.remove(dVar);
    }

    @Override // zd.a
    public void setPlayer(r2 r2Var, Looper looper) {
        com.google.android.exoplayer2.util.a.checkState(this.f97877i == null || this.f97874f.f97881b.isEmpty());
        this.f97877i = (r2) com.google.android.exoplayer2.util.a.checkNotNull(r2Var);
        this.f97878j = ((d1) this.f97871b).createHandler(looper, null);
        this.f97876h = this.f97876h.copy(looper, new ks.s(26, this, r2Var));
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.f97876h.setThrowsWhenUsingWrongThread(z10);
    }

    @Override // zd.a
    public final void updateMediaPeriodQueueInfo(List<d0> list, d0 d0Var) {
        this.f97874f.onQueueUpdated(list, d0Var, (r2) com.google.android.exoplayer2.util.a.checkNotNull(this.f97877i));
    }

    @Override // zd.a, de.q
    public final void onDrmSessionAcquired(int i10, d0 d0Var, int i11) {
        b bVarD = d(i10, d0Var);
        f(bVarD, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new o(bVarD, i11, 5));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public final void onPositionDiscontinuity(q2 q2Var, q2 q2Var2, int i10) {
        if (i10 == 1) {
            this.f97879k = false;
        }
        this.f97874f.onPositionDiscontinuity((r2) com.google.android.exoplayer2.util.a.checkNotNull(this.f97877i));
        b bVarA = a();
        f(bVarA, 11, new o0(i10, 4, bVarA, q2Var, q2Var2));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onCues(ef.e eVar) {
        b bVarA = a();
        f(bVarA, 27, new ks.s(27, bVarA, eVar));
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onRenderedFirstFrame() {
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onLoadingChanged(boolean z10) {
    }

    @Override // zd.a, com.google.android.exoplayer2.p2
    public void onEvents(r2 r2Var, o2 o2Var) {
    }
}
