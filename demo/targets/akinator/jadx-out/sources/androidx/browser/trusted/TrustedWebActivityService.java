package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.appcompat.app.j0;
import java.util.Locale;
import k3.r0;
import w.a;
import w.b;
import w.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public NotificationManager f5304b;

    /* renamed from: c, reason: collision with root package name */
    public int f5305c = -1;

    /* renamed from: e, reason: collision with root package name */
    public final c f5306e = new c(this);

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public abstract a getTokenStore();

    public boolean onAreNotificationsEnabled(String str) {
        if (this.f5304b == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
        if (!r0.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return j0.i0(this.f5304b, a(str));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f5306e;
    }

    public void onCancelNotification(String str, int i10) {
        NotificationManager notificationManager = this.f5304b;
        if (notificationManager == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
        notificationManager.cancel(str, i10);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f5304b = (NotificationManager) getSystemService("notification");
    }

    public Bundle onExtraCommand(String str, Bundle bundle, b bVar) {
        return null;
    }

    public Parcelable[] onGetActiveNotifications() {
        NotificationManager notificationManager = this.f5304b;
        if (notificationManager != null) {
            return notificationManager.getActiveNotifications();
        }
        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public Bundle onGetSmallIconBitmap() {
        int iOnGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (iOnGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), iOnGetSmallIconId));
        return bundle;
    }

    public int onGetSmallIconId() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean onNotifyNotificationWithChannel(String str, int i10, Notification notification, String str2) {
        if (this.f5304b == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
        if (!r0.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strA = a(str2);
            notification = j0.e(this, this.f5304b, notification, strA, str2);
            if (!j0.i0(this.f5304b, strA)) {
                return false;
            }
        }
        this.f5304b.notify(str, i10, notification);
        return true;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f5305c = -1;
        return super.onUnbind(intent);
    }
}
