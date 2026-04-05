package x3;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f91592i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f91593j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f91594k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(View view, zu.d dVar) {
        super(2, dVar);
        this.f91594k = view;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        h2 h2Var = new h2(this.f91594k, dVar);
        h2Var.f91593j = obj;
        return h2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r1.yieldAll(r6, r5) == r0) goto L17;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r5.f91592i
            android.view.View r2 = r5.f91594k
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            tu.a0.throwOnFailure(r6)
            goto L4d
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            java.lang.Object r1 = r5.f91593j
            rv.v r1 = (rv.v) r1
            tu.a0.throwOnFailure(r6)
            goto L37
        L24:
            tu.a0.throwOnFailure(r6)
            java.lang.Object r6 = r5.f91593j
            r1 = r6
            rv.v r1 = (rv.v) r1
            r5.f91593j = r1
            r5.f91592i = r4
            java.lang.Object r6 = r1.yield(r2, r5)
            if (r6 != r0) goto L37
            goto L4c
        L37:
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L4d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            rv.t r6 = x3.g2.getDescendants(r2)
            r2 = 0
            r5.f91593j = r2
            r5.f91592i = r3
            java.lang.Object r6 = r1.yieldAll(r6, r5)
            if (r6 != r0) goto L4d
        L4c:
            return r0
        L4d:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super tu.x0> dVar) {
        return ((h2) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
