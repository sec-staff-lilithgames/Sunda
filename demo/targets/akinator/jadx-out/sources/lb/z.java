package lb;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73053i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f73054j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f73055k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f73056l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e eVar, int i10, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f73054j = eVar;
        this.f73055k = i10;
        this.f73056l = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new z(this.f73054j, this.f73055k, this.f73056l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73053i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f73053i = 1;
        Object objectsForQuestionWithListSizeAsync = this.f73054j.getObjectsForQuestionWithListSizeAsync(this.f73055k, this.f73056l, this);
        return objectsForQuestionWithListSizeAsync == coroutine_suspended ? coroutine_suspended : objectsForQuestionWithListSizeAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((z) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
