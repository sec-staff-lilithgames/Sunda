package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyp implements Iterator {
    private final ArrayDeque zza;
    private zzhvf zzb;

    public /* synthetic */ zzhyp(zzhvi zzhviVar, byte[] bArr) {
        if (!(zzhviVar instanceof zzhyq)) {
            this.zza = null;
            this.zzb = (zzhvf) zzhviVar;
            return;
        }
        zzhyq zzhyqVar = (zzhyq) zzhviVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhyqVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhyqVar);
        this.zzb = zzb(zzhyqVar.zzB());
    }

    private final zzhvf zzb(zzhvi zzhviVar) {
        while (zzhviVar instanceof zzhyq) {
            zzhyq zzhyqVar = (zzhyq) zzhviVar;
            this.zza.push(zzhyqVar);
            zzhviVar = zzhyqVar.zzB();
        }
        return (zzhvf) zzhviVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzhvf next() {
        zzhvf zzhvfVarZzb;
        zzhvf zzhvfVar = this.zzb;
        if (zzhvfVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzhvfVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzhvfVarZzb = zzb(((zzhyq) arrayDeque.pop()).zzC());
        } while (zzhvfVarZzb.zzc() == 0);
        this.zzb = zzhvfVarZzb;
        return zzhvfVar;
    }
}
