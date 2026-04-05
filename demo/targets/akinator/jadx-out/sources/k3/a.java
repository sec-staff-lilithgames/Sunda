package k3;

import android.app.Activity;
import android.app.Notification;
import android.app.job.JobParameters;
import android.graphics.Path;
import android.view.DisplayCutout;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static Path a(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static int b(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f7502g;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static boolean c(Notification.Action action) {
        return action.isAuthenticationRequired();
    }

    public static boolean d(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    public static void e(Notification.Action.Builder builder, boolean z10) {
        builder.setAuthenticationRequired(z10);
    }

    public static void f(Notification.Builder builder, int i10) {
        builder.setForegroundServiceBehavior(i10);
    }
}
