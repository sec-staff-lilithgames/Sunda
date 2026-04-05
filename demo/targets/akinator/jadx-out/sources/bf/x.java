package bf;

import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends p1 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9474l;

    /* renamed from: m, reason: collision with root package name */
    public final l3 f9475m;

    /* renamed from: n, reason: collision with root package name */
    public final k3 f9476n;

    /* renamed from: o, reason: collision with root package name */
    public w f9477o;

    /* renamed from: p, reason: collision with root package name */
    public v f9478p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9479q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9480r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9481s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends m3 {

        /* renamed from: g, reason: collision with root package name */
        public final u1 f9482g;

        public a(u1 u1Var) {
            this.f9482g = u1Var;
        }

        @Override // com.google.android.exoplayer2.m3
        public int getIndexOfPeriod(Object obj) {
            return obj == w.f9460j ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.m3
        public k3 getPeriod(int i10, k3 k3Var, boolean z10) {
            k3Var.set(z10 ? 0 : null, z10 ? w.f9460j : null, 0, C.TIME_UNSET, 0L, cf.b.f12271i, true);
            return k3Var;
        }

        @Override // com.google.android.exoplayer2.m3
        public int getPeriodCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.m3
        public Object getUidOfPeriod(int i10) {
            return w.f9460j;
        }

        @Override // com.google.android.exoplayer2.m3
        public l3 getWindow(int i10, l3 l3Var, long j10) {
            l3Var.set(l3.f27640t, this.f9482g, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            l3Var.f27658n = true;
            return l3Var;
        }

        @Override // com.google.android.exoplayer2.m3
        public int getWindowCount() {
            return 1;
        }
    }

    public x(f0 f0Var, boolean z10) {
        super(f0Var);
        this.f9474l = z10 && f0Var.isSingleWindow();
        this.f9475m = new l3();
        this.f9476n = new k3();
        m3 initialTimeline = f0Var.getInitialTimeline();
        if (initialTimeline == null) {
            this.f9477o = w.createWithPlaceholderTimeline(f0Var.getMediaItem());
        } else {
            this.f9477o = w.createWithRealTimeline(initialTimeline, null, null);
            this.f9481s = true;
        }
    }

    public m3 getTimeline() {
        return this.f9477o;
    }

    @Override // bf.p1
    public final d0 j(d0 d0Var) {
        Object obj = d0Var.f9193a;
        Object obj2 = this.f9477o.f9462i;
        if (obj2 != null && obj2.equals(obj)) {
            obj = w.f9460j;
        }
        return d0Var.copyWithPeriodUid(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // bf.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.exoplayer2.m3 r12) {
        /*
            r11 = this;
            boolean r1 = r11.f9480r
            if (r1 == 0) goto L19
            bf.w r1 = r11.f9477o
            bf.w r0 = r1.cloneWithUpdatedTimeline(r12)
            r11.f9477o = r0
            bf.v r0 = r11.f9478p
            if (r0 == 0) goto Lb4
            long r0 = r0.getPreparePositionOverrideUs()
            r11.l(r0)
            goto Lb4
        L19:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L36
            boolean r1 = r11.f9481s
            if (r1 == 0) goto L2a
            bf.w r1 = r11.f9477o
            bf.w r0 = r1.cloneWithUpdatedTimeline(r12)
            goto L32
        L2a:
            java.lang.Object r1 = com.google.android.exoplayer2.l3.f27640t
            java.lang.Object r2 = bf.w.f9460j
            bf.w r0 = bf.w.createWithRealTimeline(r12, r1, r2)
        L32:
            r11.f9477o = r0
            goto Lb4
        L36:
            r1 = 0
            com.google.android.exoplayer2.l3 r2 = r11.f9475m
            r12.getWindow(r1, r2)
            long r3 = r2.getDefaultPositionUs()
            java.lang.Object r6 = r2.f27647b
            bf.v r5 = r11.f9478p
            if (r5 == 0) goto L6c
            long r7 = r5.getPreparePositionUs()
            bf.w r5 = r11.f9477o
            bf.v r9 = r11.f9478p
            bf.d0 r9 = r9.f9440b
            java.lang.Object r9 = r9.f9193a
            com.google.android.exoplayer2.k3 r10 = r11.f9476n
            r5.getPeriodByUid(r9, r10)
            long r9 = r10.getPositionInWindowUs()
            long r9 = r9 + r7
            bf.w r5 = r11.f9477o
            com.google.android.exoplayer2.l3 r1 = r5.getWindow(r1, r2)
            long r1 = r1.getDefaultPositionUs()
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L6c
            r4 = r9
            goto L6d
        L6c:
            r4 = r3
        L6d:
            com.google.android.exoplayer2.k3 r2 = r11.f9476n
            r3 = 0
            com.google.android.exoplayer2.l3 r1 = r11.f9475m
            r0 = r12
            android.util.Pair r1 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r11.f9481s
            if (r1 == 0) goto L8c
            bf.w r1 = r11.f9477o
            bf.w r0 = r1.cloneWithUpdatedTimeline(r12)
            goto L90
        L8c:
            bf.w r0 = bf.w.createWithRealTimeline(r12, r6, r2)
        L90:
            r11.f9477o = r0
            bf.v r0 = r11.f9478p
            if (r0 == 0) goto Lb4
            r11.l(r3)
            bf.d0 r0 = r0.f9440b
            java.lang.Object r1 = r0.f9193a
            bf.w r2 = r11.f9477o
            java.lang.Object r2 = r2.f9462i
            if (r2 == 0) goto Laf
            java.lang.Object r2 = bf.w.f9460j
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Laf
            bf.w r1 = r11.f9477o
            java.lang.Object r1 = r1.f9462i
        Laf:
            bf.d0 r0 = r0.copyWithPeriodUid(r1)
            goto Lb5
        Lb4:
            r0 = 0
        Lb5:
            r1 = 1
            r11.f9481s = r1
            r11.f9480r = r1
            bf.w r1 = r11.f9477o
            r11.d(r1)
            if (r0 == 0) goto Lcc
            bf.v r1 = r11.f9478p
            java.lang.Object r1 = com.google.android.exoplayer2.util.a.checkNotNull(r1)
            bf.v r1 = (bf.v) r1
            r1.createPeriod(r0)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.x.k(com.google.android.exoplayer2.m3):void");
    }

    public final void l(long j10) {
        v vVar = this.f9478p;
        int indexOfPeriod = this.f9477o.getIndexOfPeriod(vVar.f9440b.f9193a);
        if (indexOfPeriod == -1) {
            return;
        }
        long j11 = this.f9477o.getPeriod(indexOfPeriod, this.f9476n).f27599f;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        vVar.overridePreparePositionUs(j10);
    }

    @Override // bf.p1
    public void prepareSourceInternal() {
        if (this.f9474l) {
            return;
        }
        this.f9479q = true;
        i(null, this.f9377k);
    }

    @Override // bf.p1, bf.i, bf.a, bf.f0
    public void releasePeriod(a0 a0Var) {
        ((v) a0Var).releasePeriod();
        if (a0Var == this.f9478p) {
            this.f9478p = null;
        }
    }

    @Override // bf.i, bf.a
    public void releaseSourceInternal() {
        this.f9480r = false;
        this.f9479q = false;
        super.releaseSourceInternal();
    }

    @Override // bf.p1, bf.i, bf.a, bf.f0
    public v createPeriod(d0 d0Var, qf.c cVar, long j10) {
        v vVar = new v(d0Var, cVar, j10);
        f0 f0Var = this.f9377k;
        vVar.setMediaSource(f0Var);
        if (!this.f9480r) {
            this.f9478p = vVar;
            if (!this.f9479q) {
                this.f9479q = true;
                i(null, f0Var);
            }
            return vVar;
        }
        Object obj = d0Var.f9193a;
        if (this.f9477o.f9462i != null && obj.equals(w.f9460j)) {
            obj = this.f9477o.f9462i;
        }
        vVar.createPeriod(d0Var.copyWithPeriodUid(obj));
        return vVar;
    }

    @Override // bf.i, bf.a, bf.f0
    public void maybeThrowSourceInfoRefreshError() {
    }
}
