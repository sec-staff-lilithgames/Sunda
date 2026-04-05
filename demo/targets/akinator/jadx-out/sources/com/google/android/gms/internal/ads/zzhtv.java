package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzhtv implements Iterator {
    zzhtw zza;
    zzhtw zzb;
    int zzc;
    final /* synthetic */ zzhtx zzd;

    public zzhtv(zzhtx zzhtxVar) {
        Objects.requireNonNull(zzhtxVar);
        this.zzd = zzhtxVar;
        this.zza = zzhtxVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzhtxVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzhtw zzhtwVar = this.zzb;
        if (zzhtwVar == null) {
            throw new IllegalStateException();
        }
        zzhtx zzhtxVar = this.zzd;
        zzhtxVar.zzd(zzhtwVar, true);
        this.zzb = null;
        this.zzc = zzhtxVar.zzc;
    }

    public final zzhtw zza() {
        zzhtx zzhtxVar = this.zzd;
        zzhtw zzhtwVar = this.zza;
        if (zzhtwVar == zzhtxVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzhtxVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzhtwVar.zzd;
        this.zzb = zzhtwVar;
        return zzhtwVar;
    }
}
