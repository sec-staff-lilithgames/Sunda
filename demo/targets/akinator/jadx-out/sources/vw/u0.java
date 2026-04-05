package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f90123a;

    /* renamed from: b, reason: collision with root package name */
    public final ax.b f90124b;

    /* renamed from: c, reason: collision with root package name */
    public final ax.b f90125c;

    /* renamed from: d, reason: collision with root package name */
    public final uw.c f90126d;

    /* renamed from: e, reason: collision with root package name */
    public final v4 f90127e;

    public u0(v4 v4Var) {
        this(v4Var, null);
    }

    public t0 getDetail(Class cls) {
        ax.b bVar = this.f90125c;
        t0 t0Var = (t0) bVar.fetch(cls);
        if (t0Var != null) {
            return t0Var;
        }
        v0 v0Var = new v0(cls, this.f90126d);
        bVar.cache(cls, v0Var);
        return v0Var;
    }

    public j0 getFields(Class cls) throws Exception {
        t0 detail;
        ax.b bVar = this.f90124b;
        j0 j0Var = (j0) bVar.fetch(cls);
        if (j0Var != null || (detail = getDetail(cls)) == null) {
            return j0Var;
        }
        v1 v1Var = new v1(detail, this.f90127e);
        bVar.cache(cls, v1Var);
        return v1Var;
    }

    public j0 getMethods(Class cls) throws Exception {
        t0 detail;
        ax.b bVar = this.f90123a;
        j0 j0Var = (j0) bVar.fetch(cls);
        if (j0Var != null || (detail = getDetail(cls)) == null) {
            return j0Var;
        }
        v2 v2Var = new v2(detail, this.f90127e);
        bVar.cache(cls, v2Var);
        return v2Var;
    }

    public u0(v4 v4Var, uw.c cVar) {
        this.f90123a = new ax.b();
        this.f90124b = new ax.b();
        this.f90125c = new ax.b();
        this.f90126d = cVar;
        this.f90127e = v4Var;
    }
}
