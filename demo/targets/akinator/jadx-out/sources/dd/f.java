package dd;

import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f {
    public static String a(int i10, String str) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        while (true) {
            i10++;
            if (i10 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i10);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i10, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String checkUnsupportedType(lc.z r4, jc.o r5) {
        /*
            java.lang.Class r0 = r5.getRawClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.time."
            boolean r1 = r0.startsWith(r1)
            r2 = 0
            if (r1 == 0) goto L37
            r1 = 46
            r3 = 10
            int r0 = r0.indexOf(r1, r3)
            if (r0 < 0) goto L1c
            return r2
        L1c:
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            boolean r0 = r5.isTypeOrSubTypeOf(r0)
            if (r0 == 0) goto L25
            return r2
        L25:
            jc.y r0 = jc.y.REQUIRE_HANDLERS_FOR_JAVA8_TIMES
            if (r4 == 0) goto L31
            boolean r4 = r4.isEnabled(r0)
            if (r4 == 0) goto L30
            goto L31
        L30:
            return r2
        L31:
            java.lang.String r4 = "Java 8 date/time"
            java.lang.String r1 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310"
        L35:
            r2 = r0
            goto L5d
        L37:
            java.lang.String r1 = "org.joda.time."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L44
            java.lang.String r4 = "Joda date/time"
            java.lang.String r1 = "com.fasterxml.jackson.datatype:jackson-datatype-joda"
            goto L5d
        L44:
            java.lang.String r1 = "java.util.Optional"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L91
            jc.y r0 = jc.y.REQUIRE_HANDLERS_FOR_JAVA8_OPTIONALS
            if (r4 == 0) goto L58
            boolean r4 = r4.isEnabled(r0)
            if (r4 == 0) goto L57
            goto L58
        L57:
            return r2
        L58:
            java.lang.String r4 = "Java 8 optional"
            java.lang.String r1 = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8"
            goto L35
        L5d:
            java.lang.String r5 = dd.i.getTypeDescription(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " type "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " not supported by default: add Module \""
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = "\" to enable handling"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            if (r2 == 0) goto L90
            java.lang.String r5 = r2.name()
            java.lang.String r0 = " (or disable `MapperFeature."
            java.lang.String r1 = "`)"
            java.lang.String r4 = e3.g.k(r4, r0, r5, r1)
        L90:
            return r4
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.f.checkUnsupportedType(lc.z, jc.o):java.lang.String");
    }

    public static Object getDefaultValue(jc.o oVar) {
        Class<?> rawClass = oVar.getRawClass();
        Class<?> clsPrimitiveType = i.primitiveType(rawClass);
        if (clsPrimitiveType != null) {
            return i.defaultValue(clsPrimitiveType);
        }
        if (oVar.isContainerType() || oVar.isReferenceType()) {
            return tb.c0.f86696e;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (oVar.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!oVar.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    public static boolean isJava8OptionalClass(Class<?> cls) {
        return cls.getName().startsWith("java.util.Optional");
    }

    public static boolean isJava8TimeClass(Class<?> cls) {
        return cls.getName().startsWith("java.time.");
    }

    public static boolean isJodaTimeClass(Class<?> cls) {
        return cls.getName().startsWith("org.joda.time.");
    }

    @Deprecated
    public static String okNameForGetter(rc.m mVar, boolean z10) {
        String name = mVar.getName();
        String strOkNameForIsGetter = okNameForIsGetter(mVar, name, z10);
        return strOkNameForIsGetter == null ? okNameForRegularGetter(mVar, name, z10) : strOkNameForIsGetter;
    }

    @Deprecated
    public static String okNameForIsGetter(rc.m mVar, String str, boolean z10) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = mVar.getRawType();
        if (rawType == Boolean.class || rawType == Boolean.TYPE) {
            return z10 ? stdManglePropertyName(str, 2) : a(2, str);
        }
        return null;
    }

    @Deprecated
    public static String okNameForMutator(rc.m mVar, String str, boolean z10) {
        String name = mVar.getName();
        if (name.startsWith(str)) {
            return z10 ? stdManglePropertyName(name, str.length()) : a(str.length(), name);
        }
        return null;
    }

    @Deprecated
    public static String okNameForSetter(rc.m mVar, boolean z10) {
        return okNameForMutator(mVar, "set", z10);
    }

    public static String stdManglePropertyName(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        int i11 = i10 + 1;
        if (i11 < length && Character.isUpperCase(str.charAt(i11))) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i11, length);
        return sb2.toString();
    }

    @Deprecated
    public static String okNameForRegularGetter(rc.m mVar, String str, boolean z10) {
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            Class<?> rawType = mVar.getRawType();
            if (rawType.isArray()) {
                String name = rawType.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith(KGUkpTlXZlJLy.vvcDzoYtXg) || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    return null;
                }
            }
        } else if ("getMetaClass".equals(str) && mVar.getRawType().getName().startsWith("groovy.lang")) {
            return null;
        }
        return z10 ? stdManglePropertyName(str, 3) : a(3, str);
    }

    @Deprecated
    public static String checkUnsupportedType(jc.o oVar) {
        return checkUnsupportedType(null, oVar);
    }
}
