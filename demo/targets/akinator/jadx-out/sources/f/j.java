package f;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f55229a = new j();

    public final OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
        return onBackInvokedDispatcher;
    }
}
