package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m5 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final a4 f89989b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f89990c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f89991d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.j f89992e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89993f;

    /* renamed from: g, reason: collision with root package name */
    public final String f89994g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f89995h;

    public m5(i0 i0Var, uw.s sVar, yw.j jVar) {
        this.f89990c = new f2(i0Var, this, jVar);
        this.f89989b = new a4(i0Var);
        this.f89995h = sVar.required();
        this.f89993f = i0Var.getType();
        this.f89994g = sVar.name();
        this.f89992e = jVar;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return null;
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89990c.getContact();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        String empty = getEmpty(l0Var);
        i0 contact = getContact();
        if (l0Var.isFloat(contact)) {
            return new s3(l0Var, contact, empty);
        }
        throw new e("Cannot use %s to represent %s", null, contact);
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89989b;
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89991d == null) {
            this.f89991d = this.f89990c.getExpression();
        }
        return this.f89991d;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        return ((yw.l) this.f89992e.getStyle()).getAttribute(this.f89990c.getName());
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89994g;
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return getExpression().getAttribute(getName());
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89993f;
    }

    @Override // vw.z4, vw.i2
    public boolean isAttribute() {
        return true;
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return false;
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89995h;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89990c.toString();
    }

    @Override // vw.z4, vw.i2
    public String getEmpty(l0 l0Var) {
        return null;
    }
}
