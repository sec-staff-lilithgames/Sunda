package qc;

import bd.y0;
import java.io.IOException;
import java.nio.file.Path;
import jc.u0;
import ub.o;
import ub.z;
import wc.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f extends y0 {
    public f() {
        super(pe.a.c());
    }

    @Override // bd.z0, jc.w
    public /* bridge */ /* synthetic */ void serialize(Object obj, o oVar, u0 u0Var) throws IOException {
        serialize(cf.a.d(obj), oVar, u0Var);
    }

    @Override // bd.y0, jc.w
    public /* bridge */ /* synthetic */ void serializeWithType(Object obj, o oVar, u0 u0Var, j jVar) throws IOException {
        serializeWithType(cf.a.d(obj), oVar, u0Var, jVar);
    }

    public void serialize(Path path, o oVar, u0 u0Var) throws IOException {
        oVar.writeString(path.toUri().toString());
    }

    public void serializeWithType(Path path, o oVar, u0 u0Var, j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(path, pe.a.c(), z.VALUE_STRING));
        serialize(path, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
