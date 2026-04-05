package xc;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import dd.k0;
import java.io.IOException;
import java.io.Serializable;
import tb.v0;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends s implements Serializable {
    public a(jc.o oVar, wc.h hVar, String str, boolean z10, jc.o oVar2) {
        super(oVar, hVar, str, z10, oVar2);
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
        return gVar == this.f91927e ? this : new a(this, gVar);
    }

    @Override // xc.s, wc.g
    public v0 getTypeInclusion() {
        return v0.f86789e;
    }

    public a(a aVar, jc.g gVar) {
        super(aVar, gVar);
    }

    public final Object d(ub.u uVar, jc.k kVar) throws IOException {
        Object typeId;
        if (uVar.canReadTypeId() && (typeId = uVar.getTypeId()) != null) {
            return a(uVar, kVar, typeId);
        }
        boolean zIsExpectedStartArrayToken = uVar.isExpectedStartArrayToken();
        String text = null;
        if (!uVar.isExpectedStartArrayToken()) {
            if (this.f91928f != null) {
                wc.h hVar = this.f91925b;
                text = hVar.idFromBaseType();
                if (text == null) {
                    kVar.reportBadDefinition(hVar.getClass(), "`idFromBaseType()` (of " + dd.i.classNameOf(hVar) + ") returned `null`");
                }
            } else {
                kVar.reportWrongTokenException(baseType(), z.START_ARRAY, "need Array value to contain `As.WRAPPER_ARRAY` type information for class " + baseTypeName(), new Object[0]);
            }
        } else {
            z zVarNextToken = uVar.nextToken();
            z zVar = z.VALUE_STRING;
            if (zVarNextToken != zVar && (zVarNextToken == null || !zVarNextToken.isScalarValue())) {
                kVar.reportWrongTokenException(baseType(), zVar, "need String, Number of Boolean value that contains type id (for subtype of %s)", baseTypeName());
            } else {
                text = uVar.getText();
                uVar.nextToken();
            }
        }
        jc.q qVarC = c(text, kVar);
        if (this.f91930h && !(this instanceof f) && uVar.hasToken(z.START_OBJECT)) {
            k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
            k0VarBufferForInputBuffering.writeStartObject();
            k0VarBufferForInputBuffering.writeFieldName(this.f91929g);
            k0VarBufferForInputBuffering.writeString(text);
            uVar.clearCurrentToken();
            uVar = ic.o.createFlattened(false, k0VarBufferForInputBuffering.asParser(uVar), uVar);
            uVar.nextToken();
        }
        if (zIsExpectedStartArrayToken && uVar.currentToken() == z.END_ARRAY) {
            return qVarC.getNullValue(kVar);
        }
        Object objDeserialize = qVarC.deserialize(uVar, kVar);
        if (zIsExpectedStartArrayToken) {
            z zVarNextToken2 = uVar.nextToken();
            z zVar2 = z.END_ARRAY;
            if (zVarNextToken2 != zVar2) {
                kVar.reportWrongTokenException(baseType(), zVar2, wHkgq.DtsG, new Object[0]);
            }
        }
        return objDeserialize;
    }
}
