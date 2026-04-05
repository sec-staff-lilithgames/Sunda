package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzom extends zzoo {
    public zzom(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zza(Object obj, long j10, byte b10) {
        if (zzop.zzb) {
            zzop.zzD(obj, j10, b10);
        } else {
            zzop.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzb(Object obj, long j10) {
        return zzop.zzb ? zzop.zzu(obj, j10) : zzop.zzv(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzop.zzb) {
            zzop.zzD(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzop.zzE(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
