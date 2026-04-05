package lb;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72797i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72798j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f72799k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f72800l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e eVar, int i10, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f72798j = eVar;
        this.f72799k = i10;
        this.f72800l = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new d0(this.f72798j, this.f72799k, this.f72800l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72797i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72797i = 1;
        Object objectsWithListSizeAsync = this.f72798j.getObjectsWithListSizeAsync(this.f72799k, this.f72800l, this);
        return objectsWithListSizeAsync == coroutine_suspended ? coroutine_suspended : objectsWithListSizeAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((d0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
