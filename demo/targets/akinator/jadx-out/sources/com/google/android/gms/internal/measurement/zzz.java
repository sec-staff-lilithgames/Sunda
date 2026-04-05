package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzz {
    final TreeMap zza = new TreeMap();
    final TreeMap zzb = new TreeMap();

    private static final int zzc(zzg zzgVar, zzan zzanVar, zzao zzaoVar) {
        zzao zzaoVarZza = zzanVar.zza(zzgVar, Collections.singletonList(zzaoVar));
        if (zzaoVarZza instanceof zzah) {
            return zzh.zzg(zzaoVarZza.zzd().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i10, zzan zzanVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.zzb;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.zza;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), zzanVar);
    }

    public final void zzb(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        TreeMap treeMap = this.zza;
        for (Integer num : treeMap.keySet()) {
            zzaa zzaaVarClone = zzabVar.zzc().clone();
            int iZzc = zzc(zzgVar, (zzan) treeMap.get(num), zzlVar);
            if (iZzc == 2 || iZzc == -1) {
                zzabVar.zzd(zzaaVarClone);
            }
        }
        TreeMap treeMap2 = this.zzb;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzc(zzgVar, (zzan) treeMap2.get((Integer) it.next()), zzlVar);
        }
    }
}
