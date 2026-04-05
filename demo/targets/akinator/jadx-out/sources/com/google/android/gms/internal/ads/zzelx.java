package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzelx implements zzehk {
    private final Context zza;
    private final zzdse zzb;
    private final zzdrn zzc;
    private final zzfgn zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbma zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjS)).booleanValue();
    private final zzegj zzi;
    private final zzdvc zzj;
    private final zzdvi zzk;

    public zzelx(Context context, VersionInfoParcel versionInfoParcel, zzfgn zzfgnVar, Executor executor, zzdrn zzdrnVar, zzdse zzdseVar, zzbma zzbmaVar, zzegj zzegjVar, zzdvc zzdvcVar, zzdvi zzdviVar) {
        this.zza = context;
        this.zzd = zzfgnVar;
        this.zzc = zzdrnVar;
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
        zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.internal.ads.zzelw
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc(zzffuVar, zzfgfVar, zzdsiVar, obj);
            }
        };
        Executor executor = this.zze;
        n1 n1VarZzj = zzgui.zzj(n1VarZza, zzgtqVar, executor);
        n1VarZzj.addListener(new Runnable(zzdsiVar) { // from class: com.google.android.gms.internal.ads.zzelq
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
        zzdrn zzdrnVar = this.zzc;
        zzcue zzcueVar = new zzcue(zzfgfVar, zzffuVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbma zzbmaVar = this.zzg;
        boolean z10 = this.zzh;
        zzegj zzegjVar = this.zzi;
        zzdvc zzdvcVar = this.zzj;
        final zzdrj zzdrjVarZzf = zzdrnVar.zzf(zzcueVar, new zzdrk(new zzelt(context, zzdseVar, zzfgnVar, versionInfoParcel, zzffuVar, zzccaVar, zzcgyVarZza, zzbmaVar, z10, zzegjVar, zzdvcVar, this.zzk), zzcgyVarZza));
        zzccaVar.zzc(zzdrjVarZzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(zzdvcVar.zze(), zzduq.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzbmq.zzb(zzcgyVarZza, zzdrjVarZzf.zzk());
        zzdrjVarZzf.zzd().zzq(new zzczi() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzczi
            public final /* synthetic */ void zzdw() {
                zzcgy zzcgyVar = zzcgyVarZza;
                if (zzcgyVar.zzP() != null) {
                    zzcgyVar.zzP().zzq();
                }
            }
        }, zzcbv.zzg);
        zzdrjVarZzf.zzl().zzi(zzcgyVarZza, true, true != z10 ? null : zzbmaVar, zzdvcVar.zze());
        zzffz zzffzVar = zzffuVar.zzs;
        String strZza = zzffzVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfS)).booleanValue() && zzdrjVarZzf.zzo().zza(true)) {
            strZza = zzcip.zza(strZza, zzcip.zzb(zzffuVar));
        }
        zzdrjVarZzf.zzl();
        return zzgui.zzk(zzdsd.zzj(zzcgyVarZza, zzffzVar.zzb, strZza, zzdvcVar.zze(), zzdrnVar.zzd()), new zzglu(this) { // from class: com.google.android.gms.internal.ads.zzelv
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj2) {
                zzcgy zzcgyVar = zzcgyVarZza;
                if (zzffuVar.zzM) {
                    zzcgyVar.zzav();
                }
                zzdrj zzdrjVar = zzdrjVarZzf;
                zzcgyVar.zzJ();
                zzcgyVar.onPause();
                return zzdrjVar.zzh();
            }
        }, this.zze);
    }
}
