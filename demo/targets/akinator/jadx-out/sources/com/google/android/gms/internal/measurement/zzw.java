package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzw extends zzai {
    final Map zza;
    private final zzj zzb;

    public zzw(zzj zzjVar) {
        super("require");
        this.zza = new HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        zzao zzaoVar;
        zzh.zza("require", 1, list);
        String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
        Map map = this.zza;
        if (map.containsKey(strZzc)) {
            return (zzao) map.get(strZzc);
        }
        Map map2 = this.zzb.zza;
        if (map2.containsKey(strZzc)) {
            try {
                zzaoVar = (zzao) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            zzaoVar = zzao.zzf;
        }
        if (zzaoVar instanceof zzai) {
            this.zza.put(strZzc, (zzai) zzaoVar);
        }
        return zzaoVar;
    }
}
