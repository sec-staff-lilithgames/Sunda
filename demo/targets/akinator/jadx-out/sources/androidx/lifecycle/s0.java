package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends q0 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final k0 f6705b;

    /* renamed from: c, reason: collision with root package name */
    public final zu.m f6706c;

    public s0(k0 lifecycle, zu.m coroutineContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f6705b = lifecycle;
        this.f6706c = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == j0.f6614b) {
            JobKt__JobKt.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public zu.m getCoroutineContext() {
        return this.f6706c;
    }

    @Override // androidx.lifecycle.q0
    public k0 getLifecycle$lifecycle_common() {
        return this.f6705b;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(j0.f6614b) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            JobKt__JobKt.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public final void register() {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain().getImmediate(), null, new r0(this, null), 2, null);
    }
}
