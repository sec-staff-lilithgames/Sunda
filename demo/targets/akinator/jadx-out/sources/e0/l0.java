package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53149i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53150j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f53151k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.a f53152l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.a f53153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.p f53154n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kv.a aVar, kv.a aVar2, kv.l lVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53151k = lVar;
        this.f53152l = aVar;
        this.f53153m = aVar2;
        this.f53154n = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        l0 l0Var = new l0(this.f53152l, this.f53153m, this.f53151k, this.f53154n, dVar);
        l0Var.f53150j = obj;
        return l0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r1.awaitPointerEventScope(r4, r11) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:7:0x0012, B:14:0x0027, B:25:0x005a, B:27:0x005f, B:22:0x004f), top: B:34:0x000a }] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r11.f53149i
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2b
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            tu.a0.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L17
            goto L83
        L17:
            r0 = move-exception
            r12 = r0
            goto L86
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.Object r1 = r11.f53150j
            u1.k0 r1 = (u1.k0) r1
            tu.a0.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L17
            goto L5a
        L2b:
            java.lang.Object r1 = r11.f53150j
            u1.k0 r1 = (u1.k0) r1
            tu.a0.throwOnFailure(r12)
            goto L4d
        L33:
            tu.a0.throwOnFailure(r12)
            java.lang.Object r12 = r11.f53150j
            u1.k0 r12 = (u1.k0) r12
            e0.k0 r1 = new e0.k0
            r1.<init>(r5, r2)
            r11.f53150j = r12
            r11.f53149i = r4
            java.lang.Object r1 = r12.awaitPointerEventScope(r1, r11)
            if (r1 != r0) goto L4a
            goto L82
        L4a:
            r10 = r1
            r1 = r12
            r12 = r10
        L4d:
            u1.c0 r12 = (u1.c0) r12
            r11.f53150j = r1     // Catch: java.util.concurrent.CancellationException -> L17
            r11.f53149i = r5     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r12 = e0.d1.access$awaitLongPressOrCancellation(r1, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
            if (r12 != r0) goto L5a
            goto L82
        L5a:
            r5 = r12
            u1.c0 r5 = (u1.c0) r5     // Catch: java.util.concurrent.CancellationException -> L17
            if (r5 == 0) goto L83
            kv.l r12 = r11.f53151k     // Catch: java.util.concurrent.CancellationException -> L17
            long r6 = r5.m7295getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> L17
            i1.h r4 = i1.h.m4174boximpl(r6)     // Catch: java.util.concurrent.CancellationException -> L17
            r12.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L17
            e0.j0 r4 = new e0.j0     // Catch: java.util.concurrent.CancellationException -> L17
            kv.a r6 = r11.f53153m     // Catch: java.util.concurrent.CancellationException -> L17
            kv.a r7 = r11.f53152l     // Catch: java.util.concurrent.CancellationException -> L17
            kv.p r8 = r11.f53154n     // Catch: java.util.concurrent.CancellationException -> L17
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L17
            r11.f53150j = r2     // Catch: java.util.concurrent.CancellationException -> L17
            r11.f53149i = r3     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r12 = r1.awaitPointerEventScope(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L17
            if (r12 != r0) goto L83
        L82:
            return r0
        L83:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        L86:
            kv.a r0 = r11.f53152l
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.k0 k0Var, zu.d<? super tu.x0> dVar) {
        return ((l0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
