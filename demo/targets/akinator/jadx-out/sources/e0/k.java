package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final c0.c0 f53136a;

    public k(c0.c0 flingDecay) {
        kotlin.jvm.internal.e0.checkNotNullParameter(flingDecay, "flingDecay");
        this.f53136a = flingDecay;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // e0.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(e0.d3 r18, float r19, zu.d<? super java.lang.Float> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof e0.i
            if (r2 == 0) goto L18
            r2 = r1
            e0.i r2 = (e0.i) r2
            int r3 = r2.f53100l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f53100l = r3
        L16:
            r7 = r2
            goto L1e
        L18:
            e0.i r2 = new e0.i
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r7.f53098j
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r7.f53100l
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            kotlin.jvm.internal.y0 r2 = r7.f53097i
            tu.a0.throwOnFailure(r1)
            goto L7b
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            tu.a0.throwOnFailure(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L7e
            kotlin.jvm.internal.y0 r1 = new kotlin.jvm.internal.y0
            r1.<init>()
            r9 = r19
            r1.f71865b = r9
            kotlin.jvm.internal.y0 r3 = new kotlin.jvm.internal.y0
            r3.<init>()
            r15 = 28
            r16 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            c0.p r5 = c0.q.AnimationState$default(r8, r9, r10, r12, r14, r15, r16)
            e0.j r6 = new e0.j
            r8 = r18
            r6.<init>(r3, r8, r1)
            r7.f53097i = r1
            r7.f53100l = r4
            c0.c0 r4 = r0.f53136a
            r3 = r5
            r5 = 0
            r8 = 2
            r9 = 0
            java.lang.Object r3 = c0.x1.animateDecay$default(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L7a
            return r2
        L7a:
            r2 = r1
        L7b:
            float r1 = r2.f71865b
            goto L80
        L7e:
            r1 = r19
        L80:
            java.lang.Float r1 = bv.b.boxFloat(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.performFling(e0.d3, float, zu.d):java.lang.Object");
    }
}
