package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78093i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f78094j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78095k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78095k = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        d6 d6Var = new d6(this.f78095k, dVar);
        d6Var.f78094j = obj;
        return d6Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78093i;
        QuestionActivity questionActivity = this.f78095k;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f78094j;
            questionActivity.O = ka.a.f70679k;
            ka.a aVar = questionActivity.O;
            oa.l lVar = null;
            if (aVar == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("reactionAkitude");
                aVar = null;
            }
            List<ka.b> listMutableListOf = uu.p0.mutableListOf(new ka.b(aVar, 10));
            oa.l lVar2 = questionActivity.F;
            if (lVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
            } else {
                lVar = lVar2;
            }
            Job jobPlaySequence = lVar.playSequence(questionActivity.L, listMutableListOf);
            this.f78094j = coroutineScope2;
            this.f78093i = 1;
            if (jobPlaySequence.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f78094j;
            tu.a0.throwOnFailure(obj);
        }
        questionActivity.L = ka.a.f70679k;
        questionActivity.disposeAtDestruction(mt.b0.fromCallable(new d5(questionActivity, 1)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new h0(3, questionActivity, coroutineScope)));
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((d6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
