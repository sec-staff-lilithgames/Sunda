package com.google.firebase.messaging;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.DisplayCutout;
import androidx.work.impl.foreground.SystemForegroundService;
import com.applovin.impl.d9;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class b0 {
    public static void A(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        systemForegroundService.startForeground(i10, notification, i11);
    }

    public static void B(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        try {
            systemForegroundService.startForeground(i10, notification, i11);
        } catch (ForegroundServiceStartNotAllowedException e10) {
            n6.c0.get().warning(SystemForegroundService.f7510g, "Unable to start foreground service", e10);
        } catch (SecurityException e11) {
            n6.c0.get().warning(SystemForegroundService.f7510g, "Unable to start foreground service", e11);
        }
    }

    public static void a(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        try {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            SharedPreferences.Editor editorEdit = jh.i.D(context).edit();
            editorEdit.putBoolean("proxy_notification_initialized", true);
            editorEdit.apply();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    public static void b(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static boolean c(NotificationChannel notificationChannel) {
        return notificationChannel.canBubble();
    }

    public static LocusId d(String str) {
        return new LocusId(str);
    }

    public static DisplayCutout e(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4);
    }

    public static void f(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static boolean g(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata h(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static int i(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static int j(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static String k(LocusId locusId) {
        return locusId.getId();
    }

    public static LocusId l(Notification notification) {
        return notification.getLocusId();
    }

    public static String m(Context context) {
        return context.getOpPackageName();
    }

    public static void n(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (jh.i.D(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z10 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (!PlatformVersion.isAtLeastQ()) {
            Tasks.forResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new d9(context, z10, taskCompletionSource, 3).run();
        taskCompletionSource.getTask();
    }

    public static boolean o(Notification.Action action) {
        return action.isContextual();
    }

    public static boolean p() {
        return Trace.isEnabled();
    }

    public static boolean q(Context context) {
        if (PlatformVersion.isAtLeastQ()) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public static Object r(o3.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets s(int i10, int i11, int i12, int i13) {
        return Insets.of(i10, i11, i12, i13);
    }

    public static void t(Notification.Builder builder, boolean z10) {
        builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static void u(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void v(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void w(Notification.Action.Builder builder, boolean z10) {
        builder.setContextual(z10);
    }

    public static void x(long j10, String str) {
        Trace.setCounter(str, j10);
    }

    public static void y(RemoteInput.Builder builder, int i10) {
        builder.setEditChoicesBeforeSending(i10);
    }

    public static void z(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }
}
