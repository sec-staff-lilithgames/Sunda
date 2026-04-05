package xr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class hb implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb f92591b;

    public hb(jb jbVar) {
        this.f92591b = jbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jb jbVar = this.f92591b;
        if (!jbVar.f92715f) {
            jbVar.f92716g = null;
            return;
        }
        mh.t2 t2Var = jbVar.f92713d;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jElapsed = jbVar.f92714e - t2Var.elapsed(timeUnit);
        if (jElapsed > 0) {
            jbVar.f92716g = jbVar.f92710a.schedule(new ib(jbVar), jElapsed, timeUnit);
            return;
        }
        jbVar.f92715f = false;
        jbVar.f92716g = null;
        jbVar.f92712c.run();
    }
}
