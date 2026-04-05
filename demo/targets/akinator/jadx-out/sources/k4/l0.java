package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f70404i;

    /* renamed from: j, reason: collision with root package name */
    public int f70405j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f70406k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f70407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f70408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p pVar, int i10, zu.d dVar) {
        super(2, dVar);
        this.f70407l = pVar;
        this.f70408m = i10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        l0 l0Var = new l0(this.f70407l, this.f70408m, dVar);
        l0Var.f70406k = ((Boolean) obj).booleanValue();
        return l0Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (zu.d<? super g>) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f70405j
            k4.p r2 = r6.f70407l
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            java.lang.Object r0 = r6.f70404i
            tu.a0.throwOnFailure(r7)
            goto L47
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            boolean r1 = r6.f70406k
            tu.a0.throwOnFailure(r7)
            goto L34
        L24:
            tu.a0.throwOnFailure(r7)
            boolean r1 = r6.f70406k
            r6.f70406k = r1
            r6.f70405j = r4
            java.lang.Object r7 = k4.p.access$readDataFromFileOrDefault(r2, r6)
            if (r7 != r0) goto L34
            goto L44
        L34:
            if (r1 == 0) goto L4e
            k4.l1 r1 = k4.p.access$getCoordinator(r2)
            r6.f70404i = r7
            r6.f70405j = r3
            java.lang.Object r1 = r1.getVersion(r6)
            if (r1 != r0) goto L45
        L44:
            return r0
        L45:
            r0 = r7
            r7 = r1
        L47:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L53
        L4e:
            int r0 = r6.f70408m
            r5 = r0
            r0 = r7
            r7 = r5
        L53:
            k4.g r1 = new k4.g
            if (r0 == 0) goto L5c
            int r2 = r0.hashCode()
            goto L5d
        L5c:
            r2 = 0
        L5d:
            r1.<init>(r0, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(boolean z10, zu.d<? super g> dVar) {
        return ((l0) create(Boolean.valueOf(z10), dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
