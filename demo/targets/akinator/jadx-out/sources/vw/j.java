package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f89913a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f89914b;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f89915c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f89916d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f89917e;

    /* renamed from: f, reason: collision with root package name */
    public final w1 f89918f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f89919g;

    public j(h4 h4Var, l0 l0Var) {
        this.f89914b = h4Var.getValidate();
        this.f89916d = h4Var.getComplete();
        this.f89917e = h4Var.getReplace();
        this.f89918f = h4Var.getResolve();
        this.f89915c = h4Var.getPersist();
        this.f89913a = h4Var.getCommit();
        this.f89919g = l0Var;
    }

    public void commit(Object obj) throws Exception {
        w1 w1Var = this.f89913a;
        if (w1Var != null) {
            w1Var.call(this.f89919g, obj);
        }
    }

    public void complete(Object obj) throws Exception {
        w1 w1Var = this.f89916d;
        if (w1Var != null) {
            w1Var.call(this.f89919g, obj);
        }
    }

    public void persist(Object obj) throws Exception {
        w1 w1Var = this.f89915c;
        if (w1Var != null) {
            w1Var.call(this.f89919g, obj);
        }
    }

    public Object replace(Object obj) throws Exception {
        w1 w1Var = this.f89917e;
        return w1Var != null ? w1Var.call(this.f89919g, obj) : obj;
    }

    public Object resolve(Object obj) throws Exception {
        w1 w1Var = this.f89918f;
        return w1Var != null ? w1Var.call(this.f89919g, obj) : obj;
    }

    public void validate(Object obj) throws Exception {
        w1 w1Var = this.f89914b;
        if (w1Var != null) {
            w1Var.call(this.f89919g, obj);
        }
    }
}
