package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public j f73867i;

    /* renamed from: j, reason: collision with root package name */
    public int f73868j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f73869k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f73870l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(o oVar, zu.d dVar) {
        super(2, dVar);
        this.f73870l = oVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        z2 z2Var = new z2(this.f73870l, dVar);
        z2Var.f73869k = obj;
        return z2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (e0.d1.m3757dragjO51t88(r5, r8, r12, r11) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (e0.d1.m3757dragjO51t88(r5, r8, r6, r11) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0070 -> B:35:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:35:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ab -> B:35:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c3 -> B:35:0x00c6). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r11.f73868j
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            m0.j r1 = r11.f73867i
            java.lang.Object r5 = r11.f73869k
            u1.c r5 = (u1.c) r5
            tu.a0.throwOnFailure(r12)
            goto Lc6
        L25:
            m0.j r1 = r11.f73867i
            java.lang.Object r5 = r11.f73869k
            u1.c r5 = (u1.c) r5
            tu.a0.throwOnFailure(r12)
            goto L50
        L2f:
            tu.a0.throwOnFailure(r12)
            java.lang.Object r12 = r11.f73869k
            u1.c r12 = (u1.c) r12
            m0.j r1 = new m0.j
            a2.g5 r5 = r12.getViewConfiguration()
            r1.<init>(r5)
        L3f:
            r11.f73869k = r12
            r11.f73867i = r1
            r11.f73868j = r4
            java.lang.Object r5 = m0.b3.access$awaitMouseEventDown(r12, r11)
            if (r5 != r0) goto L4d
            goto Lc5
        L4d:
            r10 = r5
            r5 = r12
            r12 = r10
        L50:
            u1.m r12 = (u1.m) r12
            r1.update(r12)
            java.util.List r6 = r12.getChanges()
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            u1.c0 r6 = (u1.c0) r6
            boolean r12 = m0.r2.isShiftPressed(r12)
            m0.o r7 = r11.f73870l
            if (r12 == 0) goto L8b
            long r8 = r6.m7295getPositionF1C5BW0()
            boolean r12 = r7.mo5285onExtendk4lQ0M(r8)
            if (r12 == 0) goto Lc6
            r6.consume()
            long r8 = r6.m7294getIdJ3iCeTQ()
            m0.x2 r12 = new m0.x2
            r12.<init>(r7)
            r11.f73869k = r5
            r11.f73867i = r1
            r11.f73868j = r3
            java.lang.Object r12 = e0.d1.m3757dragjO51t88(r5, r8, r12, r11)
            if (r12 != r0) goto Lc6
            goto Lc5
        L8b:
            int r12 = r1.getClicks()
            m0.a0 r8 = m0.a0.f73656a
            if (r12 == r4) goto L9f
            if (r12 == r3) goto L9a
            m0.b0 r12 = r8.getParagraph()
            goto La3
        L9a:
            m0.b0 r12 = r8.getWord()
            goto La3
        L9f:
            m0.b0 r12 = r8.getNone()
        La3:
            long r8 = r6.m7295getPositionF1C5BW0()
            boolean r8 = r7.mo5287onStart3MmeM6k(r8, r12)
            if (r8 == 0) goto Lc6
            r6.consume()
            long r8 = r6.m7294getIdJ3iCeTQ()
            m0.y2 r6 = new m0.y2
            r6.<init>(r7, r12)
            r11.f73869k = r5
            r11.f73867i = r1
            r11.f73868j = r2
            java.lang.Object r12 = e0.d1.m3757dragjO51t88(r5, r8, r6, r11)
            if (r12 != r0) goto Lc6
        Lc5:
            return r0
        Lc6:
            r12 = r5
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((z2) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
