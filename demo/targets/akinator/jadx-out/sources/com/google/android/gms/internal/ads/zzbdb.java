package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbdb {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbcx(this);
    private final Object zzc = new Object();
    private zzbde zzd;
    private Context zze;
    private zzbdh zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbde zzbdeVarZze = zze(new zzbcz(this), new zzbda(this));
                    this.zzd = zzbdeVarZze;
                    zzbdeVarZze.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeO)).booleanValue()) {
                    zzf();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeN)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbcy(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeP)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzf();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcbv.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeQ)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final zzbdc zzc(zzbdf zzbdfVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbdc();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbdfVar);
                }
                return this.zzf.zze(zzbdfVar);
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e10);
                return new zzbdc();
            }
        }
    }

    public final long zzd(zzbdf zzbdfVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zzg(zzbdfVar);
                    } catch (RemoteException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e10);
                    }
                }
                return -2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized zzbde zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbde(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            try {
                zzbde zzbdeVar = this.zzd;
                if (zzbdeVar == null) {
                    return;
                }
                if (zzbdeVar.isConnected() || this.zzd.isConnecting()) {
                    this.zzd.disconnect();
                }
                this.zzd = null;
                this.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzbde zzi() {
        return this.zzd;
    }

    public final /* synthetic */ void zzj(zzbde zzbdeVar) {
        this.zzd = null;
    }

    public final /* synthetic */ void zzk(zzbdh zzbdhVar) {
        this.zzf = zzbdhVar;
    }
}
