package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcyh extends com.google.android.gms.ads.internal.client.zzdz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzehp zzh;
    private final Bundle zzi;
    private final double zzj;

    public zzcyh(zzffu zzffuVar, String str, zzehp zzehpVar, zzffx zzffxVar, String str2) throws JSONException {
        String string = null;
        this.zzb = zzffuVar == null ? null : zzffuVar.zzab;
        this.zzc = str2;
        this.zzd = zzffxVar == null ? null : zzffxVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzffuVar != null) {
            try {
                string = zzffuVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzehpVar.zzh();
        this.zzh = zzehpVar;
        this.zzj = zzffuVar == null ? 0.0d : zzffuVar.zzaz;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzho)).booleanValue() || zzffxVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzffxVar.zzk;
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkk)).booleanValue() || zzffxVar == null || TextUtils.isEmpty(zzffxVar.zzi)) ? "" : zzffxVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzehp zzehpVar = this.zzh;
        if (zzehpVar != null) {
            return zzehpVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() {
        return this.zzc;
    }

    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }
}
