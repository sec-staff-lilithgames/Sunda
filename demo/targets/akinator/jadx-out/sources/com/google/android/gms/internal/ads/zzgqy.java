package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgqy implements Comparator {
    public static zzgqy zzb() {
        return zzgqw.zza;
    }

    public static zzgqy zzc(Comparator comparator) {
        return new zzgop(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgqy zza() {
        return new zzgrh(this);
    }

    public final zzgqy zzd(zzglu zzgluVar) {
        return new zzgob(zzgluVar, this);
    }
}
