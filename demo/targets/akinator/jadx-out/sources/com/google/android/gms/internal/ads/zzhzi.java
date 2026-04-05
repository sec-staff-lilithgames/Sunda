package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzhzi {
    final Unsafe zza;

    public zzhzi(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j10, byte b10);

    public abstract boolean zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract float zzd(Object obj, long j10);

    public abstract void zze(Object obj, long j10, float f10);

    public abstract double zzf(Object obj, long j10);

    public abstract void zzg(Object obj, long j10, double d10);

    public abstract byte zzh(long j10);

    public abstract void zzi(long j10, byte[] bArr, long j11, long j12);
}
