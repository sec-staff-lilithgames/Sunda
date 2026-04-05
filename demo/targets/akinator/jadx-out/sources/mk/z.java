package mk;

import java.lang.reflect.AccessibleObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f74801a;

    static {
        z xVar;
        if (h.isJava9OrLater()) {
            try {
                xVar = new x(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        } else {
            xVar = null;
        }
        if (xVar == null) {
            xVar = new y();
        }
        f74801a = xVar;
    }

    public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);
}
