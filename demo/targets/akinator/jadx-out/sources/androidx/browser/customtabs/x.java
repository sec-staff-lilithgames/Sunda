package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.NotificationManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.canPostPromotedNotifications();
    }

    public static boolean b(Notification notification) {
        return notification.hasPromotableCharacteristics();
    }

    public static void c(ActivityOptions activityOptions, boolean z10) {
        activityOptions.setAllowPassThroughOnTouchOutside(z10);
    }

    public static void d(Notification.Builder builder, String str) {
        builder.setShortCriticalText(str);
    }
}
