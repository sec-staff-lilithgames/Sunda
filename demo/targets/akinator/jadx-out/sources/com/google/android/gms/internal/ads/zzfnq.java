package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfnq {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfnq(long j10, double d10, long j11, double d11) {
        this.zza = j10;
        this.zzb = j11;
        zza();
    }

    public final void zza() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final long zzb() {
        double d10 = this.zze;
        double d11 = 0.2d * d10;
        long j10 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.zzf.nextDouble() * ((j10 - r0) + 1)));
    }

    public final void zzc() {
        double d10 = this.zze;
        this.zze = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        zzbel zzbelVar = zzbeu.zzG;
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).intValue() >= 0 && this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).intValue()) && this.zze >= this.zzb;
    }

    public final synchronized void zze(int i10) {
        Preconditions.checkArgument(i10 > 0);
        this.zzd = i10;
    }
}
