package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgqw extends zzgqy implements Serializable {
    static final zzgqw zza = new zzgqw();

    private zzgqw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqy, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzgqy
    public final zzgqy zza() {
        return zzgrg.zza;
    }
}
