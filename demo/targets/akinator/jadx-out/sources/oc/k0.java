package oc;

import dd.d;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 extends o0 {
    public k0() {
        super(float[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        return fArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new float[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) {
        return new float[]{C(uVar, kVar)};
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return new k0(this, vVar, bool);
    }

    @Override // jc.q
    public float[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        mc.v vVar;
        if (!uVar.isExpectedStartArrayToken()) {
            return (float[]) X(uVar, kVar);
        }
        d.C0555d floatBuilder = kVar.getArrayBuilders().getFloatBuilder();
        float[] fArr = (float[]) floatBuilder.resetAndStart();
        int i10 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return (float[]) floatBuilder.completeAndClearBuffer(fArr, i10);
                }
                if (zVarNextToken != ub.z.VALUE_NULL || (vVar = this.f78926h) == null) {
                    float fC = C(uVar, kVar);
                    if (i10 >= fArr.length) {
                        float[] fArr2 = (float[]) floatBuilder.appendCompletedChunk(fArr, i10);
                        i10 = 0;
                        fArr = fArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        fArr[i10] = fC;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw jc.r.wrapWithPath(e, fArr, floatBuilder.bufferedSize() + i10);
                    }
                } else {
                    vVar.getNullValue(kVar);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
    }
}
