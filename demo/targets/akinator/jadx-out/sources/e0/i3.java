package e0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i3 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53102i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53103j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t2 f53104k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v5 f53105l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(t2 t2Var, v5 v5Var, zu.d dVar) {
        super(2, dVar);
        this.f53104k = t2Var;
        this.f53105l = v5Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        i3 i3Var = new i3(this.f53104k, this.f53105l, dVar);
        i3Var.f53103j = obj;
        return i3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f53102i
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r7.f53103j
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r8)
            goto L2e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            tu.a0.throwOnFailure(r8)
            java.lang.Object r8 = r7.f53103j
            u1.c r8 = (u1.c) r8
            r1 = r8
        L23:
            r7.f53103j = r1
            r7.f53102i = r2
            java.lang.Object r8 = e0.p3.access$awaitScrollEvent(r1, r7)
            if (r8 != r0) goto L2e
            return r0
        L2e:
            u1.m r8 = (u1.m) r8
            java.util.List r3 = r8.getChanges()
            int r4 = r3.size()
            r5 = 0
        L39:
            if (r5 >= r4) goto L4b
            java.lang.Object r6 = r3.get(r5)
            u1.c0 r6 = (u1.c0) r6
            boolean r6 = r6.isConsumed()
            if (r6 == 0) goto L48
            goto L23
        L48:
            int r5 = r5 + 1
            goto L39
        L4b:
            long r2 = r1.mo7285getSizeYbymL2g()
            e0.t2 r0 = r7.f53104k
            e0.a r0 = (e0.a) r0
            long r0 = r0.mo3742calculateMouseWheelScroll8xgXZGE(r1, r8, r2)
            p0.v5 r8 = r7.f53105l
            java.lang.Object r8 = r8.getValue()
            e0.z3 r8 = (e0.z3) r8
            float r0 = r8.m3798toFloatk4lQ0M(r0)
            r8.reverseIfNeeded(r0)
            r8.getScrollableState()
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.i3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((i3) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
