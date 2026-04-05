package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static void b(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static Parcelable a(Icon icon) {
        return icon;
    }
}
