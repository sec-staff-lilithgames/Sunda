package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfci implements zzepj {
    private final Context zza;
    private final Executor zzb;
    private final zzcjn zzc;
    private final zzeot zzd;
    private final zzeox zze;
    private final ViewGroup zzf;
    private zzbfp zzg;
    private final zzdbp zzh;
    private final zzflp zzi;
    private final zzddu zzj;
    private final zzfgm zzk;
    private n1 zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzepi zzo;

    public zzfci(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcjn zzcjnVar, zzeot zzeotVar, zzeox zzeoxVar, zzfgm zzfgmVar, zzddu zzdduVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjnVar;
        this.zzd = zzeotVar;
        this.zze = zzeoxVar;
        this.zzk = zzfgmVar;
        this.zzh = zzcjnVar.zzd();
        this.zzi = zzcjnVar.zzx();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdduVar;
        zzfgmVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziZ)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzeVar);
                }
            });
        }
        zzepi zzepiVar = this.zzo;
        if (zzepiVar != null) {
            zzepiVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepj
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeph zzephVar, zzepi zzepiVar) throws JSONException, RemoteException {
        zzcsl zzcslVarZza;
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzw().zzc(true);
            }
            Bundle bundleZza = zzdus.zza(new Pair(zzduq.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzduq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzfgm zzfgmVar = this.zzk;
            zzfgmVar.zzg(str);
            zzfgmVar.zza(zzmVar);
            zzfgmVar.zzv(bundleZza);
            Context context = this.zza;
            zzfgn zzfgnVarZzz = zzfgmVar.zzz();
            zzflc zzflcVarZzo = zzflc.zzo(context, zzfll.zzg(zzfgnVarZzz), 3, zzmVar);
            zzflm zzflmVarZze = null;
            if (!((Boolean) zzbha.zzd.zze()).booleanValue() || !zzfgmVar.zzf().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziZ)).booleanValue()) {
                    zzcsk zzcskVarZzi = this.zzc.zzi();
                    zzcxw zzcxwVar = new zzcxw();
                    zzcxwVar.zza(context);
                    zzcxwVar.zzb(zzfgnVarZzz);
                    zzcskVarZzi.zzl(zzcxwVar.zze());
                    zzden zzdenVar = new zzden();
                    zzeot zzeotVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdenVar.zzm(zzeotVar, executor);
                    zzdenVar.zze(zzeotVar, executor);
                    zzcskVarZzi.zzm(zzdenVar.zzn());
                    zzcskVarZzi.zzk(new zzena(this.zzg));
                    zzcskVarZzi.zzd(new zzdju(zzdma.zza, null));
                    zzcskVarZzi.zzg(new zzctg(this.zzh, this.zzj));
                    zzcskVarZzi.zze(new zzcrd(this.zzf));
                    zzcslVarZza = zzcskVarZzi.zzh();
                } else {
                    zzcsk zzcskVarZzi2 = this.zzc.zzi();
                    zzcxw zzcxwVar2 = new zzcxw();
                    zzcxwVar2.zza(context);
                    zzcxwVar2.zzb(zzfgnVarZzz);
                    zzcskVarZzi2.zzl(zzcxwVar2.zze());
                    zzden zzdenVar2 = new zzden();
                    zzeot zzeotVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdenVar2.zzm(zzeotVar2, executor2);
                    zzdenVar2.zzf(zzeotVar2, executor2);
                    zzdenVar2.zzf(this.zze, executor2);
                    zzdenVar2.zzg(zzeotVar2, executor2);
                    zzdenVar2.zzh(zzeotVar2, executor2);
                    zzdenVar2.zza(zzeotVar2, executor2);
                    zzdenVar2.zzb(zzeotVar2, executor2);
                    zzdenVar2.zzc(zzeotVar2, executor2);
                    zzdenVar2.zze(zzeotVar2, executor2);
                    zzdenVar2.zzk(zzeotVar2, executor2);
                    zzcskVarZzi2.zzm(zzdenVar2.zzn());
                    zzcskVarZzi2.zzk(new zzena(this.zzg));
                    zzcskVarZzi2.zzd(new zzdju(zzdma.zza, null));
                    zzcskVarZzi2.zzg(new zzctg(this.zzh, this.zzj));
                    zzcskVarZzi2.zze(new zzcrd(this.zzf));
                    zzcslVarZza = zzcskVarZzi2.zzh();
                }
                if (((Boolean) zzbgn.zzc.zze()).booleanValue()) {
                    zzflmVarZze = zzcslVarZza.zze();
                    zzflmVarZze.zzi(3);
                    zzflmVarZze.zzc(zzmVar.zzp);
                    zzflmVarZze.zzd(zzmVar.zzm);
                }
                this.zzo = zzepiVar;
                zzcus zzcusVarZzc = zzcslVarZza.zzc();
                n1 n1VarZzc = zzcusVarZzc.zzc(zzcusVarZzc.zzb());
                this.zzl = n1VarZzc;
                zzgui.zzr(n1VarZzc, new zzfce(this, zzflmVarZze, zzflcVarZzo, zzcslVarZza), this.zzb);
                return true;
            }
            zzeot zzeotVar3 = this.zzd;
            if (zzeotVar3 != null) {
                zzeotVar3.zzdN(zzfhp.zzd(7, null, null));
            }
        } else if (!this.zzk.zzA()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzepj
    public final boolean zzb() {
        n1 n1Var = this.zzl;
        return (n1Var == null || n1Var.isDone()) ? false : true;
    }

    public final void zzc() {
        synchronized (this) {
            try {
                n1 n1Var = this.zzl;
                if (n1Var != null && n1Var.isDone()) {
                    try {
                        zzcrg zzcrgVar = (zzcrg) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzcrgVar.zza();
                        ViewParent parent = zzcrgVar.zza().getParent();
                        if (parent instanceof ViewGroup) {
                            String strZze = zzcrgVar.zzn() != null ? zzcrgVar.zzn().zze() : "";
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strZze).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(strZze);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            String string = sb2.toString();
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                            ((ViewGroup) parent).removeView(zzcrgVar.zza());
                        }
                        zzbel zzbelVar = zzbeu.zziZ;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
                            zzdce zzdceVarZzq = zzcrgVar.zzq();
                            zzdceVarZzq.zza(this.zzd);
                            zzdceVarZzq.zzb(this.zze);
                        }
                        viewGroup.addView(zzcrgVar.zza());
                        zzepi zzepiVar = this.zzo;
                        if (zzepiVar != null) {
                            zzepiVar.zzb(zzcrgVar);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzeot zzeotVar = this.zzd;
                            Objects.requireNonNull(zzeotVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfch
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeotVar.zzg();
                                }
                            });
                        }
                        if (zzcrgVar.zzh() >= 0) {
                            this.zzm = false;
                            zzdbp zzdbpVar = this.zzh;
                            zzdbpVar.zzd(zzcrgVar.zzh());
                            zzdbpVar.zze(zzcrgVar.zzg());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzcrgVar.zzg());
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    } catch (ExecutionException e11) {
                        e = e11;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    }
                } else if (this.zzl != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbfp zzbfpVar) {
        this.zzg = zzbfpVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze.zza(zzbhVar);
    }

    public final zzfgm zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzac(view, view.getContext());
    }

    public final void zzi(zzdbk zzdbkVar) {
        this.zzh.zzq(zzdbkVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdN(zzfhp.zzd(6, null, null));
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdN(zzeVar);
    }

    public final /* synthetic */ zzdbp zzo() {
        return this.zzh;
    }

    public final /* synthetic */ zzflp zzp() {
        return this.zzi;
    }

    public final /* synthetic */ zzddu zzq() {
        return this.zzj;
    }

    public final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    public final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}
