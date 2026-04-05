package androidx.lifecycle;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p3 {
    public static final n3 get(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            n3 n3Var = tag instanceof n3 ? (n3) tag : null;
            if (n3Var != null) {
                return n3Var;
            }
            Object parentOrViewTreeDisjointParent = d4.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, n3 n3Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, n3Var);
    }
}
