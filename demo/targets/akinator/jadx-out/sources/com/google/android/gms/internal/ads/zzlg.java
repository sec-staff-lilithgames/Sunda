package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzlg {
    private final Object zza;
    private Looper zzb;
    private HandlerThread zzc;
    private int zzd;

    public zzlg() {
        throw null;
    }

    public final Looper zza() {
        Looper looper;
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    boolean z10 = false;
                    if (this.zzd == 0 && this.zzc == null) {
                        z10 = true;
                    }
                    zzgmd.zzh(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.zzc = handlerThread;
                    handlerThread.start();
                    this.zzb = this.zzc.getLooper();
                }
                this.zzd++;
                looper = this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final void zzb() {
        HandlerThread handlerThread;
        synchronized (this.zza) {
            try {
                zzgmd.zzh(this.zzd > 0);
                int i10 = this.zzd - 1;
                this.zzd = i10;
                if (i10 == 0 && (handlerThread = this.zzc) != null) {
                    handlerThread.quit();
                    this.zzc = null;
                    this.zzb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzlg(Looper looper) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }
}
