package io.odeeo.internal.a0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.y0;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends f<Void> {

    /* renamed from: j, reason: collision with root package name */
    public final t f62287j;

    /* renamed from: k, reason: collision with root package name */
    public final long f62288k;

    /* renamed from: l, reason: collision with root package name */
    public final long f62289l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f62290m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f62291n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f62292o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<d> f62293p;

    /* renamed from: q, reason: collision with root package name */
    public final y0.d f62294q;

    /* renamed from: r, reason: collision with root package name */
    public a f62295r;

    /* renamed from: s, reason: collision with root package name */
    public b f62296s;

    /* renamed from: t, reason: collision with root package name */
    public long f62297t;

    /* renamed from: u, reason: collision with root package name */
    public long f62298u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends l {

        /* renamed from: d, reason: collision with root package name */
        public final long f62299d;

        /* renamed from: e, reason: collision with root package name */
        public final long f62300e;

        /* renamed from: f, reason: collision with root package name */
        public final long f62301f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f62302g;

        public a(y0 y0Var, long j10, long j11) throws b {
            super(y0Var);
            boolean z10 = false;
            if (y0Var.getPeriodCount() != 1) {
                throw new b(0);
            }
            y0.d window = y0Var.getWindow(0, new y0.d());
            long jMax = Math.max(0L, j10);
            if (!window.f63101l && jMax != 0 && !window.f63097h) {
                throw new b(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? window.f63103n : Math.max(0L, j11);
            long j12 = window.f63103n;
            long j13 = C.TIME_UNSET;
            if (j12 != C.TIME_UNSET) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    throw new b(2);
                }
            }
            this.f62299d = jMax;
            this.f62300e = jMax2;
            this.f62301f = jMax2 != C.TIME_UNSET ? jMax2 - jMax : j13;
            if (window.f63098i && (jMax2 == C.TIME_UNSET || (j12 != C.TIME_UNSET && jMax2 == j12))) {
                z10 = true;
            }
            this.f62302g = z10;
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
            this.f62398c.getPeriod(0, bVar, z10);
            long positionInWindowUs = bVar.getPositionInWindowUs() - this.f62299d;
            long j10 = this.f62301f;
            long j11 = C.TIME_UNSET;
            if (j10 != C.TIME_UNSET) {
                j11 = j10 - positionInWindowUs;
            }
            return bVar.set(bVar.f63075a, bVar.f63076b, 0, j11, positionInWindowUs);
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public y0.d getWindow(int i10, y0.d dVar, long j10) {
            this.f62398c.getWindow(0, dVar, 0L);
            long j11 = dVar.f63106q;
            long j12 = this.f62299d;
            dVar.f63106q = j11 + j12;
            dVar.f63103n = this.f62301f;
            dVar.f63098i = this.f62302g;
            long j13 = dVar.f63102m;
            if (j13 != C.TIME_UNSET) {
                long jMax = Math.max(j13, j12);
                dVar.f63102m = jMax;
                long j14 = this.f62300e;
                if (j14 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j14);
                }
                dVar.f63102m = jMax - this.f62299d;
            }
            long jUsToMs = io.odeeo.internal.q0.g0.usToMs(this.f62299d);
            long j15 = dVar.f63094e;
            if (j15 != C.TIME_UNSET) {
                dVar.f63094e = j15 + jUsToMs;
            }
            long j16 = dVar.f63095f;
            if (j16 != C.TIME_UNSET) {
                dVar.f63095f = j16 + jUsToMs;
            }
            return dVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f62303a;

        public b(int i10) {
            super("Illegal clipping: " + a(i10));
            this.f62303a = i10;
        }

        public static String a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public e(t tVar, long j10, long j11) {
        this(tVar, j10, j11, true, false, false);
    }

    @Override // io.odeeo.internal.a0.f
    public void a(Void r12, t tVar, y0 y0Var) {
        if (this.f62296s != null) {
            return;
        }
        b(y0Var);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public r createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        d dVar = new d(this.f62287j.createPeriod(aVar, bVar, j10), this.f62290m, this.f62297t, this.f62298u);
        this.f62293p.add(dVar);
        return dVar;
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public io.odeeo.internal.b.z getMediaItem() {
        return this.f62287j.getMediaItem();
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        b bVar = this.f62296s;
        if (bVar != null) {
            throw bVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void prepareSourceInternal(io.odeeo.internal.p0.b0 b0Var) {
        super.prepareSourceInternal(b0Var);
        a((e) null, this.f62287j);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void releasePeriod(r rVar) {
        io.odeeo.internal.q0.a.checkState(this.f62293p.remove(rVar));
        this.f62287j.releasePeriod(((d) rVar).f62277a);
        if (!this.f62293p.isEmpty() || this.f62291n) {
            return;
        }
        b(((a) io.odeeo.internal.q0.a.checkNotNull(this.f62295r)).f62398c);
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f62296s = null;
        this.f62295r = null;
    }

    public e(t tVar, long j10) {
        this(tVar, 0L, j10, true, false, true);
    }

    public final void b(y0 y0Var) {
        long j10;
        long j11;
        y0Var.getWindow(0, this.f62294q);
        long positionInFirstPeriodUs = this.f62294q.getPositionInFirstPeriodUs();
        if (this.f62295r == null || this.f62293p.isEmpty() || this.f62291n) {
            long j12 = this.f62288k;
            long j13 = this.f62289l;
            if (this.f62292o) {
                long defaultPositionUs = this.f62294q.getDefaultPositionUs();
                j12 += defaultPositionUs;
                j13 += defaultPositionUs;
            }
            this.f62297t = positionInFirstPeriodUs + j12;
            this.f62298u = this.f62289l != Long.MIN_VALUE ? positionInFirstPeriodUs + j13 : Long.MIN_VALUE;
            int size = this.f62293p.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f62293p.get(i10).updateClipping(this.f62297t, this.f62298u);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f62297t - positionInFirstPeriodUs;
            j11 = this.f62289l != Long.MIN_VALUE ? this.f62298u - positionInFirstPeriodUs : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(y0Var, j10, j11);
            this.f62295r = aVar;
            a((y0) aVar);
        } catch (b e10) {
            this.f62296s = e10;
            for (int i11 = 0; i11 < this.f62293p.size(); i11++) {
                this.f62293p.get(i11).setClippingError(this.f62296s);
            }
        }
    }

    public e(t tVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        io.odeeo.internal.q0.a.checkArgument(j10 >= 0);
        this.f62287j = (t) io.odeeo.internal.q0.a.checkNotNull(tVar);
        this.f62288k = j10;
        this.f62289l = j11;
        this.f62290m = z10;
        this.f62291n = z11;
        this.f62292o = z12;
        this.f62293p = new ArrayList<>();
        this.f62294q = new y0.d();
    }
}
