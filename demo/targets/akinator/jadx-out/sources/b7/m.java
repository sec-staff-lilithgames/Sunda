package b7;

import b7.i;
import kotlinx.coroutines.flow.FlowCollector;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements FlowCollector, kotlin.jvm.internal.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8872b;

    public m(i iVar) {
        this.f8872b = iVar;
    }

    public final Object emit(i.b bVar, zu.d<? super x0> dVar) {
        Object objAccess$invokeSuspend$updateState = n.access$invokeSuspend$updateState(this.f8872b, bVar, dVar);
        return objAccess$invokeSuspend$updateState == av.e.getCOROUTINE_SUSPENDED() ? objAccess$invokeSuspend$updateState : x0.f87415a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FlowCollector) && (obj instanceof kotlin.jvm.internal.x)) {
            return kotlin.jvm.internal.e0.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.x) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.x
    public final tu.i getFunctionDelegate() {
        return new kotlin.jvm.internal.a(2, this.f8872b, i.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((i.b) obj, (zu.d<? super x0>) dVar);
    }
}
