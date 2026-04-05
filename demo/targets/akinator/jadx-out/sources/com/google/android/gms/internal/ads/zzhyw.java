package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyw implements Iterator {
    final /* synthetic */ zzhyy zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhyw(zzhyy zzhyyVar, byte[] bArr) {
        Objects.requireNonNull(zzhyyVar);
        this.zza = zzhyyVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzhyy zzhyyVar = this.zza;
        if (i10 >= zzhyyVar.zzj()) {
            return !zzhyyVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzhyy zzhyyVar = this.zza;
        return i10 < zzhyyVar.zzj() ? (zzhyv) zzhyyVar.zzi()[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzhyy zzhyyVar = this.zza;
        zzhyyVar.zzh();
        int i10 = this.zzb;
        if (i10 >= zzhyyVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzhyyVar.zzg(i10);
        }
    }
}
