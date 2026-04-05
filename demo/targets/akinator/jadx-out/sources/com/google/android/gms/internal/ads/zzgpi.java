package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgpi extends zzgrs {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzgpm zzd;

    public zzgpi(zzgpm zzgpmVar) {
        Objects.requireNonNull(zzgpmVar);
        this.zzd = zzgpmVar;
        this.zza = zzgpmVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzgpu.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgpa) entry.getValue()).iterator();
        }
        Object obj = this.zzb;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.zzc.next());
    }
}
