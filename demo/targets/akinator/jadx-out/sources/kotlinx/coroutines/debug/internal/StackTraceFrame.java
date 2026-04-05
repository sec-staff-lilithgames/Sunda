package kotlinx.coroutines.debug.internal;

import bv.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StackTraceFrame implements e {
    private final e callerFrame;
    private final StackTraceElement stackTraceElement;

    public StackTraceFrame(e eVar, StackTraceElement stackTraceElement) {
        this.callerFrame = eVar;
        this.stackTraceElement = stackTraceElement;
    }

    @Override // bv.e
    public e getCallerFrame() {
        return this.callerFrame;
    }

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
