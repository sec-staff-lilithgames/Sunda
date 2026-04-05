package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f3 implements d3, j2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f80209b;

    /* renamed from: c, reason: collision with root package name */
    public final zu.m f80210c;

    public f3(j2 j2Var, zu.m mVar) {
        this.f80209b = j2Var;
        this.f80210c = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p0.d3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitDispose(kv.a r5, zu.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p0.e3
            if (r0 == 0) goto L13
            r0 = r6
            p0.e3 r0 = (p0.e3) r0
            int r1 = r0.f80199l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80199l = r1
            goto L18
        L13:
            p0.e3 r0 = new p0.e3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f80197j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80199l
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kv.a r5 = r0.f80196i
            kv.a r5 = (kv.a) r5
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L35
            goto L5d
        L35:
            r6 = move-exception
            goto L63
        L37:
            tu.a0.throwOnFailure(r6)
            r6 = r5
            kv.a r6 = (kv.a) r6     // Catch: java.lang.Throwable -> L35
            r0.f80196i = r6     // Catch: java.lang.Throwable -> L35
            r0.f80199l = r3     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L35
            zu.d r2 = av.b.intercepted(r0)     // Catch: java.lang.Throwable -> L35
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            r6.initCancellability()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = r6.getResult()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L35
            if (r6 != r2) goto L5a
            bv.h.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L35
        L5a:
            if (r6 != r1) goto L5d
            return r1
        L5d:
            tu.k r6 = new tu.k     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L63:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.f3.awaitDispose(kv.a, zu.d):java.lang.Object");
    }

    @Override // p0.d3, p0.j2
    public Object component1() {
        return this.f80209b.component1();
    }

    @Override // p0.d3, p0.j2
    public kv.l component2() {
        return this.f80209b.component2();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public zu.m getCoroutineContext() {
        return this.f80210c;
    }

    @Override // p0.d3, p0.j2, p0.v5
    public Object getValue() {
        return this.f80209b.getValue();
    }

    @Override // p0.d3, p0.j2
    public void setValue(Object obj) {
        this.f80209b.setValue(obj);
    }
}
