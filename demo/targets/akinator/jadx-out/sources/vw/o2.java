package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o2 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f90030a;

    /* renamed from: b, reason: collision with root package name */
    public final s2 f90031b;

    /* renamed from: c, reason: collision with root package name */
    public final s2 f90032c;

    /* renamed from: d, reason: collision with root package name */
    public final Class[] f90033d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f90034e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f90035f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f90036g;

    /* renamed from: h, reason: collision with root package name */
    public final String f90037h;

    public o2(s2 s2Var) {
        this(s2Var, null);
    }

    @Override // vw.i0
    public Object get(Object obj) throws Exception {
        return this.f90032c.getMethod().invoke(obj, null);
    }

    @Override // vw.i0
    public Annotation getAnnotation() {
        return this.f90030a;
    }

    @Override // vw.i0
    public Class getDeclaringClass() {
        return this.f90034e;
    }

    @Override // vw.i0
    public Class getDependent() {
        return this.f90035f;
    }

    @Override // vw.i0
    public Class[] getDependents() {
        return this.f90033d;
    }

    @Override // vw.i0
    public String getName() {
        return this.f90037h;
    }

    public s2 getRead() {
        return this.f90032c;
    }

    @Override // vw.i0, xw.f
    public Class getType() {
        return this.f90036g;
    }

    public s2 getWrite() {
        return this.f90031b;
    }

    @Override // vw.i0
    public boolean isReadOnly() {
        return this.f90031b == null;
    }

    @Override // vw.i0
    public void set(Object obj, Object obj2) throws Exception {
        Class<?> declaringClass = this.f90032c.getMethod().getDeclaringClass();
        s2 s2Var = this.f90031b;
        if (s2Var == null) {
            throw new q2("Property '%s' is read only in %s", this.f90037h, declaringClass);
        }
        s2Var.getMethod().invoke(obj, obj2);
    }

    @Override // vw.i0, xw.f
    public String toString() {
        return a.b.l("method '", this.f90037h, "'");
    }

    public o2(s2 s2Var, s2 s2Var2) {
        this.f90034e = s2Var.getDeclaringClass();
        this.f90030a = s2Var.getAnnotation();
        this.f90033d = s2Var.getDependents();
        this.f90035f = s2Var.getDependent();
        this.f90036g = s2Var.getType();
        this.f90037h = s2Var.getName();
        this.f90031b = s2Var2;
        this.f90032c = s2Var;
    }

    @Override // vw.i0, xw.f
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        s2 s2Var;
        T t10 = (T) this.f90032c.getAnnotation(cls);
        T t11 = (T) this.f90030a;
        return cls == t11.annotationType() ? t11 : (t10 != null || (s2Var = this.f90031b) == null) ? t10 : (T) s2Var.getAnnotation(cls);
    }
}
