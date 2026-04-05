package io.odeeo.internal.m;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.x.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f64598a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f64599b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64600c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f64598a = jArr;
        this.f64599b = jArr2;
        this.f64600c = j10 == C.TIME_UNSET ? g0.msToUs(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair<Long, Long> a(long j10, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = g0.binarySearchFloor(jArr, j10, true, true);
        long j11 = jArr[iBinarySearchFloor];
        long j12 = jArr2[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    public static c create(long j10, j jVar, long j11) {
        int length = jVar.f67518e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += jVar.f67516c + jVar.f67518e[i12];
            j12 += jVar.f67517d + jVar.f67519f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    @Override // io.odeeo.internal.m.e
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64600c;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        Pair<Long, Long> pairA = a(g0.usToMs(g0.constrainValue(j10, 0L, this.f64600c)), this.f64599b, this.f64598a);
        return new v.a(new w(g0.msToUs(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue()));
    }

    @Override // io.odeeo.internal.m.e
    public long getTimeUs(long j10) {
        return g0.msToUs(((Long) a(j10, this.f64598a, this.f64599b).second).longValue());
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public boolean isSeekable() {
        return true;
    }
}
