package io.odeeo.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.bidmachine.media3.exoplayer.b1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdUnit$getActivityLifecycleListener$1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67879a;

    public AdUnit$getActivityLifecycleListener$1(AdUnit adUnit) {
        this.f67879a = adUnit;
    }

    public static final void a(AdUnit this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.N.onCreate();
    }

    public static final void b(AdUnit this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.N.onResume();
    }

    public static final void c(AdUnit this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.N.onStart();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e0.checkNotNullParameter(activity, "activity");
        if (activity == this.f67879a.f67821b) {
            this.f67879a.f67821b.runOnUiThread(new o(this.f67879a, 7));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        if (activity == this.f67879a.f67821b) {
            this.f67879a.f67821b.runOnUiThread(new b1(this.f67879a, 5, activity, this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        if (activity != this.f67879a.f67821b) {
            return;
        }
        this.f67879a.f67821b.runOnUiThread(new o(this.f67879a, 6));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        e0.checkNotNullParameter(activity, "activity");
        e0.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        if (activity == this.f67879a.f67821b) {
            this.f67879a.f67821b.runOnUiThread(new o(this.f67879a, 5));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
    }

    public static final void a(AdUnit this$0, Activity activity, AdUnit$getActivityLifecycleListener$1 this$1) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(activity, "$activity");
        e0.checkNotNullParameter(this$1, "this$1");
        this$0.N.onDestroyed();
        activity.getApplication().unregisterActivityLifecycleCallbacks(this$1);
        AdUnitBase adUnit$odeeoSdk_release = this$0.getAdUnit$odeeoSdk_release();
        if (adUnit$odeeoSdk_release == null) {
            return;
        }
        adUnit$odeeoSdk_release.onApplicationDestroy();
    }
}
