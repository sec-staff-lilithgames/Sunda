package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s4 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final x4 f90092a;

    /* renamed from: b, reason: collision with root package name */
    public final xw.d f90093b;

    /* renamed from: c, reason: collision with root package name */
    public final v4 f90094c;

    /* renamed from: d, reason: collision with root package name */
    public final l4 f90095d;

    public s4(xw.d dVar, v4 v4Var, l4 l4Var) {
        this.f90092a = new x4(new y4(this, v4Var));
        this.f90093b = dVar;
        this.f90094c = v4Var;
        this.f90095d = l4Var;
    }

    @Override // vw.l0
    public Object getAttribute(Object obj) {
        return this.f90095d.get(obj);
    }

    @Override // vw.l0
    public j getCaller(Class cls) throws Exception {
        return this.f90094c.getScanner(cls).getCaller(this);
    }

    @Override // vw.l0
    public q0 getDecorator(Class cls) throws Exception {
        return this.f90094c.getScanner(cls).getDecorator();
    }

    @Override // vw.l0
    public a2 getInstance(Class cls) {
        return this.f90094c.getInstance(cls);
    }

    @Override // vw.l0
    public String getName(Class cls) throws Exception {
        return this.f90094c.getName(cls);
    }

    @Override // vw.l0
    public xw.g getOverride(xw.f fVar, yw.p pVar) throws Exception {
        yw.z attributes = pVar.getAttributes();
        if (attributes != null) {
            return this.f90093b.read(fVar, attributes, this.f90095d);
        }
        throw new p3("No attributes for %s", pVar);
    }

    @Override // vw.l0
    public String getProperty(String str) {
        return this.f90092a.process(str);
    }

    @Override // vw.l0
    public j4 getSchema(Class cls) throws Exception {
        h4 scanner = this.f90094c.getScanner(cls);
        if (scanner != null) {
            return new m(scanner, this);
        }
        throw new p3("Invalid schema class %s", cls);
    }

    @Override // vw.l0
    public l4 getSession() {
        return this.f90095d;
    }

    @Override // vw.l0
    public yw.t0 getStyle() {
        return this.f90094c.getStyle();
    }

    @Override // vw.l0
    public v4 getSupport() {
        return this.f90094c;
    }

    @Override // vw.l0
    public Class getType(xw.f fVar, Object obj) {
        return obj != null ? obj.getClass() : fVar.getType();
    }

    @Override // vw.l0
    public uw.s getVersion(Class cls) throws Exception {
        return this.f90094c.getScanner(cls).getRevision();
    }

    @Override // vw.l0
    public boolean isFloat(Class cls) throws Exception {
        return v4.isFloat(cls);
    }

    @Override // vw.l0
    public boolean isPrimitive(Class cls) throws Exception {
        return this.f90094c.isPrimitive(cls);
    }

    @Override // vw.l0
    public boolean isStrict() {
        return this.f90095d.isStrict();
    }

    @Override // vw.l0
    public boolean setOverride(xw.f fVar, Object obj, yw.h0 h0Var) throws Exception {
        yw.z attributes = h0Var.getAttributes();
        if (attributes != null) {
            return this.f90093b.write(fVar, obj, attributes, this.f90095d);
        }
        throw new p3("No attributes for %s", h0Var);
    }

    @Override // vw.l0
    public a2 getInstance(xw.g gVar) {
        return this.f90094c.getInstance(gVar);
    }

    @Override // vw.l0
    public boolean isFloat(xw.f fVar) throws Exception {
        return isFloat(fVar.getType());
    }

    @Override // vw.l0
    public boolean isPrimitive(xw.f fVar) throws Exception {
        return isPrimitive(fVar.getType());
    }
}
