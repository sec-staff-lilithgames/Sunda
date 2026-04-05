package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzm extends zzai {
    final /* synthetic */ zzo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzn zznVar, String str, zzo zzoVar) {
        super("getValue");
        this.zza = zzoVar;
        Objects.requireNonNull(zznVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        zzh.zza("getValue", 2, list);
        zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
        String strZza = this.zza.zza(zzaoVarZza.zzc());
        return strZza != null ? new zzas(strZza) : zzaoVarZza2;
    }
}
