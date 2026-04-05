package x3;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s1 {
    public static void a(View view, x1 x1Var) {
        z.t1 t1Var = (z.t1) view.getTag(R.id.tag_unhandled_key_listeners);
        if (t1Var == null) {
            t1Var = new z.t1();
            view.setTag(R.id.tag_unhandled_key_listeners, t1Var);
        }
        Objects.requireNonNull(x1Var);
        View.OnUnhandledKeyEventListener r1Var = new r1();
        t1Var.put(x1Var, r1Var);
        view.addOnUnhandledKeyEventListener(r1Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, x1 x1Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        z.t1 t1Var = (z.t1) view.getTag(R.id.tag_unhandled_key_listeners);
        if (t1Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) t1Var.get(x1Var)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z10) {
        view.setAccessibilityHeading(z10);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, boolean z10) {
        view.setScreenReaderFocusable(z10);
    }

    public static void setAutofillId(View view, a4.a aVar) {
        view.setAutofillId(aVar == null ? null : aVar.toAutofillId());
    }
}
