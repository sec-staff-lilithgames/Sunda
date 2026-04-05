package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final a4 f89783b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f89784c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f89785d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.j f89786e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89787f;

    /* renamed from: g, reason: collision with root package name */
    public final String f89788g;

    /* renamed from: h, reason: collision with root package name */
    public final String f89789h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89790i;

    public f(i0 i0Var, uw.a aVar, yw.j jVar) {
        this.f89784c = new f2(i0Var, this, jVar);
        this.f89783b = new a4(i0Var);
        this.f89790i = aVar.required();
        this.f89787f = i0Var.getType();
        this.f89789h = aVar.empty();
        this.f89788g = aVar.name();
        this.f89786e = jVar;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return null;
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89784c.getContact();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        return new s3(l0Var, getContact(), getEmpty(l0Var));
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89783b;
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89785d == null) {
            this.f89785d = this.f89784c.getExpression();
        }
        return this.f89785d;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        return ((yw.l) this.f89786e.getStyle()).getAttribute(this.f89784c.getName());
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89788g;
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return getExpression().getAttribute(getName());
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89787f;
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
        return this.f89790i;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89784c.toString();
    }

    @Override // vw.z4, vw.i2
    public String getEmpty(l0 l0Var) {
        f2 f2Var = this.f89784c;
        String str = this.f89789h;
        if (f2Var.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
