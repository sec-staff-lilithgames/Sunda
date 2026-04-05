package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzalx implements Comparable {
    public final int zza;
    public final zzals zzb;

    public zzalx(int i10, zzals zzalsVar) {
        this.zza = i10;
        this.zzb = zzalsVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzalx) obj).zza);
    }
}
