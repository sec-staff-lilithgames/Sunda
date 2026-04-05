package xr;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x implements d2 {

    /* renamed from: b, reason: collision with root package name */
    public final se f93222b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f93223c;

    /* renamed from: e, reason: collision with root package name */
    public final p9 f93224e;

    public x(g5 g5Var, g5 g5Var2, p9 p9Var) {
        se seVar = new se((m9) mh.p1.checkNotNull(g5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER));
        this.f93222b = seVar;
        c0 c0Var = new c0(seVar, g5Var2);
        this.f93223c = c0Var;
        p9Var.f92881b = c0Var;
        this.f93224e = p9Var;
    }

    @Override // xr.d2, java.lang.AutoCloseable
    public void close() {
        this.f93224e.f92899u = true;
        this.f93222b.messagesAvailable(new v(this, new t(this)));
    }

    @Override // xr.d2
    public void closeWhenComplete() {
        this.f93222b.messagesAvailable(new v(this, new s(this)));
    }

    @Override // xr.d2
    public void deframe(ab abVar) {
        this.f93222b.messagesAvailable(new u(this, new q(this, abVar), new r(abVar)));
    }

    @Override // xr.d2
    public void request(int i10) {
        this.f93222b.messagesAvailable(new v(this, new p(this, i10)));
    }

    @Override // xr.d2
    public void setDecompressor(wr.a1 a1Var) {
        this.f93224e.setDecompressor(a1Var);
    }

    @Override // xr.d2
    public void setFullStreamDecompressor(d5 d5Var) {
        this.f93224e.setFullStreamDecompressor(d5Var);
    }

    @Override // xr.d2
    public void setMaxInboundMessageSize(int i10) {
        this.f93224e.setMaxInboundMessageSize(i10);
    }
}
