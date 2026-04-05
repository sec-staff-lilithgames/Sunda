package g4;

import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import x3.g2;
import x3.j2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final c a(View view) {
        c cVar = (c) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(R.id.pooling_container_listener_holder_tag, cVar2);
        return cVar2;
    }

    public static final void addPoolingContainerListener(View view, b listener) {
        e0.checkNotNullParameter(view, "<this>");
        e0.checkNotNullParameter(listener, "listener");
        a(view).addListener(listener);
    }

    public static final void callPoolingContainerOnRelease(View view) {
        e0.checkNotNullParameter(view, "<this>");
        Iterator<Object> it = j2.getAllViews(view).iterator();
        while (it.hasNext()) {
            a((View) it.next()).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(ViewGroup viewGroup) {
        e0.checkNotNullParameter(viewGroup, "<this>");
        Iterator<Object> it = g2.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            a((View) it.next()).onRelease();
        }
    }

    public static final boolean isPoolingContainer(View view) {
        e0.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R.id.is_pooling_container_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(View view) {
        e0.checkNotNullParameter(view, "<this>");
        for (Object obj : j2.getAncestors(view)) {
            if ((obj instanceof View) && isPoolingContainer((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void removePoolingContainerListener(View view, b listener) {
        e0.checkNotNullParameter(view, "<this>");
        e0.checkNotNullParameter(listener, "listener");
        a(view).removeListener(listener);
    }

    public static final void setPoolingContainer(View view, boolean z10) {
        e0.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.is_pooling_container_tag, Boolean.valueOf(z10));
    }
}
