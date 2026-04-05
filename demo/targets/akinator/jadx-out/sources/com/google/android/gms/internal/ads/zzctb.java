package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzctb implements zzdac, zzczi {
    private final Context zza;
    private final zzcgy zzb;
    private final zzffu zzc;
    private final VersionInfoParcel zzd;
    private zzehf zze;
    private boolean zzf;
    private final zzehd zzg;

    public zzctb(Context context, zzcgy zzcgyVar, zzffu zzffuVar, VersionInfoParcel versionInfoParcel, zzehd zzehdVar) {
        this.zza = context;
        this.zzb = zzcgyVar;
        this.zzc = zzffuVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzehdVar;
    }

    private final synchronized void zza() {
        zzcgy zzcgyVar;
        zzehc zzehcVar;
        zzehb zzehbVar;
        try {
            zzffu zzffuVar = this.zzc;
            if (zzffuVar.zzT && (zzcgyVar = this.zzb) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
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
                        int i12 = zzffuVar.zze;
                        zzehb zzehbVar2 = zzehb.HTML_DISPLAY;
                        zzehcVar = i12 == 1 ? zzehc.ONE_PIXEL : zzehc.BEGIN_TO_RENDER;
                        zzehbVar = zzehbVar2;
                    }
                    zzehf zzehfVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzcgyVar.zzD(), "", "javascript", strZza, zzehcVar, zzehbVar, zzffuVar.zzal);
                    this.zze = zzehfVarZzc;
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
                        zzcgyVar.zzak(this.zze);
                        com.google.android.gms.ads.internal.zzt.zzu().zze(zzfouVarZza);
                        this.zzf = true;
                        zzcgyVar.zze("onSdkLoaded", new f());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfS)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final synchronized void zzdw() {
        zzcgy zzcgyVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcgyVar = this.zzb) == null) {
            return;
        }
        zzcgyVar.zze("onSdkImpression", new f());
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
