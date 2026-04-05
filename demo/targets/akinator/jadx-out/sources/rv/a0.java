package rv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f84971i;

    /* renamed from: j, reason: collision with root package name */
    public int f84972j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f84973k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f84974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.a f84975m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(t tVar, kv.a aVar, zu.d dVar) {
        super(2, dVar);
        this.f84974l = tVar;
        this.f84975m = aVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        a0 a0Var = new a0(this.f84974l, this.f84975m, dVar);
        a0Var.f84973k = obj;
        return a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.yieldAll(r6, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r0.yieldAll(r2, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        return r1;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f84973k
            rv.v r0 = (rv.v) r0
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r5.f84972j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            java.lang.Object r0 = r5.f84971i
            java.util.Iterator r0 = (java.util.Iterator) r0
            tu.a0.throwOnFailure(r6)
            goto L64
        L23:
            tu.a0.throwOnFailure(r6)
            rv.t r6 = r5.f84974l
            java.util.Iterator r6 = r6.iterator()
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = bv.m.nullOutSpilledVariable(r0)
            r5.f84973k = r2
            java.lang.Object r2 = bv.m.nullOutSpilledVariable(r6)
            r5.f84971i = r2
            r5.f84972j = r4
            java.lang.Object r6 = r0.yieldAll(r6, r5)
            if (r6 != r1) goto L64
            goto L63
        L47:
            kv.a r2 = r5.f84975m
            java.lang.Object r2 = r2.invoke()
            rv.t r2 = (rv.t) r2
            java.lang.Object r4 = bv.m.nullOutSpilledVariable(r0)
            r5.f84973k = r4
            java.lang.Object r6 = bv.m.nullOutSpilledVariable(r6)
            r5.f84971i = r6
            r5.f84972j = r3
            java.lang.Object r6 = r0.yieldAll(r2, r5)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((a0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
