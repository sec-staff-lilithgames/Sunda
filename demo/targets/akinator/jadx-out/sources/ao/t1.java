package ao;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t1 extends gn.u1 {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f7813r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final gn.p0 f7814s = new gn.c0().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* renamed from: e, reason: collision with root package name */
    public final long f7815e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7816f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7817g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7818h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7819i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7820j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7821k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7822l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7823m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7824n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7825o;

    /* renamed from: p, reason: collision with root package name */
    public final gn.p0 f7826p;

    /* renamed from: q, reason: collision with root package name */
    public final gn.i0 f7827q;

    @Deprecated
    public t1(long j10, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // gn.u1
    public int getIndexOfPeriod(Object obj) {
        return f7813r.equals(obj) ? 0 : -1;
    }

    @Override // gn.u1
    public gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
        io.bidmachine.media3.common.util.a.checkIndex(i10, 0, 1);
        return r1Var.set(null, z10 ? f7813r : null, 0, this.f7818h, -this.f7820j);
    }

    @Override // gn.u1
    public int getPeriodCount() {
        return 1;
    }

    @Override // gn.u1
    public Object getUidOfPeriod(int i10) {
        io.bidmachine.media3.common.util.a.checkIndex(i10, 0, 1);
        return f7813r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gn.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gn.t1 getWindow(int r25, gn.t1 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            io.bidmachine.media3.common.util.a.checkIndex(r3, r1, r2)
            long r1 = r0.f7821k
            boolean r14 = r0.f7823m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f7824n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f7819i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = gn.t1.f58165q
            r21 = 0
            long r1 = r0.f7820j
            gn.p0 r5 = r0.f7826p
            java.lang.Object r6 = r0.f7825o
            long r7 = r0.f7815e
            long r9 = r0.f7816f
            long r11 = r0.f7817g
            boolean r13 = r0.f7822l
            gn.i0 r15 = r0.f7827q
            r22 = r1
            long r1 = r0.f7819i
            r20 = 0
            r3 = r26
            r18 = r1
            gn.t1 r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.t1.getWindow(int, gn.t1, long):gn.t1");
    }

    @Override // gn.u1
    public int getWindowCount() {
        return 1;
    }

    public t1(long j10, boolean z10, boolean z11, boolean z12, Object obj, gn.p0 p0Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, p0Var);
    }

    @Deprecated
    public t1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    public t1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, gn.p0 p0Var) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, false, obj, p0Var, z12 ? p0Var.f58054c : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public t1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        gn.p0 p0Var = f7814s;
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, p0Var.buildUpon().setTag(obj2).build(), z12 ? p0Var.f58054c : null);
    }

    @Deprecated
    public t1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, Object obj, gn.p0 p0Var, gn.i0 i0Var) {
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, p0Var, i0Var);
    }

    public t1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, gn.p0 p0Var, gn.i0 i0Var) {
        this.f7815e = j10;
        this.f7816f = j11;
        this.f7817g = j12;
        this.f7818h = j13;
        this.f7819i = j14;
        this.f7820j = j15;
        this.f7821k = j16;
        this.f7822l = z10;
        this.f7823m = z11;
        this.f7824n = z12;
        this.f7825o = obj;
        this.f7826p = (gn.p0) io.bidmachine.media3.common.util.a.checkNotNull(p0Var);
        this.f7827q = i0Var;
    }
}
