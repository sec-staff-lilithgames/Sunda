package sc;

import dd.i;
import java.util.List;
import jc.d;
import jc.k;
import jc.n0;
import lc.z;
import rc.c1;
import rc.e;
import rc.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f85590a;

        /* renamed from: b, reason: collision with root package name */
        public final String f85591b;

        public a(Class<?> cls, String str) {
            this.f85590a = cls;
            this.f85591b = str;
        }
    }

    public static c1 findCanonicalRecordConstructor(z zVar, e eVar, List<c1> list) throws IllegalArgumentException {
        g defaultConstructor;
        a[] recordFields = c.instance().getRecordFields(eVar.getRawType());
        if (recordFields == null) {
            return null;
        }
        int length = recordFields.length;
        if (length == 0 && (defaultConstructor = eVar.getDefaultConstructor()) != null) {
            return new c1(defaultConstructor, null);
        }
        for (c1 c1Var : list) {
            if (c1Var.paramCount() == length) {
                for (int i10 = 0; i10 < length; i10++) {
                    if (!c1Var.creator().getRawParameterType(i10).equals(recordFields[i10].f85590a)) {
                        break;
                    }
                }
                n0[] n0VarArr = new n0[length];
                for (int i11 = 0; i11 < length; i11++) {
                    n0VarArr[i11] = n0.construct(recordFields[i11].f85591b);
                }
                return c1Var.introspectParamNames(zVar, n0VarArr);
            }
        }
        throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + i.getTypeDescription(eVar.getType()));
    }

    @Deprecated
    public static g findRecordConstructor(k kVar, d dVar, List<String> list) {
        return findRecordConstructor(dVar.getClassInfo(), kVar.getAnnotationIntrospector(), kVar.getConfig(), list);
    }

    public static String[] getRecordFieldNames(Class<?> cls) {
        return c.instance().getRecordFieldNames(cls);
    }

    @Deprecated
    public static g findRecordConstructor(e eVar, jc.c cVar, z zVar, List<String> list) {
        return new sc.a(zVar, eVar).locate(list);
    }
}
