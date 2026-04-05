package rc;

import tb.m1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t0 {

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f84252f = new t0(jc.n0.f69382g, Object.class, null, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final jc.n0 f84253a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f84254b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f84255c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f84256d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84257e;

    public t0(jc.n0 n0Var, Class<?> cls, Class<? extends tb.f1> cls2, Class<? extends tb.j1> cls3) {
        this(n0Var, cls, cls2, false, cls3);
    }

    public static t0 empty() {
        return f84252f;
    }

    public boolean getAlwaysAsId() {
        return this.f84257e;
    }

    public Class<? extends tb.f1> getGeneratorType() {
        return this.f84254b;
    }

    public jc.n0 getPropertyName() {
        return this.f84253a;
    }

    public Class<? extends tb.j1> getResolverType() {
        return this.f84255c;
    }

    public Class<?> getScope() {
        return this.f84256d;
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f84253a + ", scope=" + dd.i.nameOf((Class<?>) this.f84256d) + ", generatorType=" + dd.i.nameOf((Class<?>) this.f84254b) + ", alwaysAsId=" + this.f84257e;
    }

    public t0 withAlwaysAsId(boolean z10) {
        if (this.f84257e == z10) {
            return this;
        }
        return new t0(this.f84253a, this.f84256d, this.f84254b, z10, this.f84255c);
    }

    public t0(jc.n0 n0Var, Class cls, Class cls2, boolean z10, Class cls3) {
        this.f84253a = n0Var;
        this.f84256d = cls;
        this.f84254b = cls2;
        this.f84257e = z10;
        this.f84255c = cls3 == null ? m1.class : cls3;
    }
}
