package vw;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f89934a;

    /* renamed from: b, reason: collision with root package name */
    public final l3 f89935b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f89936c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f89937d;

    public k(List<o0> list, o0 o0Var, l3 l3Var, t0 t0Var) {
        this.f89934a = list;
        this.f89935b = l3Var;
        this.f89936c = o0Var;
        this.f89937d = t0Var;
    }

    @Override // vw.d2
    public List<o0> getCreators() {
        return new ArrayList(this.f89934a);
    }

    @Override // vw.d2
    public Object getInstance() throws Exception {
        return this.f89936c.getInstance();
    }

    @Override // vw.d2
    public i3 getParameter(String str) {
        return (i3) this.f89935b.get(str);
    }

    @Override // vw.d2
    public List<i3> getParameters() {
        return this.f89935b.getAll();
    }

    @Override // vw.d2
    public boolean isDefault() {
        return this.f89934a.size() <= 1 && this.f89936c != null;
    }

    public String toString() {
        return String.format("creator for %s", this.f89937d);
    }

    @Override // vw.d2
    public Object getInstance(p0 p0Var) throws Exception {
        o0 o0Var = this.f89936c;
        double d10 = 0.0d;
        for (o0 o0Var2 : this.f89934a) {
            double score = o0Var2.getScore(p0Var);
            if (score > d10) {
                o0Var = o0Var2;
                d10 = score;
            }
        }
        if (o0Var != null) {
            return o0Var.getInstance(p0Var);
        }
        throw new p3("Constructor not matched for %s", this.f89937d);
    }
}
