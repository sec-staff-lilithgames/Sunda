package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78140i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78141j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78141j = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f6(this.f78141j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78140i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            QuestionActivity questionActivity = this.f78141j;
            questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutAkinator.setVisibility(8);
            questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutAnimatedAkinator.setVisibility(0);
            questionActivity.L = ka.a.f70674f;
            questionActivity.K = ka.c.f70703e;
            questionActivity.N.addLast(questionActivity.K);
            questionActivity.M.addLast(questionActivity.L);
            oa.l lVar = questionActivity.F;
            if (lVar == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
                lVar = null;
            }
            lVar.startWaitingLoop(questionActivity.L, true);
            questionActivity.hideLoader();
            this.f78140i = 1;
            if (questionActivity.K(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
