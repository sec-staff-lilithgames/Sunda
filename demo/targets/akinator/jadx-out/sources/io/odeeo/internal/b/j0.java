package io.odeeo.internal.b;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.u0.h1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: t, reason: collision with root package name */
    public static final t.a f62756t = new t.a(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final y0 f62757a;

    /* renamed from: b, reason: collision with root package name */
    public final t.a f62758b;

    /* renamed from: c, reason: collision with root package name */
    public final long f62759c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f62761e;

    /* renamed from: f, reason: collision with root package name */
    public final n f62762f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62763g;

    /* renamed from: h, reason: collision with root package name */
    public final io.odeeo.internal.a0.l0 f62764h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.n0.l f62765i;

    /* renamed from: j, reason: collision with root package name */
    public final List<io.odeeo.internal.s.a> f62766j;

    /* renamed from: k, reason: collision with root package name */
    public final t.a f62767k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f62768l;

    /* renamed from: m, reason: collision with root package name */
    public final int f62769m;

    /* renamed from: n, reason: collision with root package name */
    public final k0 f62770n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f62771o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f62772p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f62773q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f62774r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f62775s;

    public j0(y0 y0Var, t.a aVar, long j10, long j11, int i10, n nVar, boolean z10, io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.l lVar, List<io.odeeo.internal.s.a> list, t.a aVar2, boolean z11, int i11, k0 k0Var, long j12, long j13, long j14, boolean z12, boolean z13) {
        this.f62757a = y0Var;
        this.f62758b = aVar;
        this.f62759c = j10;
        this.f62760d = j11;
        this.f62761e = i10;
        this.f62762f = nVar;
        this.f62763g = z10;
        this.f62764h = l0Var;
        this.f62765i = lVar;
        this.f62766j = list;
        this.f62767k = aVar2;
        this.f62768l = z11;
        this.f62769m = i11;
        this.f62770n = k0Var;
        this.f62773q = j12;
        this.f62774r = j13;
        this.f62775s = j14;
        this.f62771o = z12;
        this.f62772p = z13;
    }

    public static j0 createDummy(io.odeeo.internal.n0.l lVar) {
        y0 y0Var = y0.f63072a;
        t.a aVar = f62756t;
        return new j0(y0Var, aVar, C.TIME_UNSET, 0L, 1, null, false, io.odeeo.internal.a0.l0.f62399d, lVar, h1.of(), aVar, false, 0, k0.f62782d, 0L, 0L, 0L, false, false);
    }

    public static t.a getDummyPeriodForEmptyTimeline() {
        return f62756t;
    }

    public j0 copyWithIsLoading(boolean z10) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, this.f62761e, this.f62762f, z10, this.f62764h, this.f62765i, this.f62766j, this.f62767k, this.f62768l, this.f62769m, this.f62770n, this.f62773q, this.f62774r, this.f62775s, this.f62771o, this.f62772p);
    }

    public j0 copyWithLoadingMediaPeriodId(t.a aVar) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, this.f62761e, this.f62762f, this.f62763g, this.f62764h, this.f62765i, this.f62766j, aVar, this.f62768l, this.f62769m, this.f62770n, this.f62773q, this.f62774r, this.f62775s, this.f62771o, this.f62772p);
    }

    public j0 copyWithNewPosition(t.a aVar, long j10, long j11, long j12, long j13, io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.l lVar, List<io.odeeo.internal.s.a> list) {
        return new j0(this.f62757a, aVar, j11, j12, this.f62761e, this.f62762f, this.f62763g, l0Var, lVar, list, this.f62767k, this.f62768l, this.f62769m, this.f62770n, this.f62773q, j13, j10, this.f62771o, this.f62772p);
    }

    public j0 copyWithOffloadSchedulingEnabled(boolean z10) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, this.f62761e, this.f62762f, this.f62763g, this.f62764h, this.f62765i, this.f62766j, this.f62767k, this.f62768l, this.f62769m, this.f62770n, this.f62773q, this.f62774r, this.f62775s, z10, this.f62772p);
    }

    public j0 copyWithPlayWhenReady(boolean z10, int i10) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, this.f62761e, this.f62762f, this.f62763g, this.f62764h, this.f62765i, this.f62766j, this.f62767k, z10, i10, this.f62770n, this.f62773q, this.f62774r, this.f62775s, this.f62771o, this.f62772p);
    }

    public j0 copyWithPlaybackError(n nVar) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, this.f62761e, nVar, this.f62763g, this.f62764h, this.f62765i, this.f62766j, this.f62767k, this.f62768l, this.f62769m, this.f62770n, this.f62773q, this.f62774r, this.f62775s, this.f62771o, this.f62772p);
    }

    public j0 copyWithPlaybackParameters(k0 k0Var) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, this.f62761e, this.f62762f, this.f62763g, this.f62764h, this.f62765i, this.f62766j, this.f62767k, this.f62768l, this.f62769m, k0Var, this.f62773q, this.f62774r, this.f62775s, this.f62771o, this.f62772p);
    }

    public j0 copyWithPlaybackState(int i10) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, i10, this.f62762f, this.f62763g, this.f62764h, this.f62765i, this.f62766j, this.f62767k, this.f62768l, this.f62769m, this.f62770n, this.f62773q, this.f62774r, this.f62775s, this.f62771o, this.f62772p);
    }

    public j0 copyWithSleepingForOffload(boolean z10) {
        return new j0(this.f62757a, this.f62758b, this.f62759c, this.f62760d, this.f62761e, this.f62762f, this.f62763g, this.f62764h, this.f62765i, this.f62766j, this.f62767k, this.f62768l, this.f62769m, this.f62770n, this.f62773q, this.f62774r, this.f62775s, this.f62771o, z10);
    }

    public j0 copyWithTimeline(y0 y0Var) {
        return new j0(y0Var, this.f62758b, this.f62759c, this.f62760d, this.f62761e, this.f62762f, this.f62763g, this.f62764h, this.f62765i, this.f62766j, this.f62767k, this.f62768l, this.f62769m, this.f62770n, this.f62773q, this.f62774r, this.f62775s, this.f62771o, this.f62772p);
    }
}
