package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzp implements ServiceConnection, zzt {
    final /* synthetic */ zzs zza;
    private final Map zzb = new HashMap();
    private int zzc = 2;
    private boolean zzd;
    private IBinder zze;
    private final zzo zzf;
    private ComponentName zzg;

    public zzp(zzs zzsVar, zzo zzoVar) {
        this.zza = zzsVar;
        this.zzf = zzoVar;
    }

    public static /* bridge */ /* synthetic */ ConnectionResult zzd(zzp zzpVar, String str, Executor executor) throws RemoteException {
        try {
            Intent intentZzb = zzpVar.zzf.zzb(zzpVar.zza.zzc);
            zzpVar.zzc = 3;
            StrictMode.VmPolicy vmPolicyZza = com.google.android.gms.common.util.zzc.zza();
            try {
                zzs zzsVar = zzpVar.zza;
                boolean zZza = zzsVar.zzf.zza(zzsVar.zzc, str, intentZzb, zzpVar, 4225, executor);
                zzpVar.zzd = zZza;
                if (zZza) {
                    zzpVar.zza.zzd.sendMessageDelayed(zzpVar.zza.zzd.obtainMessage(1, zzpVar.zzf), zzpVar.zza.zzh);
                    ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
                    StrictMode.setVmPolicy(vmPolicyZza);
                    return connectionResult;
                }
                zzpVar.zzc = 2;
                try {
                    zzs zzsVar2 = zzpVar.zza;
                    zzsVar2.zzf.unbindService(zzsVar2.zzc, zzpVar);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16);
                StrictMode.setVmPolicy(vmPolicyZza);
                return connectionResult2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicyZza);
                throw th2;
            }
        } catch (zzaj e10) {
            return e10.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zza.zzb) {
            try {
                this.zza.zzd.removeMessages(1, this.zzf);
                this.zze = iBinder;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.zzc = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zza.zzb) {
            try {
                this.zza.zzd.removeMessages(1, this.zzf);
                this.zze = null;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.zzc = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final ComponentName zzb() {
        return this.zzg;
    }

    public final IBinder zzc() {
        return this.zze;
    }

    public final void zze(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zzf(ServiceConnection serviceConnection, String str) {
        this.zzb.remove(serviceConnection);
    }

    public final void zzg(String str) {
        this.zza.zzd.removeMessages(1, this.zzf);
        zzs zzsVar = this.zza;
        zzsVar.zzf.unbindService(zzsVar.zzc, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
