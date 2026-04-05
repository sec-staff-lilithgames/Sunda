package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78263i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78264j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f78265k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u6 f78266l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(QuestionActivity questionActivity, kotlin.jvm.internal.b1 b1Var, u6 u6Var, zu.d dVar) {
        super(2, dVar);
        this.f78264j = questionActivity;
        this.f78265k = b1Var;
        this.f78266l = u6Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new j6(this.f78264j, this.f78265k, this.f78266l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78263i;
        ka.a aVar = null;
        QuestionActivity questionActivity = this.f78264j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            oa.l lVar = questionActivity.F;
            if (lVar == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
                lVar = null;
            }
            Job jobPlaySequence = lVar.playSequence(questionActivity.L, (List) this.f78265k.f71816b);
            this.f78263i = 1;
            if (jobPlaySequence.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        ka.a aVar2 = questionActivity.Q;
        if (aVar2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nextWaitingAkitude");
            aVar2 = null;
        }
        questionActivity.L = aVar2;
        oa.l lVar2 = questionActivity.F;
        if (lVar2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
            lVar2 = null;
        }
        ka.a aVar3 = questionActivity.Q;
        if (aVar3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nextWaitingAkitude");
        } else {
            aVar = aVar3;
        }
        lVar2.startWaitingLoop(aVar, false);
        questionActivity.I(this.f78266l);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((j6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
