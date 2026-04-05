package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.applovin.adview.AppLovinFullscreenActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.applovin.impl.b {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f13804a = new WeakReference(null);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f13805b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f13806c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f13807d;

        public a(Class cls, b bVar, c cVar) {
            this.f13805b = cls;
            this.f13806c = bVar;
            this.f13807d = cVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f13805b.isInstance(activity) && this.f13804a.get() == null) {
                this.f13804a = new WeakReference(activity);
                this.f13806c.a(activity);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f13805b.isInstance(activity) && !activity.isChangingConfigurations() && this.f13804a.get() == activity) {
                this.f13807d.b(this);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(Activity activity);
    }

    public static void a(Context context, Class cls, c cVar, b bVar) {
        cVar.a(new a(cls, bVar, cVar));
        a(context, cls);
    }

    public static void b(Activity activity) {
        WindowInsetsController insetsController;
        if (!o0.b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.statusBars());
        }
    }

    public static void c(Activity activity) {
        if (!o0.b()) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        WindowInsetsController insetsController = activity.getWindow().getInsetsController();
        if (insetsController == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.systemBars());
        }
    }

    public static boolean d(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed();
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static String b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        try {
            return appLovinFullscreenActivity.getPackageManager().getActivityInfo(new ComponentName(appLovinFullscreenActivity, appLovinFullscreenActivity.getClass()), 0).taskAffinity;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity) {
        WindowInsetsController insetsController;
        if (o0.b() && (insetsController = activity.getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.navigationBars());
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(4866);
        }
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        ComponentName componentName;
        if (!o0.j()) {
            return null;
        }
        try {
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) appLovinFullscreenActivity.getSystemService("activity")).getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                while (it.hasNext()) {
                    ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                    ComponentName componentName2 = taskInfo.topActivity;
                    String name = appLovinFullscreenActivity.getClass().getName();
                    if (componentName2 != null && componentName2.getClassName().equals(name) && (componentName = taskInfo.baseActivity) != null) {
                        return appLovinFullscreenActivity.getPackageManager().getActivityInfo(componentName, 0).taskAffinity;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
