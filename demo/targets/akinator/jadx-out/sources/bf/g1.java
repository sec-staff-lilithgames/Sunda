package bf;

import android.net.Uri;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g1 extends m3 {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f9240t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final u1 f9241u = new com.google.android.exoplayer2.h1().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* renamed from: g, reason: collision with root package name */
    public final long f9242g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9243h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9244i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9245j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9246k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9247l;

    /* renamed from: m, reason: collision with root package name */
    public final long f9248m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f9249n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9250o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9251p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f9252q;

    /* renamed from: r, reason: collision with root package name */
    public final u1 f9253r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.android.exoplayer2.n1 f9254s;

    @Deprecated
    public g1(long j10, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // com.google.android.exoplayer2.m3
    public int getIndexOfPeriod(Object obj) {
        return f9240t.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.m3
    public k3 getPeriod(int i10, k3 k3Var, boolean z10) {
        com.google.android.exoplayer2.util.a.checkIndex(i10, 0, 1);
        return k3Var.set(null, z10 ? f9240t : null, 0, this.f9245j, -this.f9247l);
    }

    @Override // com.google.android.exoplayer2.m3
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.m3
    public Object getUidOfPeriod(int i10) {
        com.google.android.exoplayer2.util.a.checkIndex(i10, 0, 1);
        return f9240t;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.l3 getWindow(int r25, com.google.android.exoplayer2.l3 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.google.android.exoplayer2.util.a.checkIndex(r3, r1, r2)
            long r1 = r0.f9248m
            boolean r14 = r0.f9250o
            if (r14 == 0) goto L2e
            boolean r3 = r0.f9251p
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f9246k
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
            java.lang.Object r4 = com.google.android.exoplayer2.l3.f27640t
            r21 = 0
            long r1 = r0.f9247l
            com.google.android.exoplayer2.u1 r5 = r0.f9253r
            java.lang.Object r6 = r0.f9252q
            long r7 = r0.f9242g
            long r9 = r0.f9243h
            long r11 = r0.f9244i
            boolean r13 = r0.f9249n
            com.google.android.exoplayer2.n1 r15 = r0.f9254s
            r22 = r1
            long r1 = r0.f9246k
            r20 = 0
            r3 = r26
            r18 = r1
            com.google.android.exoplayer2.l3 r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.g1.getWindow(int, com.google.android.exoplayer2.l3, long):com.google.android.exoplayer2.l3");
    }

    @Override // com.google.android.exoplayer2.m3
    public int getWindowCount() {
        return 1;
    }

    public g1(long j10, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, u1Var);
    }

    @Deprecated
    public g1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    public g1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, false, obj, u1Var, z12 ? u1Var.f28114e : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public g1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        u1 u1Var = f9241u;
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, u1Var.buildUpon().setTag(obj2).build(), z12 ? u1Var.f28114e : null);
    }

    @Deprecated
    public g1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, Object obj, u1 u1Var, com.google.android.exoplayer2.n1 n1Var) {
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, u1Var, n1Var);
    }

    public g1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var, com.google.android.exoplayer2.n1 n1Var) {
        this.f9242g = j10;
        this.f9243h = j11;
        this.f9244i = j12;
        this.f9245j = j13;
        this.f9246k = j14;
        this.f9247l = j15;
        this.f9248m = j16;
        this.f9249n = z10;
        this.f9250o = z11;
        this.f9251p = z12;
        this.f9252q = obj;
        this.f9253r = (u1) com.google.android.exoplayer2.util.a.checkNotNull(u1Var);
        this.f9254s = n1Var;
    }
}
