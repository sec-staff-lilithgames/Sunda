package x3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e3 {

    /* renamed from: b, reason: collision with root package name */
    public static final e3 f91568b;

    /* renamed from: a, reason: collision with root package name */
    public final s3 f91569a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f91568b = r3.f91666s;
        } else if (i10 >= 30) {
            f91568b = p3.f91654r;
        } else {
            f91568b = s3.f91673b;
        }
    }

    public e3(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f91569a = new r3(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f91569a = new q3(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f91569a = new p3(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f91569a = new o3(this, windowInsets);
        } else if (i10 >= 28) {
            this.f91569a = new n3(this, windowInsets);
        } else {
            this.f91569a = new m3(this, windowInsets);
        }
    }

    public static o3.c a(o3.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f77432a - i10);
        int iMax2 = Math.max(0, cVar.f77433b - i11);
        int iMax3 = Math.max(0, cVar.f77434c - i12);
        int iMax4 = Math.max(0, cVar.f77435d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : o3.c.of(iMax, iMax2, iMax3, iMax4);
    }

    public static e3 toWindowInsetsCompat(WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    @Deprecated
    public e3 consumeDisplayCutout() {
        return this.f91569a.a();
    }

    @Deprecated
    public e3 consumeStableInsets() {
        return this.f91569a.b();
    }

    @Deprecated
    public e3 consumeSystemWindowInsets() {
        return this.f91569a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e3) {
            return w3.d.equals(this.f91569a, ((e3) obj).f91569a);
        }
        return false;
    }

    public s getDisplayCutout() {
        return this.f91569a.f();
    }

    public o3.c getInsets(int i10) {
        return this.f91569a.getInsets(i10);
    }

    public o3.c getInsetsIgnoringVisibility(int i10) {
        return this.f91569a.getInsetsIgnoringVisibility(i10);
    }

    @Deprecated
    public o3.c getMandatorySystemGestureInsets() {
        return this.f91569a.g();
    }

    public Rect getPrivacyIndicatorBounds() {
        return this.f91569a.h();
    }

    public v0 getRoundedCorner(int i10) {
        return this.f91569a.i(i10);
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.f91569a.j().f77435d;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.f91569a.j().f77432a;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.f91569a.j().f77434c;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.f91569a.j().f77433b;
    }

    @Deprecated
    public o3.c getStableInsets() {
        return this.f91569a.j();
    }

    @Deprecated
    public o3.c getSystemGestureInsets() {
        return this.f91569a.k();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.f91569a.l().f77435d;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.f91569a.l().f77432a;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.f91569a.l().f77434c;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.f91569a.l().f77433b;
    }

    @Deprecated
    public o3.c getSystemWindowInsets() {
        return this.f91569a.l();
    }

    @Deprecated
    public o3.c getTappableElementInsets() {
        return this.f91569a.m();
    }

    public boolean hasInsets() {
        o3.c insets = getInsets(-1);
        o3.c cVar = o3.c.f77431e;
        return (insets.equals(cVar) && getInsetsIgnoringVisibility((-1) ^ t3.ime()).equals(cVar) && getDisplayCutout() == null) ? false : true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.f91569a.j().equals(o3.c.f77431e);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.f91569a.l().equals(o3.c.f77431e);
    }

    public int hashCode() {
        s3 s3Var = this.f91569a;
        if (s3Var == null) {
            return 0;
        }
        return s3Var.hashCode();
    }

    public e3 inset(o3.c cVar) {
        return inset(cVar.f77432a, cVar.f77433b, cVar.f77434c, cVar.f77435d);
    }

    public boolean isConsumed() {
        return this.f91569a.o();
    }

    public boolean isRound() {
        return this.f91569a.p();
    }

    public boolean isVisible(int i10) {
        return this.f91569a.isVisible(i10);
    }

    @Deprecated
    public e3 replaceSystemWindowInsets(int i10, int i11, int i12, int i13) {
        return new a(this).setSystemWindowInsets(o3.c.of(i10, i11, i12, i13)).build();
    }

    public WindowInsets toWindowInsets() {
        s3 s3Var = this.f91569a;
        if (s3Var instanceof l3) {
            return ((l3) s3Var).f91632c;
        }
        return null;
    }

    public static e3 toWindowInsetsCompat(WindowInsets windowInsets, View view) {
        e3 e3Var = new e3((WindowInsets) w3.i.checkNotNull(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            e3 rootWindowInsets = z1.getRootWindowInsets(view);
            s3 s3Var = e3Var.f91569a;
            s3Var.r(rootWindowInsets);
            s3Var.d(view.getRootView());
            s3Var.s(view.getWindowSystemUiVisibility());
        }
        return e3Var;
    }

    public e3 inset(int i10, int i11, int i12, int i13) {
        return this.f91569a.n(i10, i11, i12, i13);
    }

    @Deprecated
    public e3 replaceSystemWindowInsets(Rect rect) {
        return new a(this).setSystemWindowInsets(o3.c.of(rect)).build();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final k3 f91570a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f91570a = new j3();
                return;
            }
            if (i10 >= 31) {
                this.f91570a = new i3();
                return;
            }
            if (i10 >= 30) {
                this.f91570a = new h3();
            } else if (i10 >= 29) {
                this.f91570a = new g3();
            } else {
                this.f91570a = new f3();
            }
        }

        public e3 build() {
            return this.f91570a.b();
        }

        public a setDisplayCutout(s sVar) {
            this.f91570a.c(sVar);
            return this;
        }

        public a setInsets(int i10, o3.c cVar) {
            this.f91570a.d(i10, cVar);
            return this;
        }

        public a setInsetsIgnoringVisibility(int i10, o3.c cVar) {
            this.f91570a.e(i10, cVar);
            return this;
        }

        @Deprecated
        public a setMandatorySystemGestureInsets(o3.c cVar) {
            this.f91570a.f(cVar);
            return this;
        }

        public a setPrivacyIndicatorBounds(Rect rect) {
            this.f91570a.g(rect);
            return this;
        }

        public a setRoundedCorner(int i10, v0 v0Var) {
            this.f91570a.h(i10, v0Var);
            return this;
        }

        @Deprecated
        public a setStableInsets(o3.c cVar) {
            this.f91570a.i(cVar);
            return this;
        }

        @Deprecated
        public a setSystemGestureInsets(o3.c cVar) {
            this.f91570a.j(cVar);
            return this;
        }

        @Deprecated
        public a setSystemWindowInsets(o3.c cVar) {
            this.f91570a.k(cVar);
            return this;
        }

        @Deprecated
        public a setTappableElementInsets(o3.c cVar) {
            this.f91570a.l(cVar);
            return this;
        }

        public a setVisible(int i10, boolean z10) {
            this.f91570a.m(i10, z10);
            return this;
        }

        public a(e3 e3Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f91570a = new j3(e3Var);
                return;
            }
            if (i10 >= 31) {
                this.f91570a = new i3(e3Var);
                return;
            }
            if (i10 >= 30) {
                this.f91570a = new h3(e3Var);
            } else if (i10 >= 29) {
                this.f91570a = new g3(e3Var);
            } else {
                this.f91570a = new f3(e3Var);
            }
        }
    }

    public e3(e3 e3Var) {
        if (e3Var != null) {
            s3 s3Var = e3Var.f91569a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (s3Var instanceof r3)) {
                this.f91569a = new r3(this, (r3) s3Var);
            } else if (i10 >= 31 && (s3Var instanceof q3)) {
                this.f91569a = new q3(this, (q3) s3Var);
            } else if (i10 >= 30 && (s3Var instanceof p3)) {
                this.f91569a = new p3(this, (p3) s3Var);
            } else if (i10 >= 29 && (s3Var instanceof o3)) {
                this.f91569a = new o3(this, (o3) s3Var);
            } else if (i10 >= 28 && (s3Var instanceof n3)) {
                this.f91569a = new n3(this, (n3) s3Var);
            } else if (s3Var instanceof m3) {
                this.f91569a = new m3(this, (m3) s3Var);
            } else if (s3Var instanceof l3) {
                this.f91569a = new l3(this, (l3) s3Var);
            } else {
                this.f91569a = new s3(this);
            }
            s3Var.e(this);
            return;
        }
        this.f91569a = new s3(this);
    }
}
