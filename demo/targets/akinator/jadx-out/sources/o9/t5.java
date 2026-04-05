package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78565i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78566j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f78567k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(QuestionActivity questionActivity, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f78566j = questionActivity;
        this.f78567k = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new t5(this.f78566j, this.f78567k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (com.digidust.elokence.akinator.activities.QuestionActivity.access$showTrappedAnimation(r5, r7, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (com.digidust.elokence.akinator.activities.QuestionActivity.access$showTriompheAndAwardAnimation(r5, r7, r1, r6) == r0) goto L20;
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
            int r1 = r6.f78565i
            r2 = 0
            r3 = 2
            r4 = 1
            com.digidust.elokence.akinator.activities.QuestionActivity r5 = r6.f78566j
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            tu.a0.throwOnFailure(r7)
            goto L64
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            tu.a0.throwOnFailure(r7)
            goto L67
        L21:
            tu.a0.throwOnFailure(r7)
            com.digidust.elokence.akinator.activities.QuestionActivity.access$enableButtons(r5, r2)
            com.digidust.elokence.akinator.paid.databinding.ActivityQuestionBinding r7 = r5.getBinding$akinatorGL_gplayFreemiumRelease()
            android.widget.RelativeLayout r7 = r7.layoutProposal
            r1 = 1063675494(0x3f666666, float:0.9)
            r7.setAlpha(r1)
            lb.e$c r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$getAkiStats$p(r5)
            if (r7 != 0) goto L3f
            java.lang.String r7 = "akiStats"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r7)
            r7 = 0
        L3f:
            int r7 = r7.getAwardType()
            r1 = 8
            if (r7 != r1) goto L54
            ka.a r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$getCurrentAkitude$p(r5)
            r6.f78565i = r4
            java.lang.Object r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$showTrappedAnimation(r5, r7, r6)
            if (r7 != r0) goto L67
            goto L63
        L54:
            ka.a r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$getCurrentAkitude$p(r5)
            boolean r1 = r6.f78567k
            r1 = r1 ^ r4
            r6.f78565i = r3
            java.lang.Object r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$showTriompheAndAwardAnimation(r5, r7, r1, r6)
            if (r7 != r0) goto L64
        L63:
            return r0
        L64:
            r5.goToCharacterFound()
        L67:
            com.digidust.elokence.akinator.activities.QuestionActivity.access$setProcessingAnswer$p(r5, r2)
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.t5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((t5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
