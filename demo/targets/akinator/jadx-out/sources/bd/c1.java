package bd;

import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c1 extends z0 {
    public c1(Class<?> cls) {
        super(cls, 0);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectObjectFormat(oVar);
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) throws jc.r {
        return null;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Object obj) {
        return true;
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeStartObject(obj, 0);
        oVar.writeEndObject();
    }

    @Override // jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        jVar.writeTypeSuffix(oVar, jVar.writeTypePrefix(oVar, jVar.typeId(obj, ub.z.START_OBJECT)));
    }

    public c1(jc.o oVar) {
        super(oVar);
    }
}
