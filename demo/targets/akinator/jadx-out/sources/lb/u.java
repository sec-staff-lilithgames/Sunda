package lb;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72998i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72999j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f73000k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f73001l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e eVar, String str, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f72999j = eVar;
        this.f73000k = str;
        this.f73001l = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u(this.f72999j, this.f73000k, this.f73001l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72998i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72998i = 1;
        Object autocompletionSuggestionsFromStringAsync = this.f72999j.getAutocompletionSuggestionsFromStringAsync(this.f73000k, this.f73001l, this);
        return autocompletionSuggestionsFromStringAsync == coroutine_suspended ? coroutine_suspended : autocompletionSuggestionsFromStringAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((u) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
