package pr;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class k {
    public static Object findValue(Object obj, String str) {
        return findValue(obj.getClass(), str, obj);
    }

    public static Object findValueByPath(Object obj, String[] strArr) {
        if (strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            obj = findValue(obj, str);
            if (obj == null) {
                return null;
            }
        }
        return obj;
    }

    public static Object getValue(Class<?> cls, String str, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object findValue(Class<?> cls, String str, Object obj) {
        try {
            return getValue(cls, str, obj);
        } catch (Throwable unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return findValue(superclass, str, obj);
        }
    }
}
