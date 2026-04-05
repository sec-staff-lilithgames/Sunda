package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, t0 t0Var) {
        Objects.requireNonNull(t0Var);
        k0 k0Var = new k0(t0Var, 0);
        a2.o.f(obj).registerOnBackInvokedCallback(1000000, k0Var);
        return k0Var;
    }

    public static void c(Object obj, Object obj2) {
        a2.o.f(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
