package x3;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final b4 f91563a;

    public d4(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f91563a = new a4(windowInsetsController, this, new d1(windowInsetsController));
        } else {
            this.f91563a = new z3(windowInsetsController, this, new d1(windowInsetsController));
        }
    }

    @Deprecated
    public static d4 toWindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        return new d4(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(c4 c4Var) {
        this.f91563a.a();
    }

    public void controlWindowInsetsAnimation(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, c3 c3Var) {
        this.f91563a.b(i10, j10, interpolator, cancellationSignal);
    }

    public int getSystemBarsBehavior() {
        return this.f91563a.c();
    }

    public void hide(int i10) {
        this.f91563a.d(i10);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.f91563a.isAppearanceLightNavigationBars();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.f91563a.isAppearanceLightStatusBars();
    }

    public void removeOnControllableInsetsChangedListener(c4 c4Var) {
        this.f91563a.e();
    }

    public void setAppearanceLightNavigationBars(boolean z10) {
        this.f91563a.setAppearanceLightNavigationBars(z10);
    }

    public void setAppearanceLightStatusBars(boolean z10) {
        this.f91563a.setAppearanceLightStatusBars(z10);
    }

    public void setSystemBarsBehavior(int i10) {
        this.f91563a.f(i10);
    }

    public void show(int i10) {
        this.f91563a.g(i10);
    }

    public d4(Window window, View view) {
        d1 d1Var = new d1(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f91563a = new a4(window, this, d1Var);
            return;
        }
        if (i10 >= 30) {
            this.f91563a = new z3(window, this, d1Var);
        } else if (i10 >= 26) {
            this.f91563a = new x3(window, d1Var);
        } else {
            this.f91563a = new w3(window, d1Var);
        }
    }
}
