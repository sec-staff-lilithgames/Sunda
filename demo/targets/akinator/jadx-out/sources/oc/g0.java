package oc;

import dd.d;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 extends o0 {
    public g0() {
        super(boolean[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        boolean[] zArr = (boolean[]) obj;
        boolean[] zArr2 = (boolean[]) obj2;
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        return zArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new boolean[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) {
        return new boolean[]{y(uVar, kVar)};
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return new g0(this, vVar, bool);
    }

    @Override // jc.q
    public boolean[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        boolean zY;
        int i10;
        if (!uVar.isExpectedStartArrayToken()) {
            return (boolean[]) X(uVar, kVar);
        }
        d.a booleanBuilder = kVar.getArrayBuilders().getBooleanBuilder();
        boolean[] zArr = (boolean[]) booleanBuilder.resetAndStart();
        int i11 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return (boolean[]) booleanBuilder.completeAndClearBuffer(zArr, i11);
                }
                try {
                    if (zVarNextToken == ub.z.VALUE_TRUE) {
                        zY = true;
                    } else {
                        if (zVarNextToken != ub.z.VALUE_FALSE) {
                            if (zVarNextToken == ub.z.VALUE_NULL) {
                                mc.v vVar = this.f78926h;
                                if (vVar != null) {
                                    vVar.getNullValue(kVar);
                                } else {
                                    N(kVar);
                                }
                            } else {
                                zY = y(uVar, kVar);
                            }
                        }
                        zY = false;
                    }
                    zArr[i11] = zY;
                    i11 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    throw jc.r.wrapWithPath(e, zArr, booleanBuilder.bufferedSize() + i11);
                }
                if (i11 >= zArr.length) {
                    boolean[] zArr2 = (boolean[]) booleanBuilder.appendCompletedChunk(zArr, i11);
                    i11 = 0;
                    zArr = zArr2;
                }
                i10 = i11 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }
}
