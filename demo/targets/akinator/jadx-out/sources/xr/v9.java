package xr;

import wr.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v9 extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f93185a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.k4 f93186b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.e4 f93187c;

    /* renamed from: d, reason: collision with root package name */
    public final wr.i f93188d;

    /* renamed from: f, reason: collision with root package name */
    public final u9 f93190f;

    /* renamed from: g, reason: collision with root package name */
    public final wr.u[] f93191g;

    /* renamed from: i, reason: collision with root package name */
    public k1 f93193i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93194j;

    /* renamed from: k, reason: collision with root package name */
    public v3 f93195k;

    /* renamed from: h, reason: collision with root package name */
    public final Object f93192h = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final wr.u0 f93189e = wr.u0.current();

    public v9(o1 o1Var, wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, p0 p0Var, wr.u[] uVarArr) {
        this.f93185a = o1Var;
        this.f93186b = k4Var;
        this.f93187c = e4Var;
        this.f93188d = iVar;
        this.f93190f = p0Var;
        this.f93191g = uVarArr;
    }

    public final void a(k1 k1Var) {
        boolean z10;
        mh.p1.checkState(!this.f93194j, "already finalized");
        this.f93194j = true;
        synchronized (this.f93192h) {
            try {
                if (this.f93193i == null) {
                    this.f93193i = k1Var;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((p0) this.f93190f).onComplete();
            return;
        }
        mh.p1.checkState(this.f93195k != null, "delayedStream is null");
        k3 k3VarD = this.f93195k.d(k1Var);
        if (k3VarD != null) {
            k3VarD.run();
        }
        ((p0) this.f93190f).onComplete();
    }

    @Override // wr.f.a
    public void apply(wr.e4 e4Var) {
        mh.p1.checkState(!this.f93194j, "apply() or fail() already called");
        mh.p1.checkNotNull(e4Var, "headers");
        wr.e4 e4Var2 = this.f93187c;
        e4Var2.merge(e4Var);
        wr.u0 u0Var = this.f93189e;
        wr.u0 u0VarAttach = u0Var.attach();
        try {
            k1 k1VarNewStream = this.f93185a.newStream(this.f93186b, e4Var2, this.f93188d, this.f93191g);
            u0Var.detach(u0VarAttach);
            a(k1VarNewStream);
        } catch (Throwable th2) {
            u0Var.detach(u0VarAttach);
            throw th2;
        }
    }

    @Override // wr.f.a
    public void fail(wr.m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "Cannot fail with OK status");
        mh.p1.checkState(!this.f93194j, "apply() or fail() already called");
        a(new g4(c5.replaceInappropriateControlPlaneStatus(m6Var), this.f93191g));
    }
}
