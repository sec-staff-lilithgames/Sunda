package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ha implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReferenceA;
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        synchronized (Ia.f31875c) {
            try {
                if (Ia.f31874b != null && (weakReferenceA = Ia.a(Ia.f31873a, activity)) != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                    Ia.f31876d.remove(weakReferenceA);
                    if (Ia.f31876d.isEmpty()) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Ia.d(), "access$getTAG$p(...)");
                        Objects.toString(Ia.f31874b);
                        Picasso picasso = Ia.f31874b;
                        if (picasso != null) {
                            picasso.shutdown();
                        }
                        Ia.f31874b = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }
}
