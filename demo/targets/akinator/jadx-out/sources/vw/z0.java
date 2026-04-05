package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class z0 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final a4 f90249b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f90250c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f90251d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.j f90252e;

    /* renamed from: f, reason: collision with root package name */
    public final String f90253f;

    /* renamed from: g, reason: collision with root package name */
    public String f90254g;

    /* renamed from: h, reason: collision with root package name */
    public String f90255h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f90256i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f90257j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f90258k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f90259l;

    public z0(i0 i0Var, uw.d dVar, yw.j jVar) {
        this.f90250c = new f2(i0Var, this, jVar);
        this.f90249b = new a4(i0Var);
        this.f90258k = dVar.required();
        this.f90257j = i0Var.getType();
        this.f90253f = dVar.name();
        this.f90256i = dVar.type();
        this.f90259l = dVar.data();
        this.f90252e = jVar;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return null;
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f90250c.getContact();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        i0 contact = getContact();
        if (l0Var.isPrimitive(contact)) {
            return new s3(l0Var, contact);
        }
        Class cls = Void.TYPE;
        Class cls2 = this.f90256i;
        return cls2 == cls ? new u(l0Var, contact) : new u(l0Var, contact, cls2);
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f90249b;
    }

    @Override // vw.z4, vw.i2
    public Object getEmpty(l0 l0Var) {
        return null;
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f90251d == null) {
            this.f90251d = this.f90250c.getExpression();
        }
        return this.f90251d;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        if (this.f90255h == null) {
            this.f90255h = ((yw.l) this.f90252e.getStyle()).getElement(this.f90250c.getName());
        }
        return this.f90255h;
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f90253f;
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        if (this.f90254g == null) {
            this.f90254g = getExpression().getElement(getName());
        }
        return this.f90254g;
    }

    @Override // vw.z4, vw.i2
    public xw.f getType(Class cls) {
        i0 contact = getContact();
        Class cls2 = Void.TYPE;
        Class cls3 = this.f90256i;
        return cls3 == cls2 ? contact : new g3(contact, cls3);
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f90259l;
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f90258k;
    }

    @Override // vw.i2
    public String toString() {
        return this.f90250c.toString();
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        Class cls = Void.TYPE;
        Class cls2 = this.f90256i;
        return cls2 == cls ? this.f90257j : cls2;
    }
}
