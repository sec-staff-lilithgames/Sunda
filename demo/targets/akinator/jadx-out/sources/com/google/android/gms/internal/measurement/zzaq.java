package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaq implements Iterator {
    final /* synthetic */ zzas zza;
    private int zzb;

    public zzaq(zzas zzasVar) {
        Objects.requireNonNull(zzasVar);
        this.zza = zzasVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzb().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strZzb = this.zza.zzb();
        int i10 = this.zzb;
        if (i10 >= strZzb.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return new zzas(String.valueOf(i10));
    }
}
