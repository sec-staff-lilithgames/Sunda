package lb;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72861i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72862j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f72863k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f72864l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e eVar, String str, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f72862j = eVar;
        this.f72863k = str;
        this.f72864l = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f0(this.f72862j, this.f72863k, this.f72864l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72861i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72861i = 1;
        Object questionsFromStringAsync = this.f72862j.getQuestionsFromStringAsync(this.f72863k, this.f72864l, this);
        return questionsFromStringAsync == coroutine_suspended ? coroutine_suspended : questionsFromStringAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
