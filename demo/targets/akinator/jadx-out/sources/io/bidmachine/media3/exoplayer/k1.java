package io.bidmachine.media3.exoplayer;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k1 {

    /* renamed from: u, reason: collision with root package name */
    public static final ao.k0 f61302u = new ao.k0(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final gn.u1 f61303a;

    /* renamed from: b, reason: collision with root package name */
    public final ao.k0 f61304b;

    /* renamed from: c, reason: collision with root package name */
    public final long f61305c;

    /* renamed from: d, reason: collision with root package name */
    public final long f61306d;

    /* renamed from: e, reason: collision with root package name */
    public final int f61307e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f61308f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f61309g;

    /* renamed from: h, reason: collision with root package name */
    public final ao.b2 f61310h;

    /* renamed from: i, reason: collision with root package name */
    public final fo.v f61311i;

    /* renamed from: j, reason: collision with root package name */
    public final List f61312j;

    /* renamed from: k, reason: collision with root package name */
    public final ao.k0 f61313k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f61314l;

    /* renamed from: m, reason: collision with root package name */
    public final int f61315m;

    /* renamed from: n, reason: collision with root package name */
    public final int f61316n;

    /* renamed from: o, reason: collision with root package name */
    public final gn.c1 f61317o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f61318p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f61319q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f61320r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f61321s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f61322t;

    public k1(gn.u1 u1Var, ao.k0 k0Var, long j10, long j11, int i10, a0 a0Var, boolean z10, ao.b2 b2Var, fo.v vVar, List<gn.u0> list, ao.k0 k0Var2, boolean z11, int i11, int i12, gn.c1 c1Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.f61303a = u1Var;
        this.f61304b = k0Var;
        this.f61305c = j10;
        this.f61306d = j11;
        this.f61307e = i10;
        this.f61308f = a0Var;
        this.f61309g = z10;
        this.f61310h = b2Var;
        this.f61311i = vVar;
        this.f61312j = list;
        this.f61313k = k0Var2;
        this.f61314l = z11;
        this.f61315m = i11;
        this.f61316n = i12;
        this.f61317o = c1Var;
        this.f61319q = j12;
        this.f61320r = j13;
        this.f61321s = j14;
        this.f61322t = j15;
        this.f61318p = z12;
    }

    public static k1 createDummy(fo.v vVar) {
        gn.q1 q1Var = gn.u1.f58195a;
        ao.b2 b2Var = ao.b2.f7550d;
        b5 b5VarOf = b5.of();
        gn.c1 c1Var = gn.c1.f57844d;
        ao.k0 k0Var = f61302u;
        return new k1(q1Var, k0Var, C.TIME_UNSET, 0L, 1, null, false, b2Var, vVar, b5VarOf, k0Var, false, 1, 0, c1Var, 0L, 0L, 0L, 0L, false);
    }

    public static ao.k0 getDummyPeriodForEmptyTimeline() {
        return f61302u;
    }

    public k1 copyWithEstimatedPosition() {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, this.f61307e, this.f61308f, this.f61309g, this.f61310h, this.f61311i, this.f61312j, this.f61313k, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, this.f61320r, getEstimatedPositionUs(), SystemClock.elapsedRealtime(), this.f61318p);
    }

    public k1 copyWithIsLoading(boolean z10) {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, this.f61307e, this.f61308f, z10, this.f61310h, this.f61311i, this.f61312j, this.f61313k, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, this.f61320r, this.f61321s, this.f61322t, this.f61318p);
    }

    public k1 copyWithLoadingMediaPeriodId(ao.k0 k0Var) {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, this.f61307e, this.f61308f, this.f61309g, this.f61310h, this.f61311i, this.f61312j, k0Var, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, this.f61320r, this.f61321s, this.f61322t, this.f61318p);
    }

    public k1 copyWithNewPosition(ao.k0 k0Var, long j10, long j11, long j12, long j13, ao.b2 b2Var, fo.v vVar, List<gn.u0> list) {
        return new k1(this.f61303a, k0Var, j11, j12, this.f61307e, this.f61308f, this.f61309g, b2Var, vVar, list, this.f61313k, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, j13, j10, SystemClock.elapsedRealtime(), this.f61318p);
    }

    public k1 copyWithPlayWhenReady(boolean z10, int i10, int i11) {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, this.f61307e, this.f61308f, this.f61309g, this.f61310h, this.f61311i, this.f61312j, this.f61313k, z10, i10, i11, this.f61317o, this.f61319q, this.f61320r, this.f61321s, this.f61322t, this.f61318p);
    }

    public k1 copyWithPlaybackError(a0 a0Var) {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, this.f61307e, a0Var, this.f61309g, this.f61310h, this.f61311i, this.f61312j, this.f61313k, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, this.f61320r, this.f61321s, this.f61322t, this.f61318p);
    }

    public k1 copyWithPlaybackParameters(gn.c1 c1Var) {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, this.f61307e, this.f61308f, this.f61309g, this.f61310h, this.f61311i, this.f61312j, this.f61313k, this.f61314l, this.f61315m, this.f61316n, c1Var, this.f61319q, this.f61320r, this.f61321s, this.f61322t, this.f61318p);
    }

    public k1 copyWithPlaybackState(int i10) {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, i10, this.f61308f, this.f61309g, this.f61310h, this.f61311i, this.f61312j, this.f61313k, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, this.f61320r, this.f61321s, this.f61322t, this.f61318p);
    }

    public k1 copyWithSleepingForOffload(boolean z10) {
        return new k1(this.f61303a, this.f61304b, this.f61305c, this.f61306d, this.f61307e, this.f61308f, this.f61309g, this.f61310h, this.f61311i, this.f61312j, this.f61313k, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, this.f61320r, this.f61321s, this.f61322t, z10);
    }

    public k1 copyWithTimeline(gn.u1 u1Var) {
        return new k1(u1Var, this.f61304b, this.f61305c, this.f61306d, this.f61307e, this.f61308f, this.f61309g, this.f61310h, this.f61311i, this.f61312j, this.f61313k, this.f61314l, this.f61315m, this.f61316n, this.f61317o, this.f61319q, this.f61320r, this.f61321s, this.f61322t, this.f61318p);
    }

    public long getEstimatedPositionUs() {
        long j10;
        long j11;
        if (!isPlaying()) {
            return this.f61321s;
        }
        do {
            j10 = this.f61322t;
            j11 = this.f61321s;
        } while (j10 != this.f61322t);
        return io.bidmachine.media3.common.util.a1.msToUs(io.bidmachine.media3.common.util.a1.usToMs(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f61317o.f57847a)));
    }

    public boolean isPlaying() {
        return this.f61307e == 3 && this.f61314l && this.f61316n == 0;
    }

    public void updatePositionUs(long j10) {
        this.f61321s = j10;
        this.f61322t = SystemClock.elapsedRealtime();
    }
}
