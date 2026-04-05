package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhtf extends zzhtg implements Iterable {
    private final ArrayList zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzhtf) && ((zzhtf) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(zzhtg zzhtgVar) {
        this.zza.add(zzhtgVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzhtg zzc(int i10) {
        return (zzhtg) this.zza.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhtg
    public final String zzd() {
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((zzhtg) arrayList.get(0)).zzd();
        }
        throw new IllegalStateException(o2.l(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }
}
