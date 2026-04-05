package lb;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72876i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72877j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f72878k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, int i10, zu.d dVar) {
        super(2, dVar);
        this.f72877j = eVar;
        this.f72878k = i10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f72877j, this.f72878k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72876i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72876i = 1;
        Object objAnswerQuestionWithTagWithOptionalParamatersAsync = this.f72877j.answerQuestionWithTagWithOptionalParamatersAsync(this.f72878k, null, this);
        return objAnswerQuestionWithTagWithOptionalParamatersAsync == coroutine_suspended ? coroutine_suspended : objAnswerQuestionWithTagWithOptionalParamatersAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
