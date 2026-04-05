package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaec implements Iterator {
    final /* synthetic */ zzaef zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzaec(zzaef zzaefVar, zzaee zzaeeVar) {
        this.zza = zzaefVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzaef zzaefVar = this.zza;
        if (i10 >= zzaefVar.zzb) {
            return !zzaefVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzaef zzaefVar = this.zza;
        return i10 < zzaefVar.zzb ? (zzaeb) zzaefVar.zza[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i10 = this.zzb;
        zzaef zzaefVar = this.zza;
        if (i10 >= zzaefVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzaefVar.zzm(i10);
        }
    }
}
