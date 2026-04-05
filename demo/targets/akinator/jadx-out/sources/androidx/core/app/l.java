package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {
    public static RemoteViews a(Notification.Builder builder) {
        return builder.createHeadsUpContentView();
    }

    public static RemoteViews b(Notification.Builder builder) {
        return builder.createContentView();
    }

    public static RemoteViews c(Notification.Builder builder) {
        return builder.createHeadsUpContentView();
    }

    public static Notification.Builder d(Context context, Notification notification) {
        return Notification.Builder.recoverBuilder(context, notification);
    }
}
