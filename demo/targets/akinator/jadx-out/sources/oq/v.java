package oq;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f79807i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f79808j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ dq.i f79809k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, dq.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f79808j = xVar;
        this.f79809k = iVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new v(this.f79808j, this.f79809k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r2.b(r6, r5) == r0) goto L17;
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
            int r1 = r5.f79807i
            oq.x r2 = r5.f79808j
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            tu.a0.throwOnFailure(r6)
            goto L3b
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            tu.a0.throwOnFailure(r6)
            goto L2e
        L20:
            tu.a0.throwOnFailure(r6)
            r5.f79807i = r4
            dq.i r6 = r5.f79809k
            java.lang.Object r6 = oq.x.a(r2, r6, r5)
            if (r6 != r0) goto L2e
            goto L3a
        L2e:
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L3b
            r5.f79807i = r3
            java.lang.Object r6 = r2.b(r6, r5)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
