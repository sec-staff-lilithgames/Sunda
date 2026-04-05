package mk;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class a0 {
    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return z.f74801a.canAccess(accessibleObject, obj);
    }

    public static com.google.gson.a0 getFilterResult(List<com.google.gson.b0> list, Class<?> cls) {
        Iterator<com.google.gson.b0> it = list.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        return com.google.gson.a0.f29910b;
    }

    public static boolean isAndroidType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean isJavaType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }
}
