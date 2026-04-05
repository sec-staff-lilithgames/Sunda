package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzdqh implements com.google.android.gms.ads.internal.client.zza, zzbkn, com.google.android.gms.ads.internal.overlay.zzr, zzbkp, com.google.android.gms.ads.internal.overlay.zzad {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbkn zzb;
    private com.google.android.gms.ads.internal.overlay.zzr zzc;
    private zzbkp zzd;
    private com.google.android.gms.ads.internal.overlay.zzad zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final synchronized void zza(String str, Bundle bundle) {
        zzbkn zzbknVar = this.zzb;
        if (zzbknVar != null) {
            zzbknVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final synchronized void zzb(String str, String str2) {
        zzbkp zzbkpVar = this.zzd;
        if (zzbkpVar != null) {
            zzbkpVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdA() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdA();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdB() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdB();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdC() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdC();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdD();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdX() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdX();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdY(int i10) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdY(i10);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdu();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzh();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final synchronized void zzl() {
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zze;
        if (zzadVar != null) {
            zzadVar.zzl();
        }
    }

    public final synchronized void zzm(com.google.android.gms.ads.internal.client.zza zzaVar, zzbkn zzbknVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbkp zzbkpVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar) {
        this.zza = zzaVar;
        this.zzb = zzbknVar;
        this.zzc = zzrVar;
        this.zzd = zzbkpVar;
        this.zze = zzadVar;
    }
}
