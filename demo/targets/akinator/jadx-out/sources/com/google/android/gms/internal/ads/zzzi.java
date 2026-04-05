package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzzi extends Handler implements Runnable {
    final /* synthetic */ zzzn zza;
    private final zzzj zzb;
    private final long zzc;
    private zzzf zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzi(zzzn zzznVar, Looper looper, zzzj zzzjVar, zzzf zzzfVar, int i10, long j10) {
        super(looper);
        Objects.requireNonNull(zzznVar);
        this.zza = zzznVar;
        this.zzb = zzzjVar;
        this.zzd = zzzfVar;
        this.zzc = j10;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.zzc;
        zzzf zzzfVar = this.zzd;
        zzzfVar.getClass();
        zzzfVar.zzC(this.zzb, jElapsedRealtime, j10, this.zzf);
        this.zze = null;
        zzzn zzznVar = this.zza;
        zzzi zzziVarZzj = zzznVar.zzj();
        zzziVarZzj.getClass();
        zzznVar.zzi().execute(zzziVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            zzd();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        zzzn zzznVar = this.zza;
        zzznVar.zzk(null);
        long j10 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        zzzf zzzfVar = this.zzd;
        zzzfVar.getClass();
        if (this.zzh) {
            zzzfVar.zzA(this.zzb, jElapsedRealtime, j11, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                zzzfVar.zzB(this.zzb, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                zzdt.zzf("LoadTask", "Unexpected exception handling load completed", e10);
                this.zza.zzl(new zzzm(e10));
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i12 = this.zzf + 1;
        this.zzf = i12;
        zzzh zzzhVarZzz = zzzfVar.zzz(this.zzb, jElapsedRealtime, j11, iOException, i12);
        if (zzzhVarZzz.zzb() == 3) {
            zzznVar.zzl(this.zze);
        } else if (zzzhVarZzz.zzb() != 2) {
            if (zzzhVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzzhVarZzz.zzc() != C.TIME_UNSET ? zzzhVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z10) {
                zzzj zzzjVar = this.zzb;
                String simpleName = zzzjVar.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    zzzjVar.zzc();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.zzi) {
                return;
            }
            zzdt.zzf("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new zzzm(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.zzi) {
                return;
            }
            zzdt.zzf("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new zzzm(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.zzi) {
                zzdt.zzf("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }

    public final void zza(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzb(long j10) {
        zzzn zzznVar = this.zza;
        zzgmd.zzh(zzznVar.zzj() == null);
        zzznVar.zzk(this);
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzzf zzzfVar = this.zzd;
            zzzfVar.getClass();
            zzzfVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
