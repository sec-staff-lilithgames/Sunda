package d4;

import android.view.View;
import android.view.ViewParent;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final ViewParent getParentOrViewTreeDisjointParent(View view) {
        e0.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void setViewTreeDisjointParent(View view, ViewParent viewParent) {
        e0.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_disjoint_parent, viewParent);
    }
}
