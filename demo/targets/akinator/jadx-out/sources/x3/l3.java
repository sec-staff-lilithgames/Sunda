package x3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l3 extends s3 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f91627i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f91628j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f91629k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f91630l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f91631m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f91632c;

    /* renamed from: d, reason: collision with root package name */
    public o3.c[] f91633d;

    /* renamed from: e, reason: collision with root package name */
    public o3.c f91634e;

    /* renamed from: f, reason: collision with root package name */
    public e3 f91635f;

    /* renamed from: g, reason: collision with root package name */
    public o3.c f91636g;

    /* renamed from: h, reason: collision with root package name */
    public int f91637h;

    public l3(e3 e3Var, WindowInsets windowInsets) {
        super(e3Var);
        this.f91634e = null;
        this.f91632c = windowInsets;
    }

    private o3.c t(int i10, boolean z10) {
        o3.c cVarMax = o3.c.f77431e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarMax = o3.c.max(cVarMax, u(i11, z10));
            }
        }
        return cVarMax;
    }

    private o3.c v() {
        e3 e3Var = this.f91635f;
        return e3Var != null ? e3Var.getStableInsets() : o3.c.f77431e;
    }

    private o3.c w(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f91627i) {
            y();
        }
        Method method = f91628j;
        if (method != null && f91629k != null && f91630l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f91630l.get(f91631m.get(objInvoke));
                if (rect != null) {
                    return o3.c.of(rect);
                }
                return null;
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    private static void y() throws ClassNotFoundException, SecurityException {
        try {
            f91628j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f91629k = cls;
            f91630l = cls.getDeclaredField("mVisibleInsets");
            f91631m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f91630l.setAccessible(true);
            f91631m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f91627i = true;
    }

    public static boolean z(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    @Override // x3.s3
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o3.c cVarW = w(view);
        if (cVarW == null) {
            cVarW = o3.c.f77431e;
        }
        q(cVarW);
    }

    @Override // x3.s3
    public void e(e3 e3Var) {
        e3Var.f91569a.r(this.f91635f);
        o3.c cVar = this.f91636g;
        s3 s3Var = e3Var.f91569a;
        s3Var.q(cVar);
        s3Var.s(this.f91637h);
    }

    @Override // x3.s3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return Objects.equals(this.f91636g, l3Var.f91636g) && z(this.f91637h, l3Var.f91637h);
    }

    @Override // x3.s3
    public o3.c getInsets(int i10) {
        return t(i10, false);
    }

    @Override // x3.s3
    public o3.c getInsetsIgnoringVisibility(int i10) {
        return t(i10, true);
    }

    @Override // x3.s3
    public boolean isVisible(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !x(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // x3.s3
    public final o3.c l() {
        if (this.f91634e == null) {
            WindowInsets windowInsets = this.f91632c;
            this.f91634e = o3.c.of(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f91634e;
    }

    @Override // x3.s3
    public e3 n(int i10, int i11, int i12, int i13) {
        e3.a aVar = new e3.a(e3.toWindowInsetsCompat(this.f91632c));
        aVar.setSystemWindowInsets(e3.a(l(), i10, i11, i12, i13));
        aVar.setStableInsets(e3.a(j(), i10, i11, i12, i13));
        return aVar.build();
    }

    @Override // x3.s3
    public boolean p() {
        return this.f91632c.isRound();
    }

    @Override // x3.s3
    public void q(o3.c cVar) {
        this.f91636g = cVar;
    }

    @Override // x3.s3
    public void r(e3 e3Var) {
        this.f91635f = e3Var;
    }

    @Override // x3.s3
    public void s(int i10) {
        this.f91637h = i10;
    }

    @Override // x3.s3
    public void setOverriddenInsets(o3.c[] cVarArr) {
        this.f91633d = cVarArr;
    }

    public o3.c u(int i10, boolean z10) {
        o3.c stableInsets;
        int i11;
        o3.c cVar = o3.c.f77431e;
        if (i10 == 1) {
            return z10 ? o3.c.of(0, Math.max(v().f77433b, l().f77433b), 0, 0) : (this.f91637h & 4) != 0 ? cVar : o3.c.of(0, l().f77433b, 0, 0);
        }
        if (i10 == 2) {
            if (z10) {
                o3.c cVarV = v();
                o3.c cVarJ = j();
                return o3.c.of(Math.max(cVarV.f77432a, cVarJ.f77432a), 0, Math.max(cVarV.f77434c, cVarJ.f77434c), Math.max(cVarV.f77435d, cVarJ.f77435d));
            }
            if ((this.f91637h & 2) != 0) {
                return cVar;
            }
            o3.c cVarL = l();
            e3 e3Var = this.f91635f;
            stableInsets = e3Var != null ? e3Var.getStableInsets() : null;
            int iMin = cVarL.f77435d;
            if (stableInsets != null) {
                iMin = Math.min(iMin, stableInsets.f77435d);
            }
            return o3.c.of(cVarL.f77432a, 0, cVarL.f77434c, iMin);
        }
        if (i10 != 8) {
            if (i10 == 16) {
                return k();
            }
            if (i10 == 32) {
                return g();
            }
            if (i10 == 64) {
                return m();
            }
            if (i10 != 128) {
                return cVar;
            }
            e3 e3Var2 = this.f91635f;
            s displayCutout = e3Var2 != null ? e3Var2.getDisplayCutout() : f();
            return displayCutout != null ? o3.c.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()) : cVar;
        }
        o3.c[] cVarArr = this.f91633d;
        stableInsets = cVarArr != null ? cVarArr[t3.a(8)] : null;
        if (stableInsets != null) {
            return stableInsets;
        }
        o3.c cVarL2 = l();
        o3.c cVarV2 = v();
        int i12 = cVarL2.f77435d;
        if (i12 > cVarV2.f77435d) {
            return o3.c.of(0, 0, 0, i12);
        }
        o3.c cVar2 = this.f91636g;
        return (cVar2 == null || cVar2.equals(cVar) || (i11 = this.f91636g.f77435d) <= cVarV2.f77435d) ? cVar : o3.c.of(0, 0, 0, i11);
    }

    public boolean x(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !u(i10, false).equals(o3.c.f77431e);
    }

    public l3(e3 e3Var, l3 l3Var) {
        this(e3Var, new WindowInsets(l3Var.f91632c));
    }
}
