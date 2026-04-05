package dd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import jc.s0;
import jc.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f52094b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f52095c;

    /* renamed from: e, reason: collision with root package name */
    public final ub.c0[] f52096e;

    /* renamed from: f, reason: collision with root package name */
    public transient EnumMap f52097f;

    public o(Class cls, ub.c0[] c0VarArr) {
        this.f52094b = cls;
        this.f52095c = (Enum[]) cls.getEnumConstants();
        this.f52096e = c0VarArr;
    }

    public static Enum[] a(Class cls) {
        Enum[] enumArr = (Enum[]) i.findEnumType((Class<?>) cls).getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(cls.getName()));
    }

    public static o construct(s0 s0Var, rc.e eVar) {
        return s0Var.isEnabled(t0.WRITE_ENUMS_USING_TO_STRING) ? constructFromToString(s0Var, eVar) : constructFromName(s0Var, eVar);
    }

    @Deprecated
    public static o constructFromName(lc.z zVar, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsFindEnumType = i.findEnumType(cls);
        boolean zIsEnabled = zVar.isEnabled(lc.u.WRITE_ENUMS_TO_LOWERCASE);
        Enum<?>[] enumArr = (Enum[]) clsFindEnumType.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        String[] strArrFindEnumValues = zVar.getAnnotationIntrospector().findEnumValues(clsFindEnumType, enumArr, new String[enumArr.length]);
        ub.c0[] c0VarArr = new ub.c0[enumArr.length];
        int length = enumArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum<?> r62 = enumArr[i10];
            String lowerCase = strArrFindEnumValues[i10];
            String strName = r62.name();
            if (lowerCase == null) {
                lowerCase = zIsEnabled ? strName.toLowerCase() : strName;
            }
            c0VarArr[r62.ordinal()] = zVar.compileString(lowerCase);
        }
        return construct(cls, c0VarArr);
    }

    public static o constructFromToString(lc.z zVar, rc.e eVar) {
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        boolean zIsEnabled = zVar.isEnabled(lc.u.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        String[] strArr = new String[enumArrA.length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(zVar, eVar, enumArrA, strArr);
        }
        ub.c0[] c0VarArr = new ub.c0[enumArrA.length];
        for (int i10 = 0; i10 < enumArrA.length; i10++) {
            String string = enumArrA[i10].toString();
            if (string == null) {
                string = "";
            }
            String str = strArr[i10];
            if (str != null) {
                string = str;
            } else if (zIsEnabled) {
                string = string.toLowerCase();
            }
            c0VarArr[i10] = zVar.compileString(string);
        }
        return construct((Class<Enum<?>>) rawType, c0VarArr);
    }

    public static o constructUsingEnumNamingStrategy(lc.z zVar, rc.e eVar, jc.m mVar) {
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        boolean zIsEnabled = zVar.isEnabled(lc.u.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        String[] strArr = new String[enumArrA.length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(zVar, eVar, enumArrA, strArr);
        }
        ub.c0[] c0VarArr = new ub.c0[enumArrA.length];
        int length = enumArrA.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum<?> r62 = enumArrA[i10];
            String lowerCase = strArr[i10];
            r62.name();
            String strA = mVar.a();
            if (lowerCase == null) {
                lowerCase = zIsEnabled ? strA.toLowerCase() : strA;
            }
            c0VarArr[i10] = zVar.compileString(lowerCase);
        }
        return construct((Class<Enum<?>>) rawType, c0VarArr);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this.f52095c);
    }

    public Class<Enum<?>> getEnumClass() {
        return this.f52094b;
    }

    public EnumMap<?, ub.c0> internalMap() {
        EnumMap<?, ub.c0> enumMap = this.f52097f;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum r42 : this.f52095c) {
            linkedHashMap.put(r42, this.f52096e[r42.ordinal()]);
        }
        EnumMap<?, ub.c0> enumMap2 = new EnumMap<>(linkedHashMap);
        this.f52097f = enumMap2;
        return enumMap2;
    }

    public ub.c0 serializedValueFor(Enum<?> r22) {
        return this.f52096e[r22.ordinal()];
    }

    public Collection<ub.c0> values() {
        return Arrays.asList(this.f52096e);
    }

    public static o construct(lc.z zVar, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        ub.c0[] c0VarArr = new ub.c0[size];
        for (int i10 = 0; i10 < size; i10++) {
            c0VarArr[i10] = zVar.compileString(list.get(i10));
        }
        return construct(cls, c0VarArr);
    }

    public static o construct(Class<Enum<?>> cls, ub.c0[] c0VarArr) {
        return new o(cls, c0VarArr);
    }

    public static o constructFromName(lc.z zVar, rc.e eVar) {
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        boolean zIsEnabled = zVar.isEnabled(lc.u.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(zVar, eVar, enumArrA, new String[enumArrA.length]);
        ub.c0[] c0VarArr = new ub.c0[enumArrA.length];
        int length = enumArrA.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum<?> r62 = enumArrA[i10];
            String lowerCase = strArrFindEnumValues[i10];
            String strName = r62.name();
            if (lowerCase == null) {
                lowerCase = zIsEnabled ? strName.toLowerCase() : strName;
            }
            c0VarArr[r62.ordinal()] = zVar.compileString(lowerCase);
        }
        return construct((Class<Enum<?>>) rawType, c0VarArr);
    }

    @Deprecated
    public static o constructUsingEnumNamingStrategy(lc.z zVar, Class<Enum<?>> cls, jc.m mVar) {
        Enum[] enumArr = (Enum[]) i.findEnumType(cls).getEnumConstants();
        if (enumArr != null) {
            ArrayList arrayList = new ArrayList(enumArr.length);
            for (Enum r02 : enumArr) {
                r02.name();
                arrayList.add(mVar.a());
            }
            return construct(zVar, cls, arrayList);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
    }

    @Deprecated
    public static o constructFromToString(lc.z zVar, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) i.findEnumType(cls).getEnumConstants();
        if (enumArr != null) {
            ArrayList arrayList = new ArrayList(enumArr.length);
            for (Enum r02 : enumArr) {
                arrayList.add(r02.toString());
            }
            return construct(zVar, cls, arrayList);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
    }
}
