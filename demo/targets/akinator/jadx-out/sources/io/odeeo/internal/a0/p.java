package io.odeeo.internal.a0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.y0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends f<Void> {

    /* renamed from: j, reason: collision with root package name */
    public final t f62427j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f62428k;

    /* renamed from: l, reason: collision with root package name */
    public final y0.d f62429l;

    /* renamed from: m, reason: collision with root package name */
    public final y0.b f62430m;

    /* renamed from: n, reason: collision with root package name */
    public a f62431n;

    /* renamed from: o, reason: collision with root package name */
    public o f62432o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f62433p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f62434q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f62435r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends l {

        /* renamed from: f, reason: collision with root package name */
        public static final Object f62436f = new Object();

        /* renamed from: d, reason: collision with root package name */
        public final Object f62437d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f62438e;

        public a(y0 y0Var, Object obj, Object obj2) {
            super(y0Var);
            this.f62437d = obj;
            this.f62438e = obj2;
        }

        public static a createWithPlaceholderTimeline(io.odeeo.internal.b.z zVar) {
            return new a(new b(zVar), y0.d.f63086r, f62436f);
        }

        public static a createWithRealTimeline(y0 y0Var, Object obj, Object obj2) {
            return new a(y0Var, obj, obj2);
        }

        public a cloneWithUpdatedTimeline(y0 y0Var) {
            return new a(y0Var, this.f62437d, this.f62438e);
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public int getIndexOfPeriod(Object obj) {
            Object obj2;
            y0 y0Var = this.f62398c;
            if (f62436f.equals(obj) && (obj2 = this.f62438e) != null) {
                obj = obj2;
            }
            return y0Var.getIndexOfPeriod(obj);
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
            this.f62398c.getPeriod(i10, bVar, z10);
            if (io.odeeo.internal.q0.g0.areEqual(bVar.f63076b, this.f62438e) && z10) {
                bVar.f63076b = f62436f;
            }
            return bVar;
        }

        public y0 getTimeline() {
            return this.f62398c;
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public Object getUidOfPeriod(int i10) {
            Object uidOfPeriod = this.f62398c.getUidOfPeriod(i10);
            return io.odeeo.internal.q0.g0.areEqual(uidOfPeriod, this.f62438e) ? f62436f : uidOfPeriod;
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public y0.d getWindow(int i10, y0.d dVar, long j10) {
            this.f62398c.getWindow(i10, dVar, j10);
            if (io.odeeo.internal.q0.g0.areEqual(dVar.f63090a, this.f62437d)) {
                dVar.f63090a = y0.d.f63086r;
            }
            return dVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends y0 {

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.b.z f62439c;

        public b(io.odeeo.internal.b.z zVar) {
            this.f62439c = zVar;
        }

        @Override // io.odeeo.internal.b.y0
        public int getIndexOfPeriod(Object obj) {
            return obj == a.f62436f ? 0 : -1;
        }

        @Override // io.odeeo.internal.b.y0
        public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
            bVar.set(z10 ? 0 : null, z10 ? a.f62436f : null, 0, C.TIME_UNSET, 0L, io.odeeo.internal.b0.a.f63205g, true);
            return bVar;
        }

        @Override // io.odeeo.internal.b.y0
        public int getPeriodCount() {
            return 1;
        }

        @Override // io.odeeo.internal.b.y0
        public Object getUidOfPeriod(int i10) {
            return a.f62436f;
        }

        @Override // io.odeeo.internal.b.y0
        public y0.d getWindow(int i10, y0.d dVar, long j10) {
            dVar.set(y0.d.f63086r, this.f62439c, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            dVar.f63101l = true;
            return dVar;
        }

        @Override // io.odeeo.internal.b.y0
        public int getWindowCount() {
            return 1;
        }
    }

    public p(t tVar, boolean z10) {
        this.f62427j = tVar;
        this.f62428k = z10 && tVar.isSingleWindow();
        this.f62429l = new y0.d();
        this.f62430m = new y0.b();
        y0 initialTimeline = tVar.getInitialTimeline();
        if (initialTimeline == null) {
            this.f62431n = a.createWithPlaceholderTimeline(tVar.getMediaItem());
        } else {
            this.f62431n = a.createWithRealTimeline(initialTimeline, null, null);
            this.f62435r = true;
        }
    }

    public final Object c(Object obj) {
        return (this.f62431n.f62438e == null || !obj.equals(a.f62436f)) ? obj : this.f62431n.f62438e;
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public io.odeeo.internal.b.z getMediaItem() {
        return this.f62427j.getMediaItem();
    }

    public y0 getTimeline() {
        return this.f62431n;
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void prepareSourceInternal(io.odeeo.internal.p0.b0 b0Var) {
        super.prepareSourceInternal(b0Var);
        if (this.f62428k) {
            return;
        }
        this.f62433p = true;
        a((p) null, this.f62427j);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void releasePeriod(r rVar) {
        ((o) rVar).releasePeriod();
        if (rVar == this.f62432o) {
            this.f62432o = null;
        }
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void releaseSourceInternal() {
        this.f62434q = false;
        this.f62433p = false;
        super.releaseSourceInternal();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // io.odeeo.internal.a0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Void r13, io.odeeo.internal.a0.t r14, io.odeeo.internal.b.y0 r15) {
        /*
            r12 = this;
            boolean r13 = r12.f62434q
            if (r13 == 0) goto L19
            io.odeeo.internal.a0.p$a r13 = r12.f62431n
            io.odeeo.internal.a0.p$a r13 = r13.cloneWithUpdatedTimeline(r15)
            r12.f62431n = r13
            io.odeeo.internal.a0.o r13 = r12.f62432o
            if (r13 == 0) goto Lae
            long r13 = r13.getPreparePositionOverrideUs()
            r12.a(r13)
            goto Lae
        L19:
            boolean r13 = r15.isEmpty()
            if (r13 == 0) goto L36
            boolean r13 = r12.f62435r
            if (r13 == 0) goto L2a
            io.odeeo.internal.a0.p$a r13 = r12.f62431n
            io.odeeo.internal.a0.p$a r13 = r13.cloneWithUpdatedTimeline(r15)
            goto L32
        L2a:
            java.lang.Object r13 = io.odeeo.internal.b.y0.d.f63086r
            java.lang.Object r14 = io.odeeo.internal.a0.p.a.f62436f
            io.odeeo.internal.a0.p$a r13 = io.odeeo.internal.a0.p.a.createWithRealTimeline(r15, r13, r14)
        L32:
            r12.f62431n = r13
            goto Lae
        L36:
            io.odeeo.internal.b.y0$d r13 = r12.f62429l
            r14 = 0
            r15.getWindow(r14, r13)
            io.odeeo.internal.b.y0$d r13 = r12.f62429l
            long r0 = r13.getDefaultPositionUs()
            io.odeeo.internal.b.y0$d r13 = r12.f62429l
            java.lang.Object r13 = r13.f63090a
            io.odeeo.internal.a0.o r2 = r12.f62432o
            if (r2 == 0) goto L74
            long r2 = r2.getPreparePositionUs()
            io.odeeo.internal.a0.p$a r4 = r12.f62431n
            io.odeeo.internal.a0.o r5 = r12.f62432o
            io.odeeo.internal.a0.t$a r5 = r5.f62418a
            java.lang.Object r5 = r5.f62447a
            io.odeeo.internal.b.y0$b r6 = r12.f62430m
            r4.getPeriodByUid(r5, r6)
            io.odeeo.internal.b.y0$b r4 = r12.f62430m
            long r4 = r4.getPositionInWindowUs()
            long r4 = r4 + r2
            io.odeeo.internal.a0.p$a r2 = r12.f62431n
            io.odeeo.internal.b.y0$d r3 = r12.f62429l
            io.odeeo.internal.b.y0$d r14 = r2.getWindow(r14, r3)
            long r2 = r14.getDefaultPositionUs()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            io.odeeo.internal.b.y0$d r7 = r12.f62429l
            io.odeeo.internal.b.y0$b r8 = r12.f62430m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.getPeriodPosition(r7, r8, r9, r10)
            java.lang.Object r15 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r0 = r14.longValue()
            boolean r14 = r12.f62435r
            if (r14 == 0) goto L94
            io.odeeo.internal.a0.p$a r13 = r12.f62431n
            io.odeeo.internal.a0.p$a r13 = r13.cloneWithUpdatedTimeline(r6)
            goto L98
        L94:
            io.odeeo.internal.a0.p$a r13 = io.odeeo.internal.a0.p.a.createWithRealTimeline(r6, r13, r15)
        L98:
            r12.f62431n = r13
            io.odeeo.internal.a0.o r13 = r12.f62432o
            if (r13 == 0) goto Lae
            r12.a(r0)
            io.odeeo.internal.a0.t$a r13 = r13.f62418a
            java.lang.Object r14 = r13.f62447a
            java.lang.Object r14 = r12.c(r14)
            io.odeeo.internal.a0.t$a r13 = r13.copyWithPeriodUid(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f62435r = r14
            r12.f62434q = r14
            io.odeeo.internal.a0.p$a r14 = r12.f62431n
            r12.a(r14)
            if (r13 == 0) goto Lc6
            io.odeeo.internal.a0.o r14 = r12.f62432o
            java.lang.Object r14 = io.odeeo.internal.q0.a.checkNotNull(r14)
            io.odeeo.internal.a0.o r14 = (io.odeeo.internal.a0.o) r14
            r14.createPeriod(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.a0.p.a(java.lang.Void, io.odeeo.internal.a0.t, io.odeeo.internal.b.y0):void");
    }

    public final Object b(Object obj) {
        return (this.f62431n.f62438e == null || !this.f62431n.f62438e.equals(obj)) ? obj : a.f62436f;
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public o createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        o oVar = new o(aVar, bVar, j10);
        oVar.setMediaSource(this.f62427j);
        if (this.f62434q) {
            oVar.createPeriod(aVar.copyWithPeriodUid(c(aVar.f62447a)));
            return oVar;
        }
        this.f62432o = oVar;
        if (!this.f62433p) {
            this.f62433p = true;
            a((p) null, this.f62427j);
        }
        return oVar;
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // io.odeeo.internal.a0.f
    public t.a a(Void r12, t.a aVar) {
        return aVar.copyWithPeriodUid(b(aVar.f62447a));
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void a(long j10) {
        o oVar = this.f62432o;
        int indexOfPeriod = this.f62431n.getIndexOfPeriod(oVar.f62418a.f62447a);
        if (indexOfPeriod == -1) {
            return;
        }
        long j11 = this.f62431n.getPeriod(indexOfPeriod, this.f62430m).f63078d;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.overridePreparePositionUs(j10);
    }
}
