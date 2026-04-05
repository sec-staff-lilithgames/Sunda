package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f89791a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f89792b;

    /* renamed from: c, reason: collision with root package name */
    public final yw.t0 f89793c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f89794d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f89795e;

    public f0(l0 l0Var, n1 n1Var, xw.f fVar) throws Exception {
        this.f89792b = new g5(l0Var);
        this.f89793c = l0Var.getStyle();
        this.f89791a = l0Var;
        this.f89794d = n1Var;
        this.f89795e = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        yw.p next = pVar.getNext();
        Class type = this.f89795e.getType();
        if (next == null || next.isEmpty()) {
            return null;
        }
        return this.f89792b.read(next, type);
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        xw.f fVar = this.f89795e;
        Class type = fVar.getType();
        String value = this.f89794d.getValue();
        if (value == null) {
            value = this.f89791a.getName(type);
        }
        yw.p next = pVar.getNext(((yw.l) this.f89793c).getElement(value));
        Class type2 = fVar.getType();
        if (next == null || next.isEmpty()) {
            return true;
        }
        return this.f89792b.validate(next, type2);
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        Class type = this.f89795e.getType();
        String value = this.f89794d.getValue();
        if (value == null) {
            value = this.f89791a.getName(type);
        }
        this.f89792b.write(h0Var, obj, type, ((yw.l) this.f89793c).getElement(value));
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        Class type = this.f89795e.getType();
        if (obj == null) {
            return read(pVar);
        }
        throw new p3("Can not read value of %s for %s", type, this.f89794d);
    }
}
