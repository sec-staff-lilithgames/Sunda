package p0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 implements j4 {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f80448b;

    public s0(CoroutineScope coroutineScope) {
        this.f80448b = coroutineScope;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.f80448b;
    }

    @Override // p0.j4
    public void onAbandoned() {
        CoroutineScope coroutineScope = this.f80448b;
        if (coroutineScope instanceof l4) {
            ((l4) coroutineScope).cancelIfCreated();
        } else {
            CoroutineScopeKt.cancel(coroutineScope, new a2());
        }
    }

    @Override // p0.j4
    public void onForgotten() {
        CoroutineScope coroutineScope = this.f80448b;
        if (coroutineScope instanceof l4) {
            ((l4) coroutineScope).cancelIfCreated();
        } else {
            CoroutineScopeKt.cancel(coroutineScope, new a2());
        }
    }

    @Override // p0.j4
    public void onRemembered() {
    }
}
