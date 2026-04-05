package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzei implements zzcq {
    private final zzbu zza;
    private final zzej zzb = new zzej();

    public zzei(zzbu zzbuVar) {
        this.zza = zzbuVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcq
    public final /* synthetic */ zzcp zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzcq
    public final void zzc(String str, boolean z10) {
        if (!"ga_dryRun".equals(str)) {
            this.zza.zzm().zzR("Bool xml configuration name not recognized", str);
        } else {
            this.zzb.zze = z10 ? 1 : 0;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzcq
    public final void zzd(String str, int i10) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.zzb.zzd = i10;
        } else {
            this.zza.zzm().zzR("Int xml configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzcq
    public final void zze(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.zzb.zza = str2;
            return;
        }
        if ("ga_appVersion".equals(str)) {
            this.zzb.zzb = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.zzb.zzc = str2;
        } else {
            this.zza.zzm().zzR("String xml configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzcq
    public final void zzb(String str, String str2) {
    }
}
