package nj;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class s implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public ji.t f77007f;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f77004b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public boolean f77005c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f77006e = true;

    /* renamed from: g, reason: collision with root package name */
    public final pu.b f77008g = pu.b.create();

    public rt.a foregroundFlowable() {
        return this.f77008g.toFlowable(mt.b.f74912c).publish();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f77006e = true;
        ji.t tVar = this.f77007f;
        Handler handler = this.f77004b;
        if (tVar != null) {
            handler.removeCallbacks(tVar);
        }
        ji.t tVar2 = new ji.t(this, 20);
        this.f77007f = tVar2;
        handler.postDelayed(tVar2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f77006e = false;
        boolean z10 = this.f77005c;
        this.f77005c = true;
        ji.t tVar = this.f77007f;
        if (tVar != null) {
            this.f77004b.removeCallbacks(tVar);
        }
        if (z10) {
            return;
        }
        j0.logi("went foreground");
        this.f77008g.onNext("ON_FOREGROUND");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
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
