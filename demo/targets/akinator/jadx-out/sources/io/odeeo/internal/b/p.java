package io.odeeo.internal.b;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.f0;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.f0;
import io.odeeo.internal.b.j0;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.m0;
import io.odeeo.internal.b.o;
import io.odeeo.internal.b.p;
import io.odeeo.internal.b.q;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.q0.o;
import io.odeeo.internal.u0.h1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends d {
    public boolean A;
    public t0 B;
    public io.odeeo.internal.a0.f0 C;
    public boolean D;
    public l0.b E;
    public a0 F;
    public a0 G;
    public a0 H;
    public j0 I;
    public int J;
    public int K;
    public long L;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.n0.l f62874b;

    /* renamed from: c, reason: collision with root package name */
    public final l0.b f62875c;

    /* renamed from: d, reason: collision with root package name */
    public final p0[] f62876d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.n0.k f62877e;

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.q0.n f62878f;

    /* renamed from: g, reason: collision with root package name */
    public final q.f f62879g;

    /* renamed from: h, reason: collision with root package name */
    public final q f62880h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.q0.o<l0.c> f62881i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArraySet<o.b> f62882j;

    /* renamed from: k, reason: collision with root package name */
    public final y0.b f62883k;

    /* renamed from: l, reason: collision with root package name */
    public final List<a> f62884l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f62885m;

    /* renamed from: n, reason: collision with root package name */
    public final io.odeeo.internal.a0.v f62886n;

    /* renamed from: o, reason: collision with root package name */
    public final io.odeeo.internal.c.a f62887o;

    /* renamed from: p, reason: collision with root package name */
    public final Looper f62888p;

    /* renamed from: q, reason: collision with root package name */
    public final io.odeeo.internal.p0.d f62889q;

    /* renamed from: r, reason: collision with root package name */
    public final long f62890r;

    /* renamed from: s, reason: collision with root package name */
    public final long f62891s;

    /* renamed from: t, reason: collision with root package name */
    public final io.odeeo.internal.q0.d f62892t;

    /* renamed from: u, reason: collision with root package name */
    public int f62893u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f62894v;

    /* renamed from: w, reason: collision with root package name */
    public int f62895w;

    /* renamed from: x, reason: collision with root package name */
    public int f62896x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f62897y;

    /* renamed from: z, reason: collision with root package name */
    public int f62898z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f62899a;

        /* renamed from: b, reason: collision with root package name */
        public y0 f62900b;

        public a(Object obj, y0 y0Var) {
            this.f62899a = obj;
            this.f62900b = y0Var;
        }

        @Override // io.odeeo.internal.b.e0
        public y0 getTimeline() {
            return this.f62900b;
        }

        @Override // io.odeeo.internal.b.e0
        public Object getUid() {
            return this.f62899a;
        }
    }

    static {
        r.registerModule("goog.exo.exoplayer");
    }

    public p(p0[] p0VarArr, io.odeeo.internal.n0.k kVar, io.odeeo.internal.a0.v vVar, y yVar, io.odeeo.internal.p0.d dVar, io.odeeo.internal.c.a aVar, boolean z10, t0 t0Var, long j10, long j11, x xVar, long j12, boolean z11, io.odeeo.internal.q0.d dVar2, Looper looper, l0 l0Var, l0.b bVar) {
        io.odeeo.internal.q0.p.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.16.1] [" + io.odeeo.internal.q0.g0.f65865e + C3191e4.i.f36531e);
        int i10 = 1;
        io.odeeo.internal.q0.a.checkState(p0VarArr.length > 0);
        this.f62876d = (p0[]) io.odeeo.internal.q0.a.checkNotNull(p0VarArr);
        this.f62877e = (io.odeeo.internal.n0.k) io.odeeo.internal.q0.a.checkNotNull(kVar);
        this.f62886n = vVar;
        this.f62889q = dVar;
        this.f62887o = aVar;
        this.f62885m = z10;
        this.B = t0Var;
        this.f62890r = j10;
        this.f62891s = j11;
        this.D = z11;
        this.f62888p = looper;
        this.f62892t = dVar2;
        this.f62893u = 0;
        l0 l0Var2 = l0Var != null ? l0Var : this;
        this.f62881i = new io.odeeo.internal.q0.o<>(looper, dVar2, new ha.a(l0Var2, 12));
        this.f62882j = new CopyOnWriteArraySet<>();
        this.f62884l = new ArrayList();
        this.C = new f0.a(0);
        io.odeeo.internal.n0.l lVar = new io.odeeo.internal.n0.l(new r0[p0VarArr.length], new io.odeeo.internal.n0.d[p0VarArr.length], z0.f63197b, null);
        this.f62874b = lVar;
        this.f62883k = new y0.b();
        l0.b bVarBuild = new l0.b.a().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30).addIf(29, kVar.isSetParametersSupported()).addAll(bVar).build();
        this.f62875c = bVarBuild;
        this.E = new l0.b.a().addAll(bVarBuild).add(4).add(10).build();
        a0 a0Var = a0.H;
        this.F = a0Var;
        this.G = a0Var;
        this.H = a0Var;
        this.J = -1;
        this.f62878f = dVar2.createHandler(looper, null);
        is.k kVar2 = new is.k(this, i10);
        this.f62879g = kVar2;
        this.I = j0.createDummy(lVar);
        if (aVar != null) {
            aVar.setPlayer(l0Var2, looper);
            addListener(aVar);
            dVar.addEventListener(new Handler(looper), aVar);
        }
        this.f62880h = new q(p0VarArr, kVar, lVar, yVar, dVar, this.f62893u, this.f62894v, aVar, t0Var, xVar, j12, z11, looper, dVar2, kVar2);
    }

    public void addAudioOffloadListener(o.b bVar) {
        this.f62882j.add(bVar);
    }

    public void addEventListener(l0.c cVar) {
        this.f62881i.add(cVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void addListener(l0.e eVar) {
        addEventListener(eVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void addMediaItems(int i10, List<z> list) {
        addMediaSources(Math.min(i10, this.f62884l.size()), a(list));
    }

    public void addMediaSource(io.odeeo.internal.a0.t tVar) {
        addMediaSources(Collections.singletonList(tVar));
    }

    public void addMediaSources(List<io.odeeo.internal.a0.t> list) {
        addMediaSources(this.f62884l.size(), list);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurface() {
    }

    public m0 createMessage(m0.b bVar) {
        return new m0(this.f62880h, bVar, this.I.f62757a, getCurrentMediaItemIndex(), this.f62892t, this.f62880h.getPlaybackLooper());
    }

    public boolean experimentalIsSleepingForOffload() {
        return this.I.f62772p;
    }

    public void experimentalSetForegroundModeTimeoutMs(long j10) {
        this.f62880h.experimentalSetForegroundModeTimeoutMs(j10);
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        this.f62880h.experimentalSetOffloadSchedulingEnabled(z10);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public Looper getApplicationLooper() {
        return this.f62888p;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.d.d getAudioAttributes() {
        return io.odeeo.internal.d.d.f63334f;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public l0.b getAvailableCommands() {
        return this.E;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getBufferedPosition() {
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        j0 j0Var = this.I;
        return j0Var.f62767k.equals(j0Var.f62758b) ? io.odeeo.internal.q0.g0.usToMs(this.I.f62773q) : getDuration();
    }

    public io.odeeo.internal.q0.d getClock() {
        return this.f62892t;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getContentBufferedPosition() {
        if (this.I.f62757a.isEmpty()) {
            return this.L;
        }
        j0 j0Var = this.I;
        if (j0Var.f62767k.f62450d != j0Var.f62758b.f62450d) {
            return j0Var.f62757a.getWindow(getCurrentMediaItemIndex(), this.f62656a).getDurationMs();
        }
        long j10 = j0Var.f62773q;
        if (this.I.f62767k.isAd()) {
            j0 j0Var2 = this.I;
            y0.b periodByUid = j0Var2.f62757a.getPeriodByUid(j0Var2.f62767k.f62447a, this.f62883k);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.I.f62767k.f62448b);
            j10 = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.f63078d : adGroupTimeUs;
        }
        j0 j0Var3 = this.I;
        return io.odeeo.internal.q0.g0.usToMs(a(j0Var3.f62757a, j0Var3.f62767k, j10));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        j0 j0Var = this.I;
        j0Var.f62757a.getPeriodByUid(j0Var.f62758b.f62447a, this.f62883k);
        j0 j0Var2 = this.I;
        if (j0Var2.f62759c == C.TIME_UNSET) {
            return j0Var2.f62757a.getWindow(getCurrentMediaItemIndex(), this.f62656a).getDefaultPositionMs();
        }
        return io.odeeo.internal.q0.g0.usToMs(this.I.f62759c) + this.f62883k.getPositionInWindowMs();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.I.f62758b.f62448b;
        }
        return -1;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.I.f62758b.f62449c;
        }
        return -1;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentMediaItemIndex() {
        int iD = d();
        if (iD == -1) {
            return 0;
        }
        return iD;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentPeriodIndex() {
        if (this.I.f62757a.isEmpty()) {
            return this.K;
        }
        j0 j0Var = this.I;
        return j0Var.f62757a.getIndexOfPeriod(j0Var.f62758b.f62447a);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getCurrentPosition() {
        return io.odeeo.internal.q0.g0.usToMs(a(this.I));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public y0 getCurrentTimeline() {
        return this.I.f62757a;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.a0.l0 getCurrentTrackGroups() {
        return this.I.f62764h;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.n0.h getCurrentTrackSelections() {
        return new io.odeeo.internal.n0.h(this.I.f62765i.f65057c);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public z0 getCurrentTracksInfo() {
        return this.I.f62765i.f65058d;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public m getDeviceInfo() {
        return m.f62813d;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getDeviceVolume() {
        return 0;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getDuration() {
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        j0 j0Var = this.I;
        t.a aVar = j0Var.f62758b;
        j0Var.f62757a.getPeriodByUid(aVar.f62447a, this.f62883k);
        return io.odeeo.internal.q0.g0.usToMs(this.f62883k.getAdDurationUs(aVar.f62448b, aVar.f62449c));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getMaxSeekToPreviousPosition() {
        return 3000L;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public a0 getMediaMetadata() {
        return this.F;
    }

    public boolean getPauseAtEndOfMediaItems() {
        return this.D;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean getPlayWhenReady() {
        return this.I.f62768l;
    }

    public Looper getPlaybackLooper() {
        return this.f62880h.getPlaybackLooper();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public k0 getPlaybackParameters() {
        return this.I.f62770n;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getPlaybackState() {
        return this.I.f62761e;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getPlaybackSuppressionReason() {
        return this.I.f62769m;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public a0 getPlaylistMetadata() {
        return this.G;
    }

    public int getRendererCount() {
        return this.f62876d.length;
    }

    public int getRendererType(int i10) {
        return this.f62876d[i10].getTrackType();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getRepeatMode() {
        return this.f62893u;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getSeekBackIncrement() {
        return this.f62890r;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getSeekForwardIncrement() {
        return this.f62891s;
    }

    public t0 getSeekParameters() {
        return this.B;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean getShuffleModeEnabled() {
        return this.f62894v;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getTotalBufferedDuration() {
        return io.odeeo.internal.q0.g0.usToMs(this.I.f62774r);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.n0.j getTrackSelectionParameters() {
        return this.f62877e.getParameters();
    }

    public io.odeeo.internal.n0.k getTrackSelector() {
        return this.f62877e;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.r0.m getVideoSize() {
        return io.odeeo.internal.r0.m.f66222e;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public float getVolume() {
        return 1.0f;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean isDeviceMuted() {
        return false;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean isLoading() {
        return this.I.f62763g;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean isPlayingAd() {
        return this.I.f62758b.isAd();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void moveMediaItems(int i10, int i11, int i12) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= this.f62884l.size() && i12 >= 0);
        y0 currentTimeline = getCurrentTimeline();
        this.f62895w++;
        int iMin = Math.min(i12, this.f62884l.size() - (i11 - i10));
        io.odeeo.internal.q0.g0.moveItems(this.f62884l, i10, i11, iMin);
        y0 y0VarC = c();
        j0 j0VarA = a(this.I, y0VarC, a(currentTimeline, y0VarC));
        this.f62880h.moveMediaSources(i10, i11, iMin, this.C);
        a(j0VarA, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    public void onMetadata(io.odeeo.internal.s.a aVar) {
        this.H = this.H.buildUpon().populateFromMetadata(aVar).build();
        a0 a0VarB = b();
        if (a0VarB.equals(this.F)) {
            return;
        }
        this.F = a0VarB;
        this.f62881i.sendEvent(14, new is.k(this, 3));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void prepare() {
        j0 j0Var = this.I;
        if (j0Var.f62761e != 1) {
            return;
        }
        j0 j0VarCopyWithPlaybackError = j0Var.copyWithPlaybackError(null);
        j0 j0VarCopyWithPlaybackState = j0VarCopyWithPlaybackError.copyWithPlaybackState(j0VarCopyWithPlaybackError.f62757a.isEmpty() ? 4 : 2);
        this.f62895w++;
        this.f62880h.prepare();
        a(j0VarCopyWithPlaybackState, 1, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void release() {
        io.odeeo.internal.q0.p.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.16.1] [" + io.odeeo.internal.q0.g0.f65865e + "] [" + r.registeredModules() + C3191e4.i.f36531e);
        if (!this.f62880h.release()) {
            this.f62881i.sendEvent(10, new is.b(3));
        }
        this.f62881i.release();
        this.f62878f.removeCallbacksAndMessages(null);
        io.odeeo.internal.c.a aVar = this.f62887o;
        if (aVar != null) {
            this.f62889q.removeEventListener(aVar);
        }
        j0 j0VarCopyWithPlaybackState = this.I.copyWithPlaybackState(1);
        this.I = j0VarCopyWithPlaybackState;
        j0 j0VarCopyWithLoadingMediaPeriodId = j0VarCopyWithPlaybackState.copyWithLoadingMediaPeriodId(j0VarCopyWithPlaybackState.f62758b);
        this.I = j0VarCopyWithLoadingMediaPeriodId;
        j0VarCopyWithLoadingMediaPeriodId.f62773q = j0VarCopyWithLoadingMediaPeriodId.f62775s;
        this.I.f62774r = 0L;
    }

    public void removeAudioOffloadListener(o.b bVar) {
        this.f62882j.remove(bVar);
    }

    public void removeEventListener(l0.c cVar) {
        this.f62881i.remove(cVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void removeListener(l0.e eVar) {
        removeEventListener(eVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void removeMediaItems(int i10, int i11) {
        j0 j0VarA = a(i10, Math.min(i11, this.f62884l.size()));
        a(j0VarA, 0, 1, false, !j0VarA.f62758b.f62447a.equals(this.I.f62758b.f62447a), 4, a(j0VarA), -1);
    }

    @Deprecated
    public void retry() {
        prepare();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void seekTo(int i10, long j10) {
        y0 y0Var = this.I.f62757a;
        if (i10 < 0 || (!y0Var.isEmpty() && i10 >= y0Var.getWindowCount())) {
            throw new w(y0Var, i10, j10);
        }
        this.f62895w++;
        if (isPlayingAd()) {
            io.odeeo.internal.q0.p.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            q.e eVar = new q.e(this.I);
            eVar.incrementPendingOperationAcks(1);
            this.f62879g.onPlaybackInfoUpdate(eVar);
            return;
        }
        int i11 = getPlaybackState() != 1 ? 2 : 1;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        j0 j0VarA = a(this.I.copyWithPlaybackState(i11), y0Var, a(y0Var, i10, j10));
        this.f62880h.seekTo(y0Var, i10, io.odeeo.internal.q0.g0.msToUs(j10));
        a(j0VarA, 0, 1, true, true, 1, a(j0VarA), currentMediaItemIndex);
    }

    public void setForegroundMode(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            if (this.f62880h.setForegroundMode(z10)) {
                return;
            }
            stop(false, n.createForUnexpected(new s(2), IronSourceError.AUCTION_ERROR_DECRYPTION));
        }
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setMediaItems(List<z> list, boolean z10) {
        setMediaSources(a(list), z10);
    }

    public void setMediaSource(io.odeeo.internal.a0.t tVar) {
        setMediaSources(Collections.singletonList(tVar));
    }

    public void setMediaSources(List<io.odeeo.internal.a0.t> list) {
        setMediaSources(list, true);
    }

    public void setPauseAtEndOfMediaItems(boolean z10) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        this.f62880h.setPauseAtEndOfWindow(z10);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setPlayWhenReady(boolean z10) {
        setPlayWhenReady(z10, 0, 1);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setPlaybackParameters(k0 k0Var) {
        if (k0Var == null) {
            k0Var = k0.f62782d;
        }
        if (this.I.f62770n.equals(k0Var)) {
            return;
        }
        j0 j0VarCopyWithPlaybackParameters = this.I.copyWithPlaybackParameters(k0Var);
        this.f62895w++;
        this.f62880h.setPlaybackParameters(k0Var);
        a(j0VarCopyWithPlaybackParameters, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setPlaylistMetadata(a0 a0Var) {
        io.odeeo.internal.q0.a.checkNotNull(a0Var);
        if (a0Var.equals(this.G)) {
            return;
        }
        this.G = a0Var;
        this.f62881i.sendEvent(15, new is.k(this, 2));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setRepeatMode(int i10) {
        if (this.f62893u != i10) {
            this.f62893u = i10;
            this.f62880h.setRepeatMode(i10);
            this.f62881i.queueEvent(8, new com.google.android.exoplayer2.j0(i10, 5));
            e();
            this.f62881i.flushEvents();
        }
    }

    public void setSeekParameters(t0 t0Var) {
        if (t0Var == null) {
            t0Var = t0.f63016g;
        }
        if (this.B.equals(t0Var)) {
            return;
        }
        this.B = t0Var;
        this.f62880h.setSeekParameters(t0Var);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setShuffleModeEnabled(boolean z10) {
        if (this.f62894v != z10) {
            this.f62894v = z10;
            this.f62880h.setShuffleModeEnabled(z10);
            this.f62881i.queueEvent(9, new com.google.android.exoplayer2.g0(z10, 7));
            e();
            this.f62881i.flushEvents();
        }
    }

    public void setShuffleOrder(io.odeeo.internal.a0.f0 f0Var) {
        y0 y0VarC = c();
        j0 j0VarA = a(this.I, y0VarC, a(y0VarC, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.f62895w++;
        this.C = f0Var;
        this.f62880h.setShuffleOrder(f0Var);
        a(j0VarA, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setTrackSelectionParameters(io.odeeo.internal.n0.j jVar) {
        if (!this.f62877e.isSetParametersSupported() || jVar.equals(this.f62877e.getParameters())) {
            return;
        }
        this.f62877e.setParameters(jVar);
        this.f62881i.queueEvent(19, new ha.a(jVar, 13));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void stop() {
        stop(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(q.e eVar) {
        this.f62878f.post(new im.k(13, this, eVar));
    }

    public void addMediaSource(int i10, io.odeeo.internal.a0.t tVar) {
        addMediaSources(i10, Collections.singletonList(tVar));
    }

    public void addMediaSources(int i10, List<io.odeeo.internal.a0.t> list) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0);
        y0 currentTimeline = getCurrentTimeline();
        this.f62895w++;
        List<f0.c> listA = a(i10, list);
        y0 y0VarC = c();
        j0 j0VarA = a(this.I, y0VarC, a(currentTimeline, y0VarC));
        this.f62880h.addMediaSources(i10, listA, this.C);
        a(j0VarA, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurface(Surface surface) {
    }

    public final int d() {
        if (this.I.f62757a.isEmpty()) {
            return this.J;
        }
        j0 j0Var = this.I;
        return j0Var.f62757a.getPeriodByUid(j0Var.f62758b.f62447a, this.f62883k).f63077c;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public h1<io.odeeo.internal.d0.a> getCurrentCues() {
        return h1.of();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public n getPlayerError() {
        return this.I.f62762f;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setMediaItems(List<z> list, int i10, long j10) {
        setMediaSources(a(list), i10, j10);
    }

    public void setMediaSource(io.odeeo.internal.a0.t tVar, long j10) {
        setMediaSources(Collections.singletonList(tVar), 0, j10);
    }

    public void setMediaSources(List<io.odeeo.internal.a0.t> list, boolean z10) {
        a(list, -1, C.TIME_UNSET, z10);
    }

    public void setPlayWhenReady(boolean z10, int i10, int i11) {
        j0 j0Var = this.I;
        if (j0Var.f62768l == z10 && j0Var.f62769m == i10) {
            return;
        }
        this.f62895w++;
        j0 j0VarCopyWithPlayWhenReady = j0Var.copyWithPlayWhenReady(z10, i10);
        this.f62880h.setPlayWhenReady(z10, i10);
        a(j0VarCopyWithPlayWhenReady, 0, i11, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    @Deprecated
    public void stop(boolean z10) {
        stop(z10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(l0.c cVar) {
        cVar.onPlaylistMetadataChanged(this.G);
    }

    public final void e() {
        l0.b bVar = this.E;
        l0.b bVarA = a(this.f62875c);
        this.E = bVarA;
        if (bVarA.equals(bVar)) {
            return;
        }
        this.f62881i.queueEvent(13, new is.k(this, 0));
    }

    public void setMediaSources(List<io.odeeo.internal.a0.t> list, int i10, long j10) {
        a(list, i10, j10, false);
    }

    public void stop(boolean z10, n nVar) {
        j0 j0VarCopyWithLoadingMediaPeriodId;
        if (z10) {
            j0VarCopyWithLoadingMediaPeriodId = a(0, this.f62884l.size()).copyWithPlaybackError(null);
        } else {
            j0 j0Var = this.I;
            j0VarCopyWithLoadingMediaPeriodId = j0Var.copyWithLoadingMediaPeriodId(j0Var.f62758b);
            j0VarCopyWithLoadingMediaPeriodId.f62773q = j0VarCopyWithLoadingMediaPeriodId.f62775s;
            j0VarCopyWithLoadingMediaPeriodId.f62774r = 0L;
        }
        j0 j0VarCopyWithPlaybackState = j0VarCopyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (nVar != null) {
            j0VarCopyWithPlaybackState = j0VarCopyWithPlaybackState.copyWithPlaybackError(nVar);
        }
        j0 j0Var2 = j0VarCopyWithPlaybackState;
        this.f62895w++;
        this.f62880h.stop();
        a(j0Var2, 0, 1, false, j0Var2.f62757a.isEmpty() && !this.I.f62757a.isEmpty(), 4, a(j0Var2), -1);
    }

    public void setMediaSource(io.odeeo.internal.a0.t tVar, boolean z10) {
        setMediaSources(Collections.singletonList(tVar), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(l0.c cVar) {
        cVar.onMediaMetadataChanged(this.F);
    }

    public static /* synthetic */ void d(j0 j0Var, l0.c cVar) {
        cVar.onLoadingChanged(j0Var.f62763g);
        cVar.onIsLoadingChanged(j0Var.f62763g);
    }

    public final y0 c() {
        return new n0(this.f62884l, this.C);
    }

    public static boolean c(j0 j0Var) {
        return j0Var.f62761e == 3 && j0Var.f62768l && j0Var.f62769m == 0;
    }

    public final long a(j0 j0Var) {
        if (j0Var.f62757a.isEmpty()) {
            return io.odeeo.internal.q0.g0.msToUs(this.L);
        }
        if (j0Var.f62758b.isAd()) {
            return j0Var.f62775s;
        }
        return a(j0Var.f62757a, j0Var.f62758b, j0Var.f62775s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(l0.c cVar) {
        cVar.onAvailableCommandsChanged(this.E);
    }

    public final l0.f b(long j10) {
        Object obj;
        int indexOfPeriod;
        z zVar;
        Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.I.f62757a.isEmpty()) {
            obj = null;
            indexOfPeriod = -1;
            zVar = null;
            obj2 = null;
        } else {
            j0 j0Var = this.I;
            Object obj3 = j0Var.f62758b.f62447a;
            j0Var.f62757a.getPeriodByUid(obj3, this.f62883k);
            indexOfPeriod = this.I.f62757a.getIndexOfPeriod(obj3);
            obj2 = obj3;
            obj = this.I.f62757a.getWindow(currentMediaItemIndex, this.f62656a).f63090a;
            zVar = this.f62656a.f63092c;
        }
        int i10 = indexOfPeriod;
        long jUsToMs = io.odeeo.internal.q0.g0.usToMs(j10);
        long jUsToMs2 = this.I.f62758b.isAd() ? io.odeeo.internal.q0.g0.usToMs(b(this.I)) : jUsToMs;
        t.a aVar = this.I.f62758b;
        return new l0.f(obj, currentMediaItemIndex, zVar, obj2, i10, jUsToMs, jUsToMs2, aVar.f62448b, aVar.f62449c);
    }

    @Deprecated
    public void prepare(io.odeeo.internal.a0.t tVar) {
        setMediaSource(tVar);
        prepare();
    }

    @Deprecated
    public void prepare(io.odeeo.internal.a0.t tVar, boolean z10, boolean z11) {
        setMediaSource(tVar, z10);
        prepare();
    }

    public final List<io.odeeo.internal.a0.t> a(List<z> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f62886n.createMediaSource(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(q.e eVar) {
        int i10 = this.f62895w - eVar.f62941c;
        this.f62895w = i10;
        boolean z10 = true;
        if (eVar.f62942d) {
            this.f62896x = eVar.f62943e;
            this.f62897y = true;
        }
        if (eVar.f62944f) {
            this.f62898z = eVar.f62945g;
        }
        if (i10 == 0) {
            y0 y0Var = eVar.f62940b.f62757a;
            if (!this.I.f62757a.isEmpty() && y0Var.isEmpty()) {
                this.J = -1;
                this.L = 0L;
                this.K = 0;
            }
            if (!y0Var.isEmpty()) {
                List<y0> listA = ((n0) y0Var).a();
                io.odeeo.internal.q0.a.checkState(listA.size() == this.f62884l.size());
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    this.f62884l.get(i11).f62900b = listA.get(i11);
                }
            }
            boolean z11 = this.f62897y;
            long jA = C.TIME_UNSET;
            if (z11) {
                if (eVar.f62940b.f62758b.equals(this.I.f62758b) && eVar.f62940b.f62760d == this.I.f62775s) {
                    z10 = false;
                }
                if (z10) {
                    if (!y0Var.isEmpty() && !eVar.f62940b.f62758b.isAd()) {
                        j0 j0Var = eVar.f62940b;
                        jA = a(y0Var, j0Var.f62758b, j0Var.f62760d);
                    } else {
                        jA = eVar.f62940b.f62760d;
                    }
                }
            } else {
                z10 = false;
            }
            long j10 = jA;
            this.f62897y = false;
            a(eVar.f62940b, 1, this.f62898z, false, z10, this.f62896x, j10, -1);
        }
    }

    public static long b(j0 j0Var) {
        y0.d dVar = new y0.d();
        y0.b bVar = new y0.b();
        j0Var.f62757a.getPeriodByUid(j0Var.f62758b.f62447a, bVar);
        if (j0Var.f62759c == C.TIME_UNSET) {
            return j0Var.f62757a.getWindow(bVar.f63077c, dVar).getDefaultPositionUs();
        }
        return bVar.getPositionInWindowUs() + j0Var.f62759c;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void decreaseDeviceVolume() {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void increaseDeviceVolume() {
    }

    public final void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f62884l.remove(i12);
        }
        this.C = this.C.cloneAndRemove(i10, i11);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoTextureView(TextureView textureView) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setDeviceMuted(boolean z10) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setDeviceVolume(int i10) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoSurface(Surface surface) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoTextureView(TextureView textureView) {
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVolume(float f10) {
    }

    public final a0 b() {
        z currentMediaItem = getCurrentMediaItem();
        if (currentMediaItem == null) {
            return this.H;
        }
        return this.H.buildUpon().populate(currentMediaItem.f63113e).build();
    }

    public final void a(final j0 j0Var, final int i10, final int i11, boolean z10, boolean z11, int i12, long j10, int i13) {
        j0 j0Var2 = this.I;
        this.I = j0Var;
        Pair<Boolean, Integer> pairA = a(j0Var, j0Var2, z11, i12, !j0Var2.f62757a.equals(j0Var.f62757a));
        boolean zBooleanValue = ((Boolean) pairA.first).booleanValue();
        int iIntValue = ((Integer) pairA.second).intValue();
        a0 a0VarB = this.F;
        z zVar = null;
        if (zBooleanValue) {
            if (!j0Var.f62757a.isEmpty()) {
                zVar = j0Var.f62757a.getWindow(j0Var.f62757a.getPeriodByUid(j0Var.f62758b.f62447a, this.f62883k).f63077c, this.f62656a).f63092c;
            }
            this.H = a0.H;
        }
        if (zBooleanValue || !j0Var2.f62766j.equals(j0Var.f62766j)) {
            this.H = this.H.buildUpon().populateFromMetadata(j0Var.f62766j).build();
            a0VarB = b();
        }
        boolean zEquals = a0VarB.equals(this.F);
        this.F = a0VarB;
        if (!j0Var2.f62757a.equals(j0Var.f62757a)) {
            final int i14 = 0;
            this.f62881i.queueEvent(0, new o.a() { // from class: is.m
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            ((l0.c) obj).onTimelineChanged(j0Var.f62757a, i10);
                            break;
                        default:
                            ((l0.c) obj).onPlayWhenReadyChanged(j0Var.f62768l, i10);
                            break;
                    }
                }
            });
        }
        if (z11) {
            this.f62881i.queueEvent(11, new com.google.android.exoplayer2.l0(i12, a(i12, j0Var2, i13), b(j10), 2));
        }
        if (zBooleanValue) {
            this.f62881i.queueEvent(1, new com.google.android.exoplayer2.m0(zVar, iIntValue, 2));
        }
        if (j0Var2.f62762f != j0Var.f62762f) {
            final int i15 = 0;
            this.f62881i.queueEvent(10, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
            if (j0Var.f62762f != null) {
                final int i16 = 1;
                this.f62881i.queueEvent(10, new o.a() { // from class: is.l
                    @Override // io.odeeo.internal.q0.o.a
                    public final void invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                                break;
                            case 1:
                                ((l0.c) obj).onPlayerError(j0Var.f62762f);
                                break;
                            case 2:
                                ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                                break;
                            case 3:
                                p.d(j0Var, (l0.c) obj);
                                break;
                            case 4:
                                j0 j0Var3 = j0Var;
                                ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                                break;
                            case 5:
                                ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                                break;
                            case 6:
                                ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                                break;
                            case 7:
                                ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                                break;
                            default:
                                ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                                break;
                        }
                    }
                });
            }
        }
        io.odeeo.internal.n0.l lVar = j0Var2.f62765i;
        io.odeeo.internal.n0.l lVar2 = j0Var.f62765i;
        if (lVar != lVar2) {
            this.f62877e.onSelectionActivated(lVar2.f65059e);
            this.f62881i.queueEvent(2, new ao.n(23, j0Var, new io.odeeo.internal.n0.h(j0Var.f62765i.f65057c)));
            final int i17 = 2;
            this.f62881i.queueEvent(2, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i17) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
        }
        if (!zEquals) {
            this.f62881i.queueEvent(14, new ha.a(this.F, 11));
        }
        if (j0Var2.f62763g != j0Var.f62763g) {
            final int i18 = 3;
            this.f62881i.queueEvent(3, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i18) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
        }
        if (j0Var2.f62761e != j0Var.f62761e || j0Var2.f62768l != j0Var.f62768l) {
            final int i19 = 4;
            this.f62881i.queueEvent(-1, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i19) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
        }
        if (j0Var2.f62761e != j0Var.f62761e) {
            final int i20 = 5;
            this.f62881i.queueEvent(4, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i20) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
        }
        if (j0Var2.f62768l != j0Var.f62768l) {
            final int i21 = 1;
            this.f62881i.queueEvent(5, new o.a() { // from class: is.m
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i21) {
                        case 0:
                            ((l0.c) obj).onTimelineChanged(j0Var.f62757a, i11);
                            break;
                        default:
                            ((l0.c) obj).onPlayWhenReadyChanged(j0Var.f62768l, i11);
                            break;
                    }
                }
            });
        }
        if (j0Var2.f62769m != j0Var.f62769m) {
            final int i22 = 6;
            this.f62881i.queueEvent(6, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i22) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
        }
        if (c(j0Var2) != c(j0Var)) {
            final int i23 = 7;
            this.f62881i.queueEvent(7, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i23) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
        }
        if (!j0Var2.f62770n.equals(j0Var.f62770n)) {
            final int i24 = 8;
            this.f62881i.queueEvent(12, new o.a() { // from class: is.l
                @Override // io.odeeo.internal.q0.o.a
                public final void invoke(Object obj) {
                    switch (i24) {
                        case 0:
                            ((l0.c) obj).onPlayerErrorChanged(j0Var.f62762f);
                            break;
                        case 1:
                            ((l0.c) obj).onPlayerError(j0Var.f62762f);
                            break;
                        case 2:
                            ((l0.c) obj).onTracksInfoChanged(j0Var.f62765i.f65058d);
                            break;
                        case 3:
                            p.d(j0Var, (l0.c) obj);
                            break;
                        case 4:
                            j0 j0Var3 = j0Var;
                            ((l0.c) obj).onPlayerStateChanged(j0Var3.f62768l, j0Var3.f62761e);
                            break;
                        case 5:
                            ((l0.c) obj).onPlaybackStateChanged(j0Var.f62761e);
                            break;
                        case 6:
                            ((l0.c) obj).onPlaybackSuppressionReasonChanged(j0Var.f62769m);
                            break;
                        case 7:
                            ((l0.c) obj).onIsPlayingChanged(p.c(j0Var));
                            break;
                        default:
                            ((l0.c) obj).onPlaybackParametersChanged(j0Var.f62770n);
                            break;
                    }
                }
            });
        }
        if (z10) {
            this.f62881i.queueEvent(-1, new is.b(4));
        }
        e();
        this.f62881i.flushEvents();
        if (j0Var2.f62771o != j0Var.f62771o) {
            Iterator<o.b> it = this.f62882j.iterator();
            while (it.hasNext()) {
                it.next().onExperimentalOffloadSchedulingEnabledChanged(j0Var.f62771o);
            }
        }
        if (j0Var2.f62772p != j0Var.f62772p) {
            Iterator<o.b> it2 = this.f62882j.iterator();
            while (it2.hasNext()) {
                it2.next().onExperimentalSleepingForOffloadChanged(j0Var.f62772p);
            }
        }
    }

    public static /* synthetic */ void a(int i10, l0.f fVar, l0.f fVar2, l0.c cVar) {
        cVar.onPositionDiscontinuity(i10);
        cVar.onPositionDiscontinuity(fVar, fVar2, i10);
    }

    public final l0.f a(int i10, j0 j0Var, int i11) {
        int i12;
        Object obj;
        z zVar;
        Object obj2;
        int i13;
        long jB;
        long adDurationUs;
        long jB2;
        long j10;
        y0.b bVar = new y0.b();
        if (j0Var.f62757a.isEmpty()) {
            i12 = i11;
            obj = null;
            zVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = j0Var.f62758b.f62447a;
            j0Var.f62757a.getPeriodByUid(obj3, bVar);
            int i14 = bVar.f63077c;
            int indexOfPeriod = j0Var.f62757a.getIndexOfPeriod(obj3);
            Object obj4 = j0Var.f62757a.getWindow(i14, this.f62656a).f63090a;
            zVar = this.f62656a.f63092c;
            obj2 = obj3;
            i13 = indexOfPeriod;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            jB = bVar.f63079e + bVar.f63078d;
            if (j0Var.f62758b.isAd()) {
                t.a aVar = j0Var.f62758b;
                adDurationUs = bVar.getAdDurationUs(aVar.f62448b, aVar.f62449c);
                jB2 = b(j0Var);
                long j11 = adDurationUs;
                jB = jB2;
                j10 = j11;
            } else {
                if (j0Var.f62758b.f62451e != -1 && this.I.f62758b.isAd()) {
                    jB = b(this.I);
                }
                j10 = jB;
            }
        } else if (j0Var.f62758b.isAd()) {
            adDurationUs = j0Var.f62775s;
            jB2 = b(j0Var);
            long j112 = adDurationUs;
            jB = jB2;
            j10 = j112;
        } else {
            jB = bVar.f63079e + j0Var.f62775s;
            j10 = jB;
        }
        long jUsToMs = io.odeeo.internal.q0.g0.usToMs(j10);
        long jUsToMs2 = io.odeeo.internal.q0.g0.usToMs(jB);
        t.a aVar2 = j0Var.f62758b;
        return new l0.f(obj, i12, zVar, obj2, i13, jUsToMs, jUsToMs2, aVar2.f62448b, aVar2.f62449c);
    }

    public final Pair<Boolean, Integer> a(j0 j0Var, j0 j0Var2, boolean z10, int i10, boolean z11) {
        y0 y0Var = j0Var2.f62757a;
        y0 y0Var2 = j0Var.f62757a;
        if (y0Var2.isEmpty() && y0Var.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (y0Var2.isEmpty() != y0Var.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (y0Var.getWindow(y0Var.getPeriodByUid(j0Var2.f62758b.f62447a, this.f62883k).f63077c, this.f62656a).f63090a.equals(y0Var2.getWindow(y0Var2.getPeriodByUid(j0Var.f62758b.f62447a, this.f62883k).f63077c, this.f62656a).f63090a)) {
            if (z10 && i10 == 0 && j0Var2.f62758b.f62450d < j0Var.f62758b.f62450d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List<io.odeeo.internal.a0.t> r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r1 = r16
            int r2 = r14.d()
            long r3 = r14.getCurrentPosition()
            int r5 = r14.f62895w
            r6 = 1
            int r5 = r5 + r6
            r14.f62895w = r5
            java.util.List<io.odeeo.internal.b.p$a> r5 = r14.f62884l
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L22
            java.util.List<io.odeeo.internal.b.p$a> r5 = r14.f62884l
            int r5 = r5.size()
            r14.b(r7, r5)
        L22:
            java.util.List r9 = r14.a(r7, r15)
            io.odeeo.internal.b.y0 r5 = r14.c()
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L36
            int r8 = r5.getWindowCount()
            if (r1 >= r8) goto L39
        L36:
            r10 = r17
            goto L41
        L39:
            io.odeeo.internal.b.w r2 = new io.odeeo.internal.b.w
            r10 = r17
            r2.<init>(r5, r1, r10)
            throw r2
        L41:
            r8 = -1
            if (r19 == 0) goto L51
            boolean r1 = r14.f62894v
            int r1 = r5.getFirstWindowIndex(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4f:
            r10 = r1
            goto L58
        L51:
            if (r1 != r8) goto L56
            r10 = r2
            r2 = r3
            goto L58
        L56:
            r2 = r10
            goto L4f
        L58:
            io.odeeo.internal.b.j0 r1 = r14.I
            android.util.Pair r4 = r14.a(r5, r10, r2)
            io.odeeo.internal.b.j0 r1 = r14.a(r1, r5, r4)
            int r4 = r1.f62761e
            if (r10 == r8) goto L78
            if (r4 == r6) goto L78
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L77
            int r4 = r5.getWindowCount()
            if (r10 < r4) goto L75
            goto L77
        L75:
            r4 = 2
            goto L78
        L77:
            r4 = 4
        L78:
            io.odeeo.internal.b.j0 r1 = r1.copyWithPlaybackState(r4)
            io.odeeo.internal.b.q r8 = r14.f62880h
            long r11 = io.odeeo.internal.q0.g0.msToUs(r2)
            io.odeeo.internal.a0.f0 r13 = r14.C
            r8.setMediaSources(r9, r10, r11, r13)
            io.odeeo.internal.b.j0 r2 = r14.I
            io.odeeo.internal.a0.t$a r2 = r2.f62758b
            java.lang.Object r2 = r2.f62447a
            io.odeeo.internal.a0.t$a r3 = r1.f62758b
            java.lang.Object r3 = r3.f62447a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La3
            io.odeeo.internal.b.j0 r2 = r14.I
            io.odeeo.internal.b.y0 r2 = r2.f62757a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto La3
            r5 = r6
            goto La4
        La3:
            r5 = r7
        La4:
            long r7 = r14.a(r1)
            r6 = 4
            r9 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            r0 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.b.p.a(java.util.List, int, long, boolean):void");
    }

    public final List<f0.c> a(int i10, List<io.odeeo.internal.a0.t> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            f0.c cVar = new f0.c(list.get(i11), this.f62885m);
            arrayList.add(cVar);
            this.f62884l.add(i11 + i10, new a(cVar.f62703b, cVar.f62702a.getTimeline()));
        }
        this.C = this.C.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    public final j0 a(int i10, int i11) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0 && i11 >= i10 && i11 <= this.f62884l.size());
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        y0 currentTimeline = getCurrentTimeline();
        int size = this.f62884l.size();
        this.f62895w++;
        b(i10, i11);
        y0 y0VarC = c();
        j0 j0VarA = a(this.I, y0VarC, a(currentTimeline, y0VarC));
        int i12 = j0VarA.f62761e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && currentMediaItemIndex >= j0VarA.f62757a.getWindowCount()) {
            j0VarA = j0VarA.copyWithPlaybackState(4);
        }
        this.f62880h.removeMediaSources(i10, i11, this.C);
        return j0VarA;
    }

    public final j0 a(j0 j0Var, y0 y0Var, Pair<Object, Long> pair) {
        long adDurationUs;
        io.odeeo.internal.q0.a.checkArgument(y0Var.isEmpty() || pair != null);
        y0 y0Var2 = j0Var.f62757a;
        j0 j0VarCopyWithTimeline = j0Var.copyWithTimeline(y0Var);
        if (y0Var.isEmpty()) {
            t.a dummyPeriodForEmptyTimeline = j0.getDummyPeriodForEmptyTimeline();
            long jMsToUs = io.odeeo.internal.q0.g0.msToUs(this.L);
            j0 j0VarCopyWithLoadingMediaPeriodId = j0VarCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, io.odeeo.internal.a0.l0.f62399d, this.f62874b, h1.of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            j0VarCopyWithLoadingMediaPeriodId.f62773q = j0VarCopyWithLoadingMediaPeriodId.f62775s;
            return j0VarCopyWithLoadingMediaPeriodId;
        }
        Object obj = j0VarCopyWithTimeline.f62758b.f62447a;
        boolean zEquals = obj.equals(((Pair) io.odeeo.internal.q0.g0.castNonNull(pair)).first);
        t.a aVar = !zEquals ? new t.a(pair.first) : j0VarCopyWithTimeline.f62758b;
        long jLongValue = ((Long) pair.second).longValue();
        long jMsToUs2 = io.odeeo.internal.q0.g0.msToUs(getContentPosition());
        if (!y0Var2.isEmpty()) {
            jMsToUs2 -= y0Var2.getPeriodByUid(obj, this.f62883k).getPositionInWindowUs();
        }
        if (!zEquals || jLongValue < jMsToUs2) {
            t.a aVar2 = aVar;
            io.odeeo.internal.q0.a.checkState(!aVar2.isAd());
            j0 j0VarCopyWithLoadingMediaPeriodId2 = j0VarCopyWithTimeline.copyWithNewPosition(aVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? io.odeeo.internal.a0.l0.f62399d : j0VarCopyWithTimeline.f62764h, !zEquals ? this.f62874b : j0VarCopyWithTimeline.f62765i, !zEquals ? h1.of() : j0VarCopyWithTimeline.f62766j).copyWithLoadingMediaPeriodId(aVar2);
            j0VarCopyWithLoadingMediaPeriodId2.f62773q = jLongValue;
            return j0VarCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue == jMsToUs2) {
            int indexOfPeriod = y0Var.getIndexOfPeriod(j0VarCopyWithTimeline.f62767k.f62447a);
            if (indexOfPeriod != -1 && y0Var.getPeriod(indexOfPeriod, this.f62883k).f63077c == y0Var.getPeriodByUid(aVar.f62447a, this.f62883k).f63077c) {
                return j0VarCopyWithTimeline;
            }
            y0Var.getPeriodByUid(aVar.f62447a, this.f62883k);
            if (aVar.isAd()) {
                adDurationUs = this.f62883k.getAdDurationUs(aVar.f62448b, aVar.f62449c);
            } else {
                adDurationUs = this.f62883k.f63078d;
            }
            t.a aVar3 = aVar;
            j0 j0VarCopyWithLoadingMediaPeriodId3 = j0VarCopyWithTimeline.copyWithNewPosition(aVar3, j0VarCopyWithTimeline.f62775s, j0VarCopyWithTimeline.f62775s, j0VarCopyWithTimeline.f62760d, adDurationUs - j0VarCopyWithTimeline.f62775s, j0VarCopyWithTimeline.f62764h, j0VarCopyWithTimeline.f62765i, j0VarCopyWithTimeline.f62766j).copyWithLoadingMediaPeriodId(aVar3);
            j0VarCopyWithLoadingMediaPeriodId3.f62773q = adDurationUs;
            return j0VarCopyWithLoadingMediaPeriodId3;
        }
        t.a aVar4 = aVar;
        io.odeeo.internal.q0.a.checkState(!aVar4.isAd());
        long jMax = Math.max(0L, j0VarCopyWithTimeline.f62774r - (jLongValue - jMsToUs2));
        long j10 = j0VarCopyWithTimeline.f62773q;
        if (j0VarCopyWithTimeline.f62767k.equals(j0VarCopyWithTimeline.f62758b)) {
            j10 = jLongValue + jMax;
        }
        j0 j0VarCopyWithNewPosition = j0VarCopyWithTimeline.copyWithNewPosition(aVar4, jLongValue, jLongValue, jLongValue, jMax, j0VarCopyWithTimeline.f62764h, j0VarCopyWithTimeline.f62765i, j0VarCopyWithTimeline.f62766j);
        j0VarCopyWithNewPosition.f62773q = j10;
        return j0VarCopyWithNewPosition;
    }

    public final Pair<Object, Long> a(y0 y0Var, y0 y0Var2) {
        long contentPosition = getContentPosition();
        if (!y0Var.isEmpty() && !y0Var2.isEmpty()) {
            Pair<Object, Long> periodPosition = y0Var.getPeriodPosition(this.f62656a, this.f62883k, getCurrentMediaItemIndex(), io.odeeo.internal.q0.g0.msToUs(contentPosition));
            Object obj = ((Pair) io.odeeo.internal.q0.g0.castNonNull(periodPosition)).first;
            if (y0Var2.getIndexOfPeriod(obj) != -1) {
                return periodPosition;
            }
            Object objA = q.a(this.f62656a, this.f62883k, this.f62893u, this.f62894v, obj, y0Var, y0Var2);
            if (objA != null) {
                y0Var2.getPeriodByUid(objA, this.f62883k);
                int i10 = this.f62883k.f63077c;
                return a(y0Var2, i10, y0Var2.getWindow(i10, this.f62656a).getDefaultPositionMs());
            }
            return a(y0Var2, -1, C.TIME_UNSET);
        }
        boolean z10 = !y0Var.isEmpty() && y0Var2.isEmpty();
        int iD = z10 ? -1 : d();
        if (z10) {
            contentPosition = -9223372036854775807L;
        }
        return a(y0Var2, iD, contentPosition);
    }

    public final Pair<Object, Long> a(y0 y0Var, int i10, long j10) {
        if (y0Var.isEmpty()) {
            this.J = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.L = j10;
            this.K = 0;
            return null;
        }
        if (i10 == -1 || i10 >= y0Var.getWindowCount()) {
            i10 = y0Var.getFirstWindowIndex(this.f62894v);
            j10 = y0Var.getWindow(i10, this.f62656a).getDefaultPositionMs();
        }
        return y0Var.getPeriodPosition(this.f62656a, this.f62883k, i10, io.odeeo.internal.q0.g0.msToUs(j10));
    }

    public final long a(y0 y0Var, t.a aVar, long j10) {
        y0Var.getPeriodByUid(aVar.f62447a, this.f62883k);
        return this.f62883k.getPositionInWindowUs() + j10;
    }
}
