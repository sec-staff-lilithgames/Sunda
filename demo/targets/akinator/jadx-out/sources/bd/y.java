package bd;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class y extends x {
    public y(Class<?> cls) {
        super(cls, ub.s.f88353g, "number");
    }

    @Deprecated
    public static boolean notFinite(double d10) {
        return cc.n.notFinite(d10);
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeNumber(((Double) obj).doubleValue());
    }

    @Override // bd.y0, jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        Double d10 = (Double) obj;
        if (!cc.n.notFinite(d10.doubleValue())) {
            oVar.writeNumber(d10.doubleValue());
            return;
        }
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(obj, ub.z.VALUE_NUMBER_FLOAT));
        oVar.writeNumber(d10.doubleValue());
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
