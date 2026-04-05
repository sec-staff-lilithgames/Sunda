package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final m6 f90973a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f90974b;

    /* renamed from: c, reason: collision with root package name */
    public final q f90975c;

    public i2(m6 m6Var, Object obj, q qVar) {
        this.f90973a = (m6) mh.p1.checkNotNull(m6Var, "status");
        this.f90974b = obj;
        this.f90975c = qVar;
    }

    public static i2 forError(m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "status is OK");
        return new i2(m6Var, null, null);
    }

    public static h2 newBuilder() {
        return new h2();
    }

    public Object getConfig() {
        return this.f90974b;
    }

    public q getInterceptor() {
        return this.f90975c;
    }

    public m6 getStatus() {
        return this.f90973a;
    }
}
