package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.z0 f70547i;

    /* renamed from: j, reason: collision with root package name */
    public int f70548j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70549k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f70550l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f70551m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f70552n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f70553o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlin.jvm.internal.z0 z0Var, p pVar, Object obj, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f70550l = z0Var;
        this.f70551m = pVar;
        this.f70552n = obj;
        this.f70553o = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        w0 w0Var = new w0(this.f70550l, this.f70551m, this.f70552n, this.f70553o, dVar);
        w0Var.f70549k = obj;
        return w0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r6.writeData(r2, r7) == r0) goto L16;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f70548j
            java.lang.Object r2 = r7.f70552n
            k4.p r3 = r7.f70551m
            kotlin.jvm.internal.z0 r4 = r7.f70550l
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L20
            if (r1 != r5) goto L18
            tu.a0.throwOnFailure(r8)
            goto L5b
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlin.jvm.internal.z0 r1 = r7.f70547i
            java.lang.Object r6 = r7.f70549k
            k4.a3 r6 = (k4.a3) r6
            tu.a0.throwOnFailure(r8)
            goto L45
        L2a:
            tu.a0.throwOnFailure(r8)
            java.lang.Object r8 = r7.f70549k
            k4.a3 r8 = (k4.a3) r8
            k4.l1 r1 = k4.p.access$getCoordinator(r3)
            r7.f70549k = r8
            r7.f70547i = r4
            r7.f70548j = r6
            java.lang.Object r1 = r1.incrementAndGetVersion(r7)
            if (r1 != r0) goto L42
            goto L5a
        L42:
            r6 = r8
            r8 = r1
            r1 = r4
        L45:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.f71866b = r8
            r8 = 0
            r7.f70549k = r8
            r7.f70547i = r8
            r7.f70548j = r5
            java.lang.Object r8 = r6.writeData(r2, r7)
            if (r8 != r0) goto L5b
        L5a:
            return r0
        L5b:
            boolean r8 = r7.f70553o
            if (r8 == 0) goto L75
            k4.x0 r8 = k4.p.access$getInMemoryCache$p(r3)
            k4.g r0 = new k4.g
            if (r2 == 0) goto L6c
            int r1 = r2.hashCode()
            goto L6d
        L6c:
            r1 = 0
        L6d:
            int r3 = r4.f71866b
            r0.<init>(r2, r1, r3)
            r8.tryUpdate(r0)
        L75:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(a3 a3Var, zu.d<? super tu.x0> dVar) {
        return ((w0) create(a3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
