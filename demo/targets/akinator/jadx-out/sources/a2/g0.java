package a2;

import android.R;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final void addSetProgressAction(y3.c info, e2.c0 semanticsNode) {
        e2.a aVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        kotlin.jvm.internal.e0.checkNotNullParameter(semanticsNode, "semanticsNode");
        if (!q0.access$enabled(semanticsNode) || (aVar = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), e2.o.f53581a.getSetProgress())) == null) {
            return;
        }
        info.addAction(new c.a(R.id.accessibilityActionSetProgress, aVar.getLabel()));
    }
}
