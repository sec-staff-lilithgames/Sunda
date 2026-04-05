package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgpj extends zzgrs {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgpm zzc;

    public zzgpj(zzgpm zzgpmVar) {
        Objects.requireNonNull(zzgpmVar);
        this.zzc = zzgpmVar;
        this.zza = ((zzgpe) zzgpmVar.map.values()).listIterator(0);
        this.zzb = zzgpu.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgpa) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
