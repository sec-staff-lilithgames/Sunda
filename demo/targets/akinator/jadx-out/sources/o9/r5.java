package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78482i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78483j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78483j = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new r5(this.f78483j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78482i;
        oa.l lVar = null;
        QuestionActivity questionActivity = this.f78483j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            ka.a aVar = questionActivity.L;
            ka.a aVar2 = ka.a.f70672c;
            questionActivity.O = aVar == aVar2 ? ka.a.f70677i : ka.a.f70687s;
            ka.a aVar3 = questionActivity.O;
            if (aVar3 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("reactionAkitude");
                aVar3 = null;
            }
            List<ka.b> listMutableListOf = uu.p0.mutableListOf(new ka.b(aVar3, 0));
            listMutableListOf.add(new ka.b(aVar2, 0));
            oa.l lVar2 = questionActivity.F;
            if (lVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
                lVar2 = null;
            }
            Job jobPlaySequence = lVar2.playSequence(questionActivity.L, listMutableListOf);
            this.f78482i = 1;
            if (jobPlaySequence.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        questionActivity.A();
        questionActivity.L = ka.a.f70672c;
        oa.l lVar3 = questionActivity.F;
        if (lVar3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
        } else {
            lVar = lVar3;
        }
        lVar.startWaitingLoop(questionActivity.L, false);
        questionActivity.X = false;
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((r5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
