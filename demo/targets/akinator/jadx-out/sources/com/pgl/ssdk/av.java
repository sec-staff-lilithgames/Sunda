package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private static Method f50422a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f50423b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f50424c;

    static {
        try {
            f50422a = Class.class.getDeclaredMethod("forName", String.class);
            f50423b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f50424c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    public static Object a(Object obj, Class cls, String str, Object obj2) {
        Field fieldA;
        try {
            fieldA = a(cls, str);
        } catch (Throwable unused) {
        }
        if (fieldA == null) {
            return obj2;
        }
        fieldA.setAccessible(true);
        return fieldA.get(obj);
    }

    public static Field a(Class cls, String str) {
        if (!a()) {
            return null;
        }
        try {
            Field field = (Field) f50424c.invoke(cls, str);
            try {
                field.setAccessible(true);
                return field;
            } catch (Throwable unused) {
                return field;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        if (!a()) {
            return null;
        }
        try {
            Method method = (Method) f50423b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return method;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Method methodA = a(cls, str, clsArr);
            if (methodA != null) {
                return methodA.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a() {
        return (f50422a == null || f50423b == null || f50424c == null) ? false : true;
    }
}
