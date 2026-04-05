package io.odeeo.internal.a0;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 extends y0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Object f62318p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final io.odeeo.internal.b.z f62319q = new z.c().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* renamed from: c, reason: collision with root package name */
    public final long f62320c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62321d;

    /* renamed from: e, reason: collision with root package name */
    public final long f62322e;

    /* renamed from: f, reason: collision with root package name */
    public final long f62323f;

    /* renamed from: g, reason: collision with root package name */
    public final long f62324g;

    /* renamed from: h, reason: collision with root package name */
    public final long f62325h;

    /* renamed from: i, reason: collision with root package name */
    public final long f62326i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f62327j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f62328k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f62329l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f62330m;

    /* renamed from: n, reason: collision with root package name */
    public final io.odeeo.internal.b.z f62331n;

    /* renamed from: o, reason: collision with root package name */
    public final z.g f62332o;

    @Deprecated
    public g0(long j10, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // io.odeeo.internal.b.y0
    public int getIndexOfPeriod(Object obj) {
        return f62318p.equals(obj) ? 0 : -1;
    }

    @Override // io.odeeo.internal.b.y0
    public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
        io.odeeo.internal.q0.a.checkIndex(i10, 0, 1);
        return bVar.set(null, z10 ? f62318p : null, 0, this.f62323f, -this.f62325h);
    }

    @Override // io.odeeo.internal.b.y0
    public int getPeriodCount() {
        return 1;
    }

    @Override // io.odeeo.internal.b.y0
    public Object getUidOfPeriod(int i10) {
        io.odeeo.internal.q0.a.checkIndex(i10, 0, 1);
        return f62318p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // io.odeeo.internal.b.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.odeeo.internal.b.y0.d getWindow(int r25, io.odeeo.internal.b.y0.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            io.odeeo.internal.q0.a.checkIndex(r3, r1, r2)
            long r1 = r0.f62326i
            boolean r14 = r0.f62328k
            if (r14 == 0) goto L2e
            boolean r3 = r0.f62329l
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f62324g
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
            goto L2b
        L25:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
        L2b:
            r16 = r5
            goto L30
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = io.odeeo.internal.b.y0.d.f63086r
            io.odeeo.internal.b.z r5 = r0.f62331n
            java.lang.Object r6 = r0.f62330m
            long r7 = r0.f62320c
            long r9 = r0.f62321d
            long r11 = r0.f62322e
            boolean r13 = r0.f62327j
            io.odeeo.internal.b.z$g r15 = r0.f62332o
            long r1 = r0.f62324g
            r18 = r1
            long r1 = r0.f62325h
            r20 = 0
            r21 = 0
            r3 = r26
            r22 = r1
            io.odeeo.internal.b.y0$d r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.a0.g0.getWindow(int, io.odeeo.internal.b.y0$d, long):io.odeeo.internal.b.y0$d");
    }

    @Override // io.odeeo.internal.b.y0
    public int getWindowCount() {
        return 1;
    }

    public g0(long j10, boolean z10, boolean z11, boolean z12, Object obj, io.odeeo.internal.b.z zVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, zVar);
    }

    @Deprecated
    public g0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, io.odeeo.internal.b.z zVar) {
        io.odeeo.internal.b.z zVar2;
        z.g gVar;
        if (z12) {
            zVar2 = zVar;
            gVar = zVar2.f63112d;
        } else {
            zVar2 = zVar;
            gVar = null;
        }
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, false, obj, zVar2, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public g0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, Object obj2) {
        io.odeeo.internal.b.z zVar = f62319q;
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, zVar.buildUpon().setTag(obj2).build(), z12 ? zVar.f63112d : null);
    }

    @Deprecated
    public g0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, Object obj, io.odeeo.internal.b.z zVar, z.g gVar) {
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, zVar, gVar);
    }

    public g0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, io.odeeo.internal.b.z zVar, z.g gVar) {
        this.f62320c = j10;
        this.f62321d = j11;
        this.f62322e = j12;
        this.f62323f = j13;
        this.f62324g = j14;
        this.f62325h = j15;
        this.f62326i = j16;
        this.f62327j = z10;
        this.f62328k = z11;
        this.f62329l = z12;
        this.f62330m = obj;
        this.f62331n = (io.odeeo.internal.b.z) io.odeeo.internal.q0.a.checkNotNull(zVar);
        this.f62332o = gVar;
    }
}
