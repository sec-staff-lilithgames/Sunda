package m0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.e f73780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f73781c;

    public l0(c0.e eVar, CoroutineScope coroutineScope) {
        this.f73780b = eVar;
        this.f73781c = coroutineScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return m5540emit3MmeM6k(((i1.h) obj).m4195unboximpl(), dVar);
    }

    /* renamed from: emit-3MmeM6k, reason: not valid java name */
    public final Object m5540emit3MmeM6k(long j10, zu.d<? super tu.x0> dVar) {
        c0.e eVar = this.f73780b;
        boolean zM4198isSpecifiedk4lQ0M = i1.i.m4198isSpecifiedk4lQ0M(((i1.h) eVar.getValue()).m4195unboximpl());
        tu.x0 x0Var = tu.x0.f87415a;
        if (zM4198isSpecifiedk4lQ0M && i1.i.m4198isSpecifiedk4lQ0M(j10) && i1.h.m4186getYimpl(((i1.h) eVar.getValue()).m4195unboximpl()) != i1.h.m4186getYimpl(j10)) {
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f73781c, null, null, new k0(eVar, j10, null), 3, null);
            return jobLaunch$default == av.e.getCOROUTINE_SUSPENDED() ? jobLaunch$default : x0Var;
        }
        Object objSnapTo = eVar.snapTo(i1.h.m4174boximpl(j10), dVar);
        return objSnapTo == av.e.getCOROUTINE_SUSPENDED() ? objSnapTo : x0Var;
    }
}
