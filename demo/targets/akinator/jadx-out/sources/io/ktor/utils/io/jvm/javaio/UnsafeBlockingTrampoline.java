package io.ktor.utils.io.jvm.javaio;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class UnsafeBlockingTrampoline extends CoroutineDispatcher {
    public static final UnsafeBlockingTrampoline INSTANCE = new UnsafeBlockingTrampoline();

    private UnsafeBlockingTrampoline() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(m context, Runnable block) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(block, "block");
        block.run();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(m context) {
        e0.checkNotNullParameter(context, "context");
        return true;
    }
}
