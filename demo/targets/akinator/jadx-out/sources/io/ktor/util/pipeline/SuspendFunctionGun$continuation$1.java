package io.ktor.util.pipeline;

import bv.e;
import kotlin.jvm.internal.e0;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SuspendFunctionGun$continuation$1 implements d<x0>, e {
    private int currentIndex = Integer.MIN_VALUE;
    final /* synthetic */ SuspendFunctionGun<TSubject, TContext> this$0;

    public SuspendFunctionGun$continuation$1(SuspendFunctionGun<TSubject, TContext> suspendFunctionGun) {
        this.this$0 = suspendFunctionGun;
    }

    private final d<?> peekContinuation() {
        if (this.currentIndex == Integer.MIN_VALUE) {
            this.currentIndex = ((SuspendFunctionGun) this.this$0).lastSuspensionIndex;
        }
        if (this.currentIndex < 0) {
            this.currentIndex = Integer.MIN_VALUE;
            return null;
        }
        try {
            d<?>[] dVarArr = ((SuspendFunctionGun) this.this$0).suspensions;
            int i10 = this.currentIndex;
            d<?> dVar = dVarArr[i10];
            if (dVar == null) {
                return StackWalkingFailedFrame.INSTANCE;
            }
            this.currentIndex = i10 - 1;
            return dVar;
        } catch (Throwable unused) {
            return StackWalkingFailedFrame.INSTANCE;
        }
    }

    @Override // bv.e
    public e getCallerFrame() {
        d<?> dVarPeekContinuation = peekContinuation();
        if (dVarPeekContinuation instanceof e) {
            return (e) dVarPeekContinuation;
        }
        return null;
    }

    @Override // zu.d
    public m getContext() {
        d dVar = ((SuspendFunctionGun) this.this$0).suspensions[((SuspendFunctionGun) this.this$0).lastSuspensionIndex];
        if (dVar != this && dVar != null) {
            return dVar.getContext();
        }
        int i10 = ((SuspendFunctionGun) this.this$0).lastSuspensionIndex - 1;
        while (i10 >= 0) {
            int i11 = i10 - 1;
            d dVar2 = ((SuspendFunctionGun) this.this$0).suspensions[i10];
            if (dVar2 != this && dVar2 != null) {
                return dVar2.getContext();
            }
            i10 = i11;
        }
        throw new IllegalStateException("Not started");
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        if (!z.m7136isFailureimpl(obj)) {
            this.this$0.loop(false);
            return;
        }
        SuspendFunctionGun<TSubject, TContext> suspendFunctionGun = this.this$0;
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        e0.checkNotNull(thM7134exceptionOrNullimpl);
        suspendFunctionGun.resumeRootWith(z.m7131constructorimpl(a0.createFailure(thM7134exceptionOrNullimpl)));
    }

    public final void setCurrentIndex(int i10) {
        this.currentIndex = i10;
    }
}
