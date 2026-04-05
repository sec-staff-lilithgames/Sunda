package xv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 extends w0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f93905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f93906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pw.k f93907g;

    public x0(j0 j0Var, long j10, pw.k kVar) {
        this.f93905e = j0Var;
        this.f93906f = j10;
        this.f93907g = kVar;
    }

    @Override // xv.w0
    public long contentLength() {
        return this.f93906f;
    }

    @Override // xv.w0
    public j0 contentType() {
        return this.f93905e;
    }

    @Override // xv.w0
    public pw.k source() {
        return this.f93907g;
    }
}
