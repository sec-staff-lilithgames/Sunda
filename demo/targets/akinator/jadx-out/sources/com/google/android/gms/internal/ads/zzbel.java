package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbel {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbel(int i10, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zzb().zza(this);
    }

    public static zzbel zzh(int i10, String str, int i11, int i12) {
        return new zzbeh(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbel zzi(int i10, String str, long j10, long j11) {
        return new zzbei(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzbel zzj(int i10, String str, float f10, float f11) {
        return new zzbej(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbel zzk(int i10, String str) {
        zzbek zzbekVar = new zzbek(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzb(zzbekVar);
        return zzbekVar;
    }

    public static zzbel zzl(int i10, String str) {
        zzbek zzbekVar = new zzbek(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzc(zzbekVar);
        return zzbekVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    public abstract Object zzc(JSONObject jSONObject);

    public abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
