package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzn {
    public static final zzzh zza = new zzzh(2, C.TIME_UNSET, null);
    public static final zzzh zzb = new zzzh(3, C.TIME_UNSET, null);
    private final zzzt zzc = zzzt.zzb(zzep.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzzg.zza);
    private zzzi zzd;
    private IOException zze;

    public zzzn(String str) {
    }

    public static zzzh zza(boolean z10, long j10) {
        return new zzzh(z10 ? 1 : 0, j10, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzzj zzzjVar, zzzf zzzfVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzzi(this, looperMyLooper, zzzjVar, zzzfVar, i10, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzzi zzziVar = this.zzd;
        zzziVar.getClass();
        zzziVar.zzc(false);
    }

    public final void zzg(zzzk zzzkVar) {
        zzzi zzziVar = this.zzd;
        if (zzziVar != null) {
            zzziVar.zzc(true);
        }
        zzzt zzztVar = this.zzc;
        zzztVar.execute(new zzzl(zzzkVar));
        zzztVar.zza();
    }

    public final void zzh(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzzi zzziVar = this.zzd;
        if (zzziVar != null) {
            zzziVar.zza(i10);
        }
    }

    public final /* synthetic */ zzzt zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzzi zzj() {
        return this.zzd;
    }

    public final /* synthetic */ void zzk(zzzi zzziVar) {
        this.zzd = zzziVar;
    }

    public final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}
