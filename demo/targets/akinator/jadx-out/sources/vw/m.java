package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m implements j4 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f89974a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f89975b;

    /* renamed from: c, reason: collision with root package name */
    public final k4 f89976c;

    /* renamed from: d, reason: collision with root package name */
    public final j f89977d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f89978e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f89979f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f89980g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f89981h;

    public m(h4 h4Var, l0 l0Var) throws Exception {
        this.f89977d = h4Var.getCaller(l0Var);
        this.f89974a = h4Var.getInstantiator();
        h4Var.getRevision();
        this.f89975b = h4Var.getDecorator();
        this.f89981h = h4Var.isPrimitive();
        this.f89978e = h4Var.getVersion();
        this.f89976c = h4Var.getSection();
        this.f89979f = h4Var.getText();
        this.f89980g = h4Var.getType();
    }

    @Override // vw.j4
    public j getCaller() {
        return this.f89977d;
    }

    @Override // vw.j4
    public q0 getDecorator() {
        return this.f89975b;
    }

    @Override // vw.j4
    public d2 getInstantiator() {
        return this.f89974a;
    }

    @Override // vw.j4
    public uw.s getRevision() {
        return null;
    }

    @Override // vw.j4
    public k4 getSection() {
        return this.f89976c;
    }

    @Override // vw.j4
    public i2 getText() {
        return this.f89979f;
    }

    @Override // vw.j4
    public i2 getVersion() {
        return this.f89978e;
    }

    @Override // vw.j4
    public boolean isPrimitive() {
        return this.f89981h;
    }

    public String toString() {
        return a.b.i(this.f89980g, "schema for ");
    }
}
