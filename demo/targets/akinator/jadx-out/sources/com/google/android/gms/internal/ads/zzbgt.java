package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbgt {
    public static final zzbge zza = new zzbge("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbge zzb = new zzbge("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbge zzc = zzbge.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbge zzd = zzbge.zza("gads:gma_attestation:click:enable", false);
    public static final zzbge zze = zzbge.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final zzbge zzf = zzbge.zza("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbge zzg = zzbge.zza("gads:gma_attestation:image_hash", false);
    public static final zzbge zzh = zzbge.zza("gads:gma_attestation:impression:enable", false);
    public static final zzbge zzi;

    static {
        zzbge.zza("gads:gma_attestation:request:enable_javascript", false);
        zzbge.zza("gads:gma_attestation:request:enable", true);
        zzi = zzbge.zza("gads:gma_attestation:click:report_error", true);
    }
}
