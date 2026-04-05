package lb;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72737i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72738j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f72739k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f72740l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e eVar, String str, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f72738j = eVar;
        this.f72739k = str;
        this.f72740l = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new b0(this.f72738j, this.f72739k, this.f72740l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72737i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72737i = 1;
        Object objectsFromStringAsync = this.f72738j.getObjectsFromStringAsync(this.f72739k, this.f72740l, this);
        return objectsFromStringAsync == coroutine_suspended ? coroutine_suspended : objectsFromStringAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((b0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
