package ee;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final a f54189a;

    /* renamed from: b, reason: collision with root package name */
    public final f f54190b;

    /* renamed from: c, reason: collision with root package name */
    public c f54191c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54192d;

    public g(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f54190b = fVar;
        this.f54192d = i10;
        this.f54189a = new a(dVar, j10, 0L, j11, j12, j13, j14);
    }

    public static int a(q qVar, long j10, f0 f0Var) {
        if (j10 == qVar.getPosition()) {
            return 0;
        }
        f0Var.f54188a = j10;
        return 1;
    }

    public final i0 getSeekMap() {
        return this.f54189a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return a(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int handlePendingSeek(ee.q r28, ee.f0 r29) throws java.io.IOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            ee.c r3 = r0.f54191c
            java.lang.Object r3 = com.google.android.exoplayer2.util.a.checkStateNotNull(r3)
            ee.c r3 = (ee.c) r3
            long r4 = r3.f54173f
            long r6 = r3.f54174g
            long r8 = r3.f54175h
            long r6 = r6 - r4
            int r10 = r0.f54192d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            ee.f r10 = r0.f54190b
            if (r6 > 0) goto L29
            r0.f54191c = r7
            r10.onSeekFinished()
            int r1 = a(r1, r4, r2)
            return r1
        L29:
            long r4 = r1.getPosition()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lcb
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lcb
            int r4 = (int) r4
            r1.skipFully(r4)
            r1.resetPeekPosition()
            long r4 = r3.f54169b
            ee.e r4 = r10.searchForTimestamp(r1, r4)
            int r5 = r4.f54181a
            r15 = r11
            long r11 = r4.f54182b
            r17 = r13
            long r13 = r4.f54183c
            r4 = -3
            if (r5 == r4) goto Lc1
            r4 = -2
            if (r5 == r4) goto La0
            r4 = -1
            if (r5 == r4) goto L81
            if (r5 != 0) goto L79
            long r3 = r1.getPosition()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6f
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L6f
            int r3 = (int) r3
            r1.skipFully(r3)
        L6f:
            r0.f54191c = r7
            r10.onSeekFinished()
            int r1 = a(r1, r13, r2)
            return r1
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L81:
            r3.f54172e = r11
            r3.f54174g = r13
            long r4 = r3.f54169b
            long r6 = r3.f54171d
            long r8 = r3.f54173f
            r15 = r4
            long r4 = r3.f54170c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = ee.c.a(r15, r17, r19, r21, r23, r25)
            r3.f54175h = r4
            goto L6
        La0:
            r4 = r11
            r6 = r13
            r3.f54171d = r4
            r3.f54173f = r6
            long r8 = r3.f54169b
            long r10 = r3.f54172e
            long r12 = r3.f54174g
            long r14 = r3.f54170c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = ee.c.a(r15, r17, r19, r21, r23, r25)
            r3.f54175h = r4
            goto L6
        Lc1:
            r0.f54191c = r7
            r10.onSeekFinished()
            int r1 = a(r1, r8, r2)
            return r1
        Lcb:
            int r1 = a(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.g.handlePendingSeek(ee.q, ee.f0):int");
    }

    public final boolean isSeeking() {
        return this.f54191c != null;
    }

    public final void setSeekTargetUs(long j10) {
        c cVar = this.f54191c;
        if (cVar == null || cVar.f54168a != j10) {
            a aVar = this.f54189a;
            this.f54191c = new c(j10, aVar.timeUsToTargetTime(j10), aVar.f54148c, aVar.f54149d, aVar.f54150e, aVar.f54151f, aVar.f54152g);
        }
    }
}
