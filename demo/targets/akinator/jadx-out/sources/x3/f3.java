package x3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f3 extends k3 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f91576e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f91577f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f91578g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f91579h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f91580c;

    /* renamed from: d, reason: collision with root package name */
    public o3.c f91581d;

    public f3() {
        this.f91580c = n();
    }

    private static WindowInsets n() {
        if (!f91577f) {
            try {
                f91576e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f91577f = true;
        }
        Field field = f91576e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f91579h) {
            try {
                f91578g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f91579h = true;
        }
        Constructor constructor = f91578g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // x3.k3
    public e3 b() {
        a();
        e3 windowInsetsCompat = e3.toWindowInsetsCompat(this.f91580c);
        windowInsetsCompat.f91569a.setOverriddenInsets(this.f91619b);
        windowInsetsCompat.f91569a.setStableInsets(this.f91581d);
        return windowInsetsCompat;
    }

    @Override // x3.k3
    public void i(o3.c cVar) {
        this.f91581d = cVar;
    }

    @Override // x3.k3
    public void k(o3.c cVar) {
        WindowInsets windowInsets = this.f91580c;
        if (windowInsets != null) {
            this.f91580c = windowInsets.replaceSystemWindowInsets(cVar.f77432a, cVar.f77433b, cVar.f77434c, cVar.f77435d);
        }
    }

    public f3(e3 e3Var) {
        super(e3Var);
        this.f91580c = e3Var.toWindowInsets();
    }
}
