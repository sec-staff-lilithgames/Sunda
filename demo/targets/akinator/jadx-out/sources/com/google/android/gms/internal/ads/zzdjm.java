package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdjm implements zzdac, com.google.android.gms.ads.internal.overlay.zzr, zzczi {
    zzehf zza;
    private final Context zzb;
    private final zzcgy zzc;
    private final zzffu zzd;
    private final VersionInfoParcel zze;
    private final zzehd zzf;

    public zzdjm(Context context, zzcgy zzcgyVar, zzffu zzffuVar, VersionInfoParcel versionInfoParcel, zzehd zzehdVar) {
        this.zzb = context;
        this.zzc = zzcgyVar;
        this.zzd = zzffuVar;
        this.zze = versionInfoParcel;
        this.zzf = zzehdVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfS)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() {
        zzcgy zzcgyVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzcgyVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfV)).booleanValue()) {
                zzcgyVar.zze("onSdkImpression", new f());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        zzcgy zzcgyVar;
        zzehc zzehcVar;
        zzehb zzehbVar;
        zzffu zzffuVar = this.zzd;
        if (!zzffuVar.zzT || (zzcgyVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            int i10 = versionInfoParcel.buddyApkVersion;
            int i11 = versionInfoParcel.clientJarVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
            sb2.append(i10);
            sb2.append(".");
            sb2.append(i11);
            String string = sb2.toString();
            zzfgq zzfgqVar = zzffuVar.zzV;
            String strZza = zzfgqVar.zza();
            if (zzfgqVar.zzc() == 1) {
                zzehbVar = zzehb.VIDEO;
                zzehcVar = zzehc.DEFINED_BY_JAVASCRIPT;
            } else {
                zzehcVar = zzffuVar.zzY == 2 ? zzehc.UNSPECIFIED : zzehc.BEGIN_TO_RENDER;
                zzehbVar = zzehb.HTML_DISPLAY;
            }
            zzehf zzehfVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzcgyVar.zzD(), "", "javascript", strZza, zzehcVar, zzehbVar, zzffuVar.zzal);
            this.zza = zzehfVarZzc;
            if (zzehfVarZzc != null) {
                zzfou zzfouVarZza = zzehfVarZzc.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfR)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfouVarZza, zzcgyVar.zzD());
                    Iterator it = zzcgyVar.zzF().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfouVarZza, (View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfouVarZza, zzcgyVar.zzE());
                }
                zzcgyVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzfouVarZza);
                zzcgyVar.zze("onSdkLoaded", new f());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzcgy zzcgyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfV)).booleanValue() || (zzcgyVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzcgyVar.zze("onSdkImpression", new f());
            } else {
                this.zzf.zzd();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }
}
