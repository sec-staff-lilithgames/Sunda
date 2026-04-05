package kotlinx.coroutines.flow;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ThrowingCollector implements FlowCollector<Object> {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f71886e;

    public ThrowingCollector(Throwable th2) {
        this.f71886e = th2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, zu.d<? super x0> dVar) throws Throwable {
        throw this.f71886e;
    }
}
