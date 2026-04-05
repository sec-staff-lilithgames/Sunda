package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbb extends zzav {
    public zzbb() {
        this.zza.add(zzbk.AND);
        this.zza.add(zzbk.NOT);
        this.zza.add(zzbk.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 1) {
            zzao zzaoVarZza = zzgVar.zza((zzao) a.l(zzbk.AND, 2, list, 0));
            return zzaoVarZza.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzaoVarZza;
        }
        if (iOrdinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zza((zzao) a.l(zzbk.NOT, 1, list, 0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return zzb(str);
        }
        zzao zzaoVarZza2 = zzgVar.zza((zzao) a.l(zzbk.OR, 2, list, 0));
        return !zzaoVarZza2.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzaoVarZza2;
    }
}
