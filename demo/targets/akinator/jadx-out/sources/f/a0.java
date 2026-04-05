package f;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f55194a = new a0();

    public final OnBackInvokedCallback createOnBackInvokedCallback(kv.a onBackInvoked) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        return new androidx.appcompat.app.k0(onBackInvoked, 2);
    }

    public final void registerOnBackInvokedCallback(Object dispatcher, int i10, Object callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
    }

    public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
