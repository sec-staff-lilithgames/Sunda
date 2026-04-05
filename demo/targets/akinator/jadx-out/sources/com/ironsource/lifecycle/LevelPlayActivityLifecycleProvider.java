package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LevelPlayActivityLifecycleProvider extends ContentProvider {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f37180a = new WeakReference<>(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            e0.checkNotNullParameter(activity, "activity");
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f37180a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            e0.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            e0.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            e0.checkNotNullParameter(activity, "activity");
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f37180a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            e0.checkNotNullParameter(activity, "activity");
            e0.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            e0.checkNotNullParameter(activity, "activity");
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f37180a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            e0.checkNotNullParameter(activity, "activity");
        }
    }

    private final void a(Application application) {
        application.registerActivityLifecycleCallbacks(new b());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        e0.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        e0.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        e0.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() == null) {
            IronLog.INTERNAL.verbose("context is null");
            return true;
        }
        if (!(getContext() instanceof Application)) {
            IronLog.INTERNAL.verbose("context is not application");
            return true;
        }
        Context context = getContext();
        e0.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        a((Application) context);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        e0.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        e0.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
