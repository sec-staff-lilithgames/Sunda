package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78224i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78225j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78225j = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i6(this.f78225j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (com.digidust.elokence.akinator.activities.QuestionActivity.access$doAnswearLegacy(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (com.digidust.elokence.akinator.activities.QuestionActivity.access$doAnswer(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return r0;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.f78224i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            tu.a0.throwOnFailure(r5)
            goto L38
        L1b:
            tu.a0.throwOnFailure(r5)
            com.digidust.elokence.akinator.activities.QuestionActivity r5 = r4.f78225j
            boolean r1 = com.digidust.elokence.akinator.activities.QuestionActivity.access$getLegacyAki$p(r5)
            if (r1 == 0) goto L2f
            r4.f78224i = r3
            java.lang.Object r5 = com.digidust.elokence.akinator.activities.QuestionActivity.access$doAnswearLegacy(r5, r4)
            if (r5 != r0) goto L38
            goto L37
        L2f:
            r4.f78224i = r2
            java.lang.Object r5 = com.digidust.elokence.akinator.activities.QuestionActivity.access$doAnswer(r5, r4)
            if (r5 != r0) goto L38
        L37:
            return r0
        L38:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.i6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((i6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
