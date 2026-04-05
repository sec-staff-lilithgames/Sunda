package x3;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z3 extends b4 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f91725a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f91726b;

    /* renamed from: c, reason: collision with root package name */
    public final z.t1 f91727c;

    /* renamed from: d, reason: collision with root package name */
    public final Window f91728d;

    public z3(WindowInsetsController windowInsetsController, d4 d4Var, d1 d1Var) {
        this.f91727c = new z.t1();
        this.f91725a = windowInsetsController;
        this.f91726b = d1Var;
    }

    @Override // x3.b4
    public final void a() {
        z.t1 t1Var = this.f91727c;
        if (t1Var.containsKey(null)) {
            return;
        }
        b1 b1Var = new b1(this, 1);
        t1Var.put(null, b1Var);
        this.f91725a.addOnControllableInsetsChangedListener(b1Var);
    }

    @Override // x3.b4
    public final void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal) {
        this.f91725a.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new y3());
    }

    @Override // x3.b4
    public int c() {
        Window window = this.f91728d;
        if (window == null) {
            return this.f91725a.getSystemBarsBehavior();
        }
        Object tag = window.getDecorView().getTag(356039078);
        if (tag != null) {
            return ((Integer) tag).intValue();
        }
        return 1;
    }

    @Override // x3.b4
    public final void d(int i10) {
        if ((i10 & 8) != 0) {
            this.f91726b.hide();
        }
        this.f91725a.hide(i10 & (-9));
    }

    @Override // x3.b4
    public final void e() {
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = (WindowInsetsController.OnControllableInsetsChangedListener) this.f91727c.remove(null);
        if (onControllableInsetsChangedListener != null) {
            this.f91725a.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }
    }

    @Override // x3.b4
    public void f(int i10) {
        Window window = this.f91728d;
        if (window == null) {
            this.f91725a.setSystemBarsBehavior(i10);
            return;
        }
        window.getDecorView().setTag(356039078, Integer.valueOf(i10));
        if (i10 == 0) {
            i(6144);
            return;
        }
        if (i10 == 1) {
            i(4096);
            h(2048);
        } else {
            if (i10 != 2) {
                return;
            }
            i(2048);
            h(4096);
        }
    }

    @Override // x3.b4
    public final void g(int i10) {
        if ((i10 & 8) != 0) {
            this.f91726b.show();
        }
        this.f91725a.show(i10 & (-9));
    }

    public final void h(int i10) {
        View decorView = this.f91728d.getDecorView();
        decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
    }

    public final void i(int i10) {
        View decorView = this.f91728d.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }

    @Override // x3.b4
    public boolean isAppearanceLightNavigationBars() {
        this.f91725a.setSystemBarsAppearance(0, 0);
        return (this.f91725a.getSystemBarsAppearance() & 16) != 0;
    }

    @Override // x3.b4
    public boolean isAppearanceLightStatusBars() {
        this.f91725a.setSystemBarsAppearance(0, 0);
        return (this.f91725a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // x3.b4
    public void setAppearanceLightNavigationBars(boolean z10) {
        Window window = this.f91728d;
        if (z10) {
            if (window != null) {
                h(16);
            }
            this.f91725a.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                i(16);
            }
            this.f91725a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // x3.b4
    public void setAppearanceLightStatusBars(boolean z10) {
        Window window = this.f91728d;
        if (z10) {
            if (window != null) {
                h(Segment.SIZE);
            }
            this.f91725a.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                i(Segment.SIZE);
            }
            this.f91725a.setSystemBarsAppearance(0, 8);
        }
    }

    public z3(Window window, d4 d4Var, d1 d1Var) {
        this(window.getInsetsController(), d4Var, d1Var);
        this.f91728d = window;
    }
}
