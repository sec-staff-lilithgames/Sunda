package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaer extends zzaes {
    public zzaer(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzaes
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaes
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.gtm.zzaet.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.gtm.zzaet.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.gtm.zzaet.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.gtm.zzaet.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.gtm.zzaes
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzaet.zzb) {
            zzaet.zzi(obj, j10, z10);
        } else {
            zzaet.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaes
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzaet.zzb) {
            zzaet.zzD(obj, j10, b10);
        } else {
            zzaet.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaes
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaes
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaes
    public final boolean zzg(Object obj, long j10) {
        return zzaet.zzb ? zzaet.zzt(obj, j10) : zzaet.zzu(obj, j10);
    }
}
