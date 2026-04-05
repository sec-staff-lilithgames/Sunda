package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public u1.c0 f53003i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.jvm.internal.a1 f53004j;

    /* renamed from: k, reason: collision with root package name */
    public int f53005k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f53006l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.l f53007m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.p f53008n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kv.a f53009o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.a f53010p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kv.a aVar, kv.a aVar2, kv.l lVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53007m = lVar;
        this.f53008n = pVar;
        this.f53009o = aVar;
        this.f53010p = aVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        d0 d0Var = new d0(this.f53009o, this.f53010p, this.f53007m, this.f53008n, dVar);
        d0Var.f53006l = obj;
        return d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r14 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[PHI: r1 r4 r7 r12 r14
      0x0079: PHI (r1v6 kotlin.jvm.internal.a1) = (r1v5 kotlin.jvm.internal.a1), (r1v11 kotlin.jvm.internal.a1) binds: [B:17:0x0076, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r4v4 u1.c0) = (r4v3 u1.c0), (r4v7 u1.c0) binds: [B:17:0x0076, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r7v2 u1.c) = (r7v1 u1.c), (r7v3 u1.c) binds: [B:17:0x0076, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r12v2 e0.d0) = (r12v1 e0.d0), (r12v4 e0.d0) binds: [B:17:0x0076, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r14v7 java.lang.Object) = (r14v6 java.lang.Object), (r14v0 java.lang.Object) binds: [B:17:0x0076, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:19:0x0079). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r13.f53005k
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            tu.a0.throwOnFailure(r14)
            r12 = r13
            goto Lb6
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            kotlin.jvm.internal.a1 r1 = r13.f53004j
            u1.c0 r4 = r13.f53003i
            java.lang.Object r5 = r13.f53006l
            u1.c r5 = (u1.c) r5
            tu.a0.throwOnFailure(r14)
            r12 = r13
            r7 = r5
            goto L79
        L2d:
            java.lang.Object r1 = r13.f53006l
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r14)
            goto L4a
        L35:
            tu.a0.throwOnFailure(r14)
            java.lang.Object r14 = r13.f53006l
            r1 = r14
            u1.c r1 = (u1.c) r1
            r13.f53006l = r1
            r13.f53005k = r4
            r14 = 0
            java.lang.Object r14 = e0.q4.awaitFirstDown(r1, r14, r13)
            if (r14 != r0) goto L4a
            r12 = r13
            goto Lb5
        L4a:
            u1.c0 r14 = (u1.c0) r14
            kotlin.jvm.internal.a1 r4 = new kotlin.jvm.internal.a1
            r4.<init>()
            i1.g r5 = i1.h.f59344b
            long r5 = r5.m4173getZeroF1C5BW0()
            r4.f71813b = r5
            r7 = r1
            r1 = r4
            r4 = r14
        L5c:
            long r8 = r4.m7294getIdJ3iCeTQ()
            int r10 = r4.m7298getTypeT8wyACA()
            e0.b0 r11 = new e0.b0
            r11.<init>(r1)
            r13.f53006l = r7
            r13.f53003i = r4
            r13.f53004j = r1
            r13.f53005k = r3
            r12 = r13
            java.lang.Object r14 = e0.d1.m3752awaitPointerSlopOrCancellationgDDlDlE(r7, r8, r10, r11, r12)
            if (r14 != r0) goto L79
            goto Lb5
        L79:
            u1.c0 r14 = (u1.c0) r14
            if (r14 == 0) goto L83
            boolean r5 = r14.isConsumed()
            if (r5 == 0) goto L5c
        L83:
            if (r14 == 0) goto Lc9
            long r3 = r14.m7295getPositionF1C5BW0()
            i1.h r3 = i1.h.m4174boximpl(r3)
            kv.l r4 = r12.f53007m
            r4.invoke(r3)
            long r3 = r1.f71813b
            i1.h r1 = i1.h.m4174boximpl(r3)
            kv.p r3 = r12.f53008n
            r3.invoke(r14, r1)
            long r4 = r14.m7294getIdJ3iCeTQ()
            e0.c0 r14 = new e0.c0
            r14.<init>(r3)
            r1 = 0
            r12.f53006l = r1
            r12.f53003i = r1
            r12.f53004j = r1
            r12.f53005k = r2
            java.lang.Object r14 = e0.d1.m3757dragjO51t88(r7, r4, r14, r13)
            if (r14 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Lc4
            kv.a r14 = r12.f53009o
            r14.invoke()
            goto Lc9
        Lc4:
            kv.a r14 = r12.f53010p
            r14.invoke()
        Lc9:
            tu.x0 r14 = tu.x0.f87415a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((d0) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
