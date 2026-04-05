package e0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s3 implements t1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f53307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v5 f53308c;

    public s3(boolean z10, v5 v5Var) {
        this.f53307b = z10;
        this.f53308c = v5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t1.a
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo24onPostFlingRZ2iAVY(long r3, long r5, zu.d<? super s2.e0> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof e0.r3
            if (r3 == 0) goto L13
            r3 = r7
            e0.r3 r3 = (e0.r3) r3
            int r4 = r3.f53290l
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f53290l = r4
            goto L18
        L13:
            e0.r3 r3 = new e0.r3
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f53288j
            java.lang.Object r7 = av.e.getCOROUTINE_SUSPENDED()
            int r0 = r3.f53290l
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.f53287i
            tu.a0.throwOnFailure(r4)
            goto L4d
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            tu.a0.throwOnFailure(r4)
            boolean r4 = r2.f53307b
            if (r4 == 0) goto L58
            p0.v5 r4 = r2.f53308c
            java.lang.Object r4 = r4.getValue()
            e0.z3 r4 = (e0.z3) r4
            r3.f53287i = r5
            r3.f53290l = r1
            java.lang.Object r4 = r4.m3794doFlingAnimationQWom1Mo(r5, r3)
            if (r4 != r7) goto L4d
            return r7
        L4d:
            s2.e0 r4 = (s2.e0) r4
            long r3 = r4.m6808unboximpl()
            long r3 = s2.e0.m6802minusAH228Gc(r5, r3)
            goto L5e
        L58:
            s2.d0 r3 = s2.e0.f85330b
            long r3 = r3.m6777getZero9UxMQ8M()
        L5e:
            s2.e0 r3 = s2.e0.m6790boximpl(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.s3.mo24onPostFlingRZ2iAVY(long, long, zu.d):java.lang.Object");
    }

    @Override // t1.a
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo25onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return this.f53307b ? ((z3) this.f53308c.getValue()).m3795performRawScrollMKHz9U(j11) : i1.h.f59344b.m4173getZeroF1C5BW0();
    }

    @Override // t1.a
    /* renamed from: onPreFling-QWom1Mo */
    public /* bridge */ /* synthetic */ Object mo26onPreFlingQWom1Mo(long j10, zu.d dVar) {
        return super.mo26onPreFlingQWom1Mo(j10, dVar);
    }

    @Override // t1.a
    /* renamed from: onPreScroll-OzD1aCk */
    public /* bridge */ /* synthetic */ long mo27onPreScrollOzD1aCk(long j10, int i10) {
        return super.mo27onPreScrollOzD1aCk(j10, i10);
    }
}
