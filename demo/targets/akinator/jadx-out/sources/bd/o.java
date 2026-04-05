package bd;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o extends y0 {
    public o() {
        super(File.class);
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectStringFormat(oVar);
    }

    @Override // bd.y0, bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("string");
    }

    @Override // bd.z0, jc.w
    public void serialize(File file, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeString(file.getAbsolutePath());
    }
}
