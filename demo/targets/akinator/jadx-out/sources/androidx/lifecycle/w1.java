package androidx.lifecycle;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 extends CoroutineDispatcher {

    /* renamed from: e, reason: collision with root package name */
    public final u f6726e = new u();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(zu.m context, Runnable block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        this.f6726e.dispatchAndEnqueue(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(zu.m context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (Dispatchers.getMain().getImmediate().isDispatchNeeded(context)) {
            return true;
        }
        return !this.f6726e.canRun();
    }
}
