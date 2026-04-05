package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;
    private volatile TargetActivityInfo targetActivityInfo;
    public static final Companion Companion = new Companion(null);
    private static final ActivityManager instance = new ActivityManager();
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArraySet<LifeCycleCallback> callbacks = new CopyOnWriteArraySet<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void addLifecycleListener(LifeCycleCallback listener) {
            e0.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void deInit$vungle_ads_release(Context context) {
            e0.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }

        public final ActivityManager getInstance$vungle_ads_release() {
            return ActivityManager.instance;
        }

        public final void init(Context context) {
            e0.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void removeLifecycleListener(LifeCycleCallback listener) {
            e0.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final boolean startWhenForeground(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            e0.checkNotNullParameter(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, intent, intent2, presenterAdOpenCallback);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new TargetActivityInfo(new WeakReference(context), intent, intent2, presenterAdOpenCallback);
            return false;
        }

        private Companion() {
        }

        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TargetActivityInfo {
        private final PresenterAdOpenCallback adOpenCallback;
        private final WeakReference<Context> context;
        private final Intent deepLinkOverrideIntent;
        private final Intent defaultIntent;

        public TargetActivityInfo(WeakReference<Context> context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            e0.checkNotNullParameter(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = presenterAdOpenCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TargetActivityInfo copy$default(TargetActivityInfo targetActivityInfo, WeakReference weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = targetActivityInfo.context;
            }
            if ((i10 & 2) != 0) {
                intent = targetActivityInfo.deepLinkOverrideIntent;
            }
            if ((i10 & 4) != 0) {
                intent2 = targetActivityInfo.defaultIntent;
            }
            if ((i10 & 8) != 0) {
                presenterAdOpenCallback = targetActivityInfo.adOpenCallback;
            }
            return targetActivityInfo.copy(weakReference, intent, intent2, presenterAdOpenCallback);
        }

        public final WeakReference<Context> component1() {
            return this.context;
        }

        public final Intent component2() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent component3() {
            return this.defaultIntent;
        }

        public final PresenterAdOpenCallback component4() {
            return this.adOpenCallback;
        }

        public final TargetActivityInfo copy(WeakReference<Context> context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            e0.checkNotNullParameter(context, "context");
            return new TargetActivityInfo(context, intent, intent2, presenterAdOpenCallback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetActivityInfo)) {
                return false;
            }
            TargetActivityInfo targetActivityInfo = (TargetActivityInfo) obj;
            return e0.areEqual(this.context, targetActivityInfo.context) && e0.areEqual(this.deepLinkOverrideIntent, targetActivityInfo.deepLinkOverrideIntent) && e0.areEqual(this.defaultIntent, targetActivityInfo.defaultIntent) && e0.areEqual(this.adOpenCallback, targetActivityInfo.adOpenCallback);
        }

        public final PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final WeakReference<Context> getContext() {
            return this.context;
        }

        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            PresenterAdOpenCallback presenterAdOpenCallback = this.adOpenCallback;
            return iHashCode3 + (presenterAdOpenCallback != null ? presenterAdOpenCallback.hashCode() : 0);
        }

        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(LifeCycleCallback lifeCycleCallback) {
        this.callbacks.add(lifeCycleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objM7131constructorimpl;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            int i10 = z.f87419c;
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl != null) {
            Logger.Companion.e(TAG, "Error initializing ActivityManager", thM7134exceptionOrNullimpl);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
        try {
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Failed to start activity: " + e10);
            if (intent != null && presenterAdOpenCallback != null) {
                try {
                    presenterAdOpenCallback.onDeeplinkClick(false);
                } catch (Exception unused) {
                }
            }
            if (intent != null && intent2 != null) {
                context.startActivity(intent2);
                return true;
            }
        }
        if (intent == null) {
            if (intent2 != null) {
                context.startActivity(intent2);
            }
            return false;
        }
        context.startActivity(intent);
        if (presenterAdOpenCallback != null) {
            presenterAdOpenCallback.onDeeplinkClick(true);
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e0.checkNotNullParameter(activity, "activity");
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        e0.checkNotNullParameter(activity, "activity");
        e0.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        TargetActivityInfo targetActivityInfo = this.targetActivityInfo;
        if (targetActivityInfo != null) {
            Context it = targetActivityInfo.getContext().get();
            if (it != null) {
                Companion companion = Companion;
                e0.checkNotNullExpressionValue(it, "it");
                companion.startWhenForeground(it, targetActivityInfo.getDeepLinkOverrideIntent(), targetActivityInfo.getDefaultIntent(), targetActivityInfo.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((LifeCycleCallback) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((LifeCycleCallback) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(LifeCycleCallback callback) {
        e0.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class LifeCycleCallback {
        public void onBackground() {
        }

        public void onForeground() {
        }
    }
}
