package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78320i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78321j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78321j = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l5(this.f78321j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r2.K(r6) == r0) goto L15;
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
            int r1 = r6.f78320i
            com.digidust.elokence.akinator.activities.QuestionActivity r2 = r6.f78321j
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            tu.a0.throwOnFailure(r7)
            goto L37
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            tu.a0.throwOnFailure(r7)
            goto L2e
        L20:
            tu.a0.throwOnFailure(r7)
            r6.f78320i = r4
            r4 = 330(0x14a, double:1.63E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
            if (r7 != r0) goto L2e
            goto L36
        L2e:
            r6.f78320i = r3
            java.lang.Object r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$updateQuestionUI(r2, r6)
            if (r7 != r0) goto L37
        L36:
            return r0
        L37:
            com.digidust.elokence.akinator.activities.QuestionActivity.access$hideLoadingBar(r2)
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.l5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((l5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
