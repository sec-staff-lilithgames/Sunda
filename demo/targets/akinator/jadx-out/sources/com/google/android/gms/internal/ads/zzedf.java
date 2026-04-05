package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzedf {
    private final Context zza;
    private final zzgus zzb;
    private final zzgus zzc;
    private final zzifb zzd;
    private final VersionInfoParcel zze;
    private final zzedb zzf;
    private final zzdvi zzg;

    public zzedf(Context context, zzgus zzgusVar, zzgus zzgusVar2, zzifb zzifbVar, VersionInfoParcel versionInfoParcel, zzedb zzedbVar, zzdvi zzdviVar) {
        this.zza = context;
        this.zzb = zzgusVar;
        this.zzc = zzgusVar2;
        this.zzd = zzifbVar;
        this.zze = versionInfoParcel;
        this.zzf = zzedbVar;
        this.zzg = zzdviVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzeea) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoS)).booleanValue()) {
                zzdvh zzdvhVarZza = this.zzg.zza();
                zzdvhVarZza.zzc("action", "ptard");
                zzdvhVarZza.zzc("ptard", "l");
                zzdvhVarZza.zzd();
            }
        } catch (RemoteException | NullPointerException e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
            return;
        }
        zzedc zzedcVar = new zzedc(this);
        zzedh zzedhVarZzb = this.zzf.zzb();
        zzedhVarZzb.zzb(zzedcVar);
        final zzebp zzebpVarZza = zzedhVarZzb.zza().zza();
        zzgus zzgusVar = this.zzb;
        Objects.requireNonNull(zzebpVarZza);
        zzgusVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzede
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzebpVarZza.zza();
            }
        });
    }

    public final /* synthetic */ zzdvi zzd() {
        return this.zzg;
    }
}
