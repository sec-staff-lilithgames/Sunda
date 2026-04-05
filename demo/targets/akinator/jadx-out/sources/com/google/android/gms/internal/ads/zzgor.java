package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgor extends zzgot {
    public zzgor() {
        super(null);
    }

    public static final zzgot zzf(int i10) {
        return i10 < 0 ? zzgot.zzb : i10 > 0 ? zzgot.zzc : zzgot.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final zzgot zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final zzgot zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final zzgot zzc(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final zzgot zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final int zze() {
        return 0;
    }
}
