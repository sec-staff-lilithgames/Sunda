package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends d2 {

    /* renamed from: l, reason: collision with root package name */
    public final long f7627l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7628m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7629n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7630o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7631p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7632q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7633r;

    /* renamed from: s, reason: collision with root package name */
    public final gn.t1 f7634s;

    /* renamed from: t, reason: collision with root package name */
    public b f7635t;

    /* renamed from: u, reason: collision with root package name */
    public c f7636u;

    /* renamed from: v, reason: collision with root package name */
    public long f7637v;

    /* renamed from: w, reason: collision with root package name */
    public long f7638w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f7639a;

        /* renamed from: b, reason: collision with root package name */
        public long f7640b;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7643e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7644f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7645g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7646h;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7642d = true;

        /* renamed from: c, reason: collision with root package name */
        public long f7641c = Long.MIN_VALUE;

        public a(m0 m0Var) {
            this.f7639a = (m0) io.bidmachine.media3.common.util.a.checkNotNull(m0Var);
        }

        public f build() {
            this.f7646h = true;
            return new f(this);
        }

        public a setAllowDynamicClippingUpdates(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.f7646h);
            this.f7643e = z10;
            return this;
        }

        public a setAllowUnseekableMedia(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.f7646h);
            this.f7645g = z10;
            return this;
        }

        public a setEnableInitialDiscontinuity(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.f7646h);
            this.f7642d = z10;
            return this;
        }

        public a setEndPositionMs(long j10) {
            return setEndPositionUs(io.bidmachine.media3.common.util.a1.msToUs(j10));
        }

        public a setEndPositionUs(long j10) {
            io.bidmachine.media3.common.util.a.checkState(!this.f7646h);
            this.f7641c = j10;
            return this;
        }

        public a setRelativeToDefaultPosition(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.f7646h);
            this.f7644f = z10;
            return this;
        }

        public a setStartPositionMs(long j10) {
            return setStartPositionUs(io.bidmachine.media3.common.util.a1.msToUs(j10));
        }

        public a setStartPositionUs(long j10) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
            io.bidmachine.media3.common.util.a.checkState(!this.f7646h);
            this.f7640b = j10;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends y {

        /* renamed from: f, reason: collision with root package name */
        public final long f7647f;

        /* renamed from: g, reason: collision with root package name */
        public final long f7648g;

        /* renamed from: h, reason: collision with root package name */
        public final long f7649h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f7650i;

        public b(gn.u1 u1Var, long j10, long j11, boolean z10) throws c {
            super(u1Var);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new c(2, j10, j11);
            }
            boolean z11 = false;
            if (u1Var.getPeriodCount() != 1) {
                throw new c(0);
            }
            gn.t1 window = u1Var.getWindow(0, new gn.t1());
            long jMax = Math.max(0L, j10);
            if (!z10 && !window.f58185k && jMax != 0 && !window.f58182h) {
                throw new c(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? window.f58187m : Math.max(0L, j11);
            long j12 = window.f58187m;
            if (j12 != C.TIME_UNSET) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f7647f = jMax;
            this.f7648g = jMax2;
            this.f7649h = jMax2 == C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (window.f58183i && (jMax2 == C.TIME_UNSET || (j12 != C.TIME_UNSET && jMax2 == j12))) {
                z11 = true;
            }
            this.f7650i = z11;
        }

        @Override // ao.y, gn.u1
        public gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
            this.f7904e.getPeriod(0, r1Var, z10);
            long positionInWindowUs = r1Var.getPositionInWindowUs() - this.f7647f;
            long j10 = this.f7649h;
            long j11 = C.TIME_UNSET;
            if (j10 != C.TIME_UNSET) {
                j11 = j10 - positionInWindowUs;
            }
            return r1Var.set(r1Var.f58108a, r1Var.f58109b, 0, j11, positionInWindowUs);
        }

        @Override // ao.y, gn.u1
        public gn.t1 getWindow(int i10, gn.t1 t1Var, long j10) {
            this.f7904e.getWindow(0, t1Var, 0L);
            long j11 = t1Var.f58190p;
            long j12 = this.f7647f;
            t1Var.f58190p = j11 + j12;
            t1Var.f58187m = this.f7649h;
            t1Var.f58183i = this.f7650i;
            long j13 = t1Var.f58186l;
            if (j13 != C.TIME_UNSET) {
                long jMax = Math.max(j13, j12);
                t1Var.f58186l = jMax;
                long j14 = this.f7648g;
                if (j14 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j14);
                }
                t1Var.f58186l = jMax - j12;
            }
            long jUsToMs = io.bidmachine.media3.common.util.a1.usToMs(j12);
            long j15 = t1Var.f58179e;
            if (j15 != C.TIME_UNSET) {
                t1Var.f58179e = j15 + jUsToMs;
            }
            long j16 = t1Var.f58180f;
            if (j16 != C.TIME_UNSET) {
                t1Var.f58180f = j16 + jUsToMs;
            }
            return t1Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends IOException {
        public c(int i10) {
            this(i10, C.TIME_UNSET, C.TIME_UNSET);
        }

        public c(int i10, long j10, long j11) {
            String str;
            StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
            if (i10 != 0) {
                if (i10 == 1) {
                    str = "not seekable to start";
                } else if (i10 != 2) {
                    str = "unknown";
                } else {
                    io.bidmachine.media3.common.util.a.checkState((j10 == C.TIME_UNSET || j11 == C.TIME_UNSET) ? false : true);
                    str = "start exceeds end. Start time: " + j10 + ", End time: " + j11;
                }
            } else {
                str = "invalid period count";
            }
            sb2.append(str);
            super(sb2.toString());
        }
    }

    public f(a aVar) {
        super(aVar.f7639a);
        this.f7627l = aVar.f7640b;
        this.f7628m = aVar.f7641c;
        this.f7629n = aVar.f7642d;
        this.f7630o = aVar.f7643e;
        this.f7631p = aVar.f7644f;
        this.f7632q = aVar.f7645g;
        this.f7633r = new ArrayList();
        this.f7634s = new gn.t1();
    }

    @Override // ao.d2, ao.j, ao.a, ao.m0
    public boolean canUpdateMediaItem(gn.p0 p0Var) {
        return getMediaItem().f58056e.equals(p0Var.f58056e) && this.f7613k.canUpdateMediaItem(p0Var);
    }

    @Override // ao.d2, ao.j, ao.a, ao.m0
    public i0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        e eVar = new e(this.f7613k.createPeriod(k0Var, cVar, j10), this.f7629n, this.f7637v, this.f7638w);
        this.f7633r.add(eVar);
        return eVar;
    }

    @Override // ao.d2
    public final void m(gn.u1 u1Var) {
        if (this.f7636u != null) {
            return;
        }
        n(u1Var);
    }

    @Override // ao.j, ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        c cVar = this.f7636u;
        if (cVar != null) {
            throw cVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    public final void n(gn.u1 u1Var) {
        long j10;
        long j11;
        long j12;
        gn.t1 t1Var = this.f7634s;
        u1Var.getWindow(0, t1Var);
        long positionInFirstPeriodUs = t1Var.getPositionInFirstPeriodUs();
        b bVar = this.f7635t;
        long j13 = this.f7628m;
        ArrayList arrayList = this.f7633r;
        if (bVar == null || arrayList.isEmpty() || this.f7630o) {
            boolean z10 = this.f7631p;
            j10 = this.f7627l;
            if (z10) {
                long defaultPositionUs = t1Var.getDefaultPositionUs();
                j10 += defaultPositionUs;
                j11 = defaultPositionUs + j13;
            } else {
                j11 = j13;
            }
            this.f7637v = positionInFirstPeriodUs + j10;
            this.f7638w = j13 != Long.MIN_VALUE ? positionInFirstPeriodUs + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((e) arrayList.get(i10)).updateClipping(this.f7637v, this.f7638w);
            }
            j12 = j11;
        } else {
            j10 = this.f7637v - positionInFirstPeriodUs;
            j12 = j13 != Long.MIN_VALUE ? this.f7638w - positionInFirstPeriodUs : Long.MIN_VALUE;
        }
        try {
            b bVar2 = new b(u1Var, j10, j12, this.f7632q);
            this.f7635t = bVar2;
            f(bVar2);
        } catch (c e10) {
            this.f7636u = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).setClippingError(this.f7636u);
            }
        }
    }

    @Override // ao.d2, ao.j, ao.a, ao.m0
    public void releasePeriod(i0 i0Var) {
        ArrayList arrayList = this.f7633r;
        io.bidmachine.media3.common.util.a.checkState(arrayList.remove(i0Var));
        this.f7613k.releasePeriod(((e) i0Var).f7614b);
        if (!arrayList.isEmpty() || this.f7630o) {
            return;
        }
        n(((b) io.bidmachine.media3.common.util.a.checkNotNull(this.f7635t)).f7904e);
    }

    @Override // ao.j, ao.a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f7636u = null;
        this.f7635t = null;
    }

    @Deprecated
    public f(m0 m0Var, long j10, long j11) {
        this(new a(m0Var).setStartPositionUs(j10).setEndPositionUs(j11));
    }

    @Deprecated
    public f(m0 m0Var, long j10) {
        this(new a(m0Var).setEndPositionUs(j10).setRelativeToDefaultPosition(true));
    }

    @Deprecated
    public f(m0 m0Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        this(new a(m0Var).setStartPositionUs(j10).setEndPositionUs(j11).setEnableInitialDiscontinuity(z10).setAllowDynamicClippingUpdates(z11).setRelativeToDefaultPosition(z12));
    }
}
