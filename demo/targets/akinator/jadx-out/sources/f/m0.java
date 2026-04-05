package f;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m0 {
    public static final i0 get(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            i0 i0Var = tag instanceof i0 ? (i0) tag : null;
            if (i0Var != null) {
                return i0Var;
            }
            Object parentOrViewTreeDisjointParent = d4.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, i0 onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
