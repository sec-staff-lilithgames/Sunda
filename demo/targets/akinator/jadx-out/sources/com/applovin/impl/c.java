package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final List f13686a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f13687b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f13688c;

    public c(Context context) {
        this.f13687b = new WeakReference(null);
        this.f13688c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f13687b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f13688c = this.f13687b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f13688c.get();
    }

    public Activity b() {
        return (Activity) this.f13687b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f13686a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f13686a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f13688c = new WeakReference(null);
        Iterator it = new ArrayList(this.f13686a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f13687b = weakReference;
        this.f13688c = weakReference;
        Iterator it = new ArrayList(this.f13686a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f13686a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f13686a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f13686a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStopped(activity);
        }
    }

    public void a(b bVar) {
        this.f13686a.add(bVar);
    }

    public void b(b bVar) {
        this.f13686a.remove(bVar);
    }
}
