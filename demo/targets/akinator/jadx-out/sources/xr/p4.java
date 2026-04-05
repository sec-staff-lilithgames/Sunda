package xr;

import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class p4 extends wr.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final wr.p4 f92873a;

    public p4(wr.p4 p4Var) {
        mh.p1.checkNotNull(p4Var, "delegate can not be null");
        this.f92873a = p4Var;
    }

    @Override // wr.p4
    public String getServiceAuthority() {
        return this.f92873a.getServiceAuthority();
    }

    @Override // wr.p4
    public void refresh() {
        this.f92873a.refresh();
    }

    @Override // wr.p4
    public void shutdown() {
        this.f92873a.shutdown();
    }

    @Override // wr.p4
    @Deprecated
    public void start(wr.q4 q4Var) {
        this.f92873a.start(q4Var);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", this.f92873a).toString();
    }

    @Override // wr.p4
    public void start(p4.b bVar) {
        this.f92873a.start(bVar);
    }
}
