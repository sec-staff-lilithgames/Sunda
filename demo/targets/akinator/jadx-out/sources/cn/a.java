package cn;

import pr.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a extends l {
    @Override // pr.l
    /* synthetic */ void onRun() throws Throwable;

    @Override // pr.l
    default void onThrows(Throwable th2) throws Throwable {
        nm.a.w(th2);
    }

    @Override // pr.l, java.lang.Runnable
    /* bridge */ /* synthetic */ default void run() {
        super.run();
    }
}
