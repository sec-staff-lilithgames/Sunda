package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l2 extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6659c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public k2 f6660b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }

            public final void registerIn(Activity activity) {
                kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new b());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.registerIn(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            l2.f6659c.dispatch$lifecycle_runtime_release(activity, i0.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            l2.f6659c.dispatch$lifecycle_runtime_release(activity, i0.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            l2.f6659c.dispatch$lifecycle_runtime_release(activity, i0.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            l2.f6659c.dispatch$lifecycle_runtime_release(activity, i0.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            l2.f6659c.dispatch$lifecycle_runtime_release(activity, i0.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            l2.f6659c.dispatch$lifecycle_runtime_release(activity, i0.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        }
    }

    public static final l2 get(Activity activity) {
        return f6659c.get(activity);
    }

    public static final void injectIfNeededIn(Activity activity) {
        f6659c.injectIfNeededIn(activity);
    }

    public final void a(i0 i0Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(activity, "getActivity(...)");
            f6659c.dispatch$lifecycle_runtime_release(activity, i0Var);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        k2 k2Var = this.f6660b;
        if (k2Var != null) {
            ((c2) k2Var).onCreate();
        }
        a(i0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(i0.ON_DESTROY);
        this.f6660b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(i0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        k2 k2Var = this.f6660b;
        if (k2Var != null) {
            ((c2) k2Var).onResume();
        }
        a(i0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        k2 k2Var = this.f6660b;
        if (k2Var != null) {
            ((c2) k2Var).onStart();
        }
        a(i0.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(i0.ON_STOP);
    }

    public final void setProcessListener(k2 k2Var) {
        this.f6660b = k2Var;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void dispatch$lifecycle_runtime_release(Activity activity, i0 event) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            if (activity instanceof b1) {
                k0 lifecycle = ((b1) activity).getLifecycle();
                if (lifecycle instanceof d1) {
                    ((d1) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        public final l2 get(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.e0.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (l2) fragmentFindFragmentByTag;
        }

        public final void injectIfNeededIn(Activity activity) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                b.Companion.registerIn(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new l2(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public static /* synthetic */ void get$annotations(Activity activity) {
        }
    }
}
