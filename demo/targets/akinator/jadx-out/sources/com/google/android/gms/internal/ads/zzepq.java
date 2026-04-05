package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepq implements zzepj {
    private final zzfgm zza;
    private final zzcjn zzb;
    private final Context zzc;
    private final zzepg zzd;
    private final zzflp zze;
    private zzcud zzf;

    public zzepq(zzcjn zzcjnVar, Context context, zzepg zzepgVar, zzfgm zzfgmVar) {
        this.zzb = zzcjnVar;
        this.zzc = context;
        this.zzd = zzepgVar;
        this.zza = zzfgmVar;
        this.zze = zzcjnVar.zzx();
        zzfgmVar.zzt(zzepgVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzepj
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeph zzephVar, zzepi zzepiVar) throws JSONException, RemoteException {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzL(context) && zzmVar.zzs == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        boolean z10 = zzmVar.zzf;
        zzfhk.zzb(context, z10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue() && z10) {
            this.zzb.zzw().zzc(true);
        }
        int i12 = ((zzepk) zzephVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String strZza = zzduq.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdus.zza(new Pair(strZza, lValueOf), new Pair(zzduq.DYNAMITE_ENTER.zza(), lValueOf));
        zzfgm zzfgmVar = this.zza;
        zzfgmVar.zza(zzmVar);
        zzfgmVar.zzv(bundleZza);
        zzfgmVar.zzl(i12);
        zzfgn zzfgnVarZzz = zzfgmVar.zzz();
        zzflc zzflcVarZzo = zzflc.zzo(context, zzfll.zzg(zzfgnVarZzz), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zzfgnVarZzz.zzo;
        if (zzcoVar != null) {
            this.zzd.zzc().zzn(zzcoVar);
        }
        zzcjn zzcjnVar = this.zzb;
        zzdjy zzdjyVarZzo = zzcjnVar.zzo();
        zzcxw zzcxwVar = new zzcxw();
        zzcxwVar.zza(context);
        zzcxwVar.zzb(zzfgnVarZzz);
        zzdjyVarZzo.zzf(zzcxwVar.zze());
        zzden zzdenVar = new zzden();
        zzepg zzepgVar = this.zzd;
        zzdenVar.zze(zzepgVar.zzc(), zzcjnVar.zzb());
        zzdjyVarZzo.zzg(zzdenVar.zzn());
        zzdjyVarZzo.zze(zzepgVar.zzb());
        zzflm zzflmVarZzc = null;
        zzdjyVarZzo.zzd(new zzcrd(null));
        zzdjz zzdjzVarZzh = zzdjyVarZzo.zzh();
        if (((Boolean) zzbgn.zzc.zze()).booleanValue()) {
            zzflmVarZzc = zzdjzVarZzh.zzc();
            zzflmVarZzc.zzi(8);
            zzflmVarZzc.zzc(zzmVar.zzp);
            zzflmVarZzc.zzd(zzmVar.zzm);
        }
        zzflm zzflmVar = zzflmVarZzc;
        zzcjnVar.zzv().zza(1);
        zzgus zzgusVarZzc = zzfjn.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzc = zzcjnVar.zzc();
        zzcus zzcusVarZza = zzdjzVarZzh.zza();
        zzcud zzcudVar = new zzcud(zzgusVarZzc, scheduledExecutorServiceZzc, zzcusVarZza.zzc(zzcusVarZza.zzb()));
        this.zzf = zzcudVar;
        zzcudVar.zza(new zzepn(this, zzepiVar, zzflmVar, zzflcVarZzo, zzdjzVarZzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzepj
    public final boolean zzb() {
        zzcud zzcudVar = this.zzf;
        return zzcudVar != null && zzcudVar.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zze().zzdN(zzfhp.zzd(4, null, null));
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zze().zzdN(zzfhp.zzd(6, null, null));
    }

    public final /* synthetic */ zzcjn zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzepg zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzflp zzg() {
        return this.zze;
    }
}
