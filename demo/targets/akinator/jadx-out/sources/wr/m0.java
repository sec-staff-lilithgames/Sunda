package wr;

import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f91025b;

    public m0(n0 n0Var) {
        this.f91025b = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f91025b.cancel(new TimeoutException("context timed out"));
        } catch (Throwable th2) {
            u0.f91141f.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th2);
        }
    }
}
