package com.bykv.vk.openvk.preload.a.b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class i {
    public static i a() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    return new i() { // from class: com.bykv.vk.openvk.preload.a.b.i.1
                        @Override // com.bykv.vk.openvk.preload.a.b.i
                        public final <T> T a(Class<T> cls2) throws Exception {
                            i.b(cls2);
                            return (T) method.invoke(obj, cls2);
                        }
                    };
                } catch (Exception unused) {
                    return new i() { // from class: com.bykv.vk.openvk.preload.a.b.i.4
                        @Override // com.bykv.vk.openvk.preload.a.b.i
                        public final <T> T a(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls2)));
                        }
                    };
                }
            } catch (Exception unused2) {
                final Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new i() { // from class: com.bykv.vk.openvk.preload.a.b.i.3
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final <T> T a(Class<T> cls2) throws Exception {
                        i.b(cls2);
                        return (T) declaredMethod.invoke(null, cls2, Object.class);
                    }
                };
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            final int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            final Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new i() { // from class: com.bykv.vk.openvk.preload.a.b.i.2
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final <T> T a(Class<T> cls2) throws Exception {
                    i.b(cls2);
                    return (T) declaredMethod3.invoke(null, cls2, Integer.valueOf(iIntValue));
                }
            };
        }
    }

    public static void b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public abstract <T> T a(Class<T> cls) throws Exception;
}
