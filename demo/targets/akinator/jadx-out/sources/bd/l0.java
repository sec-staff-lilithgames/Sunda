package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l0 extends z0 {
    public l0() {
        super(char[].class);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        HashMap map = uc.d.f88404b;
        hVar.expectArrayFormat(oVar);
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        yc.v vVarA = z0.a("array");
        yc.v vVarA2 = z0.a("string");
        vVarA2.put("type", "string");
        return vVarA.set("items", vVarA2);
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, char[] cArr) {
        return cArr.length == 0;
    }

    @Override // bd.z0, jc.w
    public void serialize(char[] cArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (!u0Var.isEnabled(jc.t0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            oVar.writeString(cArr, 0, cArr.length);
            return;
        }
        oVar.writeStartArray(cArr, cArr.length);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            oVar.writeString(cArr, i10, 1);
        }
        oVar.writeEndArray();
    }

    @Override // jc.w
    public void serializeWithType(char[] cArr, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix;
        if (u0Var.isEnabled(jc.t0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(cArr, ub.z.START_ARRAY));
            int length = cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                oVar.writeString(cArr, i10, 1);
            }
        } else {
            cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(cArr, ub.z.VALUE_STRING));
            oVar.writeString(cArr, 0, cArr.length);
        }
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
