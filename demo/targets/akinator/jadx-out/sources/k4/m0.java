package k4;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public Serializable f70414i;

    /* renamed from: j, reason: collision with root package name */
    public int f70415j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f70416k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f70417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f70418m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlin.jvm.internal.b1 b1Var, p pVar, kotlin.jvm.internal.z0 z0Var, zu.d dVar) {
        super(1, dVar);
        this.f70416k = b1Var;
        this.f70417l = pVar;
        this.f70418m = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new m0(this.f70416k, this.f70417l, this.f70418m, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r9 != r0) goto L30;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.f70415j
            kotlin.jvm.internal.z0 r2 = r8.f70418m
            kotlin.jvm.internal.b1 r3 = r8.f70416k
            r4 = 3
            r5 = 2
            k4.p r6 = r8.f70417l
            r7 = 1
            if (r1 == 0) goto L38
            if (r1 == r7) goto L30
            if (r1 == r5) goto L28
            if (r1 != r4) goto L20
            java.io.Serializable r0 = r8.f70414i
            r2 = r0
            kotlin.jvm.internal.z0 r2 = (kotlin.jvm.internal.z0) r2
            tu.a0.throwOnFailure(r9)
            goto L6f
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L28:
            java.io.Serializable r1 = r8.f70414i
            kotlin.jvm.internal.z0 r1 = (kotlin.jvm.internal.z0) r1
            tu.a0.throwOnFailure(r9)     // Catch: k4.e -> L62
            goto L59
        L30:
            java.io.Serializable r1 = r8.f70414i
            kotlin.jvm.internal.b1 r1 = (kotlin.jvm.internal.b1) r1
            tu.a0.throwOnFailure(r9)     // Catch: k4.e -> L62
            goto L47
        L38:
            tu.a0.throwOnFailure(r9)
            r8.f70414i = r3     // Catch: k4.e -> L62
            r8.f70415j = r7     // Catch: k4.e -> L62
            java.lang.Object r9 = k4.p.access$readDataFromFileOrDefault(r6, r8)     // Catch: k4.e -> L62
            if (r9 != r0) goto L46
            goto L6e
        L46:
            r1 = r3
        L47:
            r1.f71816b = r9     // Catch: k4.e -> L62
            k4.l1 r9 = k4.p.access$getCoordinator(r6)     // Catch: k4.e -> L62
            r8.f70414i = r2     // Catch: k4.e -> L62
            r8.f70415j = r5     // Catch: k4.e -> L62
            java.lang.Object r9 = r9.getVersion(r8)     // Catch: k4.e -> L62
            if (r9 != r0) goto L58
            goto L6e
        L58:
            r1 = r2
        L59:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: k4.e -> L62
            int r9 = r9.intValue()     // Catch: k4.e -> L62
            r1.f71866b = r9     // Catch: k4.e -> L62
            goto L77
        L62:
            java.lang.Object r9 = r3.f71816b
            r8.f70414i = r2
            r8.f70415j = r4
            java.lang.Object r9 = r6.writeData$datastore_core_release(r9, r7, r8)
            if (r9 != r0) goto L6f
        L6e:
            return r0
        L6f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.f71866b = r9
        L77:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.l
    public final Object invoke(zu.d<? super tu.x0> dVar) {
        return ((m0) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
