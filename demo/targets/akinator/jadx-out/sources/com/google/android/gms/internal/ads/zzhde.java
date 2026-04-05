package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzhde {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhde(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void zzb(zzhde zzhdeVar, int i10) {
        zzhdd.zza(this.zza, zzhdeVar.zza, i10);
        zzhdd.zza(this.zzb, zzhdeVar.zzb, i10);
        zzhdd.zza(this.zzc, zzhdeVar.zzc, i10);
    }

    public zzhde() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhde(zzhde zzhdeVar) {
        this.zza = Arrays.copyOf(zzhdeVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhdeVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhdeVar.zzc, 10);
    }
}
