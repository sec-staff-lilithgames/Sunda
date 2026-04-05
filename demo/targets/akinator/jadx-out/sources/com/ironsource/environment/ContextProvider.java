package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ContextProvider {

    /* renamed from: d, reason: collision with root package name */
    private static volatile ContextProvider f36626d;

    /* renamed from: a, reason: collision with root package name */
    private Activity f36627a;

    /* renamed from: b, reason: collision with root package name */
    private Context f36628b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f36629c = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f36626d == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (f36626d == null) {
                        f36626d = new ContextProvider();
                    }
                } finally {
                }
            }
        }
        return f36626d;
    }

    public Context getActiveContext() {
        Activity activity = this.f36627a;
        return activity != null ? activity : this.f36628b;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f36628b;
        return (context != null || (activity = this.f36627a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f36627a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f36629c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f36627a = activity;
            Iterator<a> it = this.f36629c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f36627a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f36629c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f36627a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f36628b = context;
        }
    }
}
