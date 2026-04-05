package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfsa implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfsu zza;
    private final String zzb;
    private final String zzc;
    private final zzbaa zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfrs zzg;
    private final long zzh;

    public zzfsa(Context context, int i10, zzbaa zzbaaVar, String str, String str2, String str3, zzfrs zzfrsVar) {
        this.zzb = str;
        this.zzd = zzbaaVar;
        this.zzc = str2;
        this.zzg = zzfrsVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfsu zzfsuVar = new zzfsu(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfsuVar;
        this.zze = new LinkedBlockingQueue();
        zzfsuVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i10, long j10, Exception exc) {
        zzfrs zzfrsVar = this.zzg;
        if (zzfrsVar != null) {
            zzfrsVar.zzc(i10, System.currentTimeMillis() - j10, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfsz zzfszVarZzc = zzc();
        if (zzfszVarZzc != null) {
            try {
                zzftg zzftgVarZzg = zzfszVarZzc.zzg(new zzfte(1, this.zzd, this.zzb, this.zzc));
                zzd(IronSourceConstants.errorCode_internal, this.zzh, null);
                this.zze.put(zzftgVarZzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzftg(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzftg(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzftg zza(int i10) {
        zzftg zzftgVar;
        try {
            zzftgVar = (zzftg) this.zze.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zzd(2009, this.zzh, e10);
            zzftgVar = null;
        }
        zzd(IronSourceError.ERROR_REWARD_VALIDATION_FAILED, this.zzh, null);
        if (zzftgVar != null) {
            if (zzftgVar.zzc == 7) {
                zzfrs.zzg(3);
            } else {
                zzfrs.zzg(2);
            }
        }
        return zzftgVar == null ? new zzftg(null, 1) : zzftgVar;
    }

    public final void zzb() {
        zzfsu zzfsuVar = this.zza;
        if (zzfsuVar != null) {
            if (zzfsuVar.isConnected() || zzfsuVar.isConnecting()) {
                zzfsuVar.disconnect();
            }
        }
    }

    public final zzfsz zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
