package sh;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j1 extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f85828b;

    public j1(l1 l1Var) {
        this.f85828b = l1Var;
    }

    public static void a(j1 j1Var, Thread thread) {
        j1Var.setExclusiveOwnerThread(thread);
    }

    public String toString() {
        return this.f85828b.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
