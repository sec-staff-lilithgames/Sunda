package ir;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.Window;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final or.b f68358a = new or.b();

    public static final void applyFullscreenActivity(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        applyFullscreenActivity(activity, true);
    }

    public static /* synthetic */ void applyFullscreenActivity$default(Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        applyFullscreenActivity(activity, z10);
    }

    public static final void applySystemUiVisibility(Window window, boolean z10) {
        e0.checkNotNullParameter(window, "window");
        o.applySystemUiVisibility(window, z10);
    }

    public static final void cancelOnUiThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f68358a.cancel(runnable);
    }

    public static final int defineOrientationBySize(int i10, int i11) {
        return i10 > i11 ? 2 : 1;
    }

    public static final void finishActivityWithoutAnimation(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        o.finishActivityWithoutAnimation(activity);
    }

    public static final Boolean hideKeyboard(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        return o.hideKeyboard(activity);
    }

    public static final boolean isUiThread() {
        return e0.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final MotionEvent obtainMotionEvent(int i10, int i11, int i12) {
        MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i10, i11, i12, 0);
        e0.checkNotNullExpressionValue(motionEventObtain, "obtain(\n            Syst…,\n            0\n        )");
        return motionEventObtain;
    }

    public static final boolean onUiThread(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return f68358a.executeSafely(runnable);
    }

    public static final String orientationToString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "UNKNOWN" : "LANDSCAPE" : "PORTRAIT" : "UNDEFINED";
    }

    public static final x0 setActivityBackgroundColor(Activity activity, int i10) {
        e0.checkNotNullParameter(activity, "activity");
        return o.setActivityBackgroundColor(activity, i10);
    }

    public static final void setNoActivityTransition(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        o.setNoActivityTransition(activity);
    }

    public static final x0 setWindowBackgroundColor(Window window, int i10) {
        return o.setWindowBackgroundColor(window, i10);
    }

    public static final void applyFullscreenActivity(Activity activity, boolean z10) {
        e0.checkNotNullParameter(activity, "activity");
        o.applyFullscreenActivity(activity, z10);
    }

    public static final boolean onUiThread(Runnable runnable, long j10) {
        if (runnable == null) {
            return false;
        }
        return f68358a.scheduleSafely(runnable, j10);
    }
}
