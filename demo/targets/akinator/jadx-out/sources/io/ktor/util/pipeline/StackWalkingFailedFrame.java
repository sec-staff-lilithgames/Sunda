package io.ktor.util.pipeline;

import bv.e;
import io.ktor.util.StackFramesJvmKt;
import kotlin.jvm.internal.c1;
import zu.d;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackWalkingFailedFrame implements e, d<?> {
    public static final StackWalkingFailedFrame INSTANCE = new StackWalkingFailedFrame();

    private StackWalkingFailedFrame() {
    }

    @Override // bv.e
    public e getCallerFrame() {
        return null;
    }

    @Override // zu.d
    public m getContext() {
        return n.f98854b;
    }

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return StackFramesJvmKt.createStackTraceElement(c1.getOrCreateKotlinClass(StackWalkingFailed.class), "failedToCaptureStackFrame", "StackWalkingFailed.kt", 8);
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        StackWalkingFailed.INSTANCE.failedToCaptureStackFrame();
    }
}
