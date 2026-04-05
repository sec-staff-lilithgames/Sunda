package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u3 extends s1 {
    public u3(l0 l0Var, xw.f fVar, Class cls) {
        super(l0Var, fVar, cls);
    }

    public a2 getInstance(yw.p pVar) throws Exception {
        xw.g gVarA = a(pVar);
        Class type = getType();
        l0 l0Var = this.f90083a;
        return gVarA == null ? l0Var.getInstance(type) : new e3(l0Var, gVarA);
    }

    public String getText(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        boolean zIsEnum = cls.isEnum();
        v4 v4Var = this.f90084b;
        return zIsEnum ? v4Var.write(obj, cls) : v4Var.write(obj, cls);
    }

    public u3(l0 l0Var, xw.f fVar) {
        super(l0Var, fVar, null);
    }

    public Object getInstance(String str, Class cls) throws Exception {
        return this.f90084b.read(str, cls);
    }
}
