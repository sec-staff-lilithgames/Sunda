package bd;

import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f extends z0 {
    public f() {
        super(byte[].class);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectArrayFormat(oVar);
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("array").set("items", z0.a("byte"));
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // bd.z0, jc.w
    public void serialize(byte[] bArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeBinary(u0Var.getConfig().getBase64Variant(), bArr, 0, bArr.length);
    }

    @Override // jc.w
    public void serializeWithType(byte[] bArr, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(bArr, ub.z.VALUE_EMBEDDED_OBJECT));
        oVar.writeBinary(u0Var.getConfig().getBase64Variant(), bArr, 0, bArr.length);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
