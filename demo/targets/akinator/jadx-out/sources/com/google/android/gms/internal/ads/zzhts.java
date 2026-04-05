package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhts extends AbstractSet {
    final /* synthetic */ zzhtx zza;

    public zzhts(zzhtx zzhtxVar) {
        Objects.requireNonNull(zzhtxVar);
        this.zza = zzhtxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.zza.zzc((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzhtr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzhtx zzhtxVar;
        zzhtw zzhtwVarZzc;
        if (!(obj instanceof Map.Entry) || (zzhtwVarZzc = (zzhtxVar = this.zza).zzc((Map.Entry) obj)) == null) {
            return false;
        }
        zzhtxVar.zzd(zzhtwVarZzc, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzb;
    }
}
