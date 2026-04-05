package xr;

import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class yc extends p4.b {

    /* renamed from: a, reason: collision with root package name */
    public final p4.b f93266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc f93267b;

    public yc(zc zcVar, p4.b bVar) {
        this.f93267b = zcVar;
        this.f93266a = bVar;
    }

    @Override // wr.p4.b, wr.q4
    public void onError(wr.m6 m6Var) {
        this.f93266a.onError(m6Var);
        this.f93267b.f93335c.execute(new on.w(this, 27));
    }

    @Override // wr.p4.b
    public void onResult(wr.s4 s4Var) {
        wr.c attributes = s4Var.getAttributes();
        wr.b bVar = zc.f93333d;
        if (attributes.get(bVar) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        this.f93266a.onResult(s4Var.toBuilder().setAttributes(s4Var.getAttributes().toBuilder().set(bVar, new xc(this.f93267b)).build()).build());
    }
}
