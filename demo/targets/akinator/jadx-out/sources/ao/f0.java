package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 extends d2 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7651l;

    /* renamed from: m, reason: collision with root package name */
    public final gn.t1 f7652m;

    /* renamed from: n, reason: collision with root package name */
    public final gn.r1 f7653n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f7654o;

    /* renamed from: p, reason: collision with root package name */
    public d0 f7655p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7656q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7657r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7658s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends gn.u1 {

        /* renamed from: e, reason: collision with root package name */
        public final gn.p0 f7659e;

        public a(gn.p0 p0Var) {
            this.f7659e = p0Var;
        }

        @Override // gn.u1
        public int getIndexOfPeriod(Object obj) {
            return obj == e0.f7624h ? 0 : -1;
        }

        @Override // gn.u1
        public gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
            r1Var.set(z10 ? 0 : null, z10 ? e0.f7624h : null, 0, C.TIME_UNSET, 0L, gn.b.f57772g, true);
            return r1Var;
        }

        @Override // gn.u1
        public int getPeriodCount() {
            return 1;
        }

        @Override // gn.u1
        public Object getUidOfPeriod(int i10) {
            return e0.f7624h;
        }

        @Override // gn.u1
        public gn.t1 getWindow(int i10, gn.t1 t1Var, long j10) {
            t1Var.set(gn.t1.f58165q, this.f7659e, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            t1Var.f58185k = true;
            return t1Var;
        }

        @Override // gn.u1
        public int getWindowCount() {
            return 1;
        }
    }

    public f0(m0 m0Var, boolean z10) {
        super(m0Var);
        this.f7651l = z10 && m0Var.isSingleWindow();
        this.f7652m = new gn.t1();
        this.f7653n = new gn.r1();
        gn.u1 initialTimeline = m0Var.getInitialTimeline();
        if (initialTimeline == null) {
            this.f7654o = e0.createWithPlaceholderTimeline(m0Var.getMediaItem());
        } else {
            this.f7654o = e0.createWithRealTimeline(initialTimeline, null, null);
            this.f7658s = true;
        }
    }

    @Override // ao.d2, ao.j, ao.a, ao.m0
    public boolean canUpdateMediaItem(gn.p0 p0Var) {
        return this.f7613k.canUpdateMediaItem(p0Var);
    }

    public gn.u1 getTimeline() {
        return this.f7654o;
    }

    @Override // ao.d2
    public final k0 l(k0 k0Var) {
        Object obj = k0Var.f7718a;
        Object obj2 = this.f7654o.f7626g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = e0.f7624h;
        }
        return k0Var.copyWithPeriodUid(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // ao.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(gn.u1 r12) {
        /*
            r11 = this;
            boolean r1 = r11.f7657r
            if (r1 == 0) goto L19
            ao.e0 r1 = r11.f7654o
            ao.e0 r0 = r1.cloneWithUpdatedTimeline(r12)
            r11.f7654o = r0
            ao.d0 r0 = r11.f7655p
            if (r0 == 0) goto Lb7
            long r0 = r0.getPreparePositionOverrideUs()
            r11.n(r0)
            goto Lb7
        L19:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L36
            boolean r1 = r11.f7658s
            if (r1 == 0) goto L2a
            ao.e0 r1 = r11.f7654o
            ao.e0 r0 = r1.cloneWithUpdatedTimeline(r12)
            goto L32
        L2a:
            java.lang.Object r1 = gn.t1.f58165q
            java.lang.Object r2 = ao.e0.f7624h
            ao.e0 r0 = ao.e0.createWithRealTimeline(r12, r1, r2)
        L32:
            r11.f7654o = r0
            goto Lb7
        L36:
            r1 = 0
            gn.t1 r2 = r11.f7652m
            r12.getWindow(r1, r2)
            long r3 = r2.getDefaultPositionUs()
            java.lang.Object r6 = r2.f58175a
            ao.d0 r5 = r11.f7655p
            if (r5 == 0) goto L6c
            long r7 = r5.getPreparePositionUs()
            ao.e0 r5 = r11.f7654o
            ao.d0 r9 = r11.f7655p
            ao.k0 r9 = r9.f7605b
            java.lang.Object r9 = r9.f7718a
            gn.r1 r10 = r11.f7653n
            r5.getPeriodByUid(r9, r10)
            long r9 = r10.getPositionInWindowUs()
            long r9 = r9 + r7
            ao.e0 r5 = r11.f7654o
            gn.t1 r1 = r5.getWindow(r1, r2)
            long r1 = r1.getDefaultPositionUs()
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L6c
            r4 = r9
            goto L6d
        L6c:
            r4 = r3
        L6d:
            gn.r1 r2 = r11.f7653n
            r3 = 0
            gn.t1 r1 = r11.f7652m
            r0 = r12
            android.util.Pair r1 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r11.f7658s
            if (r1 == 0) goto L8c
            ao.e0 r1 = r11.f7654o
            ao.e0 r0 = r1.cloneWithUpdatedTimeline(r12)
            goto L90
        L8c:
            ao.e0 r0 = ao.e0.createWithRealTimeline(r12, r6, r2)
        L90:
            r11.f7654o = r0
            ao.d0 r0 = r11.f7655p
            if (r0 == 0) goto Lb7
            boolean r1 = r11.n(r3)
            if (r1 == 0) goto Lb7
            ao.k0 r0 = r0.f7605b
            java.lang.Object r1 = r0.f7718a
            ao.e0 r2 = r11.f7654o
            java.lang.Object r2 = r2.f7626g
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = ao.e0.f7624h
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lb2
            ao.e0 r1 = r11.f7654o
            java.lang.Object r1 = r1.f7626g
        Lb2:
            ao.k0 r0 = r0.copyWithPeriodUid(r1)
            goto Lb8
        Lb7:
            r0 = 0
        Lb8:
            r1 = 1
            r11.f7658s = r1
            r11.f7657r = r1
            ao.e0 r1 = r11.f7654o
            r11.f(r1)
            if (r0 == 0) goto Lcf
            ao.d0 r1 = r11.f7655p
            java.lang.Object r1 = io.bidmachine.media3.common.util.a.checkNotNull(r1)
            ao.d0 r1 = (ao.d0) r1
            r1.createPeriod(r0)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.f0.m(gn.u1):void");
    }

    public final boolean n(long j10) {
        d0 d0Var = this.f7655p;
        int indexOfPeriod = this.f7654o.getIndexOfPeriod(d0Var.f7605b.f7718a);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j11 = this.f7654o.getPeriod(indexOfPeriod, this.f7653n).f58111d;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        d0Var.overridePreparePositionUs(j10);
        return true;
    }

    @Override // ao.d2
    public void prepareSourceInternal() {
        if (this.f7651l) {
            return;
        }
        this.f7656q = true;
        k(null, this.f7613k);
    }

    @Override // ao.d2, ao.j, ao.a, ao.m0
    public void releasePeriod(i0 i0Var) {
        ((d0) i0Var).releasePeriod();
        if (i0Var == this.f7655p) {
            this.f7655p = null;
        }
    }

    @Override // ao.j, ao.a
    public void releaseSourceInternal() {
        this.f7657r = false;
        this.f7656q = false;
        super.releaseSourceInternal();
    }

    @Override // ao.d2, ao.j, ao.a, ao.m0
    public void updateMediaItem(gn.p0 p0Var) {
        if (this.f7658s) {
            this.f7654o = this.f7654o.cloneWithUpdatedTimeline(new a2(this.f7654o.f7904e, p0Var));
        } else {
            this.f7654o = e0.createWithPlaceholderTimeline(p0Var);
        }
        this.f7613k.updateMediaItem(p0Var);
    }

    @Override // ao.d2, ao.j, ao.a, ao.m0
    public d0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        d0 d0Var = new d0(k0Var, cVar, j10);
        m0 m0Var = this.f7613k;
        d0Var.setMediaSource(m0Var);
        if (!this.f7657r) {
            this.f7655p = d0Var;
            if (!this.f7656q) {
                this.f7656q = true;
                k(null, m0Var);
            }
            return d0Var;
        }
        Object obj = k0Var.f7718a;
        if (this.f7654o.f7626g != null && obj.equals(e0.f7624h)) {
            obj = this.f7654o.f7626g;
        }
        d0Var.createPeriod(k0Var.copyWithPeriodUid(obj));
        return d0Var;
    }

    @Override // ao.j, ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() {
    }
}
