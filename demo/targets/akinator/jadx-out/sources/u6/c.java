package u6;

import android.app.Notification;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c {
    void cancelNotification(int i10);

    void notify(int i10, Notification notification);

    void startForeground(int i10, int i11, Notification notification);

    void stop(int i10);
}
