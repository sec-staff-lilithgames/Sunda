package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78198i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78199j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78199j = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new h6(this.f78199j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r4.K(r6) == r0) goto L15;
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
            int r1 = r6.f78198i
            r2 = 2
            r3 = 1
            com.digidust.elokence.akinator.activities.QuestionActivity r4 = r6.f78199j
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            tu.a0.throwOnFailure(r7)
            goto L66
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
            r6.f78198i = r3
            java.lang.String r7 = "akinator_defi"
            java.lang.Object r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$getBitmapForAttitude(r4, r7, r6)
            if (r7 != r0) goto L2e
            goto L65
        L2e:
            tu.d0 r7 = (tu.d0) r7
            java.lang.Object r1 = r7.component1()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r3 = r7.component2()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r7 = r7.component3()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            kotlin.jvm.internal.e0.checkNotNull(r1)
            r5 = 2131427431(0x7f0b0067, float:1.8476478E38)
            r4.q(r5, r1)
            kotlin.jvm.internal.e0.checkNotNull(r3)
            r1 = 2131427432(0x7f0b0068, float:1.847648E38)
            r4.q(r1, r3)
            kotlin.jvm.internal.e0.checkNotNull(r7)
            r1 = 2131427430(0x7f0b0066, float:1.8476476E38)
            r4.q(r1, r7)
            r6.f78198i = r2
            java.lang.Object r7 = com.digidust.elokence.akinator.activities.QuestionActivity.access$updateQuestionUI(r4, r6)
            if (r7 != r0) goto L66
        L65:
            return r0
        L66:
            r4.hideLoader()
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.h6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((h6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
