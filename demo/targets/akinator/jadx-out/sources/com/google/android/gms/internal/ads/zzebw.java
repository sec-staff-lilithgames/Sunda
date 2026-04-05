package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzebw extends zzebu {
    private final Context zzg;
    private final Executor zzh;

    public zzebw(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbwm(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznX)).booleanValue() ? new zzebt(this.zza, this.zze) : new zzebs(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzecj(1));
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzecj(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final n1 zza(zzbxj zzbxjVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbxjVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcca zzccaVar = this.zza;
                zzccaVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcbv.zzg);
                zzebu.zzc(this.zzg, zzccaVar, this.zzh);
                return zzccaVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
