package xr;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g6 implements g9 {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f92555a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92556b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f92557c;

    public g6(i6 i6Var, b6 b6Var) {
        this.f92557c = i6Var;
        this.f92555a = b6Var;
    }

    @Override // xr.g9
    public wr.c filterTransport(wr.c cVar) {
        for (wr.x xVar : this.f92557c.f92619l) {
            cVar = (wr.c) mh.p1.checkNotNull(xVar.transportReady(cVar), "Filter %s returned null", xVar);
        }
        return cVar;
    }

    @Override // xr.g9
    public void transportInUse(boolean z10) {
        i6 i6Var = this.f92557c;
        i6Var.f92620m.execute(new w5(i6Var, this.f92555a, z10));
    }

    @Override // xr.g9
    public void transportReady() {
        i6 i6Var = this.f92557c;
        i6Var.f92618k.log(wr.l.f91018c, "READY");
        i6Var.f92620m.execute(new d6(this));
    }

    @Override // xr.g9
    public void transportShutdown(wr.m6 m6Var) {
        i6 i6Var = this.f92557c;
        i6Var.f92618k.log(wr.l.f91018c, "{0} SHUTDOWN with {1}", this.f92555a.getLogId(), i6.d(m6Var));
        this.f92556b = true;
        i6Var.f92620m.execute(new e6(this, m6Var));
    }

    @Override // xr.g9
    public void transportTerminated() {
        mh.p1.checkState(this.f92556b, "transportShutdown() must be called before transportTerminated().");
        i6 i6Var = this.f92557c;
        wr.m mVar = i6Var.f92618k;
        b6 b6Var = this.f92555a;
        mVar.log(wr.l.f91018c, "{0} Terminated", b6Var.getLogId());
        i6Var.f92615h.removeClientSocket(b6Var);
        wr.u6 u6Var = i6Var.f92620m;
        u6Var.execute(new w5(i6Var, b6Var, false));
        Iterator it = i6Var.f92619l.iterator();
        while (it.hasNext()) {
            ((wr.x) it.next()).transportTerminated(b6Var.getAttributes());
        }
        u6Var.execute(new f6(this));
    }
}
