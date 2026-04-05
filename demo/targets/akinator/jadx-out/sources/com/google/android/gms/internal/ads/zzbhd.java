package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.APSAnalytics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbhd {
    public static final zzbge zza = zzbge.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbge zzb = zzbge.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbge zzc = new zzbge("gads:public_beta:traffic_multiplier", APSAnalytics.DEFAULT_SDK_VERSION, 4);
    public static final zzbge zzd = new zzbge("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbge zze;
    public static final zzbge zzf;

    static {
        zzbge.zza("gads:sdk_crash_report_enabled", false);
        zze = zzbge.zza("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbge.zzc("gads:trapped_exception_sample_rate", 0.01d);
    }
}
