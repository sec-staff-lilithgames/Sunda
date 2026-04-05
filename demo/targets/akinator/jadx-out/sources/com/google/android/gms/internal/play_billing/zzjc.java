package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzjc implements Iterator {
    final /* synthetic */ zzjf zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzjc(zzjf zzjfVar, zzje zzjeVar) {
        this.zza = zzjfVar;
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
        zzjf zzjfVar = this.zza;
        if (i10 >= zzjfVar.zzb) {
            return !zzjfVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzjf zzjfVar = this.zza;
        return i10 < zzjfVar.zzb ? (zzjb) zzjfVar.zza[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i10 = this.zzb;
        zzjf zzjfVar = this.zza;
        if (i10 >= zzjfVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzjfVar.zzm(i10);
        }
    }
}
