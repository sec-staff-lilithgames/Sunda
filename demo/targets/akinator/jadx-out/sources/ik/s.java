package ik;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.FlowCollector;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class s implements FlowCollector, kotlin.jvm.internal.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f59718b;

    public s(AtomicReference atomicReference) {
        this.f59718b = atomicReference;
    }

    public final Object emit(m mVar, zu.d<? super x0> dVar) {
        Object objAccess$invokeSuspend$set = t.access$invokeSuspend$set(this.f59718b, mVar, dVar);
        return objAccess$invokeSuspend$set == av.e.getCOROUTINE_SUSPENDED() ? objAccess$invokeSuspend$set : x0.f87415a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FlowCollector) && (obj instanceof kotlin.jvm.internal.x)) {
            return e0.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.x) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.x
    public final tu.i getFunctionDelegate() {
        return new kotlin.jvm.internal.a(2, this.f59718b, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((m) obj, (zu.d<? super x0>) dVar);
    }
}
