package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w3 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final u3 f90194a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f90195b;

    /* renamed from: c, reason: collision with root package name */
    public final s3 f90196c;

    /* renamed from: d, reason: collision with root package name */
    public final yw.t0 f90197d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f90198e;

    /* renamed from: f, reason: collision with root package name */
    public final xw.f f90199f;

    public w3(l0 l0Var, n1 n1Var, xw.f fVar) {
        this.f90194a = new u3(l0Var, fVar);
        this.f90196c = new s3(l0Var, fVar);
        this.f90197d = l0Var.getStyle();
        this.f90195b = l0Var;
        this.f90198e = n1Var;
        this.f90199f = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        Class type = this.f90199f.getType();
        n1 n1Var = this.f90198e;
        String key = n1Var.getKey();
        if (key == null) {
            key = this.f90195b.getName(type);
        }
        boolean zIsAttribute = n1Var.isAttribute();
        s3 s3Var = this.f90196c;
        yw.t0 t0Var = this.f90197d;
        if (zIsAttribute) {
            yw.p attribute = pVar.getAttribute(((yw.l) t0Var).getAttribute(key));
            if (attribute == null) {
                return null;
            }
            return s3Var.read(attribute);
        }
        yw.p next = pVar.getNext(((yw.l) t0Var).getElement(key));
        if (next == null) {
            return null;
        }
        return s3Var.read(next);
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        Class type = this.f90199f.getType();
        n1 n1Var = this.f90198e;
        String key = n1Var.getKey();
        if (key == null) {
            key = this.f90195b.getName(type);
        }
        boolean zIsAttribute = n1Var.isAttribute();
        s3 s3Var = this.f90196c;
        yw.t0 t0Var = this.f90197d;
        if (zIsAttribute) {
            yw.p attribute = pVar.getAttribute(((yw.l) t0Var).getElement(key));
            if (attribute == null) {
                return true;
            }
            return s3Var.validate(attribute);
        }
        yw.p next = pVar.getNext(((yw.l) t0Var).getElement(key));
        if (next == null) {
            return true;
        }
        return s3Var.validate(next);
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        n1 n1Var = this.f90198e;
        boolean zIsAttribute = n1Var.isAttribute();
        u3 u3Var = this.f90194a;
        yw.t0 t0Var = this.f90197d;
        l0 l0Var = this.f90195b;
        xw.f fVar = this.f90199f;
        if (!zIsAttribute) {
            Class type = fVar.getType();
            String key = n1Var.getKey();
            if (key == null) {
                key = l0Var.getName(type);
            }
            yw.h0 child = h0Var.getChild(((yw.l) t0Var).getElement(key));
            if (obj == null || u3Var.setOverride(fVar, obj, child)) {
                return;
            }
            this.f90196c.write(child, obj);
            return;
        }
        if (obj != null) {
            Class type2 = fVar.getType();
            String text = u3Var.getText(obj);
            String key2 = n1Var.getKey();
            if (key2 == null) {
                key2 = l0Var.getName(type2);
            }
            String attribute = ((yw.l) t0Var).getAttribute(key2);
            if (text != null) {
                h0Var.setAttribute(attribute, text);
            }
        }
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        Class type = this.f90199f.getType();
        if (obj == null) {
            return read(pVar);
        }
        throw new p3("Can not read key of %s for %s", type, this.f90198e);
    }
}
