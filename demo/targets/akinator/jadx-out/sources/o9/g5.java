package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78163i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78164j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78164j = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new g5(this.f78164j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78163i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f78163i = 1;
            if (QuestionActivity.access$doCancelAnswer(this.f78164j, this) == coroutine_suspended) {
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
        return ((g5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
