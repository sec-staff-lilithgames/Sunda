package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcdq {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcdq(String str) throws JSONException {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbeu.zzad);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbeu.zzl);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbeu.zzv);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbeu.zzh);
        zzbel zzbelVar = zzbeu.zzg;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbeu.zzi);
        this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbeu.zzj);
        this.zzg = zzb(jSONObject, "player_precache_limit", zzbeu.zzk);
        this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbeu.zzm);
        this.zzi = zza(jSONObject, "use_cache_data_source", zzbeu.zzeR);
        zzb(jSONObject, "min_retry_count", zzbeu.zzn);
        this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbeu.zzp);
        this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbeu.zzci);
        this.zzl = zza(jSONObject, "use_range_http_data_source", zzbeu.zzck);
        this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbeu.zzcl);
        this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbeu.zzcm);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbel zzbelVar) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbel zzbelVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbel zzbelVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).longValue();
    }
}
