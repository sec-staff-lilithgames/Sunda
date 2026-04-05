package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class z implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f90244a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f90245b;

    /* renamed from: c, reason: collision with root package name */
    public final yw.t0 f90246c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f90247d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f90248e;

    public z(l0 l0Var, n1 n1Var, xw.f fVar) throws Exception {
        this.f90245b = new g5(l0Var);
        this.f90246c = l0Var.getStyle();
        this.f90244a = l0Var;
        this.f90247d = n1Var;
        this.f90248e = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        yw.k0 position = pVar.getPosition();
        xw.f fVar = this.f90248e;
        Class type = fVar.getType();
        n1 n1Var = this.f90247d;
        String key = n1Var.getKey();
        if (key == null) {
            key = this.f90244a.getName(type);
        }
        if (n1Var.isAttribute()) {
            throw new e("Can not have %s as an attribute for %s at %s", type, n1Var, position);
        }
        String element = ((yw.l) this.f90246c).getElement(key);
        Class type2 = fVar.getType();
        if (element != null) {
            pVar = pVar.getNext(element);
        }
        if (pVar == null || pVar.isEmpty()) {
            return null;
        }
        return this.f90245b.read(pVar, type2);
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        yw.k0 position = pVar.getPosition();
        xw.f fVar = this.f90248e;
        Class type = fVar.getType();
        n1 n1Var = this.f90247d;
        String key = n1Var.getKey();
        if (key == null) {
            key = this.f90244a.getName(type);
        }
        if (n1Var.isAttribute()) {
            throw new y0("Can not have %s as an attribute for %s at %s", type, n1Var, position);
        }
        yw.p next = pVar.getNext(((yw.l) this.f90246c).getElement(key));
        Class type2 = fVar.getType();
        if (next == null || next.isEmpty()) {
            return true;
        }
        return this.f90245b.validate(next, type2);
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        Class type = this.f90248e.getType();
        n1 n1Var = this.f90247d;
        String key = n1Var.getKey();
        if (n1Var.isAttribute()) {
            throw new y0("Can not have %s as an attribute for %s", type, n1Var);
        }
        if (key == null) {
            key = this.f90244a.getName(type);
        }
        this.f90245b.write(h0Var, obj, type, ((yw.l) this.f90246c).getElement(key));
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        yw.k0 position = pVar.getPosition();
        Class type = this.f90248e.getType();
        if (obj == null) {
            return read(pVar);
        }
        throw new p3("Can not read key of %s for %s at %s", type, this.f90247d, position);
    }
}
