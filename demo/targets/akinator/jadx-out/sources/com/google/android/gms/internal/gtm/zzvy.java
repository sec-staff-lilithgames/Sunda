package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvy implements Iterator {
    final /* synthetic */ zzvz zza;
    private int zzb = 0;

    public zzvy(zzvz zzvzVar) {
        this.zza = zzvzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb;
        zzvz zzvzVar = this.zza;
        return i10 < zzvzVar.zza() - zzvzVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zzb;
        zzvz zzvzVar = this.zza;
        if (i10 >= zzvzVar.zza() - zzvzVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzvz zzvzVar2 = this.zza;
        Object obj = zzvzVar2.zzb.zzb[zzvzVar2.zzb() + i10];
        this.zzb = i10 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
