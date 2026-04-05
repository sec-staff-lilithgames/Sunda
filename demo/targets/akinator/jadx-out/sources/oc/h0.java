package oc;

import dd.d;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 extends o0 {
    public h0() {
        super(byte[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new byte[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) throws IOException {
        byte bByteValue;
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == ub.z.VALUE_NUMBER_INT) {
            bByteValue = uVar.getByteValue();
        } else {
            if (zVarCurrentToken == ub.z.VALUE_NULL) {
                mc.v vVar = this.f78926h;
                if (vVar != null) {
                    vVar.getNullValue(kVar);
                    return (byte[]) getEmptyValue(kVar);
                }
                N(kVar);
                return null;
            }
            bByteValue = ((Number) kVar.handleUnexpectedToken(this.f78945b.getComponentType(), uVar)).byteValue();
        }
        return new byte[]{bByteValue};
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return new h0(this, vVar, bool);
    }

    @Override // oc.o0, jc.q
    public cd.h logicalType() {
        return cd.h.f12149m;
    }

    @Override // jc.q
    public byte[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        byte byteValue;
        int i10;
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == ub.z.VALUE_STRING) {
            try {
                return uVar.getBinaryValue(kVar.getBase64Variant());
            } catch (jc.i | xb.c e10) {
                String originalMessage = e10.getOriginalMessage();
                if (originalMessage.contains("base64")) {
                    return (byte[]) kVar.handleWeirdStringValue(byte[].class, uVar.getText(), originalMessage, new Object[0]);
                }
            }
        }
        if (zVarCurrentToken == ub.z.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = uVar.getEmbeddedObject();
            if (embeddedObject == null) {
                return null;
            }
            if (embeddedObject instanceof byte[]) {
                return (byte[]) embeddedObject;
            }
        }
        if (!uVar.isExpectedStartArrayToken()) {
            return (byte[]) X(uVar, kVar);
        }
        d.b byteBuilder = kVar.getArrayBuilders().getByteBuilder();
        byte[] bArr = (byte[]) byteBuilder.resetAndStart();
        int i11 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return (byte[]) byteBuilder.completeAndClearBuffer(bArr, i11);
                }
                try {
                    if (zVarNextToken == ub.z.VALUE_NUMBER_INT) {
                        byteValue = uVar.getByteValue();
                    } else if (zVarNextToken == ub.z.VALUE_NULL) {
                        mc.v vVar = this.f78926h;
                        if (vVar != null) {
                            vVar.getNullValue(kVar);
                        } else {
                            N(kVar);
                            byteValue = 0;
                        }
                    } else {
                        byteValue = z(uVar, kVar);
                    }
                    bArr[i11] = byteValue;
                    i11 = i10;
                } catch (Exception e11) {
                    e = e11;
                    i11 = i10;
                    throw jc.r.wrapWithPath(e, bArr, byteBuilder.bufferedSize() + i11);
                }
                if (i11 >= bArr.length) {
                    byte[] bArr2 = (byte[]) byteBuilder.appendCompletedChunk(bArr, i11);
                    i11 = 0;
                    bArr = bArr2;
                }
                i10 = i11 + 1;
            } catch (Exception e12) {
                e = e12;
            }
        }
    }
}
