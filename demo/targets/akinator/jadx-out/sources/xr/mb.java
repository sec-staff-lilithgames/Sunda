package xr;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class mb implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f92798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rc f92799c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Future f92800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Future f92801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc f92802g;

    public mb(tc tcVar, Collection collection, rc rcVar, Future future, Future future2) {
        this.f92802g = tcVar;
        this.f92798b = collection;
        this.f92799c = rcVar;
        this.f92800e = future;
        this.f92801f = future2;
    }

    @Override // java.lang.Runnable
    public void run() {
        wr.m6 m6Var;
        for (rc rcVar : this.f92798b) {
            if (rcVar != this.f92799c) {
                rcVar.f92966a.cancel(tc.C);
            }
        }
        Future future = this.f92800e;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f92801f;
        if (future2 != null) {
            future2.cancel(false);
        }
        p7 p7Var = (p7) this.f92802g;
        e6.w0 w0Var = p7Var.H.f92923b.M;
        synchronized (w0Var.f53883a) {
            try {
                ((HashSet) w0Var.f53884b).remove(p7Var);
                if (((HashSet) w0Var.f53884b).isEmpty()) {
                    m6Var = (wr.m6) w0Var.f53885c;
                    w0Var.f53884b = new HashSet();
                } else {
                    m6Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (m6Var != null) {
            ((u8) w0Var.f53886d).L.shutdown(m6Var);
        }
    }
}
