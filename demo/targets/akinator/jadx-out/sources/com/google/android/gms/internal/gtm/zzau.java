package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzau extends com.google.android.gms.analytics.zzj {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    public final String toString() {
        HashMap map = new HashMap();
        map.put("appName", this.zza);
        map.put(C3191e4.i.W, this.zzb);
        map.put("appId", this.zzc);
        map.put("appInstallerId", this.zzd);
        return com.google.android.gms.analytics.zzj.zza(map);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.analytics.zzj
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzc(zzau zzauVar) {
        if (!TextUtils.isEmpty(this.zza)) {
            zzauVar.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzauVar.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzauVar.zzc = this.zzc;
        }
        if (TextUtils.isEmpty(this.zzd)) {
            return;
        }
        zzauVar.zzd = this.zzd;
    }

    public final void zzi(String str) {
        this.zzc = str;
    }

    public final void zzj(String str) {
        this.zzd = str;
    }

    public final void zzk(String str) {
        this.zza = str;
    }

    public final void zzl(String str) {
        this.zzb = str;
    }
}
