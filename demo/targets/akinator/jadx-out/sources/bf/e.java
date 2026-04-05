package bf;

import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends p1 {

    /* renamed from: l, reason: collision with root package name */
    public final long f9211l;

    /* renamed from: m, reason: collision with root package name */
    public final long f9212m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f9213n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9214o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9215p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f9216q;

    /* renamed from: r, reason: collision with root package name */
    public final l3 f9217r;

    /* renamed from: s, reason: collision with root package name */
    public a f9218s;

    /* renamed from: t, reason: collision with root package name */
    public b f9219t;

    /* renamed from: u, reason: collision with root package name */
    public long f9220u;

    /* renamed from: v, reason: collision with root package name */
    public long f9221v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends q {

        /* renamed from: h, reason: collision with root package name */
        public final long f9222h;

        /* renamed from: i, reason: collision with root package name */
        public final long f9223i;

        /* renamed from: j, reason: collision with root package name */
        public final long f9224j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f9225k;

        public a(m3 m3Var, long j10, long j11) throws b {
            super(m3Var);
            boolean z10 = false;
            if (m3Var.getPeriodCount() != 1) {
                throw new b(0);
            }
            l3 window = m3Var.getWindow(0, new l3());
            long jMax = Math.max(0L, j10);
            if (!window.f27658n && jMax != 0 && !window.f27654j) {
                throw new b(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? window.f27660p : Math.max(0L, j11);
            long j12 = window.f27660p;
            if (j12 != C.TIME_UNSET) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    throw new b(2);
                }
            }
            this.f9222h = jMax;
            this.f9223i = jMax2;
            this.f9224j = jMax2 == C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (window.f27655k && (jMax2 == C.TIME_UNSET || (j12 != C.TIME_UNSET && jMax2 == j12))) {
                z10 = true;
            }
            this.f9225k = z10;
        }

        @Override // bf.q, com.google.android.exoplayer2.m3
        public k3 getPeriod(int i10, k3 k3Var, boolean z10) {
            this.f9378g.getPeriod(0, k3Var, z10);
            long positionInWindowUs = k3Var.getPositionInWindowUs() - this.f9222h;
            long j10 = this.f9224j;
            long j11 = C.TIME_UNSET;
            if (j10 != C.TIME_UNSET) {
                j11 = j10 - positionInWindowUs;
            }
            return k3Var.set(k3Var.f27596b, k3Var.f27597c, 0, j11, positionInWindowUs);
        }

        @Override // bf.q, com.google.android.exoplayer2.m3
        public l3 getWindow(int i10, l3 l3Var, long j10) {
            this.f9378g.getWindow(0, l3Var, 0L);
            long j11 = l3Var.f27663s;
            long j12 = this.f9222h;
            l3Var.f27663s = j11 + j12;
            l3Var.f27660p = this.f9224j;
            l3Var.f27655k = this.f9225k;
            long j13 = l3Var.f27659o;
            if (j13 != C.TIME_UNSET) {
                long jMax = Math.max(j13, j12);
                l3Var.f27659o = jMax;
                long j14 = this.f9223i;
                if (j14 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j14);
                }
                l3Var.f27659o = jMax - j12;
            }
            long jUsToMs = com.google.android.exoplayer2.util.n1.usToMs(j12);
            long j15 = l3Var.f27651g;
            if (j15 != C.TIME_UNSET) {
                l3Var.f27651g = j15 + jUsToMs;
            }
            long j16 = l3Var.f27652h;
            if (j16 != C.TIME_UNSET) {
                l3Var.f27652h = j16 + jUsToMs;
            }
            return l3Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends IOException {
        public b(int i10) {
            super("Illegal clipping: ".concat(i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
        }
    }

    public e(f0 f0Var, long j10, long j11) {
        this(f0Var, j10, j11, true, false, false);
    }

    @Override // bf.p1, bf.i, bf.a, bf.f0
    public a0 createPeriod(d0 d0Var, qf.c cVar, long j10) {
        d dVar = new d(this.f9377k.createPeriod(d0Var, cVar, j10), this.f9213n, this.f9220u, this.f9221v);
        this.f9216q.add(dVar);
        return dVar;
    }

    @Override // bf.p1
    public final void k(m3 m3Var) {
        if (this.f9219t != null) {
            return;
        }
        l(m3Var);
    }

    public final void l(m3 m3Var) {
        long j10;
        long j11;
        long j12;
        l3 l3Var = this.f9217r;
        m3Var.getWindow(0, l3Var);
        long positionInFirstPeriodUs = l3Var.getPositionInFirstPeriodUs();
        a aVar = this.f9218s;
        long j13 = this.f9212m;
        ArrayList arrayList = this.f9216q;
        if (aVar == null || arrayList.isEmpty() || this.f9214o) {
            boolean z10 = this.f9215p;
            j10 = this.f9211l;
            if (z10) {
                long defaultPositionUs = l3Var.getDefaultPositionUs();
                j10 += defaultPositionUs;
                j11 = defaultPositionUs + j13;
            } else {
                j11 = j13;
            }
            this.f9220u = positionInFirstPeriodUs + j10;
            this.f9221v = j13 != Long.MIN_VALUE ? positionInFirstPeriodUs + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d) arrayList.get(i10)).updateClipping(this.f9220u, this.f9221v);
            }
            j12 = j11;
        } else {
            j10 = this.f9220u - positionInFirstPeriodUs;
            j12 = j13 != Long.MIN_VALUE ? this.f9221v - positionInFirstPeriodUs : Long.MIN_VALUE;
        }
        try {
            a aVar2 = new a(m3Var, j10, j12);
            this.f9218s = aVar2;
            d(aVar2);
        } catch (b e10) {
            this.f9219t = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).setClippingError(this.f9219t);
            }
        }
    }

    @Override // bf.i, bf.a, bf.f0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        b bVar = this.f9219t;
        if (bVar != null) {
            throw bVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // bf.p1, bf.i, bf.a, bf.f0
    public void releasePeriod(a0 a0Var) {
        ArrayList arrayList = this.f9216q;
        com.google.android.exoplayer2.util.a.checkState(arrayList.remove(a0Var));
        this.f9377k.releasePeriod(((d) a0Var).f9201b);
        if (!arrayList.isEmpty() || this.f9214o) {
            return;
        }
        l(((a) com.google.android.exoplayer2.util.a.checkNotNull(this.f9218s)).f9378g);
    }

    @Override // bf.i, bf.a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f9219t = null;
        this.f9218s = null;
    }

    public e(f0 f0Var, long j10) {
        this(f0Var, 0L, j10, true, false, true);
    }

    public e(f0 f0Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((f0) com.google.android.exoplayer2.util.a.checkNotNull(f0Var));
        com.google.android.exoplayer2.util.a.checkArgument(j10 >= 0);
        this.f9211l = j10;
        this.f9212m = j11;
        this.f9213n = z10;
        this.f9214o = z11;
        this.f9215p = z12;
        this.f9216q = new ArrayList();
        this.f9217r = new l3();
    }
}
