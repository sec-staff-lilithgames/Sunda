package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f51641i;

    /* renamed from: j, reason: collision with root package name */
    public int f51642j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51643k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.q f51644l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(f0.q qVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51643k = j2Var;
        this.f51644l = qVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new v1(this.f51644l, this.f51643k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r2.emit(r1, r6) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f51642j
            f0.q r2 = r6.f51644l
            r3 = 2
            r4 = 1
            p0.j2 r5 = r6.f51643k
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            java.lang.Object r0 = r6.f51641i
            f0.d r0 = (f0.d) r0
            tu.a0.throwOnFailure(r7)
            goto L5f
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            java.lang.Object r1 = r6.f51641i
            p0.j2 r1 = (p0.j2) r1
            tu.a0.throwOnFailure(r7)
            goto L48
        L2a:
            tu.a0.throwOnFailure(r7)
            java.lang.Object r7 = r5.getValue()
            f0.d r7 = (f0.d) r7
            if (r7 == 0) goto L4c
            f0.e r1 = new f0.e
            r1.<init>(r7)
            if (r2 == 0) goto L47
            r6.f51641i = r5
            r6.f51642j = r4
            java.lang.Object r7 = r2.emit(r1, r6)
            if (r7 != r0) goto L47
            goto L5d
        L47:
            r1 = r5
        L48:
            r7 = 0
            r1.setValue(r7)
        L4c:
            f0.d r7 = new f0.d
            r7.<init>()
            if (r2 == 0) goto L60
            r6.f51641i = r7
            r6.f51642j = r3
            java.lang.Object r1 = r2.emit(r7, r6)
            if (r1 != r0) goto L5e
        L5d:
            return r0
        L5e:
            r0 = r7
        L5f:
            r7 = r0
        L60:
            r5.setValue(r7)
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((v1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
