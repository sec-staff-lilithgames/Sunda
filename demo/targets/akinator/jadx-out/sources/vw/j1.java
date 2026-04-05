package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j1 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final z1 f89920b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f89921c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f89922d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f89923e;

    public j1(i0 i0Var, uw.j jVar, uw.d dVar, yw.j jVar2) throws Exception {
        this.f89920b = new z1(i0Var, jVar, jVar2);
        this.f89923e = new z0(i0Var, dVar, jVar2);
        this.f89922d = i0Var;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return this.f89923e.getAnnotation();
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89922d;
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        o1 expression = getExpression();
        i0 contact = getContact();
        if (contact != null) {
            return new e0(l0Var, this.f89920b, expression, contact);
        }
        throw new i5("Union %s was not declared on a field or method", this.f89923e);
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89923e.getDecorator();
    }

    @Override // vw.z4, vw.i2
    public xw.f getDependent() throws Exception {
        return this.f89923e.getDependent();
    }

    @Override // vw.z4, vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        return this.f89923e.getEmpty(l0Var);
    }

    @Override // vw.z4, vw.i2
    public String getEntry() throws Exception {
        return this.f89923e.getEntry();
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89921c == null) {
            this.f89921c = this.f89923e.getExpression();
        }
        return this.f89921c;
    }

    @Override // vw.z4, vw.i2
    public i2 getLabel(Class cls) throws Exception {
        i0 contact = getContact();
        z1 z1Var = this.f89920b;
        if (z1Var.isValid(cls)) {
            return z1Var.getLabel(cls);
        }
        throw new i5("No type matches %s in %s for %s", cls, null, contact);
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        return this.f89923e.getName();
    }

    @Override // vw.z4, vw.i2
    public String[] getNames() throws Exception {
        return this.f89920b.getNames();
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89923e.getOverride();
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return this.f89923e.getPath();
    }

    @Override // vw.z4, vw.i2
    public String[] getPaths() throws Exception {
        return this.f89920b.getPaths();
    }

    @Override // vw.z4, vw.i2
    public xw.f getType(Class cls) throws Exception {
        i0 contact = getContact();
        z1 z1Var = this.f89920b;
        if (z1Var.isValid(cls)) {
            return z1Var.isDeclared(cls) ? new g3(contact, cls) : contact;
        }
        throw new i5("No type matches %s in %s for %s", cls, null, contact);
    }

    @Override // vw.z4, vw.i2
    public boolean isCollection() {
        return this.f89923e.isCollection();
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f89923e.isData();
    }

    @Override // vw.z4, vw.i2
    public boolean isInline() {
        return this.f89923e.isInline();
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89923e.isRequired();
    }

    @Override // vw.z4, vw.i2
    public boolean isUnion() {
        return true;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89923e.toString();
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89923e.getType();
    }
}
