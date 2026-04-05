package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbc implements zzbe {
    private final zzg zza;
    private final String zzb;

    public zzbc(zzg zzgVar, String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    public final zzg zza(zzao zzaoVar) {
        zzg zzgVarZzc = this.zza.zzc();
        zzgVarZzc.zzg(this.zzb, zzaoVar);
        return zzgVarZzc;
    }
}
