package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzlf {
    private static final zzuu zzu = new zzuu(new Object(), -1);
    public final zzbf zza;
    public final zzuu zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzib zzf;
    public final boolean zzg;
    public final zzwv zzh;
    public final zzys zzi;
    public final List zzj;
    public final zzuu zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzlf(zzbf zzbfVar, zzuu zzuuVar, long j10, long j11, int i10, zzib zzibVar, boolean z10, zzwv zzwvVar, zzys zzysVar, List list, zzuu zzuuVar2, boolean z11, int i11, int i12, zzav zzavVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzbfVar;
        this.zzb = zzuuVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzibVar;
        this.zzg = z10;
        this.zzh = zzwvVar;
        this.zzi = zzysVar;
        this.zzj = list;
        this.zzk = zzuuVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = zzavVar;
        this.zzq = j12;
        this.zzr = j13;
        this.zzs = j14;
        this.zzt = j15;
    }

    public static zzlf zza(zzys zzysVar) {
        zzbf zzbfVar = zzbf.zza;
        zzuu zzuuVar = zzu;
        return new zzlf(zzbfVar, zzuuVar, C.TIME_UNSET, 0L, 1, null, false, zzwv.zza, zzysVar, zzgpe.zzi(), zzuuVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzuu zzb() {
        return zzu;
    }

    public final zzlf zzc(zzuu zzuuVar, long j10, long j11, long j12, long j13, zzwv zzwvVar, zzys zzysVar, List list) {
        zzuu zzuuVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        int i11 = this.zzn;
        zzav zzavVar = this.zzo;
        long j14 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzlf(this.zza, zzuuVar, j11, j12, this.zze, this.zzf, this.zzg, zzwvVar, zzysVar, list, zzuuVar2, z10, i10, i11, zzavVar, j14, j13, j10, jElapsedRealtime, false);
    }

    public final zzlf zzd(zzbf zzbfVar) {
        return new zzlf(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlf zze(int i10) {
        return new zzlf(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlf zzf(zzib zzibVar) {
        return new zzlf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzibVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlf zzg(boolean z10) {
        return new zzlf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z10, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlf zzh(zzuu zzuuVar) {
        return new zzlf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzuuVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlf zzi(boolean z10, int i10, int i11) {
        return new zzlf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, i11, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
