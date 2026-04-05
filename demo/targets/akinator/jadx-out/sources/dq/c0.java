package dq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface c0 extends ir.k {
    @Override // ir.k
    /* synthetic */ void onRun() throws Throwable;

    @Override // ir.k
    default void onThrows(Throwable th2) {
        d0.b(th2);
    }

    @Override // ir.k, java.lang.Runnable
    /* bridge */ /* synthetic */ default void run() {
        super.run();
    }
}
