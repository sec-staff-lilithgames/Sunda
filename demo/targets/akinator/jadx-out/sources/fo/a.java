package fo;

import com.ironsource.W2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.v1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nh.b5;
import nh.i7;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a extends fo.b {

    /* renamed from: h, reason: collision with root package name */
    public final go.f f55784h;

    /* renamed from: i, reason: collision with root package name */
    public final long f55785i;

    /* renamed from: j, reason: collision with root package name */
    public final long f55786j;

    /* renamed from: k, reason: collision with root package name */
    public final long f55787k;

    /* renamed from: l, reason: collision with root package name */
    public final int f55788l;

    /* renamed from: m, reason: collision with root package name */
    public final int f55789m;

    /* renamed from: n, reason: collision with root package name */
    public final float f55790n;

    /* renamed from: o, reason: collision with root package name */
    public final float f55791o;

    /* renamed from: p, reason: collision with root package name */
    public final b5 f55792p;

    /* renamed from: q, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f55793q;

    /* renamed from: r, reason: collision with root package name */
    public float f55794r;

    /* renamed from: s, reason: collision with root package name */
    public int f55795s;

    /* renamed from: t, reason: collision with root package name */
    public int f55796t;

    /* renamed from: u, reason: collision with root package name */
    public long f55797u;

    /* renamed from: v, reason: collision with root package name */
    public co.p f55798v;

    /* renamed from: w, reason: collision with root package name */
    public long f55799w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: fo.a$a, reason: collision with other inner class name */
    public static final class C0565a {

        /* renamed from: a, reason: collision with root package name */
        public final long f55800a;

        /* renamed from: b, reason: collision with root package name */
        public final long f55801b;

        public C0565a(long j10, long j11) {
            this.f55800a = j10;
            this.f55801b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0565a)) {
                return false;
            }
            C0565a c0565a = (C0565a) obj;
            return this.f55800a == c0565a.f55800a && this.f55801b == c0565a.f55801b;
        }

        public int hashCode() {
            return (((int) this.f55800a) * 31) + ((int) this.f55801b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements k {

        /* renamed from: a, reason: collision with root package name */
        public final int f55802a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55803b;

        /* renamed from: c, reason: collision with root package name */
        public final int f55804c;

        /* renamed from: d, reason: collision with root package name */
        public final int f55805d;

        /* renamed from: e, reason: collision with root package name */
        public final int f55806e;

        /* renamed from: f, reason: collision with root package name */
        public final float f55807f;

        /* renamed from: g, reason: collision with root package name */
        public final float f55808g;

        /* renamed from: h, reason: collision with root package name */
        public final io.bidmachine.media3.common.util.g f55809h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
        @Override // fo.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final fo.l[] createTrackSelections(fo.j[] r25, go.f r26, ao.k0 r27, gn.u1 r28) {
            /*
                Method dump skipped, instructions count: 479
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.a.b.createTrackSelections(fo.j[], go.f, ao.k0, gn.u1):fo.l[]");
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, io.bidmachine.media3.common.util.g.f60717a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10) {
            this(i10, i11, i12, i13, i14, f10, 0.75f, io.bidmachine.media3.common.util.g.f60717a);
        }

        public b(int i10, int i11, int i12, float f10, float f11, io.bidmachine.media3.common.util.g gVar) {
            this(i10, i11, i12, 1279, 719, f10, f11, gVar);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, io.bidmachine.media3.common.util.g gVar) {
            this.f55802a = i10;
            this.f55803b = i11;
            this.f55804c = i12;
            this.f55805d = i13;
            this.f55806e = i14;
            this.f55807f = f10;
            this.f55808g = f11;
            this.f55809h = gVar;
        }
    }

    public a(v1 v1Var, int[] iArr, go.f fVar) {
        this(v1Var, iArr, 0, fVar, 10000L, W2.f35669h, W2.f35669h, 1279, 719, 0.7f, 0.75f, b5.of(), io.bidmachine.media3.common.util.g.f60717a);
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x4 x4Var = (x4) arrayList.get(i10);
            if (x4Var != null) {
                x4Var.add((Object) new C0565a(j10, jArr[i10]));
            }
        }
    }

    public static long c(List list) {
        if (!list.isEmpty()) {
            co.p pVar = (co.p) i7.getLast(list);
            long j10 = pVar.f12423g;
            if (j10 != C.TIME_UNSET) {
                long j11 = pVar.f12424h;
                if (j11 != C.TIME_UNSET) {
                    return j11 - j10;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final int b(long j10, long j11) {
        long jMax;
        go.o oVar = (go.o) this.f55784h;
        long bitrateEstimate = oVar.getBitrateEstimate();
        this.f55799w = bitrateEstimate;
        long j12 = (long) (bitrateEstimate * this.f55790n);
        long timeToFirstByteEstimateUs = oVar.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j11 == C.TIME_UNSET) {
            jMax = (long) (j12 / this.f55794r);
        } else {
            float f10 = j11;
            jMax = (long) ((j12 * Math.max((f10 / this.f55794r) - timeToFirstByteEstimateUs, 0.0f)) / f10);
        }
        b5 b5Var = this.f55792p;
        if (!b5Var.isEmpty()) {
            int i10 = 1;
            while (i10 < b5Var.size() - 1 && ((C0565a) b5Var.get(i10)).f55800a < jMax) {
                i10++;
            }
            C0565a c0565a = (C0565a) b5Var.get(i10 - 1);
            C0565a c0565a2 = (C0565a) b5Var.get(i10);
            long j13 = c0565a.f55800a;
            long j14 = c0565a.f55801b;
            jMax = ((long) (((jMax - j13) / (c0565a2.f55800a - j13)) * (c0565a2.f55801b - j14))) + j14;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f55811b; i12++) {
            if (j10 == Long.MIN_VALUE || !isTrackExcluded(i12, j10)) {
                if (getFormat(i12).f60660j <= jMax) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // fo.b, fo.l
    public void disable() {
        this.f55798v = null;
    }

    @Override // fo.b, fo.l
    public void enable() {
        this.f55797u = C.TIME_UNSET;
        this.f55798v = null;
    }

    @Override // fo.b, fo.l
    public int evaluateQueueSize(long j10, List<? extends co.p> list) {
        int i10;
        int i11;
        long jElapsedRealtime = ((q0) this.f55793q).elapsedRealtime();
        long j11 = this.f55797u;
        if (j11 != C.TIME_UNSET && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((co.p) i7.getLast(list)).equals(this.f55798v))) {
            return list.size();
        }
        this.f55797u = jElapsedRealtime;
        this.f55798v = list.isEmpty() ? null : (co.p) i7.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = a1.getPlayoutDurationForMediaDuration(list.get(size - 1).f12423g - j10, this.f55794r);
        long j12 = this.f55787k;
        if (playoutDurationForMediaDuration >= j12) {
            io.bidmachine.media3.common.b format = getFormat(b(jElapsedRealtime, c(list)));
            for (int i12 = 0; i12 < size; i12++) {
                co.p pVar = list.get(i12);
                io.bidmachine.media3.common.b bVar = pVar.f12420d;
                if (a1.getPlayoutDurationForMediaDuration(pVar.f12423g - j10, this.f55794r) >= j12 && bVar.f60660j < format.f60660j && (i10 = bVar.f60673w) != -1 && i10 <= this.f55789m && (i11 = bVar.f60672v) != -1 && i11 <= this.f55788l && i10 < format.f60673w) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // fo.b, fo.l
    public long getLatestBitrateEstimate() {
        return this.f55799w;
    }

    @Override // fo.b, fo.l
    public int getSelectedIndex() {
        return this.f55795s;
    }

    @Override // fo.b, fo.l
    public Object getSelectionData() {
        return null;
    }

    @Override // fo.b, fo.l
    public int getSelectionReason() {
        return this.f55796t;
    }

    @Override // fo.b, fo.l
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // fo.b, fo.l
    public void onPlaybackSpeed(float f10) {
        this.f55794r = f10;
    }

    @Override // fo.b, fo.l
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // fo.b, fo.l
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, co.e eVar, List list) {
        return super.shouldCancelChunkLoad(j10, eVar, list);
    }

    @Override // fo.b, fo.l
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends co.p> list, co.r[] rVarArr) {
        long jC;
        long jElapsedRealtime = ((q0) this.f55793q).elapsedRealtime();
        int i10 = this.f55795s;
        if (i10 >= rVarArr.length || !rVarArr[i10].next()) {
            int length = rVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    jC = c(list);
                    break;
                }
                co.r rVar = rVarArr[i11];
                if (rVar.next()) {
                    jC = rVar.getChunkEndTimeUs() - rVar.getChunkStartTimeUs();
                    break;
                }
                i11++;
            }
        } else {
            co.r rVar2 = rVarArr[this.f55795s];
            jC = rVar2.getChunkEndTimeUs() - rVar2.getChunkStartTimeUs();
        }
        int i12 = this.f55796t;
        if (i12 == 0) {
            this.f55796t = 1;
            this.f55795s = b(jElapsedRealtime, jC);
            return;
        }
        int i13 = this.f55795s;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((co.p) i7.getLast(list)).f12420d);
        if (iIndexOf != -1) {
            i12 = ((co.p) i7.getLast(list)).f12421e;
            i13 = iIndexOf;
        }
        int iB = b(jElapsedRealtime, jC);
        if (iB != i13 && !isTrackExcluded(i13, jElapsedRealtime)) {
            io.bidmachine.media3.common.b format = getFormat(i13);
            io.bidmachine.media3.common.b format2 = getFormat(iB);
            long jMin = this.f55785i;
            if (j12 != C.TIME_UNSET) {
                jMin = Math.min((long) ((jC != C.TIME_UNSET ? j12 - jC : j12) * this.f55791o), jMin);
            }
            int i14 = format2.f60660j;
            int i15 = format.f60660j;
            if ((i14 > i15 && j11 < jMin) || (i14 < i15 && j11 >= this.f55786j)) {
                iB = i13;
            }
        }
        if (iB != i13) {
            i12 = 3;
        }
        this.f55796t = i12;
        this.f55795s = iB;
    }

    public a(v1 v1Var, int[] iArr, int i10, go.f fVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, b5 b5Var, io.bidmachine.media3.common.util.g gVar) {
        long j13;
        super(v1Var, iArr, i10);
        if (j12 < j10) {
            b0.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f55784h = fVar;
        this.f55785i = j10 * 1000;
        this.f55786j = j11 * 1000;
        this.f55787k = j13 * 1000;
        this.f55788l = i11;
        this.f55789m = i12;
        this.f55790n = f10;
        this.f55791o = f11;
        this.f55792p = b5.copyOf((Collection) b5Var);
        this.f55793q = gVar;
        this.f55794r = 1.0f;
        this.f55796t = 0;
        this.f55797u = C.TIME_UNSET;
        this.f55799w = -2147483647L;
    }
}
