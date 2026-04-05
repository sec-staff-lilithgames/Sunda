package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzce extends zzbr {
    private final zzau zza;

    public zzce(zzbu zzbuVar) {
        super(zzbuVar);
        this.zza = new zzau();
    }

    public final zzau zza() {
        zzV();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        zzq().zzc().zzc(this.zza);
        zzfg zzfgVarZzB = zzB();
        zzfgVarZzB.zzV();
        String str = zzfgVarZzB.zzb;
        if (str != null) {
            this.zza.zzk(str);
        }
        zzfgVarZzB.zzV();
        String str2 = zzfgVarZzB.zza;
        if (str2 != null) {
            this.zza.zzl(str2);
        }
    }
}
