package x3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.l1 f91557a;

    public d1(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f91557a = new androidx.recyclerview.widget.l1(view);
            return;
        }
        c1 c1Var = new c1(view);
        c1Var.f91553b = view;
        this.f91557a = c1Var;
    }

    public void hide() {
        this.f91557a.b();
    }

    public void show() {
        this.f91557a.f();
    }

    public d1(WindowInsetsController windowInsetsController) {
        c1 c1Var = new c1(null);
        c1Var.f91554c = windowInsetsController;
        this.f91557a = c1Var;
    }
}
