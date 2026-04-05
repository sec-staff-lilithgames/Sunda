package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f90235a;

    /* renamed from: b, reason: collision with root package name */
    public final yw.j f90236b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f90237c;

    public y2(p1 p1Var, t0 t0Var, v4 v4Var) throws Exception {
        this.f90236b = v4Var.getFormat();
        this.f90235a = p1Var;
        this.f90237c = t0Var;
    }

    public final void a(x2 x2Var, o1 o1Var) throws Exception {
        String prefix = o1Var.getPrefix();
        String first = o1Var.getFirst();
        int index = o1Var.getIndex();
        if (!o1Var.isPath()) {
            String first2 = o1Var.getFirst();
            if (first2 != null) {
                x2Var.registerAttribute(first2);
                return;
            }
            return;
        }
        x2 x2VarRegister = x2Var.register(first, prefix, index);
        o1 path = o1Var.getPath(1);
        if (x2VarRegister == null) {
            throw new m3("Element '%s' does not exist in %s", first, this.f90237c);
        }
        a(x2VarRegister, path);
    }

    public void assemble(x2 x2Var, uw.m mVar) throws Exception {
        String[] strArrElements = mVar.elements();
        int length = strArrElements.length;
        int i10 = 0;
        while (true) {
            t0 t0Var = this.f90237c;
            p1 p1Var = this.f90235a;
            if (i10 >= length) {
                for (String str : mVar.attributes()) {
                    o1 o1VarBuild = p1Var.build(str);
                    if (!o1VarBuild.isAttribute() && o1VarBuild.isPath()) {
                        throw new m3("Ordered attribute '%s' references an element in %s", o1VarBuild, t0Var);
                    }
                    if (o1VarBuild.isPath()) {
                        a(x2Var, o1VarBuild);
                    } else {
                        x2Var.registerAttribute(((yw.l) this.f90236b.getStyle()).getAttribute(str));
                    }
                }
                return;
            }
            o1 o1VarBuild2 = p1Var.build(strArrElements[i10]);
            if (o1VarBuild2.isAttribute()) {
                throw new m3("Ordered element '%s' references an attribute in %s", o1VarBuild2, t0Var);
            }
            b(x2Var, o1VarBuild2);
            i10++;
        }
    }

    public final void b(x2 x2Var, o1 o1Var) throws Exception {
        String prefix = o1Var.getPrefix();
        String first = o1Var.getFirst();
        int index = o1Var.getIndex();
        if (first != null) {
            x2 x2VarRegister = x2Var.register(first, prefix, index);
            o1 path = o1Var.getPath(1);
            if (o1Var.isPath()) {
                b(x2VarRegister, path);
            }
        }
        String prefix2 = o1Var.getPrefix();
        String first2 = o1Var.getFirst();
        int index2 = o1Var.getIndex();
        if (index2 > 1 && x2Var.lookup(first2, index2 - 1) == null) {
            throw new m3("Ordered element '%s' in path '%s' is out of sequence for %s", first2, o1Var, this.f90237c);
        }
        x2Var.register(first2, prefix2, index2);
    }
}
