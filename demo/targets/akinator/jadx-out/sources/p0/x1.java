package p0;

import java.util.ArrayList;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f80586a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f80587b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f80588c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f80589d = true;

    public final Object await(zu.d<? super tu.x0> dVar) {
        if (isOpen()) {
            return tu.x0.f87415a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this.f80586a) {
            this.f80587b.add(cancellableContinuationImpl);
        }
        cancellableContinuationImpl.invokeOnCancellation(new w1(this, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : tu.x0.f87415a;
    }

    public final void closeLatch() {
        synchronized (this.f80586a) {
            this.f80589d = false;
        }
    }

    public final boolean isOpen() {
        boolean z10;
        synchronized (this.f80586a) {
            z10 = this.f80589d;
        }
        return z10;
    }

    public final void openLatch() {
        synchronized (this.f80586a) {
            try {
                if (isOpen()) {
                    return;
                }
                ArrayList arrayList = this.f80587b;
                this.f80587b = this.f80588c;
                this.f80588c = arrayList;
                this.f80589d = true;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zu.d dVar = (zu.d) arrayList.get(i10);
                    int i11 = tu.z.f87419c;
                    dVar.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <R> R withClosed(kv.a aVar) {
        closeLatch();
        try {
            return (R) aVar.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            openLatch();
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }
}
