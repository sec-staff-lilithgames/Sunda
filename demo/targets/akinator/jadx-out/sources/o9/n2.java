package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78382i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78383j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78383j = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new n2(this.f78383j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r4, r6) == r0) goto L15;
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
            int r1 = r6.f78382i
            r2 = 0
            r3 = 2
            r4 = 1
            com.digidust.elokence.akinator.activities.HomeActivity r5 = r6.f78383j
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
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
            o9.m2 r1 = new o9.m2
            r1.<init>(r5, r2)
            r6.f78382i = r4
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
            if (r7 != r0) goto L36
            goto L49
        L36:
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            o9.l2 r4 = new o9.l2
            r4.<init>(r5, r7, r2)
            r6.f78382i = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r6)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            com.digidust.elokence.akinator.activities.HomeActivity.access$animateWelcomeText(r5)
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((n2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
