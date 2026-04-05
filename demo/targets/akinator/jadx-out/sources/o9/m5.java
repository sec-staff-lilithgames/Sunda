package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78361i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78361i = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new m5(this.f78361i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
        kotlin.jvm.internal.e0.checkNotNull(currentSession);
        return bv.b.boxInt(currentSession.answerQuestionWithTag(this.f78361i.J));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((m5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
