package k4;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70424i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f70425j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f70426k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p pVar, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f70425j = pVar;
        this.f70426k = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new n0(this.f70425j, this.f70426k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r5.f70424i
            r2 = 2
            r3 = 1
            k4.p r4 = r5.f70425j
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            tu.a0.throwOnFailure(r6)
            goto L4e
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L20
            goto L43
        L20:
            r6 = move-exception
            goto L51
        L22:
            tu.a0.throwOnFailure(r6)
            k4.x0 r6 = k4.p.access$getInMemoryCache$p(r4)
            k4.q2 r6 = r6.getCurrentState()
            boolean r6 = r6 instanceof k4.j1
            if (r6 == 0) goto L3a
            k4.x0 r6 = k4.p.access$getInMemoryCache$p(r4)
            k4.q2 r6 = r6.getCurrentState()
            return r6
        L3a:
            r5.f70424i = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r6 = k4.p.access$readAndInitOrPropagateAndThrowFailure(r4, r5)     // Catch: java.lang.Throwable -> L20
            if (r6 != r0) goto L43
            goto L4d
        L43:
            r5.f70424i = r2
            boolean r6 = r5.f70426k
            java.lang.Object r6 = k4.p.access$readDataAndUpdateCache(r4, r6, r5)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            k4.q2 r6 = (k4.q2) r6
            return r6
        L51:
            k4.d2 r0 = new k4.d2
            r1 = -1
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super q2> dVar) {
        return ((n0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
