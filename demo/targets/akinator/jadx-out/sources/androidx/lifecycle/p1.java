package androidx.lifecycle;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public m f6697a;

    /* renamed from: b, reason: collision with root package name */
    public final zu.m f6698b;

    public p1(m target, zu.m context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f6697a = target;
        this.f6698b = context.plus(Dispatchers.getMain().getImmediate());
    }

    @Override // androidx.lifecycle.m1
    public Object emit(Object obj, zu.d<? super tu.x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f6698b, new n1(this, obj, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : tu.x0.f87415a;
    }

    @Override // androidx.lifecycle.m1
    public Object emitSource(l1 l1Var, zu.d<? super DisposableHandle> dVar) {
        return BuildersKt.withContext(this.f6698b, new o1(this, l1Var, null), dVar);
    }

    @Override // androidx.lifecycle.m1
    public Object getLatestValue() {
        return this.f6697a.getValue();
    }

    public final m getTarget$lifecycle_livedata_release() {
        return this.f6697a;
    }

    public final void setTarget$lifecycle_livedata_release(m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<set-?>");
        this.f6697a = mVar;
    }
}
