package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.NotificationManager;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.canUseFullScreenIntent();
    }

    public static float b(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    public static float c(VelocityTracker velocityTracker, int i10, int i11) {
        return velocityTracker.getAxisVelocity(i10, i11);
    }

    public static int d(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
    }

    public static int e(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
    }

    public static boolean f(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.isAccessibilityDataSensitive();
    }

    public static boolean g(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.isAxisSupported(i10);
    }

    public static void h(ContentCaptureSession contentCaptureSession, List list) {
        contentCaptureSession.notifyViewsAppeared(list);
    }

    public static void i(AccessibilityEvent accessibilityEvent, boolean z10) {
        accessibilityEvent.setAccessibilityDataSensitive(z10);
    }

    public static void j(ActivityOptions activityOptions, boolean z10) {
        activityOptions.setShareIdentityEnabled(z10);
    }
}
