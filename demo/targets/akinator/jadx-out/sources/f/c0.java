package f;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f55205a = new c0();

    public final OnBackInvokedCallback createOnBackAnimationCallback(kv.l onBackStarted, kv.l onBackProgressed, kv.a onBackInvoked, kv.a onBackCancelled) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackCancelled, "onBackCancelled");
        return new b0(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
