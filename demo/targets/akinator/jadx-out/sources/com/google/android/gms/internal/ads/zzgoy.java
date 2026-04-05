package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzgoy extends zzgoz {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzgoy(int i10) {
        zzgoc.zzb(i10, "initialCapacity");
        this.zza = new Object[i10];
        this.zzb = 0;
    }

    private final void zzf(int i10) {
        int length = this.zza.length;
        int iZze = zzgoz.zze(length, this.zzb + i10);
        if (iZze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZze);
            this.zzc = false;
        }
    }

    public final zzgoy zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void zzb(Object[] objArr, int i10) {
        zzgqx.zza(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final zzgoz zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzgpa) {
                this.zzb = ((zzgpa) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgoz
    public /* bridge */ /* synthetic */ zzgoz zzd(Object obj) {
        throw null;
    }
}
