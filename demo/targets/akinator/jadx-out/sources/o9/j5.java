package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78262i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78262i = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new j5(this.f78262i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws TimeoutException, UnknownHostException {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
        kotlin.jvm.internal.e0.checkNotNull(currentSession);
        int iAnswerQuestionWithTag = currentSession.answerQuestionWithTag(this.f78262i.J);
        if (iAnswerQuestionWithTag == 0 || iAnswerQuestionWithTag == 300) {
            return bv.b.boxInt(iAnswerQuestionWithTag);
        }
        if (iAnswerQuestionWithTag == 600) {
            throw new TimeoutException();
        }
        if (iAnswerQuestionWithTag == 610 || iAnswerQuestionWithTag == -1) {
            throw new UnknownHostException();
        }
        throw new UnknownError(lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((j5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
