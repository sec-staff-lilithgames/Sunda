package x3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends androidx.recyclerview.widget.l1 {

    /* renamed from: b, reason: collision with root package name */
    public View f91553b;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsetsController f91554c;

    @Override // androidx.recyclerview.widget.l1
    public final void b() {
        View view = this.f91553b;
        WindowInsetsController windowInsetsController = this.f91554c;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.b();
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b1 b1Var = new b1(atomicBoolean, 0);
        windowInsetsController.addOnControllableInsetsChangedListener(b1Var);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(b1Var);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // androidx.recyclerview.widget.l1
    public final void f() {
        View view = this.f91553b;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f91554c;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.f();
    }
}
