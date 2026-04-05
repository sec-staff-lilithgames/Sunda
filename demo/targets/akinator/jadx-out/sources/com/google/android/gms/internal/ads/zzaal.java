package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaal extends HandlerThread implements Handler.Callback {
    private zzdi zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaam zze;

    public zzaal() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdi zzdiVar;
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    int i11 = message.arg1;
                    zzdi zzdiVar2 = this.zza;
                    if (zzdiVar2 == null) {
                        throw null;
                    }
                    zzdiVar2.zza(i11);
                    this.zze = new zzaam(this, this.zza.zzc(), i11 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdj e10) {
                    zzdt.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzd = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    zzdt.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzc = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    zzdt.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.zzd = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    zzdiVar = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzdiVar == null) {
                    throw null;
                }
                zzdiVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaam zza(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdi(handler, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaam zzaamVar = this.zze;
        zzaamVar.getClass();
        return zzaamVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
