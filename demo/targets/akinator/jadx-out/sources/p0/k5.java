package p0;

import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f80309i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f80310j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ zu.m f80311k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Flow f80312l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(zu.m mVar, Flow flow, zu.d dVar) {
        super(2, dVar);
        this.f80311k = mVar;
        this.f80312l = flow;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        k5 k5Var = new k5(this.f80311k, this.f80312l, dVar);
        k5Var.f80310j = obj;
        return k5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r5.collect(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r4, r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r0;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f80309i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            tu.a0.throwOnFailure(r7)
            goto L4b
        L1b:
            tu.a0.throwOnFailure(r7)
            java.lang.Object r7 = r6.f80310j
            p0.d3 r7 = (p0.d3) r7
            zu.n r1 = zu.n.f98854b
            zu.m r4 = r6.f80311k
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r4, r1)
            kotlinx.coroutines.flow.Flow r5 = r6.f80312l
            if (r1 == 0) goto L3c
            p0.h5 r1 = new p0.h5
            r1.<init>(r7)
            r6.f80309i = r3
            java.lang.Object r7 = r5.collect(r1, r6)
            if (r7 != r0) goto L4b
            goto L4a
        L3c:
            p0.j5 r1 = new p0.j5
            r3 = 0
            r1.<init>(r5, r7, r3)
            r6.f80309i = r2
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r4, r1, r6)
            if (r7 != r0) goto L4b
        L4a:
            return r0
        L4b:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.k5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(d3 d3Var, zu.d<? super tu.x0> dVar) {
        return ((k5) create(d3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
