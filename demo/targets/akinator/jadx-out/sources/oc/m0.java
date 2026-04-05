package oc;

import dd.d;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 extends o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final m0 f78902i = new m0();

    public m0() {
        super(long[].class);
    }

    @Override // oc.o0
    public final Object V(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        return jArrCopyOf;
    }

    @Override // oc.o0
    public final Object W() {
        return new long[0];
    }

    @Override // oc.o0
    public final Object Y(ub.u uVar, jc.k kVar) {
        return new long[]{I(uVar, kVar)};
    }

    @Override // oc.o0
    public final o0 Z(mc.v vVar, Boolean bool) {
        return new m0(this, vVar, bool);
    }

    @Override // jc.q
    public long[] deserialize(ub.u uVar, jc.k kVar) throws IOException {
        long longValue;
        int i10;
        if (!uVar.isExpectedStartArrayToken()) {
            return (long[]) X(uVar, kVar);
        }
        d.f longBuilder = kVar.getArrayBuilders().getLongBuilder();
        long[] jArr = (long[]) longBuilder.resetAndStart();
        int i11 = 0;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return (long[]) longBuilder.completeAndClearBuffer(jArr, i11);
                }
                try {
                    if (zVarNextToken == ub.z.VALUE_NUMBER_INT) {
                        longValue = uVar.getLongValue();
                    } else if (zVarNextToken == ub.z.VALUE_NULL) {
                        mc.v vVar = this.f78926h;
                        if (vVar != null) {
                            vVar.getNullValue(kVar);
                        } else {
                            N(kVar);
                            longValue = 0;
                        }
                    } else {
                        longValue = I(uVar, kVar);
                    }
                    jArr[i11] = longValue;
                    i11 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    throw jc.r.wrapWithPath(e, jArr, longBuilder.bufferedSize() + i11);
                }
                if (i11 >= jArr.length) {
                    long[] jArr2 = (long[]) longBuilder.appendCompletedChunk(jArr, i11);
                    i11 = 0;
                    jArr = jArr2;
                }
                i10 = i11 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }
}
