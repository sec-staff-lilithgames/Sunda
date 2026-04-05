package p0;

import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f80170a;

    public final Object awaitFrameRequest(Object obj, zu.d<? super tu.x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl;
        synchronized (obj) {
            if (this.f80170a == e4.f80200a) {
                this.f80170a = e4.f80201b;
                return tu.x0.f87415a;
            }
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
            cancellableContinuationImpl2.initCancellability();
            synchronized (obj) {
                try {
                    if (this.f80170a == e4.f80200a) {
                        this.f80170a = e4.f80201b;
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                    } else {
                        this.f80170a = cancellableContinuationImpl2;
                        cancellableContinuationImpl = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cancellableContinuationImpl != null) {
                int i10 = tu.z.f87419c;
                cancellableContinuationImpl.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
            }
            Object result = cancellableContinuationImpl2.getResult();
            if (result == av.e.getCOROUTINE_SUSPENDED()) {
                bv.h.probeCoroutineSuspended(dVar);
            }
            return result == av.e.getCOROUTINE_SUSPENDED() ? result : tu.x0.f87415a;
        }
    }

    public final zu.d<tu.x0> requestFrameLocked() {
        Object obj = this.f80170a;
        if (obj instanceof zu.d) {
            this.f80170a = e4.f80201b;
            return (zu.d) obj;
        }
        if (kotlin.jvm.internal.e0.areEqual(obj, e4.f80200a) || kotlin.jvm.internal.e0.areEqual(obj, e4.f80201b)) {
            return null;
        }
        if (obj != null) {
            throw new IllegalStateException(o2.o(obj, "invalid pendingFrameContinuation "));
        }
        this.f80170a = e4.f80200a;
        return null;
    }

    public final void takeFrameRequestLocked() {
        if (!(this.f80170a == e4.f80201b)) {
            a3.throwIllegalStateException("frame not pending");
        }
        this.f80170a = null;
    }
}
