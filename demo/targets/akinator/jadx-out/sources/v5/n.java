package v5;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static final j get(View view) {
        e0.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            j jVar = tag instanceof j ? (j) tag : null;
            if (jVar != null) {
                return jVar;
            }
            Object parentOrViewTreeDisjointParent = d4.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, j jVar) {
        e0.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, jVar);
    }
}
