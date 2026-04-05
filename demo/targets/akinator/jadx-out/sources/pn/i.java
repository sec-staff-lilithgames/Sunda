package pn;

import gn.i0;
import gn.p0;
import gn.r1;
import gn.u1;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends u1 {

    /* renamed from: e, reason: collision with root package name */
    public final long f81528e;

    /* renamed from: f, reason: collision with root package name */
    public final long f81529f;

    /* renamed from: g, reason: collision with root package name */
    public final long f81530g;

    /* renamed from: h, reason: collision with root package name */
    public final int f81531h;

    /* renamed from: i, reason: collision with root package name */
    public final long f81532i;

    /* renamed from: j, reason: collision with root package name */
    public final long f81533j;

    /* renamed from: k, reason: collision with root package name */
    public final long f81534k;

    /* renamed from: l, reason: collision with root package name */
    public final qn.c f81535l;

    /* renamed from: m, reason: collision with root package name */
    public final p0 f81536m;

    /* renamed from: n, reason: collision with root package name */
    public final i0 f81537n;

    public i(long j10, long j11, long j12, int i10, long j13, long j14, long j15, qn.c cVar, p0 p0Var, i0 i0Var) {
        io.bidmachine.media3.common.util.a.checkState(cVar.f83308d == (i0Var != null));
        this.f81528e = j10;
        this.f81529f = j11;
        this.f81530g = j12;
        this.f81531h = i10;
        this.f81532i = j13;
        this.f81533j = j14;
        this.f81534k = j15;
        this.f81535l = cVar;
        this.f81536m = p0Var;
        this.f81537n = i0Var;
    }

    @Override // gn.u1
    public int getIndexOfPeriod(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f81531h) >= 0 && iIntValue < getPeriodCount()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // gn.u1
    public r1 getPeriod(int i10, r1 r1Var, boolean z10) {
        io.bidmachine.media3.common.util.a.checkIndex(i10, 0, getPeriodCount());
        qn.c cVar = this.f81535l;
        return r1Var.set(z10 ? cVar.getPeriod(i10).f83340a : null, z10 ? Integer.valueOf(this.f81531h + i10) : null, 0, cVar.getPeriodDurationUs(i10), a1.msToUs(cVar.getPeriod(i10).f83341b - cVar.getPeriod(0).f83341b) - this.f81532i);
    }

    @Override // gn.u1
    public int getPeriodCount() {
        return this.f81535l.getPeriodCount();
    }

    @Override // gn.u1
    public Object getUidOfPeriod(int i10) {
        io.bidmachine.media3.common.util.a.checkIndex(i10, 0, getPeriodCount());
        return Integer.valueOf(this.f81531h + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r4
      0x0034: PHI (r4v3 long) = (r4v0 long), (r4v5 long) binds: [B:9:0x0026, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
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
            qn.c r6 = r0.f81535l
            boolean r3 = r6.f83308d
            long r4 = r0.f81534k
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L89
            long r9 = r6.f83309e
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L89
            long r9 = r6.f83306b
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 != 0) goto L89
            r9 = 0
            int r3 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r3 <= 0) goto L34
            long r4 = r4 + r27
            long r11 = r0.f81533j
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 <= 0) goto L34
            r16 = r2
            r4 = r7
            goto L8b
        L34:
            long r11 = r0.f81532i
            long r11 = r11 + r4
            long r13 = r6.getPeriodDurationUs(r1)
            r3 = r1
        L3c:
            int r15 = r6.getPeriodCount()
            int r15 = r15 - r2
            if (r3 >= r15) goto L4f
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L4f
            long r11 = r11 - r13
            int r3 = r3 + 1
            long r13 = r6.getPeriodDurationUs(r3)
            goto L3c
        L4f:
            qn.g r3 = r6.getPeriod(r3)
            r15 = 2
            int r15 = r3.getAdaptationSetIndex(r15)
            r16 = r2
            r2 = -1
            if (r15 != r2) goto L5e
            goto L8b
        L5e:
            java.util.List r2 = r3.f83342c
            java.lang.Object r2 = r2.get(r15)
            qn.a r2 = (qn.a) r2
            java.util.List r2 = r2.f83297c
            java.lang.Object r2 = r2.get(r1)
            qn.l r2 = (qn.l) r2
            pn.q r2 = r2.getIndex()
            if (r2 == 0) goto L8b
            long r17 = r2.getSegmentCount(r13)
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 != 0) goto L7d
            goto L8b
        L7d:
            long r9 = r2.getSegmentNum(r11, r13)
            long r2 = r2.getTimeUs(r9)
            long r2 = r2 + r4
            long r4 = r2 - r11
            goto L8b
        L89:
            r16 = r2
        L8b:
            java.lang.Object r2 = gn.t1.f58165q
            boolean r3 = r6.f83308d
            if (r3 == 0) goto La0
            long r9 = r6.f83309e
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto La0
            long r9 = r6.f83306b
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 != 0) goto La0
            r14 = r16
            goto La1
        La0:
            r14 = r1
        La1:
            int r1 = r0.getPeriodCount()
            int r21 = r1 + (-1)
            long r7 = r0.f81532i
            r16 = r4
            gn.p0 r5 = r0.f81536m
            r22 = r7
            long r7 = r0.f81528e
            long r9 = r0.f81529f
            long r11 = r0.f81530g
            r13 = 1
            gn.i0 r15 = r0.f81537n
            long r3 = r0.f81533j
            r20 = 0
            r18 = r3
            r3 = r26
            r4 = r2
            gn.t1 r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.i.getWindow(int, gn.t1, long):gn.t1");
    }

    @Override // gn.u1
    public int getWindowCount() {
        return 1;
    }
}
