package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class c0 {
    public static Field a(Object obj, String str) throws NoSuchFieldException, SecurityException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new d0(a.b.m("Failed to find a field named ", str, " on an object of instance ", obj.getClass().getName()));
    }

    public static Method b(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new d0(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static a0 zza(Object obj, String str, Class cls) {
        return new a0(obj, a(obj, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static b0 zzb(Object obj, String str, Class cls) {
        return new b0(obj, a(obj, str), cls);
    }

    public static Object zzc(Class cls) throws NoSuchMethodException, SecurityException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e10) {
            throw new d0("Failed to invoke default constructor on class ".concat(cls.getName()), e10);
        }
    }

    public static Object zzd(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(b(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e10) {
            throw new d0("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e10);
        }
    }

    public static Object zze(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(b(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e10) {
            throw new d0("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e10);
        }
    }

    public static Object zzf(Class cls, String str, Class cls2, Class cls3, Object obj) throws NoSuchMethodException, SecurityException {
        try {
            return cls2.cast(b(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e10) {
            throw new d0(a.b.i(cls, "Failed to invoke static method isDexOptNeeded on type "), e10);
        }
    }

    public static Object zzg(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) throws NoSuchMethodException, SecurityException {
        try {
            return cls2.cast(b(cls, "optimizedPathFor", cls3, cls4).invoke(null, obj, obj2));
        } catch (Exception e10) {
            throw new d0(a.b.i(cls, "Failed to invoke static method optimizedPathFor on type "), e10);
        }
    }
}
