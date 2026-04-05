package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static Class f16886a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16887b = b();

    /* renamed from: c, reason: collision with root package name */
    private final Field f16888c = c();

    private boolean b(AccessibleObject accessibleObject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f16887b == null || this.f16888c == null) {
            return false;
        }
        try {
            Long l9 = (Long) f16886a.getMethod("objectFieldOffset", Field.class).invoke(this.f16887b, this.f16888c);
            l9.longValue();
            f16886a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f16887b, accessibleObject, l9, Boolean.TRUE);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.b.b
    public final void a(AccessibleObject accessibleObject) throws SecurityException {
        if (b(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new j("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    private static Object b() throws NoSuchFieldException, ClassNotFoundException, SecurityException {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f16886a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
