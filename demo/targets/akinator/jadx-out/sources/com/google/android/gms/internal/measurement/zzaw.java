package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaw {
    final Map zza = new HashMap();
    final zzbi zzb = new zzbi();

    public zzaw() {
        zza(new zzau());
        zza(new zzax());
        zza(new zzay());
        zza(new zzbb());
        zza(new zzbg());
        zza(new zzbh());
        zza(new zzbj());
    }

    public final void zza(zzav zzavVar) {
        Iterator it = zzavVar.zza.iterator();
        while (it.hasNext()) {
            this.zza.put(((zzbk) it.next()).zzb().toString(), zzavVar);
        }
    }

    public final zzao zzb(zzg zzgVar, zzao zzaoVar) {
        zzh.zzl(zzgVar);
        if (!(zzaoVar instanceof zzap)) {
            return zzaoVar;
        }
        zzap zzapVar = (zzap) zzaoVar;
        ArrayList arrayListZzg = zzapVar.zzg();
        String strZzb = zzapVar.zzb();
        Map map = this.zza;
        return (map.containsKey(strZzb) ? (zzav) map.get(strZzb) : this.zzb).zza(strZzb, zzgVar, arrayListZzg);
    }
}
