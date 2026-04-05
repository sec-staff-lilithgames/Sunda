package bd;

import java.io.IOException;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b1 extends y0 {
    public b1() {
        super(TimeZone.class);
    }

    @Override // bd.z0, jc.w
    public void serialize(TimeZone timeZone, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeString(timeZone.getID());
    }

    @Override // bd.y0, jc.w
    public void serializeWithType(TimeZone timeZone, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(timeZone, TimeZone.class, ub.z.VALUE_STRING));
        serialize(timeZone, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
