package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import androidx.core.app.NotificationCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {
    public static void a(Notification.ProgressStyle progressStyle, int i10) {
        progressStyle.setProgress(i10);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z10) {
        progressStyle.setProgressIndeterminate(z10);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<NotificationCompat.i.a> list) {
        for (NotificationCompat.i.a aVar : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(aVar.getPosition()).setColor(aVar.getColor()).setId(aVar.getId()));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<NotificationCompat.i.b> list) {
        for (NotificationCompat.i.b bVar : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(bVar.getLength()).setColor(bVar.getColor()).setId(bVar.getId()));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z10) {
        progressStyle.setStyledByProgress(z10);
    }
}
