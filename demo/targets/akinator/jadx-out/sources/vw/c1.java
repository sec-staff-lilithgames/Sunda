package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c1 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final z1 f89720b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f89721c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f89722d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f89723e;

    public c1(i0 i0Var, uw.g gVar, uw.f fVar, yw.j jVar) throws Exception {
        this.f89723e = new a1(i0Var, fVar, jVar);
        this.f89720b = new z1(i0Var, gVar, jVar);
        this.f89722d = i0Var;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return this.f89723e.getAnnotation();
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89722d;
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        o1 expression = getExpression();
        i0 contact = getContact();
        if (contact != null) {
            return new b0(l0Var, this.f89720b, expression, contact);
        }
        throw new i5("Union %s was not declared on a field or method", this.f89723e);
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89723e.getDecorator();
    }

    @Override // vw.z4, vw.i2
    public xw.f getDependent() throws Exception {
        return this.f89723e.getDependent();
    }

    @Override // vw.z4, vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        return this.f89723e.getEmpty(l0Var);
    }

    @Override // vw.z4, vw.i2
    public String getEntry() throws Exception {
        return this.f89723e.getEntry();
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89721c == null) {
            this.f89721c = this.f89723e.getExpression();
        }
        return this.f89721c;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        return this.f89723e.getName();
    }

    @Override // vw.z4, vw.i2
    public String[] getNames() throws Exception {
        return this.f89720b.getNames();
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89723e.getOverride();
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return this.f89723e.getPath();
    }

    @Override // vw.z4, vw.i2
    public String[] getPaths() throws Exception {
        return this.f89720b.getPaths();
    }

    @Override // vw.z4, vw.i2
    public xw.f getType(Class cls) {
        return getContact();
    }

    @Override // vw.z4, vw.i2
    public boolean isCollection() {
        return this.f89723e.isCollection();
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f89723e.isData();
    }

    @Override // vw.z4, vw.i2
    public boolean isInline() {
        return this.f89723e.isInline();
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89723e.isRequired();
    }

    @Override // vw.z4, vw.i2
    public boolean isTextList() {
        return this.f89720b.isTextList();
    }

    @Override // vw.z4, vw.i2
    public boolean isUnion() {
        return true;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89723e.toString();
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89723e.getType();
    }

    @Override // vw.z4, vw.i2
    public i2 getLabel(Class cls) {
        return this;
    }
}
