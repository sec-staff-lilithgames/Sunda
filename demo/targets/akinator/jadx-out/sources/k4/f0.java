package k4;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70320i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f70321j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p pVar, zu.d dVar) {
        super(2, dVar);
        this.f70321j = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f0(this.f70321j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L15;
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
            int r1 = r5.f70320i
            r2 = 2
            r3 = 1
            k4.p r4 = r5.f70321j
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            tu.a0.throwOnFailure(r6)
            goto L4a
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            tu.a0.throwOnFailure(r6)
            goto L30
        L20:
            tu.a0.throwOnFailure(r6)
            k4.p$b r6 = k4.p.access$getReadAndInit$p(r4)
            r5.f70320i = r3
            java.lang.Object r6 = r6.awaitComplete(r5)
            if (r6 != r0) goto L30
            goto L49
        L30:
            k4.l1 r6 = k4.p.access$getCoordinator(r4)
            kotlinx.coroutines.flow.Flow r6 = r6.getUpdateNotifications()
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.conflate(r6)
            k4.e0 r1 = new k4.e0
            r1.<init>(r4)
            r5.f70320i = r2
            java.lang.Object r6 = r6.collect(r1, r5)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
