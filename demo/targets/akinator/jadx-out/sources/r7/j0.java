package r7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends FutureTask {

    /* renamed from: b, reason: collision with root package name */
    public k0 f83950b;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                k0 k0Var = this.f83950b;
                i0 i0Var = (i0) get();
                Executor executor = k0.f83955e;
                k0Var.b(i0Var);
            } catch (InterruptedException | ExecutionException e10) {
                k0 k0Var2 = this.f83950b;
                i0 i0Var2 = new i0(e10);
                Executor executor2 = k0.f83955e;
                k0Var2.b(i0Var2);
            }
        } finally {
            this.f83950b = null;
        }
    }
}
