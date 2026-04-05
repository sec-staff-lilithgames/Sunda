package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzav extends com.google.android.gms.analytics.zzj {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    public final String toString() {
        HashMap map = new HashMap();
        map.put("name", this.zza);
        map.put("source", this.zzb);
        map.put("medium", this.zzc);
        map.put("keyword", this.zzd);
        map.put("content", this.zze);
        map.put("id", this.zzf);
        map.put("adNetworkId", this.zzg);
        map.put("gclid", this.zzh);
        map.put("dclid", this.zzi);
        map.put("aclid", this.zzj);
        return com.google.android.gms.analytics.zzj.zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzav zzavVar = (zzav) zzjVar;
        if (!TextUtils.isEmpty(this.zza)) {
            zzavVar.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzavVar.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzavVar.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzavVar.zzd = this.zzd;
        }
        if (!TextUtils.isEmpty(this.zze)) {
            zzavVar.zze = this.zze;
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            zzavVar.zzf = this.zzf;
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzavVar.zzg = this.zzg;
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            zzavVar.zzh = this.zzh;
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            zzavVar.zzi = this.zzi;
        }
        if (TextUtils.isEmpty(this.zzj)) {
            return;
        }
        zzavVar.zzj = this.zzj;
    }

    public final String zzd() {
        return this.zzj;
    }

    public final String zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzi;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zza;
    }

    public final String zzm() {
        return this.zzb;
    }

    public final void zzn(String str) {
        this.zzj = str;
    }

    public final void zzo(String str) {
        this.zzg = str;
    }

    public final void zzp(String str) {
        this.zze = str;
    }

    public final void zzq(String str) {
        this.zzi = str;
    }

    public final void zzr(String str) {
        this.zzh = str;
    }

    public final void zzs(String str) {
        this.zzf = str;
    }

    public final void zzt(String str) {
        this.zzd = str;
    }

    public final void zzu(String str) {
        this.zzc = str;
    }

    public final void zzv(String str) {
        this.zza = str;
    }

    public final void zzw(String str) {
        this.zzb = str;
    }
}
