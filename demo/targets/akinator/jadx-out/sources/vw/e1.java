package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e1 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final a4 f89756b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f89757c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f89758d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.j f89759e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f89760f;

    /* renamed from: g, reason: collision with root package name */
    public final String f89761g;

    /* renamed from: h, reason: collision with root package name */
    public String f89762h;

    /* renamed from: i, reason: collision with root package name */
    public String f89763i;

    /* renamed from: j, reason: collision with root package name */
    public String f89764j;

    /* renamed from: k, reason: collision with root package name */
    public Class[] f89765k;

    /* renamed from: l, reason: collision with root package name */
    public final Class f89766l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f89767m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f89768n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f89769o;

    public e1(i0 i0Var, uw.h hVar, yw.j jVar) {
        this.f89757c = new f2(i0Var, this, jVar);
        this.f89756b = new a4(i0Var);
        this.f89760f = new n1(i0Var, hVar);
        this.f89767m = hVar.required();
        this.f89766l = i0Var.getType();
        this.f89768n = hVar.inline();
        this.f89761g = hVar.name();
        this.f89769o = hVar.data();
        this.f89759e = jVar;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return null;
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89757c.getContact();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        new n(this.f89766l);
        throw null;
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89756b;
    }

    @Override // vw.z4, vw.i2
    public xw.f getDependent() throws Exception {
        i0 contact = getContact();
        if (this.f89765k == null) {
            this.f89765k = contact.getDependents();
        }
        Class[] clsArr = this.f89765k;
        if (clsArr != null) {
            return clsArr.length == 0 ? new n(Object.class) : new n(clsArr[0]);
        }
        throw new y0("Unable to determine type for %s", contact);
    }

    @Override // vw.z4, vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        new n2(l0Var, new n(this.f89766l));
        throw null;
    }

    @Override // vw.z4, vw.i2
    public String getEntry() throws Exception {
        yw.t0 style = this.f89759e.getStyle();
        String str = this.f89762h;
        f2 f2Var = this.f89757c;
        if (f2Var.isEmpty(str)) {
            this.f89762h = f2Var.getEntry();
        }
        return ((yw.l) style).getElement(this.f89762h);
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89758d == null) {
            this.f89758d = this.f89757c.getExpression();
        }
        return this.f89758d;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        if (this.f89764j != null) {
            return this.f89764j;
        }
        this.f89759e.getStyle();
        this.f89760f.getEntry();
        throw null;
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89761g;
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        if (this.f89763i == null) {
            this.f89763i = getExpression().getElement(getName());
        }
        return this.f89763i;
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89766l;
    }

    @Override // vw.z4, vw.i2
    public boolean isCollection() {
        return true;
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f89769o;
    }

    @Override // vw.z4, vw.i2
    public boolean isInline() {
        return this.f89768n;
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89767m;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89757c.toString();
    }
}
