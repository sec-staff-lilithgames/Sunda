package kotlinx.coroutines.internal;

import kotlinx.coroutines.CoroutineScope;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ContextScope implements CoroutineScope {
    private final m coroutineContext;

    public ContextScope(m mVar) {
        this.coroutineContext = mVar;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
