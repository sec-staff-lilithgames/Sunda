package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k2 {

    /* renamed from: t, reason: collision with root package name */
    public static final bf.d0 f27571t = new bf.d0(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final m3 f27572a;

    /* renamed from: b, reason: collision with root package name */
    public final bf.d0 f27573b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27574c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27575d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27576e;

    /* renamed from: f, reason: collision with root package name */
    public final r f27577f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27578g;

    /* renamed from: h, reason: collision with root package name */
    public final bf.n1 f27579h;

    /* renamed from: i, reason: collision with root package name */
    public final pf.x f27580i;

    /* renamed from: j, reason: collision with root package name */
    public final List f27581j;

    /* renamed from: k, reason: collision with root package name */
    public final bf.d0 f27582k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27583l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27584m;

    /* renamed from: n, reason: collision with root package name */
    public final l2 f27585n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f27586o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f27587p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f27588q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f27589r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f27590s;

    public k2(m3 m3Var, bf.d0 d0Var, long j10, long j11, int i10, r rVar, boolean z10, bf.n1 n1Var, pf.x xVar, List<Metadata> list, bf.d0 d0Var2, boolean z11, int i11, l2 l2Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.f27572a = m3Var;
        this.f27573b = d0Var;
        this.f27574c = j10;
        this.f27575d = j11;
        this.f27576e = i10;
        this.f27577f = rVar;
        this.f27578g = z10;
        this.f27579h = n1Var;
        this.f27580i = xVar;
        this.f27581j = list;
        this.f27582k = d0Var2;
        this.f27583l = z11;
        this.f27584m = i11;
        this.f27585n = l2Var;
        this.f27587p = j12;
        this.f27588q = j13;
        this.f27589r = j14;
        this.f27590s = j15;
        this.f27586o = z12;
    }

    public static k2 createDummy(pf.x xVar) {
        j3 j3Var = m3.f27695b;
        bf.n1 n1Var = bf.n1.f9354f;
        b5 b5VarOf = b5.of();
        l2 l2Var = l2.f27634f;
        bf.d0 d0Var = f27571t;
        return new k2(j3Var, d0Var, C.TIME_UNSET, 0L, 1, null, false, n1Var, xVar, b5VarOf, d0Var, false, 0, l2Var, 0L, 0L, 0L, 0L, false);
    }

    public static bf.d0 getDummyPeriodForEmptyTimeline() {
        return f27571t;
    }

    public k2 copyWithEstimatedPosition() {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, this.f27576e, this.f27577f, this.f27578g, this.f27579h, this.f27580i, this.f27581j, this.f27582k, this.f27583l, this.f27584m, this.f27585n, this.f27587p, this.f27588q, getEstimatedPositionUs(), SystemClock.elapsedRealtime(), this.f27586o);
    }

    public k2 copyWithIsLoading(boolean z10) {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, this.f27576e, this.f27577f, z10, this.f27579h, this.f27580i, this.f27581j, this.f27582k, this.f27583l, this.f27584m, this.f27585n, this.f27587p, this.f27588q, this.f27589r, this.f27590s, this.f27586o);
    }

    public k2 copyWithLoadingMediaPeriodId(bf.d0 d0Var) {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, this.f27576e, this.f27577f, this.f27578g, this.f27579h, this.f27580i, this.f27581j, d0Var, this.f27583l, this.f27584m, this.f27585n, this.f27587p, this.f27588q, this.f27589r, this.f27590s, this.f27586o);
    }

    public k2 copyWithNewPosition(bf.d0 d0Var, long j10, long j11, long j12, long j13, bf.n1 n1Var, pf.x xVar, List<Metadata> list) {
        return new k2(this.f27572a, d0Var, j11, j12, this.f27576e, this.f27577f, this.f27578g, n1Var, xVar, list, this.f27582k, this.f27583l, this.f27584m, this.f27585n, this.f27587p, j13, j10, SystemClock.elapsedRealtime(), this.f27586o);
    }

    public k2 copyWithPlayWhenReady(boolean z10, int i10) {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, this.f27576e, this.f27577f, this.f27578g, this.f27579h, this.f27580i, this.f27581j, this.f27582k, z10, i10, this.f27585n, this.f27587p, this.f27588q, this.f27589r, this.f27590s, this.f27586o);
    }

    public k2 copyWithPlaybackError(r rVar) {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, this.f27576e, rVar, this.f27578g, this.f27579h, this.f27580i, this.f27581j, this.f27582k, this.f27583l, this.f27584m, this.f27585n, this.f27587p, this.f27588q, this.f27589r, this.f27590s, this.f27586o);
    }

    public k2 copyWithPlaybackParameters(l2 l2Var) {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, this.f27576e, this.f27577f, this.f27578g, this.f27579h, this.f27580i, this.f27581j, this.f27582k, this.f27583l, this.f27584m, l2Var, this.f27587p, this.f27588q, this.f27589r, this.f27590s, this.f27586o);
    }

    public k2 copyWithPlaybackState(int i10) {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, i10, this.f27577f, this.f27578g, this.f27579h, this.f27580i, this.f27581j, this.f27582k, this.f27583l, this.f27584m, this.f27585n, this.f27587p, this.f27588q, this.f27589r, this.f27590s, this.f27586o);
    }

    public k2 copyWithSleepingForOffload(boolean z10) {
        return new k2(this.f27572a, this.f27573b, this.f27574c, this.f27575d, this.f27576e, this.f27577f, this.f27578g, this.f27579h, this.f27580i, this.f27581j, this.f27582k, this.f27583l, this.f27584m, this.f27585n, this.f27587p, this.f27588q, this.f27589r, this.f27590s, z10);
    }

    public k2 copyWithTimeline(m3 m3Var) {
        return new k2(m3Var, this.f27573b, this.f27574c, this.f27575d, this.f27576e, this.f27577f, this.f27578g, this.f27579h, this.f27580i, this.f27581j, this.f27582k, this.f27583l, this.f27584m, this.f27585n, this.f27587p, this.f27588q, this.f27589r, this.f27590s, this.f27586o);
    }

    public long getEstimatedPositionUs() {
        long j10;
        long j11;
        if (!isPlaying()) {
            return this.f27589r;
        }
        do {
            j10 = this.f27590s;
            j11 = this.f27589r;
        } while (j10 != this.f27590s);
        return com.google.android.exoplayer2.util.n1.msToUs(com.google.android.exoplayer2.util.n1.usToMs(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f27585n.f27637b)));
    }

    public boolean isPlaying() {
        return this.f27576e == 3 && this.f27583l && this.f27584m == 0;
    }

    public void updatePositionUs(long j10) {
        this.f27589r = j10;
        this.f27590s = SystemClock.elapsedRealtime();
    }
}
