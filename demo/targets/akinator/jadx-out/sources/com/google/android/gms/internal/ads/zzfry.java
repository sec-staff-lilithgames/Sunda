package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfry implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfsu zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfry(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfsu zzfsuVar = new zzfsu(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfsuVar;
        this.zzd = new LinkedBlockingQueue();
        zzfsuVar.checkAvailabilityAndConnect();
    }

    public static zzauz zzc() {
        zzauc zzaucVarZzj = zzauz.zzj();
        zzaucVarZzj.zzl(32768L);
        return (zzauz) zzaucVarZzj.zzbu();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfsz zzfszVarZzd = zzd();
        if (zzfszVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfszVarZzd.zze(new zzfsv(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th2) {
                zzb();
                this.zze.quit();
                throw th2;
            }
            zzb();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzauz zza(int i10) {
        zzauz zzauzVar;
        try {
            zzauzVar = (zzauz) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzauzVar = null;
        }
        return zzauzVar == null ? zzc() : zzauzVar;
    }

    public final void zzb() {
        zzfsu zzfsuVar = this.zza;
        if (zzfsuVar != null) {
            if (zzfsuVar.isConnected() || zzfsuVar.isConnecting()) {
                zzfsuVar.disconnect();
            }
        }
    }

    public final zzfsz zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
