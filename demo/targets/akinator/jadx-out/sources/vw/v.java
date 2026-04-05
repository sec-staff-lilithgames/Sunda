package vw;

import vw.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v extends u.a {
    @Override // vw.u.a
    public Object read(yw.p pVar) throws Exception {
        j4 j4Var = this.f90121c;
        k4 section = j4Var.getSection();
        u uVar = this.f90119a;
        uVar.e(pVar, null, j4Var);
        i2 text = section.getText();
        if (text != null) {
            uVar.c(pVar, null, text);
        }
        uVar.a(pVar, null, section);
        uVar.b(pVar, null, section);
        d2 instantiator = j4Var.getInstantiator();
        p0 p0Var = this.f90120b;
        Object d2Var = instantiator.getInstance(p0Var);
        this.f90122d.setInstance(d2Var);
        p0Var.commit(d2Var);
        return d2Var;
    }
}
