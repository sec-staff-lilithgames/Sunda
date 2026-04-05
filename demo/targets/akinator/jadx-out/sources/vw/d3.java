package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d3 extends u3 {
    public d3(l0 l0Var, xw.f fVar, Class cls) {
        super(l0Var, fVar, cls);
    }

    @Override // vw.u3
    public a2 getInstance(yw.p pVar) throws Exception {
        xw.g gVarA = a(pVar);
        Class type = getType();
        l0 l0Var = this.f90083a;
        if (gVarA != null) {
            return new e3(l0Var, gVarA);
        }
        if (s1.isInstantiable(type)) {
            return l0Var.getInstance(type);
        }
        throw new c2("Cannot instantiate %s for %s", type, this.f90086d);
    }
}
