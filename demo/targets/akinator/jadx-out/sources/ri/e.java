package ri;

import bv.n;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import o4.j;
import tu.a0;
import tu.x0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f84413i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f84414j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, zu.d dVar) {
        super(2, dVar);
        this.f84414j = iVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e(this.f84414j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Map<j.a, Object> mapAsMap;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f84413i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Flow<Object> data = this.f84414j.f84430d.getData();
            this.f84413i = 1;
            obj = FlowKt.firstOrNull(data, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        o4.j jVar = (o4.j) obj;
        return (jVar == null || (mapAsMap = jVar.asMap()) == null) ? p1.emptyMap() : mapAsMap;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Map<j.a, ? extends Object>> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
