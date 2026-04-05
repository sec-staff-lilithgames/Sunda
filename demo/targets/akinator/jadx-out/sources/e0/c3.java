package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c3 {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollBy(e0.t3 r7, float r8, c0.n r9, zu.d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof e0.w2
            if (r0 == 0) goto L14
            r0 = r10
            e0.w2 r0 = (e0.w2) r0
            int r1 = r0.f53367k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f53367k = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            e0.w2 r0 = new e0.w2
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f53366j
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.f53367k
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.jvm.internal.y0 r7 = r4.f53365i
            tu.a0.throwOnFailure(r10)
            goto L53
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            tu.a0.throwOnFailure(r10)
            kotlin.jvm.internal.y0 r10 = new kotlin.jvm.internal.y0
            r10.<init>()
            e0.y2 r3 = new e0.y2
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.f53365i = r10
            r4.f53367k = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = e0.t3.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            r7 = r10
        L53:
            float r7 = r7.f71865b
            java.lang.Float r7 = bv.b.boxFloat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c3.animateScrollBy(e0.t3, float, c0.n, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(t3 t3Var, float f10, c0.n nVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = c0.o.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(t3Var, f10, nVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollBy(e0.t3 r7, float r8, zu.d<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof e0.z2
            if (r0 == 0) goto L14
            r0 = r9
            e0.z2 r0 = (e0.z2) r0
            int r1 = r0.f53447k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f53447k = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            e0.z2 r0 = new e0.z2
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f53446j
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.f53447k
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.jvm.internal.y0 r7 = r4.f53445i
            tu.a0.throwOnFailure(r9)
            goto L53
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            tu.a0.throwOnFailure(r9)
            kotlin.jvm.internal.y0 r9 = new kotlin.jvm.internal.y0
            r9.<init>()
            e0.a3 r3 = new e0.a3
            r1 = 0
            r3.<init>(r9, r8, r1)
            r4.f53445i = r9
            r4.f53447k = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = e0.t3.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            r7 = r9
        L53:
            float r7 = r7.f71865b
            java.lang.Float r7 = bv.b.boxFloat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c3.scrollBy(e0.t3, float, zu.d):java.lang.Object");
    }

    public static final Object stopScroll(t3 t3Var, d0.l3 l3Var, zu.d<? super tu.x0> dVar) {
        new b3(2, null);
        Object objA = t3Var.a();
        return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : tu.x0.f87415a;
    }

    public static /* synthetic */ Object stopScroll$default(t3 t3Var, d0.l3 l3Var, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l3Var = d0.l3.f51488b;
        }
        return stopScroll(t3Var, l3Var, dVar);
    }
}
