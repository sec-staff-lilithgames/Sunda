package lb;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72915i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72916j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ArrayList f72917k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f72918l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e eVar, ArrayList arrayList, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f72916j = eVar;
        this.f72917k = arrayList;
        this.f72918l = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l0(this.f72916j, this.f72917k, this.f72918l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72915i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72915i = 1;
        Object objReportDuplicatesWithArrayAsync = this.f72916j.reportDuplicatesWithArrayAsync(this.f72917k, this.f72918l, this);
        return objReportDuplicatesWithArrayAsync == coroutine_suspended ? coroutine_suspended : objReportDuplicatesWithArrayAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((l0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
