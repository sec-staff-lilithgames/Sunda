package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzejg implements zzehk {
    private final Context zza;
    private final zzdse zzb;
    private final zzdjd zzc;
    private final zzfgn zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbma zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjS)).booleanValue();
    private final zzegj zzi;
    private final zzdvc zzj;
    private final zzdvi zzk;

    public zzejg(Context context, VersionInfoParcel versionInfoParcel, zzfgn zzfgnVar, Executor executor, zzdjd zzdjdVar, zzdse zzdseVar, zzbma zzbmaVar, zzegj zzegjVar, zzdvc zzdvcVar, zzdvi zzdviVar) {
        this.zza = context;
        this.zzd = zzfgnVar;
        this.zzc = zzdjdVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdseVar;
        this.zzg = zzbmaVar;
        this.zzi = zzegjVar;
        this.zzj = zzdvcVar;
        this.zzk = zzdviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final boolean zza(zzfgf zzfgfVar, zzffu zzffuVar) {
        zzffz zzffzVar = zzffuVar.zzs;
        return (zzffzVar == null || zzffzVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final n1 zzb(final zzfgf zzfgfVar, final zzffu zzffuVar) {
        final zzdsi zzdsiVar = new zzdsi();
        n1 n1VarZza = zzgui.zza(null);
        zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.internal.ads.zzejd
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc(zzffuVar, zzfgfVar, zzdsiVar, obj);
            }
        };
        Executor executor = this.zze;
        n1 n1VarZzj = zzgui.zzj(n1VarZza, zzgtqVar, executor);
        n1VarZzj.addListener(new Runnable(zzdsiVar) { // from class: com.google.android.gms.internal.ads.zzejf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return n1VarZzj;
    }

    public final /* synthetic */ n1 zzc(final zzffu zzffuVar, zzfgf zzfgfVar, zzdsi zzdsiVar, Object obj) throws zzchn {
        zzbel zzbelVar = zzbeu.zzcy;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzj.zze(), zzduq.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdse zzdseVar = this.zzb;
        zzfgn zzfgnVar = this.zzd;
        final zzcgy zzcgyVarZza = zzdseVar.zza(zzfgnVar.zzf, zzffuVar, zzfgfVar.zzb.zzb);
        zzcgyVarZza.zzaw(zzffuVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzj.zze(), zzduq.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcca zzccaVar = new zzcca();
        zzdjd zzdjdVar = this.zzc;
        zzcue zzcueVar = new zzcue(zzfgfVar, zzffuVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z10 = this.zzh;
        zzbma zzbmaVar = this.zzg;
        final zzdhx zzdhxVarZzd = zzdjdVar.zzd(zzcueVar, new zzdia(new zzeje(context, versionInfoParcel, zzccaVar, zzffuVar, zzcgyVarZza, zzfgnVar, z10, zzbmaVar, this.zzi, this.zzk), zzcgyVarZza));
        zzccaVar.zzc(zzdhxVarZzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzj.zze(), zzduq.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdhxVarZzd.zzd().zzq(new zzczi() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // com.google.android.gms.internal.ads.zzczi
            public final /* synthetic */ void zzdw() {
                zzcgy zzcgyVar = zzcgyVarZza;
                if (zzcgyVar.zzP() != null) {
                    zzcgyVar.zzP().zzq();
                }
            }
        }, zzcbv.zzg);
        zzffz zzffzVar = zzffuVar.zzs;
        String strZza = zzffzVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfS)).booleanValue() && zzdhxVarZzd.zzl().zza(true)) {
            strZza = zzcip.zza(strZza, zzcip.zzb(zzffuVar));
        }
        zzdsd zzdsdVarZzk = zzdhxVarZzd.zzk();
        zzbma zzbmaVar2 = true != z10 ? null : zzbmaVar;
        zzdvc zzdvcVar = this.zzj;
        zzdsdVarZzk.zzi(zzcgyVarZza, true, zzbmaVar2, zzdvcVar.zze());
        zzdhxVarZzd.zzk();
        return zzgui.zzk(zzdsd.zzj(zzcgyVarZza, zzffzVar.zzb, strZza, zzdvcVar.zze(), zzdjdVar.zzc()), new zzglu(this) { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj2) {
                zzcgy zzcgyVar = zzcgyVarZza;
                if (zzffuVar.zzM) {
                    zzcgyVar.zzav();
                }
                zzdhx zzdhxVar = zzdhxVarZzd;
                zzcgyVar.zzJ();
                zzcgyVar.onPause();
                return zzdhxVar.zzh();
            }
        }, this.zze);
    }
}
