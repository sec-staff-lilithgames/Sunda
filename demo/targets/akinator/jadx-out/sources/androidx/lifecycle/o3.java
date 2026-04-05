package androidx.lifecycle;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o3 {
    public static final b1 get(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            b1 b1Var = tag instanceof b1 ? (b1) tag : null;
            if (b1Var != null) {
                return b1Var;
            }
            Object parentOrViewTreeDisjointParent = d4.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, b1 b1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, b1Var);
    }
}
