package io.bidmachine.media3.common.util;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import sh.a2;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class y0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60820b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f60821c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2 f60822e;

    public /* synthetic */ y0(n1 n1Var, a2 a2Var) {
        this.f60821c = n1Var;
        this.f60822e = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60820b) {
            case 0:
                if (this.f60822e.isCancelled()) {
                    this.f60821c.cancel(false);
                    break;
                }
                break;
            default:
                n1 n1Var = this.f60821c;
                a2 a2Var = this.f60822e;
                try {
                    sh.b1.getDone(n1Var);
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        a2Var.setException(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    a2Var.setException(e);
                    return;
                } catch (CancellationException unused) {
                    a2Var.cancel(false);
                } catch (RuntimeException e11) {
                    e = e11;
                    a2Var.setException(e);
                    return;
                } catch (ExecutionException e12) {
                    e = e12;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    a2Var.setException(e);
                    return;
                }
        }
    }

    public /* synthetic */ y0(a2 a2Var, n1 n1Var) {
        this.f60822e = a2Var;
        this.f60821c = n1Var;
    }
}
