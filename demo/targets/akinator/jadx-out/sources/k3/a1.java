package k3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a1 {
    public static int a(int i10, boolean z10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i10 | i11;
    }

    public static PendingIntent getActivities(Context context, int i10, Intent[] intentArr, int i11, Bundle bundle, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(i11, z10), bundle);
    }

    public static PendingIntent getActivity(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(i11, z10));
    }

    public static PendingIntent getBroadcast(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getBroadcast(context, i10, intent, a(i11, z10));
    }

    public static PendingIntent getForegroundService(Context context, int i10, Intent intent, int i11, boolean z10) {
        return x0.getForegroundService(context, i10, intent, a(i11, z10));
    }

    public static PendingIntent getService(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getService(context, i10, intent, a(i11, z10));
    }

    public static void send(PendingIntent pendingIntent, int i10, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        z0 z0Var = new z0(onFinished);
        try {
            pendingIntent.send(i10, z0Var.getCallback(), handler);
            z0Var.complete();
            z0Var.close();
        } catch (Throwable th2) {
            try {
                z0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static PendingIntent getActivities(Context context, int i10, Intent[] intentArr, int i11, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(i11, z10));
    }

    public static PendingIntent getActivity(Context context, int i10, Intent intent, int i11, Bundle bundle, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(i11, z10), bundle);
    }

    public static void send(PendingIntent pendingIntent, Context context, int i10, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        send(pendingIntent, context, i10, intent, onFinished, handler, null, null);
    }

    public static void send(PendingIntent pendingIntent, Context context, int i10, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
        z0 z0Var = new z0(onFinished);
        try {
            w0.send(pendingIntent, context, i10, intent, onFinished, handler, str, bundle);
            z0Var.complete();
            z0Var.close();
        } finally {
        }
    }
}
