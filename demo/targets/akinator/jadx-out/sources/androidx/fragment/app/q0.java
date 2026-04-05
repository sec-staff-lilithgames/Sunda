package androidx.fragment.app;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f6437a = new q0();

    public final WindowInsets onApplyWindowInsets(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v10, WindowInsets insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v10, insets);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
        return windowInsetsOnApplyWindowInsets;
    }
}
