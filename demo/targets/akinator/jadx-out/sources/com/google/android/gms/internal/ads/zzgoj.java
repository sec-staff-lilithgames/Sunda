package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgoj implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgon zze;

    public /* synthetic */ zzgoj(zzgon zzgonVar, byte[] bArr) {
        Objects.requireNonNull(zzgonVar);
        this.zze = zzgonVar;
        this.zzb = zzgonVar.zzs();
        this.zzc = zzgonVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zzc;
        this.zzd = i10;
        Object objZza = zza(i10);
        this.zzc = this.zze.zzg(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzgmd.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzgon zzgonVar = this.zze;
        zzgonVar.remove(zzgonVar.zzo(i10));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i10);
}
