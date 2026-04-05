package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public Object f70467i;

    /* renamed from: j, reason: collision with root package name */
    public int f70468j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f70469k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ zu.m f70470l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.p f70471m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p pVar, kv.p pVar2, zu.m mVar, zu.d dVar) {
        super(1, dVar);
        this.f70469k = pVar;
        this.f70470l = mVar;
        this.f70471m = pVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        zu.m mVar = this.f70470l;
        return new q0(this.f70469k, this.f70471m, mVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws k4.e {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.f70468j
            k4.p r2 = r8.f70469k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r8.f70467i
            tu.a0.throwOnFailure(r9)
            return r0
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f70467i
            k4.g r1 = (k4.g) r1
            tu.a0.throwOnFailure(r9)
            goto L51
        L29:
            tu.a0.throwOnFailure(r9)
            goto L39
        L2d:
            tu.a0.throwOnFailure(r9)
            r8.f70468j = r5
            java.lang.Object r9 = k4.p.access$readDataOrHandleCorruption(r2, r5, r8)
            if (r9 != r0) goto L39
            goto L68
        L39:
            r1 = r9
            k4.g r1 = (k4.g) r1
            k4.p0 r9 = new k4.p0
            kv.p r6 = r8.f70471m
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f70467i = r1
            r8.f70468j = r4
            zu.m r4 = r8.f70470l
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r4, r9, r8)
            if (r9 != r0) goto L51
            goto L68
        L51:
            r1.checkHashCode()
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r1, r9)
            if (r1 != 0) goto L69
            r8.f70467i = r9
            r8.f70468j = r3
            java.lang.Object r1 = r2.writeData$datastore_core_release(r9, r5, r8)
            if (r1 != r0) goto L69
        L68:
            return r0
        L69:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.l
    public final Object invoke(zu.d<Object> dVar) {
        return ((q0) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
