package androidx.lifecycle;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x implements DisposableHandle {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f6728b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f6729c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6730e;

    public x(l1 source, r1 mediator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(mediator, "mediator");
        this.f6728b = source;
        this.f6729c = mediator;
    }

    public static final void access$removeSource(x xVar) {
        if (xVar.f6730e) {
            return;
        }
        xVar.f6729c.removeSource(xVar.f6728b);
        xVar.f6730e = true;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new v(this, null), 3, null);
    }

    public final Object disposeNow(zu.d<? super tu.x0> dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new w(this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : tu.x0.f87415a;
    }
}
