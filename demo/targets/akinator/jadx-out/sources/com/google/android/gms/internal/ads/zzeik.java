package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeik implements zzehk {
    private final zzcsl zza;
    private final Context zzb;
    private final zzdse zzc;
    private final zzfgn zzd;
    private final Executor zze;
    private final zzglu zzf;
    private final zzdvc zzg;

    public zzeik(zzcsl zzcslVar, Context context, Executor executor, zzdse zzdseVar, zzfgn zzfgnVar, zzglu zzgluVar, zzdvc zzdvcVar) {
        this.zzb = context;
        this.zza = zzcslVar;
        this.zze = executor;
        this.zzc = zzdseVar;
        this.zzd = zzfgnVar;
        this.zzf = zzgluVar;
        this.zzg = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final boolean zza(zzfgf zzfgfVar, zzffu zzffuVar) {
        zzffz zzffzVar = zzffuVar.zzs;
        return (zzffzVar == null || zzffzVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final n1 zzb(final zzfgf zzfgfVar, final zzffu zzffuVar) {
        return zzgui.zzj(zzgui.zza(null), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc(zzfgfVar, zzffuVar, obj);
            }
        }, this.zze);
    }

    public final /* synthetic */ n1 zzc(zzfgf zzfgfVar, zzffu zzffuVar, Object obj) throws zzchn {
        zzbel zzbelVar = zzbeu.zzcy;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzg.zze(), zzduq.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfgt.zza(context, zzffuVar.zzu);
        final zzcgy zzcgyVarZza = this.zzc.zza(zzrVarZza, zzffuVar, zzfgfVar.zzb.zzb);
        zzcgyVarZza.zzaw(zzffuVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziI)).booleanValue() && zzffuVar.zzag) ? zzcta.zza(context, zzcgyVarZza.zzE(), zzffuVar) : new zzdsh(context, zzcgyVarZza.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzffuVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzg.zze(), zzduq.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcsl zzcslVar = this.zza;
        final zzcrh zzcrhVarZzf = zzcslVar.zzf(new zzcue(zzfgfVar, zzffuVar, null), new zzcrn(viewZza, zzcgyVarZza, new zzctm() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // com.google.android.gms.internal.ads.zzctm
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcgyVarZza.zzh();
            }
        }, zzfgt.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzg.zze(), zzduq.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdsd zzdsdVarZzj = zzcrhVarZzf.zzj();
        zzdvc zzdvcVar = this.zzg;
        zzdsdVarZzj.zzi(zzcgyVarZza, false, null, zzdvcVar.zze());
        zzczg zzczgVarZzd = zzcrhVarZzf.zzd();
        zzczi zzcziVar = new zzczi() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // com.google.android.gms.internal.ads.zzczi
            public final /* synthetic */ void zzdw() {
                zzcgy zzcgyVar = zzcgyVarZza;
                if (zzcgyVar.zzP() != null) {
                    zzcgyVar.zzP().zzq();
                }
            }
        };
        zzgus zzgusVar = zzcbv.zzg;
        zzczgVarZzd.zzq(zzcziVar, zzgusVar);
        zzffz zzffzVar = zzffuVar.zzs;
        String strZza = zzffzVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfS)).booleanValue() && zzcrhVarZzf.zzm().zza(true)) {
            strZza = zzcip.zza(strZza, zzcip.zzb(zzffuVar));
        }
        zzcrhVarZzf.zzj();
        n1 n1VarZzj = zzdsd.zzj(zzcgyVarZza, zzffzVar.zzb, strZza, zzdvcVar.zze(), zzcslVar.zze());
        if (zzffuVar.zzM) {
            n1VarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeie
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgyVarZza.zzav();
                }
            }, this.zze);
        }
        n1VarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzcgyVarZza);
            }
        }, this.zze);
        return zzgui.zzk(n1VarZzj, new zzglu() { // from class: com.google.android.gms.internal.ads.zzeii
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcrhVarZzf.zzi();
            }
        }, zzgusVar);
    }

    public final /* synthetic */ void zzd(zzcgy zzcgyVar) {
        zzcgyVar.zzJ();
        zzfgn zzfgnVar = this.zzd;
        zzcie zzcieVarZzh = zzcgyVar.zzh();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfgnVar.zza;
        if (zzgaVar != null && zzcieVarZzh != null) {
            zzcieVarZzh.zzc(zzgaVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbA)).booleanValue() || zzcgyVar.isAttachedToWindow()) {
            return;
        }
        zzcgyVar.onPause();
        zzcgyVar.zzaG(true);
    }
}
