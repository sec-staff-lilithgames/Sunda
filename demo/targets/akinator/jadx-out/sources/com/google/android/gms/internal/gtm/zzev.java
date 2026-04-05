package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzev {
    static final Object zza = new Object();
    static WakeLock zzb;
    static Boolean zzc;

    public static boolean zzb(Context context) throws PackageManager.NameNotFoundException {
        Preconditions.checkNotNull(context);
        Boolean bool = zzc;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zZzi = zzff.zzi(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzc = Boolean.valueOf(zZzi);
        return zZzi;
    }

    public final void zza(Context context, Intent intent) {
        zzbu zzbuVarZzg = zzbu.zzg(context);
        zzeo zzeoVarZzm = zzbuVarZzg.zzm();
        if (intent == null) {
            zzeoVarZzm.zzQ("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzbuVarZzg.zzj();
        zzeoVarZzm.zzO("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zZzh = zzfa.zzh(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (zza) {
                context.startService(intent2);
                if (zZzh) {
                    try {
                        if (zzb == null) {
                            WakeLock wakeLock = new WakeLock(context, 1, "Analytics WakeLock");
                            zzb = wakeLock;
                            wakeLock.setReferenceCounted(false);
                        }
                        zzb.acquire(1000L);
                    } catch (SecurityException unused) {
                        zzeoVarZzm.zzQ("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
