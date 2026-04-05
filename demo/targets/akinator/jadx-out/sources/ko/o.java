package ko;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final i f71712a;

    /* renamed from: b, reason: collision with root package name */
    public final n f71713b;

    /* renamed from: c, reason: collision with root package name */
    public k f71714c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71715d;

    public o(l lVar, n nVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f71713b = nVar;
        this.f71715d = i10;
        this.f71712a = new i(lVar, j10, 0L, j11, j12, j13, j14);
    }

    public static int a(a0 a0Var, long j10, v0 v0Var) {
        if (j10 == a0Var.getPosition()) {
            return 0;
        }
        v0Var.f71790a = j10;
        return 1;
    }

    public final y0 getSeekMap() {
        return this.f71712a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return a(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int handlePendingSeek(ko.a0 r28, ko.v0 r29) throws java.io.IOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            ko.k r3 = r0.f71714c
            java.lang.Object r3 = io.bidmachine.media3.common.util.a.checkStateNotNull(r3)
            ko.k r3 = (ko.k) r3
            long r4 = r3.f71686f
            long r6 = r3.f71687g
            long r8 = r3.f71688h
            long r6 = r6 - r4
            int r10 = r0.f71715d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            ko.n r10 = r0.f71713b
            if (r6 > 0) goto L29
            r0.f71714c = r7
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
            long r4 = r3.f71682b
            ko.m r4 = r10.searchForTimestamp(r1, r4)
            int r5 = r4.f71705a
            r15 = r11
            long r11 = r4.f71706b
            r17 = r13
            long r13 = r4.f71707c
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
            r0.f71714c = r7
            r10.onSeekFinished()
            int r1 = a(r1, r13, r2)
            return r1
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L81:
            r3.f71685e = r11
            r3.f71687g = r13
            long r4 = r3.f71682b
            long r6 = r3.f71684d
            long r8 = r3.f71686f
            r15 = r4
            long r4 = r3.f71683c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = ko.k.a(r15, r17, r19, r21, r23, r25)
            r3.f71688h = r4
            goto L6
        La0:
            r4 = r11
            r6 = r13
            r3.f71684d = r4
            r3.f71686f = r6
            long r8 = r3.f71682b
            long r10 = r3.f71685e
            long r12 = r3.f71687g
            long r14 = r3.f71683c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = ko.k.a(r15, r17, r19, r21, r23, r25)
            r3.f71688h = r4
            goto L6
        Lc1:
            r0.f71714c = r7
            r10.onSeekFinished()
            int r1 = a(r1, r8, r2)
            return r1
        Lcb:
            int r1 = a(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.o.handlePendingSeek(ko.a0, ko.v0):int");
    }

    public final boolean isSeeking() {
        return this.f71714c != null;
    }

    public final void setSeekTargetUs(long j10) {
        k kVar = this.f71714c;
        if (kVar == null || kVar.f71681a != j10) {
            i iVar = this.f71712a;
            this.f71714c = new k(j10, iVar.timeUsToTargetTime(j10), iVar.f71666c, iVar.f71667d, iVar.f71668e, iVar.f71669f, iVar.f71670g);
        }
    }
}
