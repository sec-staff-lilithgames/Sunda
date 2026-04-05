package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzebp extends zzebu {
    private final Context zzg;
    private final VersionInfoParcel zzh;
    private final zzebo zzi;

    public zzebp(Context context, VersionInfoParcel versionInfoParcel, zzebo zzeboVar, zzbwn zzbwnVar) {
        this.zzg = context;
        this.zzh = versionInfoParcel;
        this.zzi = zzeboVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzi(this.zzh.afmaVersion);
                    this.zzi.zza();
                } catch (RemoteException e10) {
                    this.zzi.zzb(e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebu, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.zzi.zzb(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.getErrorMessage()))));
    }

    @Override // com.google.android.gms.internal.ads.zzebu, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zzi.zzb(new RemoteException(o2.l(i10, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i10).length() + 33))));
    }

    public final void zza() {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return;
                }
                this.zzc = true;
                zzbwm zzbwmVar = new zzbwm(this.zzg, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
                this.zzf = zzbwmVar;
                zzbwmVar.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
