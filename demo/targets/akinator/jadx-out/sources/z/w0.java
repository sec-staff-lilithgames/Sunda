package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public x0 f96960i;

    /* renamed from: j, reason: collision with root package name */
    public y0 f96961j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f96962k;

    /* renamed from: l, reason: collision with root package name */
    public int f96963l;

    /* renamed from: m, reason: collision with root package name */
    public int f96964m;

    /* renamed from: n, reason: collision with root package name */
    public int f96965n;

    /* renamed from: o, reason: collision with root package name */
    public int f96966o;

    /* renamed from: p, reason: collision with root package name */
    public long f96967p;

    /* renamed from: q, reason: collision with root package name */
    public int f96968q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f96969r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y0 f96970s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0 f96971t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, x0 x0Var, zu.d dVar) {
        super(2, dVar);
        this.f96970s = y0Var;
        this.f96971t = x0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        w0 w0Var = new w0(this.f96970s, this.f96971t, dVar);
        w0Var.f96969r = obj;
        return w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:14:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:20:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009b -> B:20:0x009e). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96968q
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L28
            int r2 = r0.f96966o
            int r6 = r0.f96965n
            long r7 = r0.f96967p
            int r9 = r0.f96964m
            int r10 = r0.f96963l
            long[] r11 = r0.f96962k
            z.y0 r12 = r0.f96961j
            z.x0 r13 = r0.f96960i
            java.lang.Object r14 = r0.f96969r
            rv.v r14 = (rv.v) r14
            tu.a0.throwOnFailure(r22)
            goto L9e
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            tu.a0.throwOnFailure(r22)
            java.lang.Object r2 = r0.f96969r
            rv.v r2 = (rv.v) r2
            z.y0 r6 = r0.f96970s
            z.v0 r7 = z.y0.access$getParent$p(r6)
            long[] r7 = r7.f96887a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lae
            z.x0 r9 = r0.f96971t
            r10 = 0
        L47:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La9
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L6a:
            if (r2 >= r6) goto La1
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L9e
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.setCurrent(r15)
            z.v0 r3 = z.y0.access$getParent$p(r12)
            java.lang.Object[] r3 = r3.f96888b
            r3 = r3[r15]
            r0.f96969r = r14
            r0.f96960i = r13
            r0.f96961j = r12
            r0.f96962k = r11
            r0.f96963l = r10
            r0.f96964m = r9
            r0.f96967p = r7
            r0.f96965n = r6
            r0.f96966o = r2
            r0.f96968q = r5
            java.lang.Object r3 = r14.yield(r3, r0)
            if (r3 != r1) goto L9e
            return r1
        L9e:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L6a
        La1:
            if (r6 != r4) goto Lae
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La9:
            if (r10 == r8) goto Lae
            int r10 = r10 + 1
            goto L47
        Lae:
            tu.x0 r1 = tu.x0.f87415a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super tu.x0> dVar) {
        return ((w0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
