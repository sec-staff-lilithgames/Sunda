package kotlinx.coroutines.flow.internal;

import bv.e;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class StackFrameContinuation<T> implements d<T>, e {
    private final m context;
    private final d<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(d<? super T> dVar, m mVar) {
        this.uCont = dVar;
        this.context = mVar;
    }

    @Override // bv.e
    public e getCallerFrame() {
        d<T> dVar = this.uCont;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // zu.d
    public m getContext() {
        return this.context;
    }

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
