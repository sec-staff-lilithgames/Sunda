package e6;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f53758a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f53759b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f53758a = new k1();
        } else {
            f53758a = new j1();
        }
        f53759b = new z0(Float.class, "translationAlpha");
        new a1(Rect.class, "clipBounds");
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f53758a.setLeftTopRightBottom(view, i10, i11, i12, i13);
    }

    public static void b(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f53758a.setTransitionVisibility(view, i10);
    }
}
