package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcrj extends zzcrg {
    private final Context zzc;
    private final View zzd;
    private final zzcgy zze;
    private final zzffv zzf;
    private final zzctm zzg;
    private final zzdma zzh;
    private final zzdgx zzi;
    private final zzifb zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    public zzcrj(zzctn zzctnVar, Context context, zzffv zzffvVar, View view, zzcgy zzcgyVar, zzctm zzctmVar, zzdma zzdmaVar, zzdgx zzdgxVar, zzifb zzifbVar, Executor executor) {
        super(zzctnVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcgyVar;
        this.zzf = zzffvVar;
        this.zzg = zzctmVar;
        this.zzh = zzdmaVar;
        this.zzi = zzdgxVar;
        this.zzj = zzifbVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcgy zzcgyVar;
        if (viewGroup == null || (zzcgyVar = this.zze) == null) {
            return;
        }
        zzcgyVar.zzaf(zzcji.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final com.google.android.gms.ads.internal.client.zzed zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfgu unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final zzffv zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfgt.zzb(zzrVar);
        }
        zzffu zzffuVar = this.zzb;
        if (zzffuVar.zzac) {
            for (String str : zzffuVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzffv(view.getWidth(), view.getHeight(), false);
        }
        return (zzffv) zzffuVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final zzffv zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziI)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziJ)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcto
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcri
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    public final /* synthetic */ void zzk() {
        zzbjt zzbjtVarZzd = this.zzh.zzd();
        if (zzbjtVarZzd == null) {
            return;
        }
        try {
            zzbjtVarZzd.zze((com.google.android.gms.ads.internal.client.zzbx) this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e10);
        }
    }
}
