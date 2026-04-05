package oc;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 extends o0 {
    public i0() {
        super(char[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        char[] cArr = (char[]) obj;
        char[] cArr2 = (char[]) obj2;
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
        return cArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new char[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) {
        return (char[]) kVar.handleUnexpectedToken(this.f78945b, uVar);
    }

    @Override // jc.q
    public char[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        String text;
        if (uVar.hasToken(ub.z.VALUE_STRING)) {
            char[] textCharacters = uVar.getTextCharacters();
            int textOffset = uVar.getTextOffset();
            int textLength = uVar.getTextLength();
            char[] cArr = new char[textLength];
            System.arraycopy(textCharacters, textOffset, cArr, 0, textLength);
            return cArr;
        }
        if (!uVar.isExpectedStartArrayToken()) {
            if (uVar.hasToken(ub.z.VALUE_EMBEDDED_OBJECT)) {
                Object embeddedObject = uVar.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                if (embeddedObject instanceof char[]) {
                    return (char[]) embeddedObject;
                }
                if (embeddedObject instanceof String) {
                    return ((String) embeddedObject).toCharArray();
                }
                if (embeddedObject instanceof byte[]) {
                    return ub.c.getDefaultVariant().encode((byte[]) embeddedObject, false).toCharArray();
                }
            }
            return (char[]) kVar.handleUnexpectedToken(this.f78945b, uVar);
        }
        StringBuilder sb2 = new StringBuilder(64);
        while (true) {
            ub.z zVarNextToken = uVar.nextToken();
            if (zVarNextToken == ub.z.END_ARRAY) {
                return sb2.toString().toCharArray();
            }
            if (zVarNextToken == ub.z.VALUE_STRING) {
                text = uVar.getText();
            } else if (zVarNextToken == ub.z.VALUE_NULL) {
                mc.v vVar = this.f78926h;
                if (vVar != null) {
                    vVar.getNullValue(kVar);
                } else {
                    N(kVar);
                    text = "\u0000";
                }
            } else {
                text = ((CharSequence) kVar.handleUnexpectedToken(Character.TYPE, uVar)).toString();
            }
            if (text.length() != 1) {
                kVar.reportInputMismatch(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(text.length()));
            }
            sb2.append(text.charAt(0));
        }
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return this;
    }
}
