package com.google.android.exoplayer2.util;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import sh.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class k1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28482b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sh.n1 f28483c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2 f28484e;

    public /* synthetic */ k1(sh.n1 n1Var, a2 a2Var) {
        this.f28483c = n1Var;
        this.f28484e = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28482b) {
            case 0:
                if (this.f28484e.isCancelled()) {
                    this.f28483c.cancel(false);
                    break;
                }
                break;
            default:
                sh.n1 n1Var = this.f28483c;
                a2 a2Var = this.f28484e;
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

    public /* synthetic */ k1(a2 a2Var, sh.n1 n1Var) {
        this.f28484e = a2Var;
        this.f28483c = n1Var;
    }
}
