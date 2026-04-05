package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object[] f96922i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f96923j;

    /* renamed from: k, reason: collision with root package name */
    public int f96924k;

    /* renamed from: l, reason: collision with root package name */
    public int f96925l;

    /* renamed from: m, reason: collision with root package name */
    public int f96926m;

    /* renamed from: n, reason: collision with root package name */
    public int f96927n;

    /* renamed from: o, reason: collision with root package name */
    public long f96928o;

    /* renamed from: p, reason: collision with root package name */
    public int f96929p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f96930q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f96931r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, zu.d dVar) {
        super(2, dVar);
        this.f96931r = tVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        s sVar = new s(this.f96931r, dVar);
        sVar.f96930q = obj;
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:23:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:14:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:20:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:20:0x0090). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96929p
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L27
            int r2 = r0.f96927n
            int r6 = r0.f96926m
            long r7 = r0.f96928o
            int r9 = r0.f96925l
            int r10 = r0.f96924k
            long[] r11 = r0.f96923j
            java.lang.Object[] r12 = r0.f96922i
            java.lang.Object r13 = r0.f96930q
            rv.v r13 = (rv.v) r13
            tu.a0.throwOnFailure(r21)
            goto L90
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            tu.a0.throwOnFailure(r21)
            java.lang.Object r2 = r0.f96930q
            rv.v r2 = (rv.v) r2
            z.t r6 = r0.f96931r
            z.l1 r6 = z.t.access$getParent$p(r6)
            java.lang.Object[] r7 = r6.f96866b
            long[] r6 = r6.f96865a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9e
            r9 = r3
        L46:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L67:
            if (r2 >= r6) goto L93
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L90
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.f96930q = r13
            r0.f96922i = r12
            r0.f96923j = r11
            r0.f96924k = r10
            r0.f96925l = r9
            r0.f96928o = r7
            r0.f96926m = r6
            r0.f96927n = r2
            r0.f96929p = r5
            java.lang.Object r14 = r13.yield(r14, r0)
            if (r14 != r1) goto L90
            return r1
        L90:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L67
        L93:
            if (r6 != r4) goto L9e
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L99:
            if (r9 == r8) goto L9e
            int r9 = r9 + 1
            goto L46
        L9e:
            tu.x0 r1 = tu.x0.f87415a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super tu.x0> dVar) {
        return ((s) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
