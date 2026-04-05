package k3;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public PendingIntent f70196a;

    /* renamed from: b, reason: collision with root package name */
    public PendingIntent f70197b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f70198c;

    /* renamed from: d, reason: collision with root package name */
    public int f70199d;

    /* renamed from: e, reason: collision with root package name */
    public int f70200e;

    /* renamed from: f, reason: collision with root package name */
    public int f70201f;

    /* renamed from: g, reason: collision with root package name */
    public String f70202g;

    public static j0 fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return h0.a(bubbleMetadata);
        }
        if (i10 == 29) {
            return g0.a(bubbleMetadata);
        }
        return null;
    }

    public static Notification.BubbleMetadata toPlatform(j0 j0Var) {
        if (j0Var == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return h0.b(j0Var);
        }
        if (i10 == 29) {
            return g0.b(j0Var);
        }
        return null;
    }

    public boolean getAutoExpandBubble() {
        return (this.f70201f & 1) != 0;
    }

    public PendingIntent getDeleteIntent() {
        return this.f70197b;
    }

    public int getDesiredHeight() {
        return this.f70199d;
    }

    public int getDesiredHeightResId() {
        return this.f70200e;
    }

    public IconCompat getIcon() {
        return this.f70198c;
    }

    public PendingIntent getIntent() {
        return this.f70196a;
    }

    public String getShortcutId() {
        return this.f70202g;
    }

    public boolean isNotificationSuppressed() {
        return (this.f70201f & 2) != 0;
    }

    public void setFlags(int i10) {
        this.f70201f = i10;
    }
}
