package k3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public Object f70207b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f70208c;

    /* renamed from: e, reason: collision with root package name */
    public final int f70209e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f70210f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70211g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70212h = false;

    public l(Activity activity) {
        this.f70208c = activity;
        this.f70209e = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f70208c == activity) {
            this.f70208c = null;
            this.f70211g = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.f70211g || this.f70212h || this.f70210f) {
            return;
        }
        Object obj = this.f70207b;
        try {
            Object obj2 = m.f70218c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f70209e) {
                m.f70222g.postAtFrontOfQueue(new k(m.f70217b.get(activity), obj2));
                this.f70212h = true;
                this.f70207b = null;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.f70208c == activity) {
            this.f70210f = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
