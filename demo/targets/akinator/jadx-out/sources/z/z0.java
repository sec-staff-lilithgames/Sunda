package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public long[] f96995i;

    /* renamed from: j, reason: collision with root package name */
    public int f96996j;

    /* renamed from: k, reason: collision with root package name */
    public int f96997k;

    /* renamed from: l, reason: collision with root package name */
    public int f96998l;

    /* renamed from: m, reason: collision with root package name */
    public int f96999m;

    /* renamed from: n, reason: collision with root package name */
    public long f97000n;

    /* renamed from: o, reason: collision with root package name */
    public int f97001o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f97002p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b1 f97003q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, zu.d dVar) {
        super(2, dVar);
        this.f97003q = b1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        z0 z0Var = new z0(this.f97003q, dVar);
        z0Var.f97002p = obj;
        return z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:20:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:20:0x008d). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f97001o
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2d
            if (r2 != r5) goto L25
            int r2 = r0.f96999m
            int r6 = r0.f96998l
            long r7 = r0.f97000n
            int r9 = r0.f96997k
            int r10 = r0.f96996j
            long[] r11 = r0.f96995i
            java.lang.Object r12 = r0.f97002p
            rv.v r12 = (rv.v) r12
            tu.a0.throwOnFailure(r20)
            goto L8d
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            tu.a0.throwOnFailure(r20)
            java.lang.Object r2 = r0.f97002p
            rv.v r2 = (rv.v) r2
            z.b1 r6 = r0.f97003q
            z.u0 r6 = z.b1.access$getParent$p(r6)
            long[] r6 = r6.f96865a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9b
            r8 = r3
        L42:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L96
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r2
            r2 = r3
            r17 = r9
            r10 = r7
            r9 = r8
            r7 = r17
        L64:
            if (r2 >= r6) goto L90
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8d
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r13 = bv.b.boxInt(r13)
            r0.f97002p = r12
            r0.f96995i = r11
            r0.f96996j = r10
            r0.f96997k = r9
            r0.f97000n = r7
            r0.f96998l = r6
            r0.f96999m = r2
            r0.f97001o = r5
            java.lang.Object r13 = r12.yield(r13, r0)
            if (r13 != r1) goto L8d
            return r1
        L8d:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L64
        L90:
            if (r6 != r4) goto L9b
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L96:
            if (r8 == r7) goto L9b
            int r8 = r8 + 1
            goto L42
        L9b:
            tu.x0 r1 = tu.x0.f87415a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super tu.x0> dVar) {
        return ((z0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
