package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z2 extends v3 {

    /* renamed from: j, reason: collision with root package name */
    public final va f93287j;

    /* renamed from: k, reason: collision with root package name */
    public final wr.u0 f93288k = wr.u0.current();

    /* renamed from: l, reason: collision with root package name */
    public final wr.u[] f93289l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a3 f93290m;

    public z2(a3 a3Var, va vaVar, wr.u[] uVarArr) {
        this.f93290m = a3Var;
        this.f93287j = vaVar;
        this.f93289l = uVarArr;
    }

    @Override // xr.v3, xr.k1
    public void appendTimeoutInsight(l5 l5Var) {
        if (this.f93287j.getCallOptions().isWaitForReady()) {
            l5Var.append("wait_for_ready");
        }
        super.appendTimeoutInsight(l5Var);
    }

    @Override // xr.v3
    public final void c(wr.m6 m6Var) {
        for (wr.u uVar : this.f93289l) {
            uVar.streamClosed(m6Var);
        }
    }

    @Override // xr.v3, xr.k1
    public void cancel(wr.m6 m6Var) {
        super.cancel(m6Var);
        synchronized (this.f93290m.f92231b) {
            try {
                a3 a3Var = this.f93290m;
                if (a3Var.f92236g != null) {
                    boolean zRemove = a3Var.f92238i.remove(this);
                    if (!this.f93290m.hasPendingStreams() && zRemove) {
                        a3 a3Var2 = this.f93290m;
                        a3Var2.f92233d.executeLater(a3Var2.f92235f);
                        a3 a3Var3 = this.f93290m;
                        if (a3Var3.f92239j != null) {
                            a3Var3.f92233d.executeLater(a3Var3.f92236g);
                            this.f93290m.f92236g = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f93290m.f92233d.drain();
    }
}
