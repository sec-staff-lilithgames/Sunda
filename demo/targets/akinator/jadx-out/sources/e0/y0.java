package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.y0 f53403i;

    /* renamed from: j, reason: collision with root package name */
    public int f53404j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f53405k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.l f53406l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.p f53407m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.a f53408n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kv.a f53409o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kv.a aVar, kv.a aVar2, kv.l lVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53406l = lVar;
        this.f53407m = pVar;
        this.f53408n = aVar;
        this.f53409o = aVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        y0 y0Var = new y0(this.f53408n, this.f53409o, this.f53406l, this.f53407m, dVar);
        y0Var.f53405k = obj;
        return y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r10.f53404j
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            tu.a0.throwOnFailure(r11)
            r9 = r10
            goto L9e
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            kotlin.jvm.internal.y0 r1 = r10.f53403i
            java.lang.Object r3 = r10.f53405k
            u1.c r3 = (u1.c) r3
            tu.a0.throwOnFailure(r11)
            r9 = r10
            goto L6b
        L2a:
            java.lang.Object r1 = r10.f53405k
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r11)
        L31:
            r4 = r1
            goto L48
        L33:
            tu.a0.throwOnFailure(r11)
            java.lang.Object r11 = r10.f53405k
            r1 = r11
            u1.c r1 = (u1.c) r1
            r10.f53405k = r1
            r10.f53404j = r4
            r11 = 0
            java.lang.Object r11 = e0.q4.awaitFirstDown(r1, r11, r10)
            if (r11 != r0) goto L31
            r9 = r10
            goto L9d
        L48:
            u1.c0 r11 = (u1.c0) r11
            kotlin.jvm.internal.y0 r1 = new kotlin.jvm.internal.y0
            r1.<init>()
            long r5 = r11.m7294getIdJ3iCeTQ()
            int r7 = r11.m7298getTypeT8wyACA()
            e0.x0 r8 = new e0.x0
            r8.<init>(r1)
            r10.f53405k = r4
            r10.f53403i = r1
            r10.f53404j = r3
            r9 = r10
            java.lang.Object r11 = e0.d1.m3755awaitVerticalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
            if (r11 != r0) goto L6a
            goto L9d
        L6a:
            r3 = r4
        L6b:
            u1.c0 r11 = (u1.c0) r11
            if (r11 == 0) goto Lb1
            long r4 = r11.m7295getPositionF1C5BW0()
            i1.h r4 = i1.h.m4174boximpl(r4)
            kv.l r5 = r9.f53406l
            r5.invoke(r4)
            float r1 = r1.f71865b
            java.lang.Float r1 = bv.b.boxFloat(r1)
            kv.p r4 = r9.f53407m
            r4.invoke(r11, r1)
            long r5 = r11.m7294getIdJ3iCeTQ()
            e0.w0 r11 = new e0.w0
            r11.<init>(r4)
            r1 = 0
            r9.f53405k = r1
            r9.f53403i = r1
            r9.f53404j = r2
            java.lang.Object r11 = e0.d1.m3760verticalDragjO51t88(r3, r5, r11, r10)
            if (r11 != r0) goto L9e
        L9d:
            return r0
        L9e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lac
            kv.a r11 = r9.f53408n
            r11.invoke()
            goto Lb1
        Lac:
            kv.a r11 = r9.f53409o
            r11.invoke()
        Lb1:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((y0) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
