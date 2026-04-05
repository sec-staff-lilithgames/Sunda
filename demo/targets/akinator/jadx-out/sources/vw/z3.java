package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class z3 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final u3 f90265a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f90266b;

    /* renamed from: c, reason: collision with root package name */
    public final s3 f90267c;

    /* renamed from: d, reason: collision with root package name */
    public final yw.t0 f90268d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f90269e;

    /* renamed from: f, reason: collision with root package name */
    public final xw.f f90270f;

    public z3(l0 l0Var, n1 n1Var, xw.f fVar) {
        this.f90265a = new u3(l0Var, fVar);
        this.f90267c = new s3(l0Var, fVar);
        this.f90268d = l0Var.getStyle();
        this.f90266b = l0Var;
        this.f90269e = n1Var;
        this.f90270f = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        Class type = this.f90270f.getType();
        n1 n1Var = this.f90269e;
        String value = n1Var.getValue();
        boolean zIsInline = n1Var.isInline();
        s3 s3Var = this.f90267c;
        yw.t0 t0Var = this.f90268d;
        if (zIsInline) {
            if (value != null) {
                pVar = pVar.getAttribute(((yw.l) t0Var).getAttribute(value));
            }
            if (pVar == null) {
                return null;
            }
            return s3Var.read(pVar);
        }
        if (value == null) {
            value = this.f90266b.getName(type);
        }
        yw.p next = pVar.getNext(((yw.l) t0Var).getAttribute(value));
        if (next == null) {
            return null;
        }
        return s3Var.read(next);
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        Class type = this.f90270f.getType();
        n1 n1Var = this.f90269e;
        String value = n1Var.getValue();
        boolean zIsInline = n1Var.isInline();
        s3 s3Var = this.f90267c;
        yw.t0 t0Var = this.f90268d;
        if (zIsInline) {
            if (value != null) {
                pVar = pVar.getNext(((yw.l) t0Var).getAttribute(value));
            }
            if (pVar == null) {
                return true;
            }
            return s3Var.validate(pVar);
        }
        if (value == null) {
            value = this.f90266b.getName(type);
        }
        if (pVar.getNext(((yw.l) t0Var).getAttribute(value)) == null) {
            return true;
        }
        return s3Var.validate(pVar);
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        xw.f fVar = this.f90270f;
        Class type = fVar.getType();
        n1 n1Var = this.f90269e;
        String value = n1Var.getValue();
        boolean zIsInline = n1Var.isInline();
        s3 s3Var = this.f90267c;
        yw.t0 t0Var = this.f90268d;
        if (zIsInline) {
            if (obj != null) {
                if (value != null) {
                    h0Var = h0Var.setAttribute(((yw.l) t0Var).getAttribute(value), null);
                }
                s3Var.write(h0Var, obj);
                return;
            }
            return;
        }
        if (value == null) {
            value = this.f90266b.getName(type);
        }
        yw.h0 child = h0Var.getChild(((yw.l) t0Var).getAttribute(value));
        if (obj == null || this.f90265a.setOverride(fVar, obj, child)) {
            return;
        }
        s3Var.write(child, obj);
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        Class type = this.f90270f.getType();
        if (obj == null) {
            return read(pVar);
        }
        throw new p3("Can not read value of %s for %s", type, this.f90269e);
    }
}
