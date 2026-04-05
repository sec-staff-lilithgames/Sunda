package oc;

import mc.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v extends c0.a {
    public v() {
        super((Class<?>) ub.p.class);
    }

    public static mc.l a(String str, jc.o oVar, int i10) {
        return mc.l.construct(jc.n0.construct(str), oVar, null, null, null, null, i10, null, jc.m0.f69371j);
    }

    @Override // mc.c0
    public boolean canCreateFromObjectWith() {
        return true;
    }

    @Override // mc.c0
    public Object createFromObjectWith(jc.k kVar, Object[] objArr) {
        cc.f fVarRawReference = cc.f.rawReference(objArr[0]);
        Object obj = objArr[1];
        long jLongValue = obj == null ? 0L : ((Number) obj).longValue();
        Object obj2 = objArr[2];
        long jLongValue2 = obj2 != null ? ((Number) obj2).longValue() : 0L;
        Object obj3 = objArr[3];
        int iIntValue = obj3 == null ? 0 : ((Number) obj3).intValue();
        Object obj4 = objArr[4];
        return new ub.p(fVarRawReference, jLongValue, jLongValue2, iIntValue, obj4 != null ? ((Number) obj4).intValue() : 0);
    }

    @Override // mc.c0
    public mc.z[] getFromObjectArguments(jc.j jVar) {
        jc.o oVarConstructType = jVar.constructType(Integer.TYPE);
        jc.o oVarConstructType2 = jVar.constructType(Long.TYPE);
        return new mc.z[]{a("sourceRef", jVar.constructType(Object.class), 0), a("byteOffset", oVarConstructType2, 1), a("charOffset", oVarConstructType2, 2), a("lineNr", oVarConstructType, 3), a("columnNr", oVarConstructType, 4)};
    }
}
