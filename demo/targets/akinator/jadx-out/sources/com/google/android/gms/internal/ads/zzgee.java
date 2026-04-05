package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgee implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;

    private zzgee(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
    }

    public static zzgee zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzgee(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzifq zzifqVar = this.zzd;
        zzifq zzifqVar2 = this.zzc;
        zzifq zzifqVar3 = this.zzb;
        zzifb zzifbVarZzc = zzifg.zzc(this.zza);
        zzifb zzifbVarZzc2 = zzifg.zzc(zzifqVar3);
        zzifb zzifbVarZzc3 = zzifg.zzc(zzifqVar2);
        zzfxt zzfxtVar = (zzfxt) zzifqVar.zzb();
        return new zzged(zzifbVarZzc, zzifbVarZzc2, zzifbVarZzc3, zzfxtVar.zzi().zza(), zzfxtVar.zzi().zzd());
    }
}
