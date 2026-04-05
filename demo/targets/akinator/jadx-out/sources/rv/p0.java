package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f85057i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f85058j;

    /* renamed from: k, reason: collision with root package name */
    public Object f85059k;

    /* renamed from: l, reason: collision with root package name */
    public int f85060l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f85061m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f85062n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f85063o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.p f85064p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Object obj, t tVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f85062n = obj;
        this.f85063o = tVar;
        this.f85064p = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        p0 p0Var = new p0(this.f85062n, this.f85063o, this.f85064p, dVar);
        p0Var.f85061m = obj;
        return p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r0.yield(r3, r6) == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f85061m
            rv.v r0 = (rv.v) r0
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r6.f85060l
            java.lang.Object r3 = r6.f85062n
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L28
            if (r2 == r5) goto L24
            if (r2 != r4) goto L1c
            java.util.Iterator r2 = r6.f85058j
            java.lang.Object r3 = r6.f85057i
            tu.a0.throwOnFailure(r7)
            goto L3d
        L1c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L24:
            tu.a0.throwOnFailure(r7)
            goto L36
        L28:
            tu.a0.throwOnFailure(r7)
            r6.f85061m = r0
            r6.f85060l = r5
            java.lang.Object r7 = r0.yield(r3, r6)
            if (r7 != r1) goto L36
            goto L61
        L36:
            rv.t r7 = r6.f85063o
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L3d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L62
            java.lang.Object r7 = r2.next()
            kv.p r5 = r6.f85064p
            java.lang.Object r3 = r5.invoke(r3, r7)
            r6.f85061m = r0
            r6.f85057i = r3
            r6.f85058j = r2
            java.lang.Object r7 = bv.m.nullOutSpilledVariable(r7)
            r6.f85059k = r7
            r6.f85060l = r4
            java.lang.Object r7 = r0.yield(r3, r6)
            if (r7 != r1) goto L3d
        L61:
            return r1
        L62:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((p0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
