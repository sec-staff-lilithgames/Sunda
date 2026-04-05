package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbgs {
    public static final zzbge zza = zzbge.zza("gads:init:init_on_bg_thread", true);
    public static final zzbge zzb = zzbge.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbge zzc = zzbge.zza("gads:adloader_load_bg_thread", true);
    public static final zzbge zzd = zzbge.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbge zze = zzbge.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbge zzf = zzbge.zza("gads:banner_load_bg_thread", true);
    public static final zzbge zzg = zzbge.zza("gads:banner_pause_bg_thread", false);
    public static final zzbge zzh = zzbge.zza("gads:banner_resume_bg_thread", false);
    public static final zzbge zzi = zzbge.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbge zzj;
    public static final zzbge zzk;

    static {
        zzbge.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbge.zza("gads:query_info_bg_thread", true);
        zzk = zzbge.zza("gads:rewarded_load_bg_thread", true);
    }
}
