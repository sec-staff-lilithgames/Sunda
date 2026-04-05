package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f85066i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f85067j;

    /* renamed from: k, reason: collision with root package name */
    public Object f85068k;

    /* renamed from: l, reason: collision with root package name */
    public int f85069l;

    /* renamed from: m, reason: collision with root package name */
    public int f85070m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f85071n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f85072o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f85073p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kv.q f85074q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Object obj, t tVar, kv.q qVar, zu.d dVar) {
        super(2, dVar);
        this.f85072o = obj;
        this.f85073p = tVar;
        this.f85074q = qVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        q0 q0Var = new q0(this.f85072o, this.f85073p, this.f85074q, dVar);
        q0Var.f85071n = obj;
        return q0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r0.yield(r3, r9) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f85071n
            rv.v r0 = (rv.v) r0
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r9.f85070m
            java.lang.Object r3 = r9.f85072o
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L27
            if (r2 != r4) goto L1f
            int r2 = r9.f85069l
            java.util.Iterator r3 = r9.f85067j
            java.lang.Object r5 = r9.f85066i
            tu.a0.throwOnFailure(r10)
            r10 = r5
            goto L43
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            tu.a0.throwOnFailure(r10)
            goto L39
        L2b:
            tu.a0.throwOnFailure(r10)
            r9.f85071n = r0
            r9.f85070m = r5
            java.lang.Object r10 = r0.yield(r3, r9)
            if (r10 != r1) goto L39
            goto L74
        L39:
            rv.t r10 = r9.f85073p
            java.util.Iterator r10 = r10.iterator()
            r2 = 0
            r8 = r3
            r3 = r10
            r10 = r8
        L43:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r3.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L54
            uu.p0.throwIndexOverflow()
        L54:
            java.lang.Integer r2 = bv.b.boxInt(r2)
            kv.q r7 = r9.f85074q
            java.lang.Object r10 = r7.invoke(r2, r10, r5)
            r9.f85071n = r0
            r9.f85066i = r10
            r9.f85067j = r3
            java.lang.Object r2 = bv.m.nullOutSpilledVariable(r5)
            r9.f85068k = r2
            r9.f85069l = r6
            r9.f85070m = r4
            java.lang.Object r2 = r0.yield(r10, r9)
            if (r2 != r1) goto L75
        L74:
            return r1
        L75:
            r2 = r6
            goto L43
        L77:
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((q0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
