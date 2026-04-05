package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgpg {
    Object[] zza;
    int zzb;
    zzgpf zzc;

    public zzgpg() {
        this(4);
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzgoz.zze(length, i11));
        }
    }

    public final zzgpg zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzgoc.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzgpg zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgph zzc() {
        zzgpf zzgpfVar = this.zzc;
        if (zzgpfVar != null) {
            throw zzgpfVar.zza();
        }
        zzgre zzgreVarZzk = zzgre.zzk(this.zzb, this.zza, this);
        zzgpf zzgpfVar2 = this.zzc;
        if (zzgpfVar2 == null) {
            return zzgreVarZzk;
        }
        throw zzgpfVar2.zza();
    }

    public zzgpg(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
