package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbgj {
    public static final zzbge zza = zzbge.zzb("gads:app_permissions_caching_expiry_ms:expiry", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    public static final zzbge zzb = zzbge.zzb("gads:audio_caching_expiry_ms:expiry", 5000);
    public static final zzbge zzc = zzbge.zzb("gads:battery_caching_expiry_ms:expiry", 10000);
    public static final zzbge zzd = zzbge.zzb("gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zzbge zze = zzbge.zzb("gads:hsdp_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbge zzf = zzbge.zzb("gads:memory_caching_expiry_ms:expiry", 5000);
    public static final zzbge zzg = zzbge.zzb("gads:sdk_environment_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbge zzh = zzbge.zzb("gads:telephony_caching_expiry_ms:expiry", 5000);
}
