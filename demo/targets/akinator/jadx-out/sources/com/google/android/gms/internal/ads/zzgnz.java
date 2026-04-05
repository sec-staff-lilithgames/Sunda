package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgnz<K, V> implements zzgqm<K, V> {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgqm) {
            return zzu().equals(((zzgqm) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public boolean zze(Object obj, Object obj2) {
        throw null;
    }

    public abstract Set zzh();

    public abstract Collection zzj();

    public Iterator zzk() {
        throw null;
    }

    public abstract Map zzl();

    public boolean zzr(Object obj) {
        Iterator<V> it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set zzs() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set setZzh = zzh();
        this.zza = setZzh;
        return setZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public Collection zzt() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection collectionZzj = zzj();
        this.zzb = collectionZzj;
        return collectionZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public Map zzu() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map mapZzl = zzl();
        this.zzc = mapZzl;
        return mapZzl;
    }
}
