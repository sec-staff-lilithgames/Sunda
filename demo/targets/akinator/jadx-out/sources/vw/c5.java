package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c5 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final f2 f89725b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f89726c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f89727d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f89728e;

    /* renamed from: f, reason: collision with root package name */
    public final String f89729f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f89730g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f89731h;

    public c5(i0 i0Var, uw.q qVar, yw.j jVar) {
        this.f89725b = new f2(i0Var, this, jVar);
        this.f89730g = qVar.required();
        this.f89728e = i0Var.getType();
        this.f89729f = qVar.empty();
        this.f89731h = qVar.data();
        this.f89727d = i0Var;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return null;
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89727d;
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        String empty = getEmpty(l0Var);
        i0 contact = getContact();
        if (l0Var.isPrimitive(contact)) {
            return new s3(l0Var, contact, empty);
        }
        throw new b5("Cannot use %s to represent %s", contact, null);
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return null;
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89726c == null) {
            this.f89726c = this.f89725b.getExpression();
        }
        return this.f89726c;
    }

    @Override // vw.z4, vw.i2
    public String getName() {
        return "";
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89727d.toString();
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return getExpression().getPath();
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89728e;
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f89731h;
    }

    @Override // vw.z4, vw.i2
    public boolean isInline() {
        return true;
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89730g;
    }

    @Override // vw.z4, vw.i2
    public boolean isText() {
        return true;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89725b.toString();
    }

    @Override // vw.z4, vw.i2
    public String getEmpty(l0 l0Var) {
        f2 f2Var = this.f89725b;
        String str = this.f89729f;
        if (f2Var.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
