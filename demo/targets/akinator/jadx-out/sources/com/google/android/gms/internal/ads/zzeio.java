package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeio implements zzehq {
    private final Context zza;
    private final zzcsl zzb;
    private final Executor zzc;

    public zzeio(Context context, zzcsl zzcslVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcslVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzfgn zzfgnVar = zzfgfVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzfgnVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziI)).booleanValue() && zzffuVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzfgt.zza(this.zza, zzffuVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziI)).booleanValue() && zzffuVar.zzag) {
            ((zzfhl) zzehnVar.zzb).zzb(this.zza, zzrVar3, zzfgnVar.zzd, zzffuVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzffuVar.zzs), (zzbrp) zzehnVar.zzc);
        } else {
            ((zzfhl) zzehnVar.zzb).zzg(this.zza, zzrVar3, zzfgnVar.zzd, zzffuVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzffuVar.zzs), (zzbrp) zzehnVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, final zzffu zzffuVar, zzehn zzehnVar) throws zzfgu, zzekz {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziI)).booleanValue() && zzffuVar.zzag) {
            zzbrs zzbrsVarZzc = ((zzfhl) zzehnVar.zzb).zzc();
            if (zzbrsVarZzc == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfgu(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbrsVarZzc.zze());
                boolean zZzf = zzbrsVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfgu(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgui.zzj(zzgui.zza(null), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeim
                            @Override // com.google.android.gms.internal.ads.zzgtq
                            public final /* synthetic */ n1 zza(Object obj) {
                                return this.zza.zzc(viewZza, zzffuVar, obj);
                            }
                        }, zzcbv.zzf).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfgu(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfgu(e11);
            }
        } else {
            viewZza = ((zzfhl) zzehnVar.zzb).zza();
        }
        zzcsl zzcslVar = this.zzb;
        zzcue zzcueVar = new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza);
        final zzfhl zzfhlVar = (zzfhl) zzehnVar.zzb;
        Objects.requireNonNull(zzfhlVar);
        zzcrh zzcrhVarZzf = zzcslVar.zzf(zzcueVar, new zzcrn(viewZza, null, new zzctm() { // from class: com.google.android.gms.internal.ads.zzein
            @Override // com.google.android.gms.internal.ads.zzctm
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzfhlVar.zzt();
            }
        }, (zzffv) zzffuVar.zzu.get(0)));
        zzcrhVarZzf.zzk().zza(viewZza);
        zzcrhVarZzf.zza().zzq(new zzcou(zzfhlVar), this.zzc);
        ((zzeiz) zzehnVar.zzc).zzc(zzcrhVarZzf.zzf());
        return zzcrhVarZzf.zzi();
    }

    public final /* synthetic */ n1 zzc(View view, zzffu zzffuVar, Object obj) {
        return zzgui.zza(zzcta.zza(this.zza, view, zzffuVar));
    }
}
