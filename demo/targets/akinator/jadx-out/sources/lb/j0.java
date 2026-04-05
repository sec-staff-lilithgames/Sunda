package lb;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72898i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72899j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f72900k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f72901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f72902m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(e eVar, int i10, String str, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f72899j = eVar;
        this.f72900k = i10;
        this.f72901l = str;
        this.f72902m = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new j0(this.f72899j, this.f72900k, this.f72901l, this.f72902m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72898i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72898i = 1;
        Object objModifyQuestionWithIdAsync = this.f72899j.modifyQuestionWithIdAsync(this.f72900k, this.f72901l, this.f72902m, this);
        return objModifyQuestionWithIdAsync == coroutine_suspended ? coroutine_suspended : objModifyQuestionWithIdAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((j0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
