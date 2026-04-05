package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbqd implements zzbou, zzbqc {
    private final zzbqc zza;
    private final HashSet zzb = new HashSet();

    public zzbqd(zzbqc zzbqcVar) {
        this.zza = zzbqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbou, com.google.android.gms.internal.ads.zzbpf
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzblx) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzblx) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzm(String str, zzblx zzblxVar) {
        this.zza.zzm(str, zzblxVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzblxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzn(String str, zzblx zzblxVar) {
        this.zza.zzn(str, zzblxVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzblxVar));
    }
}
