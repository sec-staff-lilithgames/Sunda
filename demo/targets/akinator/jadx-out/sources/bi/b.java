package bi;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f9535a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f9536b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f9537c;

    /* renamed from: d, reason: collision with root package name */
    public int f9538d;

    /* renamed from: e, reason: collision with root package name */
    public int f9539e;

    /* renamed from: f, reason: collision with root package name */
    public i f9540f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f9541g;

    public b(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f9536b = hashSet;
        this.f9537c = new HashSet();
        this.f9538d = 0;
        this.f9539e = 0;
        this.f9541g = new HashSet();
        z.checkNotNull(cls, "Null interface");
        hashSet.add(b0.unqualified(cls));
        for (Class cls2 : clsArr) {
            z.checkNotNull(cls2, "Null interface");
            this.f9536b.add(b0.unqualified(cls2));
        }
    }

    public b add(q qVar) {
        z.checkNotNull(qVar, "Null dependency");
        z.checkArgument(!this.f9536b.contains(qVar.getInterface()), "Components are not allowed to depend on interfaces they themselves provide.");
        this.f9537c.add(qVar);
        return this;
    }

    public b alwaysEager() {
        z.checkState(this.f9538d == 0, "Instantiation type has already been set.");
        this.f9538d = 1;
        return this;
    }

    public c build() {
        z.checkState(this.f9540f != null, "Missing required property: factory.");
        return new c(this.f9535a, new HashSet(this.f9536b), new HashSet(this.f9537c), this.f9538d, this.f9539e, this.f9540f, this.f9541g);
    }

    public b eagerInDefaultApp() {
        z.checkState(this.f9538d == 0, "Instantiation type has already been set.");
        this.f9538d = 2;
        return this;
    }

    public b factory(i iVar) {
        this.f9540f = (i) z.checkNotNull(iVar, "Null factory");
        return this;
    }

    public b name(String str) {
        this.f9535a = str;
        return this;
    }

    public b publishes(Class<?> cls) {
        this.f9541g.add(cls);
        return this;
    }

    public b(b0 b0Var, b0[] b0VarArr) {
        HashSet hashSet = new HashSet();
        this.f9536b = hashSet;
        this.f9537c = new HashSet();
        this.f9538d = 0;
        this.f9539e = 0;
        this.f9541g = new HashSet();
        z.checkNotNull(b0Var, "Null interface");
        hashSet.add(b0Var);
        for (b0 b0Var2 : b0VarArr) {
            z.checkNotNull(b0Var2, "Null interface");
        }
        Collections.addAll(this.f9536b, b0VarArr);
    }
}
