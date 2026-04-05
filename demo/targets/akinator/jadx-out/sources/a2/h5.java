package a2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h5 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(outline, "outline");
        Outline outline2 = ((j5) view).f3679g.getOutline();
        kotlin.jvm.internal.e0.checkNotNull(outline2);
        outline.set(outline2);
    }
}
