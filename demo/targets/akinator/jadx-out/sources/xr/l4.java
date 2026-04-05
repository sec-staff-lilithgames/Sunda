package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l4 implements m1 {
    @Override // xr.m1
    public void closed(wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        ((z5) this).f93295a.closed(m6Var, l1Var, e4Var);
    }

    @Override // xr.m1
    public void headersRead(wr.e4 e4Var) {
        ((z5) this).f93295a.headersRead(e4Var);
    }

    @Override // xr.m1, xr.we
    public void messagesAvailable(ve veVar) {
        ((z5) this).f93295a.messagesAvailable(veVar);
    }

    @Override // xr.m1, xr.we
    public void onReady() {
        ((z5) this).f93295a.onReady();
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", ((z5) this).f93295a).toString();
    }
}
