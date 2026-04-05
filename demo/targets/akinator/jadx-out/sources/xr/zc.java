package xr;

import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class zc extends p4 {

    /* renamed from: d, reason: collision with root package name */
    public static final wr.b f93333d = wr.b.create("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: b, reason: collision with root package name */
    public final o0 f93334b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.u6 f93335c;

    public zc(wr.p4 p4Var, o0 o0Var, wr.u6 u6Var) {
        super(p4Var);
        this.f93334b = o0Var;
        this.f93335c = u6Var;
    }

    @Override // xr.p4, wr.p4
    public void shutdown() {
        super.shutdown();
        this.f93334b.reset();
    }

    @Override // xr.p4, wr.p4
    public void start(p4.b bVar) {
        super.start((p4.b) new yc(this, bVar));
    }
}
