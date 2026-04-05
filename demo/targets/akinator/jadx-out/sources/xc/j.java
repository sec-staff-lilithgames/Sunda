package xc;

import dd.k0;
import java.io.IOException;
import java.io.Serializable;
import tb.v0;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j extends s implements Serializable {
    public j(jc.o oVar, wc.h hVar, String str, boolean z10, jc.o oVar2) {
        super(oVar, hVar, str, z10, oVar2);
    }

    public final Object d(ub.u uVar, jc.k kVar) throws IOException {
        Object typeId;
        if (uVar.canReadTypeId() && (typeId = uVar.getTypeId()) != null) {
            return a(uVar, kVar, typeId);
        }
        z zVarCurrentToken = uVar.currentToken();
        z zVar = z.START_OBJECT;
        if (zVarCurrentToken == zVar) {
            z zVarNextToken = uVar.nextToken();
            z zVar2 = z.FIELD_NAME;
            if (zVarNextToken != zVar2) {
                kVar.reportWrongTokenException(baseType(), zVar2, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")", new Object[0]);
            }
        } else if (zVarCurrentToken != z.FIELD_NAME) {
            kVar.reportWrongTokenException(baseType(), zVar, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
        }
        String text = uVar.getText();
        jc.q qVarC = c(text, kVar);
        uVar.nextToken();
        if (this.f91930h && uVar.hasToken(zVar)) {
            k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
            k0VarBufferForInputBuffering.writeStartObject();
            k0VarBufferForInputBuffering.writeFieldName(this.f91929g);
            k0VarBufferForInputBuffering.writeString(text);
            uVar.clearCurrentToken();
            uVar = ic.o.createFlattened(false, k0VarBufferForInputBuffering.asParser(uVar), uVar);
            uVar.nextToken();
        }
        Object objDeserialize = qVarC.deserialize(uVar, kVar);
        z zVarNextToken2 = uVar.nextToken();
        z zVar3 = z.END_OBJECT;
        if (zVarNextToken2 != zVar3) {
            kVar.reportWrongTokenException(baseType(), zVar3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return objDeserialize;
    }

    @Override // wc.g
    public Object deserializeTypedFromAny(ub.u uVar, jc.k kVar) throws IOException {
        return d(uVar, kVar);
    }

    @Override // wc.g
    public Object deserializeTypedFromArray(ub.u uVar, jc.k kVar) throws IOException {
        return d(uVar, kVar);
    }

    @Override // wc.g
    public Object deserializeTypedFromObject(ub.u uVar, jc.k kVar) throws IOException {
        return d(uVar, kVar);
    }

    @Override // wc.g
    public Object deserializeTypedFromScalar(ub.u uVar, jc.k kVar) throws IOException {
        return d(uVar, kVar);
    }

    @Override // xc.s, wc.g
    public wc.g forProperty(jc.g gVar) {
        return gVar == this.f91927e ? this : new j(this, gVar);
    }

    @Override // xc.s, wc.g
    public v0 getTypeInclusion() {
        return v0.f86788c;
    }
}
