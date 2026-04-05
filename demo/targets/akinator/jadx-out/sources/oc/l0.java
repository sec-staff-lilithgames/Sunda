package oc;

import dd.d;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 extends o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final l0 f78883i = new l0();

    public l0() {
        super(int[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new int[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) {
        return new int[]{E(uVar, kVar)};
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return new l0(this, vVar, bool);
    }

    @Override // jc.q
    public int[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        int intValue;
        int i10;
        if (!uVar.isExpectedStartArrayToken()) {
            return (int[]) X(uVar, kVar);
        }
        d.e intBuilder = kVar.getArrayBuilders().getIntBuilder();
        int[] iArr = (int[]) intBuilder.resetAndStart();
        int i11 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return (int[]) intBuilder.completeAndClearBuffer(iArr, i11);
                }
                try {
                    if (zVarNextToken == ub.z.VALUE_NUMBER_INT) {
                        intValue = uVar.getIntValue();
                    } else if (zVarNextToken == ub.z.VALUE_NULL) {
                        mc.v vVar = this.f78926h;
                        if (vVar != null) {
                            vVar.getNullValue(kVar);
                        } else {
                            N(kVar);
                            intValue = 0;
                        }
                    } else {
                        intValue = E(uVar, kVar);
                    }
                    iArr[i11] = intValue;
                    i11 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    throw jc.r.wrapWithPath(e, iArr, intBuilder.bufferedSize() + i11);
                }
                if (i11 >= iArr.length) {
                    int[] iArr2 = (int[]) intBuilder.appendCompletedChunk(iArr, i11);
                    i11 = 0;
                    iArr = iArr2;
                }
                i10 = i11 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }
}
