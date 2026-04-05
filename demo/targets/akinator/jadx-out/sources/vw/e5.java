package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e5 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f89781b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f89782c;

    public e5(i2 i2Var, uw.q qVar) {
        this.f89781b = qVar.empty();
        this.f89782c = i2Var;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return this.f89782c.getAnnotation();
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89782c.getContact();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        i0 contact = getContact();
        i2 i2Var = this.f89782c;
        if (i2Var.isCollection()) {
            return new d5(l0Var, contact, i2Var);
        }
        throw new b5("Cannot use %s to represent %s", contact, i2Var);
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return null;
    }

    @Override // vw.z4, vw.i2
    public xw.f getDependent() throws Exception {
        return this.f89782c.getDependent();
    }

    @Override // vw.z4, vw.i2
    public String getEntry() throws Exception {
        return this.f89782c.getEntry();
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        return this.f89782c.getExpression();
    }

    @Override // vw.z4, vw.i2
    public Object getKey() throws Exception {
        return this.f89782c.getKey();
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        return this.f89782c.getName();
    }

    @Override // vw.z4, vw.i2
    public String[] getNames() throws Exception {
        return this.f89782c.getNames();
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89782c.getOverride();
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return this.f89782c.getPath();
    }

    @Override // vw.z4, vw.i2
    public String[] getPaths() throws Exception {
        return this.f89782c.getPaths();
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89782c.getType();
    }

    @Override // vw.z4, vw.i2
    public boolean isCollection() {
        return true;
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f89782c.isData();
    }

    @Override // vw.z4, vw.i2
    public boolean isInline() {
        return this.f89782c.isInline();
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89782c.isRequired();
    }

    @Override // vw.z4, vw.i2
    public boolean isTextList() {
        return true;
    }

    @Override // vw.i2
    public String toString() {
        return String.format("%s %s", null, this.f89782c);
    }

    @Override // vw.z4, vw.i2
    public String getEmpty(l0 l0Var) throws Exception {
        return this.f89781b;
    }
}
