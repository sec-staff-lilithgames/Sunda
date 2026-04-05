package bd;

import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f1 extends z0 {
    public f1() {
        super(dd.k0.class);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectAnyFormat(oVar);
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("any");
    }

    @Override // bd.z0, jc.w
    public void serialize(dd.k0 k0Var, ub.o oVar, jc.u0 u0Var) throws IOException {
        k0Var.serialize(oVar);
    }

    @Override // jc.w
    public final void serializeWithType(dd.k0 k0Var, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(k0Var, ub.z.VALUE_EMBEDDED_OBJECT));
        serialize(k0Var, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
