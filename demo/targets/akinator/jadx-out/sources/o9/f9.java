package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78148i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78149j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78149j = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f9(this.f78149j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6) == r0) goto L15;
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
            int r1 = r6.f78148i
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r4) goto L13
            tu.a0.throwOnFailure(r7)
            goto L4e
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            tu.a0.throwOnFailure(r7)
            goto L34
        L1f:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            o9.e9 r1 = new o9.e9
            r1.<init>(r4, r2)
            r6.f78148i = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
            if (r7 != r0) goto L34
            goto L4d
        L34:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            o9.d9 r3 = new o9.d9
            com.digidust.elokence.akinator.activities.SplashscreenActivity r5 = r6.f78149j
            r3.<init>(r5, r7, r2)
            r6.f78148i = r4
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
            if (r7 != r0) goto L4e
        L4d:
            return r0
        L4e:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.f9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
