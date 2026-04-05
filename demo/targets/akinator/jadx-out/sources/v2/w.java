package v2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        result.setRect(0, 0, view.getWidth(), view.getHeight());
        result.setAlpha(0.0f);
    }
}
