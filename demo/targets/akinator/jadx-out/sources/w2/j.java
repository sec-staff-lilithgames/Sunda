package w2;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f90353a;

    /* renamed from: b, reason: collision with root package name */
    public n f90354b;

    /* renamed from: c, reason: collision with root package name */
    public s f90355c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90356d;

    public void addCancellationListener(Runnable runnable, Executor executor) {
        s sVar = this.f90355c;
        if (sVar != null) {
            sVar.addListener(runnable, executor);
        }
    }

    public final void finalize() {
        s sVar;
        n nVar = this.f90354b;
        if (nVar != null && !nVar.isDone()) {
            nVar.f90359c.setException(new k("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f90353a));
        }
        if (this.f90356d || (sVar = this.f90355c) == null) {
            return;
        }
        sVar.set(null);
    }

    public boolean set(Object obj) {
        this.f90356d = true;
        n nVar = this.f90354b;
        boolean z10 = nVar != null && nVar.f90359c.set(obj);
        if (z10) {
            this.f90353a = null;
            this.f90354b = null;
            this.f90355c = null;
        }
        return z10;
    }

    public boolean setCancelled() {
        this.f90356d = true;
        n nVar = this.f90354b;
        boolean z10 = nVar != null && nVar.f90359c.cancel(true);
        if (z10) {
            this.f90353a = null;
            this.f90354b = null;
            this.f90355c = null;
        }
        return z10;
    }

    public boolean setException(Throwable th2) {
        this.f90356d = true;
        n nVar = this.f90354b;
        boolean z10 = nVar != null && nVar.f90359c.setException(th2);
        if (z10) {
            this.f90353a = null;
            this.f90354b = null;
            this.f90355c = null;
        }
        return z10;
    }
}
