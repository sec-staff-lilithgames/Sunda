package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhzg extends zzhzi {
    public zzhzg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final void zza(Object obj, long j10, byte b10) {
        if (zzhzj.zzb) {
            zzhzj.zzG(obj, j10, b10);
        } else {
            zzhzj.zzH(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final boolean zzb(Object obj, long j10) {
        return zzhzj.zzb ? zzhzj.zzx(obj, j10) : zzhzj.zzy(obj, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzhzj.zzb) {
            zzhzj.zzG(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzhzj.zzH(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final byte zzh(long j10) {
        return Memory.peekByte((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final void zzi(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray((int) j10, bArr, (int) j11, (int) j12);
    }
}
