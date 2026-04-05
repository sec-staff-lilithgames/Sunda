package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzab {
    private zzaa zza;
    private zzaa zzb;
    private final List zzc;

    public zzab() {
        this.zza = new zzaa("", 0L, null);
        this.zzb = new zzaa("", 0L, null);
        this.zzc = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzabVar = new zzab(this.zza.clone());
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzabVar.zzc.add(((zzaa) it.next()).clone());
        }
        return zzabVar;
    }

    public final zzaa zza() {
        return this.zza;
    }

    public final void zzb(zzaa zzaaVar) {
        this.zza = zzaaVar;
        this.zzb = zzaaVar.clone();
        this.zzc.clear();
    }

    public final zzaa zzc() {
        return this.zzb;
    }

    public final void zzd(zzaa zzaaVar) {
        this.zzb = zzaaVar;
    }

    public final void zze(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, zzaa.zzh(str2, this.zza.zze(str2), map.get(str2)));
        }
        this.zzc.add(new zzaa(str, j10, map2));
    }

    public final List zzf() {
        return this.zzc;
    }

    public zzab(zzaa zzaaVar) {
        this.zza = zzaaVar;
        this.zzb = zzaaVar.clone();
        this.zzc = new ArrayList();
    }
}
