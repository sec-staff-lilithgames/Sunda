package f;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l0 {
    public static final w get(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.report_drawn);
            w wVar = tag instanceof w ? (w) tag : null;
            if (wVar != null) {
                return wVar;
            }
            Object parentOrViewTreeDisjointParent = d4.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, w fullyDrawnReporterOwner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
