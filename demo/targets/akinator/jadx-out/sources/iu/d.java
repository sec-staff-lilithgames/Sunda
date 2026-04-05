package iu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends AtomicReference {
    public boolean addThrowable(Throwable th2) {
        return m.addThrowable(this, th2);
    }

    public boolean isTerminated() {
        return get() == m.f68415a;
    }

    public Throwable terminate() {
        return m.terminate(this);
    }
}
