package x3;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f91559a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f91560b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f91561c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f91562d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f91559a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f91560b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f91561c = declaredField3;
            declaredField3.setAccessible(true);
            f91562d = true;
        } catch (ReflectiveOperationException e10) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }

    public static e3 getRootWindowInsets(View view) throws IllegalAccessException, IllegalArgumentException {
        if (f91562d && view.isAttachedToWindow()) {
            try {
                Object obj = f91559a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) f91560b.get(obj);
                    Rect rect2 = (Rect) f91561c.get(obj);
                    if (rect != null && rect2 != null) {
                        e3 e3VarBuild = new e3.a().setStableInsets(o3.c.of(rect)).setSystemWindowInsets(o3.c.of(rect2)).build();
                        e3VarBuild.f91569a.r(e3VarBuild);
                        e3VarBuild.f91569a.d(view.getRootView());
                        return e3VarBuild;
                    }
                }
            } catch (IllegalAccessException e10) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            }
        }
        return null;
    }
}
