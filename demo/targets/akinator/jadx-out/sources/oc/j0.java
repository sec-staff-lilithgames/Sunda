package oc;

import dd.d;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 extends o0 {
    public j0() {
        super(double[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
        return dArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new double[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) {
        return new double[]{B(uVar, kVar)};
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return new j0(this, vVar, bool);
    }

    @Override // jc.q
    public double[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        mc.v vVar;
        if (!uVar.isExpectedStartArrayToken()) {
            return (double[]) X(uVar, kVar);
        }
        d.c doubleBuilder = kVar.getArrayBuilders().getDoubleBuilder();
        double[] dArr = (double[]) doubleBuilder.resetAndStart();
        int i10 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return (double[]) doubleBuilder.completeAndClearBuffer(dArr, i10);
                }
                if (zVarNextToken != ub.z.VALUE_NULL || (vVar = this.f78926h) == null) {
                    double dB = B(uVar, kVar);
                    if (i10 >= dArr.length) {
                        double[] dArr2 = (double[]) doubleBuilder.appendCompletedChunk(dArr, i10);
                        i10 = 0;
                        dArr = dArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        dArr[i10] = dB;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw jc.r.wrapWithPath(e, dArr, doubleBuilder.bufferedSize() + i10);
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
