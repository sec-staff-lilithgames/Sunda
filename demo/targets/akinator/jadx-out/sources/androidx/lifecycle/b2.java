package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b2 implements b1 {

    /* renamed from: k, reason: collision with root package name */
    public static final a2 f6515k = new a2(null);

    /* renamed from: l, reason: collision with root package name */
    public static final b2 f6516l = new b2();

    /* renamed from: b, reason: collision with root package name */
    public int f6517b;

    /* renamed from: c, reason: collision with root package name */
    public int f6518c;

    /* renamed from: g, reason: collision with root package name */
    public Handler f6521g;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6519e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6520f = true;

    /* renamed from: h, reason: collision with root package name */
    public final d1 f6522h = new d1(this);

    /* renamed from: i, reason: collision with root package name */
    public final a2.s f6523i = new a2.s(this, 2);

    /* renamed from: j, reason: collision with root package name */
    public final c2 f6524j = new c2(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends y {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: androidx.lifecycle.b2$a$a, reason: collision with other inner class name */
        public static final class C0004a extends y {
            final /* synthetic */ b2 this$0;

            public C0004a(b2 b2Var) {
                this.this$0 = b2Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
                this.this$0.activityResumed$lifecycle_process_release();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
                this.this$0.activityStarted$lifecycle_process_release();
            }
        }

        public a() {
        }

        @Override // androidx.lifecycle.y, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                l2.f6659c.get(activity).setProcessListener(b2.this.f6524j);
            }
        }

        @Override // androidx.lifecycle.y, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            b2.this.activityPaused$lifecycle_process_release();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            z1.registerActivityLifecycleCallbacks(activity, new C0004a(b2.this));
        }

        @Override // androidx.lifecycle.y, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            b2.this.activityStopped$lifecycle_process_release();
        }
    }

    public static final b1 get() {
        return f6515k.get();
    }

    public final void activityPaused$lifecycle_process_release() {
        int i10 = this.f6518c - 1;
        this.f6518c = i10;
        if (i10 == 0) {
            Handler handler = this.f6521g;
            kotlin.jvm.internal.e0.checkNotNull(handler);
            handler.postDelayed(this.f6523i, 700L);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i10 = this.f6518c + 1;
        this.f6518c = i10;
        if (i10 == 1) {
            if (this.f6519e) {
                this.f6522h.handleLifecycleEvent(i0.ON_RESUME);
                this.f6519e = false;
            } else {
                Handler handler = this.f6521g;
                kotlin.jvm.internal.e0.checkNotNull(handler);
                handler.removeCallbacks(this.f6523i);
            }
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i10 = this.f6517b + 1;
        this.f6517b = i10;
        if (i10 == 1 && this.f6520f) {
            this.f6522h.handleLifecycleEvent(i0.ON_START);
            this.f6520f = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.f6517b--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f6521g = new Handler();
        this.f6522h.handleLifecycleEvent(i0.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.f6518c == 0) {
            this.f6519e = true;
            this.f6522h.handleLifecycleEvent(i0.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.f6517b == 0 && this.f6519e) {
            this.f6522h.handleLifecycleEvent(i0.ON_STOP);
            this.f6520f = true;
        }
    }

    @Override // androidx.lifecycle.b1, v5.j, f.i0
    public k0 getLifecycle() {
        return this.f6522h;
    }
}
