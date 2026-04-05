package io.odeeo.internal.n0;

import com.ironsource.W2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.k0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.n0.d;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.u0.e2;
import io.odeeo.internal.u0.f2;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.v1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a extends io.odeeo.internal.n0.b {

    /* renamed from: h, reason: collision with root package name */
    public final io.odeeo.internal.p0.d f64904h;

    /* renamed from: i, reason: collision with root package name */
    public final long f64905i;

    /* renamed from: j, reason: collision with root package name */
    public final long f64906j;

    /* renamed from: k, reason: collision with root package name */
    public final long f64907k;

    /* renamed from: l, reason: collision with root package name */
    public final int f64908l;

    /* renamed from: m, reason: collision with root package name */
    public final int f64909m;

    /* renamed from: n, reason: collision with root package name */
    public final float f64910n;

    /* renamed from: o, reason: collision with root package name */
    public final float f64911o;

    /* renamed from: p, reason: collision with root package name */
    public final h1<C0624a> f64912p;

    /* renamed from: q, reason: collision with root package name */
    public final io.odeeo.internal.q0.d f64913q;

    /* renamed from: r, reason: collision with root package name */
    public float f64914r;

    /* renamed from: s, reason: collision with root package name */
    public int f64915s;

    /* renamed from: t, reason: collision with root package name */
    public int f64916t;

    /* renamed from: u, reason: collision with root package name */
    public long f64917u;

    /* renamed from: v, reason: collision with root package name */
    public io.odeeo.internal.c0.b f64918v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.n0.a$a, reason: collision with other inner class name */
    public static final class C0624a {

        /* renamed from: a, reason: collision with root package name */
        public final long f64919a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64920b;

        public C0624a(long j10, long j11) {
            this.f64919a = j10;
            this.f64920b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0624a)) {
                return false;
            }
            C0624a c0624a = (C0624a) obj;
            return this.f64919a == c0624a.f64919a && this.f64920b == c0624a.f64920b;
        }

        public int hashCode() {
            return (((int) this.f64919a) * 31) + ((int) this.f64920b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f64921a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64922b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64923c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64924d;

        /* renamed from: e, reason: collision with root package name */
        public final int f64925e;

        /* renamed from: f, reason: collision with root package name */
        public final float f64926f;

        /* renamed from: g, reason: collision with root package name */
        public final float f64927g;

        /* renamed from: h, reason: collision with root package name */
        public final io.odeeo.internal.q0.d f64928h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public a a(k0 k0Var, int[] iArr, int i10, io.odeeo.internal.p0.d dVar, h1<C0624a> h1Var) {
            return new a(k0Var, iArr, i10, dVar, this.f64921a, this.f64922b, this.f64923c, this.f64924d, this.f64925e, this.f64926f, this.f64927g, h1Var, this.f64928h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // io.odeeo.internal.n0.d.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.odeeo.internal.n0.d[] createTrackSelections(io.odeeo.internal.n0.d.a[] r10, io.odeeo.internal.p0.d r11, io.odeeo.internal.a0.t.a r12, io.odeeo.internal.b.y0 r13) {
            /*
                r9 = this;
                io.odeeo.internal.u0.h1 r12 = io.odeeo.internal.n0.a.a(r10)
                int r13 = r10.length
                io.odeeo.internal.n0.d[] r13 = new io.odeeo.internal.n0.d[r13]
                r0 = 0
                r1 = r0
            L9:
                int r2 = r10.length
                if (r1 >= r2) goto L40
                r2 = r10[r1]
                if (r2 == 0) goto L15
                int[] r5 = r2.f64981b
                int r3 = r5.length
                if (r3 != 0) goto L17
            L15:
                r7 = r11
                goto L3c
            L17:
                int r3 = r5.length
                r4 = 1
                if (r3 != r4) goto L28
                io.odeeo.internal.n0.e r3 = new io.odeeo.internal.n0.e
                io.odeeo.internal.a0.k0 r4 = r2.f64980a
                r5 = r5[r0]
                int r2 = r2.f64982c
                r3.<init>(r4, r5, r2)
                r7 = r11
                goto L3a
            L28:
                io.odeeo.internal.a0.k0 r4 = r2.f64980a
                int r6 = r2.f64982c
                java.lang.Object r2 = r12.get(r1)
                r8 = r2
                io.odeeo.internal.u0.h1 r8 = (io.odeeo.internal.u0.h1) r8
                r3 = r9
                r7 = r11
                io.odeeo.internal.n0.a r11 = r3.a(r4, r5, r6, r7, r8)
                r3 = r11
            L3a:
                r13[r1] = r3
            L3c:
                int r1 = r1 + 1
                r11 = r7
                goto L9
            L40:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.n0.a.b.createTrackSelections(io.odeeo.internal.n0.d$a[], io.odeeo.internal.p0.d, io.odeeo.internal.a0.t$a, io.odeeo.internal.b.y0):io.odeeo.internal.n0.d[]");
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, io.odeeo.internal.q0.d.f65844a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10) {
            this(i10, i11, i12, i13, i14, f10, 0.75f, io.odeeo.internal.q0.d.f65844a);
        }

        public b(int i10, int i11, int i12, float f10, float f11, io.odeeo.internal.q0.d dVar) {
            this(i10, i11, i12, 1279, 719, f10, f11, dVar);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, io.odeeo.internal.q0.d dVar) {
            this.f64921a = i10;
            this.f64922b = i11;
            this.f64923c = i12;
            this.f64924d = i13;
            this.f64925e = i14;
            this.f64926f = f10;
            this.f64927g = f11;
            this.f64928h = dVar;
        }
    }

    public a(k0 k0Var, int[] iArr, io.odeeo.internal.p0.d dVar) {
        this(k0Var, iArr, 0, dVar, 10000L, W2.f35669h, W2.f35669h, 1279, 719, 0.7f, 0.75f, h1.of(), io.odeeo.internal.q0.d.f65844a);
    }

    public boolean a(t tVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    public final long b(long j10) {
        long bitrateEstimate = (long) (this.f64904h.getBitrateEstimate() * this.f64910n);
        long timeToFirstByteEstimateUs = this.f64904h.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j10 == C.TIME_UNSET) {
            return (long) (bitrateEstimate / this.f64914r);
        }
        float f10 = j10;
        return (long) ((bitrateEstimate * Math.max((f10 / this.f64914r) - timeToFirstByteEstimateUs, 0.0f)) / f10);
    }

    public final long c(long j10) {
        return (j10 == C.TIME_UNSET || j10 > this.f64905i) ? this.f64905i : (long) (j10 * this.f64911o);
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public void disable() {
        this.f64918v = null;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public void enable() {
        this.f64917u = C.TIME_UNSET;
        this.f64918v = null;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public int evaluateQueueSize(long j10, List<? extends io.odeeo.internal.c0.b> list) {
        int i10;
        int i11;
        long jElapsedRealtime = this.f64913q.elapsedRealtime();
        if (!a(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f64917u = jElapsedRealtime;
        this.f64918v = list.isEmpty() ? null : (io.odeeo.internal.c0.b) v1.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = g0.getPlayoutDurationForMediaDuration(list.get(size - 1).f63304g - j10, this.f64914r);
        long jA = a();
        if (playoutDurationForMediaDuration >= jA) {
            t format = getFormat(a(jElapsedRealtime, a(list)));
            for (int i12 = 0; i12 < size; i12++) {
                io.odeeo.internal.c0.b bVar = list.get(i12);
                t tVar = bVar.f63301d;
                if (g0.getPlayoutDurationForMediaDuration(bVar.f63304g - j10, this.f64914r) >= jA && tVar.f62967h < format.f62967h && (i10 = tVar.f62977r) != -1 && i10 <= this.f64909m && (i11 = tVar.f62976q) != -1 && i11 <= this.f64908l && i10 < format.f62977r) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public int getSelectedIndex() {
        return this.f64915s;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public Object getSelectionData() {
        return null;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public int getSelectionReason() {
        return this.f64916t;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public void onPlaybackSpeed(float f10) {
        this.f64914r = f10;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends io.odeeo.internal.c0.b> list, io.odeeo.internal.c0.c[] cVarArr) {
        long jElapsedRealtime = this.f64913q.elapsedRealtime();
        long jA = a(cVarArr, list);
        int i10 = this.f64916t;
        if (i10 == 0) {
            this.f64916t = 1;
            this.f64915s = a(jElapsedRealtime, jA);
            return;
        }
        int i11 = this.f64915s;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((io.odeeo.internal.c0.b) v1.getLast(list)).f63301d);
        if (iIndexOf != -1) {
            i10 = ((io.odeeo.internal.c0.b) v1.getLast(list)).f63302e;
            i11 = iIndexOf;
        }
        int iA = a(jElapsedRealtime, jA);
        if (!isBlacklisted(i11, jElapsedRealtime)) {
            t format = getFormat(i11);
            t format2 = getFormat(iA);
            if ((format2.f62967h > format.f62967h && j11 < c(j12)) || (format2.f62967h < format.f62967h && j11 >= this.f64906j)) {
                iA = i11;
            }
        }
        if (iA != i11) {
            i10 = 3;
        }
        this.f64916t = i10;
        this.f64915s = iA;
    }

    public a(k0 k0Var, int[] iArr, int i10, io.odeeo.internal.p0.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0624a> list, io.odeeo.internal.q0.d dVar2) {
        long j13;
        super(k0Var, iArr, i10);
        if (j12 < j10) {
            p.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f64904h = dVar;
        this.f64905i = j10 * 1000;
        this.f64906j = j11 * 1000;
        this.f64907k = j13 * 1000;
        this.f64908l = i11;
        this.f64909m = i12;
        this.f64910n = f10;
        this.f64911o = f11;
        this.f64912p = h1.copyOf((Collection) list);
        this.f64913q = dVar2;
        this.f64914r = 1.0f;
        this.f64916t = 0;
        this.f64917u = C.TIME_UNSET;
    }

    public boolean a(long j10, List<? extends io.odeeo.internal.c0.b> list) {
        long j11 = this.f64917u;
        if (j11 == C.TIME_UNSET || j10 - j11 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((io.odeeo.internal.c0.b) v1.getLast(list)).equals(this.f64918v)) ? false : true;
    }

    public static long[][] c(d.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            d.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f64981b.length];
                int i11 = 0;
                while (true) {
                    if (i11 >= aVar.f64981b.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.f64980a.getFormat(r5[i11]).f62967h;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    public long a() {
        return this.f64907k;
    }

    public final int a(long j10, long j11) {
        long jA = a(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f64930b; i11++) {
            if (j10 == Long.MIN_VALUE || !isBlacklisted(i11, j10)) {
                t format = getFormat(i11);
                if (a(format, format.f62967h, jA)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public static h1<h1<C0624a>> b(d.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (d.a aVar : aVarArr) {
            if (aVar != null && aVar.f64981b.length > 1) {
                h1.a aVarBuilder = h1.builder();
                aVarBuilder.add((h1.a) new C0624a(0L, 0L));
                arrayList.add(aVarBuilder);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArrC = c(aVarArr);
        int[] iArr = new int[jArrC.length];
        long[] jArr = new long[jArrC.length];
        for (int i10 = 0; i10 < jArrC.length; i10++) {
            long[] jArr2 = jArrC[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        a(arrayList, jArr);
        h1<Integer> h1VarA = a(jArrC);
        for (int i11 = 0; i11 < h1VarA.size(); i11++) {
            int iIntValue = h1VarA.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrC[iIntValue][i12];
            a(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        a(arrayList, jArr);
        h1.a aVarBuilder2 = h1.builder();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            h1.a aVar2 = (h1.a) arrayList.get(i14);
            aVarBuilder2.add((h1.a) (aVar2 == null ? h1.of() : aVar2.build()));
        }
        return aVarBuilder2.build();
    }

    public final long a(io.odeeo.internal.c0.c[] cVarArr, List<? extends io.odeeo.internal.c0.b> list) {
        int i10 = this.f64915s;
        if (i10 < cVarArr.length && cVarArr[i10].next()) {
            io.odeeo.internal.c0.c cVar = cVarArr[this.f64915s];
            return cVar.getChunkEndTimeUs() - cVar.getChunkStartTimeUs();
        }
        for (io.odeeo.internal.c0.c cVar2 : cVarArr) {
            if (cVar2.next()) {
                return cVar2.getChunkEndTimeUs() - cVar2.getChunkStartTimeUs();
            }
        }
        return a(list);
    }

    public final long a(List<? extends io.odeeo.internal.c0.b> list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        io.odeeo.internal.c0.b bVar = (io.odeeo.internal.c0.b) v1.getLast(list);
        long j10 = bVar.f63304g;
        if (j10 != C.TIME_UNSET) {
            long j11 = bVar.f63305h;
            if (j11 != C.TIME_UNSET) {
                return j11 - j10;
            }
        }
        return C.TIME_UNSET;
    }

    public final long a(long j10) {
        long jB = b(j10);
        if (this.f64912p.isEmpty()) {
            return jB;
        }
        int i10 = 1;
        while (i10 < this.f64912p.size() - 1 && this.f64912p.get(i10).f64919a < jB) {
            i10++;
        }
        C0624a c0624a = this.f64912p.get(i10 - 1);
        C0624a c0624a2 = this.f64912p.get(i10);
        long j11 = c0624a.f64919a;
        float f10 = (jB - j11) / (c0624a2.f64919a - j11);
        return c0624a.f64920b + ((long) (f10 * (c0624a2.f64920b - r2)));
    }

    public static h1<Integer> a(long[][] jArr) {
        e2 e2VarBuild = f2.treeKeys().arrayListValues().build();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    e2VarBuild.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return h1.copyOf(e2VarBuild.values());
    }

    public static void a(List<h1.a<C0624a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            h1.a<C0624a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.add((h1.a<C0624a>) new C0624a(j10, jArr[i10]));
            }
        }
    }
}
