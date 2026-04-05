package dd;

import b0.e2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f52085b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f52086c;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f52087e;

    /* renamed from: f, reason: collision with root package name */
    public final Enum f52088f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f52089g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f52090h;

    public n(Class cls, Enum[] enumArr, HashMap map, Enum r42, boolean z10, boolean z11) {
        this.f52085b = cls;
        this.f52086c = enumArr;
        this.f52087e = map;
        this.f52088f = r42;
        this.f52089g = z10;
        this.f52090h = z11;
    }

    public static Enum[] a(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(cls.getName()));
    }

    public static boolean b(Class cls) {
        if (cls.isPrimitive()) {
            cls = i.wrapperType(cls);
        }
        return cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class;
    }

    public static n constructFor(jc.j jVar, rc.e eVar) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(jVar, eVar, enumArrA, new String[enumArrA.length]);
        String[][] strArr = new String[strArrFindEnumValues.length][];
        annotationIntrospector.findEnumAliases(jVar, eVar, enumArrA, strArr);
        HashMap map = new HashMap();
        int length = enumArrA.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum<?> r92 = enumArrA[i10];
            String strName = strArrFindEnumValues[i10];
            if (strName == null) {
                strName = r92.name();
            }
            map.put(strName, r92);
            String[] strArr2 = strArr[i10];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    map.putIfAbsent(str, r92);
                }
            }
        }
        return new n(rawType, enumArrA, map, annotationIntrospector.findDefaultEnumValue(eVar, enumArrA), zIsEnabled, false);
    }

    @Deprecated
    public static n constructUsingEnumNamingStrategy(jc.j jVar, Class<?> cls, jc.m mVar) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArrA = a(cls);
        HashMap map = new HashMap();
        String[] strArr = new String[enumArrA.length];
        String[][] strArr2 = new String[enumArrA.length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(cls, enumArrA, strArr);
            annotationIntrospector.findEnumAliases(cls, enumArrA, strArr2);
        }
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r32 = enumArrA[length];
            String strA = strArr[length];
            if (strA == null) {
                r32.name();
                strA = mVar.a();
            }
            map.put(strA, r32);
            String[] strArr3 = strArr2[length];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    map.putIfAbsent(str, r32);
                }
            }
        }
        return new n(cls, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(cls) : null, zIsEnabled, false);
    }

    public static n constructUsingIndex(jc.j jVar, rc.e eVar) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        HashMap map = new HashMap();
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            map.put(String.valueOf(length), enumArrA[length]);
        }
        return new n(rawType, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(eVar, enumArrA) : null, zIsEnabled, false);
    }

    @Deprecated
    public static n constructUsingMethod(jc.j jVar, Class<?> cls, rc.l lVar) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum[] enumArrA = a(cls);
        HashMap map = new HashMap();
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum r12 = enumArrA[length];
            try {
                Object value = lVar.getValue(r12);
                if (value != null) {
                    map.put(value.toString(), r12);
                }
            } catch (Exception e10) {
                StringBuilder sb2 = new StringBuilder("Failed to access @JsonValue of Enum value ");
                sb2.append(r12);
                sb2.append(": ");
                throw new IllegalArgumentException(e2.l(e10, sb2));
            }
        }
        return new n(cls, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(cls) : null, zIsEnabled, b(lVar.getRawType()));
    }

    public static n constructUsingToString(jc.j jVar, rc.e eVar) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        String[] strArr = new String[enumArrA.length];
        String[][] strArr2 = new String[enumArrA.length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(jVar, eVar, enumArrA, strArr);
            annotationIntrospector.findEnumAliases(jVar, eVar, enumArrA, strArr2);
        }
        HashMap map = new HashMap();
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r62 = enumArrA[length];
            String string = strArr[length];
            if (string == null) {
                string = r62.toString();
            }
            map.put(string, r62);
            String[] strArr3 = strArr2[length];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    map.putIfAbsent(str, r62);
                }
            }
        }
        return new n(rawType, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(eVar, enumArrA) : null, zIsEnabled, false);
    }

    public k constructLookup() {
        return k.construct(this.f52087e);
    }

    public Enum<?> findEnum(String str) {
        HashMap map = this.f52087e;
        Enum<?> r12 = (Enum) map.get(str);
        if (r12 != null || !this.f52089g) {
            return r12;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (Enum) entry.getValue();
            }
        }
        return null;
    }

    public Enum<?> getDefaultValue() {
        return this.f52088f;
    }

    public Enum<?> getEnum(int i10) {
        if (i10 < 0) {
            return null;
        }
        Enum<?>[] enumArr = this.f52086c;
        if (i10 >= enumArr.length) {
            return null;
        }
        return enumArr[i10];
    }

    public Class<Enum<?>> getEnumClass() {
        return this.f52085b;
    }

    public Collection<String> getEnumIds() {
        return this.f52087e.keySet();
    }

    public List<Enum<?>> getEnums() {
        Enum[] enumArr = this.f52086c;
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r02 : enumArr) {
            arrayList.add(r02);
        }
        return arrayList;
    }

    public Enum<?>[] getRawEnums() {
        return this.f52086c;
    }

    public boolean isFromIntValue() {
        return this.f52090h;
    }

    public int lastValidIndex() {
        return this.f52086c.length - 1;
    }

    @Deprecated
    public static n constructUsingIndex(jc.j jVar, Class<Enum<?>> cls) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum[] enumArrA = a(cls);
        HashMap map = new HashMap();
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            map.put(String.valueOf(length), enumArrA[length]);
        }
        return new n(cls, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(cls) : null, zIsEnabled, false);
    }

    public static n constructUsingMethod(jc.j jVar, rc.e eVar, rc.l lVar) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        HashMap map = new HashMap();
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r12 = enumArrA[length];
            try {
                Object value = lVar.getValue(r12);
                if (value != null) {
                    map.put(value.toString(), r12);
                }
            } catch (Exception e10) {
                StringBuilder sb2 = new StringBuilder("Failed to access @JsonValue of Enum value ");
                sb2.append(r12);
                sb2.append(": ");
                throw new IllegalArgumentException(e2.l(e10, sb2));
            }
        }
        return new n(rawType, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(eVar, enumArrA) : null, zIsEnabled, b(lVar.getRawType()));
    }

    @Deprecated
    public static n constructFor(jc.j jVar, Class<?> cls) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArrA = a(cls);
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(cls, enumArrA, new String[enumArrA.length]);
        String[][] strArr = new String[strArrFindEnumValues.length][];
        annotationIntrospector.findEnumAliases(cls, enumArrA, strArr);
        HashMap map = new HashMap();
        int length = enumArrA.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum<?> r82 = enumArrA[i10];
            String strName = strArrFindEnumValues[i10];
            if (strName == null) {
                strName = r82.name();
            }
            map.put(strName, r82);
            String[] strArr2 = strArr[i10];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    map.putIfAbsent(str, r82);
                }
            }
        }
        return new n(cls, enumArrA, map, annotationIntrospector.findDefaultEnumValue(cls), zIsEnabled, false);
    }

    public static n constructUsingEnumNamingStrategy(jc.j jVar, rc.e eVar, jc.m mVar) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = eVar.getRawType();
        Enum<?>[] enumArrA = a(rawType);
        String[] strArr = new String[enumArrA.length];
        String[][] strArr2 = new String[enumArrA.length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(jVar, eVar, enumArrA, strArr);
            annotationIntrospector.findEnumAliases(jVar, eVar, enumArrA, strArr2);
        }
        HashMap map = new HashMap();
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r62 = enumArrA[length];
            String strA = strArr[length];
            if (strA == null) {
                r62.name();
                strA = mVar.a();
            }
            map.put(strA, r62);
            String[] strArr3 = strArr2[length];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    map.putIfAbsent(str, r62);
                }
            }
        }
        return new n(rawType, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(eVar, enumArrA) : null, zIsEnabled, false);
    }

    @Deprecated
    public static n constructUsingToString(jc.j jVar, Class<?> cls) {
        jc.c annotationIntrospector = jVar.getAnnotationIntrospector();
        boolean zIsEnabled = jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArrA = a(cls);
        HashMap map = new HashMap();
        String[][] strArr = new String[enumArrA.length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumAliases(cls, enumArrA, strArr);
        }
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r22 = enumArrA[length];
            map.put(r22.toString(), r22);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    map.putIfAbsent(str, r22);
                }
            }
        }
        return new n(cls, enumArrA, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(cls) : null, zIsEnabled, false);
    }
}
