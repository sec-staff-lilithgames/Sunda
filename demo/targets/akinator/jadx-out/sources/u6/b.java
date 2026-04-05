package u6;

import r6.o;
import v6.b0;
import v6.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f87962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f87963c;

    public b(d dVar, String str) {
        this.f87963c = dVar;
        this.f87962b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        b0 runningWorkSpec = this.f87963c.f87966c.getProcessor().getRunningWorkSpec(this.f87962b);
        if (runningWorkSpec == null || !runningWorkSpec.hasConstraints()) {
            return;
        }
        synchronized (this.f87963c.f87968f) {
            this.f87963c.f87971i.put(n0.generationalId(runningWorkSpec), runningWorkSpec);
            d dVar = this.f87963c;
            this.f87963c.f87972j.put(n0.generationalId(runningWorkSpec), o.listen(dVar.f87973k, runningWorkSpec, dVar.f87967e.getTaskCoroutineDispatcher(), this.f87963c));
        }
    }
}
