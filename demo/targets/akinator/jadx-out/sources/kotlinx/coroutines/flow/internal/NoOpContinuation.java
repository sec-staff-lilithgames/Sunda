package kotlinx.coroutines.flow.internal;

import zu.d;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class NoOpContinuation implements d<Object> {
    public static final NoOpContinuation INSTANCE = new NoOpContinuation();
    private static final m context = n.f98854b;

    private NoOpContinuation() {
    }

    @Override // zu.d
    public m getContext() {
        return context;
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
    }
}
