package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w0 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final a4 f90177b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f90178c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f90179d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.j f90180e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f90181f;

    /* renamed from: g, reason: collision with root package name */
    public String f90182g;

    /* renamed from: h, reason: collision with root package name */
    public final String f90183h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90184i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f90185j;

    public w0(i0 i0Var, uw.e eVar, yw.j jVar) {
        this.f90178c = new f2(i0Var, this, jVar);
        this.f90177b = new a4(i0Var);
        this.f90184i = eVar.required();
        this.f90181f = i0Var.getType();
        this.f90182g = eVar.entry();
        this.f90185j = eVar.data();
        this.f90183h = eVar.name();
        this.f90180e = jVar;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return null;
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f90178c.getContact();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        i0 contact = getContact();
        String entry = getEntry();
        Class cls = this.f90181f;
        if (!cls.isArray()) {
            throw new c2("Type is not an array %s for %s", cls, contact);
        }
        xw.f dependent = getDependent();
        i0 contact2 = getContact();
        return !l0Var.isPrimitive(dependent) ? new w(l0Var, contact2, dependent, entry) : new t3(l0Var, contact2, dependent, entry);
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f90177b;
    }

    @Override // vw.z4, vw.i2
    public xw.f getDependent() {
        Class cls = this.f90181f;
        Class<?> componentType = cls.getComponentType();
        return componentType == null ? new n(cls) : new n(componentType);
    }

    @Override // vw.z4, vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        new c(l0Var, new n(this.f90181f));
        throw null;
    }

    @Override // vw.z4, vw.i2
    public String getEntry() throws Exception {
        yw.t0 style = this.f90180e.getStyle();
        String str = this.f90182g;
        f2 f2Var = this.f90178c;
        if (f2Var.isEmpty(str)) {
            this.f90182g = f2Var.getEntry();
        }
        return ((yw.l) style).getElement(this.f90182g);
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f90179d == null) {
            this.f90179d = this.f90178c.getExpression();
        }
        return this.f90179d;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        return ((yw.l) this.f90180e.getStyle()).getElement(this.f90178c.getName());
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f90183h;
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return getExpression().getElement(getName());
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f90181f;
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f90185j;
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f90184i;
    }

    @Override // vw.i2
    public String toString() {
        return this.f90178c.toString();
    }
}
