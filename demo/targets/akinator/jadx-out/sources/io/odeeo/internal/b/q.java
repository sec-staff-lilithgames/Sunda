package io.odeeo.internal.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.a0.r;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.f0;
import io.odeeo.internal.b.k;
import io.odeeo.internal.b.m0;
import io.odeeo.internal.b.p0;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.f.f;
import io.odeeo.internal.n0.k;
import io.odeeo.internal.s.a;
import io.odeeo.internal.u0.e3;
import io.odeeo.internal.u0.h1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements Handler.Callback, r.a, k.a, f0.d, k.a, m0.a {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public h L;
    public long M;
    public int N;
    public boolean O;
    public n P;
    public long Q;

    /* renamed from: a, reason: collision with root package name */
    public final p0[] f62901a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<p0> f62902b;

    /* renamed from: c, reason: collision with root package name */
    public final q0[] f62903c;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.n0.k f62904e;

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.n0.l f62905f;

    /* renamed from: g, reason: collision with root package name */
    public final y f62906g;

    /* renamed from: h, reason: collision with root package name */
    public final io.odeeo.internal.p0.d f62907h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.q0.n f62908i;

    /* renamed from: j, reason: collision with root package name */
    public final HandlerThread f62909j;

    /* renamed from: k, reason: collision with root package name */
    public final Looper f62910k;

    /* renamed from: l, reason: collision with root package name */
    public final y0.d f62911l;

    /* renamed from: m, reason: collision with root package name */
    public final y0.b f62912m;

    /* renamed from: n, reason: collision with root package name */
    public final long f62913n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f62914o;

    /* renamed from: p, reason: collision with root package name */
    public final k f62915p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<d> f62916q;

    /* renamed from: r, reason: collision with root package name */
    public final io.odeeo.internal.q0.d f62917r;

    /* renamed from: s, reason: collision with root package name */
    public final f f62918s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f62919t;

    /* renamed from: u, reason: collision with root package name */
    public final f0 f62920u;

    /* renamed from: v, reason: collision with root package name */
    public final x f62921v;

    /* renamed from: w, reason: collision with root package name */
    public final long f62922w;

    /* renamed from: x, reason: collision with root package name */
    public t0 f62923x;

    /* renamed from: y, reason: collision with root package name */
    public j0 f62924y;

    /* renamed from: z, reason: collision with root package name */
    public e f62925z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements p0.a {
        public a() {
        }

        @Override // io.odeeo.internal.b.p0.a
        public void onSleep(long j10) {
            if (j10 >= 2000) {
                q.this.I = true;
            }
        }

        @Override // io.odeeo.internal.b.p0.a
        public void onWakeup() {
            q.this.f62908i.sendEmptyMessage(2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<f0.c> f62927a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.a0.f0 f62928b;

        /* renamed from: c, reason: collision with root package name */
        public final int f62929c;

        /* renamed from: d, reason: collision with root package name */
        public final long f62930d;

        public /* synthetic */ b(List list, io.odeeo.internal.a0.f0 f0Var, int i10, long j10, a aVar) {
            this(list, f0Var, i10, j10);
        }

        public b(List<f0.c> list, io.odeeo.internal.a0.f0 f0Var, int i10, long j10) {
            this.f62927a = list;
            this.f62928b = f0Var;
            this.f62929c = i10;
            this.f62930d = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f62931a;

        /* renamed from: b, reason: collision with root package name */
        public final int f62932b;

        /* renamed from: c, reason: collision with root package name */
        public final int f62933c;

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.a0.f0 f62934d;

        public c(int i10, int i11, int i12, io.odeeo.internal.a0.f0 f0Var) {
            this.f62931a = i10;
            this.f62932b = i11;
            this.f62933c = i12;
            this.f62934d = f0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f62935a;

        /* renamed from: b, reason: collision with root package name */
        public int f62936b;

        /* renamed from: c, reason: collision with root package name */
        public long f62937c;

        /* renamed from: d, reason: collision with root package name */
        public Object f62938d;

        public d(m0 m0Var) {
            this.f62935a = m0Var;
        }

        public void setResolvedPosition(int i10, long j10, Object obj) {
            this.f62936b = i10;
            this.f62937c = j10;
            this.f62938d = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            Object obj = this.f62938d;
            if ((obj == null) != (dVar.f62938d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f62936b - dVar.f62936b;
            return i10 != 0 ? i10 : io.odeeo.internal.q0.g0.compareLong(this.f62937c, dVar.f62937c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f62939a;

        /* renamed from: b, reason: collision with root package name */
        public j0 f62940b;

        /* renamed from: c, reason: collision with root package name */
        public int f62941c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f62942d;

        /* renamed from: e, reason: collision with root package name */
        public int f62943e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f62944f;

        /* renamed from: g, reason: collision with root package name */
        public int f62945g;

        public e(j0 j0Var) {
            this.f62940b = j0Var;
        }

        public void incrementPendingOperationAcks(int i10) {
            this.f62939a |= i10 > 0;
            this.f62941c += i10;
        }

        public void setPlayWhenReadyChangeReason(int i10) {
            this.f62939a = true;
            this.f62944f = true;
            this.f62945g = i10;
        }

        public void setPlaybackInfo(j0 j0Var) {
            this.f62939a |= this.f62940b != j0Var;
            this.f62940b = j0Var;
        }

        public void setPositionDiscontinuity(int i10) {
            if (this.f62942d && this.f62943e != 5) {
                io.odeeo.internal.q0.a.checkArgument(i10 == 5);
                return;
            }
            this.f62939a = true;
            this.f62942d = true;
            this.f62943e = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface f {
        void onPlaybackInfoUpdate(e eVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final t.a f62946a;

        /* renamed from: b, reason: collision with root package name */
        public final long f62947b;

        /* renamed from: c, reason: collision with root package name */
        public final long f62948c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f62949d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f62950e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f62951f;

        public g(t.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f62946a = aVar;
            this.f62947b = j10;
            this.f62948c = j11;
            this.f62949d = z10;
            this.f62950e = z11;
            this.f62951f = z12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final y0 f62952a;

        /* renamed from: b, reason: collision with root package name */
        public final int f62953b;

        /* renamed from: c, reason: collision with root package name */
        public final long f62954c;

        public h(y0 y0Var, int i10, long j10) {
            this.f62952a = y0Var;
            this.f62953b = i10;
            this.f62954c = j10;
        }
    }

    public q(p0[] p0VarArr, io.odeeo.internal.n0.k kVar, io.odeeo.internal.n0.l lVar, y yVar, io.odeeo.internal.p0.d dVar, int i10, boolean z10, io.odeeo.internal.c.a aVar, t0 t0Var, x xVar, long j10, boolean z11, Looper looper, io.odeeo.internal.q0.d dVar2, f fVar) {
        this.f62918s = fVar;
        this.f62901a = p0VarArr;
        this.f62904e = kVar;
        this.f62905f = lVar;
        this.f62906g = yVar;
        this.f62907h = dVar;
        this.F = i10;
        this.G = z10;
        this.f62923x = t0Var;
        this.f62921v = xVar;
        this.f62922w = j10;
        this.Q = j10;
        this.B = z11;
        this.f62917r = dVar2;
        this.f62913n = yVar.getBackBufferDurationUs();
        this.f62914o = yVar.retainBackBufferFromKeyframe();
        j0 j0VarCreateDummy = j0.createDummy(lVar);
        this.f62924y = j0VarCreateDummy;
        this.f62925z = new e(j0VarCreateDummy);
        this.f62903c = new q0[p0VarArr.length];
        for (int i11 = 0; i11 < p0VarArr.length; i11++) {
            p0VarArr[i11].setIndex(i11);
            this.f62903c[i11] = p0VarArr[i11].getCapabilities();
        }
        this.f62915p = new k(this, dVar2);
        this.f62916q = new ArrayList<>();
        this.f62902b = e3.newIdentityHashSet();
        this.f62911l = new y0.d();
        this.f62912m = new y0.b();
        kVar.init(this, dVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f62919t = new d0(aVar, handler);
        this.f62920u = new f0(this, aVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f62909j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f62910k = looper2;
        this.f62908i = dVar2.createHandler(looper2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean j() {
        return Boolean.valueOf(this.A);
    }

    public final boolean A() {
        j0 j0Var = this.f62924y;
        return j0Var.f62768l && j0Var.f62769m == 0;
    }

    public final void B() throws n {
        this.D = false;
        this.f62915p.start();
        for (p0 p0Var : this.f62901a) {
            if (c(p0Var)) {
                p0Var.start();
            }
        }
    }

    public final void C() throws n {
        this.f62915p.stop();
        for (p0 p0Var : this.f62901a) {
            if (c(p0Var)) {
                b(p0Var);
            }
        }
    }

    public final void D() {
        b0 loadingPeriod = this.f62919t.getLoadingPeriod();
        boolean z10 = this.E || (loadingPeriod != null && loadingPeriod.f62617a.isLoading());
        j0 j0Var = this.f62924y;
        if (z10 != j0Var.f62763g) {
            this.f62924y = j0Var.copyWithIsLoading(z10);
        }
    }

    public final void E() throws n, IOException {
        if (this.f62924y.f62757a.isEmpty() || !this.f62920u.isPrepared()) {
            return;
        }
        m();
        o();
        p();
        n();
    }

    public final void F() throws n {
        b0 playingPeriod = this.f62919t.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long discontinuity = playingPeriod.f62620d ? playingPeriod.f62617a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            b(discontinuity);
            if (discontinuity != this.f62924y.f62775s) {
                j0 j0Var = this.f62924y;
                long j10 = discontinuity;
                this.f62924y = a(j0Var.f62758b, j10, j0Var.f62759c, j10, true, 5);
            }
        } else {
            long jSyncAndGetPositionUs = this.f62915p.syncAndGetPositionUs(playingPeriod != this.f62919t.getReadingPeriod());
            this.M = jSyncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(jSyncAndGetPositionUs);
            b(this.f62924y.f62775s, periodTime);
            this.f62924y.f62775s = periodTime;
        }
        this.f62924y.f62773q = this.f62919t.getLoadingPeriod().getBufferedPositionUs();
        this.f62924y.f62774r = f();
        j0 j0Var2 = this.f62924y;
        if (j0Var2.f62768l && j0Var2.f62761e == 3 && a(j0Var2.f62757a, j0Var2.f62758b) && this.f62924y.f62770n.f62784a == 1.0f) {
            float adjustedPlaybackSpeed = this.f62921v.getAdjustedPlaybackSpeed(d(), f());
            if (this.f62915p.getPlaybackParameters().f62784a != adjustedPlaybackSpeed) {
                this.f62915p.setPlaybackParameters(this.f62924y.f62770n.withSpeed(adjustedPlaybackSpeed));
                a(this.f62924y.f62770n, this.f62915p.getPlaybackParameters().f62784a, false, false);
            }
        }
    }

    public void addMediaSources(int i10, List<f0.c> list, io.odeeo.internal.a0.f0 f0Var) {
        this.f62908i.obtainMessage(18, i10, 0, new b(list, f0Var, -1, C.TIME_UNSET, null)).sendToTarget();
    }

    public final void c(boolean z10) throws n {
        t.a aVar = this.f62919t.getPlayingPeriod().f62622f.f62647a;
        long jA = a(aVar, this.f62924y.f62775s, true, false);
        if (jA != this.f62924y.f62775s) {
            j0 j0Var = this.f62924y;
            this.f62924y = a(aVar, jA, j0Var.f62759c, j0Var.f62760d, z10, 5);
        }
    }

    public final void d(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        j0 j0Var = this.f62924y;
        int i10 = j0Var.f62761e;
        if (z10 || i10 == 4 || i10 == 1) {
            this.f62924y = j0Var.copyWithOffloadSchedulingEnabled(z10);
        } else {
            this.f62908i.sendEmptyMessage(2);
        }
    }

    public final void e(boolean z10) throws n {
        this.B = z10;
        x();
        if (!this.C || this.f62919t.getReadingPeriod() == this.f62919t.getPlayingPeriod()) {
            return;
        }
        c(true);
        a(false);
    }

    public void experimentalSetForegroundModeTimeoutMs(long j10) {
        this.Q = j10;
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        this.f62908i.obtainMessage(24, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void f(boolean z10) throws n {
        this.G = z10;
        if (!this.f62919t.updateShuffleModeEnabled(this.f62924y.f62757a, z10)) {
            c(true);
        }
        a(false);
    }

    public final boolean g(boolean z10) {
        if (this.K == 0) {
            return i();
        }
        if (!z10) {
            return false;
        }
        j0 j0Var = this.f62924y;
        if (!j0Var.f62763g) {
            return true;
        }
        long targetLiveOffsetUs = a(j0Var.f62757a, this.f62919t.getPlayingPeriod().f62622f.f62647a) ? this.f62921v.getTargetLiveOffsetUs() : C.TIME_UNSET;
        b0 loadingPeriod = this.f62919t.getLoadingPeriod();
        return (loadingPeriod.isFullyBuffered() && loadingPeriod.f62622f.f62655i) || (loadingPeriod.f62622f.f62647a.isAd() && !loadingPeriod.f62620d) || this.f62906g.shouldStartPlayback(f(), this.f62915p.getPlaybackParameters().f62784a, this.D, targetLiveOffsetUs);
    }

    public Looper getPlaybackLooper() {
        return this.f62910k;
    }

    public final boolean h() {
        b0 loadingPeriod = this.f62919t.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        b0 readingPeriod;
        try {
            switch (message.what) {
                case 0:
                    t();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    a((h) message.obj);
                    break;
                case 4:
                    a((k0) message.obj);
                    break;
                case 5:
                    a((t0) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    u();
                    return true;
                case 8:
                    b((io.odeeo.internal.a0.r) message.obj);
                    break;
                case 9:
                    a((io.odeeo.internal.a0.r) message.obj);
                    break;
                case 10:
                    w();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    f(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    c((m0) message.obj);
                    break;
                case 15:
                    e((m0) message.obj);
                    break;
                case 16:
                    a((k0) message.obj, false);
                    break;
                case 17:
                    a((b) message.obj);
                    break;
                case 18:
                    a((b) message.obj, message.arg1);
                    break;
                case 19:
                    a((c) message.obj);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (io.odeeo.internal.a0.f0) message.obj);
                    break;
                case 21:
                    a((io.odeeo.internal.a0.f0) message.obj);
                    break;
                case 22:
                    q();
                    break;
                case 23:
                    e(message.arg1 != 0);
                    break;
                case 24:
                    d(message.arg1 == 1);
                    break;
                case 25:
                    a();
                    break;
                default:
                    return false;
            }
        } catch (io.odeeo.internal.a0.b e10) {
            a(e10, 1002);
        } catch (g0 e11) {
            int i10 = e11.f62708b;
            if (i10 == 1) {
                i = e11.f62707a ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else if (i10 == 4) {
                i = e11.f62707a ? 3002 : IronSourceError.ERROR_REWARD_VALIDATION_FAILED;
            }
            a(e11, i);
        } catch (n e12) {
            e = e12;
            if (e.f62833d == 1 && (readingPeriod = this.f62919t.getReadingPeriod()) != null) {
                e = e.a(readingPeriod.f62622f.f62647a);
            }
            if (e.f62839j && this.P == null) {
                io.odeeo.internal.q0.p.w("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                io.odeeo.internal.q0.n nVar = this.f62908i;
                nVar.sendMessageAtFrontOfQueue(nVar.obtainMessage(25, e));
            } else {
                n nVar2 = this.P;
                if (nVar2 != null) {
                    nVar2.addSuppressed(e);
                    e = this.P;
                }
                io.odeeo.internal.q0.p.e("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f62924y = this.f62924y.copyWithPlaybackError(e);
            }
        } catch (f.a e13) {
            a(e13, e13.f63917a);
        } catch (io.odeeo.internal.p0.j e14) {
            a(e14, e14.f65619a);
        } catch (IOException e15) {
            a(e15, 2000);
        } catch (RuntimeException e16) {
            n nVarCreateForUnexpected = n.createForUnexpected(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            io.odeeo.internal.q0.p.e("ExoPlayerImplInternal", "Playback error", nVarCreateForUnexpected);
            a(true, false);
            this.f62924y = this.f62924y.copyWithPlaybackError(nVarCreateForUnexpected);
        }
        l();
        return true;
    }

    public final boolean i() {
        b0 playingPeriod = this.f62919t.getPlayingPeriod();
        long j10 = playingPeriod.f62622f.f62651e;
        if (playingPeriod.f62620d) {
            return j10 == C.TIME_UNSET || this.f62924y.f62775s < j10 || !A();
        }
        return false;
    }

    public final void k() {
        boolean z10 = z();
        this.E = z10;
        if (z10) {
            this.f62919t.getLoadingPeriod().continueLoading(this.M);
        }
        D();
    }

    public final void l() {
        this.f62925z.setPlaybackInfo(this.f62924y);
        if (this.f62925z.f62939a) {
            this.f62918s.onPlaybackInfoUpdate(this.f62925z);
            this.f62925z = new e(this.f62924y);
        }
    }

    public final void m() throws n {
        c0 nextMediaPeriodInfo;
        this.f62919t.reevaluateBuffer(this.M);
        if (this.f62919t.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.f62919t.getNextMediaPeriodInfo(this.M, this.f62924y)) != null) {
            b0 b0VarEnqueueNextMediaPeriodHolder = this.f62919t.enqueueNextMediaPeriodHolder(this.f62903c, this.f62904e, this.f62906g.getAllocator(), this.f62920u, nextMediaPeriodInfo, this.f62905f);
            b0VarEnqueueNextMediaPeriodHolder.f62617a.prepare(this, nextMediaPeriodInfo.f62648b);
            if (this.f62919t.getPlayingPeriod() == b0VarEnqueueNextMediaPeriodHolder) {
                b(nextMediaPeriodInfo.f62648b);
            }
            a(false);
        }
        if (!this.E) {
            k();
        } else {
            this.E = h();
            D();
        }
    }

    public void moveMediaSources(int i10, int i11, int i12, io.odeeo.internal.a0.f0 f0Var) {
        this.f62908i.obtainMessage(19, new c(i10, i11, i12, f0Var)).sendToTarget();
    }

    public final void n() throws n {
        boolean z10 = false;
        while (y()) {
            if (z10) {
                l();
            }
            b0 playingPeriod = this.f62919t.getPlayingPeriod();
            b0 b0VarAdvancePlayingPeriod = this.f62919t.advancePlayingPeriod();
            c0 c0Var = b0VarAdvancePlayingPeriod.f62622f;
            t.a aVar = c0Var.f62647a;
            long j10 = c0Var.f62648b;
            j0 j0VarA = a(aVar, j10, c0Var.f62649c, j10, true, 0);
            this.f62924y = j0VarA;
            y0 y0Var = j0VarA.f62757a;
            a(y0Var, b0VarAdvancePlayingPeriod.f62622f.f62647a, y0Var, playingPeriod.f62622f.f62647a, C.TIME_UNSET);
            x();
            F();
            z10 = true;
        }
    }

    public final void o() {
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i10 = 0;
        if (readingPeriod.getNext() != null && !this.C) {
            if (g()) {
                if (readingPeriod.getNext().f62620d || this.M >= readingPeriod.getNext().getStartPositionRendererTime()) {
                    io.odeeo.internal.n0.l trackSelectorResult = readingPeriod.getTrackSelectorResult();
                    b0 b0VarAdvanceReadingPeriod = this.f62919t.advanceReadingPeriod();
                    io.odeeo.internal.n0.l trackSelectorResult2 = b0VarAdvanceReadingPeriod.getTrackSelectorResult();
                    if (b0VarAdvanceReadingPeriod.f62620d && b0VarAdvanceReadingPeriod.f62617a.readDiscontinuity() != C.TIME_UNSET) {
                        c(b0VarAdvanceReadingPeriod.getStartPositionRendererTime());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f62901a.length; i11++) {
                        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i11);
                        boolean zIsRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i11);
                        if (zIsRendererEnabled && !this.f62901a[i11].isCurrentStreamFinal()) {
                            boolean z10 = this.f62903c[i11].getTrackType() == -2;
                            r0 r0Var = trackSelectorResult.f65056b[i11];
                            r0 r0Var2 = trackSelectorResult2.f65056b[i11];
                            if (!zIsRendererEnabled2 || !r0Var2.equals(r0Var) || z10) {
                                a(this.f62901a[i11], b0VarAdvanceReadingPeriod.getStartPositionRendererTime());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!readingPeriod.f62622f.f62655i && !this.C) {
            return;
        }
        while (true) {
            p0[] p0VarArr = this.f62901a;
            if (i10 >= p0VarArr.length) {
                return;
            }
            p0 p0Var = p0VarArr[i10];
            io.odeeo.internal.a0.d0 d0Var = readingPeriod.f62619c[i10];
            if (d0Var != null && p0Var.getStream() == d0Var && p0Var.hasReadStreamToEnd()) {
                long j10 = readingPeriod.f62622f.f62651e;
                a(p0Var, (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.f62622f.f62651e);
            }
            i10++;
        }
    }

    @Override // io.odeeo.internal.b.k.a
    public void onPlaybackParametersChanged(k0 k0Var) {
        this.f62908i.obtainMessage(16, k0Var).sendToTarget();
    }

    @Override // io.odeeo.internal.b.f0.d
    public void onPlaylistUpdateRequested() {
        this.f62908i.sendEmptyMessage(22);
    }

    @Override // io.odeeo.internal.a0.r.a
    public void onPrepared(io.odeeo.internal.a0.r rVar) {
        this.f62908i.obtainMessage(8, rVar).sendToTarget();
    }

    @Override // io.odeeo.internal.n0.k.a
    public void onTrackSelectionsInvalidated() {
        this.f62908i.sendEmptyMessage(10);
    }

    public final void p() throws n {
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        if (readingPeriod == null || this.f62919t.getPlayingPeriod() == readingPeriod || readingPeriod.f62623g || !v()) {
            return;
        }
        c();
    }

    public void prepare() {
        this.f62908i.obtainMessage(0).sendToTarget();
    }

    public final void q() throws Throwable {
        a(this.f62920u.createTimeline(), true);
    }

    public final void r() {
        for (b0 playingPeriod = this.f62919t.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (io.odeeo.internal.n0.d dVar : playingPeriod.getTrackSelectorResult().f65057c) {
                if (dVar != null) {
                    dVar.onDiscontinuity();
                }
            }
        }
    }

    public synchronized boolean release() {
        if (!this.A && this.f62909j.isAlive()) {
            this.f62908i.sendEmptyMessage(7);
            a(new hs.d(this, 4), this.f62922w);
            return this.A;
        }
        return true;
    }

    public void removeMediaSources(int i10, int i11, io.odeeo.internal.a0.f0 f0Var) {
        this.f62908i.obtainMessage(20, i10, i11, f0Var).sendToTarget();
    }

    public final void s() {
        for (b0 playingPeriod = this.f62919t.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (io.odeeo.internal.n0.d dVar : playingPeriod.getTrackSelectorResult().f65057c) {
                if (dVar != null) {
                    dVar.onRebuffer();
                }
            }
        }
    }

    public void seekTo(y0 y0Var, int i10, long j10) {
        this.f62908i.obtainMessage(3, new h(y0Var, i10, j10)).sendToTarget();
    }

    @Override // io.odeeo.internal.b.m0.a
    public synchronized void sendMessage(m0 m0Var) {
        if (!this.A && this.f62909j.isAlive()) {
            this.f62908i.obtainMessage(14, m0Var).sendToTarget();
            return;
        }
        io.odeeo.internal.q0.p.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        m0Var.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z10) {
        if (!this.A && this.f62909j.isAlive()) {
            if (z10) {
                this.f62908i.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f62908i.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            a(new hs.d(atomicBoolean, 3), this.Q);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<f0.c> list, int i10, long j10, io.odeeo.internal.a0.f0 f0Var) {
        this.f62908i.obtainMessage(17, new b(list, f0Var, i10, j10, null)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z10) {
        this.f62908i.obtainMessage(23, z10 ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z10, int i10) {
        this.f62908i.obtainMessage(1, z10 ? 1 : 0, i10).sendToTarget();
    }

    public void setPlaybackParameters(k0 k0Var) {
        this.f62908i.obtainMessage(4, k0Var).sendToTarget();
    }

    public void setRepeatMode(int i10) {
        this.f62908i.obtainMessage(11, i10, 0).sendToTarget();
    }

    public void setSeekParameters(t0 t0Var) {
        this.f62908i.obtainMessage(5, t0Var).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z10) {
        this.f62908i.obtainMessage(12, z10 ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(io.odeeo.internal.a0.f0 f0Var) {
        this.f62908i.obtainMessage(21, f0Var).sendToTarget();
    }

    public void stop() {
        this.f62908i.obtainMessage(6).sendToTarget();
    }

    public final void t() {
        this.f62925z.incrementPendingOperationAcks(1);
        a(false, false, false, true);
        this.f62906g.onPrepared();
        b(this.f62924y.f62757a.isEmpty() ? 4 : 2);
        this.f62920u.prepare(this.f62907h.getTransferListener());
        this.f62908i.sendEmptyMessage(2);
    }

    public final void u() {
        a(true, false, true, false);
        this.f62906g.onReleased();
        b(1);
        this.f62909j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    public final boolean v() throws n {
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        io.odeeo.internal.n0.l trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            p0[] p0VarArr = this.f62901a;
            if (i10 >= p0VarArr.length) {
                return !z10;
            }
            p0 p0Var = p0VarArr[i10];
            if (c(p0Var)) {
                boolean z11 = p0Var.getStream() != readingPeriod.f62619c[i10];
                if (!trackSelectorResult.isRendererEnabled(i10) || z11) {
                    if (!p0Var.isCurrentStreamFinal()) {
                        p0Var.replaceStream(a(trackSelectorResult.f65057c[i10]), readingPeriod.f62619c[i10], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
                    } else if (p0Var.isEnded()) {
                        a(p0Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    public final void w() throws n {
        int i10;
        float f10 = this.f62915p.getPlaybackParameters().f62784a;
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        boolean z10 = true;
        for (b0 playingPeriod = this.f62919t.getPlayingPeriod(); playingPeriod != null && playingPeriod.f62620d; playingPeriod = playingPeriod.getNext()) {
            io.odeeo.internal.n0.l lVarSelectTracks = playingPeriod.selectTracks(f10, this.f62924y.f62757a);
            if (!lVarSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z10) {
                    b0 playingPeriod2 = this.f62919t.getPlayingPeriod();
                    boolean zRemoveAfter = this.f62919t.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.f62901a.length];
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection(lVarSelectTracks, this.f62924y.f62775s, zRemoveAfter, zArr);
                    j0 j0Var = this.f62924y;
                    boolean z11 = (j0Var.f62761e == 4 || jApplyTrackSelection == j0Var.f62775s) ? false : true;
                    j0 j0Var2 = this.f62924y;
                    i10 = 4;
                    this.f62924y = a(j0Var2.f62758b, jApplyTrackSelection, j0Var2.f62759c, j0Var2.f62760d, z11, 5);
                    if (z11) {
                        b(jApplyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.f62901a.length];
                    int i11 = 0;
                    while (true) {
                        p0[] p0VarArr = this.f62901a;
                        if (i11 >= p0VarArr.length) {
                            break;
                        }
                        p0 p0Var = p0VarArr[i11];
                        boolean zC = c(p0Var);
                        zArr2[i11] = zC;
                        io.odeeo.internal.a0.d0 d0Var = playingPeriod2.f62619c[i11];
                        if (zC) {
                            if (d0Var != p0Var.getStream()) {
                                a(p0Var);
                            } else if (zArr[i11]) {
                                p0Var.resetPosition(this.M);
                            }
                        }
                        i11++;
                    }
                    a(zArr2);
                } else {
                    i10 = 4;
                    this.f62919t.removeAfter(playingPeriod);
                    if (playingPeriod.f62620d) {
                        playingPeriod.applyTrackSelection(lVarSelectTracks, Math.max(playingPeriod.f62622f.f62648b, playingPeriod.toPeriodTime(this.M)), false);
                    }
                }
                a(true);
                if (this.f62924y.f62761e != i10) {
                    k();
                    F();
                    this.f62908i.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z10 = false;
            }
        }
    }

    public final void x() {
        b0 playingPeriod = this.f62919t.getPlayingPeriod();
        this.C = playingPeriod != null && playingPeriod.f62622f.f62654h && this.B;
    }

    public final boolean y() {
        b0 playingPeriod;
        b0 next;
        return A() && !this.C && (playingPeriod = this.f62919t.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.M >= next.getStartPositionRendererTime() && next.f62623g;
    }

    public final boolean z() {
        if (!h()) {
            return false;
        }
        b0 loadingPeriod = this.f62919t.getLoadingPeriod();
        return this.f62906g.shouldContinueLoading(loadingPeriod == this.f62919t.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.M) : loadingPeriod.toPeriodTime(this.M) - loadingPeriod.f62622f.f62648b, a(loadingPeriod.getNextLoadPositionUs()), this.f62915p.getPlaybackParameters().f62784a);
    }

    public final void b(int i10) {
        j0 j0Var = this.f62924y;
        if (j0Var.f62761e != i10) {
            this.f62924y = j0Var.copyWithPlaybackState(i10);
        }
    }

    @Override // io.odeeo.internal.a0.r.a, io.odeeo.internal.a0.e0.a
    public void onContinueLoadingRequested(io.odeeo.internal.a0.r rVar) {
        this.f62908i.obtainMessage(9, rVar).sendToTarget();
    }

    public final void a(IOException iOException, int i10) {
        n nVarCreateForSource = n.createForSource(iOException, i10);
        b0 playingPeriod = this.f62919t.getPlayingPeriod();
        if (playingPeriod != null) {
            nVarCreateForSource = nVarCreateForSource.a(playingPeriod.f62622f.f62647a);
        }
        io.odeeo.internal.q0.p.e("ExoPlayerImplInternal", "Playback error", nVarCreateForSource);
        a(false, false);
        this.f62924y = this.f62924y.copyWithPlaybackError(nVarCreateForSource);
    }

    public final void b(boolean z10) {
        for (b0 playingPeriod = this.f62919t.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (io.odeeo.internal.n0.d dVar : playingPeriod.getTrackSelectorResult().f65057c) {
                if (dVar != null) {
                    dVar.onPlayWhenReadyChanged(z10);
                }
            }
        }
    }

    public final long f() {
        return a(this.f62924y.f62773q);
    }

    public final long d() {
        j0 j0Var = this.f62924y;
        return a(j0Var.f62757a, j0Var.f62758b.f62447a, j0Var.f62775s);
    }

    public final void e(m0 m0Var) {
        Looper looper = m0Var.getLooper();
        if (!looper.getThread().isAlive()) {
            io.odeeo.internal.q0.p.w("TAG", "Trying to send message on a dead thread.");
            m0Var.markAsProcessed(false);
        } else {
            this.f62917r.createHandler(looper, null).post(new im.k(14, this, m0Var));
        }
    }

    public final void c(long j10, long j11) {
        this.f62908i.removeMessages(2);
        this.f62908i.sendEmptyMessageAtTime(2, j10 + j11);
    }

    public final void d(m0 m0Var) throws n {
        if (m0Var.getLooper() == this.f62910k) {
            a(m0Var);
            int i10 = this.f62924y.f62761e;
            if (i10 == 3 || i10 == 2) {
                this.f62908i.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f62908i.obtainMessage(15, m0Var).sendToTarget();
    }

    public final void b() throws n, IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean zA;
        boolean z13;
        long jUptimeMillis = this.f62917r.uptimeMillis();
        E();
        int i11 = this.f62924y.f62761e;
        boolean z14 = true;
        if (i11 != 1 && i11 != 4) {
            b0 playingPeriod = this.f62919t.getPlayingPeriod();
            if (playingPeriod == null) {
                c(jUptimeMillis, 10L);
                return;
            }
            io.odeeo.internal.q0.f0.beginSection("doSomeWork");
            F();
            if (playingPeriod.f62620d) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                playingPeriod.f62617a.discardBuffer(this.f62924y.f62775s - this.f62913n, this.f62914o);
                z11 = true;
                z12 = true;
                int i12 = 0;
                while (true) {
                    p0[] p0VarArr = this.f62901a;
                    if (i12 >= p0VarArr.length) {
                        break;
                    }
                    p0 p0Var = p0VarArr[i12];
                    if (c(p0Var)) {
                        z13 = z14;
                        p0Var.render(this.M, jElapsedRealtime);
                        z11 = (z11 && p0Var.isEnded()) ? z13 : false;
                        boolean z15 = playingPeriod.f62619c[i12] != p0Var.getStream() ? z13 : false;
                        boolean z16 = (z15 || ((z15 || !p0Var.hasReadStreamToEnd()) ? false : z13) || p0Var.isReady() || p0Var.isEnded()) ? z13 : false;
                        z12 = (z12 && z16) ? z13 : false;
                        if (!z16) {
                            p0Var.maybeThrowStreamError();
                        }
                    } else {
                        z13 = z14;
                    }
                    i12++;
                    z14 = z13;
                }
                z10 = z14;
            } else {
                z10 = true;
                playingPeriod.f62617a.maybeThrowPrepareError();
                z11 = true;
                z12 = true;
            }
            long j10 = playingPeriod.f62622f.f62651e;
            boolean z17 = (z11 && playingPeriod.f62620d && (j10 == C.TIME_UNSET || j10 <= this.f62924y.f62775s)) ? z10 : false;
            if (z17 && this.C) {
                this.C = false;
                a(false, this.f62924y.f62769m, false, 5);
            }
            if (z17 && playingPeriod.f62622f.f62655i) {
                b(4);
                C();
            } else if (this.f62924y.f62761e == 2 && g(z12)) {
                b(3);
                this.P = null;
                if (A()) {
                    B();
                }
            } else if (this.f62924y.f62761e == 3 && (this.K != 0 ? !z12 : !i())) {
                this.D = A();
                b(2);
                if (this.D) {
                    s();
                    this.f62921v.notifyRebuffer();
                }
                C();
            }
            if (this.f62924y.f62761e == 2) {
                int i13 = 0;
                while (true) {
                    p0[] p0VarArr2 = this.f62901a;
                    if (i13 >= p0VarArr2.length) {
                        break;
                    }
                    if (c(p0VarArr2[i13]) && this.f62901a[i13].getStream() == playingPeriod.f62619c[i13]) {
                        this.f62901a[i13].maybeThrowStreamError();
                    }
                    i13++;
                }
                j0 j0Var = this.f62924y;
                if (!j0Var.f62763g && j0Var.f62774r < 500000 && h()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z18 = this.J;
            j0 j0Var2 = this.f62924y;
            if (z18 != j0Var2.f62771o) {
                this.f62924y = j0Var2.copyWithOffloadSchedulingEnabled(z18);
            }
            if ((A() && this.f62924y.f62761e == 3) || (i10 = this.f62924y.f62761e) == 2) {
                zA = a(jUptimeMillis, 10L) ^ z10;
            } else {
                if (this.K != 0 && i10 != 4) {
                    c(jUptimeMillis, 1000L);
                } else {
                    this.f62908i.removeMessages(2);
                }
                zA = false;
            }
            j0 j0Var3 = this.f62924y;
            if (j0Var3.f62772p != zA) {
                this.f62924y = j0Var3.copyWithSleepingForOffload(zA);
            }
            this.I = false;
            io.odeeo.internal.q0.f0.endSection();
            return;
        }
        this.f62908i.removeMessages(2);
    }

    public final void c(m0 m0Var) throws n {
        if (m0Var.getPositionMs() == C.TIME_UNSET) {
            d(m0Var);
            return;
        }
        if (this.f62924y.f62757a.isEmpty()) {
            this.f62916q.add(new d(m0Var));
            return;
        }
        d dVar = new d(m0Var);
        y0 y0Var = this.f62924y.f62757a;
        if (a(dVar, y0Var, y0Var, this.F, this.G, this.f62911l, this.f62912m)) {
            this.f62916q.add(dVar);
            Collections.sort(this.f62916q);
        } else {
            m0Var.markAsProcessed(false);
        }
    }

    public final synchronized void a(io.odeeo.internal.t0.b0<Boolean> b0Var, long j10) {
        long jElapsedRealtime = this.f62917r.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!b0Var.get().booleanValue() && j10 > 0) {
            try {
                this.f62917r.onThreadBlocked();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - this.f62917r.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final long e() {
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.f62620d) {
            return rendererOffset;
        }
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f62901a;
            if (i10 >= p0VarArr.length) {
                return rendererOffset;
            }
            if (c(p0VarArr[i10]) && this.f62901a[i10].getStream() == readingPeriod.f62619c[i10]) {
                long readingPositionUs = this.f62901a[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i10++;
        }
    }

    public final boolean g() {
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        if (!readingPeriod.f62620d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f62901a;
            if (i10 >= p0VarArr.length) {
                return true;
            }
            p0 p0Var = p0VarArr[i10];
            io.odeeo.internal.a0.d0 d0Var = readingPeriod.f62619c[i10];
            if (p0Var.getStream() != d0Var || (d0Var != null && !p0Var.hasReadStreamToEnd() && !a(p0Var, readingPeriod))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final void a(b bVar) throws Throwable {
        this.f62925z.incrementPendingOperationAcks(1);
        if (bVar.f62929c != -1) {
            this.L = new h(new n0(bVar.f62927a, bVar.f62928b), bVar.f62929c, bVar.f62930d);
        }
        a(this.f62920u.setMediaSources(bVar.f62927a, bVar.f62928b), false);
    }

    public final void c(long j10) {
        for (p0 p0Var : this.f62901a) {
            if (p0Var.getStream() != null) {
                a(p0Var, j10);
            }
        }
    }

    public final void c() throws n {
        a(new boolean[this.f62901a.length]);
    }

    public static boolean c(p0 p0Var) {
        return p0Var.getState() != 0;
    }

    public final void a(b bVar, int i10) throws Throwable {
        this.f62925z.incrementPendingOperationAcks(1);
        f0 f0Var = this.f62920u;
        if (i10 == -1) {
            i10 = f0Var.getSize();
        }
        a(f0Var.addMediaSources(i10, bVar.f62927a, bVar.f62928b), false);
    }

    public final void a(c cVar) throws Throwable {
        this.f62925z.incrementPendingOperationAcks(1);
        a(this.f62920u.moveMediaSourceRange(cVar.f62931a, cVar.f62932b, cVar.f62933c, cVar.f62934d), false);
    }

    public final void a(int i10, int i11, io.odeeo.internal.a0.f0 f0Var) throws Throwable {
        this.f62925z.incrementPendingOperationAcks(1);
        a(this.f62920u.removeMediaSourceRange(i10, i11, f0Var), false);
    }

    public final void a(io.odeeo.internal.a0.f0 f0Var) throws Throwable {
        this.f62925z.incrementPendingOperationAcks(1);
        a(this.f62920u.setShuffleOrder(f0Var), false);
    }

    public final void a(boolean z10, int i10, boolean z11, int i11) throws n {
        this.f62925z.incrementPendingOperationAcks(z11 ? 1 : 0);
        this.f62925z.setPlayWhenReadyChangeReason(i11);
        this.f62924y = this.f62924y.copyWithPlayWhenReady(z10, i10);
        this.D = false;
        b(z10);
        if (!A()) {
            C();
            F();
            return;
        }
        int i12 = this.f62924y.f62761e;
        if (i12 == 3) {
            B();
            this.f62908i.sendEmptyMessage(2);
        } else if (i12 == 2) {
            this.f62908i.sendEmptyMessage(2);
        }
    }

    public final void a(int i10) throws n {
        this.F = i10;
        if (!this.f62919t.updateRepeatMode(this.f62924y.f62757a, i10)) {
            c(true);
        }
        a(false);
    }

    public final void a() throws n {
        c(true);
    }

    public final long a(y0 y0Var, Object obj, long j10) {
        y0Var.getWindow(y0Var.getPeriodByUid(obj, this.f62912m).f63077c, this.f62911l);
        y0.d dVar = this.f62911l;
        if (dVar.f63095f != C.TIME_UNSET && dVar.isLive()) {
            y0.d dVar2 = this.f62911l;
            if (dVar2.f63098i) {
                return io.odeeo.internal.q0.g0.msToUs(dVar2.getCurrentUnixTimeMs() - this.f62911l.f63095f) - (this.f62912m.getPositionInWindowUs() + j10);
            }
        }
        return C.TIME_UNSET;
    }

    public final boolean a(y0 y0Var, t.a aVar) {
        if (!aVar.isAd() && !y0Var.isEmpty()) {
            y0Var.getWindow(y0Var.getPeriodByUid(aVar.f62447a, this.f62912m).f63077c, this.f62911l);
            if (this.f62911l.isLive()) {
                y0.d dVar = this.f62911l;
                if (dVar.f63098i && dVar.f63095f != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(long j10) throws n {
        b0 playingPeriod = this.f62919t.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j10 + 1000000000000L : playingPeriod.toRendererTime(j10);
        this.M = rendererTime;
        this.f62915p.resetPosition(rendererTime);
        for (p0 p0Var : this.f62901a) {
            if (c(p0Var)) {
                p0Var.resetPosition(this.M);
            }
        }
        r();
    }

    public final boolean a(long j10, long j11) {
        if (this.J && this.I) {
            return false;
        }
        c(j10, j11);
        return true;
    }

    public final void a(h hVar) throws Throwable {
        long jLongValue;
        t.a aVarResolveMediaPeriodIdForAds;
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        t.a aVar;
        long j12;
        t.a aVar2;
        long adjustedSeekPositionUs;
        j0 j0Var;
        int i10;
        long jA;
        j0 j0Var2;
        y0 y0Var;
        t.a aVar3;
        long j13;
        t.a aVar4;
        long j14;
        this.f62925z.incrementPendingOperationAcks(1);
        Pair<Object, Long> pairA = a(this.f62924y.f62757a, hVar, true, this.F, this.G, this.f62911l, this.f62912m);
        if (pairA == null) {
            Pair<t.a, Long> pairA2 = a(this.f62924y.f62757a);
            aVarResolveMediaPeriodIdForAds = (t.a) pairA2.first;
            jLongValue = ((Long) pairA2.second).longValue();
            z10 = !this.f62924y.f62757a.isEmpty();
            j11 = -9223372036854775807L;
            j10 = 0;
        } else {
            Object obj = pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            long j15 = hVar.f62954c == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
            aVarResolveMediaPeriodIdForAds = this.f62919t.resolveMediaPeriodIdForAds(this.f62924y.f62757a, obj, jLongValue);
            if (aVarResolveMediaPeriodIdForAds.isAd()) {
                this.f62924y.f62757a.getPeriodByUid(aVarResolveMediaPeriodIdForAds.f62447a, this.f62912m);
                jLongValue = this.f62912m.getFirstAdIndexToPlay(aVarResolveMediaPeriodIdForAds.f62448b) == aVarResolveMediaPeriodIdForAds.f62449c ? this.f62912m.getAdResumePositionUs() : 0L;
                j10 = 0;
            } else {
                j10 = 0;
                if (hVar.f62954c != C.TIME_UNSET) {
                    z10 = false;
                }
                j11 = j15;
            }
            z10 = true;
            j11 = j15;
        }
        try {
            if (this.f62924y.f62757a.isEmpty()) {
                this.L = hVar;
            } else if (pairA == null) {
                if (this.f62924y.f62761e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (aVarResolveMediaPeriodIdForAds.equals(this.f62924y.f62758b)) {
                    try {
                        b0 playingPeriod = this.f62919t.getPlayingPeriod();
                        adjustedSeekPositionUs = (playingPeriod == null || !playingPeriod.f62620d || jLongValue == j10) ? jLongValue : playingPeriod.f62617a.getAdjustedSeekPositionUs(jLongValue, this.f62923x);
                        aVar2 = aVarResolveMediaPeriodIdForAds;
                        try {
                            if (io.odeeo.internal.q0.g0.usToMs(adjustedSeekPositionUs) != io.odeeo.internal.q0.g0.usToMs(this.f62924y.f62775s) || ((i10 = (j0Var = this.f62924y).f62761e) != 2 && i10 != 3)) {
                                z11 = z10;
                            }
                            long j16 = j0Var.f62775s;
                            this.f62924y = a(aVar2, j16, j11, j16, z10, 2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = z10;
                            aVar = aVar2;
                            j12 = jLongValue;
                            this.f62924y = a(aVar, j12, j11, j12, z11, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z10;
                        aVar2 = aVarResolveMediaPeriodIdForAds;
                    }
                } else {
                    z11 = z10;
                    aVar2 = aVarResolveMediaPeriodIdForAds;
                    adjustedSeekPositionUs = jLongValue;
                }
                try {
                    jA = a(aVar2, adjustedSeekPositionUs, this.f62924y.f62761e == 4);
                    z10 = z11 | (jLongValue != jA);
                    try {
                        j0Var2 = this.f62924y;
                        y0Var = j0Var2.f62757a;
                        aVar3 = aVar2;
                        j13 = j11;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar = aVar2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    aVar = aVar2;
                    j12 = jLongValue;
                    this.f62924y = a(aVar, j12, j11, j12, z11, 2);
                    throw th;
                }
                try {
                    a(y0Var, aVar3, y0Var, j0Var2.f62758b, j13);
                    aVar4 = aVar3;
                    j11 = j13;
                    j14 = jA;
                    this.f62924y = a(aVar4, j14, j11, j14, z10, 2);
                } catch (Throwable th6) {
                    th = th6;
                    aVar = aVar3;
                    j11 = j13;
                    z11 = z10;
                    j12 = jA;
                    this.f62924y = a(aVar, j12, j11, j12, z11, 2);
                    throw th;
                }
            }
            aVar4 = aVarResolveMediaPeriodIdForAds;
            j14 = jLongValue;
            this.f62924y = a(aVar4, j14, j11, j14, z10, 2);
        } catch (Throwable th7) {
            th = th7;
            z11 = z10;
            aVar = aVarResolveMediaPeriodIdForAds;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(m0 m0Var) {
        try {
            a(m0Var);
        } catch (n e10) {
            io.odeeo.internal.q0.p.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r9, long r11) throws io.odeeo.internal.b.n {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.b.q.b(long, long):void");
    }

    public final void b(p0 p0Var) throws n {
        if (p0Var.getState() == 2) {
            p0Var.stop();
        }
    }

    public final void b(io.odeeo.internal.a0.r rVar) throws n {
        if (this.f62919t.isLoading(rVar)) {
            b0 loadingPeriod = this.f62919t.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.f62915p.getPlaybackParameters().f62784a, this.f62924y.f62757a);
            a(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.f62919t.getPlayingPeriod()) {
                b(loadingPeriod.f62622f.f62648b);
                c();
                j0 j0Var = this.f62924y;
                t.a aVar = j0Var.f62758b;
                long j10 = loadingPeriod.f62622f.f62648b;
                this.f62924y = a(aVar, j10, j0Var.f62759c, j10, false, 5);
            }
            k();
        }
    }

    public final long a(t.a aVar, long j10, boolean z10) throws n {
        return a(aVar, j10, this.f62919t.getPlayingPeriod() != this.f62919t.getReadingPeriod(), z10);
    }

    public final long a(t.a aVar, long j10, boolean z10, boolean z11) throws n {
        C();
        this.D = false;
        if (z11 || this.f62924y.f62761e == 3) {
            b(2);
        }
        b0 playingPeriod = this.f62919t.getPlayingPeriod();
        b0 next = playingPeriod;
        while (next != null && !aVar.equals(next.f62622f.f62647a)) {
            next = next.getNext();
        }
        if (z10 || playingPeriod != next || (next != null && next.toRendererTime(j10) < 0)) {
            for (p0 p0Var : this.f62901a) {
                a(p0Var);
            }
            if (next != null) {
                while (this.f62919t.getPlayingPeriod() != next) {
                    this.f62919t.advancePlayingPeriod();
                }
                this.f62919t.removeAfter(next);
                next.setRendererOffset(1000000000000L);
                c();
            }
        }
        if (next != null) {
            this.f62919t.removeAfter(next);
            if (!next.f62620d) {
                next.f62622f = next.f62622f.copyWithStartPositionUs(j10);
            } else if (next.f62621e) {
                j10 = next.f62617a.seekToUs(j10);
                next.f62617a.discardBuffer(j10 - this.f62913n, this.f62914o);
            }
            b(j10);
            k();
        } else {
            this.f62919t.clear();
            b(j10);
        }
        a(false);
        this.f62908i.sendEmptyMessage(2);
        return j10;
    }

    public final void a(k0 k0Var) throws n {
        this.f62915p.setPlaybackParameters(k0Var);
        a(this.f62915p.getPlaybackParameters(), true);
    }

    public final void a(t0 t0Var) {
        this.f62923x = t0Var;
    }

    public final void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (p0 p0Var : this.f62901a) {
                    if (!c(p0Var) && this.f62902b.remove(p0Var)) {
                        p0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void a(boolean z10, boolean z11) {
        a(z10 || !this.H, false, true, false);
        this.f62925z.incrementPendingOperationAcks(z11 ? 1 : 0);
        this.f62906g.onStopped();
        b(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[PHI: r4 r5 r7
      0x00a3: PHI (r4v3 io.odeeo.internal.a0.t$a) = (r4v2 io.odeeo.internal.a0.t$a), (r4v8 io.odeeo.internal.a0.t$a) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.b.q.a(boolean, boolean, boolean, boolean):void");
    }

    public final Pair<t.a, Long> a(y0 y0Var) {
        long adResumePositionUs = 0;
        if (y0Var.isEmpty()) {
            return Pair.create(j0.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPosition = y0Var.getPeriodPosition(this.f62911l, this.f62912m, y0Var.getFirstWindowIndex(this.G), C.TIME_UNSET);
        t.a aVarResolveMediaPeriodIdForAds = this.f62919t.resolveMediaPeriodIdForAds(y0Var, periodPosition.first, 0L);
        long jLongValue = ((Long) periodPosition.second).longValue();
        if (aVarResolveMediaPeriodIdForAds.isAd()) {
            y0Var.getPeriodByUid(aVarResolveMediaPeriodIdForAds.f62447a, this.f62912m);
            if (aVarResolveMediaPeriodIdForAds.f62449c == this.f62912m.getFirstAdIndexToPlay(aVarResolveMediaPeriodIdForAds.f62448b)) {
                adResumePositionUs = this.f62912m.getAdResumePositionUs();
            }
        } else {
            adResumePositionUs = jLongValue;
        }
        return Pair.create(aVarResolveMediaPeriodIdForAds, Long.valueOf(adResumePositionUs));
    }

    public final void a(m0 m0Var) throws n {
        if (m0Var.isCanceled()) {
            return;
        }
        try {
            m0Var.getTarget().handleMessage(m0Var.getType(), m0Var.getPayload());
        } finally {
            m0Var.markAsProcessed(true);
        }
    }

    public final void a(y0 y0Var, y0 y0Var2) {
        if (y0Var.isEmpty() && y0Var2.isEmpty()) {
            return;
        }
        int size = this.f62916q.size() - 1;
        while (size >= 0) {
            y0 y0Var3 = y0Var;
            y0 y0Var4 = y0Var2;
            if (!a(this.f62916q.get(size), y0Var3, y0Var4, this.F, this.G, this.f62911l, this.f62912m)) {
                this.f62916q.get(size).f62935a.markAsProcessed(false);
                this.f62916q.remove(size);
            }
            size--;
            y0Var = y0Var3;
            y0Var2 = y0Var4;
        }
        Collections.sort(this.f62916q);
    }

    public final void a(p0 p0Var) throws n {
        if (c(p0Var)) {
            this.f62915p.onRendererDisabled(p0Var);
            b(p0Var);
            p0Var.disable();
            this.K--;
        }
    }

    public final void a(float f10) {
        for (b0 playingPeriod = this.f62919t.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (io.odeeo.internal.n0.d dVar : playingPeriod.getTrackSelectorResult().f65057c) {
                if (dVar != null) {
                    dVar.onPlaybackSpeed(f10);
                }
            }
        }
    }

    public final void a(y0 y0Var, boolean z10) throws Throwable {
        int i10;
        t.a aVar;
        long j10;
        y0 y0Var2;
        long j11;
        boolean z11;
        y0 y0Var3;
        y0 y0Var4;
        g gVarA = a(y0Var, this.f62924y, this.L, this.f62919t, this.F, this.G, this.f62911l, this.f62912m);
        t.a aVar2 = gVarA.f62946a;
        long j12 = gVarA.f62948c;
        boolean z12 = gVarA.f62949d;
        long jA = gVarA.f62947b;
        int i11 = 1;
        boolean z13 = (this.f62924y.f62758b.equals(aVar2) && jA == this.f62924y.f62775s) ? false : true;
        y0 y0Var5 = null;
        try {
            if (gVarA.f62950e) {
                if (this.f62924y.f62761e != 1) {
                    b(4);
                }
                a(false, false, false, true);
            }
            try {
                if (!z13) {
                    try {
                        try {
                            i10 = 4;
                            try {
                                i11 = -1;
                                try {
                                    y0Var3 = y0Var;
                                    if (!this.f62919t.updateQueuedPeriods(y0Var, this.M, e())) {
                                        c(false);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    y0Var5 = y0Var;
                                    aVar = aVar2;
                                    j10 = j12;
                                    y0Var2 = y0Var5;
                                    j0 j0Var = this.f62924y;
                                    y0 y0Var6 = j0Var.f62757a;
                                    t.a aVar3 = j0Var.f62758b;
                                    y0 y0Var7 = y0Var2;
                                    a(y0Var7, aVar, y0Var6, aVar3, gVarA.f62951f ? jA : -9223372036854775807L);
                                    if (z13 || j10 != this.f62924y.f62759c) {
                                        j0 j0Var2 = this.f62924y;
                                        Object obj = j0Var2.f62758b.f62447a;
                                        y0 y0Var8 = j0Var2.f62757a;
                                        if (!z13 || !z10 || y0Var8.isEmpty() || y0Var8.getPeriodByUid(obj, this.f62912m).f63080f) {
                                            j11 = j10;
                                            z11 = false;
                                        } else {
                                            j11 = j10;
                                            z11 = true;
                                        }
                                        this.f62924y = a(aVar, jA, j11, this.f62924y.f62760d, z11, y0Var7.getIndexOfPeriod(obj) == i11 ? i10 : 3);
                                    }
                                    x();
                                    a(y0Var7, this.f62924y.f62757a);
                                    this.f62924y = this.f62924y.copyWithTimeline(y0Var7);
                                    if (!y0Var7.isEmpty()) {
                                        this.L = null;
                                    }
                                    a(false);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                y0Var5 = y0Var;
                                i11 = -1;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            y0Var5 = y0Var;
                            i11 = -1;
                            i10 = 4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        y0Var5 = y0Var;
                        i11 = -1;
                        i10 = 4;
                    }
                } else {
                    y0Var3 = y0Var;
                    i11 = -1;
                    i10 = 4;
                    if (!y0Var3.isEmpty()) {
                        for (b0 playingPeriod = this.f62919t.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                            if (playingPeriod.f62622f.f62647a.equals(aVar2)) {
                                playingPeriod.f62622f = this.f62919t.getUpdatedMediaPeriodInfo(y0Var3, playingPeriod.f62622f);
                                playingPeriod.updateClipping();
                            }
                        }
                        jA = a(aVar2, jA, z12);
                    }
                }
                j0 j0Var3 = this.f62924y;
                a(y0Var3, aVar2, j0Var3.f62757a, j0Var3.f62758b, gVarA.f62951f ? jA : -9223372036854775807L);
                if (z13 || j12 != this.f62924y.f62759c) {
                    j0 j0Var4 = this.f62924y;
                    Object obj2 = j0Var4.f62758b.f62447a;
                    y0 y0Var9 = j0Var4.f62757a;
                    y0Var4 = y0Var3;
                    this.f62924y = a(aVar2, jA, j12, this.f62924y.f62760d, z13 && z10 && !y0Var9.isEmpty() && !y0Var9.getPeriodByUid(obj2, this.f62912m).f63080f, y0Var3.getIndexOfPeriod(obj2) == i11 ? i10 : 3);
                } else {
                    y0Var4 = y0Var3;
                }
                x();
                a(y0Var4, this.f62924y.f62757a);
                this.f62924y = this.f62924y.copyWithTimeline(y0Var4);
                if (!y0Var4.isEmpty()) {
                    this.L = null;
                }
                a(false);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            i11 = -1;
            i10 = 4;
            aVar = aVar2;
            j10 = j12;
            y0Var2 = y0Var;
        }
    }

    public final void a(y0 y0Var, t.a aVar, y0 y0Var2, t.a aVar2, long j10) {
        if (!y0Var.isEmpty() && a(y0Var, aVar)) {
            y0Var.getWindow(y0Var.getPeriodByUid(aVar.f62447a, this.f62912m).f63077c, this.f62911l);
            this.f62921v.setLiveConfiguration((z.g) io.odeeo.internal.q0.g0.castNonNull(this.f62911l.f63100k));
            if (j10 != C.TIME_UNSET) {
                this.f62921v.setTargetLiveOffsetOverrideUs(a(y0Var, aVar.f62447a, j10));
                return;
            }
            if (io.odeeo.internal.q0.g0.areEqual(!y0Var2.isEmpty() ? y0Var2.getWindow(y0Var2.getPeriodByUid(aVar2.f62447a, this.f62912m).f63077c, this.f62911l).f63090a : null, this.f62911l.f63090a)) {
                return;
            }
            this.f62921v.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
            return;
        }
        float f10 = this.f62915p.getPlaybackParameters().f62784a;
        k0 k0Var = this.f62924y.f62770n;
        if (f10 != k0Var.f62784a) {
            this.f62915p.setPlaybackParameters(k0Var);
        }
    }

    public final boolean a(p0 p0Var, b0 b0Var) {
        b0 next = b0Var.getNext();
        if (b0Var.f62622f.f62652f && next.f62620d) {
            return (p0Var instanceof io.odeeo.internal.d0.n) || p0Var.getReadingPositionUs() >= next.getStartPositionRendererTime();
        }
        return false;
    }

    public final void a(p0 p0Var, long j10) {
        p0Var.setCurrentStreamFinal();
        if (p0Var instanceof io.odeeo.internal.d0.n) {
            ((io.odeeo.internal.d0.n) p0Var).setFinalStreamEndPositionUs(j10);
        }
    }

    public final void a(io.odeeo.internal.a0.r rVar) {
        if (this.f62919t.isLoading(rVar)) {
            this.f62919t.reevaluateBuffer(this.M);
            k();
        }
    }

    public final void a(k0 k0Var, boolean z10) throws n {
        a(k0Var, k0Var.f62784a, true, z10);
    }

    public final void a(k0 k0Var, float f10, boolean z10, boolean z11) throws n {
        if (z10) {
            if (z11) {
                this.f62925z.incrementPendingOperationAcks(1);
            }
            this.f62924y = this.f62924y.copyWithPlaybackParameters(k0Var);
        }
        a(k0Var.f62784a);
        for (p0 p0Var : this.f62901a) {
            if (p0Var != null) {
                p0Var.setPlaybackSpeed(f10, k0Var.f62784a);
            }
        }
    }

    public final j0 a(t.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        io.odeeo.internal.a0.l0 l0Var;
        io.odeeo.internal.n0.l lVar;
        io.odeeo.internal.a0.l0 trackGroups;
        io.odeeo.internal.n0.l trackSelectorResult;
        this.O = (!this.O && j10 == this.f62924y.f62775s && aVar.equals(this.f62924y.f62758b)) ? false : true;
        x();
        j0 j0Var = this.f62924y;
        io.odeeo.internal.a0.l0 l0Var2 = j0Var.f62764h;
        io.odeeo.internal.n0.l lVar2 = j0Var.f62765i;
        List listOf = j0Var.f62766j;
        if (this.f62920u.isPrepared()) {
            b0 playingPeriod = this.f62919t.getPlayingPeriod();
            if (playingPeriod == null) {
                trackGroups = io.odeeo.internal.a0.l0.f62399d;
            } else {
                trackGroups = playingPeriod.getTrackGroups();
            }
            if (playingPeriod == null) {
                trackSelectorResult = this.f62905f;
            } else {
                trackSelectorResult = playingPeriod.getTrackSelectorResult();
            }
            List listA = a(trackSelectorResult.f65057c);
            if (playingPeriod != null) {
                c0 c0Var = playingPeriod.f62622f;
                if (c0Var.f62649c != j11) {
                    playingPeriod.f62622f = c0Var.copyWithRequestedContentPositionUs(j11);
                }
            }
            l0Var = trackGroups;
            lVar = trackSelectorResult;
            list = listA;
        } else {
            if (!aVar.equals(this.f62924y.f62758b)) {
                l0Var2 = io.odeeo.internal.a0.l0.f62399d;
                lVar2 = this.f62905f;
                listOf = h1.of();
            }
            list = listOf;
            l0Var = l0Var2;
            lVar = lVar2;
        }
        if (z10) {
            this.f62925z.setPositionDiscontinuity(i10);
        }
        return this.f62924y.copyWithNewPosition(aVar, j10, j11, j12, f(), l0Var, lVar, list);
    }

    public final h1<io.odeeo.internal.s.a> a(io.odeeo.internal.n0.d[] dVarArr) {
        h1.a aVar = new h1.a();
        boolean z10 = false;
        for (io.odeeo.internal.n0.d dVar : dVarArr) {
            if (dVar != null) {
                io.odeeo.internal.s.a aVar2 = dVar.getFormat(0).f62969j;
                if (aVar2 == null) {
                    aVar.add((h1.a) new io.odeeo.internal.s.a(new a.b[0]));
                } else {
                    aVar.add((h1.a) aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.build() : h1.of();
    }

    public final void a(boolean[] zArr) throws n {
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        io.odeeo.internal.n0.l trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i10 = 0; i10 < this.f62901a.length; i10++) {
            if (!trackSelectorResult.isRendererEnabled(i10) && this.f62902b.remove(this.f62901a[i10])) {
                this.f62901a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f62901a.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11)) {
                a(i11, zArr[i11]);
            }
        }
        readingPeriod.f62623g = true;
    }

    public final void a(int i10, boolean z10) throws n {
        p0 p0Var = this.f62901a[i10];
        if (c(p0Var)) {
            return;
        }
        b0 readingPeriod = this.f62919t.getReadingPeriod();
        boolean z11 = readingPeriod == this.f62919t.getPlayingPeriod();
        io.odeeo.internal.n0.l trackSelectorResult = readingPeriod.getTrackSelectorResult();
        r0 r0Var = trackSelectorResult.f65056b[i10];
        t[] tVarArrA = a(trackSelectorResult.f65057c[i10]);
        boolean z12 = A() && this.f62924y.f62761e == 3;
        boolean z13 = !z10 && z12;
        this.K++;
        this.f62902b.add(p0Var);
        p0Var.enable(r0Var, tVarArrA, readingPeriod.f62619c[i10], this.M, z13, z11, readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
        p0Var.handleMessage(11, new a());
        this.f62915p.onRendererEnabled(p0Var);
        if (z12) {
            p0Var.start();
        }
    }

    public final void a(boolean z10) {
        long bufferedPositionUs;
        b0 loadingPeriod = this.f62919t.getLoadingPeriod();
        t.a aVar = loadingPeriod == null ? this.f62924y.f62758b : loadingPeriod.f62622f.f62647a;
        boolean zEquals = this.f62924y.f62767k.equals(aVar);
        if (!zEquals) {
            this.f62924y = this.f62924y.copyWithLoadingMediaPeriodId(aVar);
        }
        j0 j0Var = this.f62924y;
        if (loadingPeriod == null) {
            bufferedPositionUs = j0Var.f62775s;
        } else {
            bufferedPositionUs = loadingPeriod.getBufferedPositionUs();
        }
        j0Var.f62773q = bufferedPositionUs;
        this.f62924y.f62774r = f();
        if ((!zEquals || z10) && loadingPeriod != null && loadingPeriod.f62620d) {
            a(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    public final long a(long j10) {
        b0 loadingPeriod = this.f62919t.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j10 - loadingPeriod.toPeriodTime(this.M));
    }

    public final void a(io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.l lVar) {
        this.f62906g.onTracksSelected(this.f62901a, l0Var, lVar.f65057c);
    }

    public static g a(y0 y0Var, j0 j0Var, h hVar, d0 d0Var, int i10, boolean z10, y0.d dVar, y0.b bVar) {
        long j10;
        long j11;
        Object obj;
        int firstWindowIndex;
        long jLongValue;
        int firstWindowIndex2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        y0 y0Var2;
        y0.b bVar2;
        long j12;
        int i11;
        boolean z15;
        if (y0Var.isEmpty()) {
            return new g(j0.getDummyPeriodForEmptyTimeline(), 0L, C.TIME_UNSET, false, true, false);
        }
        t.a aVar = j0Var.f62758b;
        Object obj2 = aVar.f62447a;
        boolean zA = a(j0Var, bVar);
        if (!j0Var.f62758b.isAd() && !zA) {
            j10 = j0Var.f62775s;
        } else {
            j10 = j0Var.f62759c;
        }
        long j13 = j10;
        boolean z16 = false;
        if (hVar != null) {
            Pair<Object, Long> pairA = a(y0Var, hVar, true, i10, z10, dVar, bVar);
            if (pairA == null) {
                firstWindowIndex2 = y0Var.getFirstWindowIndex(z10);
                jLongValue = j13;
                j11 = -9223372036854775807L;
                z11 = false;
                z13 = false;
                z12 = true;
            } else {
                if (hVar.f62954c == C.TIME_UNSET) {
                    firstWindowIndex2 = y0Var.getPeriodByUid(pairA.first, bVar).f63077c;
                    jLongValue = j13;
                    z15 = false;
                } else {
                    obj2 = pairA.first;
                    jLongValue = ((Long) pairA.second).longValue();
                    firstWindowIndex2 = -1;
                    z15 = true;
                }
                j11 = -9223372036854775807L;
                z13 = z15;
                if (j0Var.f62761e == 4) {
                    z12 = false;
                    z11 = true;
                } else {
                    z11 = false;
                    z12 = false;
                }
            }
        } else {
            j11 = -9223372036854775807L;
            if (j0Var.f62757a.isEmpty()) {
                firstWindowIndex2 = y0Var.getFirstWindowIndex(z10);
            } else {
                if (y0Var.getIndexOfPeriod(obj2) == -1) {
                    obj = obj2;
                    Object objA = a(dVar, bVar, i10, z10, obj, j0Var.f62757a, y0Var);
                    if (objA == null) {
                        firstWindowIndex = y0Var.getFirstWindowIndex(z10);
                        z14 = true;
                        z12 = z14;
                        firstWindowIndex2 = firstWindowIndex;
                        obj2 = obj;
                        jLongValue = j13;
                        z11 = false;
                        z13 = false;
                    } else {
                        firstWindowIndex = y0Var.getPeriodByUid(objA, bVar).f63077c;
                    }
                } else {
                    obj = obj2;
                    if (j13 == C.TIME_UNSET) {
                        firstWindowIndex2 = y0Var.getPeriodByUid(obj, bVar).f63077c;
                        obj2 = obj;
                    } else if (zA) {
                        j0Var.f62757a.getPeriodByUid(aVar.f62447a, bVar);
                        if (j0Var.f62757a.getWindow(bVar.f63077c, dVar).f63104o == j0Var.f62757a.getIndexOfPeriod(aVar.f62447a)) {
                            Pair<Object, Long> periodPosition = y0Var.getPeriodPosition(dVar, bVar, y0Var.getPeriodByUid(obj, bVar).f63077c, bVar.getPositionInWindowUs() + j13);
                            obj2 = periodPosition.first;
                            jLongValue = ((Long) periodPosition.second).longValue();
                        } else {
                            obj2 = obj;
                            jLongValue = j13;
                        }
                        firstWindowIndex2 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        firstWindowIndex = -1;
                    }
                }
                z14 = false;
                z12 = z14;
                firstWindowIndex2 = firstWindowIndex;
                obj2 = obj;
                jLongValue = j13;
                z11 = false;
                z13 = false;
            }
            jLongValue = j13;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (firstWindowIndex2 != -1) {
            y0Var2 = y0Var;
            Pair<Object, Long> periodPosition2 = y0Var2.getPeriodPosition(dVar, bVar, firstWindowIndex2, C.TIME_UNSET);
            bVar2 = bVar;
            obj2 = periodPosition2.first;
            jLongValue = ((Long) periodPosition2.second).longValue();
            j12 = j11;
        } else {
            y0Var2 = y0Var;
            bVar2 = bVar;
            j12 = jLongValue;
        }
        t.a aVarResolveMediaPeriodIdForAds = d0Var.resolveMediaPeriodIdForAds(y0Var2, obj2, jLongValue);
        boolean z17 = aVarResolveMediaPeriodIdForAds.f62451e == -1 || ((i11 = aVar.f62451e) != -1 && aVarResolveMediaPeriodIdForAds.f62448b >= i11);
        boolean zEquals = aVar.f62447a.equals(obj2);
        boolean z18 = zEquals && !aVar.isAd() && !aVarResolveMediaPeriodIdForAds.isAd() && z17;
        y0Var2.getPeriodByUid(obj2, bVar2);
        if (zEquals && !zA && j13 == j12 && ((aVarResolveMediaPeriodIdForAds.isAd() && bVar2.isServerSideInsertedAdGroup(aVarResolveMediaPeriodIdForAds.f62448b)) || (aVar.isAd() && bVar2.isServerSideInsertedAdGroup(aVar.f62448b)))) {
            z16 = true;
        }
        if (z18 || z16) {
            aVarResolveMediaPeriodIdForAds = aVar;
        }
        if (aVarResolveMediaPeriodIdForAds.isAd()) {
            if (aVarResolveMediaPeriodIdForAds.equals(aVar)) {
                jLongValue = j0Var.f62775s;
            } else {
                y0Var2.getPeriodByUid(aVarResolveMediaPeriodIdForAds.f62447a, bVar2);
                jLongValue = aVarResolveMediaPeriodIdForAds.f62449c == bVar2.getFirstAdIndexToPlay(aVarResolveMediaPeriodIdForAds.f62448b) ? bVar2.getAdResumePositionUs() : 0L;
            }
        }
        return new g(aVarResolveMediaPeriodIdForAds, jLongValue, j12, z11, z12, z13);
    }

    public static boolean a(j0 j0Var, y0.b bVar) {
        t.a aVar = j0Var.f62758b;
        y0 y0Var = j0Var.f62757a;
        return y0Var.isEmpty() || y0Var.getPeriodByUid(aVar.f62447a, bVar).f63080f;
    }

    public static boolean a(d dVar, y0 y0Var, y0 y0Var2, int i10, boolean z10, y0.d dVar2, y0.b bVar) {
        Object obj = dVar.f62938d;
        if (obj == null) {
            Pair<Object, Long> pairA = a(y0Var, new h(dVar.f62935a.getTimeline(), dVar.f62935a.getMediaItemIndex(), dVar.f62935a.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : io.odeeo.internal.q0.g0.msToUs(dVar.f62935a.getPositionMs())), false, i10, z10, dVar2, bVar);
            if (pairA == null) {
                return false;
            }
            dVar.setResolvedPosition(y0Var.getIndexOfPeriod(pairA.first), ((Long) pairA.second).longValue(), pairA.first);
            if (dVar.f62935a.getPositionMs() == Long.MIN_VALUE) {
                a(y0Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int indexOfPeriod = y0Var.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (dVar.f62935a.getPositionMs() == Long.MIN_VALUE) {
            a(y0Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f62936b = indexOfPeriod;
        y0Var2.getPeriodByUid(dVar.f62938d, bVar);
        if (bVar.f63080f && y0Var2.getWindow(bVar.f63077c, dVar2).f63104o == y0Var2.getIndexOfPeriod(dVar.f62938d)) {
            Pair<Object, Long> periodPosition = y0Var.getPeriodPosition(dVar2, bVar, y0Var.getPeriodByUid(dVar.f62938d, bVar).f63077c, bVar.getPositionInWindowUs() + dVar.f62937c);
            dVar.setResolvedPosition(y0Var.getIndexOfPeriod(periodPosition.first), ((Long) periodPosition.second).longValue(), periodPosition.first);
        }
        return true;
    }

    public static void a(y0 y0Var, d dVar, y0.d dVar2, y0.b bVar) {
        int i10 = y0Var.getWindow(y0Var.getPeriodByUid(dVar.f62938d, bVar).f63077c, dVar2).f63105p;
        Object obj = y0Var.getPeriod(i10, bVar, true).f63076b;
        long j10 = bVar.f63078d;
        dVar.setResolvedPosition(i10, j10 != C.TIME_UNSET ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    public static Pair<Object, Long> a(y0 y0Var, h hVar, boolean z10, int i10, boolean z11, y0.d dVar, y0.b bVar) {
        Pair<Object, Long> periodPosition;
        y0 y0Var2;
        Object objA;
        y0 y0Var3 = hVar.f62952a;
        if (y0Var.isEmpty()) {
            return null;
        }
        if (y0Var3.isEmpty()) {
            y0Var3 = y0Var;
        }
        try {
            periodPosition = y0Var3.getPeriodPosition(dVar, bVar, hVar.f62953b, hVar.f62954c);
            y0Var2 = y0Var3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (y0Var.equals(y0Var2)) {
            return periodPosition;
        }
        if (y0Var.getIndexOfPeriod(periodPosition.first) != -1) {
            return (y0Var2.getPeriodByUid(periodPosition.first, bVar).f63080f && y0Var2.getWindow(bVar.f63077c, dVar).f63104o == y0Var2.getIndexOfPeriod(periodPosition.first)) ? y0Var.getPeriodPosition(dVar, bVar, y0Var.getPeriodByUid(periodPosition.first, bVar).f63077c, hVar.f62954c) : periodPosition;
        }
        if (z10 && (objA = a(dVar, bVar, i10, z11, periodPosition.first, y0Var2, y0Var)) != null) {
            return y0Var.getPeriodPosition(dVar, bVar, y0Var.getPeriodByUid(objA, bVar).f63077c, C.TIME_UNSET);
        }
        return null;
    }

    public static Object a(y0.d dVar, y0.b bVar, int i10, boolean z10, Object obj, y0 y0Var, y0 y0Var2) {
        int indexOfPeriod = y0Var.getIndexOfPeriod(obj);
        int periodCount = y0Var.getPeriodCount();
        int i11 = 0;
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i11 < periodCount && indexOfPeriod2 == -1) {
            y0.d dVar2 = dVar;
            y0.b bVar2 = bVar;
            int i12 = i10;
            boolean z11 = z10;
            y0 y0Var3 = y0Var;
            nextPeriodIndex = y0Var3.getNextPeriodIndex(nextPeriodIndex, bVar2, dVar2, i12, z11);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = y0Var2.getIndexOfPeriod(y0Var3.getUidOfPeriod(nextPeriodIndex));
            i11++;
            y0Var = y0Var3;
            bVar = bVar2;
            dVar = dVar2;
            i10 = i12;
            z10 = z11;
        }
        if (indexOfPeriod2 == -1) {
            return null;
        }
        return y0Var2.getUidOfPeriod(indexOfPeriod2);
    }

    public static t[] a(io.odeeo.internal.n0.d dVar) {
        int length = dVar != null ? dVar.length() : 0;
        t[] tVarArr = new t[length];
        for (int i10 = 0; i10 < length; i10++) {
            tVarArr[i10] = dVar.getFormat(i10);
        }
        return tVarArr;
    }
}
