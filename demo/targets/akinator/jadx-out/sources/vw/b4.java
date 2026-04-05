package vw;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b4 {
    public static Class a(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length > 0) {
            return b(actualTypeArguments[0]);
        }
        return null;
    }

    public static Class b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof GenericArrayType)) {
            return Object.class;
        }
        Class clsB = b(((GenericArrayType) type).getGenericComponentType());
        if (clsB != null) {
            return Array.newInstance((Class<?>) clsB, 0).getClass();
        }
        return null;
    }

    public static Class[] c(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[actualTypeArguments.length];
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            clsArr[i10] = b(actualTypeArguments[i10]);
        }
        return clsArr;
    }

    public static Class getDependent(Field field) {
        Type genericType = field.getGenericType();
        ParameterizedType parameterizedType = genericType instanceof ParameterizedType ? (ParameterizedType) genericType : null;
        return parameterizedType != null ? a(parameterizedType) : Object.class;
    }

    public static Class[] getDependents(Field field) {
        Type genericType = field.getGenericType();
        ParameterizedType parameterizedType = genericType instanceof ParameterizedType ? (ParameterizedType) genericType : null;
        return parameterizedType != null ? c(parameterizedType) : new Class[0];
    }

    public static String getName(String str) {
        if (str.length() <= 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char c10 = charArray[0];
        if (!((charArray.length >= 2 && Character.isUpperCase(c10)) ? Character.isUpperCase(charArray[1]) : false)) {
            charArray[0] = Character.toLowerCase(c10);
        }
        return new String(charArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class getParameterDependent(java.lang.reflect.Method r1, int r2) {
        /*
            java.lang.reflect.Type[] r1 = r1.getGenericParameterTypes()
            int r0 = r1.length
            if (r0 <= r2) goto L10
            r1 = r1[r2]
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L10
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L18
            java.lang.Class r1 = a(r1)
            return r1
        L18:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.b4.getParameterDependent(java.lang.reflect.Method, int):java.lang.Class");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class[] getParameterDependents(java.lang.reflect.Method r1, int r2) {
        /*
            java.lang.reflect.Type[] r1 = r1.getGenericParameterTypes()
            int r0 = r1.length
            if (r0 <= r2) goto L10
            r1 = r1[r2]
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L10
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L18
            java.lang.Class[] r1 = c(r1)
            return r1
        L18:
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.b4.getParameterDependents(java.lang.reflect.Method, int):java.lang.Class[]");
    }

    public static Class getReturnDependent(Method method) {
        Type genericReturnType = method.getGenericReturnType();
        ParameterizedType parameterizedType = genericReturnType instanceof ParameterizedType ? (ParameterizedType) genericReturnType : null;
        return parameterizedType != null ? a(parameterizedType) : Object.class;
    }

    public static Class[] getReturnDependents(Method method) {
        Type genericReturnType = method.getGenericReturnType();
        ParameterizedType parameterizedType = genericReturnType instanceof ParameterizedType ? (ParameterizedType) genericReturnType : null;
        return parameterizedType != null ? c(parameterizedType) : new Class[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class getParameterDependent(java.lang.reflect.Constructor r1, int r2) {
        /*
            java.lang.reflect.Type[] r1 = r1.getGenericParameterTypes()
            int r0 = r1.length
            if (r0 <= r2) goto L10
            r1 = r1[r2]
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L10
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L18
            java.lang.Class r1 = a(r1)
            return r1
        L18:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.b4.getParameterDependent(java.lang.reflect.Constructor, int):java.lang.Class");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class[] getParameterDependents(java.lang.reflect.Constructor r1, int r2) {
        /*
            java.lang.reflect.Type[] r1 = r1.getGenericParameterTypes()
            int r0 = r1.length
            if (r0 <= r2) goto L10
            r1 = r1[r2]
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L10
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L18
            java.lang.Class[] r1 = c(r1)
            return r1
        L18:
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.b4.getParameterDependents(java.lang.reflect.Constructor, int):java.lang.Class[]");
    }
}
