package com.iab.omid.library.odeeoio.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static b f31176a = new b();

    /* renamed from: b, reason: collision with root package name */
    private boolean f31177b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31178c;

    /* renamed from: d, reason: collision with root package name */
    private a f31179d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f31176a;
    }

    private void e() {
        boolean z10 = !this.f31178c;
        Iterator<com.iab.omid.library.odeeoio.adsession.a> it = com.iab.omid.library.odeeoio.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    public void b() {
        this.f31177b = true;
        this.f31178c = false;
        e();
    }

    public void c() {
        this.f31177b = false;
        this.f31178c = false;
        this.f31179d = null;
    }

    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View viewE;
        boolean z10 = false;
        boolean z11 = d().importance != 100;
        boolean z12 = true;
        for (com.iab.omid.library.odeeoio.adsession.a aVar : com.iab.omid.library.odeeoio.b.a.a().c()) {
            if (aVar.f() && (viewE = aVar.e()) != null && viewE.hasWindowFocus()) {
                z12 = false;
            }
        }
        if (z11 && z12) {
            z10 = true;
        }
        a(z10);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f31179d = aVar;
    }

    private void a(boolean z10) {
        if (this.f31178c != z10) {
            this.f31178c = z10;
            if (this.f31177b) {
                e();
                a aVar = this.f31179d;
                if (aVar != null) {
                    aVar.a(!z10);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
