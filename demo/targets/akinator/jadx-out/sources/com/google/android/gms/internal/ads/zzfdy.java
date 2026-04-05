package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import org.json.JSONException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfdy implements zzepj {
    private final Context zza;
    private final Executor zzb;
    private final zzcjn zzc;
    private final zzeot zzd;
    private final zzfey zze;
    private zzbfp zzf;
    private final zzflp zzg;
    private final zzfgm zzh;
    private n1 zzi;

    public zzfdy(Context context, Executor executor, zzcjn zzcjnVar, zzeot zzeotVar, zzfey zzfeyVar, zzfgm zzfgmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjnVar;
        this.zzd = zzeotVar;
        this.zzh = zzfgmVar;
        this.zze = zzfeyVar;
        this.zzg = zzcjnVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzepj
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeph zzephVar, zzepi zzepiVar) throws JSONException {
        zzdjd zzdjdVarZzh;
        zzflm zzflmVarZzc;
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfdr) zzephVar).zza;
        Bundle bundleZza = zzdus.zza(new Pair(zzduq.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzduq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfgm zzfgmVar = this.zzh;
        zzfgmVar.zzg(str);
        zzfgmVar.zzc(zzrVar);
        zzfgmVar.zza(zzmVar);
        zzfgmVar.zzv(bundleZza);
        Context context = this.zza;
        zzfgn zzfgnVarZzz = zzfgmVar.zzz();
        zzflc zzflcVarZzo = zzflc.zzo(context, zzfll.zzg(zzfgnVarZzz), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjb)).booleanValue()) {
            zzdjc zzdjcVarZzm = this.zzc.zzm();
            zzcxw zzcxwVar = new zzcxw();
            zzcxwVar.zza(context);
            zzcxwVar.zzb(zzfgnVarZzz);
            zzdjcVarZzm.zze(zzcxwVar.zze());
            zzden zzdenVar = new zzden();
            zzeot zzeotVar = this.zzd;
            Executor executor = this.zzb;
            zzdenVar.zzm(zzeotVar, executor);
            zzdenVar.zze(zzeotVar, executor);
            zzdjcVarZzm.zzf(zzdenVar.zzn());
            zzdjcVarZzm.zzd(new zzena(this.zzf));
            zzdjdVarZzh = zzdjcVarZzm.zzh();
        } else {
            zzden zzdenVar2 = new zzden();
            zzfey zzfeyVar = this.zze;
            if (zzfeyVar != null) {
                Executor executor2 = this.zzb;
                zzdenVar2.zza(zzfeyVar, executor2);
                zzdenVar2.zzb(zzfeyVar, executor2);
                zzdenVar2.zzc(zzfeyVar, executor2);
            }
            zzdjc zzdjcVarZzm2 = this.zzc.zzm();
            zzcxw zzcxwVar2 = new zzcxw();
            zzcxwVar2.zza(context);
            zzcxwVar2.zzb(zzfgnVarZzz);
            zzdjcVarZzm2.zze(zzcxwVar2.zze());
            zzeot zzeotVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdenVar2.zzm(zzeotVar2, executor3);
            zzdenVar2.zza(zzeotVar2, executor3);
            zzdenVar2.zzb(zzeotVar2, executor3);
            zzdenVar2.zzc(zzeotVar2, executor3);
            zzdenVar2.zzf(zzeotVar2, executor3);
            zzdenVar2.zzg(zzeotVar2, executor3);
            zzdenVar2.zze(zzeotVar2, executor3);
            zzdenVar2.zzk(zzeotVar2, executor3);
            zzdenVar2.zzd(zzeotVar2, executor3);
            zzdjcVarZzm2.zzf(zzdenVar2.zzn());
            zzdjcVarZzm2.zzd(new zzena(this.zzf));
            zzdjdVarZzh = zzdjcVarZzm2.zzh();
        }
        zzdjd zzdjdVar = zzdjdVarZzh;
        if (((Boolean) zzbgn.zzc.zze()).booleanValue()) {
            zzflmVarZzc = zzdjdVar.zzc();
            zzflmVarZzc.zzi(4);
            zzflmVarZzc.zzc(zzmVar.zzp);
            zzflmVarZzc.zzd(zzmVar.zzm);
        } else {
            zzflmVarZzc = null;
        }
        zzflm zzflmVar = zzflmVarZzc;
        zzcus zzcusVarZzb = zzdjdVar.zzb();
        n1 n1VarZzc = zzcusVarZzb.zzc(zzcusVarZzb.zzb());
        this.zzi = n1VarZzc;
        zzgui.zzr(n1VarZzc, new zzfdw(this, zzepiVar, zzflmVar, zzflcVarZzo, zzdjdVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzepj
    public final boolean zzb() {
        n1 n1Var = this.zzi;
        return (n1Var == null || n1Var.isDone()) ? false : true;
    }

    public final void zzc(zzbfp zzbfpVar) {
        this.zzf = zzbfpVar;
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zzdN(zzfhp.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzeot zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfey zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzflp zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(n1 n1Var) {
        this.zzi = null;
    }
}
