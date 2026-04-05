package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78622i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78623j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78623j = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new v2(this.f78623j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r5, r6) == r0) goto L15;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f78622i
            r2 = 0
            com.digidust.elokence.akinator.activities.HomeActivity r3 = r6.f78623j
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            tu.a0.throwOnFailure(r7)
            goto L4a
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            tu.a0.throwOnFailure(r7)
            goto L36
        L21:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            o9.u2 r1 = new o9.u2
            r1.<init>(r3, r2)
            r6.f78622i = r5
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
            if (r7 != r0) goto L36
            goto L49
        L36:
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            o9.s2 r5 = new o9.s2
            r5.<init>(r3, r7, r2)
            r6.f78622i = r4
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r5, r6)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.v2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((v2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
