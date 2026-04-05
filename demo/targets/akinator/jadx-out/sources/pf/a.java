package pf;

import bf.m1;
import com.google.android.exoplayer2.util.d1;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.ironsource.W2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nh.b5;
import nh.i7;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends pf.b {

    /* renamed from: h, reason: collision with root package name */
    public final qf.g f80996h;

    /* renamed from: i, reason: collision with root package name */
    public final long f80997i;

    /* renamed from: j, reason: collision with root package name */
    public final long f80998j;

    /* renamed from: k, reason: collision with root package name */
    public final long f80999k;

    /* renamed from: l, reason: collision with root package name */
    public final int f81000l;

    /* renamed from: m, reason: collision with root package name */
    public final int f81001m;

    /* renamed from: n, reason: collision with root package name */
    public final float f81002n;

    /* renamed from: o, reason: collision with root package name */
    public final float f81003o;

    /* renamed from: p, reason: collision with root package name */
    public final b5 f81004p;

    /* renamed from: q, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.d f81005q;

    /* renamed from: r, reason: collision with root package name */
    public float f81006r;

    /* renamed from: s, reason: collision with root package name */
    public int f81007s;

    /* renamed from: t, reason: collision with root package name */
    public int f81008t;

    /* renamed from: u, reason: collision with root package name */
    public long f81009u;

    /* renamed from: v, reason: collision with root package name */
    public df.b f81010v;

    /* renamed from: w, reason: collision with root package name */
    public long f81011w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: pf.a$a, reason: collision with other inner class name */
    public static final class C0762a {

        /* renamed from: a, reason: collision with root package name */
        public final long f81012a;

        /* renamed from: b, reason: collision with root package name */
        public final long f81013b;

        public C0762a(long j10, long j11) {
            this.f81012a = j10;
            this.f81013b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0762a)) {
                return false;
            }
            C0762a c0762a = (C0762a) obj;
            return this.f81012a == c0762a.f81012a && this.f81013b == c0762a.f81013b;
        }

        public int hashCode() {
            return (((int) this.f81012a) * 31) + ((int) this.f81013b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f81014a;

        /* renamed from: b, reason: collision with root package name */
        public final int f81015b;

        /* renamed from: c, reason: collision with root package name */
        public final int f81016c;

        /* renamed from: d, reason: collision with root package name */
        public final int f81017d;

        /* renamed from: e, reason: collision with root package name */
        public final int f81018e;

        /* renamed from: f, reason: collision with root package name */
        public final float f81019f;

        /* renamed from: g, reason: collision with root package name */
        public final float f81020g;

        /* renamed from: h, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.d f81021h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
        @Override // pf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final pf.k[] createTrackSelections(pf.i[] r25, qf.g r26, bf.d0 r27, com.google.android.exoplayer2.m3 r28) {
            /*
                Method dump skipped, instructions count: 479
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.a.b.createTrackSelections(pf.i[], qf.g, bf.d0, com.google.android.exoplayer2.m3):pf.k[]");
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, com.google.android.exoplayer2.util.d.f28436a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10) {
            this(i10, i11, i12, i13, i14, f10, 0.75f, com.google.android.exoplayer2.util.d.f28436a);
        }

        public b(int i10, int i11, int i12, float f10, float f11, com.google.android.exoplayer2.util.d dVar) {
            this(i10, i11, i12, 1279, 719, f10, f11, dVar);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, com.google.android.exoplayer2.util.d dVar) {
            this.f81014a = i10;
            this.f81015b = i11;
            this.f81016c = i12;
            this.f81017d = i13;
            this.f81018e = i14;
            this.f81019f = f10;
            this.f81020g = f11;
            this.f81021h = dVar;
        }
    }

    public a(m1 m1Var, int[] iArr, qf.g gVar) {
        this(m1Var, iArr, 0, gVar, 10000L, W2.f35669h, W2.f35669h, 1279, 719, 0.7f, 0.75f, b5.of(), com.google.android.exoplayer2.util.d.f28436a);
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x4 x4Var = (x4) arrayList.get(i10);
            if (x4Var != null) {
                x4Var.add((Object) new C0762a(j10, jArr[i10]));
            }
        }
    }

    public static long c(List list) {
        if (!list.isEmpty()) {
            df.b bVar = (df.b) i7.getLast(list);
            long j10 = bVar.f52173d;
            if (j10 != C.TIME_UNSET) {
                long j11 = bVar.f52174e;
                if (j11 != C.TIME_UNSET) {
                    return j11 - j10;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final int b(long j10, long j11) {
        long jMax;
        qf.x xVar = (qf.x) this.f80996h;
        long bitrateEstimate = xVar.getBitrateEstimate();
        this.f81011w = bitrateEstimate;
        long j12 = (long) (bitrateEstimate * this.f81002n);
        long timeToFirstByteEstimateUs = xVar.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j11 == C.TIME_UNSET) {
            jMax = (long) (j12 / this.f81006r);
        } else {
            float f10 = j11;
            jMax = (long) ((j12 * Math.max((f10 / this.f81006r) - timeToFirstByteEstimateUs, 0.0f)) / f10);
        }
        b5 b5Var = this.f81004p;
        if (!b5Var.isEmpty()) {
            int i10 = 1;
            while (i10 < b5Var.size() - 1 && ((C0762a) b5Var.get(i10)).f81012a < jMax) {
                i10++;
            }
            C0762a c0762a = (C0762a) b5Var.get(i10 - 1);
            C0762a c0762a2 = (C0762a) b5Var.get(i10);
            long j13 = c0762a.f81012a;
            long j14 = c0762a.f81013b;
            jMax = ((long) (((jMax - j13) / (c0762a2.f81012a - j13)) * (c0762a2.f81013b - j14))) + j14;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f81023b; i12++) {
            if (j10 == Long.MIN_VALUE || !isTrackExcluded(i12, j10)) {
                if (getFormat(i12).f28798j <= jMax) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // pf.b, pf.k
    public void disable() {
        this.f81010v = null;
    }

    @Override // pf.b, pf.k
    public void enable() {
        this.f81009u = C.TIME_UNSET;
        this.f81010v = null;
    }

    @Override // pf.b, pf.k
    public int evaluateQueueSize(long j10, List<? extends df.b> list) {
        int i10;
        int i11;
        long jElapsedRealtime = ((d1) this.f81005q).elapsedRealtime();
        long j11 = this.f81009u;
        if (j11 != C.TIME_UNSET && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((df.b) i7.getLast(list)).equals(this.f81010v))) {
            return list.size();
        }
        this.f81009u = jElapsedRealtime;
        this.f81010v = list.isEmpty() ? null : (df.b) i7.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = n1.getPlayoutDurationForMediaDuration(list.get(size - 1).f52173d - j10, this.f81006r);
        long j12 = this.f80999k;
        if (playoutDurationForMediaDuration >= j12) {
            z0 format = getFormat(b(jElapsedRealtime, c(list)));
            for (int i12 = 0; i12 < size; i12++) {
                df.b bVar = list.get(i12);
                z0 z0Var = bVar.f52170a;
                if (n1.getPlayoutDurationForMediaDuration(bVar.f52173d - j10, this.f81006r) >= j12 && z0Var.f28798j < format.f28798j && (i10 = z0Var.f28808t) != -1 && i10 <= this.f81001m && (i11 = z0Var.f28807s) != -1 && i11 <= this.f81000l && i10 < format.f28808t) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // pf.b, pf.k
    public long getLatestBitrateEstimate() {
        return this.f81011w;
    }

    @Override // pf.b, pf.k
    public int getSelectedIndex() {
        return this.f81007s;
    }

    @Override // pf.b, pf.k
    public Object getSelectionData() {
        return null;
    }

    @Override // pf.b, pf.k
    public int getSelectionReason() {
        return this.f81008t;
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
        super.onPlayWhenReadyChanged(z10);
    }

    @Override // pf.b, pf.k
    public void onPlaybackSpeed(float f10) {
        this.f81006r = f10;
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, df.a aVar, List list) {
        return super.shouldCancelChunkLoad(j10, aVar, list);
    }

    @Override // pf.b, pf.k
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends df.b> list, df.c[] cVarArr) {
        long jElapsedRealtime = ((d1) this.f81005q).elapsedRealtime();
        int i10 = this.f81007s;
        if (i10 < cVarArr.length) {
            df.c cVar = cVarArr[i10];
            throw null;
        }
        if (cVarArr.length > 0) {
            df.c cVar2 = cVarArr[0];
            throw null;
        }
        long jC = c(list);
        int i11 = this.f81008t;
        if (i11 == 0) {
            this.f81008t = 1;
            this.f81007s = b(jElapsedRealtime, jC);
            return;
        }
        int i12 = this.f81007s;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((df.b) i7.getLast(list)).f52170a);
        if (iIndexOf != -1) {
            i11 = ((df.b) i7.getLast(list)).f52171b;
            i12 = iIndexOf;
        }
        int iB = b(jElapsedRealtime, jC);
        if (iB != i12 && !isTrackExcluded(i12, jElapsedRealtime)) {
            z0 format = getFormat(i12);
            z0 format2 = getFormat(iB);
            long jMin = this.f80997i;
            if (j12 != C.TIME_UNSET) {
                jMin = Math.min((long) ((jC != C.TIME_UNSET ? j12 - jC : j12) * this.f81003o), jMin);
            }
            int i13 = format2.f28798j;
            int i14 = format.f28798j;
            if ((i13 > i14 && j11 < jMin) || (i13 < i14 && j11 >= this.f80998j)) {
                iB = i12;
            }
        }
        if (iB != i12) {
            i11 = 3;
        }
        this.f81008t = i11;
        this.f81007s = iB;
    }

    public a(m1 m1Var, int[] iArr, int i10, qf.g gVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, b5 b5Var, com.google.android.exoplayer2.util.d dVar) {
        long j13;
        super(m1Var, iArr, i10);
        if (j12 < j10) {
            f0.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f80996h = gVar;
        this.f80997i = j10 * 1000;
        this.f80998j = j11 * 1000;
        this.f80999k = j13 * 1000;
        this.f81000l = i11;
        this.f81001m = i12;
        this.f81002n = f10;
        this.f81003o = f11;
        this.f81004p = b5.copyOf((Collection) b5Var);
        this.f81005q = dVar;
        this.f81006r = 1.0f;
        this.f81008t = 0;
        this.f81009u = C.TIME_UNSET;
        this.f81011w = Long.MIN_VALUE;
    }
}
