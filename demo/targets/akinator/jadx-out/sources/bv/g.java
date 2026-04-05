package bv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {
    public static final void a(int i10) {
        if (i10 <= 1) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + i10 + ". Please update the Kotlin standard library.").toString());
    }

    public static final int b(a aVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final String[] getSpilledVariableFieldMapping(a aVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        e0.checkNotNullParameter(aVar, "<this>");
        f fVar = (f) aVar.getClass().getAnnotation(f.class);
        if (fVar == null) {
            return null;
        }
        a(fVar.v());
        ArrayList arrayList = new ArrayList();
        int iB = b(aVar);
        int[] iArrI = fVar.i();
        int length = iArrI.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArrI[i10] == iB) {
                arrayList.add(fVar.s()[i10]);
                arrayList.add(fVar.n()[i10]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final StackTraceElement getStackTraceElement(a aVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        String string;
        e0.checkNotNullParameter(aVar, "<this>");
        f fVar = (f) aVar.getClass().getAnnotation(f.class);
        if (fVar == null) {
            return null;
        }
        a(fVar.v());
        int iB = b(aVar);
        int i10 = iB < 0 ? -1 : fVar.l()[iB];
        String moduleName = j.f11346a.getModuleName(aVar);
        if (moduleName == null) {
            string = fVar.c();
        } else {
            StringBuilder sbS = a.b.s(moduleName, '/');
            sbS.append(fVar.c());
            string = sbS.toString();
        }
        return new StackTraceElement(string, fVar.m(), fVar.f(), i10);
    }
}
