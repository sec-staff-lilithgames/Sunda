package oc;

import dd.d;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 extends o0 {
    public n0() {
        super(short[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        short[] sArr = (short[]) obj;
        short[] sArr2 = (short[]) obj2;
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
        return sArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new short[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) {
        return new short[]{J(uVar, kVar)};
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return new n0(this, vVar, bool);
    }

    @Override // jc.q
    public short[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        short sJ;
        int i10;
        if (!uVar.isExpectedStartArrayToken()) {
            return (short[]) X(uVar, kVar);
        }
        d.g shortBuilder = kVar.getArrayBuilders().getShortBuilder();
        short[] sArr = (short[]) shortBuilder.resetAndStart();
        int i11 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return (short[]) shortBuilder.completeAndClearBuffer(sArr, i11);
                }
                try {
                    if (zVarNextToken == ub.z.VALUE_NULL) {
                        mc.v vVar = this.f78926h;
                        if (vVar != null) {
                            vVar.getNullValue(kVar);
                        } else {
                            N(kVar);
                            sJ = 0;
                        }
                    } else {
                        sJ = J(uVar, kVar);
                    }
                    sArr[i11] = sJ;
                    i11 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    throw jc.r.wrapWithPath(e, sArr, shortBuilder.bufferedSize() + i11);
                }
                if (i11 >= sArr.length) {
                    short[] sArr2 = (short[]) shortBuilder.appendCompletedChunk(sArr, i11);
                    i11 = 0;
                    sArr = sArr2;
                }
                i10 = i11 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }
}
