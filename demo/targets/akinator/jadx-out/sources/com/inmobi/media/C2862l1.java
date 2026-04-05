package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.moloco.sdk.BKC.JzVV;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2862l1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerC2828j1 f33036a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f33037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f33038c;

    public static final void a(Context context, C2862l1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (C2879m1.a(C2879m1.f33066a, context) || this$0.f33037b != null) {
            return;
        }
        this$0.f33036a.sendEmptyMessageDelayed(1001, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f33037b;
        if (!kotlin.jvm.internal.e0.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f33037b = new WeakReference(activity);
        }
        this.f33036a.removeMessages(1001);
        this.f33036a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f33037b;
        if (!kotlin.jvm.internal.e0.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f33037b = new WeakReference(activity);
        }
        this.f33036a.removeMessages(1001);
        this.f33036a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f33037b;
        if (kotlin.jvm.internal.e0.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f33036a.sendEmptyMessageDelayed(1001, 3000L);
        } else if (this.f33037b == null) {
            C2925od.a(new zk.n(25, this.f33038c, this));
        }
    }

    public C2862l1(Context context) {
        this.f33038c = context;
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mainLooper, JzVV.ClSEJdEyg);
        this.f33036a = new HandlerC2828j1(mainLooper);
    }
}
