package k4;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kv.p f70394i;

    /* renamed from: j, reason: collision with root package name */
    public int f70395j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l2 f70396k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, zu.d dVar) {
        super(2, dVar);
        this.f70396k = l2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k2(this.f70396k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r1.invoke(r7, r6) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[PHI: r1 r7
      0x004e: PHI (r1v1 kv.p) = (r1v2 kv.p), (r1v4 kv.p) binds: [B:13:0x004b, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r7v4 java.lang.Object) = (r7v8 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x004b, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0057 -> B:18:0x005a). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f70395j
            r2 = 2
            r3 = 1
            k4.l2 r4 = r6.f70396k
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            tu.a0.throwOnFailure(r7)
            goto L5a
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kv.p r1 = r6.f70394i
            kv.p r1 = (kv.p) r1
            tu.a0.throwOnFailure(r7)
            goto L4e
        L24:
            tu.a0.throwOnFailure(r7)
            k4.c r7 = k4.l2.access$getRemainingMessages$p(r4)
            int r7 = r7.get()
            if (r7 <= 0) goto L67
        L31:
            kotlinx.coroutines.CoroutineScope r7 = k4.l2.access$getScope$p(r4)
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(r7)
            kv.p r1 = k4.l2.access$getConsumeMessage$p(r4)
            kotlinx.coroutines.channels.Channel r7 = k4.l2.access$getMessageQueue$p(r4)
            r5 = r1
            kv.p r5 = (kv.p) r5
            r6.f70394i = r5
            r6.f70395j = r3
            java.lang.Object r7 = r7.receive(r6)
            if (r7 != r0) goto L4e
            goto L59
        L4e:
            r5 = 0
            r6.f70394i = r5
            r6.f70395j = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L5a
        L59:
            return r0
        L5a:
            k4.c r7 = k4.l2.access$getRemainingMessages$p(r4)
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            tu.x0 r7 = tu.x0.f87415a
            return r7
        L67:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((k2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
